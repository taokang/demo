package com.example.demo.dto;

public class GenericTest {

    private String x1;

    public String getX1() {
        return x1;
    }

    public void setX1(String x1) {
        this.x1 = x1;
    }

    public <E,T> E show(T t){
        System.out.println("进入泛型方法");
        System.out.println("T的值为："+t);
       E e=(E)t;
       System.out.println("返回的值为:"+e);
       return e;
    }
}
