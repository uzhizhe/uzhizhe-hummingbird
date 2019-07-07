package com.uzhizhe.leetcode;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author qingjiang.li
 * @since 2019-07-04 11:56 AM
 */
public class StrMethod {

    @Test
    public void test2() {

        //                String str = "11aaa123abc45e3f33ff";
        //                List<Integer> list = getIntByString2(str);
        //                System.out.println(list);
        //
        //                List<Integer> list2 = getIntByString3(str);
        //                System.out.println(list2);

        //        String s0 = "abcabcbb";
        //        String s1 = " ";
        //        String s2 = "pwwekw";
        //        String s3 = "abba";
        //        int length = lengthOfLongestSubstring(s0);
        //        System.out.println(length);
        //        length = lengthOfLongestSubstring(s1);
        //        System.out.println(length);
        //        length = lengthOfLongestSubstring(s2);
        //        System.out.println(length);
        //        length = lengthOfLongestSubstring(s3);
        //        System.out.println(length);

        //        int candies = 7;
        //        int num = 4;
        //        //[5,2,3]
        //        int[] ints = distributeCandies(candies, num);
        //        System.out.println(JSON.toJSONString(ints));

        //        List<Integer> result = pathInZigZagTree(100);
        //        System.out.println(JSON.toJSONString(result));

        //        List<Integer> result = pathInZigZagTree2(18);
        //        System.out.println(JSON.toJSONString(result));

        //        ListNode node1 = new ListNode(9);
        //        ListNode node2 = new ListNode(8);
        //        ListNode node3 = new ListNode(3);
        //node1.next = node2;
        //        node2.next = node3;

        //ListNode node4 = new ListNode(1);
        //ListNode node5 = new ListNode(6);
        //ListNode node6 = new ListNode(4);
        //node4.next = node5;
        //node5.next = node6;

        //        ListNode listNode = addTwoNumbers(node1, node4);
        //        while (listNode != null) {
        //            System.out.println(listNode.val);
        //            listNode = listNode.next;
        //        }

        String s = "[{()}(])";
        boolean valid = isValid(s);
        System.out.println(valid);

    }

    public boolean isValid(String s) {
        if (s == null || s.length() <= 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                Character peek = stack.peek();
                if (isMatch(peek, ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.empty();
    }

    public boolean isMatch(Character ch1, Character ch2) {
        if (Objects.equals(ch1, '(') && Objects.equals(ch2, ')')) {
            return true;
        }
        if (Objects.equals(ch1, '[') && Objects.equals(ch2, ']')) {
            return true;
        }

        if (Objects.equals(ch1, '{') && Objects.equals(ch2, '}')) {
            return true;
        }

        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode last = result;
        int a3 = 0;
        int a1 = 0;
        int a2 = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                a1 = l1.val;
                l1 = l1.next;
            } else {
                a1 = 0;
            }

            if (l2 != null) {
                a2 = l2.val;
                l2 = l2.next;
            } else {
                a2 = 0;
            }
            int sum = a1 + a2 + a3;
            if (sum > 9) {
                a3 = 1;
                sum = sum - 10;
            } else {
                a3 = 0;
            }

            ListNode newNode = new ListNode(sum);
            last.next = newNode;
            last = newNode;
        }

        if (a3 == 1) {
            ListNode newNode = new ListNode(a3);
            last.next = newNode;
        }

        return result.next;
    }

    @Test
    public void test3() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node1);
        TreeNode node3 = new TreeNode(3, node1);
        TreeNode node4 = new TreeNode(4, node3);
        TreeNode node5 = new TreeNode(5, node3);
        TreeNode node6 = new TreeNode(6, node2);
        TreeNode node7 = new TreeNode(7, node2);
        TreeNode node8 = new TreeNode(8, node7);
        TreeNode node9 = new TreeNode(9, node7);
        TreeNode node10 = new TreeNode(10, node6);
        TreeNode node11 = new TreeNode(11, node6);
        TreeNode node12 = new TreeNode(12, node5);
        TreeNode node13 = new TreeNode(13, node5);
        TreeNode node14 = new TreeNode(14, node4);
        TreeNode node15 = new TreeNode(15, node4);

        node1.left = node3;
        node1.right = node2;

        node2.left = node6;
        node2.right = node7;
        node3.left = node4;
        node3.right = node5;

        node7.right = node8;
        node7.left = node9;
        node6.right = node10;
        node6.left = node11;
        node5.left = node12;
        node5.right = node13;
        node4.right = node14;
        node4.left = node15;

        printTree(node1);

    }

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode parrent;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parrent = null;
        }

        public TreeNode(int value, TreeNode node) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parrent = node;
        }

        public TreeNode(int value, TreeNode parrent, TreeNode left, TreeNode right) {
            this.value = value;
            this.parrent = parrent;
            this.left = left;
            this.right = right;
        }

    }

    public List<Integer> pathInZigZagTree2(int label) {
        LinkedList<Integer> result = new LinkedList<>();
        result.addFirst(label);

        int num = 1;
        int s = 1;
        int e = 1;
        while (label > e) {
            num++;
            s = e + 1;
            e = (s << 1) - 1;
        }

        while (--num > 0) {
            int parrent = s - (label - s) / 2 - 1;
            result.addFirst(parrent);
            label = parrent;
            s = s >> 1;
        }

        return result;
    }

    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> result = new LinkedList<>();
        int n = label;
        int oldStart = 1;
        int oldEnd = 1;
        int currStart = 1;
        int currEnd = 1;
        TreeNode rootNode = new TreeNode(1);
        Map<Integer, TreeNode> map = new HashMap<>();
        map.put(rootNode.value, rootNode);
        boolean flag = false;
        for (; ; ) {
            currStart = oldStart << 1;
            currEnd = (currStart << 1) - 1;
            //System.out.println(String.format("oldStart=%d, oldEnd=%d", oldStart, oldEnd));
            //System.out.println(String.format("currStart=%d, currEnd=%d", currStart, currEnd));
            for (int num1 = oldStart, num2 = oldEnd; num1 <= oldEnd; num1++, num2--) {
                TreeNode oldNode = map.get(num1);

                TreeNode leftNode = null;
                TreeNode rightNode = null;
                if (!flag) {
                    leftNode = new TreeNode(num2 * 2 + 1, oldNode);
                    rightNode = new TreeNode(num2 * 2, oldNode);
                } else {
                    leftNode = new TreeNode(num2 * 2, oldNode);
                    rightNode = new TreeNode(num2 * 2 + 1, oldNode);
                }

                oldNode.right = rightNode;
                oldNode.left = leftNode;

                map.put(leftNode.value, leftNode);
                map.put(rightNode.value, rightNode);
            }
            flag = !flag;

            if (currEnd >= n) {
                break;
            }

            oldStart = currStart;
            oldEnd = currEnd;
        }

        printTree(rootNode);

        TreeNode targetNode = map.get(n);
        while (targetNode.parrent != null) {
            result.addFirst(targetNode.value);
            targetNode = targetNode.parrent;
        }
        result.addFirst(1);

        return result;
    }

    public void printTree(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(rootNode);

        int lastValue = 1;
        int firstValue = 1;
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode first = ((LinkedList<TreeNode>) queue).pop();
            System.out.print(first.value + "\t");
            if (first.left != null) {
                queue.add(first.left);
            }
            if (first.right != null) {
                queue.add(first.right);
            }
            if (lastValue == first.value && !flag) {
                System.out.println();
                lastValue = ((lastValue + 1) << 1) - 1;
                firstValue = firstValue << 1;
                flag = !flag;
            }
            if (firstValue == first.value && flag) {
                System.out.println();
                lastValue = ((lastValue + 1) << 1) - 1;
                firstValue = firstValue << 1;
                flag = !flag;
            }
        }

    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        int max = 0;
        int chlen = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer chIndex = charMap.get(ch);
            if (chIndex == null) {
                chlen++;
                charMap.put(ch, i);
            } else {
                if (last > chIndex) {
                    chlen++;
                    charMap.put(ch, i);
                } else {
                    chlen = i - chIndex;
                    charMap.put(ch, i);
                    last = chIndex;
                }
            }
            max = Math.max(max, chlen);
        }

        return max;
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        for (int i = 1; ; i++) {
            int i1 = i % num_people;
            i1 = i1 == 0 ? num_people : i1;
            int i2 = result[i1 - 1];
            if (candies <= i) {
                result[i1 - 1] = i2 + candies;
                return result;
            } else {
                result[i1 - 1] = i2 + i;
                candies = candies - i;
            }
        }

    }

    public List<Integer> getIntByString3(String string) {
        List<Integer> result = new ArrayList<>();
        String numStr = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numStr += ch;
            } else {
                if (numStr.length() > 1) {
                    result.add(Integer.valueOf(numStr));
                }
                numStr = "";
            }
        }

        return result;
    }

    public List<Integer> getIntByString2(String str) {
        List<Integer> result = new ArrayList<>();
        String regEx = "[^0-9]";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str.trim());
        String s = matcher.replaceAll("-");
        String[] split = s.split("-");

        for (String ints : split) {
            if (ints != null && ints.length() > 1) {
                result.add(Integer.valueOf(ints));
            }
        }
        return result;
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
        if (p2 - p1 >= 1 && p2 == str.length() - 1) {
            String s = str.substring(p1, p2 + 1);
            list.add(Integer.valueOf(s));
        }

        return list;

    }

}
