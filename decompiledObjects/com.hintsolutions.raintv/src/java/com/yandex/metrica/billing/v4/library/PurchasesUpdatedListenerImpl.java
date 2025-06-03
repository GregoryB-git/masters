/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.UiThread
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.billing.v4.library;

import androidx.annotation.UiThread;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"Lcom/yandex/metrica/billing/v4/library/PurchasesUpdatedListenerImpl;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "list", "", "onPurchasesUpdated", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "<init>", "()V", "billing-v4_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class PurchasesUpdatedListenerImpl
implements PurchasesUpdatedListener {
    @UiThread
    public void onPurchasesUpdated(@NotNull BillingResult billingResult, @Nullable List<? extends Purchase> list) {
        Intrinsics.checkNotNullParameter((Object)billingResult, (String)"billingResult");
    }
}

