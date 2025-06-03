/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.util.List;

public class ECommercePrice {
    @NonNull
    private final ECommerceAmount a;
    @Nullable
    private List<ECommerceAmount> b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.b = list;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommercePrice{fiat=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", internalComponents=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

