/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.D5;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.w5;
import java.util.List;

public class F5
extends w5<X4> {
    private final X4 b;

    public F5(D5 d5, X4 x4) {
        super(d5);
        this.b = x4;
    }

    @Override
    public void a(@NonNull List<X4> list) {
        list.add((Object)this.b);
    }
}

