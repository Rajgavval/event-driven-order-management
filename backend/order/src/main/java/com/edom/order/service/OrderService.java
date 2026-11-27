package com.edom.order.service;

import java.util.UUID;

import com.edom.order.dto.request.CreateOrderRequest;
import com.edom.order.entity.Order;

public interface OrderService {

    Order createOrder(CreateOrderRequest request);

    Order getOrderById(UUID id);
}
