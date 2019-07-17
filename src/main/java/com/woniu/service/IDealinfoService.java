package com.woniu.service;

import java.util.List;

import com.woniu.model.Dealinfo;

public interface IDealinfoService {
	void add(Dealinfo dealinfo);
	void delete(Integer infoid);
	void update(Dealinfo dealinfo);
	Dealinfo findOne(Integer infoid);
	List<Dealinfo>  findAll();
}
