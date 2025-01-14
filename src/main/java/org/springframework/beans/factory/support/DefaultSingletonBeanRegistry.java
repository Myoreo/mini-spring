package org.springframework.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonBeans;

    public DefaultSingletonBeanRegistry() {
        singletonBeans = new HashMap<>();
    }

    @Override
    public void addSingleton(String beanName, Object bean) {
        singletonBeans.put(beanName, bean);
    }

    @Override
    public Object getSingleton(String beanName) {
        return singletonBeans.get(beanName);
    }
}
