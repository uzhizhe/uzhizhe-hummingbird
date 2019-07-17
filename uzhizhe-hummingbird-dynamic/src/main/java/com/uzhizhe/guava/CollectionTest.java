package com.uzhizhe.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author qingjiang.li
 * @since 2019-07-15 3:00 PM
 */
public class CollectionTest {



    @Test
    public void test() {
        List<String> list = Lists.newArrayList("aaa", "bbb", "ccc");
        list.add("abc");
        list.add("ced");

        Set<String> set = Sets.newHashSet("aaa", "bbb", "ccc", "ccc", "ddd" ,"bbb");

        System.out.println(set);

        System.out.println(list.toString());
    }


}
