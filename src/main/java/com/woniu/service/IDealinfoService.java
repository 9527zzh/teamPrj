package com.woniu.service;

import java.util.List;

import com.woniu.model.Dealinfo;

public interface IDealinfoService {
	void add(Dealinfo dealinfo);
	void delete(Integer infoid);
	void update(Dealinfo dealinfo);
	Dealinfo findOne(Integer infoid);
	List<Dealinfo>  findAll();
	/**
	 * @return 带有详细信息的Dealinfo集合
	 * findAllDealinfoDetails在查到基础dealinfo表字段的基础上，同时查到：
	 * rtname(承运垃圾类型名称)、sname(负责站点名称)、uname(负责财务人员姓名)
	 *.列表按照负责财务人员id排序
	 */
	List<Dealinfo> findAllDealinfoDetails();
}
