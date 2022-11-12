package com.atguigu.spring5.JDKProxy;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/22 17:07
 * @description:
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces={UserDao.class};

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao =(UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result=dao.add(1,2);
        System.out.println("运行结果为："+result);
    }

//    创建代理对象代码


}

class UserDaoProxy implements InvocationHandler{
//创建谁的代理对象，就把谁传进来
//    有参构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

//    增强的逻辑


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        方法之前
        System.out.println("方法执行之前....."+method.getName()+":传递的参数...."+ Arrays.toString(args));

//        执行方法
        Object res = method.invoke(obj, args);
//        方法之后
        System.out.println("执行方法之后："+obj);

        return res;
    }
}
















