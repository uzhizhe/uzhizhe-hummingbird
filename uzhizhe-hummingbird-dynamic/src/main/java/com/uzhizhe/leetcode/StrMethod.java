package com.uzhizhe.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiang.li
 * @since 2019-07-04 11:56 AM
 */
public class StrMethod {

//    @Test
//    public int lengthOfLongestSubstring(String s) {
//
//
//        return 0;
//    }



    @Test
    public void test2() {
        String str = "aaa123abc45e3f33";
        List<Integer> list = getIntByString(str);
        System.out.println(list);
    }



    public List<Integer> getIntByString(String str) {
        List<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (!flag) {
                    p1 = i;
                    flag = true;
                }
                p2 = i;
            } else {
                System.out.println(i);
                System.out.println(p1);
                System.out.println(p2);
                flag = false;
                if (p2 == i - 1 && p2 - p1 >= 1) {
                    String s = str.substring(p1, i);
                    list.add(Integer.valueOf(s));
                }
            }
        }
        if (p2 - p1 >= 1 && p2 == str.length()-1) {
            String s = str.substring(p1, p2+1);
            list.add(Integer.valueOf(s));
        }

        return list;


    }


}
