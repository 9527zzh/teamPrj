package com.woniu.model;

import java.util.Date;

public class Dealinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.infoid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private Integer infoid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.rtid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private Integer rtid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.sid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private Integer sid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.uid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.note
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.date
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dealinfo.count
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    private Integer count;
    
    private String rtname;
    private String sname;
    private String uname;

    public String getRtname() {
		return rtname;
	}

	public void setRtname(String rtname) {
		this.rtname = rtname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.infoid
     *
     * @return the value of dealinfo.infoid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public Integer getInfoid() {
        return infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.infoid
     *
     * @param infoid the value for dealinfo.infoid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.rtid
     *
     * @return the value of dealinfo.rtid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public Integer getRtid() {
        return rtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.rtid
     *
     * @param rtid the value for dealinfo.rtid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setRtid(Integer rtid) {
        this.rtid = rtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.sid
     *
     * @return the value of dealinfo.sid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.sid
     *
     * @param sid the value for dealinfo.sid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.uid
     *
     * @return the value of dealinfo.uid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.uid
     *
     * @param uid the value for dealinfo.uid
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.note
     *
     * @return the value of dealinfo.note
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.note
     *
     * @param note the value for dealinfo.note
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.date
     *
     * @return the value of dealinfo.date
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.date
     *
     * @param date the value for dealinfo.date
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dealinfo.count
     *
     * @return the value of dealinfo.count
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dealinfo.count
     *
     * @param count the value for dealinfo.count
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}