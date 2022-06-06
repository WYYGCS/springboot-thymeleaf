package com.ruanko.service;

import com.ruanko.entity.User;

/**
 * 
* Title: UserService
* Description: 
* 用户接口 
* Version:1.0.0  

 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     *
     * @param user
     * @return
     */
    boolean matchingPassword(User user);
}
