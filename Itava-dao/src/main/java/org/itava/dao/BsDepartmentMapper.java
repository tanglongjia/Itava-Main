package org.itava.dao;

import org.itava.pojo.BsDepartment;

public interface BsDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsDepartment record);

    int insertSelective(BsDepartment record);

    BsDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsDepartment record);

    int updateByPrimaryKey(BsDepartment record);
}