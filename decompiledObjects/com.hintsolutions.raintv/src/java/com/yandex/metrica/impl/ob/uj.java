/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Oj
 *  com.yandex.metrica.impl.ob.Qj
 *  com.yandex.metrica.impl.ob.jl
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Jk;
import com.yandex.metrica.impl.ob.Oj;
import com.yandex.metrica.impl.ob.Qj;
import com.yandex.metrica.impl.ob.Sk;
import com.yandex.metrica.impl.ob.jl;

class Uj {
    @NonNull
    private final Qj a;
    @NonNull
    private final Oj b;

    public Uj(@NonNull Context context) {
        this(new Qj(context), new Oj());
    }

    @VisibleForTesting
    public Uj(@NonNull Qj qj, @NonNull Oj oj) {
        this.a = qj;
        this.b = oj;
    }

    @NonNull
    public Jk a(@NonNull Activity activity, @Nullable Sk sk) {
        if (sk == null) {
            return Jk.b;
        }
        if (!sk.a) {
            return Jk.d;
        }
        jl jl2 = sk.e;
        if (jl2 == null) {
            return Jk.c;
        }
        if (this.a.a(activity, jl2)) {
            return Jk.e;
        }
        if (this.b.a(activity, sk.e)) {
            return Jk.f;
        }
        return Jk.a;
    }
}

