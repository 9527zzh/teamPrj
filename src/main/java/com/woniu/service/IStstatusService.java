package com.woniu.service;

import java.util.List;

import com.woniu.model.Ststatus;

public interface IStstatusService {

	void add(Ststatus ststatus);
	void delete(Integer stid);
	void update(Ststatus ststatus);
	Ststatus findOne(Integer stid);
	List<Ststatus>  findAll();
}
