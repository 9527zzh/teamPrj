package com.woniu.redis;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class ApplicationContextHolder implements ApplicationContextAware{
	private static ApplicationContext app;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		this.app=applicationContext;
	}
	public static Object getBean(String name) {
		return app.getBean(name);
	}
	
}

