package tests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

public class Test3SessionCache {
	
	// ORM : no need to write lots of SQL
	// Hibernate caches: 1st level, 2nd level
	// 1st level cache : session cache - cache the object inside session
	// 1st level cache is a feature belong to hibernate, enabled by default, 
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		User monster = (User)session.get(User.class, "Monster");
		System.out.println("**************");
		User monster2 = (User)session.get(User.class, "Monster");
		
		System.out.println(monster);
		System.out.println(monster2);
		
		transaction.commit();
		HibernateUtil.closeSession();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		Session session2 = HibernateUtil.currentSession();
		Transaction transaction2 = session2.beginTransaction();
		
		User monster3 = (User)session2.get(User.class, "Monster");
		
		transaction2.commit();
		HibernateUtil.closeSession();
		
		System.out.println(monster == monster2);
		System.out.println(monster == monster3);
	}
}
