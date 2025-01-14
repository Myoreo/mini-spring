package org.springframework.beans.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : xuaoping
 * @Date : 2025/01
 */
public class PropertyValues {
    private List<PropertyValue> propertyValues = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValues.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }
}
