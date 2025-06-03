/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.metrica.impl.ob.c
 *  com.yandex.metrica.impl.ob.d
 *  com.yandex.metrica.impl.ob.f
 *  com.yandex.metrica.impl.ob.g3
 *  com.yandex.metrica.impl.ob.h
 *  java.lang.Object
 *  java.util.concurrent.Executor
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.b;
import com.yandex.metrica.impl.ob.c;
import com.yandex.metrica.impl.ob.d;
import com.yandex.metrica.impl.ob.f;
import com.yandex.metrica.impl.ob.g3;
import com.yandex.metrica.impl.ob.h;
import com.yandex.metrica.impl.ob.k;
import com.yandex.metrica.impl.ob.l;
import com.yandex.metrica.impl.ob.m;
import com.yandex.metrica.impl.ob.n;
import com.yandex.metrica.impl.ob.o;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

public final class d3 {
    @NotNull
    public final k a(@NotNull Context object, @NotNull Executor executor, @NotNull Executor executor2, @NotNull b b2, @NotNull n n4, @NotNull m m5) {
        int n5 = b2.ordinal();
        object = n5 != 0 ? (n5 != 1 ? new g3() : new com.yandex.metrica.billing.v4.library.c((Context)object, executor, executor2, n4, m5, (l)new f(n4), (o)new h(null, 1))) : new com.yandex.metrica.billing.v3.library.c((Context)object, executor, executor2, (l)new c(n4), (o)new d(), m5);
        return object;
    }
}

