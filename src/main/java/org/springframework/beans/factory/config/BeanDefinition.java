package org.springframework.beans.factory.config;

import org.springframework.beans.factory.PropertyValues;


/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
public class BeanDefinition {

    private Class<?> beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class<?> beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}
