package org.itava.service.impl;

import java.util.List;
import java.util.Map;

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

	public BsUser getUserById(int userId) throws Exception{
		/*PageHelper.startPage(1, 8);
		List<BsUser> list = bsUserMapper.selectUserPage(24);
		System.out.println(list.size());
		for (BsUser user : list) {
			System.out.println(user.toString());
		}*/
		return this.bsUserMapper.selectByPrimaryKey(userId);  
		//return list.get(0);
	}
	public List<BsUser> selectUserPage(Map param)throws Exception {
		String page  = (String) param.get("pageNumber");
		String pageSize = (String) param.get("pageSize");
		int pageNum = 1;
		if(page!=null && page !=""){
			pageNum = Integer.parseInt(page);
		}
		int startNum = (pageNum-1)*new Integer(pageSize);
		int endNum = pageNum * new Integer(pageSize);
		//PageHelper.startPage(startNum, endNum);
		param.put("startNum", startNum);
		param.put("endNum", endNum);
		List<BsUser> list = bsUserMapper.selectUserPage(param);
		return list;
	}  
    
   
}
