package test.tests;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @program: HibernateDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-15 14:23
 **/

public class Test5GetLoad {
    public static void main(String[] args) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();


        // get(): eager
        // load(): lazy: will create a proxy object to hold the place, and get the data back whenever it is used

        User m1 = (User) session.get(User.class, "Monster");
        User m2 = (User) session.get(User.class, "Maria");

        System.out.println("*****************");

        System.out.println(m1.getClass().getName());
        System.out.println(m2.getClass().getName());

        System.out.println("*****************");
        System.out.println(m1);
        System.out.println(m2);

        transaction.commit();
        HibernateUtil.closeSession();
    }
}
