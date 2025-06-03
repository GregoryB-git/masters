/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.S4;

public abstract class X4
implements S4 {
    private final L3 a;

    public X4(@NonNull L3 l32) {
        this.a = l32;
    }

    @NonNull
    public L3 a() {
        return this.a;
    }
}

