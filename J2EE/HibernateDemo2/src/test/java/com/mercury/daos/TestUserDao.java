package com.mercury.daos;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.mercury.beans.User;

import junit.framework.Assert;

public class TestUserDao {
	
	private UserDao ud;

	@Before
	public void setUp() throws Exception {
		// @Before
		// the function will be executed once per test case (1 / test case)
		ud = new UserDao();
		
		System.out.println("***********");
	}
	
	@Test
	public void testGetByName() {
		String name = "Billy";
		
		User user = ud.getByName(name);
		
		Assert.assertEquals(92, user.getAge());		// this function success only if user.getAge() == 92
	}
	
	@Ignore
	public void testGetAll() {
		List<User> users = ud.getAll();
		
		Assert.assertEquals(4, users.size());
	}

	@Ignore
	public void testSave() {
		User user = new User("Dog", 4);
		ud.save(user);
		
		User temp = ud.getByName("Dog");
		
		Assert.assertEquals(user, temp);
	}
}
