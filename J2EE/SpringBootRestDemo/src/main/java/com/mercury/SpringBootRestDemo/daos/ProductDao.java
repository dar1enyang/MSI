package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDao extends JpaRepository<Product, Integer> {

}
