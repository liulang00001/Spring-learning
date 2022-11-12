package com.atguigu.spring5.bean;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/21 00:28
 * @description:
 */
public class Orders {

//    无参构造
    public Orders() {
        System.out.println("第一步，执行无参构造创建bean实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性值");
    }

    //初始化方法
    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }

    // 执行销毁的方法
    public void destroyMethod(){
        System.out.println("第五步，执行销毁的方法");
    }
}
