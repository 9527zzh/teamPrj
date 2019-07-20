package com.woniu.service;

import java.util.List;

import com.woniu.model.Coordinate;

public interface ICoordinateService {
	void add(Coordinate coordinate);
	void delete(Integer cooid);
	void update(Coordinate coordinate);
	Coordinate findOne(Integer cooid);
	List<Coordinate>  findAll();
	
	List<Coordinate> getCooid();//临时测试 建立的接口
	Coordinate findCooByLaAndLo(Coordinate coordinate);//根据经纬度找到一个坐标对象
}
