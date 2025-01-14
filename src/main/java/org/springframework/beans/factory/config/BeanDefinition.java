package org.springframework.beans.factory.config;

import java.util.List;

/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
public class BeanDefinition {

    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }
}
