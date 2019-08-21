package com.mercury.SpringBootRestDemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-21 15:27
 **/
@Component
@Aspect
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${app.name}")
    private String APP_NAME;

    // @Before: when
    // (""): where
    @Before("execution (* com.mercury.SpringBootRestDemo.controllers.ProductController.get*(..))")
    public void logAppName() {
        // what
        logger.info(APP_NAME + " is being called for getting product information");
    }
}
