package com.atguigu.spring5.testdemo;



import com.atguigu.spring5.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {


    @Test
    public void User(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

//        2、获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();


    }


    @Test
    public void Emp(){
//        1、加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

//        2、获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);



    }

}
