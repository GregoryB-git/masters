/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.T;
import F0.a;
import F0.n;
import F0.t;
import d0.q;
import g0.M;
import g0.a;
import g0.o;
import g0.y;
import g0.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l1.K;
import l1.m;

public final class i
implements m {
    public static final byte[] w = new byte[]{73, 68, 51};
    public final boolean a;
    public final y b = new y(new byte[7]);
    public final z c = new z(Arrays.copyOf((byte[])w, (int)10));
    public final String d;
    public final int e;
    public String f;
    public T g;
    public T h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public T u;
    public long v;

    public i(boolean bl) {
        this(bl, null, 0);
    }

    public i(boolean bl, String string2, int n8) {
        this.s();
        this.n = -1;
        this.o = -1;
        this.r = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.a = bl;
        this.d = string2;
        this.e = n8;
    }

    private boolean i(z z8, byte[] arrby, int n8) {
        int n9 = Math.min((int)z8.a(), (int)(n8 - this.j));
        z8.l(arrby, this.j, n9);
        this.j = n9 = this.j + n9;
        if (n9 == n8) {
            return true;
        }
        return false;
    }

    public static boolean m(int n8) {
        if ((n8 & 65526) == 65520) {
            return true;
        }
        return false;
    }

    @Override
    public void a(z z8) {
        this.f();
        while (z8.a() > 0) {
            int n8 = this.i;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 == 4) {
                                this.p(z8);
                                continue;
                            }
                            throw new IllegalStateException();
                        }
                        n8 = this.l ? 7 : 5;
                        if (!this.i(z8, this.b.a, n8)) continue;
                        this.n();
                        continue;
                    }
                    if (!this.i(z8, this.c.e(), 10)) continue;
                    this.o();
                    continue;
                }
                this.g(z8);
                continue;
            }
            this.j(z8);
        }
    }

    @Override
    public void b() {
        this.t = -9223372036854775807L;
        this.q();
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(long l8, int n8) {
        this.t = l8;
    }

    @Override
    public void e(t object, K.d d8) {
        T t8;
        d8.a();
        this.f = d8.b();
        this.g = t8 = object.a(d8.c(), 1);
        this.u = t8;
        if (this.a) {
            d8.a();
            this.h = object = object.a(d8.c(), 5);
            object.d(new q.b().a0(d8.b()).o0("application/id3").K());
            return;
        }
        this.h = new n();
    }

    public final void f() {
        a.e(this.g);
        M.i(this.u);
        M.i(this.h);
    }

    public final void g(z z8) {
        if (z8.a() == 0) {
            return;
        }
        this.b.a[0] = z8.e()[z8.f()];
        this.b.p(2);
        int n8 = this.b.h(4);
        int n9 = this.o;
        if (n9 != -1 && n8 != n9) {
            this.q();
            return;
        }
        if (!this.m) {
            this.m = true;
            this.n = this.p;
            this.o = n8;
        }
        this.t();
    }

    public final boolean h(z z8, int n8) {
        z8.T(n8 + 1);
        if (!this.w(z8, this.b.a, 1)) {
            return false;
        }
        this.b.p(4);
        int n9 = this.b.h(1);
        int n10 = this.n;
        if (n10 != -1 && n9 != n10) {
            return false;
        }
        if (this.o != -1) {
            if (!this.w(z8, this.b.a, 1)) {
                return true;
            }
            this.b.p(2);
            if (this.b.h(4) != this.o) {
                return false;
            }
            z8.T(n8 + 2);
        }
        if (!this.w(z8, this.b.a, 4)) {
            return true;
        }
        this.b.p(14);
        int n11 = this.b.h(13);
        if (n11 < 7) {
            return false;
        }
        byte[] arrby = z8.e();
        n10 = z8.g();
        if ((n8 += n11) >= n10) {
            return true;
        }
        n11 = arrby[n8];
        if (n11 == -1) {
            if (++n8 == n10) {
                return true;
            }
            if (this.l((byte)-1, arrby[n8]) && (arrby[n8] & 8) >> 3 == n9) {
                return true;
            }
            return false;
        }
        if (n11 != 73) {
            return false;
        }
        n9 = n8 + 1;
        if (n9 == n10) {
            return true;
        }
        if (arrby[n9] != 68) {
            return false;
        }
        if ((n8 += 2) == n10) {
            return true;
        }
        if (arrby[n8] == 51) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(z z8) {
        byte[] arrby = z8.e();
        int n8 = z8.f();
        int n9 = z8.g();
        do {
            int n10;
            block11 : {
                block12 : {
                    block8 : {
                        block9 : {
                            block10 : {
                                if (n8 >= n9) {
                                    z8.T(n8);
                                    return;
                                }
                                n10 = n8 + 1;
                                int n11 = arrby[n8];
                                int n12 = n11 & 255;
                                if (this.k == 512 && this.l((byte)-1, (byte)n12) && (this.m || this.h(z8, n8 - 1))) {
                                    this.p = (n11 & 8) >> 3;
                                    boolean bl = true;
                                    if ((n11 & 1) != 0) {
                                        bl = false;
                                    }
                                    this.l = bl;
                                    if (!this.m) {
                                        this.r();
                                    } else {
                                        this.t();
                                    }
                                    z8.T(n10);
                                    return;
                                }
                                n11 = this.k;
                                if ((n12 |= n11) == 329) break block8;
                                if (n12 == 511) break block9;
                                if (n12 == 836) break block10;
                                if (n12 == 1075) {
                                    this.u();
                                    z8.T(n10);
                                    return;
                                }
                                if (n11 != 256) {
                                    this.k = 256;
                                    continue;
                                }
                                break block11;
                            }
                            n8 = 1024;
                            break block12;
                        }
                        this.k = 512;
                        break block11;
                    }
                    n8 = 768;
                }
                this.k = n8;
            }
            n8 = n10;
        } while (true);
    }

    public long k() {
        return this.r;
    }

    public final boolean l(byte by, byte by2) {
        return i.m((by & 255) << 8 | by2 & 255);
    }

    public final void n() {
        int n8;
        int n9;
        this.b.p(0);
        if (!this.q) {
            Object object = this.b;
            n9 = 2;
            n8 = object.h(2) + 1;
            if (n8 != 2) {
                object = new StringBuilder();
                object.append("Detected audio object type: ");
                object.append(n8);
                object.append(", but assuming AAC LC.");
                o.h("AdtsReader", object.toString());
            } else {
                n9 = n8;
            }
            this.b.r(5);
            n8 = this.b.h(3);
            object = F0.a.a(n9, this.o, n8);
            a.b b8 = F0.a.e((byte[])object);
            object = new q.b().a0(this.f).o0("audio/mp4a-latm").O(b8.c).N(b8.b).p0(b8.a).b0(Collections.singletonList((Object)object)).e0(this.d).m0(this.e).K();
            this.r = 1024000000L / (long)object.C;
            this.g.d((q)object);
            this.q = true;
        } else {
            this.b.r(10);
        }
        this.b.r(4);
        n8 = this.b.h(13);
        n9 = n8 - 7;
        if (this.l) {
            n9 = n8 - 9;
        }
        this.v(this.g, this.r, 0, n9);
    }

    public final void o() {
        this.h.e(this.c, 10);
        this.c.T(6);
        this.v(this.h, 0L, 10, this.c.F() + 10);
    }

    public final void p(z z8) {
        int n8 = Math.min((int)z8.a(), (int)(this.s - this.j));
        this.u.e(z8, n8);
        this.j = n8 = this.j + n8;
        if (n8 == this.s) {
            boolean bl = this.t != -9223372036854775807L;
            a.f(bl);
            this.u.b(this.t, 1, this.s, 0, null);
            this.t += this.v;
            this.s();
        }
    }

    public final void q() {
        this.m = false;
        this.s();
    }

    public final void r() {
        this.i = 1;
        this.j = 0;
    }

    public final void s() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    public final void t() {
        this.i = 3;
        this.j = 0;
    }

    public final void u() {
        this.i = 2;
        this.j = w.length;
        this.s = 0;
        this.c.T(0);
    }

    public final void v(T t8, long l8, int n8, int n9) {
        this.i = 4;
        this.j = n8;
        this.u = t8;
        this.v = l8;
        this.s = n9;
    }

    public final boolean w(z z8, byte[] arrby, int n8) {
        if (z8.a() < n8) {
            return false;
        }
        z8.l(arrby, 0, n8);
        return true;
    }
}

