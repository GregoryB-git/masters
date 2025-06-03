/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.ef$l
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.Ga;
import com.yandex.metrica.impl.ob.Im;
import com.yandex.metrica.impl.ob.Km;
import com.yandex.metrica.impl.ob.Tm;
import com.yandex.metrica.impl.ob.Wm;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.ef;
import java.util.List;

public class Da
implements Converter {
    @NonNull
    private final Wm a;

    public Da() {
        this(new Wm(20, 100));
    }

    @VisibleForTesting
    public Da(@NonNull Wm wm) {
        this.a = wm;
    }

    @NonNull
    public Ga<ef.l[], Im> a(@NonNull List<String> l3) {
        Tm<List<Object>, Km> tm = this.a.a((List<Object>)l3);
        List list = (List)tm.a;
        int n = 0;
        l3 = new ef.l[]{};
        if (list != null) {
            ef.l[] lArray = new ef.l[list.size()];
            while (true) {
                l3 = lArray;
                if (n >= list.size()) break;
                lArray[n] = l3 = new ef.l();
                l3.a = b.b((String)list.get(n));
                ++n;
            }
        }
        return new Ga<ef.l[], Im>((ef.l[])l3, (Im)tm.b);
    }

    @Override
    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (Ga)object;
        throw new UnsupportedOperationException();
    }
}

