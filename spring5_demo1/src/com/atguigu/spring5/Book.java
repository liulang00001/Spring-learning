package com.atguigu.spring5;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 02:00
 * @description: 演示使用set方法进行注入属性
 */
public class Book {

    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("abd");
    }

    public void testDemo(){
        System.out.println(bname+bauthor);
    }

}
