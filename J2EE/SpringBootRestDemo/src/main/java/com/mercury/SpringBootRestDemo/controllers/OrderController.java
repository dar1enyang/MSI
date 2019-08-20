package com.mercury.SpringBootRestDemo.controllers;

import com.mercury.SpringBootRestDemo.beans.Order;
import com.mercury.SpringBootRestDemo.daos.OrderDao;
import com.mercury.SpringBootRestDemo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-20 16:41
 **/
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
