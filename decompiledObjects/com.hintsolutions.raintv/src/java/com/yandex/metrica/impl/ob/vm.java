/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Im;
import com.yandex.metrica.impl.ob.Km;
import com.yandex.metrica.impl.ob.Tm;
import com.yandex.metrica.impl.ob.Um;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vm
extends Um {
    @Nullable
    private final Um b;

    public Vm(int n3) {
        this(n3, null);
    }

    public Vm(int n3, @Nullable Um um2) {
        super(n3);
        this.b = um2;
    }

    @NonNull
    public Tm<List<Object>, Km> a(@Nullable List<Object> object) {
        int n3;
        int n7 = 0;
        int n8 = 0;
        if (object != null && (object.size() > this.a() || this.b != null)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = object.iterator();
            n3 = 0;
            int n9 = 0;
            while (iterator.hasNext()) {
                Tm<Object, Im> tm2 = iterator.next();
                if (n9 < this.a()) {
                    Um um2 = this.b;
                    n7 = n3;
                    object = tm2;
                    if (um2 != null) {
                        tm2 = um2.a(tm2);
                        object = tm2.a;
                        n7 = n3 + tm2.b.a();
                    }
                    arrayList.add(object);
                    n3 = n7;
                } else {
                    n7 = this.b(tm2);
                    ++n8;
                    n3 += n7;
                }
                ++n9;
            }
            object = arrayList;
        } else {
            n3 = 0;
            n8 = n7;
        }
        return new Tm<List<Object>, Km>((List<Object>)object, new Km(n8, n3));
    }

    public int b(@Nullable Object object) {
        throw null;
    }
}

