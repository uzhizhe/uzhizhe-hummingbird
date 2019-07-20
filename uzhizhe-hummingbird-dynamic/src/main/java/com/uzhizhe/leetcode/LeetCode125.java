package com.uzhizhe.leetcode;

import org.junit.Test;

/**
 * Desc: 验证会文串
 * Author: qingjiang.li
 * Email: qing_jiang_li@163.com
 * Date: 2019/7/21
 */
public class LeetCode125 {

    @Test
    public void test() {
        String s = "0p";
        boolean bool = isPalindrome(s);
        System.out.println(bool);
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        for (; i < j; ) {
            while (true) {
                char ch = s.charAt(i);
                char chi = Character.toLowerCase(ch);
                if (i >= j) {
                    return true;
                }
                if ((chi >= 'a' && chi <= 'z') || (chi >= '0' && chi <= '9')) {
                    break;
                } else {
                    i++;
                }
            }

            while (true) {
                char ch = s.charAt(j);
                char chj = Character.toLowerCase(ch);
                if (i >= j) {
                    return true;
                }
                if ((chj >= 'a' && chj <= 'z') || (chj >= '0' && chj <= '9')) {
                    break;
                } else {
                    j--;
                }
            }
            //System.out.println(s.charAt(i) + " : " + s.charAt(j));

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }

        }
        return true;
    }
}
