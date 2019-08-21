package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    public User findByUsername(String name);
}
