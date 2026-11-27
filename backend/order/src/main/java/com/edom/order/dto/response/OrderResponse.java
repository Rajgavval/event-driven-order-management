package com.edom.order.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.edom.order.enums.OrderStatus;

public record OrderResponse(
    UUID id,
    UUID customerId,
    OrderStatus orderStatus,
    BigDecimal totalAmount,
    LocalDateTime createdAt

) {
}
