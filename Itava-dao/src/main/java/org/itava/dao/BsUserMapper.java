package org.itava.dao;

import java.util.List;

import org.itava.pojo.BsUser;

public interface BsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsUser record);

    int insertSelective(BsUser record);

    BsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsUser record);

    int updateByPrimaryKey(BsUser record);
    
    List<BsUser> selectUserPage(Integer age);
}