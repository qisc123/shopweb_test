package com.csq.shop_test.service;


import com.csq.shop_test.pojo.Product;
import com.csq.shop_test.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
