/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.Ok
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.TreeSet
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Ok;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class ek {
    @NonNull
    private final Map<Float, Integer> a = new HashMap();

    public ek(@NonNull TreeSet<Float> f2) {
        Iterator iterator = f2.descendingSet().iterator();
        int n4 = 0;
        while (iterator.hasNext()) {
            f2 = (Float)iterator.next();
            this.a.put((Object)f2, (Object)n4);
            ++n4;
        }
    }

    public void a(@NonNull Ok ok2) {
        ok2.s = (Integer)this.a.get((Object)ok2.m);
    }
}

