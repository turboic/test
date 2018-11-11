package com.example.test.mapper;

import com.example.test.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * 测试关联
 */
@Repository//存在与否不影响mapper
public interface OrderDAO {
   Order getOrder2(@Param("id") String id);

    Order getOrder1(@Param("id") String id);
}