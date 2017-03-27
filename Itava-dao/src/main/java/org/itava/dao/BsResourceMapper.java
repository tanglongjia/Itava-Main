package org.itava.dao;

import java.util.List;
import java.util.Map;

import org.itava.pojo.BsResource;

public interface BsResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsResource record);

    int insertSelective(BsResource record);

    BsResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsResource record);

    int updateByPrimaryKey(BsResource record);
    
    List<BsResource> getLeftMenu(Map<String, Integer> paramMap);
    
    List<BsResource> getMenuByParentId(Map<String, Object> paramMap);
}