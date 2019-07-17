package com.woniu.service;

import java.util.List;

import com.woniu.model.Dept;

public interface IDeptService {
	void add(Dept dept);
	void delete(Integer did);
	void update(Dept dept);
	Dept findOne(Integer did);
	List<Dept>  findAll();
}
