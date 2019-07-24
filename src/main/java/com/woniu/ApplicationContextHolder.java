package com.woniu;
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
		System.out.println("进入方法。。。"+applicationContext);
		ApplicationContextHolder.app=applicationContext;
	}
	public static Object getBean(String name) {
		if (app==null) {
			System.out.println("null");
		}
		System.out.println(name);
		return app.getBean(name);
		
	}
	
}

