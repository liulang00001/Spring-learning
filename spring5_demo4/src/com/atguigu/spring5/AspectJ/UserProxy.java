package com.atguigu.spring5.AspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/22 17:45
 * @description:
 */
@Component
@Aspect
public class UserProxy {

    //@Around 注解表示作为环绕通知
    @Around(value = "execution(* com.atguigu.spring5.AspectJ.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前......");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后......");
    }

    //前置通知
//@Before 注解表示作为前置通知
    @Before(value = "execution(* com.atguigu.spring5.AspectJ.User.add(..))")
    public void before(){
        System.out.println("before......");
    }

    //最后通知
//@After 注解表示作为前置通知
    @After(value = "execution(* com.atguigu.spring5.AspectJ.User.add(..))")
    public void after(){
        System.out.println("after......");
    }

    //异常通知
//@AfterThrow 注解表示作为前置通知
    @AfterThrowing(value = "execution(* com.atguigu.spring5.AspectJ.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing......");
    }

}
