package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;

/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
