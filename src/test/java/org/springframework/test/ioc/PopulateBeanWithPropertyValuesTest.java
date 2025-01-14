package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanReference;
import org.springframework.beans.factory.PropertyValue;
import org.springframework.beans.factory.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.ioc.services.IdCard;
import org.springframework.test.ioc.services.Person;


/**
 *
 */
public class PopulateBeanWithPropertyValuesTest {

    @Test
    public void testGetBean() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues4IdCard = new PropertyValues();
        propertyValues4IdCard.addPropertyValue(new PropertyValue("no", "no100100"));
        BeanDefinition beanDefinition4IdCard = new BeanDefinition(IdCard.class, propertyValues4IdCard);
        beanFactory.registryBeanDefinition("idCard", beanDefinition4IdCard);

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "姓名"));
        propertyValues.addPropertyValue(new PropertyValue("age", 1));
        propertyValues.addPropertyValue(new PropertyValue("idCard", new BeanReference("idCard")));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        beanFactory.registryBeanDefinition("person", beanDefinition);
        Person person = (Person)beanFactory.getBean("person");
        System.out.println(person);
    }

}
