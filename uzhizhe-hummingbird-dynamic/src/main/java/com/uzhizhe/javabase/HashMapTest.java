package com.uzhizhe.javabase;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author qingjiang.li
 * @since 2019-07-06 12:07 PM
 */
public class HashMapTest {



    @Test
    public void test() {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("name", "liqingjiang");


        int hash = 123123213;
        int n = 16;

        System.out.println(Integer.toBinaryString(n - 1));
        System.out.println(Integer.toBinaryString(hash));
        System.out.println((n-1) & hash);
        System.out.println(hash & (n-1));

        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("", "");

    }
}
