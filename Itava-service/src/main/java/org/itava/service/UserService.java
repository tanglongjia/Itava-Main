package org.itava.service;

import java.util.List;

import org.itava.pojo.BsUser;


public interface UserService {
	 public BsUser getUserById(int userId); 
	 
	 public List<BsUser> selectUserPage(int age);
}

