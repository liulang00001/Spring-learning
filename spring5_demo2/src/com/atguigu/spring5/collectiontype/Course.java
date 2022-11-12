package com.atguigu.spring5.collectiontype;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 21:42
 * @description:
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
