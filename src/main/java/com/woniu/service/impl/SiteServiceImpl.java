package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.mapper.SiteMapper;
import com.woniu.model.Site;
import com.woniu.model.SiteExample;
import com.woniu.model.Station;
import com.woniu.service.ISiteService;
@Service
public class SiteServiceImpl implements ISiteService {
	
	@Resource
	SiteMapper siteMapper;
	
	@Override
	public void add(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer siid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Site findOne(Integer siid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Site> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据站点id 查询下属投放点
	 */
	@Override
	public List<Site> findSiteBySid(Integer id) {
		List<Site> sites = siteMapper.findSiteBySid(id);
		return sites;
	}
}
