package com.woniu.service;

import java.util.HashMap;
import java.util.List;

import com.woniu.model.Sirecord;

public interface ISirecordService {
	void add(Sirecord sirecord);
	void delete(Integer sirid);
	void update(Sirecord sirecord);
	Sirecord findOne(Integer sirid);
	List<Sirecord>  findAll();
	//该方法返回List<Rtype>和List<Sirecord的HashMap<?,?>>两个对象的封装，键值分别为rtypes和sirecord；
	//
	/**
	 * @return List<Rtype>和List<Sirecord的HashMap<?,?>>两个对象的封装HashMap,键值分别为rtypes和sirecord
	 * rtypes集合内元素的键值分别为垃圾类型的id
	 * sirecord集合内元素的键值分别为sirid ,siid ,siname ,createtime ,以及几个垃圾类型的id
	 */
	HashMap<String,?> findAllBySite();
}
