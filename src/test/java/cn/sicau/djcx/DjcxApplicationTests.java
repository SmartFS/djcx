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
             //  List<Admin> users = userMapper.selectList(new EntityWrapper<User>());
        List<Admin> admins = adminMapper.selectList(new EntityWrapper<Admin>());
        User user = new User();
        user.setAccount("fangsheng");
        user.setPassword("123456");
        user.setPermission("01");
        user.setUserid(666L);
        userMapper.insert(user);
        //Integer integer = userMapper.deleteById("1");
        Integer integer = userMapper.delete(new EntityWrapper<User>());
         userMapper.selectList(new EntityWrapper<User>());

        if(integer>0)
           System.out.println("删除成功");
        else System.out.println("删除失败");
        for (Admin admin:admins){
            System.out.println("============");
            System.out.println("用户名："+admin.getUsename()+"工作ID"+admin.getJobId());
            System.out.println("=================");
        }

    }

}
