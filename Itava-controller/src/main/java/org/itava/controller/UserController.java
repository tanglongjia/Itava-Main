package org.itava.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.itava.pojo.BsUser;
import org.itava.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        BsUser user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "/user/userInit";  
    }  
    
    @RequestMapping("/selectUserPage")  
    public String selectUserPage(HttpServletRequest request,Model model){  
        List<BsUser> userList = this.userService.selectUserPage(24);
        PageInfo<BsUser> pageInfo = new PageInfo<BsUser>(userList);
        model.addAttribute("pageInfo", pageInfo);  
        model.addAttribute("userList", userList);
        return "/user/userData";  
    }
}  