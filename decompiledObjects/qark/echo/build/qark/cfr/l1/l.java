/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.T;
import F0.t;
import d0.q;
import g0.a;
import g0.z;
import java.util.Collections;
import java.util.List;
import l1.K;
import l1.m;

public final class l
implements m {
    public final List a;
    public final T[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public l(List list) {
        this.a = list;
        this.b = new T[list.size()];
        this.f = -9223372036854775807L;
    }

    @Override
    public void a(z z8) {
        if (this.c) {
            if (this.d == 2 && !this.f(z8, 32)) {
                return;
            }
            int n8 = this.d;
            if (n8 == 1 && !this.f(z8, 0)) {
                return;
            }
            n8 = z8.f();
            int n9 = z8.a();
            for (T t8 : this.b) {
                z8.T(n8);
                t8.e(z8, n9);
            }
            this.e += n9;
        }
    }

    @Override
    public void b() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    @Override
    public void c(boolean bl) {
        if (this.c) {
            bl = this.f != -9223372036854775807L;
            a.f(bl);
            T[] arrt = this.b;
            int n8 = arrt.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrt[i8].b(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override
    public void d(long l8, int n8) {
        if ((n8 & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = l8;
        this.e = 0;
        this.d = 2;
    }

    @Override
    public void e(t t8, K.d d8) {
        for (int i8 = 0; i8 < this.b.length; ++i8) {
            K.a a8 = (K.a)this.a.get(i8);
            d8.a();
            T t9 = t8.a(d8.c(), 3);
            t9.d(new q.b().a0(d8.b()).o0("application/dvbsubs").b0(Collections.singletonList((Object)a8.c)).e0(a8.a).K());
            this.b[i8] = t9;
        }
    }

    public final boolean f(z z8, int n8) {
        if (z8.a() == 0) {
            return false;
        }
        if (z8.G() != n8) {
            this.c = false;
        }
        --this.d;
        return this.c;
    }
}

