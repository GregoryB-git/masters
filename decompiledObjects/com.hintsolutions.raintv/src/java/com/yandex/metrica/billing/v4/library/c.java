/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.j
 *  com.yandex.metrica.impl.ob.k
 *  com.yandex.metrica.impl.ob.l
 *  com.yandex.metrica.impl.ob.m
 *  com.yandex.metrica.impl.ob.n
 *  com.yandex.metrica.impl.ob.o
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.billing.v4.library;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl;
import com.yandex.metrica.billing.v4.library.PurchasesUpdatedListenerImpl;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.j;
import com.yandex.metrica.impl.ob.k;
import com.yandex.metrica.impl.ob.l;
import com.yandex.metrica.impl.ob.m;
import com.yandex.metrica.impl.ob.n;
import com.yandex.metrica.impl.ob.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c
implements k,
j {
    private i a;
    private final Context b;
    private final Executor c;
    private final Executor d;
    private final m e;
    private final l f;
    private final o g;

    public c(@NotNull Context context, @NotNull Executor executor, @NotNull Executor executor2, @NotNull n n4, @NotNull m m5, @NotNull l l4, @NotNull o o3) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)executor, (String)"workerExecutor");
        Intrinsics.checkNotNullParameter((Object)executor2, (String)"uiExecutor");
        Intrinsics.checkNotNullParameter((Object)n4, (String)"billingInfoStorage");
        Intrinsics.checkNotNullParameter((Object)m5, (String)"billingInfoSender");
        Intrinsics.checkNotNullParameter((Object)l4, (String)"billingInfoManager");
        Intrinsics.checkNotNullParameter((Object)o3, (String)"updatePolicy");
        this.b = context;
        this.c = executor;
        this.d = executor2;
        this.e = m5;
        this.f = l4;
        this.g = o3;
    }

    @NotNull
    public Executor a() {
        return this.c;
    }

    public void a(@Nullable i i2) {
        c c3 = this;
        synchronized (c3) {
            this.a = i2;
            return;
        }
    }

    @WorkerThread
    public void b() {
        i i2 = this.a;
        if (i2 != null) {
            this.d.execute((Runnable)new f(this, i2){
                public final c a;
                public final i b;
                {
                    this.a = c3;
                    this.b = i2;
                }

                @Override
                public void a() {
                    BillingClient billingClient = BillingClient.newBuilder((Context)this.a.b).setListener((PurchasesUpdatedListener)new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
                    Intrinsics.checkNotNullExpressionValue((Object)billingClient, (String)"BillingClient\n          \u2026                 .build()");
                    billingClient.startConnection((BillingClientStateListener)new BillingClientStateListenerImpl(this.b, billingClient, this.a));
                }
            });
        }
    }

    @NotNull
    public Executor c() {
        return this.d;
    }

    @NotNull
    public m d() {
        return this.e;
    }

    @NotNull
    public l e() {
        return this.f;
    }

    @NotNull
    public o f() {
        return this.g;
    }
}

