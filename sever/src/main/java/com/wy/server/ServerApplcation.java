package com.wy.server;

/**
 * 服务器applcation
 *
 * @author liuwei
 * @date 2020/05/17
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml"})
@MapperScan("com.wy.server")
@EnableScheduling
public class ServerApplcation {

    public static void main(String[] args) {

        //声明spring启动容器
        SpringApplication springApplication = new SpringApplication(ServerApplcation.class);

        //设置banner图
        springApplication.setBanner(new ResourceBanner(new ClassPathResource("banner_bak.txt")));

        //启动
        springApplication.run(args);
    }

}
