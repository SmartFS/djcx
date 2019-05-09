package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.Rules;
import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.service.IUserService;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    IUserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String doLogin(@RequestParam("username") String userName, @RequestParam("password") String password) {
        int cnt = userService.selectCount(new EntityWrapper<User>());
        User user = userService.selectById(1234);


        //select count(*) from user where username = #{userName} and password = #{password}
        if (cnt > 0) {
            return "success login";
        }
        return "failed login";
    }
}

