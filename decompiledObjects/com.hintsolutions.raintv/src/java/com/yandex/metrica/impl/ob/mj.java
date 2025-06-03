/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Hj
 *  com.yandex.metrica.impl.ob.ej
 *  com.yandex.metrica.impl.ob.hj
 *  com.yandex.metrica.impl.ob.jj
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Gj;
import com.yandex.metrica.impl.ob.Hj;
import com.yandex.metrica.impl.ob.Lj;
import com.yandex.metrica.impl.ob.ej;
import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.jj;
import java.util.List;

public final class Mj {
    @NonNull
    private final List<Gj> a;
    @Nullable
    private final hj b;
    private final int c;

    public Mj(@NonNull Lj<hj> lj, @NonNull Lj<List<Gj>> lj2, @NonNull Lj<Integer> lj3) {
        this.b = (hj)((jj)lj).b();
        this.a = (List)((Hj)lj2).b();
        this.c = (Integer)((ej)lj3).a();
    }

    @NonNull
    public int a() {
        return this.c;
    }

    @Nullable
    public hj b() {
        return this.b;
    }

    @NonNull
    public List<Gj> c() {
        return this.a;
    }
}

