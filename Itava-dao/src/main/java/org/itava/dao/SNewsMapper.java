package org.itava.dao;

import java.util.List;
import java.util.Map;

import org.itava.pojo.SNews;

public interface SNewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SNews record);

    int insertSelective(SNews record);

    SNews selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SNews record);

    int updateByPrimaryKeyWithBLOBs(SNews record);

    int updateByPrimaryKey(SNews record);
    
    List<SNews> selectSNewsListPage(Map map);
}