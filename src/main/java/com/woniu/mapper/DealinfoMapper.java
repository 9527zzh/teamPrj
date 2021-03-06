package com.woniu.mapper;

import com.woniu.model.Dealinfo;
import com.woniu.model.DealinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int countByExample(DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int deleteByExample(DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int deleteByPrimaryKey(Integer infoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int insert(Dealinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int insertSelective(Dealinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    List<Dealinfo> selectByExample(DealinfoExample example);
    
    /**
     * This method was generated by Shen.
     * This method corresponds to the database table dealinfo
     *.返回增添了承运类型、站点名称、负责人员姓名三个字段的Dealinfo结果集合
     * @shengenerated Tue Jul 23 17:35:45 CST 2019
     */
    List<Dealinfo> selectDetailInfo();
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    Dealinfo selectByPrimaryKey(Integer infoid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dealinfo record, @Param("example") DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int updateByExample(@Param("record") Dealinfo record, @Param("example") DealinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int updateByPrimaryKeySelective(Dealinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dealinfo
     *
     * @mbggenerated Mon Jul 22 16:08:19 CST 2019
     */
    int updateByPrimaryKey(Dealinfo record);
}