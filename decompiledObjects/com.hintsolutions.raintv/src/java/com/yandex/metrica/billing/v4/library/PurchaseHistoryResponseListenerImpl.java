/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.UiThread
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.PurchaseHistoryResponseListener
 *  com.android.billingclient.api.SkuDetailsParams
 *  com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$a
 *  com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$b
 *  com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c
 *  com.yandex.metrica.impl.ob.g
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.j
 *  com.yandex.metrica.impl.ob.l
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.billing.v4.library;

import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl;
import com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl;
import com.yandex.metrica.billing_interface.e;
import com.yandex.metrica.impl.ob.g;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.j;
import com.yandex.metrica.impl.ob.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\b&\u0010'J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003\u00a2\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u00a2\u0006\u0004\b\b\u0010\rJ9\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003\u00a2\u0006\u0004\b\b\u0010\u0011J'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017\u00a2\u0006\u0004\b\u0013\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$\u00a8\u0006("}, d2={"Lcom/yandex/metrica/billing/v4/library/PurchaseHistoryResponseListenerImpl;", "Lcom/android/billingclient/api/PurchaseHistoryResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "Lcom/yandex/metrica/billing_interface/a;", "(Ljava/util/List;)Ljava/util/Map;", "newSkus", "Lkotlin/Function0;", "billingInfoSentListener", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "list", "onPurchaseHistoryResponse", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/yandex/metrica/impl/ob/i;", "Lcom/yandex/metrica/impl/ob/i;", "config", "d", "Ljava/lang/String;", "type", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "<init>", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Ljava/lang/String;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class PurchaseHistoryResponseListenerImpl
implements PurchaseHistoryResponseListener {
    private final i a;
    private final BillingClient b;
    private final j c;
    private final String d;
    private final com.yandex.metrica.billing.v4.library.b e;

    public PurchaseHistoryResponseListenerImpl(@NotNull i i2, @NotNull BillingClient billingClient, @NotNull j j2, @NotNull String string2, @NotNull com.yandex.metrica.billing.v4.library.b b4) {
        Intrinsics.checkNotNullParameter((Object)i2, (String)"config");
        Intrinsics.checkNotNullParameter((Object)billingClient, (String)"billingClient");
        Intrinsics.checkNotNullParameter((Object)j2, (String)"utilsProvider");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"type");
        Intrinsics.checkNotNullParameter((Object)b4, (String)"billingLibraryConnectionHolder");
        this.a = i2;
        this.b = billingClient;
        this.c = j2;
        this.d = string2;
        this.e = b4;
    }

    /*
     * Unable to fully structure code
     */
    @WorkerThread
    private final Map<String, com.yandex.metrica.billing_interface.a> a(List<? extends PurchaseHistoryRecord> var1_1) {
        var3_2 = new LinkedHashMap();
        for (PurchaseHistoryRecord var5_6 : var1_1 /* !! */ ) {
            for (String var7_7 : var5_6.getSkus()) {
                block5: {
                    block4: {
                        var1_1 /* !! */  = this.d;
                        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , (String)"type");
                        var2_4 = var1_1 /* !! */ .hashCode();
                        if (var2_4 == 3541555) break block4;
                        if (var2_4 != 100343516 || !var1_1 /* !! */ .equals((Object)"inapp")) ** GOTO lbl-1000
                        var1_1 /* !! */  = com.yandex.metrica.billing_interface.e.a;
                        break block5;
                    }
                    if (var1_1 /* !! */ .equals((Object)"subs")) {
                        var1_1 /* !! */  = com.yandex.metrica.billing_interface.e.b;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var1_1 /* !! */  = com.yandex.metrica.billing_interface.e.c;
                    }
                }
                var1_1 /* !! */  = new com.yandex.metrica.billing_interface.a((e)var1_1 /* !! */ , var7_7, var5_6.getPurchaseToken(), var5_6.getPurchaseTime(), 0L);
                Intrinsics.checkNotNullExpressionValue((Object)var7_7, (String)"info.sku");
                var3_2.put((Object)var7_7, var1_1 /* !! */ );
            }
        }
        return var3_2;
    }

    @WorkerThread
    private final void a(BillingResult billingResult, List<? extends PurchaseHistoryRecord> object) {
        if (billingResult.getResponseCode() == 0 && object != null) {
            Map<String, com.yandex.metrica.billing_interface.a> map = this.a((List<? extends PurchaseHistoryRecord>)object);
            billingResult = this.c.f().a(this.a, map, this.c.e());
            Intrinsics.checkNotNullExpressionValue((Object)billingResult, (String)"utilsProvider.updatePoli\u2026lingInfoManager\n        )");
            if (billingResult.isEmpty()) {
                g g2 = g.a;
                object = this.d;
                l l2 = this.c.e();
                Intrinsics.checkNotNullExpressionValue((Object)l2, (String)"utilsProvider.billingInfoManager");
                g.a((g)g2, map, (Map)billingResult, object, (l)l2, null, (int)16);
            } else {
                this.a((List<? extends PurchaseHistoryRecord>)object, (List<String>)CollectionsKt.toList((Iterable)billingResult.keySet()), (Function0<Unit>)new b(this, map, (Map)billingResult));
            }
        }
    }

    @WorkerThread
    private final void a(List<? extends PurchaseHistoryRecord> object, List<String> skuDetailsParams, Function0<Unit> function0) {
        skuDetailsParams = SkuDetailsParams.newBuilder().setType(this.d).setSkusList(skuDetailsParams).build();
        Intrinsics.checkNotNullExpressionValue((Object)skuDetailsParams, (String)"SkuDetailsParams.newBuil\u2026kus)\n            .build()");
        object = new SkuDetailsResponseListenerImpl(this.d, this.b, this.c, function0, (List<? extends PurchaseHistoryRecord>)object, this.e);
        this.e.a(object);
        this.c.c().execute((Runnable)new c(this, skuDetailsParams, object));
    }

    public static final /* synthetic */ BillingClient access$getBillingClient$p(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.b;
    }

    public static final /* synthetic */ com.yandex.metrica.billing.v4.library.b access$getBillingLibraryConnectionHolder$p(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.e;
    }

    public static final /* synthetic */ String access$getType$p(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.d;
    }

    public static final /* synthetic */ j access$getUtilsProvider$p(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
        return purchaseHistoryResponseListenerImpl.c;
    }

    public static final /* synthetic */ void access$processResponse(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingResult billingResult, List list) {
        purchaseHistoryResponseListenerImpl.a(billingResult, (List<? extends PurchaseHistoryRecord>)list);
    }

    @UiThread
    public void onPurchaseHistoryResponse(@NotNull BillingResult billingResult, @Nullable List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter((Object)billingResult, (String)"billingResult");
        this.c.a().execute((Runnable)new a(this, billingResult, list));
    }
}

