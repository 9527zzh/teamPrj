package com.woniu.service;

import java.util.List;

import com.woniu.model.RoletreeKey;





public interface IRoletreeService {

	void add(RoletreeKey roletreeKey);
	void delete(RoletreeKey roletreeKey);
	void update(RoletreeKey roletreeKey);
	RoletreeKey findOne(Integer rid);
	List<RoletreeKey>  findAll();
}
