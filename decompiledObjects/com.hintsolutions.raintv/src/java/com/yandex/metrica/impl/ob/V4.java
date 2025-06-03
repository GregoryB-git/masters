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
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.X3;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.k4;

public class v4
implements k4 {
    @Nullable
    private final X3 a;

    public v4(@Nullable X3 x32) {
        this.a = x32;
    }

    @Override
    public void a() {
    }

    @Override
    public void a(@NonNull c0 c02, @NonNull D3 d3) {
        X3 x32 = this.a;
        if (x32 != null) {
            x32.a(c02, d3);
        }
    }
}

