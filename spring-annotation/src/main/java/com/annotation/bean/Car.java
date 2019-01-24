package com.annotation.bean;

/**
 * @Description:
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/24 15:57
 */
public class Car {

    public Car() {
        System.out.println("Car constructor");
    }

    public void init() {
        System.out.println("Car is initialized");
    }

    public void destroy() {
        System.out.println("Car is destroy");
    }
}
