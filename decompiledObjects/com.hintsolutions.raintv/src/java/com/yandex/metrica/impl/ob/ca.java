/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.ef$d
 *  com.yandex.metrica.impl.ob.ef$i
 *  com.yandex.metrica.impl.ob.ef$j
 *  com.yandex.metrica.impl.ob.ef$k
 *  com.yandex.metrica.impl.ob.ef$l
 *  com.yandex.metrica.impl.ob.wa
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.Aa;
import com.yandex.metrica.impl.ob.Ba;
import com.yandex.metrica.impl.ob.Da;
import com.yandex.metrica.impl.ob.Ga;
import com.yandex.metrica.impl.ob.Hm;
import com.yandex.metrica.impl.ob.Im;
import com.yandex.metrica.impl.ob.Qa;
import com.yandex.metrica.impl.ob.Ra;
import com.yandex.metrica.impl.ob.Tm;
import com.yandex.metrica.impl.ob.Xm;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.ef;
import com.yandex.metrica.impl.ob.wa;
import java.util.List;
import java.util.Map;

public class Ca
implements Converter {
    @NonNull
    private final Aa a;
    @NonNull
    private final Ba b;
    @NonNull
    private final wa c;
    @NonNull
    private final Da d;
    @NonNull
    private final Xm e;
    @NonNull
    private final Xm f;

    public Ca() {
        this(new Aa(), new Ba(), new wa(), new Da(), new Xm(100), new Xm(1000));
    }

    @VisibleForTesting
    public Ca(@NonNull Aa aa, @NonNull Ba ba, @NonNull wa wa2, @NonNull Da da, @NonNull Xm xm, @NonNull Xm xm2) {
        this.a = aa;
        this.b = ba;
        this.c = wa2;
        this.d = da;
        this.e = xm;
        this.f = xm2;
    }

    @NonNull
    public Ga<ef.k, Im> a(@NonNull Ra object) {
        ef.k k3 = new ef.k();
        Tm<String, Im> tm = this.e.a(((Ra)object).a);
        k3.a = com.yandex.metrica.impl.ob.b.b((String)tm.a);
        Tm<String, Im> tm2 = this.f.a(((Ra)object).b);
        k3.b = com.yandex.metrica.impl.ob.b.b((String)tm2.a);
        Object object2 = ((Ra)object).c;
        Object var6_6 = null;
        if (object2 != null) {
            object2 = this.c.a(object2);
            k3.c = (ef.d)object2.a;
        } else {
            object2 = null;
        }
        Object object3 = ((Ra)object).d;
        if (object3 != null) {
            object3 = this.a.a((Map<String, String>)object3);
            k3.d = (ef.i)object3.a;
        } else {
            object3 = null;
        }
        Object object4 = ((Ra)object).e;
        if (object4 != null) {
            object4 = this.b.a((Qa)object4);
            k3.e = (ef.j)((Ga)object4).a;
        } else {
            object4 = null;
        }
        Object object5 = ((Ra)object).f;
        if (object5 != null) {
            object5 = this.b.a((Qa)object5);
            k3.f = (ef.j)((Ga)object5).a;
        } else {
            object5 = null;
        }
        List<String> list = ((Ra)object).g;
        object = var6_6;
        if (list != null) {
            object = this.d.a(list);
            k3.g = (ef.l[])((Ga)object).a;
        }
        return new Ga<ef.k, Im>(k3, Hm.a(new Im[]{tm, tm2, object2, object3, object4, object5, object}));
    }

    @Override
    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (Ga)object;
        throw new UnsupportedOperationException();
    }
}

