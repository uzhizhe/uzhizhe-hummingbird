package com.uzhizhe.leetcode;

import com.uzhizhe.leetcode.node.ListNode;
import org.junit.Test;

/**
 * Desc: 合并两个有序链表
 * Author: qingjiang.li
 * Email: qing_jiang_li@163.com
 * Date: 2019/7/20
 */
public class LeetCode021 {

    @Test
    public void test() {
        ListNode l1 = null;//new ListNode(1);
        ListNode l2 = null;//new ListNode(1);

        ListNode l1_2 = new ListNode(2);
        ListNode l1_4 = new ListNode(4);

        ListNode l2_3 = new ListNode(3);
        ListNode l2_4 = new ListNode(4);

//        l1.next = l1_2;
//        l1_2.next = l1_4;
//
//        l2.next = l2_3;
//        l2_3.next = l2_4;


        printListNode(l1);
        printListNode(l2);

        ListNode listNode = mergeTwoLists(l1, l2);
        printListNode(listNode);


    }

    private void printListNode(ListNode ln) {
        if (ln == null) {
            return;
        }
        while (ln.getNext() != null) {
            System.out.print(ln.getVal() + "->");
            ln = ln.getNext();
        }
        if (ln != null) {
            System.out.println(ln.getVal());
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ListNode head = ln;
        int v1 = 0;
        int v2 = 0;
        int max = Integer.MAX_VALUE;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                v1 = l1.getVal();
            } else {
                v1 = max;
            }
            if (l2 != null) {
                v2 = l2.getVal();
            } else {
                v2 = max;
            }
            ln.setNext(v1 <= v2 ? l1 : l2);
            ln = ln.getNext();

            if (v1 <= v2) {
                l1 = l1.getNext();
            } else {
                l2 = l2.getNext();
            }
        }

        return head.getNext();
    }


}


