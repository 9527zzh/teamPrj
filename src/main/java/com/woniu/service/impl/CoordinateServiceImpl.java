package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.CoordinateMapper;
import com.woniu.model.Coordinate;
import com.woniu.service.ICoordinateService;
@Service
public class CoordinateServiceImpl implements ICoordinateService {
@Resource
CoordinateMapper coordinateMapper;
	
	@Override
	public void add(Coordinate coordinate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer cooid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Coordinate coordinate) {
		// TODO Auto-generated method stub

	}

	@Override
	public Coordinate findOne(Integer cooid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coordinate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

 /**
 * 临时写的方法 测试接口
 */
	@Override
	public List getCooid() {
		List<Coordinate> Coordinates = coordinateMapper.selectByExample(null);
		return Coordinates;
	}

}
