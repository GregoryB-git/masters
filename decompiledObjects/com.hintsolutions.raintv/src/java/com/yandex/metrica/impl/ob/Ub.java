/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.yandex.metrica.impl.ob.ub$a
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.appsetid.c;
import com.yandex.metrica.appsetid.d;
import com.yandex.metrica.impl.ob.tb;
import com.yandex.metrica.impl.ob.ub;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class ub {
    private volatile tb a;
    private CountDownLatch b;
    private final long c;
    private final com.yandex.metrica.appsetid.a d;
    private final Context e;
    private final d f;

    @VisibleForTesting
    public ub(@NotNull Context context, @NotNull d d4) {
        this.e = context;
        this.f = d4;
        this.b = new CountDownLatch(1);
        this.c = 20L;
        this.d = new a(this);
    }

    public static final /* synthetic */ CountDownLatch a(ub ub2) {
        return ub2.b;
    }

    public static final /* synthetic */ void a(ub ub2, tb tb2) {
        ub2.a = tb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @WorkerThread
    @NotNull
    public final tb a() {
        ub ub2 = this;
        synchronized (ub2) {
            tb tb2 = this.a;
            if (tb2 == null) {
                try {
                    tb2 = new CountDownLatch(1);
                    this.b = tb2;
                    this.f.a(this.e, this.d);
                    this.b.await(this.c, TimeUnit.SECONDS);
                }
                catch (Throwable throwable) {}
            }
            if ((tb2 = this.a) == null) {
                this.a = tb2 = new tb(null, com.yandex.metrica.appsetid.c.b);
            }
            return tb2;
        }
    }
}

