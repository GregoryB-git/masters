/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Kd;
import com.yandex.metrica.impl.ob.Kl;
import com.yandex.metrica.impl.ob.Ol;
import com.yandex.metrica.impl.ob.T8;
import com.yandex.metrica.impl.ob.pa;

public class ha
implements pa {
    @NonNull
    private final Ol a;

    public ha(@NonNull Ol ol) {
        this.a = ol;
    }

    @Override
    public long a(@NonNull T8 t82) {
        return t82.a(new Kd(z2.o("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_", ((Kl)this.a).b()), null).a(), Long.MAX_VALUE);
    }

    @Override
    public void a(@NonNull T8 t82, long l2) {
        t82 = (T8)t82.b(new Kd(z2.o("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_", ((Kl)this.a).b()), null).a(), l2);
    }
}

