package com.gpw.test;

import com.gpw.utils.JdbcUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

class JdbcUtilsTest {

    @Test
    public void testJdbcUtils() {
        for (int i = 0; i < 100; i++) {
            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
            JdbcUtils.close(conn);
        }
    }
}