package com.woniu.service;

import java.util.List;

import com.woniu.model.PageBean;
import com.woniu.model.Vrecord;

public interface IVrecordService {

	void add(Vrecord vrecord);
	void delete(Integer vrid);
	void update(Vrecord vrecord);
	Vrecord  findOne(Integer vrid);
	List<Vrecord>  findAll();
	/**
	 * @return 带有详细信息的Vrecord集合
	 * findAllDetails在查到基础vrecord表字段的基础上，同时查到：
	 * uname(司机姓名)、sid(所属站点id)、sname(所属站点名称)、rtid(承运垃圾类型id)、rtname(承运垃圾类型名称)
	 * .结果是按照完成日期排序的
	 */
	List<Vrecord> findAllVrecordDetails(PageBean pb);
}
