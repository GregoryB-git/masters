/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.O0;
import com.yandex.metrica.impl.ob.R0;
import com.yandex.metrica.impl.ob.y2;

public class i1
extends y2 {
    @NonNull
    private final i c;

    public i1(@NonNull O0 o0, @NonNull i i2) {
        super(o0, i2.apiKey);
        this.c = i2;
    }

    @Override
    @NonNull
    public R0 a() {
        return this.b.b().a(this.c);
    }
}

