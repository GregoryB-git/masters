/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package l1;

import F0.I;
import F0.T;
import d0.q;
import g0.a;
import g0.z;
import l1.K;
import l1.m;

public final class t
implements m {
    public final z a;
    public final I.a b;
    public final String c;
    public final int d;
    public T e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public t() {
        this(null, 0);
    }

    public t(String string2, int n8) {
        z z8;
        this.a = z8 = new z(4);
        z8.e()[0] = -1;
        this.b = new I.a();
        this.m = -9223372036854775807L;
        this.c = string2;
        this.d = n8;
    }

    @Override
    public void a(z z8) {
        a.h(this.e);
        while (z8.a() > 0) {
            int n8 = this.g;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 == 2) {
                        this.g(z8);
                        continue;
                    }
                    throw new IllegalStateException();
                }
                this.h(z8);
                continue;
            }
            this.f(z8);
        }
    }

    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(long l8, int n8) {
        this.m = l8;
    }

    @Override
    public void e(F0.t t8, K.d d8) {
        d8.a();
        this.f = d8.b();
        this.e = t8.a(d8.c(), 1);
    }

    public final void f(z z8) {
        byte[] arrby = z8.e();
        int n8 = z8.g();
        for (int i8 = z8.f(); i8 < n8; ++i8) {
            byte by = arrby[i8];
            boolean bl = (by & 255) == 255;
            by = this.j && (by & 224) == 224 ? 1 : 0;
            this.j = bl;
            if (by == 0) continue;
            z8.T(i8 + 1);
            this.j = false;
            this.a.e()[1] = arrby[i8];
            this.h = 2;
            this.g = 1;
            return;
        }
        z8.T(n8);
    }

    public final void g(z z8) {
        int n8 = Math.min((int)z8.a(), (int)(this.l - this.h));
        this.e.e(z8, n8);
        this.h = n8 = this.h + n8;
        if (n8 < this.l) {
            return;
        }
        boolean bl = this.m != -9223372036854775807L;
        a.f(bl);
        this.e.b(this.m, 1, this.l, 0, null);
        this.m += this.k;
        this.h = 0;
        this.g = 0;
    }

    public final void h(z object) {
        int n8 = Math.min((int)object.a(), (int)(4 - this.h));
        object.l(this.a.e(), this.h, n8);
        this.h = n8 = this.h + n8;
        if (n8 < 4) {
            return;
        }
        this.a.T(0);
        if (!this.b.a(this.a.p())) {
            this.h = 0;
            this.g = 1;
            return;
        }
        object = this.b;
        this.l = object.c;
        if (!this.i) {
            this.k = (long)object.g * 1000000L / (long)object.d;
            object = new q.b().a0(this.f).o0(this.b.b).f0(4096).N(this.b.e).p0(this.b.d).e0(this.c).m0(this.d).K();
            this.e.d((q)object);
            this.i = true;
        }
        this.a.T(0);
        this.e.e(this.a, 4);
        this.g = 2;
    }
}

