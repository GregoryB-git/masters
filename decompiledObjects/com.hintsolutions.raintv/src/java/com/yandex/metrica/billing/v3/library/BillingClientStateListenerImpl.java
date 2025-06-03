/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.UiThread
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingResult
 *  com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$a
 *  com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.j
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.concurrent.Executor
 */
package com.yandex.metrica.billing.v3.library;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl;
import com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl;
import com.yandex.metrica.billing_interface.g;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.j;
import java.util.Arrays;
import java.util.concurrent.Executor;

class BillingClientStateListenerImpl
implements BillingClientStateListener {
    @NonNull
    private final i a;
    @NonNull
    private final Executor b;
    @NonNull
    private final Executor c;
    @NonNull
    private final BillingClient d;
    @NonNull
    private final j e;
    @NonNull
    private final com.yandex.metrica.billing.v3.library.b f;

    @VisibleForTesting
    public BillingClientStateListenerImpl(@NonNull i i2, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingClient billingClient, @NonNull j j2, @NonNull com.yandex.metrica.billing.v3.library.b b3) {
        this.a = i2;
        this.b = executor;
        this.c = executor2;
        this.d = billingClient;
        this.e = j2;
        this.f = b3;
    }

    public static /* synthetic */ BillingClient a(BillingClientStateListenerImpl billingClientStateListenerImpl) {
        return billingClientStateListenerImpl.d;
    }

    @WorkerThread
    private void a(@NonNull BillingResult object2) throws Throwable {
        if (object2.getResponseCode() == 0) {
            for (Object object2 : Arrays.asList((Object[])new String[]{"inapp", "subs"})) {
                i i2 = this.a;
                Object object3 = this.b;
                Executor executor = this.c;
                BillingClient billingClient = this.d;
                j j2 = this.e;
                com.yandex.metrica.billing.v3.library.b b3 = this.f;
                object3 = new PurchaseHistoryResponseListenerImpl(i2, (Executor)object3, executor, billingClient, j2, (String)object2, b3, new g());
                b3.a(object3);
                this.c.execute((Runnable)new b(this, (String)object2, (PurchaseHistoryResponseListenerImpl)object3));
            }
        }
    }

    public static /* synthetic */ void a(BillingClientStateListenerImpl billingClientStateListenerImpl, BillingResult billingResult) throws Throwable {
        billingClientStateListenerImpl.a(billingResult);
    }

    public static /* synthetic */ com.yandex.metrica.billing.v3.library.b b(BillingClientStateListenerImpl billingClientStateListenerImpl) {
        return billingClientStateListenerImpl.f;
    }

    public static /* synthetic */ Executor c(BillingClientStateListenerImpl billingClientStateListenerImpl) {
        return billingClientStateListenerImpl.b;
    }

    @UiThread
    public void onBillingServiceDisconnected() {
    }

    @UiThread
    public void onBillingSetupFinished(@NonNull BillingResult billingResult) {
        this.b.execute((Runnable)new a(this, billingResult));
    }
}

