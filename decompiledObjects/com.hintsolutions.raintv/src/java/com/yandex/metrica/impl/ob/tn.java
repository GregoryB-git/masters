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
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;

public class tn<T>
implements xn<T> {
    @NonNull
    private final String a;

    public tn(@NonNull String string) {
        this.a = string;
    }

    @Override
    public vn a(@Nullable T object) {
        if (object == null) {
            object = new StringBuilder();
            object.append(this.a);
            object.append(" is null.");
            return vn.a(this, object.toString());
        }
        return vn.a(this);
    }
}

