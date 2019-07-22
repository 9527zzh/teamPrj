package com.woniu.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.PageBean;
import com.woniu.model.Role;
import com.woniu.service.IRoleService;

@RestController
@RequestMapping("roles")
public class RoleAction {
	@Resource
	IRoleService roleServiceImpl;
	
	@GetMapping
	public Map showRoleList(PageBean page) throws IOException {
		List<Role> list=roleServiceImpl.findAll(page);
		Map map=new HashMap<>();
		map.put("list", list);
		map.put("page", page);
		return map;
	}
	@PostMapping
	public void save(Role role) {
		System.out.println(role.getRname());
		System.out.println(role.getDes());
		role.setRid(10);;
		roleServiceImpl.add(role);
	}
	@DeleteMapping
	public void del(String checked) {
		String[] str= checked.split(",");
		List<Integer> list=new ArrayList<>();
		for (int i = 1; i < str.length; i++) {
			if (str[i]!="") {
				roleServiceImpl.delete(Integer.valueOf(str[i]));
			}
		}
	}
	@PutMapping
	public void update(Role role) {
		roleServiceImpl.update(role);
	}
}
