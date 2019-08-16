package tests;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

public class Test7Criteria {

	// use criteria to represent where clause
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria c = session.createCriteria(User.class);
		
		// select * from SAMPLE where age > 20 and age < 30 and name like '%e%'
		c.add(Restrictions.gt("age", 20))
			.add(Restrictions.lt("age", 30))
			.add(Restrictions.like("name", "%e%"));
		
		List<User> users = c.list();
		
		users.forEach(u -> System.out.println(u));
		
		transaction.commit();
		HibernateUtil.closeSession();
	}
}
