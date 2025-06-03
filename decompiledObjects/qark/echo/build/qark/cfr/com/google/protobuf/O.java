/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.protobuf;

import android.support.v4.media.a;
import com.google.protobuf.K;
import com.google.protobuf.Z;
import com.google.protobuf.b0;
import com.google.protobuf.g0;
import com.google.protobuf.l;
import com.google.protobuf.n0;
import com.google.protobuf.o;
import com.google.protobuf.r;
import java.util.Iterator;
import java.util.Map;

public final class O
implements Z {
    public final K a;
    public final g0 b;
    public final boolean c;
    public final l d;

    public O(g0 g02, l l8, K k8) {
        this.b = g02;
        this.c = l8.d(k8);
        this.d = l8;
        this.a = k8;
    }

    private int i(g0 g02, Object object) {
        return g02.c(g02.a(object));
    }

    public static O j(g0 g02, l l8, K k8) {
        return new O(g02, l8, k8);
    }

    @Override
    public void a(Object object, Object object2) {
        b0.E(this.b, object, object2);
        if (this.c) {
            b0.C(this.d, object, object2);
        }
    }

    @Override
    public void b(Object object) {
        this.b.d(object);
        this.d.e(object);
    }

    @Override
    public final boolean c(Object object) {
        return this.d.b(object).k();
    }

    @Override
    public boolean d(Object object, Object object2) {
        if (!this.b.a(object).equals(this.b.a(object2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(object).equals(this.d.b(object2));
        }
        return true;
    }

    @Override
    public int e(Object object) {
        int n8;
        int n9 = n8 = this.i(this.b, object);
        if (this.c) {
            n9 = n8 + this.d.b(object).f();
        }
        return n9;
    }

    @Override
    public Object f() {
        K k8 = this.a;
        if (k8 instanceof r) {
            return ((r)k8).P();
        }
        return k8.d().c();
    }

    @Override
    public int g(Object object) {
        int n8;
        int n9 = n8 = this.b.a(object).hashCode();
        if (this.c) {
            n9 = n8 * 53 + this.d.b(object).hashCode();
        }
        return n9;
    }

    @Override
    public void h(Object object, n0 n02) {
        Iterator iterator = this.d.b(object).n();
        if (!iterator.hasNext()) {
            this.k(this.b, object, n02);
            return;
        }
        a.a(((Map.Entry)iterator.next()).getKey());
        throw null;
    }

    public final void k(g0 g02, Object object, n0 n02) {
        g02.g(g02.a(object), n02);
    }
}

