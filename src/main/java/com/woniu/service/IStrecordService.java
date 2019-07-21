package com.woniu.service;

import java.util.List;

import com.woniu.model.Strecord;
import com.woniu.model.StationStatusRecord;

public interface IStrecordService {
	void add(Strecord strecord);
	void delete(Integer srid);
	void update(Strecord strecord);
	Strecord findOne(Integer srid);
	List<Strecord>  findAll();
	List<StationStatusRecord>  findAllGroupByStation();
}
