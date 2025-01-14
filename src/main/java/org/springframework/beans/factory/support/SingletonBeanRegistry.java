package org.springframework.beans.factory.support;

/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
public interface SingletonBeanRegistry {
    void addSingleton(String beanName, Object bean);

    Object getSingleton(String beanName);
}
