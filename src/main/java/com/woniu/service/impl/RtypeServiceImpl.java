package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.RtypeMapper;
import com.woniu.model.Rtype;
import com.woniu.service.IRtypeService;
@Service
public class RtypeServiceImpl implements IRtypeService {

	@Resource
	RtypeMapper rtypeMapper;
	@Override
	public void add(Rtype rtype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer rtid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Rtype rtype) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rtype findOne(Integer rtid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rtype> findAll() {
		return rtypeMapper.selectByExample(null);
	}

	
}
