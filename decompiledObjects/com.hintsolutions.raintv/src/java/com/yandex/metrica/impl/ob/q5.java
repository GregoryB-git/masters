/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.d6
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.T5;
import com.yandex.metrica.impl.ob.U5;
import com.yandex.metrica.impl.ob.V5;
import com.yandex.metrica.impl.ob.W5;
import com.yandex.metrica.impl.ob.Y5;
import com.yandex.metrica.impl.ob.Z5;
import com.yandex.metrica.impl.ob.c6;
import com.yandex.metrica.impl.ob.d6;
import java.util.concurrent.TimeUnit;

public abstract class Q5
implements T5<V5> {
    private final L3 a;
    @NonNull
    private final Z5 b;
    private final d6 c;
    private final Y5 d;
    @NonNull
    private final M0 e;
    @NonNull
    private final SystemTimeProvider f;

    public Q5(@NonNull L3 l32, @NonNull Z5 z52, @NonNull d6 d62, @NonNull Y5 y52, @NonNull M0 m0, @NonNull SystemTimeProvider systemTimeProvider) {
        this.a = l32;
        this.b = z52;
        this.c = d62;
        this.d = y52;
        this.e = m0;
        this.f = systemTimeProvider;
    }

    @NonNull
    public U5 a(@NonNull Object object) {
        V5 v52 = (V5)object;
        if (this.c.h()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        L3 l32 = this.a;
        d6 d62 = this.c;
        long l4 = this.b.a();
        d6 d63 = this.c.d(l4);
        object = TimeUnit.MILLISECONDS;
        d63.e(object.toSeconds(v52.a)).a(v52.a).c(0L).a(true).b();
        this.a.i().a(l4, this.d.b(), object.toSeconds(v52.b));
        return new U5(l32, (c6)d62, this.a(), new SystemTimeProvider());
    }

    @NonNull
    @VisibleForTesting
    public W5 a() {
        W5.b b3 = new W5.b(this.d, null).a(this.c.i()).b(this.c.e()).a(this.c.c()).c(this.c.f()).d(this.c.g());
        b3.a = this.c.d();
        return new W5(b3, null);
    }

    @Nullable
    public final U5 b() {
        if (this.c.h()) {
            return new U5(this.a, (c6)this.c, this.a(), this.f);
        }
        return null;
    }
}

