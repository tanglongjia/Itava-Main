package org.itava.dao;

import org.itava.pojo.BsRoleResource;

public interface BsRoleResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsRoleResource record);

    int insertSelective(BsRoleResource record);

    BsRoleResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsRoleResource record);

    int updateByPrimaryKey(BsRoleResource record);
}