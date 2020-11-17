package com.gpw.test;

import com.gpw.pojo.Cart;
import com.gpw.pojo.CartItem;
import com.gpw.service.OrderService;
import com.gpw.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderServiceTest {

    @Test
    public void createOrder() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(2, "cbx", 1, new BigDecimal(1010), new BigDecimal(1010)));
        OrderService orderService = new OrderServiceImpl();
        orderService.createOrder(cart, 1);
    }
}