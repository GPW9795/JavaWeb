package com.gpw.test;

import com.gpw.dao.OrderItemDao;
import com.gpw.dao.impl.OrderItemDaoImpl;
import com.gpw.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderItemDaoTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null, "水浒传", 1, new BigDecimal(100), new BigDecimal(100), "1234"));
        orderItemDao.saveOrderItem(new OrderItem(null, "操作系统原理", 1, new BigDecimal(100), new BigDecimal(100), "1234"));
        orderItemDao.saveOrderItem(new OrderItem(null, "大话设计模式111", 1, new BigDecimal(100), new BigDecimal(100), "1234"));
    }
}