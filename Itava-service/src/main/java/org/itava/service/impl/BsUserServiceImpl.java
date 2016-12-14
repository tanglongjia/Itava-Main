package org.itava.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.itava.dao.BsUserMapper;
import org.itava.pojo.BsUser;
import org.itava.service.BsUserService;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service("bsUserService")  
public class BsUserServiceImpl implements BsUserService {  
    @Resource  
    private BsUserMapper bsUserMapper;

	public BsUser getUserById(int userId) {
		/*PageHelper.startPage(1, 8);
		List<BsUser> list = bsUserMapper.selectUserPage(24);
		System.out.println(list.size());
		for (BsUser user : list) {
			System.out.println(user.toString());
		}*/
		return this.bsUserMapper.selectByPrimaryKey(userId);  
		//return list.get(0);
	}
	public List<BsUser> selectUserPage(int age) {
		PageHelper.startPage(1, 10);
		List<BsUser> list = bsUserMapper.selectUserPage(24);
		System.out.println(list.size());
		return list;
	}  
    
   
}
