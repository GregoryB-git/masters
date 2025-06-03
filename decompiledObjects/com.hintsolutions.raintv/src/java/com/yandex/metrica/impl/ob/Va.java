/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.UnsupportedOperationException
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.Ba;
import com.yandex.metrica.impl.ob.Ca;
import com.yandex.metrica.impl.ob.Fa;
import com.yandex.metrica.impl.ob.Ga;
import com.yandex.metrica.impl.ob.Hm;
import com.yandex.metrica.impl.ob.Im;
import com.yandex.metrica.impl.ob.Na;
import com.yandex.metrica.impl.ob.Ta;
import com.yandex.metrica.impl.ob.ef;
import com.yandex.metrica.impl.ob.xa;

public class va
implements Converter {
    @NonNull
    private final Ca a;
    @NonNull
    private final xa b;
    @NonNull
    private final Ba c;
    @NonNull
    private final Fa d;

    public va() {
        this(new Ca(), new xa(), new Ba(), new Fa());
    }

    @VisibleForTesting
    public va(@NonNull Ca ca2, @NonNull xa xa2, @NonNull Ba ba2, @NonNull Fa fa2) {
        this.a = ca2;
        this.b = xa2;
        this.c = ba2;
        this.d = fa2;
    }

    @NonNull
    public Ga<ef.c, Im> a(@NonNull Na object) {
        ef.c c9 = new ef.c();
        Ga<ef.k, Im> ga2 = this.a.a(((Na)object).a);
        c9.a = (ef.k)((Object)ga2.a);
        c9.c = this.b.a(((Na)object).b);
        Ga<ef.j, Im> ga3 = this.c.a(((Na)object).c);
        c9.d = (ef.j)((Object)ga3.a);
        object = ((Na)object).d;
        if (object != null) {
            object = this.d.a((Ta)object);
            c9.b = (ef.m)((Object)((Ga)object).a);
        } else {
            object = null;
        }
        return new Ga<ef.c, Im>(c9, Hm.a(new Im[]{ga2, ga3, object}));
    }

    @Override
    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (Ga)object;
        throw new UnsupportedOperationException();
    }
}

