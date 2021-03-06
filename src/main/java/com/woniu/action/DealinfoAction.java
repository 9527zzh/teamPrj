package com.woniu.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Dealinfo;
import com.woniu.service.IDealinfoService;

@RestController
@RequestMapping("dealinfos")
public class DealinfoAction {
	@Resource
	IDealinfoService dealinfoServiceImpl;
	
	@PostMapping
	public Dealinfo getDealinfoById(Integer id ,HttpServletRequest request) {
		
		return dealinfoServiceImpl.findOne(id);
	}
}
