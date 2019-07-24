package com.woniu.model;

import java.io.Serializable;


public class Role implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private Integer rid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rname
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private String rname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.des
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    private String des;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rid
     *
     * @return the value of role.rid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rid
     *
     * @param rid the value for role.rid
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rname
     *
     * @return the value of role.rname
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public String getRname() {
        return rname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rname
     *
     * @param rname the value for role.rname
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setRname(String rname) {
        this.rname = rname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.des
     *
     * @return the value of role.des
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.des
     *
     * @param des the value for role.des
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    public void setDes(String des) {
        this.des = des;
    }

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", des=" + des + "]";
	}
}