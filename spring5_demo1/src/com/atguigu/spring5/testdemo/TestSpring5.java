package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {


    @Test
    public void testAdd(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

//        2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void book1(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

//        2、获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();

    }

    @Test
    public void orders(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

//        2、获取配置创建的对象
        Orders order = context.getBean("orders", Orders.class);

        System.out.println(order);
        order.testDemo();

    }

    @Test
    public void orders2(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

//        2、获取配置创建的对象
        Orders order = context.getBean("orders2", Orders.class);

        System.out.println(order);
        order.testDemo();

    }


    @Test
    public void orders3(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

//        2、获取配置创建的对象
        Orders order = context.getBean("orders3", Orders.class);

        System.out.println(order);
        order.testDemo();

    }

}
