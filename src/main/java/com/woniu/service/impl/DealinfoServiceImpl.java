package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.DealinfoMapper;
import com.woniu.model.Dealinfo;
import com.woniu.service.IDealinfoService;

@Service
public class DealinfoServiceImpl implements IDealinfoService {
	@Resource
	DealinfoMapper dealinfoMapper;
	@Override
	public void add(Dealinfo dealinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer infoid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Dealinfo dealinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dealinfo findOne(Integer infoid) {
		return dealinfoMapper.selectByPrimaryKey(infoid);
	}

	@Override
	public List<Dealinfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dealinfo> findAllDealinfoDetails() {
		return dealinfoMapper.selectDetailInfo();
	}

}
