package cn.sicau.djcx.service.impl;

import cn.sicau.djcx.entity.Testresult;
import cn.sicau.djcx.mapper.TestresultMapper;
import cn.sicau.djcx.service.ITestresultService;
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
public class TestresultServiceImpl extends ServiceImpl<TestresultMapper, Testresult> implements ITestresultService {

    @Autowired
    TestresultMapper testresultMapper;

    public Integer addTestResult(Testresult testresult){
        return 1;
    }
}
