/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.r5
 *  com.yandex.metrica.impl.ob.v5
 *  com.yandex.metrica.impl.ob.x5
 *  com.yandex.metrica.impl.ob.y5
 *  com.yandex.metrica.impl.ob.z5
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashMap
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A5;
import com.yandex.metrica.impl.ob.C5;
import com.yandex.metrica.impl.ob.D5;
import com.yandex.metrica.impl.ob.E5;
import com.yandex.metrica.impl.ob.F5;
import com.yandex.metrica.impl.ob.G5;
import com.yandex.metrica.impl.ob.H4;
import com.yandex.metrica.impl.ob.H5;
import com.yandex.metrica.impl.ob.I5;
import com.yandex.metrica.impl.ob.K4;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.r5;
import com.yandex.metrica.impl.ob.s5;
import com.yandex.metrica.impl.ob.u5;
import com.yandex.metrica.impl.ob.v5;
import com.yandex.metrica.impl.ob.w5;
import com.yandex.metrica.impl.ob.x5;
import com.yandex.metrica.impl.ob.y5;
import com.yandex.metrica.impl.ob.z5;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class I4
extends K4<X4> {
    private final D5 a;
    private final Map<a1, w5<X4>> b;
    @Nullable
    private s5 c;

    public I4(L3 object) {
        this.a = object = new D5((L3)object);
        this.c = new s5((D5)object);
        this.b = this.a();
    }

    private HashMap<a1, w5<X4>> a() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)a1.O, (Object)new r5(this.a));
        hashMap.put((Object)a1.Q, (Object)new G5(this.a));
        hashMap.put((Object)a1.e, (Object)new A5(this.a));
        y5 y52 = new y5(this.a);
        hashMap.put((Object)a1.g, (Object)y52);
        hashMap.put((Object)a1.H, (Object)y52);
        hashMap.put((Object)a1.L, (Object)y52);
        hashMap.put((Object)a1.z, (Object)y52);
        hashMap.put((Object)a1.y, (Object)y52);
        hashMap.put((Object)a1.R, (Object)y52);
        hashMap.put((Object)a1.S, (Object)new C5(this.a));
        hashMap.put((Object)a1.p, (Object)new z5(this.a));
        Object object = a1.q;
        Object object2 = this.a;
        hashMap.put(object, (Object)new F5((D5)object2, ((D5)object2).l()));
        object = a1.I;
        object2 = this.a;
        hashMap.put(object, (Object)new F5((D5)object2, ((D5)object2).l()));
        hashMap.put((Object)a1.r, (Object)new v5(this.a));
        hashMap.put((Object)a1.J, (Object)new v5(this.a));
        hashMap.put((Object)a1.M, (Object)new u5(this.a));
        object = a1.K;
        object2 = this.a;
        hashMap.put(object, (Object)new F5((D5)object2, ((D5)object2).l()));
        hashMap.put((Object)a1.E, (Object)new I5(this.a));
        object = new H5(this.a);
        hashMap.put((Object)a1.D, object);
        hashMap.put((Object)a1.G, object);
        hashMap.put((Object)a1.F, object);
        hashMap.put((Object)a1.N, (Object)y52);
        hashMap.put((Object)a1.t, (Object)new x5(this.a));
        hashMap.put((Object)a1.i, (Object)new E5(this.a));
        object = a1.j;
        object2 = this.a;
        hashMap.put(object, (Object)new F5((D5)object2, ((D5)object2).o()));
        object2 = a1.B;
        object = this.a;
        hashMap.put(object2, (Object)new F5((D5)object, ((D5)object).d()));
        object2 = a1.C;
        object = this.a;
        hashMap.put(object2, (Object)new F5((D5)object, ((D5)object).c()));
        hashMap.put((Object)a1.k, (Object)y52);
        object = a1.l;
        object2 = this.a;
        hashMap.put(object, (Object)new F5((D5)object2, ((D5)object2).w()));
        hashMap.put((Object)a1.m, (Object)y52);
        hashMap.put((Object)a1.n, (Object)y52);
        hashMap.put((Object)a1.u, (Object)y52);
        hashMap.put((Object)a1.X, (Object)y52);
        hashMap.put((Object)a1.Y, (Object)y52);
        hashMap.put((Object)a1.Z, (Object)y52);
        hashMap.put((Object)a1.o, (Object)y52);
        hashMap.put((Object)a1.b0, (Object)y52);
        hashMap.put((Object)a1.c0, (Object)y52);
        return hashMap;
    }

    @Override
    public H4 a(int n2) {
        LinkedList linkedList = new LinkedList();
        Object object = a1.a(n2);
        s5 s52 = this.c;
        if (s52 != null) {
            s52.a((a1)((Object)object), (List<X4>)linkedList);
        }
        if ((object = (w5)this.b.get(object)) != null) {
            ((w5)object).a(linkedList);
        }
        return new H4((List<Object>)linkedList);
    }

    public void a(a1 a12, w5<X4> w52) {
        this.b.put((Object)a12, w52);
    }

    public D5 b() {
        return this.a;
    }
}

