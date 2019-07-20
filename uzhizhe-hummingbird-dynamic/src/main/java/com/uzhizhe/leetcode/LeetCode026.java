package com.uzhizhe.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * Desc: 删除排序数组中的重复项
 * Author: qingjiang.li
 * Email: qing_jiang_li@163.com
 * Date: 2019/7/20
 */
public class LeetCode026 {

    @Test
    public void test() {
        int [] nums = {1,1,1,1};
        System.out.println(JSON.toJSONString(nums));
        int len = removeDuplicates(nums);
        System.out.println(JSON.toJSONString(nums));

        System.out.println(len);

    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l1 = 0;
        int l2 = 0;
        for (; l2 < nums.length; l2++) {
            int v1 = nums[l1];
            int v2 = nums[l2];
            if (v1 != v2) {
                l1++;
                nums[l1] = v2;
            }
        }
        return l1+1;
    }

}
