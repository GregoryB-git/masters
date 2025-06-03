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

public class wa
implements Converter {
    @NonNull
    private final Wm a;

    public wa() {
        this(new Wm(20, 100));
    }

    @VisibleForTesting
    public wa(@NonNull Wm wm) {
        this.a = wm;
    }

    @NonNull
    public Ga<ef.d, Im> a(@NonNull List<String> object) {
        Tm<List<Object>, Km> tm = this.a.a((List<Object>)object);
        ef.d d3 = new ef.d();
        List list = (List)tm.a;
        int n2 = 0;
        object = new byte[0][];
        if (list != null) {
            byte[][] byArrayArray = new byte[list.size()][];
            while (true) {
                object = byArrayArray;
                if (n2 >= list.size()) break;
                byArrayArray[n2] = b.b((String)list.get(n2));
                ++n2;
            }
        }
        d3.a = (byte[][])object;
        return new Ga<ef.d, Im>(d3, (Im)tm.b);
    }

    @Override
    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (Ga)object;
        throw new UnsupportedOperationException();
    }
}

