package cn.sicau.djcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.sicau.djcx.mapper")
public class DjcxApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjcxApplication.class, args);
    }

}
