package com.mercury.services;

import com.mercury.daos.RoomDao;
import com.mercury.daos.UserDao;

/**
 * @program: SpringIoCDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-19 10:39
 **/

public class HrService {


    private UserDao ud;
    private RoomDao rd;

    public RoomDao getRd() {
        return rd;
    }

    public void setRd(RoomDao rd) {
        this.rd = rd;
    }

    public UserDao getUd() {
        return ud;
    }

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    @Override
    public String toString() {
        return "HrService{" +
                "ud=" + ud +
                ", rd=" + rd +
                '}';
    }

    public void register() {

    }
}
