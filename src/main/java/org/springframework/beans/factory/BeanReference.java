package org.springframework.beans.factory;

import lombok.Data;

/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
@Data
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}
