package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.RtypeMapper;
import com.woniu.mapper.StrecordMapper;
import com.woniu.model.Rtype;
import com.woniu.model.Strecord;
import com.woniu.service.IStrecordService;

@Service
public class StrecordServiceImpl implements IStrecordService {
	@Resource
	StrecordMapper strecordMapper;
	
	@Resource
	RtypeMapper rtypeMapper;
	
	@Override
	public void add(Strecord strecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer srid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Strecord strecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Strecord findOne(Integer srid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Strecord> findAll() {
		return strecordMapper.selectByExample(null);
	}

	@Override
	public HashMap<String,?> findAllByStation() {
		//查到类型列列表
		List<Rtype> allRtype = rtypeMapper.selectByExample(null);
		List<HashMap<?,?>> allSirecord = strecordMapper.selectByStation(allRtype);
		HashMap<String,Object> rtypeAndSirecord = new HashMap<>();
		rtypeAndSirecord.put("rtypes", allRtype);
		rtypeAndSirecord.put("strecord", allSirecord);
		return rtypeAndSirecord;
	}
}
