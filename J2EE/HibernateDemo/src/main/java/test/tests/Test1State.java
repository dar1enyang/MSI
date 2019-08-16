package test.tests;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @program: HibernateDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-15 14:22
 **/

public class Test1State {
    public static void main(String[] args) {
        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        User monster = new User("monster", 2);
        session.save(monster);


        // transient state: the object is never connected with session
        User maria = new User("Maria", 55);

        // persistence / attached state: the object belongs to the session
        User tony = (User) session.get(User.class, "Tony");

        tony.setAge(100);
        maria.setAge(100);


        // transient to attached
        User zuma = new User("Zuma", 22);
        session.save(zuma);
        zuma.setAge(44);

        //
        transaction.commit();
        HibernateUtil.closeSession();

        // detached state: used to be part of the session
        System.out.println(tony);

    }

    public void x() {

    }
}
