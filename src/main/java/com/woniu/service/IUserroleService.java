package com.woniu.service;

import java.util.List;

import com.woniu.model.UserroleKey;

public interface IUserroleService {

	void add(UserroleKey userroleKey);
	void delete(UserroleKey userroleKey);
	void update(UserroleKey userroleKey);
	UserroleKey findOne(UserroleKey userroleKey);
	List<UserroleKey>  findAll();
}
