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
import com.yandex.metrica.impl.ob.Sm;

public class Rm<T>
implements Sm<T> {
    @NonNull
    private final Sm<T> a;

    public Rm(@NonNull Sm<T> sm, @Nullable T t2) {
        this.a = sm;
    }

    @Override
    @Nullable
    public T a(@Nullable T t2) {
        Object object = t2;
        if (t2 != this.a.a(t2)) {
            object = "<truncated data was not sent, see METRIKALIB-4568>";
        }
        return object;
    }
}

