package com.gpw.test;

import com.gpw.dao.OrderDao;
import com.gpw.dao.impl.OrderDaoImpl;
import com.gpw.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderDaoTest {
    OrderDao orderDao = new OrderDaoImpl();

    @Test
    public void saveOrder() {
        orderDao.saveOrder(new Order("1234", new Date(), new BigDecimal(100), 0, 18));
    }
}