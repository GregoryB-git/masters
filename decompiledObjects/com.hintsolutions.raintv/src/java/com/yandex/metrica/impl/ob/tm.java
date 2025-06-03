/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Im;

public class Tm<V, M extends Im>
implements Im {
    @Nullable
    public final V a;
    @NonNull
    public final M b;

    public Tm(@Nullable V v4, @NonNull M m2) {
        this.a = v4;
        this.b = m2;
    }

    @Override
    public int a() {
        return this.b.a();
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("TrimmingResult{value=");
        stringBuilder.append(this.a);
        stringBuilder.append(", metaInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

