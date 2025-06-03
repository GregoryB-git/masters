/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.A2
 *  com.yandex.metrica.impl.ob.in
 *  com.yandex.metrica.impl.ob.jn
 *  com.yandex.metrica.impl.ob.mn
 *  com.yandex.metrica.impl.ob.mn$a
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.in;
import com.yandex.metrica.impl.ob.jn;
import com.yandex.metrica.impl.ob.mn;
import java.util.HashMap;
import java.util.Map;

public class dn<T, R>
implements in<T, R> {
    @NonNull
    private final Map<T, jn<R>> a;

    public dn(@NonNull Map<T, jn<R>> map) {
        this.a = A2.d(map);
    }

    @NonNull
    public mn<Map<T, R>> a(@NonNull Map<T, R> iterator) {
        mn.a.values();
        int[] nArray = new int[3];
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : iterator.entrySet()) {
            jn jn2 = (jn)this.a.get(entry.getKey());
            if (jn2 == null) continue;
            jn2 = jn2.get(entry.getValue());
            int n2 = jn2.a.ordinal();
            nArray[n2] = nArray[n2] + 1;
            hashMap.put(entry.getKey(), jn2.b);
        }
        iterator = mn.a.a;
        if (nArray[0] > 0) {
            return new mn((mn.a)iterator, (Object)hashMap);
        }
        iterator = mn.a.c;
        if (nArray[2] > 0) {
            return new mn((mn.a)iterator, (Object)hashMap);
        }
        return new mn(mn.a.b, (Object)hashMap);
    }
}

