package com.uzhizhe.springaop;

/**
 * @author qingjiang.li
 * @since 2019-07-03 11:15 AM
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eat ...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep ...");
    }
}
