package com.ruanko.dao;

import com.ruanko.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
* Title: UserDao
* Description:
* 用户数据接口 
* Version:1.0.0  

 */
public interface UserDao extends JpaRepository<User,Integer> {
    User findByAccount(String account);
}
