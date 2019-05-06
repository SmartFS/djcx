package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/adduser")
    public String addUser(){
        User user = new User();
        user.setAccount("qewq");
        user.setPassword("2141");
        user.setUserid(1324214l);
        user.setPermission("1241");
        Integer integer = userService.addUser(user);
        return "添加成功";
    }
}

