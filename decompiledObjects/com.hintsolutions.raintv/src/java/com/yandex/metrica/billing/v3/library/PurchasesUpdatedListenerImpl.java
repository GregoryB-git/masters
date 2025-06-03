/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.UiThread
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  java.lang.Object
 *  java.util.List
 */
package com.yandex.metrica.billing.v3.library;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import java.util.List;

class PurchasesUpdatedListenerImpl
implements PurchasesUpdatedListener {
    @UiThread
    public void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
    }
}

