package com.ctg.test.quartz.service;

import com.ctg.test.quartz.task.MyQuartzJobBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Author lisa
 * Date 2019/2/20
 **/
@Service
public class TestService {
    private Logger logger = LoggerFactory.getLogger(TestService.class);
    public void doService(){
        logger.info("service is running");
    }
}
