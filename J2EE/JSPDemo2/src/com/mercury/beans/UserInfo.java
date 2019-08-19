package com.mercury.beans;

import java.util.List;

/**
 * @program: JSPDemo2
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-16 16:42
 **/

public class UserInfo {
    private List<User> users;

    public UserInfo() {
    }

    public UserInfo(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "users=" + users +
                '}';
    }
}
