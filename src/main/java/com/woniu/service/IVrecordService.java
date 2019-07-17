package com.woniu.service;

import java.util.List;

import com.woniu.model.Vrecord;

public interface IVrecordService {

	void add(Vrecord vrecord);
	void delete(Integer vrid);
	void update(Vrecord vrecord);
	Vrecord  findOne(Integer vrid);
	List<Vrecord>  findAll();
}
