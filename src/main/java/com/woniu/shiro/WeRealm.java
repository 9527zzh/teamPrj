package com.woniu.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.woniu.mapper.UserMapper;
import com.woniu.model.Role;

public class WeRealm extends AuthorizingRealm{
	@Resource
	private UserMapper userMapper;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("进行鉴权。。。");
		Integer unum=Integer.valueOf((String)principals.getPrimaryPrincipal());
		Set<String> set=new HashSet<>();
		List<Role> list=(List<Role>) userMapper.selectByUnum(unum).getRoles();
		for (Role role : list) {
			set.add(role.getRname());
		}
		System.out.println(set);
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo(set);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("正在进行认证。。。");
		String str="6666";
		ByteSource byteSource=ByteSource.Util.bytes(str);
		SimpleHash md5=new SimpleHash("MD5", "0000", byteSource,100);
//		账号/密码/盐/名称
		System.out.println("密码："+md5);
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(str,md5,byteSource,getName()) ;
		return info;
	}

	

}
