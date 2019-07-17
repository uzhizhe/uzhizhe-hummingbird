package com.uzhizhe.guava;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import org.junit.Test;

/**
 * @author qingjiang.li
 * @since 2019-07-15 3:30 PM
 */
public class StringsTest {

    @Test
    public void test1() {
        int i = 2;
        Preconditions.checkArgument(i % 2 == 0, "Number %s 不是一个偶数", i);

        String s = null;
        Preconditions.checkNotNull(s, "%s is null", "abc");


    }


    @Test
    public void test() {

        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.isNullOrEmpty(null));
        System.out.println("==");
        System.out.println(Strings.nullToEmpty(null));
        System.out.println(Strings.nullToEmpty("jiang"));
        System.out.println(Strings.nullToEmpty(""));
        System.out.println(Strings.nullToEmpty(" "));
        System.out.println("==");
        System.out.println(Strings.emptyToNull(""));
        System.out.println(Strings.emptyToNull(" "));
        System.out.println(Strings.emptyToNull("jiang"));
        System.out.println("==");
        System.out.println(Strings.commonPrefix("aaabbc", "aaabc"));
        System.out.println(Strings.commonPrefix("abc", "adeee"));
        System.out.println(Strings.commonPrefix("abc", "def"));
        System.out.println("==");
        System.out.println(Strings.commonSuffix("abbccd", "bbccd"));
        System.out.println(Strings.commonSuffix("abc", "cdec"));
        System.out.println(Strings.commonSuffix("abc", "dev"));

    }

}
