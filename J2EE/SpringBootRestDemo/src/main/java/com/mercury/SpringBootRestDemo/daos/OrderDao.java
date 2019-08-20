package com.mercury.SpringBootRestDemo.daos;

import com.mercury.SpringBootRestDemo.beans.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Integer> {

}
