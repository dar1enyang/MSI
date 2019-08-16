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
 * @create: 2019-08-15 14:24
 **/

public class Test8NamedQuery {
    public static void main(String[] args) {

        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.getNamedQuery("userQuery");
        query.serInteger("age", 40);

        List<User> users = query.list();
        users.forEach(u -> System.out.println(u));


        transaction.commit();
        HibernateUtil.closeSession();
    }
}
