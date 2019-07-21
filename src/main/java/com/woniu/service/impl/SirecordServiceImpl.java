package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.SirecordMapper;
import com.woniu.model.Sirecord;
import com.woniu.service.ISirecordService;

@Service
public class SirecordServiceImpl implements ISirecordService {

	@Resource
	SirecordMapper sirecordMapper;
	@Override
	public void add(Sirecord sirecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer sirid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Sirecord sirecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sirecord findOne(Integer sirid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sirecord> findAll() {
		return sirecordMapper.selectByExample(null);
	}
	
}
