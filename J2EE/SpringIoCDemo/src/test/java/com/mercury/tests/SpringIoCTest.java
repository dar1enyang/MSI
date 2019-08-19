package com.mercury.tests;

import com.mercury.beans.User;
import com.mercury.daos.RoomDao;
import com.mercury.daos.UserDao;
import com.mercury.services.HrService;
import com.mercury.services.RegistrationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @program: SpringIoCDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-19 11:22
 **/

public class SpringIoCTest {
    public static void main(String[] args) {
        // create a spring container, bt loading the spring configuration xml file from the specific location
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("resources/spring-config.xml");

        System.out.println("Before ");
        UserDao ud = (UserDao) applicationContext.getBean("ud");
        UserDao ud2 = (UserDao) applicationContext.getBean("ud");

        System.out.println(ud);
        System.out.println(ud2);

        System.out.println(ud == ud2);

        System.out.println("****************");

        UserDao udd = (UserDao) applicationContext.getBean("udd");

        System.out.println(udd);
        System.out.println("****************");

        RoomDao rd = (RoomDao) applicationContext.getBean("rd");

        System.out.println(rd);

        System.out.println("****++++");

        RoomDao rdd = (RoomDao) applicationContext.getBean("rdd");
        RoomDao rdd2 = (RoomDao) applicationContext.getBean("rdd");

        System.out.println(rdd);
        System.out.println(rdd2);

        System.out.println(rdd == rdd2);

        System.out.println("*********************");

        HrService hs = (HrService) applicationContext.getBean("hs");

        System.out.println(hs);
        System.out.println(ud == hs.getUd());

        System.out.println("**************");

        RegistrationService rs = (RegistrationService) applicationContext.getBean("rs");
        System.out.println((rs));

        System.out.println(ud == rs.getUd());

        System.out.println("*********************");

        System.out.println(rd == hs.getRd());
    }
}
