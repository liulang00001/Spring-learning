package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/21 01:37
 * @description:
 */

//在注解里面value属性值可以省略不写，默认是类名称，首字母小写
@Service(value = "userService")  //等价于<bean id="userService" class="...."></bean>  -- service层
//@Component    -- 通用的注解
//@Repository   -- dao层
//@Controller   -- web层
//这四种注解作用相同，只是习惯使用的层同
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(){
        System.out.println("service add....");
        userDao.add();

    }
}
