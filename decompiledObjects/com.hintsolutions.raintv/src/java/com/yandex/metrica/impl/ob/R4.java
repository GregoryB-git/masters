/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.D3
 *  com.yandex.metrica.impl.ob.X3
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.g4
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.X3;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.g4;

public class r4
extends g4 {
    public r4(@NonNull Context context, @NonNull X3 x3) {
        super(context, x3);
    }

    public void b(@NonNull c0 c02, @NonNull D3 d3) {
        Boolean bl = d3.b.e;
        Boolean bl2 = Boolean.FALSE;
        Boolean bl3 = bl;
        if (bl == null) {
            bl3 = bl2;
        }
        boolean bl4 = bl3;
        this.c().a(bl4);
        this.b().a(c02, d3);
    }
}

