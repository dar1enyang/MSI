package tests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

public class Test5GetLoad {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		// get() : eager
		// load() : lazy : will create a proxy object to hold the place, and get the data back whenever it is used
		
		// if the record does not exist in DB
		// get() will return null;
		// load() will exception out;
		
		User m1 = (User)session.get(User.class, "Monster5");
		User m2 = (User)session.load(User.class, "Monster8");
		
		System.out.println("****************");
		
//		System.out.println(m1.getClass().getName());
		System.out.println(m2.getClass().getName());
		
		System.out.println("****************");
		System.out.println(m1);
		System.out.println(m2);
		
		transaction.commit();
		HibernateUtil.closeSession();
	}

}
