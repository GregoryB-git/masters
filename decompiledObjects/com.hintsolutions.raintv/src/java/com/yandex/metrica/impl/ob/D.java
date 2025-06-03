/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.billing_interface.g;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.l;
import com.yandex.metrica.impl.ob.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class d
implements o {
    @NonNull
    private final g a;

    public d() {
        this(new g());
    }

    public d(@NonNull g g2) {
        this.a = g2;
    }

    @Override
    @NonNull
    public Map<String, a> a(@NonNull i i2, @NonNull Map<String, a> map, @NonNull l l2) {
        HashMap hashMap = new HashMap();
        for (String string : map.keySet()) {
            a a2;
            a a3 = (a)map.get((Object)string);
            this.a.getClass();
            long l3 = System.currentTimeMillis();
            boolean bl2 = a3.a == e.a && !l2.a() ? l3 - a3.d <= TimeUnit.SECONDS.toMillis((long)i2.b) : (a2 = l2.a(a3.b)) == null || !a2.c.equals((Object)a3.c) || a3.a == e.b && l3 - a2.e >= TimeUnit.SECONDS.toMillis((long)i2.a);
            if (!bl2) continue;
            hashMap.put((Object)string, (Object)a3);
        }
        return hashMap;
    }
}

