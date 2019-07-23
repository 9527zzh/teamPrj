package com.woniu.service;

import java.util.HashMap;
import java.util.List;

import com.woniu.model.Strecord;

public interface IStrecordService {
	void add(Strecord strecord);
	void delete(Integer srid);
	void update(Strecord strecord);
	Strecord findOne(Integer srid);
	List<Strecord>  findAll();
	/**
	 * @return List<Rtype>和List<Strecord的HashMap<?,?>>两个对象的封装，键值分别为rtypes和strecord;
	 * rtypes集合内元素的键值分别为垃圾类型的id;
	 * strecord集合内元素的键值分别为sid ,srid ,sname ,createtime ,以及几个垃圾类型的id
	 */
	HashMap<String,?> findAllByStation();
}
