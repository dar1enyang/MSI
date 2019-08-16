package test.tests;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * @program: HibernateDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-15 14:24
 **/

public class Test7Criteria {
    // use criteria to represent where clause
    public static void main(String[] args) {

        Session session = HibernateUtil.currentSession();
        Transaction transaction = session.beginTransaction();

        // select * from SAMPLE where age > 20 and age < 50 and name like '%e%';
        Criteria c = session.createCriteria(User.class);
        c.add(Restrictions.gt("age", 20))
                .add(Restrictions.lt("age", 50))
                .add(Restrictions.like("name", "%e%"));

        List<User> users = c.list();

        users.forEach(u -> System.out.println(u));
        transaction.commit();
        HibernateUtil.closeSession();
    }
}
