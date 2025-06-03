/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.PurchasesResponseListener
 *  com.android.billingclient.api.SkuDetails
 *  com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl$a
 *  com.yandex.metrica.impl.ob.b3
 *  com.yandex.metrica.impl.ob.e
 *  com.yandex.metrica.impl.ob.j
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.billing.v4.library;

import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl;
import com.yandex.metrica.billing.v4.library.b;
import com.yandex.metrica.impl.ob.b3;
import com.yandex.metrica.impl.ob.e;
import com.yandex.metrica.impl.ob.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv={1, 0, 3}, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u0004\b!\u0010\"J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u00a2\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u00a2\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0003\u00a2\u0006\u0004\b\b\u0010\rJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u0016\u00a8\u0006#"}, d2={"Lcom/yandex/metrica/billing/v4/library/PurchaseResponseListenerImpl;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "b", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "onQueryPurchasesResponse", "Lcom/yandex/metrica/impl/ob/j;", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "Lcom/android/billingclient/api/SkuDetails;", "d", "Ljava/util/List;", "skuDetails", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "c", "type", "<init>", "(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/j;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class PurchaseResponseListenerImpl
implements PurchasesResponseListener {
    private final j a;
    private final Function0<Unit> b;
    private final List<PurchaseHistoryRecord> c;
    private final List<SkuDetails> d;
    private final b e;

    public PurchaseResponseListenerImpl(@NotNull String string2, @NotNull j j2, @NotNull Function0<Unit> function0, @NotNull List<? extends PurchaseHistoryRecord> list, @NotNull List<? extends SkuDetails> list2, @NotNull b b4) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"type");
        Intrinsics.checkNotNullParameter((Object)j2, (String)"utilsProvider");
        Intrinsics.checkNotNullParameter(function0, (String)"billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, (String)"purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(list2, (String)"skuDetails");
        Intrinsics.checkNotNullParameter((Object)b4, (String)"billingLibraryConnectionHolder");
        this.a = j2;
        this.b = function0;
        this.c = list;
        this.d = list2;
        this.e = b4;
    }

    @WorkerThread
    private final Map<String, PurchaseHistoryRecord> a(List<? extends PurchaseHistoryRecord> purchaseHistoryRecord2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord2 : purchaseHistoryRecord2) {
            for (String string2 : purchaseHistoryRecord2.getSkus()) {
                Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"sku");
                linkedHashMap.put((Object)string2, (Object)purchaseHistoryRecord2);
            }
        }
        return linkedHashMap;
    }

    @WorkerThread
    private final void a(BillingResult object2, List<? extends Purchase> arrayList) {
        if (object2.getResponseCode() != 0) {
            return;
        }
        Map<String, Purchase> map = this.b((List<? extends Purchase>)arrayList);
        Map<String, PurchaseHistoryRecord> map2 = this.a(this.c);
        object2 = this.d;
        arrayList = new ArrayList();
        for (Object object2 : object2) {
            String string2 = object2.getSku();
            PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord)((LinkedHashMap)map2).get((Object)string2);
            if (purchaseHistoryRecord != null) {
                e e2 = com.yandex.metrica.impl.ob.e.a;
                string2 = object2.getSku();
                object2 = e2.a(purchaseHistoryRecord, object2, (Purchase)((LinkedHashMap)map).get((Object)string2));
            } else {
                object2 = null;
            }
            if (object2 == null) continue;
            arrayList.add(object2);
        }
        ((b3)this.a.d()).a((List)arrayList);
        this.b.invoke();
    }

    public static final /* synthetic */ b access$getBillingLibraryConnectionHolder$p(PurchaseResponseListenerImpl purchaseResponseListenerImpl) {
        return purchaseResponseListenerImpl.e;
    }

    public static final /* synthetic */ void access$processResponse(PurchaseResponseListenerImpl purchaseResponseListenerImpl, BillingResult billingResult, List list) {
        purchaseResponseListenerImpl.a(billingResult, (List<? extends Purchase>)list);
    }

    @WorkerThread
    private final Map<String, Purchase> b(List<? extends Purchase> object2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Purchase purchase : object2) {
            for (Object object2 : purchase.getSkus()) {
                Intrinsics.checkNotNullExpressionValue(object2, (String)"sku");
                linkedHashMap.put(object2, (Object)purchase);
            }
        }
        return linkedHashMap;
    }

    public void onQueryPurchasesResponse(@NotNull BillingResult billingResult, @NotNull List<? extends Purchase> list) {
        Intrinsics.checkNotNullParameter((Object)billingResult, (String)"billingResult");
        Intrinsics.checkNotNullParameter(list, (String)"purchases");
        this.a.a().execute((Runnable)new a(this, billingResult, list));
    }
}

