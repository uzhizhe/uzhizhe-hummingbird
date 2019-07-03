package com.uzhizhe.springaop;

/**
 * @author qingjiang.li
 * @since 2019-07-03 11:16 AM
 */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat eat ...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep ...");
    }
}
