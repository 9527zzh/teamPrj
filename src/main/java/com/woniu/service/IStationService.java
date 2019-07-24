package com.woniu.service;

import java.util.List;

import com.woniu.model.Station;

public interface IStationService {

	void add(Station station);
	void delete(Integer sid);
	void update(Station station);
	Station findOne(Integer sid);
	List<Station>  findAll();
	
	Station findByCoo(Integer cooid);//根据坐标id查找相应的站点（地图上小的提示框）
	List<Station> findAllStations();//查所有站点 展示到页面上（地图加载展示的内容）
	Station findStationBySid(Integer id);//根据sid找到垃圾站 并且带出站长 以及当前垃圾状态
}
