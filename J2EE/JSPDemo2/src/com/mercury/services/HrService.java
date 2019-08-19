package com.mercury.services;

import com.mercury.beans.User;
import com.mercury.daos.UserDao;

import java.util.List;

/**
 * @program: jdbcDemoJ
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-14 14:27
 **/

public class HrService {

    private UserDao ud = new UserDao();

    public User search(String s) {
        return ud.getByName(s);
    }

    public void register(String name, int age) {
        ud.save(new User(name, age));
    }

    public List<User> getAll() {
        return ud.getAll();
    }

    public void fire(String name) {
        ud.deleteByName(name);
    }

    public void sendNoticeToAll(String msg) {

    }

    public void sendNotice(String name, String msg) {

    }
}
