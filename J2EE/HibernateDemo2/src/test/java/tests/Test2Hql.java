package tests;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

// HQL : Hibernate Query Language
// use to operate java class, not table
public class Test2Hql {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from User";		// select * from SaMPLE
		Query query = session.createQuery(hql);
		
		List<User> users = query.list();	// execute the HQL
		
		users.forEach(u -> System.out.println(u));
		
		transaction.commit();
		HibernateUtil.closeSession();
	}
}
