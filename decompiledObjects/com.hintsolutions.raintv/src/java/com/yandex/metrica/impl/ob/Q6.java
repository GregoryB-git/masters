/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.I6
 *  com.yandex.metrica.impl.ob.J
 *  com.yandex.metrica.impl.ob.Q1
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A6;
import com.yandex.metrica.impl.ob.C6;
import com.yandex.metrica.impl.ob.Hl;
import com.yandex.metrica.impl.ob.I6;
import com.yandex.metrica.impl.ob.J;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Q1;
import com.yandex.metrica.impl.ob.U1;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.z0;
import java.util.HashMap;

public class q6 {
    @NonNull
    private final I6 a;

    public q6() {
        this(new I6());
    }

    @VisibleForTesting
    public q6(@NonNull I6 i62) {
        this.a = i62;
    }

    public U1.f a(@NonNull C6 j5, @NonNull Q1 q1) {
        Object object = j5.a;
        Object object2 = "";
        if (object != null && (object = ((A6)object).b()) != null) {
            object2 = object;
        }
        byte[] byArray = this.a.a((C6)j5);
        object = Hl.b(q1.b().a());
        j5 = z0.i;
        j5 = new J(byArray, (String)object2, a1.G.b(), (Pl)((Object)object));
        j5.c(q1.d());
        return new U1.f((c0)j5, q1).a((HashMap<J.a, Integer>)j5.s()).a(true);
    }
}

