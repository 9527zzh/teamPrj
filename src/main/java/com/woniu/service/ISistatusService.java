package com.woniu.service;

import java.util.List;

import com.woniu.model.Sistatus;



public interface ISistatusService {

	void add(Sistatus sistatus);
	void delete(Integer ssid);
	void update(Sistatus sistatus);
	Sistatus findOne(Integer ssid);
	List<Sistatus>  findAll();
}
