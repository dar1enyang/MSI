package com.mercury.services;

import com.mercury.daos.UserDao;

/**
 * @program: SpringIoCDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-19 10:39
 **/

public class RegistrationService {
    private UserDao ud;

    @Override
    public String toString() {
        return "RegistrationService{" +
                "ud=" + ud +
                '}';
    }

    public UserDao getUd() {
        return ud;
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }
}
