/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.K0;
import com.yandex.metrica.impl.ob.j0;

public class k1 {
    @NonNull
    private final K0 a;
    @NonNull
    private final j0 b;

    public k1(@NonNull K0 k02) {
        this(k02, new j0(k02));
    }

    @VisibleForTesting
    public k1(@NonNull K0 k02, @NonNull j0 j02) {
        this.a = k02;
        this.b = j02;
    }

    @NonNull
    public j0 a() {
        return this.b;
    }

    @NonNull
    public K0 b() {
        return this.a;
    }
}

