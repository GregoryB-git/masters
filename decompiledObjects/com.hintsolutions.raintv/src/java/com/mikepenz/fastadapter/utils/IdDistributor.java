/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.mikepenz.fastadapter.utils;

import androidx.annotation.NonNull;
import com.mikepenz.fastadapter.IIdentifyable;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class IdDistributor {
    private static final AtomicLong idDistributor = new AtomicLong(9000000000000000000L);

    public static <T extends IIdentifyable> T checkId(@NonNull T t) {
        if (t.getIdentifier() == -1L) {
            t.withIdentifier(idDistributor.incrementAndGet());
        }
        return t;
    }

    public static <T extends IIdentifyable> List<T> checkIds(@NonNull List<T> list) {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            IdDistributor.checkId((IIdentifyable)list.get(i));
        }
        return list;
    }

    public static <T extends IIdentifyable> T[] checkIds(T ... TArray) {
        int n = TArray.length;
        for (int i = 0; i < n; ++i) {
            IdDistributor.checkId(TArray[i]);
        }
        return TArray;
    }
}

