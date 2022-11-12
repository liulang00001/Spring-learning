package com.atguigu.spring5.test;


import com.atguigu.spring5.AspectJ.User;
import com.atguigu.spring5.AspectJ.UserProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 21:34
 * @description:
 */



public class test {

    @Test
    public void aop(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        UserProxy userProxy = context.getBean("userProxy", UserProxy.class);
        User user = context.getBean("user", User.class);
        user.add();
    }


}
