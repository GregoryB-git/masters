/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Y8
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.H2;
import com.yandex.metrica.impl.ob.J0;
import com.yandex.metrica.impl.ob.Pc;
import com.yandex.metrica.impl.ob.Qb;
import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.x2;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Qc
implements J0 {
    @NonNull
    private final Y8 a;
    @NonNull
    private final x2 b;
    @Nullable
    private Qb c;
    @NonNull
    private final H2 d;
    @NonNull
    private final TimeProvider e;
    @NonNull
    private final a f;
    @NonNull
    private final Pc g;

    public Qc(@NonNull Context context, @Nullable Qb qb2) {
        this(qb2, H2.a(context));
    }

    @VisibleForTesting
    public Qc(@NonNull H2 h22, @NonNull Y8 y8, @NonNull x2 x22, @NonNull TimeProvider timeProvider, @NonNull a a2, @Nullable Qb qb2, @NonNull Pc pc) {
        this.d = h22;
        this.a = y8;
        this.b = x22;
        this.f = a2;
        this.c = qb2;
        this.e = timeProvider;
        this.g = pc;
    }

    private Qc(@Nullable Qb qb2, @NonNull H2 h22) {
        this(h22, F0.g().s(), new x2(), new SystemTimeProvider(), new Object(){}, qb2, new Pc(null, h22.a()));
    }

    @Override
    public void a() {
        Qb qb2 = this.c;
        if (qb2 != null && qb2.a.a) {
            this.g.a(this.d.b());
        }
    }

    public void a(@Nullable Qb qb2) {
        if (!A2.a(this.c, (Object)qb2)) {
            this.c = qb2;
            if (qb2 != null && qb2.a.a) {
                this.g.a(this.d.b());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        Qb qb2 = this.c;
        if (qb2 == null) return;
        if (qb2.b == null) return;
        if (!this.b.b(this.a.f(0L), this.c.b.b, "last wifi scan attempt time")) return;
        this.f.getClass();
        qb2 = new CountDownLatch(1);
        if (!this.d.a((CountDownLatch)qb2, this.g)) return;
        this.a.k(this.e.currentTimeSeconds());
        try {
            qb2.await(5L, TimeUnit.SECONDS);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

