package com.atguigu.spring5;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 21:02
 * @description:
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
