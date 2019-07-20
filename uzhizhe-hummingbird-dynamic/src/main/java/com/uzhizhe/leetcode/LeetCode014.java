package com.uzhizhe.leetcode;

import org.junit.Test;

/**
 * Desc: 最长公共子串
 * Author: qingjiang.li
 * Email: qing_jiang_li@163.com
 * Date: 2019/7/20
 */
public class LeetCode014 {

    @Test
    public void test() {

        String[] strs = {"aa", "a"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);

    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length ==0) return "";
        String result = "";
        int i = 0;
        String s0 = strs[0];
        while (true) {
            if (i >= s0.length()) {
                break;
            }
            char ch = s0.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                String sj = strs[j];
                if (i >= sj.length()) {
                    return result;
                }
                if (ch != sj.charAt(i)) {
                    return result;
                }
            }
            result += ch;
            i++;
        }
        return result;
    }

}
