package com.csq.shop_test.service.impl;

import com.csq.shop_test.mapper.CategoryMapper;
import com.csq.shop_test.pojo.Category;
import com.csq.shop_test.service.CategoryService;
import com.csq.shop_test.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list(){
        return categoryMapper.list();
    }

    @Override
    public void add(Category category){
         categoryMapper.add(category);
    }
    public void delete(int id){
        categoryMapper.delete(id);
    }
    public Category get(int id){
        return categoryMapper.get(id);
    }

    public void update(Category category){
        categoryMapper.update(category);
    }
}
