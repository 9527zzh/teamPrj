package com.woniu.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class WeShiro {
	@Bean("shiroFilter")
	//应该是@Qualifier("securityManager") SecurityManager manager
	public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) { 
		ShiroFilterFactoryBean shiro=new ShiroFilterFactoryBean();
		shiro.setSecurityManager(securityManager);
		shiro.setSuccessUrl("/success.jsp");
//		shiro.setUnauthorizedUrl("/error.jsp");
		shiro.setLoginUrl("/index.jsp");
//		必须是linkedHashMap，保证放入值得先后顺序
		Map<String, String> filterChainMap=new LinkedHashMap<>();
//		静态资源放行
		filterChainMap.put("/css/**", "anon");
        filterChainMap.put("/imgs/**", "anon");
        filterChainMap.put("/js/**", "anon");
        // 登录 URL 放行
        filterChainMap.put("/login", "anon");
        filterChainMap.put("/hello", "authc");
     // 以“/user/admin” 开头的用户需要身份认证
        filterChainMap.put("/user/admin*", "authc");
        filterChainMap.put("/hello.html", "roles[admin]");
//        filterChainMap.put("/user/teacher*/**", "perms[\"user:create\"]");
        // 配置 logout 过滤器
        filterChainMap.put("/logout", "logout");
		shiro.setFilterChainDefinitionMap(filterChainMap);
		return shiro;
	}
//	配置安全管理器
	@Bean("securityManager")
	public DefaultWebSecurityManager getSecurityManager() {
		DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
//		@Qualifier("shiroRealm") ShiroRealm shiroRealm，可以直接securityManager.setRealm(shiroRealm);
		securityManager.setRealm(getRealm());
//		注册（添加）缓存管理器
		securityManager.setCacheManager(getehCacheManager());
		return securityManager;
	}
	//配置自定义的权限登录器（realm）
	@Bean
	public WeRealm getRealm() {
		WeRealm weRealm=new WeRealm();
		weRealm.setCredentialsMatcher(hashed());
//		开启缓存
		weRealm.setCachingEnabled(true);
//		配置认证缓存
		weRealm.setAuthenticationCachingEnabled(true);
		weRealm.setAuthenticationCacheName("authenticationCache");
//		配置授权缓存
		weRealm.setAuthorizationCachingEnabled(true);
		weRealm.setAuthorizationCacheName("authorizationCache");
		return weRealm;
	}
	//配置自定义的密码比较器
	@Bean
	public HashedCredentialsMatcher hashed() {
		HashedCredentialsMatcher hashedCredentialsMatcher=new HashedCredentialsMatcher();
//		散列算法:这里使用MD5算法
		hashedCredentialsMatcher.setHashAlgorithmName("MD5");
//		散列的次数
		hashedCredentialsMatcher.setHashIterations(100);
		hashedCredentialsMatcher.setHashSalted(true);
		return hashedCredentialsMatcher;
	}
	 //Shiro生命周期处理器
	@Bean("lifecycle")
	public LifecycleBeanPostProcessor lifecycle() {
		LifecycleBeanPostProcessor lifecycleBeanPostProcessor=new LifecycleBeanPostProcessor();
		return lifecycleBeanPostProcessor;
	}
//	AOP式方法级权限检查，DefaultAdvisorAutoProxyCreator用来扫描上下文，寻找所有的Advistor(通知器），
//	将这些Advisor应用到所有符合切入点的Bean中。
//	LifecycleBeanPostProcessor将Initializable和Destroyable的实现类统一在其内部自动分别调用
//	了Initializable.init()和Destroyable.destroy()方法，从而达到管理shiro bean生命周期的目的。
	@Bean
	@DependsOn("lifecycle")
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator= //
				new DefaultAdvisorAutoProxyCreator();
		return defaultAdvisorAutoProxyCreator;
	}
	// AOP式方法级权限检查
	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor=//
				new AuthorizationAttributeSourceAdvisor();
		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
		return authorizationAttributeSourceAdvisor;
	}
//	定义缓存管理器
	@Bean
	public EhCacheManager getehCacheManager() {
		EhCacheManager ehCacheManager=new EhCacheManager();
		ehCacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
		return null;
		
	}

}
