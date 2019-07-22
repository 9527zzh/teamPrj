package com.woniu.service;

import java.util.List;

import com.woniu.model.Sirecord;

public interface ISirecordService {
	void add(Sirecord sirecord);
	void delete(Integer sirid);
	void update(Sirecord sirecord);
	Sirecord findOne(Integer sirid);
	List<Sirecord>  findAll();
}
