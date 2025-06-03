/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.w
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.Ac;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.Ob;
import com.yandex.metrica.impl.ob.P7;
import com.yandex.metrica.impl.ob.V;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.w;

class Kc
extends V {
    @NonNull
    private P7 b;
    @NonNull
    private Ob c;
    @NonNull
    private SystemTimeProvider d;
    @NonNull
    private final E e;
    @NonNull
    private final w f;

    public Kc(@Nullable V v2, @NonNull P7 p7, @NonNull Ob ob2, @NonNull SystemTimeProvider systemTimeProvider, @NonNull E e3, @NonNull w w3) {
        super(v2);
        this.b = p7;
        this.c = ob2;
        this.d = systemTimeProvider;
        this.e = e3;
        this.f = w3;
    }

    @Override
    public void b(@Nullable Object object) {
        Ac ac;
        if ((object = (Location)object) != null && !TextUtils.isEmpty((CharSequence)(object = this.c.a(ac = new Ac(hc.a.a(this.f.c()), this.d.currentTimeMillis(), this.d.elapsedRealtime(), (Location)object, this.e.b(), null))))) {
            this.b.a(ac.e(), (String)object);
        }
    }
}

