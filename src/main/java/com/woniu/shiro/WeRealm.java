package com.woniu.shiro;

import java.util.HashSet;
import java.util.Set;

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

public class WeRealm extends AuthorizingRealm{
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("进行鉴权。。。");
		String uname=(String) principals.getPrimaryPrincipal();
		Set set=new HashSet<>();
//		set.add("admin");
		set.add("student");
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo(set);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		System.out.println("正在进行认证。。。");
		String str="123";
		ByteSource byteSource=ByteSource.Util.bytes(str);
		SimpleHash md5=new SimpleHash("MD5", "0000", byteSource,100);
//		账号/密码/盐/名称
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(str,md5,byteSource,getName()) ;
		return info;
	}

	

}
