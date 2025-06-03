/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.Zb;
import com.yandex.metrica.impl.ob.zc;

public class Hb
implements zc {
    @NonNull
    private final TimeProvider a;
    @NonNull
    private final Zb b;

    @VisibleForTesting
    public Hb(@NonNull Zb zb2, @NonNull TimeProvider timeProvider) {
        this.b = zb2;
        this.a = timeProvider;
    }

    @Override
    public void a() {
        this.b.a(this.a.currentTimeSeconds());
    }
}

