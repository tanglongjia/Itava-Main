package org.itava.dao;

import org.itava.pojo.BsFunction;

public interface BsFunctionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsFunction record);

    int insertSelective(BsFunction record);

    BsFunction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsFunction record);

    int updateByPrimaryKey(BsFunction record);
}