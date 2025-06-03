/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ModelUtils {
    private ModelUtils() {
    }

    public static <T> List<T> getSafeList(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public static <K, V> Map<K, V> getSafeMap(Map<K, V> map) {
        if (map == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(map);
    }
}

