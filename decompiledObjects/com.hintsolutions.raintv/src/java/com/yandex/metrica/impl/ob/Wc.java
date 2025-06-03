/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationListener
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.sd;
import java.util.concurrent.TimeUnit;

public abstract class wc<T> {
    public static final long e = TimeUnit.SECONDS.toMillis(1L);
    @NonNull
    public final Context a;
    @NonNull
    public final sd b;
    @NonNull
    public final LocationListener c;
    @NonNull
    public final Looper d;

    public wc(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull sd sd2, @NonNull Looper looper) {
        this.a = context;
        this.c = locationListener;
        this.b = sd2;
        this.d = looper;
    }

    public abstract void a();

    public abstract boolean a(@NonNull T var1);

    public abstract void b();
}

