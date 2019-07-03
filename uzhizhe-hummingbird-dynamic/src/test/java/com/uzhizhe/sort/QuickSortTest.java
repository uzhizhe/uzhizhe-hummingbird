package com.uzhizhe.sort;

import com.alibaba.fastjson.JSON;
import com.uzhizhe.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author qingjiang.li
 * @since 2019-07-02 2:52 PM
 */
public class QuickSortTest {

    @Test
    public void test3() {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(JSON.toJSONString(arr));
        Arrays.sort(arr);
        System.out.println(JSON.toJSONString(arr));




    }

    @Test
    public void test2(){
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(JSON.toJSONString(arr));
        ArrayUtil.QuickSort(arr, 0, arr.length - 1);
        System.out.println(JSON.toJSONString(arr));


    }


    @Test
    public void test() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i -1;
        }
        System.out.println(JSON.toJSONString(arr));
        ArrayUtil.QuickSort2(arr, 0, arr.length - 1);
        System.out.println(JSON.toJSONString(arr));

    }







}
