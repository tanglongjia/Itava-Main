package org.itava.service;

import java.util.List;
import java.util.Map;

import org.itava.pojo.BsResource;

public interface BsResourceService {
	public List<BsResource> getLeftMenu(Map<String,Integer> paramMap);
}
