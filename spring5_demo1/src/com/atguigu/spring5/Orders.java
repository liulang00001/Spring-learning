package com.atguigu.spring5;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/20 02:21
 * @description:
 */
public class Orders {

    private String oname;
    private String address;

//    有参构造方法
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public String getOname() {
        return oname;
    }

    public String getAddress() {
        return address;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Orders() {
    }

    public void testDemo(){
        System.out.println(oname+"::"+address);
    }

}
