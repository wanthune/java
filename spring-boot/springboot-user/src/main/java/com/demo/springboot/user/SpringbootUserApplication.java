package com.demo.springboot.user;

import com.demo.springboot.user.initializer.SecondInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootUserApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringbootUserApplication.class, args);

        //方式二： 在启动类中添加初始化器
        SpringApplication springApplication = new SpringApplication(SpringbootUserApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }

}
