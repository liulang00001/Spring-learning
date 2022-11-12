package com.atguigu.spring5.dao;

import org.springframework.stereotype.Component;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/21 21:36
 * @description:
 */
@Component
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add.....");
    }
}
