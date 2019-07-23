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
import com.woniu.model.Tree;
import com.woniu.service.IRoleService;
import com.woniu.service.ITreeService;

@RestController
@RequestMapping("trees")
public class TreeAction {
	@Resource
	ITreeService treeServiceImpl;
	
	@GetMapping
	public Map showRoleList(PageBean page,Tree tree) throws IOException {
		List<Tree> list=treeServiceImpl.findAll(page,tree);
		System.out.println(tree);
		Map map=new HashMap<>();
		map.put("list", list);
		map.put("page", page);
		map.put("tree", tree);
		return map;
	}
	@PostMapping
	public void save(Tree tree) {
		tree.setTid(10);
		treeServiceImpl.add(tree);
	}
	@DeleteMapping
	public void del(String checked) {
		String[] str= checked.split(",");
		List<Integer> list=new ArrayList<>();
		for (int i = 1; i < str.length; i++) {
			if (str[i]!="") {
				treeServiceImpl.delete(Integer.valueOf(str[i]));
			}
		}
	}
	@PutMapping
	public void update(Tree tree) {
		treeServiceImpl.update(tree);
	}
}
