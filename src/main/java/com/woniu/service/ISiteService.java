package com.woniu.service;

import java.util.List;

import com.woniu.model.Site;


public interface ISiteService {

	void add(Site site);
	void delete(Integer siid);
	void update(Site site);
	Site findOne(Integer siid);
	List<Site>  findAll();
}
