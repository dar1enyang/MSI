package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductDao extends JpaRepository<OrderProduct, Integer> {
}
