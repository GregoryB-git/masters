/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.W8
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.I3;
import com.yandex.metrica.impl.ob.W8;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.gi;
import com.yandex.metrica.impl.ob.x2;

public class f4 {
    @NonNull
    private final W8 a;
    @NonNull
    private final TimeProvider b;
    @NonNull
    private final x2 c;
    @Nullable
    private gi d;
    private long e;

    public f4(@NonNull Context context, @NonNull I3 i3) {
        this(new W8(ca.a(context).b(i3)), new SystemTimeProvider(), new x2());
    }

    public f4(@NonNull W8 w8, @NonNull TimeProvider timeProvider, @NonNull x2 x22) {
        this.a = w8;
        this.b = timeProvider;
        this.c = x22;
        this.e = w8.k();
    }

    public void a() {
        long l5;
        this.e = l5 = this.b.currentTimeMillis();
        this.a.d(l5).d();
    }

    public void a(@Nullable gi gi2) {
        this.d = gi2;
    }

    public boolean a(@Nullable Boolean object) {
        boolean bl = Boolean.FALSE.equals(object) && (object = this.d) != null && this.c.a(this.e, object.a, "should report diagnostic");
        return bl;
    }
}

