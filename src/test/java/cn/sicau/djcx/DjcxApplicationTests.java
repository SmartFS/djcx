package cn.sicau.djcx;

import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.mapper.UserMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DjcxApplicationTests {

    @Resource
    UserMapper userMapper;


    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectList(new EntityWrapper<User>());
        for (User user:users){
            System.out.println(user.getAccount()+user.getPassword());
        }

    }

}
