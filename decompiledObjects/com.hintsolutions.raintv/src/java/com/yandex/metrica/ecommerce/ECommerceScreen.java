/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class ECommerceScreen {
    @Nullable
    private String a;
    @Nullable
    private List<String> b;
    @Nullable
    private String c;
    @Nullable
    private Map<String, String> d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.b;
    }

    @Nullable
    public String getName() {
        return this.a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String string2) {
        this.a = string2;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String string2) {
        this.c = string2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommerceScreen{name='");
        a.B(stringBuilder, this.a, '\'', ", categoriesPath=");
        stringBuilder.append(this.b);
        stringBuilder.append(", searchQuery='");
        a.B(stringBuilder, this.c, '\'', ", payload=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

