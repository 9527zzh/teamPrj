package com.woniu.service;

import java.util.List;

import com.woniu.model.Site;
import com.woniu.model.Station;


public interface ISiteService {

	void add(Site site);
	void delete(Integer siid);
	void update(Site site);
	Site findOne(Integer siid);
	List<Site>  findAll();
	
	List<Site> findSiteBySid(Integer id);//根据站点sid查找相应的投放点
}
