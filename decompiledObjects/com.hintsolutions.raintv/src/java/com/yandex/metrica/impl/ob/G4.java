/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.Oc;
import com.yandex.metrica.impl.ob.X3;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.k4;
import com.yandex.metrica.impl.ob.oc;

public abstract class g4
implements k4 {
    @NonNull
    private final X3 a;
    @NonNull
    private final Oc b;

    public g4(@NonNull Context context, @NonNull X3 x32) {
        this(context, x32, new Oc(oc.a(context), H2.a(context), F0.g().s()));
    }

    @VisibleForTesting
    public g4(@NonNull Context context, @NonNull X3 x32, @NonNull Oc oc2) {
        context.getApplicationContext();
        this.a = x32;
        this.b = oc2;
        x32.a(this);
        oc2.a(this);
    }

    @Override
    public void a() {
        this.a.b(this);
        this.b.b(this);
    }

    @Override
    public void a(@NonNull c0 c02, @NonNull D3 d3) {
        this.b(c02, d3);
    }

    @NonNull
    public X3 b() {
        return this.a;
    }

    public abstract void b(@NonNull c0 var1, @NonNull D3 var2);

    @NonNull
    public Oc c() {
        return this.b;
    }
}

