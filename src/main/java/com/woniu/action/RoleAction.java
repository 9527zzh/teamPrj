package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Role;
import com.woniu.service.IRoleService;

@RestController
@RequestMapping("roles")
public class RoleAction {
	@Resource
	IRoleService roleServiceImpl;
	
	@PostMapping("lll")
	public List<Role> showRoleList() {
		return roleServiceImpl.findAll();
	}
}
