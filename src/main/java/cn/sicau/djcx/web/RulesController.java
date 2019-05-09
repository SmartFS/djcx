package cn.sicau.djcx.web;


import cn.sicau.djcx.entity.Rules;
import cn.sicau.djcx.mapper.RulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Controller
@RequestMapping("/rules")
public class RulesController {
    @Autowired
    RulesMapper rulesMapper;
    public void addRules(){
        Rules rules = new Rules();
        rules.setAid(1);
        rules.setPunchRequire(3);
        rulesMapper.insert(rules);
    }

}

