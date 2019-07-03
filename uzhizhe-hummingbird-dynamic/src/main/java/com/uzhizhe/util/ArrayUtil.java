package com.uzhizhe.util;

/**
 * @author qingjiang.li
 * @since 2019-07-02 2:39 PM
 */
public final class ArrayUtil {

    private ArrayUtil() {}

    public static void QuickSort(int[] arr, int start, int end) {

        if (arr == null || start < 0 || end > arr.length) {
            throw new RuntimeException("param error");
        }
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int key = arr[i];
        while (i < j) {
            while (arr[j] > key && i < j) {
                j--;
            }
            arr[i] = arr[j];
            while (arr[i] < key && i < j) {
                i++;
            }
            arr[j] = arr[i];
        }

        arr[i] = key;

        QuickSort(arr, start, i - 1);
        QuickSort(arr, i + 1, end);
    }

    public static void QuickSort2(int[] arr, int start, int end) {

        if (arr == null || start < 0 || end > arr.length) {
            throw new RuntimeException("param error");
        }
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int key = arr[i];
        while (i < j) {
            while (arr[j] >= key && i < j) {
                j--;
            }

            while (arr[i] <= key && i < j) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        arr[start] = arr[i];
        arr[i] = key;

        QuickSort(arr, start, i - 1);
        QuickSort(arr, i + 1, end);
    }
}
