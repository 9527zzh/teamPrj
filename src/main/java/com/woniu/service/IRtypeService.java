package com.woniu.service;

import java.util.List;

import com.woniu.model.Rtype;




public interface IRtypeService {

	void add(Rtype rtype);
	void delete(Integer rtid);
	void update(Rtype rtype);
	Rtype findOne(Integer rtid);
	List<Rtype>  findAll();
}
