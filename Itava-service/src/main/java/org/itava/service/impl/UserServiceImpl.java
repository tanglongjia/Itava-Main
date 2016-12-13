package org.itava.service.impl;

import javax.annotation.Resource;

import org.itava.dao.UserDao;
import org.itava.pojo.User;
import org.itava.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserDao userDao;

	public User getUserById(int userId) {
//		PageHelper.startPage(1, 8);
//		List<User> list = userDao.selectUserPage(24);
//		System.out.println(list.size());
//		for (User user : list) {
//			System.out.println(user.toString());
//		}
		return this.userDao.selectByPrimaryKey(userId);  
		//return list.get(0);
	}
	/*public List<User> selectUserPage(int age) {
		PageHelper.startPage(1, 10);
		List<User> list = userDao.selectUserPage(24);
		System.out.println(list.size());
		return list;
	}  */
    
   
}
