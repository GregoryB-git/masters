/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.G7;
import com.yandex.metrica.impl.ob.Z3;
import com.yandex.metrica.impl.ob.fb;
import com.yandex.metrica.impl.ob.gb;
import com.yandex.metrica.impl.ob.yg;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class jb
implements fb,
gb {
    @NonNull
    private final Z3 a;
    private AtomicLong b;

    public jb(@NonNull G7 g72, @NonNull Z3 z32) {
        this.a = z32;
        this.b = new AtomicLong(g72.c());
        g72.a(this);
    }

    @Override
    public void a(@NonNull List<Integer> list) {
        this.b.addAndGet((long)list.size());
    }

    @Override
    public boolean a() {
        boolean bl2 = this.b.get() >= (long)((yg)this.a.b()).I();
        return bl2;
    }

    @Override
    public void b(@NonNull List<Integer> list) {
        this.b.addAndGet((long)(-list.size()));
    }
}

