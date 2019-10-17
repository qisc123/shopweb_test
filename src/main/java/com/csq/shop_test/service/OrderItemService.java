package com.csq.shop_test.service;

import com.csq.shop_test.pojo.Order;
import com.csq.shop_test.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {

    void add(OrderItem c);

    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();

    void fill(List<Order> os);

    void fill(Order o);

    int getSaleCount(int  pid);
    List<OrderItem> listByUser(int uid);
}