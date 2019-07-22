package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.StationStatusRecord;
import com.woniu.model.Strecord;
import com.woniu.service.IStrecordService;

@RestController
@RequestMapping("data")
public class DataAction {

	@Resource
	IStrecordService strecordServiceImpl;
	
	@PostMapping("getStrecordList")
	public List<StationStatusRecord> getStrecordList() {
		return strecordServiceImpl.findAllGroupByStation();
	}
	@PostMapping("")
	public List<Strecord> getOneStrecord() {
		return strecordServiceImpl.findAll();
	}
}
