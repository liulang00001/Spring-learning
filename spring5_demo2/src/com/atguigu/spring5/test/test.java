package com.atguigu.spring5.test;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 21:34
 * @description:
 */



public class test {

    @Test
    public void stu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Stu stu1 = context.getBean("stu",Stu.class);
//        Stu stu2 = context.getBean("stu",Stu.class);
        System.out.println(stu1);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course1 = context.getBean("myBean", Course.class);
        Course course2 = context.getBean("myBean", Course.class);
        System.out.println(course1);
        System.out.println(course2);
    }

    @Test
    public void orders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步，获取bean实例");
        System.out.println(orders);

//        手动销毁bean
        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void autowire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);

    }


}
