/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommercePrice;
import com.yandex.metrica.ecommerce.ECommerceProduct;
import com.yandex.metrica.ecommerce.ECommerceReferrer;
import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;

public class ECommerceCartItem {
    @NonNull
    private final ECommerceProduct a;
    @NonNull
    private final BigDecimal b;
    @NonNull
    private final ECommercePrice c;
    @Nullable
    private ECommerceReferrer d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d2) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(A2.a((double)d2, (double)0.0)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long l2) {
        this(eCommerceProduct, eCommercePrice, A2.a((long)l2));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.a = eCommerceProduct;
        this.b = bigDecimal;
        this.c = eCommercePrice;
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommerceCartItem{product=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", quantity=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", revenue=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", referrer=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

