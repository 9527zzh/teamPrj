package com.woniu.filter;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;


@Intercepts({ @Signature(type = StatementHandler.class,method = "prepare",args = {Connection.class,Integer.class})})
public class MyIntercepter implements Interceptor{

	@Override
	public Object intercept(Invocation arg0) throws Throwable {
		// 得到被代理的对象
				StatementHandler statementHandler = (StatementHandler)arg0.getTarget();
				//得到元对象  源对象中存在了执行的SQL和各种条件
				MetaObject metaObject = MetaObject.forObject(statementHandler,new DefaultObjectFactory(),new DefaultObjectWrapperFactory(),new DefaultReflectorFactory());
				
				RowBounds rb = (RowBounds)metaObject.getValue("delegate.rowBounds");
				
				if(rb==null||rb==RowBounds.DEFAULT) {
					System.out.println("不分页");
					Object obj = arg0.proceed();//继续执行  放行
					return obj;
				}else {
					System.out.println("分页");
					
					//得到原始的SQL语句
					String orinialSql = (String)metaObject.getValue("delegate.boundSql.sql");
					//取出start
					int offset = rb.getOffset();
					//取出size
					int limit = rb.getLimit();
					
//					//读取配置文件
//					Configuration configuration = (Configuration)metaObject.getValue("delegate.configuration");
//					//得到选中的方言
//					String type = configuration.getVariables().getProperty("dialect");
					String sql=orinialSql+ " limit "+offset+","+limit;
					//把构建的SQL重新再放入metaObject中去
					metaObject.setValue("delegate.boundSql.sql",sql);
					
					//对RowBounds进行重置
					metaObject.setValue("delegate.rowBounds.offset",RowBounds.NO_ROW_OFFSET);
					metaObject.setValue("delegate.rowBounds.limit",RowBounds.NO_ROW_LIMIT);
					
					Object obj = arg0.proceed();//继续执行  放行
					return obj;
				}
	}

	@Override
	public Object plugin(Object target) {
		// TODO Auto-generated method stub
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub
		
	}

}
