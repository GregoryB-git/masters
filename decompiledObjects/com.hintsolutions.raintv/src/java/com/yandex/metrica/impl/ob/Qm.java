/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.km
 *  com.yandex.metrica.impl.ob.nm
 *  com.yandex.metrica.impl.ob.sm
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Ml;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.km;
import com.yandex.metrica.impl.ob.nm;
import com.yandex.metrica.impl.ob.pm;
import com.yandex.metrica.impl.ob.rm;
import com.yandex.metrica.impl.ob.sm;

public class qm {
    @NonNull
    private final Ml<rm, pm> a;
    @NonNull
    private final Ml<a1, pm> b;

    public qm() {
        this((pm)new nm(), (pm)new sm(), (pm)new km());
    }

    public qm(@NonNull pm object, @NonNull pm pm2, @NonNull pm pm3) {
        Ml<rm, pm> ml2 = new Ml<rm, pm>((pm)object);
        this.a = ml2;
        ml2.a(rm.b, (pm)object);
        ml2.a(rm.c, pm2);
        ml2.a(rm.d, pm3);
        this.b = object = new Ml((pm)object);
        ((Ml)object).a(a1.t, pm3);
    }

    @NonNull
    public pm a(@NonNull c0 object) {
        object = a1.a(object.n());
        return this.b.a((a1)((Object)object));
    }

    @NonNull
    public pm a(rm rm2) {
        return this.a.a(rm2);
    }
}

