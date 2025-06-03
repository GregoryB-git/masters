/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.UiThread
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.PurchaseHistoryResponseListener
 *  com.android.billingclient.api.SkuDetailsParams
 *  com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$a
 *  com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c
 *  com.yandex.metrica.impl.ob.b
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.j
 *  com.yandex.metrica.impl.ob.l
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
package com.yandex.metrica.billing.v3.library;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl;
import com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl;
import com.yandex.metrica.billing.v3.library.b;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.billing_interface.g;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.j;
import com.yandex.metrica.impl.ob.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class PurchaseHistoryResponseListenerImpl
implements PurchaseHistoryResponseListener {
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
    private final String f;
    @NonNull
    private final b g;
    @NonNull
    private final g h;

    @VisibleForTesting
    public PurchaseHistoryResponseListenerImpl(@NonNull i i2, @NonNull Executor executor, @NonNull Executor executor2, @NonNull BillingClient billingClient, @NonNull j j2, @NonNull String string2, @NonNull b b3, @NonNull g g2) {
        this.a = i2;
        this.b = executor;
        this.c = executor2;
        this.d = billingClient;
        this.e = j2;
        this.f = string2;
        this.g = b3;
        this.h = g2;
    }

    public static /* synthetic */ b a(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.g;
    }

    @NonNull
    private Map<String, com.yandex.metrica.billing_interface.a> a(@NonNull List<PurchaseHistoryRecord> object) {
        HashMap hashMap = new HashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : object) {
            object = com.yandex.metrica.impl.ob.b.d((String)this.f);
            String string2 = purchaseHistoryRecord.getSku();
            hashMap.put((Object)string2, (Object)new com.yandex.metrica.billing_interface.a((e)((Object)object), string2, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L));
        }
        return hashMap;
    }

    @WorkerThread
    private void a(@NonNull BillingResult map, @Nullable List<PurchaseHistoryRecord> map2) throws Throwable {
        if (map.getResponseCode() == 0 && map2 != null) {
            map = this.a((List<PurchaseHistoryRecord>)map2);
            map2 = this.e.f().a(this.a, map, this.e.e());
            if (map2.isEmpty()) {
                this.a(map, (Map<String, com.yandex.metrica.billing_interface.a>)map2);
            } else {
                this.a((Map<String, com.yandex.metrica.billing_interface.a>)map2, new Callable<Void>(){
                    public final Map a;
                    public final Map b;
                    public final PurchaseHistoryResponseListenerImpl c;
                    {
                        this.c = purchaseHistoryResponseListenerImpl;
                        this.a = map;
                        this.b = map2;
                    }

                    public Object call() throws Exception {
                        this.c.a((Map<String, com.yandex.metrica.billing_interface.a>)this.a, (Map<String, com.yandex.metrica.billing_interface.a>)this.b);
                        return null;
                    }
                });
            }
        }
    }

    public static /* synthetic */ void a(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingResult billingResult, List list) throws Throwable {
        purchaseHistoryResponseListenerImpl.a(billingResult, (List<PurchaseHistoryRecord>)list);
    }

    private void a(@NonNull Map<String, com.yandex.metrica.billing_interface.a> object, @NonNull Callable<Void> callable) {
        SkuDetailsParams skuDetailsParams = SkuDetailsParams.newBuilder().setType(this.f).setSkusList((List)new ArrayList((Collection)object.keySet())).build();
        String string2 = this.f;
        Executor executor = this.b;
        BillingClient billingClient = this.d;
        j j2 = this.e;
        b b3 = this.g;
        object = new SkuDetailsResponseListenerImpl(string2, executor, billingClient, j2, callable, (Map<String, com.yandex.metrica.billing_interface.a>)object, b3);
        b3.a(object);
        this.c.execute((Runnable)new c(this, skuDetailsParams, object));
    }

    public static /* synthetic */ BillingClient b(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.d;
    }

    public static /* synthetic */ Executor c(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.b;
    }

    @VisibleForTesting
    public void a(@NonNull Map<String, com.yandex.metrica.billing_interface.a> map, @NonNull Map<String, com.yandex.metrica.billing_interface.a> map2) {
        l l2 = this.e.e();
        this.h.getClass();
        long l3 = System.currentTimeMillis();
        for (com.yandex.metrica.billing_interface.a a2 : map.values()) {
            if (map2.containsKey((Object)a2.b)) {
                a2.e = l3;
                continue;
            }
            com.yandex.metrica.billing_interface.a a3 = l2.a(a2.b);
            if (a3 == null) continue;
            a2.e = a3.e;
        }
        l2.a(map);
        if (!l2.a() && "inapp".equals((Object)this.f)) {
            l2.b();
        }
    }

    @UiThread
    public void onPurchaseHistoryResponse(@NonNull BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list) {
        this.b.execute((Runnable)new a(this, billingResult, list));
    }
}

