package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductDao extends JpaRepository<Product, Integer> {

    public Product findByName(String name);

    @Query("select p from Product p where p.price = :price")
    Product getByPrice(@Param("price") int price);

}
