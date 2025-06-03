/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.UiThread
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.Purchase$PurchasesResult
 *  com.android.billingclient.api.SkuDetails
 *  com.android.billingclient.api.SkuDetailsResponseListener
 *  com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl$a
 *  com.yandex.metrica.impl.ob.b
 *  com.yandex.metrica.impl.ob.b3
 *  com.yandex.metrica.impl.ob.j
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
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
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl;
import com.yandex.metrica.billing.v3.library.b;
import com.yandex.metrica.billing_interface.c;
import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.impl.ob.b3;
import com.yandex.metrica.impl.ob.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

class SkuDetailsResponseListenerImpl
implements SkuDetailsResponseListener {
    @NonNull
    private final String a;
    @NonNull
    private final Executor b;
    @NonNull
    private final BillingClient c;
    @NonNull
    private final j d;
    @NonNull
    private final Callable<Void> e;
    @NonNull
    private final Map<String, com.yandex.metrica.billing_interface.a> f;
    @NonNull
    private final b g;

    public SkuDetailsResponseListenerImpl(@NonNull String string2, @NonNull Executor executor, @NonNull BillingClient billingClient, @NonNull j j2, @NonNull Callable<Void> callable, @NonNull Map<String, com.yandex.metrica.billing_interface.a> map, @NonNull b b3) {
        this.a = string2;
        this.b = executor;
        this.c = billingClient;
        this.d = j2;
        this.e = callable;
        this.f = map;
        this.g = b3;
    }

    private long a(@NonNull SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0L;
    }

    public static /* synthetic */ b a(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
        return skuDetailsResponseListenerImpl.g;
    }

    @NonNull
    private d a(@NonNull SkuDetails object, @NonNull com.yandex.metrica.billing_interface.a object2, @Nullable Purchase purchase) {
        e e2 = com.yandex.metrica.impl.ob.b.d((String)object.getType());
        String string2 = object.getSku();
        long l2 = object.getPriceAmountMicros();
        String string3 = object.getPriceCurrencyCode();
        long l3 = this.a((SkuDetails)object);
        c c3 = this.c((SkuDetails)object);
        int n = this.b((SkuDetails)object);
        c c4 = com.yandex.metrica.billing_interface.c.a(object.getSubscriptionPeriod());
        object = purchase != null ? purchase.getSignature() : "";
        String string4 = ((com.yandex.metrica.billing_interface.a)object2).c;
        long l4 = ((com.yandex.metrica.billing_interface.a)object2).d;
        boolean bl = purchase != null ? purchase.isAutoRenewing() : false;
        object2 = purchase != null ? purchase.getOriginalJson() : "{}";
        return new d(e2, string2, 1, l2, string3, l3, c3, n, c4, (String)object, string4, l4, bl, (String)object2);
    }

    @NonNull
    private Map<String, Purchase> a() {
        HashMap hashMap = new HashMap();
        Purchase.PurchasesResult purchasesResult2 = this.c.queryPurchases(this.a);
        List list = purchasesResult2.getPurchasesList();
        if (purchasesResult2.getResponseCode() == 0 && list != null) {
            for (Purchase.PurchasesResult purchasesResult2 : list) {
                hashMap.put((Object)purchasesResult2.getSku(), (Object)purchasesResult2);
            }
        }
        return hashMap;
    }

    @WorkerThread
    private void a(@NonNull BillingResult map, @Nullable List<SkuDetails> skuDetails2) throws Throwable {
        if (map.getResponseCode() == 0 && skuDetails2 != null && !skuDetails2.isEmpty()) {
            map = this.a();
            ArrayList arrayList = new ArrayList();
            for (SkuDetails skuDetails2 : skuDetails2) {
                com.yandex.metrica.billing_interface.a a2 = (com.yandex.metrica.billing_interface.a)this.f.get((Object)skuDetails2.getSku());
                String string2 = skuDetails2.getSku();
                string2 = (Purchase)((HashMap)map).get((Object)string2);
                if (a2 == null) continue;
                arrayList.add((Object)this.a(skuDetails2, a2, (Purchase)string2));
            }
            ((b3)this.d.d()).a((List)arrayList);
            this.e.call();
        }
    }

    public static /* synthetic */ void a(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, BillingResult billingResult, List list) throws Throwable {
        skuDetailsResponseListenerImpl.a(billingResult, (List<SkuDetails>)list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int b(@NonNull SkuDetails object) {
        if (!object.getFreeTrialPeriod().isEmpty()) return 1;
        try {
            return object.getIntroductoryPriceCycles();
        }
        catch (Throwable throwable) {
            String string2;
            try {
                Class clazz = object.getClass();
                string2 = (String)clazz.getMethod("getIntroductoryPriceCycles", new Class[0]).invoke(object, new Object[0]);
                if (string2 == null) return 0;
            }
            catch (Throwable throwable2) {
                return 0;
            }
            return Integer.parseInt((String)string2);
        }
    }

    private c c(@NonNull SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return com.yandex.metrica.billing_interface.c.a(skuDetails.getIntroductoryPricePeriod());
        }
        return com.yandex.metrica.billing_interface.c.a(skuDetails.getFreeTrialPeriod());
    }

    @UiThread
    public void onSkuDetailsResponse(@NonNull BillingResult billingResult, @Nullable List<SkuDetails> list) {
        this.b.execute((Runnable)new a(this, billingResult, list));
    }
}

