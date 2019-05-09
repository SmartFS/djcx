package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.Airticle;
import cn.sicau.djcx.mapper.AirticleMapper;
import cn.sicau.djcx.service.impl.AirticleServiceImpl;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Controller
@RequestMapping("/airticle")
public class AirticleController {

    @Autowired
    AirticleServiceImpl airticleService;

    @ResponseBody
    @GetMapping("/airticles/{num}")
    public String getAllArticle(@PathVariable("num") int num) {
        //获得所有的文章信息，文章链接应包含在content属性中
        List<Airticle> allAirticles = airticleService.getAllAirticles(num);
        String string = JSON.toJSONString(allAirticles);
        return string;
    }
    

}

