package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.mapper.StstatusMapper;
import com.woniu.model.Ststatus;
import com.woniu.model.StstatusExample;
import com.woniu.service.IStstatusService;
@Service
public class StstatusServiceImpl implements IStstatusService {
	@Resource
	StstatusMapper ststatusMapper;

	@Override
	public void add(Ststatus ststatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer stid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Ststatus ststatus) {
		if(ststatus.getCount()<0)
			throw new RuntimeException("输入的数据有误@");
		ststatusMapper.updateByPrimaryKey(ststatus);
	}

	@Override
	public Ststatus findOne(Integer stid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ststatus> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
	public void update(List<Ststatus> ststatus) {
		for (Ststatus ststatus2 : ststatus) {
			if(ststatus2.getCount()<0) {
				throw new RuntimeException("输入的更新数量有误");
			}else {
				ststatusMapper.updateByPrimaryKey(ststatus2);
			}
		}
		
	}

}
