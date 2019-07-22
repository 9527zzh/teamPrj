package com.woniu.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.StationMapper;
import com.woniu.mapper.StrecordMapper;
import com.woniu.model.StationStatusRecord;
import com.woniu.model.Strecord;
import com.woniu.model.StrecordExample;
import com.woniu.model.StrecordExample.Criteria;
import com.woniu.service.IStrecordService;

@Service
public class StrecordServiceImpl implements IStrecordService {
	@Resource
	StrecordMapper strecordMapper;
	@Resource
	StationMapper stationMapper;
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
	public List<StationStatusRecord> findAllGroupByStation() {
		//拿到每个站点同一时间的记录
		List<Strecord> stList = strecordMapper.selectByStation();
		//该集合包含每一个站点的同一时间的所有分类记录（group by sid,createtime）
		List<StationStatusRecord> strecords = new ArrayList<>();
		for (int i = 0; i < stList.size(); i++) {
			//创建查询条件:按站点和时间查询
			StrecordExample se = new StrecordExample();
			Criteria cr = se.createCriteria();
			//创建分类对象并设置站点id、名称（按照id去站点表查询）和记录时间，并去根据该条件查询到相应的各类垃圾的记录
			StationStatusRecord ssr = new StationStatusRecord();
			ssr.setSid(stList.get(i).getSid());
			ssr.setSname(stationMapper.selectByPrimaryKey(ssr.getSid()).getSname());
			ssr.setRecordTime(stList.get(i).getCreatetime());
			cr.andSidEqualTo(ssr.getSid());
			cr.andCreatetimeEqualTo(ssr.getRecordTime());
			ssr.setStrecords(strecordMapper.selectByExample(se));
			strecords.add(ssr);
		}
		return strecords;
	}
	
}
