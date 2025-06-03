/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Sm;

abstract class Fm<T>
implements Sm<T> {
    private final int a;
    private final String b;
    @NonNull
    public final Pl c;

    public Fm(int n2, @NonNull String string2, @NonNull Pl pl2) {
        this.a = n2;
        this.b = string2;
        this.c = pl2;
    }

    @NonNull
    @VisibleForTesting(otherwise=3)
    public String a() {
        return this.b;
    }

    @VisibleForTesting(otherwise=3)
    public int b() {
        return this.a;
    }
}

