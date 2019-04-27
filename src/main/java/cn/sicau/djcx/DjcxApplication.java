package cn.sicau.djcx;

import cn.sicau.djcx.entity.User;
import cn.sicau.djcx.mapper.UserMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
@EnableScheduling
@EnableCaching
@MapperScan("cn.sicau.djcx.mapper")
public class DjcxApplication {


    public static void main(String[] args) {

        SpringApplication.run(DjcxApplication.class, args);
    }

}
