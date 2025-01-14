package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author derekyi
 * @date 2020/11/24
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registryBeanDefinition("helloService",
            new BeanDefinition(HelloService.class, new PropertyValues()));
        HelloService helloService = (HelloService)beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }

    public static class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
