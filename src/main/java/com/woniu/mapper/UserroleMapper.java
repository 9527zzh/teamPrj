package com.woniu.mapper;

import com.woniu.model.UserroleExample;
import com.woniu.model.UserroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int countByExample(UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int deleteByExample(UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int deleteByPrimaryKey(UserroleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int insert(UserroleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int insertSelective(UserroleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    List<UserroleKey> selectByExample(UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserroleKey record, @Param("example") UserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userrole
     *
     * @mbggenerated Wed Jul 17 14:45:57 CST 2019
     */
    int updateByExample(@Param("record") UserroleKey record, @Param("example") UserroleExample example);
}