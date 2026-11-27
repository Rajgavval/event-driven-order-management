package com.edom.order.dto.request;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record CreateOrderRequest(
        @NotBlank(message = "Customer ID is required") String customerId,

        @NotEmpty(message = "Order must contain at least one item") List<@Valid OrderItemRequest> items) {

}
