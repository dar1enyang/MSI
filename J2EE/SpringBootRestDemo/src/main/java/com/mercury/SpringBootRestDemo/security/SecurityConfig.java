package com.mercury.SpringBootRestDemo.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-21 17:43
 **/

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }
}
