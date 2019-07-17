package com.woniu.service;

import java.util.List;

import com.woniu.model.Position;

public interface IPositionService {
	void add(Position position);
	void delete(Integer pid);
	void update(Position position);
	Position findOne(Integer pid);
	List<Position>  findAll();
}
