package test.tests;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * @program: HibernateDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-15 14:22
 **/

/*
    HQL: Hibernate Query Language
     use to operate java class

*/
public class Test2Hql {
    public static void main(String[] args) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();


        String hql = "from User";
        Query query = session.createQuery(hql);

        List<User> users = query.list();
        users.forEach(u -> System.out.println(u));


        transaction.commit();
        HibernateUtil.closeSession();
    }

    public void x() {

        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        HibernateUtil.closeSession();
    }
}
