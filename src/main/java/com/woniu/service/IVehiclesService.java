package com.woniu.service;

import java.util.List;

import com.woniu.model.Vehicles;

public interface IVehiclesService {

	void add(Vehicles vehicles);
	void delete(Integer vid);
	void update(Vehicles vehicles);
	Vehicles  findOne(Integer vid);
	List<Vehicles>  findAll();
}
