package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.Rules;
import cn.sicau.djcx.entity.Test;
import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.service.IUserService;
import cn.sicau.djcx.service.impl.TestServiceImpl;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    TestServiceImpl testService;


    @GetMapping("/testinfo")
    public Integer testInfo(Test test) {
       return 1;
    }
}

