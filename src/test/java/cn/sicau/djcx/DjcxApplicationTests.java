package cn.sicau.djcx;

import cn.sicau.djcx.entity.Admin;
import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.mapper.AdminMapper;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DjcxApplicationTests {

    @Resource
    UserMapper userMapper;
    @Resource
    AdminMapper adminMapper;


    @Test
    public void contextLoads() {
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        String s = simpleDateFormat.format(new Date(Long.parseLong(String.valueOf("1559368035000"))));
        System.out.println(s);

    }

}
