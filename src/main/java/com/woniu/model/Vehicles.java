package com.woniu.model;

import java.util.List;

public class Vehicles {
    public Rtype getRtype() {
		return rtype;
	}

	public void setRtype(Rtype rtype) {
		this.rtype = rtype;
	}

	public List<Vrecord> getVrecord() {
		return vrecord;
	}

	public void setVrecord(List<Vrecord> vrecord) {
		this.vrecord = vrecord;
	}
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicles.vid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private Integer vid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicles.sid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private Integer sid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicles.rtid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private Integer rtid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicles.cooid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private Integer cooid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vehicles.status
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicles.vid
     *
     * @return the value of vehicles.vid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public Integer getVid() {
        return vid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicles.vid
     *
     * @param vid the value for vehicles.vid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setVid(Integer vid) {
        this.vid = vid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicles.sid
     *
     * @return the value of vehicles.sid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicles.sid
     *
     * @param sid the value for vehicles.sid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicles.rtid
     *
     * @return the value of vehicles.rtid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public Integer getRtid() {
        return rtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicles.rtid
     *
     * @param rtid the value for vehicles.rtid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setRtid(Integer rtid) {
        this.rtid = rtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicles.cooid
     *
     * @return the value of vehicles.cooid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public Integer getCooid() {
        return cooid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicles.cooid
     *
     * @param cooid the value for vehicles.cooid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setCooid(Integer cooid) {
        this.cooid = cooid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vehicles.status
     *
     * @return the value of vehicles.status
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vehicles.status
     *
     * @param status the value for vehicles.status
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    private List<Vrecord> vrecord;
    
    private Rtype rtype;
}