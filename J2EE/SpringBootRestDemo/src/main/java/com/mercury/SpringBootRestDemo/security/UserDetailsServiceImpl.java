package com.mercury.SpringBootRestDemo.security;

import com.mercury.SpringBootRestDemo.beans.User;
import com.mercury.SpringBootRestDemo.daos.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-21 17:33
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("username: " + username + " not found");
        }
        return user;
    }
}
