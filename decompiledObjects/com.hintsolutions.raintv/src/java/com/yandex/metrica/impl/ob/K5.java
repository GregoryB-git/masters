/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.J4
 *  com.yandex.metrica.impl.ob.K4
 *  com.yandex.metrica.impl.ob.L4
 *  com.yandex.metrica.impl.ob.X4
 *  com.yandex.metrica.impl.ob.c0
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.J4;
import com.yandex.metrica.impl.ob.K4;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.L4;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.c0;

public class k5
extends X4 {
    private final L4<X4, L3> b;

    public k5(L3 l32) {
        super(l32);
        this.b = new L4((K4)new J4(l32), l32);
    }

    public boolean a(@NonNull c0 c02) {
        return this.b.a(c02);
    }
}

