package com.csq.shop_test.service;

import com.csq.shop_test.pojo.Review;

import java.util.List;

public interface ReviewService {

    void add(Review c);

    void delete(int id);
    void update(Review c);
    Review get(int id);
    List list(int pid);

    int getCount(int pid);
}

