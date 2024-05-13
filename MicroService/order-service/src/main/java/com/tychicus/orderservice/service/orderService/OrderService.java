package com.tychicus.orderservice.service.orderService;

import com.tychicus.orderservice.dto.OrderRequest;

public interface OrderService {
    public void placeOrder(OrderRequest orderRequest);
}
