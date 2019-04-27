package cn.sicau.djcx;

import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Wrapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("cn.sicau.djcx.mapper")
public class DjcxApplicationTests {

    @Resource
    UserMapper userMapper;


    @Test
    public void contextLoads() {
      //  userMapper.selectList(Wrapper<>);
        User user = new User();
        user.setAccount("1234214");
        user.setPassword("452421");
        user.setPermission("1");
        userMapper.insert(user);

    }

}
