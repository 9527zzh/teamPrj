package com.woniu.service;

import java.util.List;

import com.woniu.model.PageBean;
import com.woniu.model.Role;

public interface IRoleService {
	void add(Role role);
	void delete(Integer rid);
	void update(Role role);
	Role findOne(Integer rid);
	List<Role>  findAll(PageBean page);
}
