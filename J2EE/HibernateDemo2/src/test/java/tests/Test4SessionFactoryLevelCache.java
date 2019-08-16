package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mercury.beans.User;

// 2nd level cache : session factory level cache
// is supported by hibernate, disabled by default, unless configure it

// 1. add ehcache maven dependency
// 2. Create 2nd level cache configuration xml file - ehcache.xml
// 3. enable 2nd level cache by adding the provider in hibernate.cfg.xml
// 4. modify User.hbm.xml to define cache feature
public class Test4SessionFactoryLevelCache {

	public static void main(String[] args) {
		SessionFactory sf1 = new Configuration().configure().buildSessionFactory();
		SessionFactory sf2 = new Configuration().configure().buildSessionFactory();
		
		
		Session s1 = sf1.openSession();
		Transaction t1 = s1.beginTransaction();
		
		User m1 = (User)s1.get(User.class, "Monster");
		
		t1.commit();
		s1.close();
		
		System.out.println("************");
		
		Session s2 = sf1.openSession();
		Transaction t2 = s2.beginTransaction();
		
		User m2 = (User)s2.get(User.class, "Monster");
		
		t2.commit();
		s2.close();
		
		System.out.println("**********");
		
		Session s3 = sf2.openSession();
		Transaction t3 = s3.beginTransaction();
		
		User m3 = (User)s3.get(User.class, "Monster");
		
		t3.commit();
		s3.close();
	}

}
