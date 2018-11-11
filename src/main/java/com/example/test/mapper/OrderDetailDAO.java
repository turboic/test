package com.example.test.mapper;

import com.example.test.model.OrderDetail;
import org.apache.ibatis.annotations.Param;
/**
 * 测试关联
 */


public interface OrderDetailDAO {
    OrderDetail getOrderDetail1(@Param("id") String id);

    OrderDetail getOrderDetail2(@Param("id") String id);
}