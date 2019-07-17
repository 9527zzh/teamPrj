package com.woniu.service;

import java.util.List;

import com.woniu.model.User;

public interface IUserService {

	void add(User user);
	void delete(Integer uid);
	void update(User user);
	User findOne(Integer uid);
	List<User>  findAll();
}
