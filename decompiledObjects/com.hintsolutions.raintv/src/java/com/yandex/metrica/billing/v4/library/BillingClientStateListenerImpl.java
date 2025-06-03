/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.UiThread
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingResult
 *  com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$a
 *  com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b
 *  com.yandex.metrica.impl.ob.i
 *  com.yandex.metrica.impl.ob.j
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.billing.v4.library;

import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl;
import com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.j;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv={1, 0, 3}, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001c"}, d2={"Lcom/yandex/metrica/billing/v4/library/BillingClientStateListenerImpl;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "a", "(Lcom/android/billingclient/api/BillingResult;)V", "onBillingSetupFinished", "onBillingServiceDisconnected", "()V", "Lcom/yandex/metrica/billing/v4/library/b;", "d", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/yandex/metrica/impl/ob/i;", "Lcom/yandex/metrica/impl/ob/i;", "config", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/j;", "c", "Lcom/yandex/metrica/impl/ob/j;", "utilsProvider", "<init>", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;Lcom/yandex/metrica/billing/v4/library/b;)V", "(Lcom/yandex/metrica/impl/ob/i;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/j;)V", "billing-v4_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class BillingClientStateListenerImpl
implements BillingClientStateListener {
    private final i a;
    private final BillingClient b;
    private final j c;
    private final com.yandex.metrica.billing.v4.library.b d;

    public BillingClientStateListenerImpl(@NotNull i i2, @NotNull BillingClient billingClient, @NotNull j j2) {
        Intrinsics.checkNotNullParameter((Object)i2, (String)"config");
        Intrinsics.checkNotNullParameter((Object)billingClient, (String)"billingClient");
        Intrinsics.checkNotNullParameter((Object)j2, (String)"utilsProvider");
        this(i2, billingClient, j2, new com.yandex.metrica.billing.v4.library.b(billingClient, null, 2));
    }

    @VisibleForTesting
    public BillingClientStateListenerImpl(@NotNull i i2, @NotNull BillingClient billingClient, @NotNull j j2, @NotNull com.yandex.metrica.billing.v4.library.b b4) {
        Intrinsics.checkNotNullParameter((Object)i2, (String)"config");
        Intrinsics.checkNotNullParameter((Object)billingClient, (String)"billingClient");
        Intrinsics.checkNotNullParameter((Object)j2, (String)"utilsProvider");
        Intrinsics.checkNotNullParameter((Object)b4, (String)"billingLibraryConnectionHolder");
        this.a = i2;
        this.b = billingClient;
        this.c = j2;
        this.d = b4;
    }

    @WorkerThread
    private final void a(BillingResult object2) {
        if (object2.getResponseCode() != 0) {
            return;
        }
        for (Object object2 : CollectionsKt.listOf((Object[])new String[]{"inapp", "subs"})) {
            PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(this.a, this.b, this.c, (String)object2, this.d);
            this.d.a(purchaseHistoryResponseListenerImpl);
            this.c.c().execute((Runnable)new b((String)object2, purchaseHistoryResponseListenerImpl, this));
        }
    }

    public static final /* synthetic */ BillingClient access$getBillingClient$p(BillingClientStateListenerImpl billingClientStateListenerImpl) {
        return billingClientStateListenerImpl.b;
    }

    public static final /* synthetic */ com.yandex.metrica.billing.v4.library.b access$getBillingLibraryConnectionHolder$p(BillingClientStateListenerImpl billingClientStateListenerImpl) {
        return billingClientStateListenerImpl.d;
    }

    public static final /* synthetic */ j access$getUtilsProvider$p(BillingClientStateListenerImpl billingClientStateListenerImpl) {
        return billingClientStateListenerImpl.c;
    }

    public static final /* synthetic */ void access$processResult(BillingClientStateListenerImpl billingClientStateListenerImpl, BillingResult billingResult) {
        billingClientStateListenerImpl.a(billingResult);
    }

    @UiThread
    public void onBillingServiceDisconnected() {
    }

    @UiThread
    public void onBillingSetupFinished(@NotNull BillingResult billingResult) {
        Intrinsics.checkNotNullParameter((Object)billingResult, (String)"billingResult");
        this.c.a().execute((Runnable)new a(this, billingResult));
    }
}

