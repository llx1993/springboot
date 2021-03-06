package com.ctg.test.durid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * durid web监控台：http://localhost:8090/druid/index.html(root/root)
 */
@SpringBootApplication
@MapperScan("com.ctg.test.durid.mapper")//配置mybatis包扫描
public class SpringbootDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDruidApplication.class, args);
    }
}
