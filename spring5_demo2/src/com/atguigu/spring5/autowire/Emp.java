package com.atguigu.spring5.autowire;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/21 00:47
 * @description:
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
