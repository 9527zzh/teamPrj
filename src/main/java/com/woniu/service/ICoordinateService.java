package com.woniu.service;

import java.util.List;

import com.woniu.model.Coordinate;

public interface ICoordinateService {
	void add(Coordinate coordinate);
	void delete(Integer cooid);
	void update(Coordinate coordinate);
	Coordinate findOne(Integer cooid);
	List<Coordinate>  findAll();
}
