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
import F0.c;
import F0.t;
import d0.q;
import g0.a;
import g0.y;
import g0.z;
import l1.K;
import l1.m;

public final class f
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
    public boolean j;
    public long k;
    public q l;
    public int m;
    public long n;

    public f() {
        this(null, 0);
    }

    public f(String string2, int n8) {
        y y8;
        this.a = y8 = new y(new byte[16]);
        this.b = new z(y8.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = string2;
        this.d = n8;
    }

    private boolean f(z z8, byte[] arrby, int n8) {
        int n9 = Math.min((int)z8.a(), (int)(n8 - this.h));
        z8.l(arrby, this.h, n9);
        this.h = n9 = this.h + n9;
        if (n9 == n8) {
            return true;
        }
        return false;
    }

    private void g() {
        this.a.p(0);
        c.b b8 = c.d(this.a);
        q q8 = this.l;
        if (q8 == null || b8.c != q8.B || b8.b != q8.C || !"audio/ac4".equals((Object)q8.n)) {
            this.l = q8 = new q.b().a0(this.e).o0("audio/ac4").N(b8.c).p0(b8.b).e0(this.c).m0(this.d).K();
            this.f.d(q8);
        }
        this.m = b8.d;
        this.k = (long)b8.e * 1000000L / (long)this.l.C;
    }

    private boolean h(z z8) {
        block4 : {
            int n8;
            boolean bl;
            boolean bl2;
            do {
                n8 = z8.a();
                bl = false;
                bl2 = false;
                if (n8 <= 0) break block4;
                if (!this.i) {
                    if (z8.G() == 172) {
                        bl2 = true;
                    }
                    this.i = bl2;
                    continue;
                }
                n8 = z8.G();
                bl2 = n8 == 172;
                this.i = bl2;
                if (n8 == 64 || n8 == 65) break;
            } while (true);
            bl2 = bl;
            if (n8 == 65) {
                bl2 = true;
            }
            this.j = bl2;
            return true;
        }
        return false;
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
                    n8 = Math.min((int)z8.a(), (int)(this.m - this.h));
                    this.f.e(z8, n8);
                    this.h = n8 = this.h + n8;
                    if (n8 != this.m) continue;
                    if (this.n == -9223372036854775807L) {
                        bl = false;
                    }
                    a.f(bl);
                    this.f.b(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.g = 0;
                    continue;
                }
                if (!this.f(z8, this.b.e(), 16)) continue;
                this.g();
                this.b.T(0);
                this.f.e(this.b, 16);
                this.g = 2;
                continue;
            }
            if (!this.h(z8)) continue;
            this.g = 1;
            this.b.e()[0] = -84;
            byte[] arrby = this.b.e();
            n8 = this.j ? 65 : 64;
            arrby[1] = (byte)n8;
            this.h = 2;
        }
    }

    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(long l8, int n8) {
        this.n = l8;
    }

    @Override
    public void e(t t8, K.d d8) {
        d8.a();
        this.e = d8.b();
        this.f = t8.a(d8.c(), 1);
    }
}

