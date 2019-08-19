package com.mercury.tests;

import com.mercury.daos.FacilityDao;
import com.mercury.services.TrainingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @program: SpringIoCDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-19 14:43
 **/

public class SpringIoCScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("resources/spring-config.xml");
        System.out.println("*********************");
        FacilityDao fd = (FacilityDao) applicationContext.getBean("fd");
        FacilityDao fd2 = (FacilityDao) applicationContext.getBean("fd");

        System.out.println(fd);
        System.out.println(fd2);
        System.out.println(fd == fd2);

        System.out.println("*******************");
        TrainingService ts = (TrainingService) applicationContext.getBean("ts");
        TrainingService ts2 = (TrainingService) applicationContext.getBean("ts");
        System.out.println(ts);
        System.out.println(ts.getFd());
        System.out.println(fd == ts.getFd());
        System.out.println(ts2.getFd());
        System.out.println(ts.getFd() == ts2.getFd());
    }
}
