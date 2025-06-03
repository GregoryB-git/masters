/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package ru.tvrain.core.utils;

import java.util.List;

public class ListUtils {
    public static int getListSize(List list) {
        if (ListUtils.isEmptyList(list)) {
            return 0;
        }
        return list.size();
    }

    public static boolean isEmptyList(List list) {
        boolean bl = list == null || list.isEmpty();
        return bl;
    }
}

