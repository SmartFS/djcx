package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.Testresult;
import cn.sicau.djcx.service.impl.TestresultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
@RequestMapping("/testresult")
public class TestresultController {
    @Autowired
    TestresultServiceImpl testresultService;


    @GetMapping("/test")
    public  Integer addTestResult(Testresult testresult){
        return 1;
    }

}

