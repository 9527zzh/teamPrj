package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.woniu.mapper.VrecordMapper;
import com.woniu.model.PageBean;
import com.woniu.model.Vrecord;
import com.woniu.service.IVrecordService;
@Service
public class VrecoServiceImpl implements IVrecordService {
	@Resource
	VrecordMapper vrecordMapper;
	@Override
	public void add(Vrecord vrecord) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Integer vrid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Vrecord vrecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vrecord findOne(Integer vrid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vrecord> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vrecord> findAllVrecordDetails(PageBean pb) {
		return vrecordMapper.selectDetailInfo(new RowBounds(pb.getOffset(),pb.getLimit()));
	}

	
}
