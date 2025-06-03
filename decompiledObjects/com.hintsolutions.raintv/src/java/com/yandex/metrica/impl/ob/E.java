/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.SkuDetails
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.yandex.metrica.billing_interface.c;
import com.yandex.metrica.billing_interface.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e {
    @NotNull
    public static final e a = new e();

    private e() {
    }

    private final long a(SkuDetails skuDetails) {
        String string = skuDetails.getFreeTrialPeriod();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"skuDetails.freeTrialPeriod");
        boolean bl = string.length() == 0;
        long l5 = bl ? skuDetails.getIntroductoryPriceAmountMicros() : 0L;
        return l5;
    }

    private final int b(SkuDetails skuDetails) {
        String string = skuDetails.getFreeTrialPeriod();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"skuDetails.freeTrialPeriod");
        int n4 = string.length();
        int n5 = 1;
        n4 = n4 == 0 ? 1 : 0;
        if (n4 != 0) {
            n5 = skuDetails.getIntroductoryPriceCycles();
        }
        return n5;
    }

    private final c c(SkuDetails object) {
        String string = object.getFreeTrialPeriod();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"skuDetails.freeTrialPeriod");
        boolean bl = string.length() == 0;
        object = bl ? c.a(object.getIntroductoryPricePeriod()) : c.a(object.getFreeTrialPeriod());
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @NotNull
    public final d a(@NotNull PurchaseHistoryRecord var1_1, @NotNull SkuDetails var2_2, @Nullable Purchase var3_3) {
        block4: {
            block3: {
                Intrinsics.checkNotNullParameter((Object)var1_1 /* !! */ , (String)"purchasesHistoryRecord");
                Intrinsics.checkNotNullParameter((Object)var2_2 /* !! */ , (String)"skuDetails");
                var13_4 /* !! */  = var2_2 /* !! */ .getType();
                Intrinsics.checkNotNullExpressionValue((Object)var13_4 /* !! */ , (String)"skuDetails.type");
                Intrinsics.checkNotNullParameter((Object)var13_4 /* !! */ , (String)"type");
                var4_5 = var13_4 /* !! */ .hashCode();
                if (var4_5 == 3541555) break block3;
                if (var4_5 != 100343516 || !var13_4 /* !! */ .equals((Object)"inapp")) ** GOTO lbl-1000
                var13_4 /* !! */  = com.yandex.metrica.billing_interface.e.a;
                break block4;
            }
            if (var13_4 /* !! */ .equals((Object)"subs")) {
                var13_4 /* !! */  = com.yandex.metrica.billing_interface.e.b;
            } else lbl-1000:
            // 2 sources

            {
                var13_4 /* !! */  = com.yandex.metrica.billing_interface.e.c;
            }
        }
        var16_6 = var2_2 /* !! */ .getSku();
        var5_7 = var1_1 /* !! */ .getQuantity();
        var6_8 = var2_2 /* !! */ .getPriceAmountMicros();
        var15_9 = var2_2 /* !! */ .getPriceCurrencyCode();
        var10_10 = this.a(var2_2 /* !! */ );
        var14_11 = this.c(var2_2 /* !! */ );
        var4_5 = this.b(var2_2 /* !! */ );
        var17_12 = c.a(var2_2 /* !! */ .getSubscriptionPeriod());
        var2_2 /* !! */  = var1_1 /* !! */ .getSignature();
        var18_13 = var1_1 /* !! */ .getPurchaseToken();
        var8_14 = var1_1 /* !! */ .getPurchaseTime();
        var12_15 = var3_3 != null ? var3_3.isAutoRenewing() : false;
        if (var3_3 == null || (var1_1 /* !! */  = var3_3.getOriginalJson()) == null) {
            var1_1 /* !! */  = "{}";
        }
        return new d((com.yandex.metrica.billing_interface.e)var13_4 /* !! */ , var16_6, var5_7, var6_8, var15_9, var10_10, var14_11, var4_5, var17_12, (String)var2_2 /* !! */ , var18_13, var8_14, var12_15, (String)var1_1 /* !! */ );
    }
}

