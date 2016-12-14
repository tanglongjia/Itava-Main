package org.itava.dao;

import org.itava.pojo.BsResource;

public interface BsResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsResource record);

    int insertSelective(BsResource record);

    BsResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsResource record);

    int updateByPrimaryKey(BsResource record);
}