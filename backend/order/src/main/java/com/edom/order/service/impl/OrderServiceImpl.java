package com.edom.order.service.impl;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edom.order.dto.request.CreateOrderRequest;
import com.edom.order.entity.Order;
import com.edom.order.entity.OrderItem;
import com.edom.order.enums.OrderStatus;
import com.edom.order.repository.OrderRepository;
import com.edom.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    @Transactional
    public Order createOrder(CreateOrderRequest request) {

        Order order = new Order();

        order.setCustomerId(request.customerId());
        order.setOrderStatus(OrderStatus.PENDING);

        BigDecimal totalAmount = BigDecimal.ZERO;

        for (var itemRequest : request.items()) {
            OrderItem item = new OrderItem(itemRequest.productId(), itemRequest.quantity(), itemRequest.price());
            order.addItem(item);

            totalAmount = totalAmount.add(item.getSubtotal());
        }
        order.setTotalAmount(totalAmount);

        return orderRepository.save(order);
    }

    @Override
    @Transactional(readOnly = true)
    public Order getOrderById(UUID id) {

        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found: " + id));

    }

}
