package com.ctg.test.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class QuartzClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzClusterApplication.class, args);
    }
}
