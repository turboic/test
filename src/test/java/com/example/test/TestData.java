package com.example.test;
import com.example.test.mapper.AccountDAO;
import com.example.test.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestData{
    private final  static Logger logger = LoggerFactory.getLogger(TestData.class);
    @Autowired
    private Environment environment;


    @Autowired
    private AccountDAO accountDAO;


    //@Test
    public void test(){
        Account record = new Account();
        record.setId(UUID.randomUUID().toString());
        record.setAccountname("向日葵");
        record.setPassword("root");
        int insertResult = accountDAO.insert(record);
        logger.info("插入单条数据结果:{}",insertResult);
        List<Account> accountList = new ArrayList<Account>();
        //for(int i = 0;i<10000;i++){
            accountList.add(record);
        //}
        accountDAO.insertList(accountList);
    }

    //@Test
    public void update(){
        Account record = new Account();
        record.setId("1");
        record.setAccountname(null);
        record.setPassword("密码");
        int insertResult = accountDAO.update(record);
        logger.info("更新单条数据结果:{}",insertResult);
    }


    //@Test
    public void delete(){
        java.lang.String id = "1";
        int insertResult = accountDAO.delete(id);
        logger.info("删除单条数据结果:{}",insertResult);
    }


    //@Test
    public void select(){
        String id = "1";
        Account record = accountDAO.select(id);
        logger.info("查询单条数据结果:{}",record.toString());
    }


    //@Test
    public void otherSelect(){
        Account when = new Account();
        when.setAccountname("晓");
        List<Account> whenList = accountDAO.otherSelect(when);
        logger.info("如果查询单条数据结果:{}",whenList.get(0).toString());
        Account otherwise = new Account();
        otherwise.setPassword("222");
        List<Account> otherwiseList = accountDAO.otherSelect(otherwise);
        logger.info("否则查询单条数据结果:{}",otherwiseList.get(0).toString());
    }

    //@Test
    public void selectList(){
        Account when = new Account();
        when.setAccountname("晓");
        when.setPassword("1");
        List<Account> whenList = accountDAO.selectList(when);
        for(Account account : whenList){
            logger.info("selectList数据结果:{}",account.toString());
        }
    }

    //@Test
    public void selectList2(){
        Account list2 = new Account();
        list2.setAccountname("张");
        list2.setPassword("2");
        List<Account> whenList2 = accountDAO.selectList2(list2);
        for(Account account : whenList2){
            logger.info("selectList2数据结果:{}",account.toString());
        }
    }


    @Test
    public void deleteList(){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        accountDAO.deleteList(list);
        logger.info("删除多条数据数据结果");
    }

}
