package com.woniu.action;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Dealinfo;
import com.woniu.model.PageBean;
import com.woniu.model.Vrecord;
import com.woniu.service.IDealinfoService;
import com.woniu.service.ISirecordService;
import com.woniu.service.IStrecordService;
import com.woniu.service.IVrecordService;

@RestController
@RequestMapping("data")
public class DataAction {
	@Resource
	IStrecordService strecordServiceImpl;
	@Resource
	ISirecordService sirecordServiceImpl;
	@Resource
	IVrecordService vrecordServiceImpl;
	@Resource
	IDealinfoService dealinfoServiceImpl;
	@PostMapping("getStrecordList")
	public HashMap<?,?> getStrecordList() {
		return strecordServiceImpl.findAllByStation();
	}
	@PostMapping("getSirecordList")
	public HashMap<?,?> getSirecordList() {
		return sirecordServiceImpl.findAllBySite();
	}
	@PostMapping("getVrecordList")
	public List<Vrecord> getVrecordList(PageBean pb) {
		return vrecordServiceImpl.findAllVrecordDetails(pb);
	}
	@PostMapping("getDealinfoList")
	public List<Dealinfo> getDealinfoList() {
		return dealinfoServiceImpl.findAllDealinfoDetails();
	}
}
