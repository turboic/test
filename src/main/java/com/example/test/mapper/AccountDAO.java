package com.example.test.mapper;

import com.example.test.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 测试增删改查
 */
public interface AccountDAO {
    int insert(Account record);

    int update(Account record);

    int delete(@Param("id") String id);

    Account select(@Param("id") String id);

    int insertSelective(Account record);

    void insertList(List<Account> accountList);

    List<Account> otherSelect(Account account);

    List<Account> selectList(Account account);

    List<Account> selectList2(Account account);

    void deleteList(@Param("list") List<String> list);
}