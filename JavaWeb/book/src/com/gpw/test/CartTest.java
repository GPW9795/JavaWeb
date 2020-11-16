package com.gpw.test;

import com.gpw.pojo.Cart;
import com.gpw.pojo.CartItem;
import org.junit.Test;

import java.math.BigDecimal;

public class CartTest {
    @Test
    public void addItem() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(2, "cbx", 1, new BigDecimal(1010), new BigDecimal(1010)));
        System.out.println(cart);
    }

    @Test
    public void deleteItem() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(2, "cbx", 1, new BigDecimal(1010), new BigDecimal(1010)));
        cart.deleteItem(1);
        System.out.println(cart);
    }

    @Test
    public void clear() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(2, "cbx", 1, new BigDecimal(1010), new BigDecimal(1010)));
        cart.clear();
        System.out.println(cart);
    }

    @Test
    public void updateCount() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(1, "gpw", 1, new BigDecimal(100), new BigDecimal(100)));
        cart.addItem(new CartItem(2, "cbx", 1, new BigDecimal(1010), new BigDecimal(1010)));
        cart.updateCount(1, 3);
        System.out.println(cart);
    }
}