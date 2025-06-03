/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Lk;
import com.yandex.metrica.impl.ob.ak;
import com.yandex.metrica.impl.ob.jl;

class qk
implements Lk {
    @NonNull
    private final ak a;

    public qk() {
        this(new ak());
    }

    @VisibleForTesting
    public qk(@NonNull ak ak2) {
        this.a = ak2;
    }

    @Override
    public boolean a(@Nullable String string, @NonNull jl jl2) {
        boolean bl2;
        if (jl2.g) {
            this.a.getClass();
            bl2 = A2.a((Object)"do-not-parse", (Object)string);
        } else {
            bl2 = !A2.a((Object)"allow-parsing", (Object)string);
        }
        return bl2;
    }
}

