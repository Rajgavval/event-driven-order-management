package com.edom.order.enums;

public enum OrderStatus {
    
    PENDING,
    INVENTORY_RESERVED,
    PAYMENT_PROCESSING,
    CONFIRMED,
    INVENTORY_FAILED,
    PAYMENT_FAILED,
    CANCELLED
}
