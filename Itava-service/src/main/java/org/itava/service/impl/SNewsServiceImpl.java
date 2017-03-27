package org.itava.service.impl;

import java.util.List;
import java.util.Map;

import org.itava.dao.SNewsMapper;
import org.itava.pojo.SNews;
import org.itava.service.SNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SNewsServiceImpl implements SNewsService {
	
	@Autowired
	private SNewsMapper snewsMapper;

	public List<SNews> selectSNewsListPage(Map map) throws Exception{
		return snewsMapper.selectSNewsListPage(map);
	}

	public void saveNews(SNews snews) throws Exception{
		snewsMapper.insert(snews);
	}

	public void updateNews(SNews snews) throws Exception{
		snewsMapper.updateByPrimaryKeySelective(snews);
	}

	public boolean deleteNews(int id) throws Exception{
		return snewsMapper.deleteByPrimaryKey(id)>0?true:false;
	}

	public SNews getSNewsById(int id) throws Exception {
		return snewsMapper.selectByPrimaryKey(id);
	}

}
