package com.uzhizhe.leetcode;

import org.junit.Test;

/**
 * @author qingjiang.li
 * @since 2019-07-08 10:06 AM
 */
public class LeetCode4 {

    @Test
    public void test() {
        //        int[] num1 = new int[] { 1, 2 };
        //        int[] num2 = new int[] { 3, 4 };

        int[] num1 = new int[] { 1, 2, 3 };
        int[] num2 = new int[] { 1,2,3,4};
        double result = findMedianSortedArrays(num1, num2);
        System.out.println(result);

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;

        if (len1 <= 0) {
            int index = len2 / 2;
            if (len2 % 2 == 0) {
                return (nums2[index] + nums2[index - 1]) / 2.0;
            }
            return nums2[index];
        }
        if (len2 <= 0) {
            int index = len1 / 2;
            if (len1 % 2 == 0) {
                return (nums1[index] + nums1[index - 1]) / 2.0;
            }
            return nums1[index];
        }

        int len3 = len1 + len2;
        int i1 = 0;
        int i2 = 0;
        if (len3 % 2 == 0) {

        } else {
            for (int i = 0; i < len3 / 2; i++) {
                if (nums1[i1] <= nums2[i2]) {
                    if (i1 < len1 - 1) {
                        i1++;
                    } else {
                        i2++;
                    }
                }else if(nums1[i1] > nums2[i2]){
                    if (i2 < len2 - 1) {
                        i2++;
                    } else {
                        i1++;
                    }
                }
            }
            System.out.println("i1=" + i1 + ", i2=" + i2);
            return nums1[i1] >= nums2[i2] ? nums1[i1] : nums2[i2];
        }

        return result;
    }
}
