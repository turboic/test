package com.example.test.mapper;

import com.example.test.model.App;

import java.util.List;

/**
 * 测试分页
 */
public interface AppDAO {
    int insert(App record);

    List<App> select(App app);
}