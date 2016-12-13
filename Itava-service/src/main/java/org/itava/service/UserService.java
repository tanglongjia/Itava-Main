package org.itava.service;

import java.util.List;

import org.itava.pojo.User;


public interface UserService {
	 public User getUserById(int userId); 
	 
	 public List<User> selectUserPage(int age);
}

