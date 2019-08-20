package com.mercury.SpringBootRestDemo.services;

import com.mercury.SpringBootRestDemo.beans.Order;
import com.mercury.SpringBootRestDemo.daos.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-20 16:41
 **/
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<Order> getAll() {
        return orderDao.findAll();
    }
}
