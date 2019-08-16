package tests;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

public class Test6QueryCache {
	// disabled by default
	// query cache will use the same 3rd party cache to store the <input, result> pair
	
	// to enable the query cache:
	// 1. enable it in hibernate.cfg.xml
	// 2. setCacheable(true) on the query object

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from User";		// select * from SaMPLE
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		
		List<User> users = query.list();	// execute the HQL
		users.forEach(u -> System.out.println(u));
		
		System.out.println("**********");
		
		List<User> users2 = query.list();	// execute the HQL
		users2.forEach(u -> System.out.println(u));
		
		transaction.commit();
		HibernateUtil.closeSession();
	}
}
