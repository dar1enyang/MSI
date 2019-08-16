package com.mercury.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.utils.HibernateUtil;

public class UserDao {
	
	public void save(User user) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		// insert into sample values (?, ?)
		session.save(user);
		
		transaction.commit();
		HibernateUtil.closeSession();
	}
	
	
	public List<User> getAll() {
		return null;
	}
	
	public User getByName(String name) {
		// stateful vs stateless
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		// select * from sample where name = ?
		User user = (User)session.get(User.class, name);
		
		transaction.commit();
		HibernateUtil.closeSession();
		
		return user;
	}
	
	public void deleteByName(String name) {
		
	}
}
