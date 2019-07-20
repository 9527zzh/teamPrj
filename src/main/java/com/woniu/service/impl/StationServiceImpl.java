package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.StationMapper;
import com.woniu.model.Station;
import com.woniu.model.StationExample;
import com.woniu.service.IStationService;
@Service
public class StationServiceImpl implements IStationService {

	@Resource
	StationMapper stationMapper;
	@Override
	public void add(Station station) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer sid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Station station) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Station findOne(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Station findByCoo(Integer cooid) {
	    Station stations = stationMapper.findStationByCoo(cooid);
		return stations;
	}

	@Override
	public List<Station> findAllStations() {
		List<Station> stations = stationMapper.findAllStations();
		return stations;
	}

	
}
