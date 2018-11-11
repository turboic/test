package com.example.test;


import com.example.test.mapper.AppDAO;
import com.example.test.mapper.OrderDAO;
import com.example.test.mapper.OrderDetailDAO;
import com.example.test.model.Address;
import com.example.test.model.App;
import com.example.test.model.Order;
import com.example.test.model.OrderDetail;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFenYe {
    private final  static Logger logger = LoggerFactory.getLogger(TestFenYe.class);
    @Autowired
    private Environment environment;


    @Autowired
    private AppDAO appDAO;

    @Test
    public void testApp(){
        //App app;
        /*for(int i = 0;i<10000;i++){
            app = new App();
            app.setId(UUID.randomUUID().toString());
            app.setAccountid(UUID.randomUUID().toString());
            app.setCompany("alibaba");
            app.setAppname("天猫和淘宝");
            appDAO.insert(app);
        }*/

        int pageNum = 11;
        int pageSize = 11;
        PageHelper.startPage(pageNum,pageSize);
        App example = new App();
        example.setAppname("天猫和淘宝");
        List<App> appList = appDAO.select(example);
        for(App app : appList){
            logger.info("分页查询出的App是:{}",app.toString());
        }
        PageInfo<App> pageInfo = new PageInfo<App>(appList);
        logger.info("分页查询出的数量是:{}",pageInfo.getSize());
        logger.info("分页查询出的页数是:{}",pageInfo.getPages());



    }


}
