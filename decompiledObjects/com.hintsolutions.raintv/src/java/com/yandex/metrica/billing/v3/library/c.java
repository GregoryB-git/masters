/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.j
 *  com.yandex.metrica.impl.ob.k
 *  com.yandex.metrica.impl.ob.l
 *  com.yandex.metrica.impl.ob.m
 *  com.yandex.metrica.impl.ob.o
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package com.yandex.metrica.billing.v3.library;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl;
import com.yandex.metrica.billing.v3.library.PurchasesUpdatedListenerImpl;
import com.yandex.metrica.billing.v3.library.b;
import com.yandex.metrica.billing_interface.f;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.j;
import com.yandex.metrica.impl.ob.k;
import com.yandex.metrica.impl.ob.l;
import com.yandex.metrica.impl.ob.m;
import com.yandex.metrica.impl.ob.o;
import java.util.concurrent.Executor;

public class c
implements k,
j {
    @NonNull
    private final Context a;
    @NonNull
    private final Executor b;
    @NonNull
    private final Executor c;
    @NonNull
    private final l d;
    @NonNull
    private final o e;
    @NonNull
    private final m f;
    @Nullable
    private i g;

    public c(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull l l4, @NonNull o o3, @NonNull m m5) {
        this.a = context;
        this.b = executor;
        this.c = executor2;
        this.d = l4;
        this.e = o3;
        this.f = m5;
    }

    @NonNull
    public Executor a() {
        return this.b;
    }

    public void a(@Nullable i i2) {
        c c3 = this;
        synchronized (c3) {
            this.g = i2;
            return;
        }
    }

    @WorkerThread
    public void b() throws Throwable {
        i i2 = this.g;
        if (i2 != null) {
            this.c.execute((Runnable)new f(this, i2){
                public final i a;
                public final c b;
                {
                    this.b = c3;
                    this.a = i2;
                }

                @Override
                public void a() {
                    BillingClient billingClient = BillingClient.newBuilder((Context)this.b.a).setListener((PurchasesUpdatedListener)new PurchasesUpdatedListenerImpl()).enablePendingPurchases().build();
                    billingClient.startConnection((BillingClientStateListener)new BillingClientStateListenerImpl(this.a, this.b.b, this.b.c, billingClient, this.b, new b(billingClient)));
                }
            });
        }
    }

    @NonNull
    public Executor c() {
        return this.c;
    }

    @NonNull
    public m d() {
        return this.f;
    }

    @NonNull
    public l e() {
        return this.d;
    }

    @NonNull
    public o f() {
        return this.e;
    }
}

