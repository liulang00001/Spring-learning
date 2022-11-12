package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 20:45
 * @description:
 */
public class UserService {

//    创建userdao
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void add(){
        System.out.println("service add....");

//        UserDao userDao = new UserDaoImpl();
        userDao.add();
    }

}
