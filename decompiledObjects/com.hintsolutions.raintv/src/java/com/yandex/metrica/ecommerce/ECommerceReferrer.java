/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ecommerce.ECommerceScreen;

public class ECommerceReferrer {
    @Nullable
    private String a;
    @Nullable
    private String b;
    @Nullable
    private ECommerceScreen c;

    @Nullable
    public String getIdentifier() {
        return this.b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.c;
    }

    @Nullable
    public String getType() {
        return this.a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String string2) {
        this.b = string2;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String string2) {
        this.a = string2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ECommerceReferrer{type='");
        a.B(stringBuilder, this.a, '\'', ", identifier='");
        a.B(stringBuilder, this.b, '\'', ", screen=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

