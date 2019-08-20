package com.mercury.SpringBootRestDemo.services;

import com.mercury.SpringBootRestDemo.beans.Product;
import com.mercury.SpringBootRestDemo.daos.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringBootRestDemo
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-20 16:34
 **/

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAll() {
        return productDao.findAll();
    }
}
