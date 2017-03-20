package org.itava.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.itava.dao.BsResourceMapper;
import org.itava.pojo.BsResource;
import org.itava.service.BsResourceService;
import org.springframework.stereotype.Service;

@Service("bsResourceService")
public class BsResourceServiceImpl implements BsResourceService {
	
	@Resource  
    private BsResourceMapper bsResourceMapper;
	
	public List<BsResource> getLeftMenu(Map<String, Integer> paramMap) {
		return bsResourceMapper.getLeftMenu(paramMap);
	}

	public List<BsResource> getMenuByParentId(Map<String, Integer> paramMap) {
		return bsResourceMapper.getMenuByParentId(paramMap);
	}

}
