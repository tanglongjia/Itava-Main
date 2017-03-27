package org.itava.service;

import java.util.List;
import java.util.Map;

import org.itava.pojo.SNews;

public interface SNewsService {

	List<SNews> selectSNewsListPage(Map map)throws Exception;
	
	void saveNews(SNews snews)throws Exception;
	
	void updateNews(SNews snews)throws Exception;
	
	boolean deleteNews(int id)throws Exception;
	
	SNews getSNewsById(int id)throws Exception;
}
