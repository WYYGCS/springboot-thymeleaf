package com.ruanko.service.impl;

import com.ruanko.dao.UserDao;
import com.ruanko.entity.User;
import com.ruanko.service.MD5Test;
import com.ruanko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
* Title: UserServiceImpl
* Description: 
* 用户操作实现类 
* Version:1.0.0  

 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.save(user);
            flag=true;
        }catch(Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean matchingPassword(User user) {
        System.out.println(user.getAccount());
        boolean flag=false;
        User daoUser=userDao.findByAccount(user.getAccount());
        try {
            System.out.println("密码和盐值相加："+user.getPassword()+daoUser.getSalt());
            String md5Password=MD5Test.md5(user.getPassword()+daoUser.getSalt());
            System.out.println("md5加密后："+md5Password);
            if(md5Password.equals(daoUser.getPassword())){
                System.out.println("密码匹配成功");
                flag=true;
            };
        }catch (Exception e){
            System.out.println("匹配密码失败！");
            e.printStackTrace();
        }
        return flag;
    }

}
