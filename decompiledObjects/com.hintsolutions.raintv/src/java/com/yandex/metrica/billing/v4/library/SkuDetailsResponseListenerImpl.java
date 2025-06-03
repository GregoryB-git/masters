/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.UiThread
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.SkuDetails
 *  com.android.billingclient.api.SkuDetailsResponseListener
 *  com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$a
 *  com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b
 *  com.yandex.metrica.impl.ob.j
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.List
 *  kotlin.Metadata
 *  kotlin.Unit
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
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl;
import com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl;
import com.yandex.metrica.impl.ob.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\b\"\u0010#J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017\u00a2\u0006\u0004\b\n\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2={"Lcom/yandex/metrica/billing/v4/library/SkuDetailsResponseListenerImpl;", "Lcom/android/billingclient/api/SkuDetailsResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/SkuDetails;", "skuDetails", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "onSkuDetailsResponse", "", "Ljava/lang/String;", "type", "Lcom/yandex/metrica/billing/v4/library/b;", "f", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "e", "Ljava/util/List;", "purchaseHistoryRecords", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class SkuDetailsResponseListenerImpl
implements SkuDetailsResponseListener {
    private final String a;
    private final BillingClient b;
    private final j c;
    private final Function0<Unit> d;
    private final List<PurchaseHistoryRecord> e;
    private final com.yandex.metrica.billing.v4.library.b f;

    public SkuDetailsResponseListenerImpl(@NotNull String string2, @NotNull BillingClient billingClient, @NotNull j j2, @NotNull Function0<Unit> function0, @NotNull List<? extends PurchaseHistoryRecord> list, @NotNull com.yandex.metrica.billing.v4.library.b b4) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"type");
        Intrinsics.checkNotNullParameter((Object)billingClient, (String)"billingClient");
        Intrinsics.checkNotNullParameter((Object)j2, (String)"utilsProvider");
        Intrinsics.checkNotNullParameter(function0, (String)"billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, (String)"purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter((Object)b4, (String)"billingLibraryConnectionHolder");
        this.a = string2;
        this.b = billingClient;
        this.c = j2;
        this.d = function0;
        this.e = list;
        this.f = b4;
    }

    @WorkerThread
    private final void a(BillingResult object, List<? extends SkuDetails> list) {
        if (object.getResponseCode() == 0) {
            boolean bl = list == null || list.isEmpty();
            if (!bl) {
                object = new PurchaseResponseListenerImpl(this.a, this.c, this.d, this.e, list, this.f);
                this.f.a(object);
                this.c.c().execute((Runnable)new b(this, (PurchaseResponseListenerImpl)object));
            }
        }
    }

    public static final /* synthetic */ BillingClient access$getBillingClient$p(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
        return skuDetailsResponseListenerImpl.b;
    }

    public static final /* synthetic */ com.yandex.metrica.billing.v4.library.b access$getBillingLibraryConnectionHolder$p(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
        return skuDetailsResponseListenerImpl.f;
    }

    public static final /* synthetic */ String access$getType$p(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
        return skuDetailsResponseListenerImpl.a;
    }

    public static final /* synthetic */ j access$getUtilsProvider$p(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
        return skuDetailsResponseListenerImpl.c;
    }

    public static final /* synthetic */ void access$processResponse(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, BillingResult billingResult, List list) {
        skuDetailsResponseListenerImpl.a(billingResult, (List<? extends SkuDetails>)list);
    }

    @UiThread
    public void onSkuDetailsResponse(@NotNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter((Object)billingResult, (String)"billingResult");
        this.c.a().execute((Runnable)new a(this, billingResult, list));
    }
}

