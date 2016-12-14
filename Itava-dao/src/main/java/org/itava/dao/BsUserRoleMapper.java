package org.itava.dao;

import org.itava.pojo.BsUserRole;

public interface BsUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsUserRole record);

    int insertSelective(BsUserRole record);

    BsUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsUserRole record);

    int updateByPrimaryKey(BsUserRole record);
}