package com.mercury.daos;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Entity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: jdbcDemoJ
 * @description: CRUD operations for User
 * @author: yangdar1en
 * @create: 2019-08-14 14:23
 **/
@Entity
public class UserDao {
    public void save(User user) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        // insert into sample
        session.save(user);
        transaction.commit();
        HibernateUtil.closeSession();
    }

    public List<User> getAll() {
        List<User> list = new ArrayList<User>();


        return list;
    }

    public User getByName(String name) {
        // stateful vs stateless
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        // select * from sample where name = ?
        User user = (User) session.get(User.class, name);
        transaction.commit();
        HibernateUtil.closeSession();

        return  user;
    }

    public void deleteByName(String name) {

    }

}
