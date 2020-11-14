package com.gpw.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

public class WebUtils {
    /**
     * 把Map的值注入到对应的javaBean属性中
     */
    public static <T> T copyParamToBean(Map value, T bean) {
        try {
            BeanUtils.populate(bean, value);
            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
