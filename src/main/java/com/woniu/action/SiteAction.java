package com.woniu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniu.model.Coordinate;
import com.woniu.model.Rtype;
import com.woniu.model.Site;
import com.woniu.model.Station;
import com.woniu.service.ICoordinateService;
import com.woniu.service.IRtypeService;
import com.woniu.service.ISiteService;
import com.woniu.service.IStationService;

@RestController
@RequestMapping("sites")
public class SiteAction {
	@Resource
	ICoordinateService CoordinateServiceImpl;
	
	@Resource
	ISiteService siteServiceImpl;
	
	@Resource
	IRtypeService rtypeServiceImpl;
	/**
	 *    地图加载调用这个方法 查到所有的站点和相应的坐标
	 * @return  返回list集合，包装利用RestController包装成json 发送给前台页面
	 */
	@GetMapping
	public List<Station> getStations() {
		//List<Station> stations = StationServiceImpl.findAllStations();
		//System.out.println(stations+"~~~~");
		return null;
	}
	/**
	 * 根据站点的坐标点 调用查询出站点当前信息
	 */
	@PostMapping
	public Station getStationInfo(@RequestBody Coordinate coordinate) {
		//Station station = StationServiceImpl.findByCoo(coordinate.getCooid());
		return null;
	}
	
	/**
	 * 
	 * @return 通过sid查找到投放点  显示当前投放点的信息（包含位置  以及当前垃圾投放点的垃圾信息）
	 */
	@GetMapping(value = "/{id}")
	public Map getStationsBysid(@PathVariable Integer id) {
		HashMap map = new HashMap<>();
		List<Site> sites = siteServiceImpl.findSiteBySid(id);
		List<Rtype> types = rtypeServiceImpl.findAll();
		map.put("site", sites);
		map.put("types", types);
		return map;
	}
}
