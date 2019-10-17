package com.csq.shop_test.service;


import com.csq.shop_test.pojo.User;

import java.util.List;


public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    boolean isExist(String name);

    User get(String name, String password);
}

