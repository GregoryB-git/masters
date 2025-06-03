/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;

public class ECommerceAmount {
    @NonNull
    private final BigDecimal a;
    @NonNull
    private final String b;

    public ECommerceAmount(double d2, @NonNull String string2) {
        this(new BigDecimal(A2.a((double)d2, (double)0.0)), string2);
    }

    public ECommerceAmount(long l2, @NonNull String string2) {
        this(A2.a((long)l2), string2);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String string2) {
        this.a = bigDecimal;
        this.b = string2;
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.a;
    }

    @NonNull
    public String getUnit() {
        return this.b;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommerceAmount{amount=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", unit='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

