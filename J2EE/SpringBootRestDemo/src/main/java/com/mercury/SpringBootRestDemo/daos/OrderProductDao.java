package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.http.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProdcutDao extends JpaRepository<Response, Integer> {
}
