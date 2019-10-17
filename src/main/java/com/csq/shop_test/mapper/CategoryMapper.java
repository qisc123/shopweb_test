package com.csq.shop_test.mapper;
import com.csq.shop_test.pojo.Category;
import com.csq.shop_test.util.Page;

import java.util.List;

public interface CategoryMapper {
    List<Category> list();

    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}
