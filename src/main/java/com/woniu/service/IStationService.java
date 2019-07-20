package com.woniu.service;

import java.util.List;

import com.woniu.model.Station;

public interface IStationService {

	void add(Station station);
	void delete(Integer sid);
	void update(Station station);
	Station findOne(Integer sid);
	List<Station>  findAll();
	
	Station findByCoo(Integer cooid);//根据坐标id查找相应的站点
}
