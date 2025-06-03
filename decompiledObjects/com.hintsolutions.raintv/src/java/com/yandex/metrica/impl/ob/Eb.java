/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.G7;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.fb;
import com.yandex.metrica.impl.ob.gb;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class eb
implements fb,
gb {
    private final Set<Integer> a;
    private AtomicLong b;

    public eb(@NonNull G7 g72) {
        HashSet hashSet;
        this.a = hashSet = new HashSet();
        hashSet.add((Object)a1.P.b());
        hashSet.add((Object)a1.T.b());
        hashSet.add((Object)a1.d.b());
        hashSet.add((Object)a1.t.b());
        hashSet.add((Object)a1.z.b());
        g72.a(this);
        this.b = new AtomicLong(g72.a((Set<Integer>)hashSet));
    }

    @Override
    public void a(@NonNull List<Integer> iterator) {
        iterator = iterator.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            int n3 = (Integer)iterator.next();
            if (!this.a.contains((Object)n3)) continue;
            ++n2;
        }
        this.b.addAndGet((long)n2);
    }

    @Override
    public boolean a() {
        boolean bl2 = this.b.get() > 0L;
        return bl2;
    }

    @Override
    public void b(@NonNull List<Integer> iterator) {
        iterator = iterator.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            int n3 = (Integer)iterator.next();
            if (!this.a.contains((Object)n3)) continue;
            ++n2;
        }
        this.b.addAndGet((long)(-n2));
    }
}

