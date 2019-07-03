package com.uzhizhe.springaop;

/**
 * @author qingjiang.li
 * @since 2019-07-03 11:04 AM
 */
public class Hello implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Hello spring aop ...");
    }
}
