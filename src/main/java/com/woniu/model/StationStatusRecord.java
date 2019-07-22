package com.woniu.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
//该类是整合了几个垃圾分类的单条某时刻垃圾站状态的记录
public class StationStatusRecord {
	private int sid;
	private String sname;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date recordTime;
	private List<Strecord> strecords;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public List<Strecord> getStrecords() {
		return strecords;
	}
	public void setStrecords(List<Strecord> strecords) {
		this.strecords = strecords;
	}
}
