/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.T8
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.M0;
import com.yandex.metrica.impl.ob.Q0;
import com.yandex.metrica.impl.ob.T8;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.bh;
import com.yandex.metrica.impl.ob.ca;
import com.yandex.metrica.impl.ob.ja;
import com.yandex.metrica.impl.ob.ka;
import com.yandex.metrica.impl.ob.la;
import com.yandex.metrica.impl.ob.oa;
import com.yandex.metrica.impl.ob.pa;

public class ma<T> {
    @NonNull
    private final Context a;
    @NonNull
    private final String b;
    @NonNull
    private final la<T> c;
    @NonNull
    private final am<ka, ja> d;
    @NonNull
    private final pa e;
    @NonNull
    private final oa f;
    @NonNull
    private final M0 g;
    @NonNull
    private final TimeProvider h;

    public ma(@NonNull Context context, @NonNull Q0 q02, @NonNull String string, @NonNull la<T> la2, @NonNull am<ka, ja> am2, @NonNull pa pa2) {
        this(context, string, la2, am2, pa2, new oa(context, string, pa2, q02), bh.a(), new SystemTimeProvider());
    }

    public ma(@NonNull Context context, @NonNull String string, @NonNull la<T> la2, @NonNull am<ka, ja> am2, @NonNull pa pa2, @NonNull oa oa2, @NonNull M0 m02, @NonNull TimeProvider timeProvider) {
        this.a = context;
        this.b = string;
        this.c = la2;
        this.d = am2;
        this.e = pa2;
        this.f = oa2;
        this.g = m02;
        this.h = timeProvider;
    }

    public void a(@Nullable T object, @NonNull ka object2) {
        ma ma2 = this;
        synchronized (ma2) {
            object2 = this.d.a((ka)object2);
            if (this.f.a((ja)object2)) {
                this.g.a(this.b, this.c.a(object));
                object2 = this.e;
                object = new Object(ca.a(this.a).g());
                object2.a((T8)object, this.h.currentTimeSeconds());
            }
            return;
        }
    }
}

