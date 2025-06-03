/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ecommerce.ECommerceScreen;
import com.yandex.metrica.impl.ob.A2;
import java.util.List;
import java.util.Map;

public class Ua {
    @Nullable
    public final String a;
    @Nullable
    public final List<String> b;
    @Nullable
    public final String c;
    @Nullable
    public final Map<String, String> d;

    public Ua(@NonNull ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), A2.a(eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), A2.c(eCommerceScreen.getPayload()));
    }

    @VisibleForTesting
    public Ua(@Nullable String string, @Nullable List<String> list, @Nullable String string2, @Nullable Map<String, String> map) {
        this.a = string;
        this.b = list;
        this.c = string2;
        this.d = map;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("ScreenWrapper{name='");
        a.B(stringBuilder, this.a, '\'', ", categoriesPath=");
        stringBuilder.append(this.b);
        stringBuilder.append(", searchQuery='");
        a.B(stringBuilder, this.c, '\'', ", payload=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

