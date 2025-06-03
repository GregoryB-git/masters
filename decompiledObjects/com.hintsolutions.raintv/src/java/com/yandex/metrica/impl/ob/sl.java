/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.Y8
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Q0;
import com.yandex.metrica.impl.ob.Sl;
import com.yandex.metrica.impl.ob.Y8;
import java.util.concurrent.TimeUnit;

public class Sl
implements Q0 {
    private volatile long a;
    private Y8 b;
    private TimeProvider c;

    private Sl() {
    }

    public /* synthetic */ Sl(a a2) {
        this();
    }

    public static Sl c() {
        return com.yandex.metrica.impl.ob.Sl$b.a;
    }

    @Override
    public long a() {
        Sl sl = this;
        synchronized (sl) {
            long l4 = this.a;
            return l4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(long l4, @Nullable Long l6) {
        Sl sl = this;
        synchronized (sl) {
            this.a = (l4 - this.c.currentTimeMillis()) / 1000L;
            Y8 y8 = this.b;
            boolean bl = true;
            if (y8.a(true)) {
                if (l6 != null) {
                    l4 = Math.abs((long)(l4 - this.c.currentTimeMillis()));
                    y8 = this.b;
                    if (l4 <= TimeUnit.SECONDS.toMillis(l6.longValue())) {
                        bl = false;
                    }
                    y8.c(bl);
                } else {
                    this.b.c(false);
                }
            }
            this.b.l(this.a);
            this.b.d();
            return;
        }
    }

    public void b() {
        Sl sl = this;
        synchronized (sl) {
            this.b.c(false);
            this.b.d();
            return;
        }
    }

    public void d() {
        Sl sl = this;
        synchronized (sl) {
            Y8 y8 = F0.g().s();
            SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
            this.b = y8;
            this.a = y8.b(0);
            this.c = systemTimeProvider;
            return;
        }
    }

    public boolean e() {
        Sl sl = this;
        synchronized (sl) {
            boolean bl = this.b.a(true);
            return bl;
        }
    }
}

