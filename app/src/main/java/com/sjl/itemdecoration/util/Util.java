package com.sjl.itemdecoration.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Util
 *
 * @author 林zero
 * @date 2018/11/20
 */
public class Util {

    public static List<String> buildList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add("item" + i);
        }
        return list;
    }
    public static List<String> buildList(int size) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("item" + i);
        }
        return list;
    }
}
