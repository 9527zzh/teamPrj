package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Coordinate;
import com.woniu.model.Station;
import com.woniu.service.ICoordinateService;
import com.woniu.service.IStationService;

@RestController
@RequestMapping("stations")
public class StationAction {
	@Resource
	ICoordinateService CoordinateServiceImpl;
	
	@Resource
	IStationService StationServiceImpl;
	/**
	 * 测试方法 测试ICoordinateService 接口 获取坐标集合点
	 * @return  返回list集合，包装利用RestController包装成json 发送给前台页面
	 */
	@GetMapping
	public List<Coordinate> getCooid() {
		List<Coordinate> Coordinates = CoordinateServiceImpl.getCooid();
	//	System.out.println(Coordinates.get(0).getLatitude()+"--------"+Coordinates.get(0).getLongitude());
		System.out.println(Coordinates+"~~~~");
		return Coordinates;
		
	}
	
	/**
	 * 根据站点的坐标点 调用查询出站点当前信息
	 */
	@PostMapping
	public Station getStationInfo(@RequestBody Coordinate coordinate) {
		System.out.println(coordinate.getCooid()+"!!!!!!!!!!");
		Station station = StationServiceImpl.findByCoo(coordinate.getCooid());
		return station;
	}
}
