/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.billing_interface;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.e;

public class a {
    @NonNull
    public final e a;
    @NonNull
    public final String b;
    @NonNull
    public final String c;
    public final long d;
    public long e;

    public a(@NonNull e e2, @NonNull String string2, @NonNull String string3, long l2, long l3) {
        this.a = e2;
        this.b = string2;
        this.c = string3;
        this.d = l2;
        this.e = l3;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("BillingInfo{type=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append("sku='");
        stringBuilder.append(this.b);
        stringBuilder.append("'purchaseToken='");
        stringBuilder.append(this.c);
        stringBuilder.append("'purchaseTime=");
        stringBuilder.append(this.d);
        stringBuilder.append("sendTime=");
        return z2.r(stringBuilder, this.e, "}");
    }
}

