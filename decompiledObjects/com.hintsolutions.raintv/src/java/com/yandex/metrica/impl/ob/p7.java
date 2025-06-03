/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.E7;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.J7;
import com.yandex.metrica.impl.ob.V7;

public class P7
extends E7 {
    public P7(@NonNull J7 j7) {
        this(j7, F0.g().w().a());
    }

    @VisibleForTesting
    public P7(@NonNull J7 j7, @NonNull V7 v7) {
        super(j7, v7);
    }

    @Override
    public long a() {
        return this.f().e();
    }

    @Override
    public void b(long l4) {
        this.f().b(l4);
    }

    @Override
    @NonNull
    public String e() {
        return "l_dat";
    }
}

