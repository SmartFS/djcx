package cn.sicau.djcx.service.impl;

import cn.sicau.djcx.entity.Test;
import cn.sicau.djcx.mapper.TestMapper;
import cn.sicau.djcx.service.ITestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FS
 * @since 2019-04-26
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Autowired

    TestMapper testMapper;

    public Integer addTestInfo(Test test){

        Integer insert = testMapper.insert(test);
        return insert;

    }

}
