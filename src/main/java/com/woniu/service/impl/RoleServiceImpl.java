package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.mapper.RoleMapper;
import com.woniu.model.PageBean;
import com.woniu.model.Role;
import com.woniu.model.RoleExample;
import com.woniu.model.RoleExample.Criteria;
import com.woniu.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService {

	@Resource
	RoleMapper roleMApper;
	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		roleMApper.insertSelective(role);
	}

	@Override
	public void delete(Integer rid) {
		// TODO Auto-generated method stub
		roleMApper.deleteByPrimaryKey(rid);
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		roleMApper.updateByPrimaryKey(role);
	}

	@Override
	public Role findOne(Integer rid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findAll(PageBean page,Role role) {
		RoleExample e=new RoleExample();
		Criteria c=e.or();
		if (role.getRid()!=null) {
			c.andRidEqualTo(role.getRid());
		}
		if (role.getRname()!=null&&role.getRname().trim()!="") {
			c.andRnameLike(role.getRname());
		}
				
		page.setCount(roleMApper.countByExample(e));
		return roleMApper.selectByExample(e,new RowBounds(page.getOffset(),page.getLimit()));
	}

}
