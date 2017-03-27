package org.itava.service;

import java.util.List;
import java.util.Map;

import org.itava.pojo.BsUser;


public interface BsUserService {
	 public BsUser getUserById(int userId) throws Exception; 
	 
	 public List<BsUser> selectUserPage(Map param) throws Exception;
}

