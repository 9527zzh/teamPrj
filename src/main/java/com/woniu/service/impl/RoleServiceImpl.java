package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.RoleMapper;
import com.woniu.model.Role;
import com.woniu.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService {

	@Resource
	RoleMapper roleMApper;
	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer rid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub

	}

	@Override
	public Role findOne(Integer rid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findAll() {
		return roleMApper.selectByExample(null);
	}

}
