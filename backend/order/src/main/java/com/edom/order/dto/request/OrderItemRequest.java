package com.edom.order.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrderItemRequest(
    @NotBlank(message = "Product ID should not be Blank")
    String productId,

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    Integer quantity,

    @NotNull(message = "Price is required")
    @Min(value = 1, message = "Price must be greater than zero")
    BigDecimal price
){
    
}
