/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;

public class un<T>
implements xn<T> {
    @NonNull
    private final xn<T> a;

    public un(@NonNull xn<T> xn2) {
        this.a = xn2;
    }

    @Override
    public vn a(@Nullable T object) {
        if (((vn)(object = this.a.a(object))).b()) {
            return object;
        }
        throw new ValidationException(((vn)object).a());
    }
}

