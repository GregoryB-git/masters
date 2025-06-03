/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.M7;
import com.yandex.metrica.impl.ob.R7;

class ba
implements M7 {
    @NonNull
    private final M7 a;

    public ba(@NonNull Context context, @NonNull R7 r72, @NonNull M7 m7) {
        this.a = m7;
    }

    @Override
    public void a(@NonNull String string, @NonNull byte[] byArray) {
        this.a.a(string, byArray);
    }

    @Override
    public byte[] a(@NonNull String string) {
        return this.a.a(string);
    }

    @Override
    public void b(@NonNull String string) {
        this.a.b(string);
    }
}

