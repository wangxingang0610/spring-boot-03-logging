package com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot03LoggingApplication {

    //日志启动器
    static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot03LoggingApplication.class, args);

        //日志级别
        logger.trace("trace......");
        logger.debug("debug.......");
        logger.info("info......");
        logger.warn("warn.......");
        logger.error("error.....");
    }

}

