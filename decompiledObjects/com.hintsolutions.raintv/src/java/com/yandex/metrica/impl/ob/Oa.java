/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.T8
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.Q0;
import com.yandex.metrica.impl.ob.T8;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.ja;
import com.yandex.metrica.impl.ob.pa;
import com.yandex.metrica.impl.ob.x2;

public class oa {
    @NonNull
    private final Context a;
    @NonNull
    private final String b;
    @NonNull
    private final pa c;
    @NonNull
    private final Q0 d;
    @NonNull
    private final TimeProvider e;
    @NonNull
    private final x2 f;

    public oa(@NonNull Context context, @NonNull String string, @NonNull pa pa2, @NonNull Q0 q02) {
        this(context, string, pa2, q02, new SystemTimeProvider(), new x2());
    }

    @VisibleForTesting
    public oa(@NonNull Context context, @NonNull String string, @NonNull pa pa2, @NonNull Q0 q02, @NonNull TimeProvider timeProvider, @NonNull x2 x22) {
        this.a = context;
        this.b = string;
        this.c = pa2;
        this.d = q02;
        this.e = timeProvider;
        this.f = x22;
    }

    public boolean a(@Nullable ja ja2) {
        boolean bl;
        long l5 = this.e.currentTimeSeconds();
        boolean bl2 = bl = false;
        if (ja2 != null) {
            long l8 = ja2.a;
            boolean bl3 = true;
            boolean bl4 = l5 <= l8;
            if (bl4) {
                bl4 = this.d.a() + l5 <= ja2.a ? bl3 : false;
            }
            bl2 = bl;
            if (bl4) {
                T8 t8 = new T8(ca.a(this.a).g());
                bl2 = this.f.b(this.c.a(t8), ja2.b, z2.s(new StringBuilder(), this.b, " diagnostics event"));
            }
        }
        return bl2;
    }
}

