/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package l1;

import F0.T;
import F0.b;
import F0.t;
import d0.q;
import g0.M;
import g0.a;
import g0.y;
import g0.z;
import l1.K;
import l1.m;

public final class c
implements m {
    public final y a;
    public final z b;
    public final String c;
    public final int d;
    public String e;
    public T f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public q k;
    public int l;
    public long m;

    public c() {
        this(null, 0);
    }

    public c(String string2, int n8) {
        y y8;
        this.a = y8 = new y(new byte[128]);
        this.b = new z(y8.a);
        this.g = 0;
        this.m = -9223372036854775807L;
        this.c = string2;
        this.d = n8;
    }

    @Override
    public void a(z z8) {
        a.h(this.f);
        while (z8.a() > 0) {
            int n8 = this.g;
            boolean bl = true;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) continue;
                    n8 = Math.min((int)z8.a(), (int)(this.l - this.h));
                    this.f.e(z8, n8);
                    this.h = n8 = this.h + n8;
                    if (n8 != this.l) continue;
                    if (this.m == -9223372036854775807L) {
                        bl = false;
                    }
                    a.f(bl);
                    this.f.b(this.m, 1, this.l, 0, null);
                    this.m += this.j;
                    this.g = 0;
                    continue;
                }
                if (!this.f(z8, this.b.e(), 128)) continue;
                this.g();
                this.b.T(0);
                this.f.e(this.b, 128);
                this.g = 2;
                continue;
            }
            if (!this.h(z8)) continue;
            this.g = 1;
            this.b.e()[0] = 11;
            this.b.e()[1] = 119;
            this.h = 2;
        }
    }

    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = false;
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
    public void e(t t8, K.d d8) {
        d8.a();
        this.e = d8.b();
        this.f = t8.a(d8.c(), 1);
    }

    public final boolean f(z z8, byte[] arrby, int n8) {
        int n9 = Math.min((int)z8.a(), (int)(n8 - this.h));
        z8.l(arrby, this.h, n9);
        this.h = n9 = this.h + n9;
        if (n9 == n8) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.a.p(0);
        b.b b8 = b.f(this.a);
        Object object = this.k;
        if (object == null || b8.d != object.B || b8.c != object.C || !M.c(b8.a, object.n)) {
            object = new q.b().a0(this.e).o0(b8.a).N(b8.d).p0(b8.c).e0(this.c).m0(this.d).j0(b8.g);
            if ("audio/ac3".equals((Object)b8.a)) {
                object.M(b8.g);
            }
            this.k = object = object.K();
            this.f.d((q)object);
        }
        this.l = b8.e;
        this.j = (long)b8.f * 1000000L / (long)this.k.C;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean h(z z8) {
        do {
            boolean bl;
            block6 : {
                block7 : {
                    int n8;
                    block5 : {
                        n8 = z8.a();
                        bl = false;
                        if (n8 <= 0) return false;
                        if (this.i) break block5;
                        if (z8.G() != 11) break block6;
                        break block7;
                    }
                    n8 = z8.G();
                    if (n8 == 119) {
                        this.i = false;
                        return true;
                    }
                    if (n8 != 11) break block6;
                }
                bl = true;
            }
            this.i = bl;
        } while (true);
    }
}

