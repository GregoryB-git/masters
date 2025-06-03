/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Nd
 *  com.yandex.metrica.impl.ob.Sl
 *  com.yandex.metrica.impl.ob.v3
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Nd;
import com.yandex.metrica.impl.ob.Q0;
import com.yandex.metrica.impl.ob.Sl;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.ma;
import com.yandex.metrica.impl.ob.na;
import com.yandex.metrica.impl.ob.v3;

public class sa {
    @NonNull
    private final ma<Nd> a;
    @NonNull
    private final ma<v3> b;

    public sa(@NonNull Context context) {
        this(context, new na());
    }

    @VisibleForTesting
    public sa(@NonNull Context context, @NonNull na na2) {
        this.a = na2.c(context, (Q0)Sl.c());
        this.b = na2.b(context, (Q0)Sl.c());
    }

    public void a(@NonNull ci ci2) {
        this.a.a((Nd)F0.g().k().a(), ci2.l());
        this.b.a((v3)F0.g().d().a(), ci2.l());
    }
}

