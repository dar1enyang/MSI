package test.tests;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Queue;

/**
 * @program: HibernateDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-15 14:23
 **/

public class Test6QueryCache {
    public static void main(String[] args) {

        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        // when query a group of targets, default not to use cache

        // query cache will use the same 3rd party cache to store the info

        // to enable the query cache
        // 1. enable it in hibernate.cfg.xml
        // 2. setCacheable(true) on the query object
        String hql = "from User";
        Query query = session.createQuery(hql);

        List<User> users = query.list(); // execute query
        users.forEach(u -> System.out.println(u));

        System.out.println("***********");

        List<User> users2 = query.list();
        users2.forEach(u -> System.out.println(u));



        transaction.commit();
        HibernateUtil.closeSession();
    }
}
