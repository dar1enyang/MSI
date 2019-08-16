package tests;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

public class Test8NamedQuery {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.getNamedQuery("userQuery");
		query.setInteger("age", 40);
		
		List<User> users = query.list();
		users.forEach(u -> System.out.println(u));
		
		
		transaction.commit();
		HibernateUtil.closeSession();
	}
}
