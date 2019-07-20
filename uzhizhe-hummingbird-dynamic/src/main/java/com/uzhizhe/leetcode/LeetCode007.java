package com.uzhizhe.leetcode;

import org.junit.Test;

/**
 * Desc: 整数反转
 * Author: qingjiang.li
 * Email: qing_jiang_li@163.com
 * Date: 2019/7/20
 */
public class LeetCode007 {

    @Test
    public void test() {

        int num = -1200003000;
        System.out.println(num);
        int reverse = reverse(num);
        System.out.println(reverse);

        System.out.println(Integer.MAX_VALUE);

    }

    public int reverse(int x) {
        if (x == 0) return 0;
        String result = "";
        String s = String.valueOf(x);
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '-' || ch == '+') {
                result = ch + result;
                break;
            }
            result = result + ch;
        }
        try {
            return Integer.valueOf(result);
        } catch (Exception e) {
            return 0;
        }
    }

}
