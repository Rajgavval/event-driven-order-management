package com.edom.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edom.order.dto.request.CreateOrderRequest;
import com.edom.order.entity.Order;
import com.edom.order.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@Valid @RequestBody CreateOrderRequest request) {

        Order createOrder = orderService.createOrder(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(createOrder);

    }

}
