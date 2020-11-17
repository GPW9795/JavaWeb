package com.gpw.service;

import com.gpw.pojo.Cart;

public interface OrderService {
    String createOrder(Cart cart, Integer userId);
}
