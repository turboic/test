package com.example.test;


import com.example.test.mapper.OrderDAO;
import com.example.test.mapper.OrderDetailDAO;
import com.example.test.model.Address;
import com.example.test.model.Order;
import com.example.test.model.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestGuanLian {
    private final  static Logger logger = LoggerFactory.getLogger(TestGuanLian.class);
    @Autowired
    private Environment environment;


    @Autowired
    private OrderDetailDAO orderDetailDAO;

    @Autowired
    private OrderDAO orderDAO;

    //@Test
    public void test(){
       //OrderDetail orderDetail = orderDetailDAO.getOrderDetail1("1");
       OrderDetail orderDetail = orderDetailDAO.getOrderDetail2("1");
       logger.info("输出关联结果:{}",orderDetail.toString());
    }


    @Test
    public void test2(){
        Order order1 = orderDAO.getOrder1("222");
        logger.info("第一种方式");
        logger.info("输出关联结果orderDAO.getOrder1:{}",order1.toString());
        if(order1.getOrderDetailList() != null){
            for(OrderDetail orderDetail : order1.getOrderDetailList()){
                logger.info("输出关联结果orderDAO.getOrder1.order1.getOrderDetailList:{}",orderDetail.toString());
            }
        }
        logger.info("=========================================================================================");
        Order order2 = orderDAO.getOrder2("222");
        logger.info("第二种方式");
        logger.info("输出关联结果orderDAO.getOrder2:{}",order2.toString());
        if(order2.getOrderDetailList() != null){
            for(OrderDetail orderDetail : order2.getOrderDetailList()){
                logger.info("输出关联结果orderDAO.getOrder2.order2.getOrderDetailList:{}",orderDetail.toString());
            }
        }

        logger.info("=========================================================================================");
        if(order2.getAddresslList() != null){
            for(Address address : order2.getAddresslList()){
                logger.info("输出关联结果orderDAO.getOrder2.order2.getAddresslList:{}",address.toString());
            }
        }

    }

}
