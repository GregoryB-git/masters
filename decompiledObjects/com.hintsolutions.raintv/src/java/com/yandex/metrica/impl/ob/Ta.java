/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.Ga;
import com.yandex.metrica.impl.ob.Hm;
import com.yandex.metrica.impl.ob.Im;
import com.yandex.metrica.impl.ob.La;
import com.yandex.metrica.impl.ob.Tm;
import com.yandex.metrica.impl.ob.Xm;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.ef;
import com.yandex.metrica.impl.ob.xa;

public class ta
implements Converter {
    @NonNull
    private final xa a;
    @NonNull
    private final Xm b;

    public ta() {
        this(new xa(), new Xm(20));
    }

    @VisibleForTesting
    public ta(@NonNull xa xa2, @NonNull Xm xm2) {
        this.a = xa2;
        this.b = xm2;
    }

    @NonNull
    public Ga<ef.a, Im> a(@NonNull La object) {
        ef.a a2 = new ef.a();
        a2.b = this.a.a(((La)object).a);
        object = this.b.a(((La)object).b);
        a2.a = com.yandex.metrica.impl.ob.b.b((String)((Tm)object).a);
        return new Ga<ef.a, Im>(a2, Hm.a(new Im[]{object}));
    }

    @Override
    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (Ga)object;
        throw new UnsupportedOperationException();
    }
}

