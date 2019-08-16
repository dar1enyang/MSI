package com.mercury.daos;

import com.mercury.beans.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestUserDao {


    private UserDao ud;

    @Before
    public void setUp() throws Exception {
        // @Before
        // the function will be executed once per test case (1 / test case)
        ud = new UserDao();

        System.out.println("***********");
    }

    @Test
    public void save() {
        User user = new User("Dog", 4);
        ud.save(user);

        User temp = ud.getByName("Dog");
        Assert.assertEquals(user, temp);
    }

    @Ignore
    public void getAll() {
        List<User> users = ud.getAll();
        Assert.assertEquals(6, users.size());
    }

    @Test
    public void getByName() {
        String name = "Billy";
        int age = 92;

        User user = ud.getByName(name);

        // this function success only if user.getAge() == age
        Assert.assertEquals(age, user.getAge());
    }

    @Test
    public void deleteByName() {
    }
}