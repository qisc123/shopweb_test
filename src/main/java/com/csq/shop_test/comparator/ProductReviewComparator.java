package com.csq.shop_test.comparator;


import com.csq.shop_test.pojo.Product;

import java.util.Comparator;


public class ProductReviewComparator implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()-p1.getReviewCount();
    }

}
