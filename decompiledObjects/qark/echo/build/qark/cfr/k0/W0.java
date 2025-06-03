/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package k0;

import d0.I;
import g0.M;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k0.F0;
import k0.a;
import x0.T;
import x0.p;

public final class W0
extends a {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final I[] l;
    public final Object[] m;
    public final HashMap n;

    public W0(Collection collection, T t8) {
        this(W0.G(collection), W0.H(collection), t8);
    }

    public W0(I[] arri, Object[] arrobject, T object) {
        int n8;
        int n9 = 0;
        super(false, (T)object);
        int n10 = arri.length;
        this.l = arri;
        this.j = new int[n10];
        this.k = new int[n10];
        this.m = arrobject;
        this.n = new HashMap();
        int n11 = arri.length;
        int n12 = n10 = (n8 = 0);
        while (n9 < n11) {
            this.l[n12] = object = arri[n9];
            this.k[n12] = n8;
            this.j[n12] = n10;
            n8 += object.p();
            n10 += this.l[n12].i();
            this.n.put(arrobject[n12], (Object)n12);
            ++n9;
            ++n12;
        }
        this.h = n8;
        this.i = n10;
    }

    public static I[] G(Collection collection) {
        I[] arri = new I[collection.size()];
        collection = collection.iterator();
        int n8 = 0;
        while (collection.hasNext()) {
            arri[n8] = ((F0)collection.next()).b();
            ++n8;
        }
        return arri;
    }

    public static Object[] H(Collection collection) {
        Object[] arrobject = new Object[collection.size()];
        collection = collection.iterator();
        int n8 = 0;
        while (collection.hasNext()) {
            arrobject[n8] = ((F0)collection.next()).a();
            ++n8;
        }
        return arrobject;
    }

    @Override
    public int A(int n8) {
        return this.k[n8];
    }

    @Override
    public I D(int n8) {
        return this.l[n8];
    }

    public W0 E(T t8) {
        I[] arri;
        I[] arri2 = new I[this.l.length];
        for (int i8 = 0; i8 < (arri = this.l).length; ++i8) {
            arri2[i8] = new p(arri[i8]){
                public final I.c f;
                {
                    super(i8);
                    this.f = new I.c();
                }

                @Override
                public I.b g(int n8, I.b b8, boolean bl) {
                    I.b b9 = super.g(n8, b8, bl);
                    if (I.super.n(b9.c, this.f).f()) {
                        b9.t(b8.a, b8.b, b8.c, b8.d, b8.e, d0.a.g, true);
                        return b9;
                    }
                    b9.f = true;
                    return b9;
                }
            };
        }
        return new W0(arri2, this.m, t8);
    }

    public List F() {
        return Arrays.asList((Object[])this.l);
    }

    @Override
    public int i() {
        return this.i;
    }

    @Override
    public int p() {
        return this.h;
    }

    @Override
    public int s(Object object) {
        if ((object = (Integer)this.n.get(object)) == null) {
            return -1;
        }
        return object.intValue();
    }

    @Override
    public int t(int n8) {
        return M.g(this.j, n8 + 1, false, false);
    }

    @Override
    public int u(int n8) {
        return M.g(this.k, n8 + 1, false, false);
    }

    @Override
    public Object x(int n8) {
        return this.m[n8];
    }

    @Override
    public int z(int n8) {
        return this.j[n8];
    }

}

