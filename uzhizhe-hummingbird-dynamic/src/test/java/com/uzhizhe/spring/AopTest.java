package com.uzhizhe.spring;

import com.uzhizhe.springaop.*;
import org.junit.Test;

/**
 * @author qingjiang.li
 * @since 2019-07-03 11:11 AM
 */
public class AopTest {

    
    @Test
    public void test() {
        IHello hello = (IHello) new HelloProxy().bind(new Hello());
        hello.sayHello();

        Animal dog = (Animal) new HelloProxy().bind(new Dog());
        dog.eat();
        dog.sleep();

        Animal cat = (Animal) new HelloProxy().bind(new Cat());
        cat.eat();
        cat.sleep();

    }
}
