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
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.List;
import java.util.Map;

public class ECommerceProduct {
    @NonNull
    private final String a;
    @Nullable
    private String b;
    @Nullable
    private List<String> c;
    @Nullable
    private Map<String, String> d;
    @Nullable
    private ECommercePrice e;
    @Nullable
    private ECommercePrice f;
    @Nullable
    private List<String> g;

    public ECommerceProduct(@NonNull String string2) {
        this.a = string2;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.c;
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.g;
    }

    @NonNull
    public String getSku() {
        return this.a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String string2) {
        this.b = string2;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.g = list;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommerceProduct{sku='");
        a.B(stringBuilder, this.a, '\'', ", name='");
        a.B(stringBuilder, this.b, '\'', ", categoriesPath=");
        stringBuilder.append(this.c);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.d);
        stringBuilder.append(", actualPrice=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(", originalPrice=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", promocodes=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

