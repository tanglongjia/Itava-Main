package org.itava.dao;

import org.itava.pojo.BsRole;

public interface BsRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsRole record);

    int insertSelective(BsRole record);

    BsRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsRole record);

    int updateByPrimaryKey(BsRole record);
}