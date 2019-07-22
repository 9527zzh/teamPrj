package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Rtype;
import com.woniu.service.IRtypeService;

@RestController
@RequestMapping("rtype")
public class RtypeAction {

	@Resource
	IRtypeService rtypeServiceImpl;
	
	@PostMapping("getRtypeList")
	public List<Rtype> getRtypeList() {
		return rtypeServiceImpl.findAll();
	}
	
}
