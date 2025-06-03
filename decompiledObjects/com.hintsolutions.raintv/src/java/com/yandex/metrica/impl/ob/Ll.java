/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.jl;

public class ll {
    @NonNull
    private final M0 a;
    @NonNull
    private final jl b;

    @VisibleForTesting
    public ll(@NonNull jl jl2, @NonNull M0 m02) {
        this.b = jl2;
        this.a = m02;
    }

    public void a(@NonNull String string, @Nullable Throwable throwable) {
        if (this.b.f) {
            this.a.reportError(string, throwable);
        }
    }

    public static class a {
    }
}

