package com.zhihao.usercenterbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhihao.usercenterbackend.mapper")
@SpringBootApplication
public class UserCenterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterBackendApplication.class, args);
    }

}
