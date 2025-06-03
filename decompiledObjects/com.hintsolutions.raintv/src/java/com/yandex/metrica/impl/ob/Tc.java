/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.w;
import java.util.List;

public class tc {
    @NonNull
    public final List<E.b.a> a;
    @NonNull
    public final List<w.a> b;

    public tc(@NonNull List<E.b.a> list, @NonNull List<w.a> list2) {
        this.a = list;
        this.b = list2;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("Preconditions{possibleChargeTypes=");
        stringBuilder.append(this.a);
        stringBuilder.append(", appStatuses=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

