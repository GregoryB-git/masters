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
 *  java.util.Map
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.util.List;
import java.util.Map;

public class ECommerceOrder {
    @NonNull
    private final String a;
    @NonNull
    private final List<ECommerceCartItem> b;
    @Nullable
    private Map<String, String> c;

    public ECommerceOrder(@NonNull String string2, @NonNull List<ECommerceCartItem> list) {
        this.a = string2;
        this.b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.b;
    }

    @NonNull
    public String getIdentifier() {
        return this.a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.c = map;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommerceOrder{identifier='");
        a.B(stringBuilder, this.a, '\'', ", cartItems=");
        stringBuilder.append(this.b);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

