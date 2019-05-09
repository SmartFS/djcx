package cn.sicau.djcx.web;

import cn.sicau.djcx.entity.Rules;
import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.mapper.RulesMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RulesControllerTest {
    @Autowired
    RulesMapper rulesMapper;

    @Test
    public void addRules() {
        Rules rules = new Rules();
        rules.setAid(1);
        rules.setPunchRequire(3);
        Integer insert = rulesMapper.insert(rules);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        List<Rules> rules1 = rulesMapper.selectBatchIds(integers);
        List<Rules> rules2 = rulesMapper.selectPage(new Page<>(2, 5), null);
       // rulesMapper.selectPage(new Page<Rules>(1,2),new EntityWrapper<Rules>().eq(aid).eq("123"));
        System.out.println(insert);
    }

}