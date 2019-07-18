package com.woniu.redis;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

public class WeRedisCache implements Cache{
	private String id;
	 
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private RedisTemplate<Object, Object> redisTemplate;
    public WeRedisCache(final String id){
    	this.id=id;
    	System.out.println(id);
    	this.redisTemplate=(RedisTemplate<Object, Object>) ApplicationContextHolder.getBean("redisTemplate");
    }
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void putObject(Object key, Object value) {
		// TODO Auto-generated method stub
		System.out.println("加入缓存。。。");
		redisTemplate.opsForValue().set(key, value);
	}

	@Override
	public Object getObject(Object key) {
		// TODO Auto-generated method stub
		System.out.println("获取缓存。。。");
		Object object = redisTemplate.opsForValue().get(key);
		return object;
	}

	@Override
	public Object removeObject(Object key) {
		// TODO Auto-generated method stub
		System.out.println("删除缓存。。。");
		Boolean delete = redisTemplate.delete(key);
		return delete;
	}

	@Override
	public void clear() {
		System.out.println("清除缓存。。。");
		// TODO Auto-generated method stub
		redisTemplate.execute(new RedisCallback() {

			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				// TODO Auto-generated method stub
				connection.flushDb();
				return null;
			}
		});
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ReadWriteLock getReadWriteLock() {
		// TODO Auto-generated method stub
		return readWriteLock;
	}

}
