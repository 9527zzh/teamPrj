package com.woniu.action;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("users")
public class UserAction {
	
	@RequestMapping("login")
//	@RequiresRoles(value = {"admin"})
	public String login(String unum,String upwd) {
		System.out.println("开启认证。。");
		Subject currentSubject=SecurityUtils.getSubject();
		if (!currentSubject.isAuthenticated()) {
			UsernamePasswordToken token=new UsernamePasswordToken(unum,upwd);
			try {
				currentSubject.login(token);
				return "hello.html";
			} catch (Exception e) {
				System.out.println("认证失败。。。");
				return "error";
			}
		}
		return null;
	}
}
