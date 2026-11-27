package com.edom.order.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edom.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, UUID>{
    
}
