package org.itava.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.itava.pojo.User;
import org.itava.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
    
    @RequestMapping("/selectUserPage")  
    public String selectUserPage(HttpServletRequest request,Model model){  
      /*  List<User> userList = this.userService.selectUserPage(24);
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        model.addAttribute("pageInfo", pageInfo);  
        model.addAttribute("userList", userList);*/
        return "userPage";  
    }
}  