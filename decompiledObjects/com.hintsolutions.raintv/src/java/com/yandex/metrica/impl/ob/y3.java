/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.J3;
import com.yandex.metrica.impl.ob.N3;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.R3;
import com.yandex.metrica.impl.ob.Rh;
import com.yandex.metrica.impl.ob.S3;
import com.yandex.metrica.impl.ob.X3;
import com.yandex.metrica.impl.ob.c4;
import com.yandex.metrica.impl.ob.o4;

public class Y3<COMPONENT extends S3 & P3>
implements N3<X3> {
    @NonNull
    private final o4<COMPONENT> a;

    public Y3(@NonNull o4<COMPONENT> o42) {
        this.a = o42;
    }

    @Override
    public R3 a(@NonNull Context context, @NonNull I3 i32, @NonNull D3 d3) {
        o4<S3> o42 = this.a;
        return new X3(context, i32, d3, new c4(d3.b), o42, new J3(), Rh.a());
    }
}

