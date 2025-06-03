/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.T;
import F0.a;
import F0.t;
import d0.A;
import d0.q;
import g0.a;
import g0.y;
import g0.z;
import java.util.Collections;
import java.util.List;
import l1.K;
import l1.m;

public final class s
implements m {
    public final String a;
    public final int b;
    public final z c;
    public final y d;
    public T e;
    public String f;
    public q g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public s(String object, int n8) {
        this.a = object;
        this.b = n8;
        this.c = object = new z(1024);
        this.d = new y(object.e());
        this.l = -9223372036854775807L;
    }

    public static long f(y y8) {
        return y8.h((y8.h(2) + 1) * 8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1) {
        a.h(this.e);
        while (var1_1.a() > 0) {
            block5 : {
                var2_2 = this.h;
                if (var2_2 == 0) break block5;
                if (var2_2 == 1) ** GOTO lbl21
                if (var2_2 != 2) {
                    if (var2_2 != 3) throw new IllegalStateException();
                    var2_2 = Math.min((int)var1_1.a(), (int)(this.j - this.i));
                    var1_1.l(this.d.a, this.i, var2_2);
                    this.i = var2_2 = this.i + var2_2;
                    if (var2_2 != this.j) continue;
                    this.d.p(0);
                    this.g(this.d);
                } else {
                    this.j = var2_2 = (this.k & -225) << 8 | var1_1.G();
                    if (var2_2 > this.c.e().length) {
                        this.m(this.j);
                    }
                    this.i = 0;
                    this.h = 3;
                    continue;
lbl21: // 1 sources:
                    var2_2 = var1_1.G();
                    if ((var2_2 & 224) == 224) {
                        this.k = var2_2;
                        this.h = 2;
                        continue;
                    }
                    if (var2_2 == 86) continue;
                }
                this.h = 0;
                continue;
            }
            if (var1_1.G() != 86) continue;
            this.h = 1;
        }
    }

    @Override
    public void b() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(long l8, int n8) {
        this.l = l8;
    }

    @Override
    public void e(t t8, K.d d8) {
        d8.a();
        this.e = t8.a(d8.c(), 1);
        this.f = d8.b();
    }

    public final void g(y y8) {
        if (!y8.g()) {
            this.m = true;
            this.l(y8);
        } else if (!this.m) {
            return;
        }
        if (this.n == 0) {
            if (this.o == 0) {
                this.k(y8, this.j(y8));
                if (this.q) {
                    y8.r((int)this.r);
                }
                return;
            }
            throw A.a(null, null);
        }
        throw A.a(null, null);
    }

    public final int h(y y8) {
        int n8 = y8.b();
        a.b b8 = F0.a.d(y8, true);
        this.v = b8.c;
        this.s = b8.a;
        this.u = b8.b;
        return n8 - y8.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(y y8) {
        int n8;
        this.p = n8 = y8.h(3);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    if (n8 != 6 && n8 != 7) {
                        throw new IllegalStateException();
                    }
                    y8.r(1);
                    return;
                }
                y8.r(6);
                return;
            }
            n8 = 9;
        } else {
            n8 = 8;
        }
        y8.r(n8);
    }

    public final int j(y y8) {
        if (this.p == 0) {
            int n8;
            int n9;
            int n10 = 0;
            do {
                n8 = y8.h(8);
                n10 = n9 = n10 + n8;
            } while (n8 == 255);
            return n9;
        }
        throw A.a(null, null);
    }

    public final void k(y y8, int n8) {
        int n9 = y8.e();
        boolean bl = false;
        if ((n9 & 7) == 0) {
            this.c.T(n9 >> 3);
        } else {
            y8.i(this.c.e(), 0, n8 * 8);
            this.c.T(0);
        }
        this.e.e(this.c, n8);
        if (this.l != -9223372036854775807L) {
            bl = true;
        }
        a.f(bl);
        this.e.b(this.l, 1, n8, 0, null);
        this.l += this.t;
    }

    public final void l(y y8) {
        int n8 = y8.h(1);
        int n9 = n8 == 1 ? y8.h(1) : 0;
        this.n = n9;
        if (n9 == 0) {
            if (n8 == 1) {
                s.f(y8);
            }
            if (y8.g()) {
                this.o = y8.h(6);
                n9 = y8.h(4);
                int n10 = y8.h(3);
                if (n9 == 0 && n10 == 0) {
                    boolean bl;
                    if (n8 == 0) {
                        n9 = y8.e();
                        n10 = this.h(y8);
                        y8.p(n9);
                        Object object = new byte[(n10 + 7) / 8];
                        y8.i((byte[])object, 0, n10);
                        object = new q.b().a0(this.f).o0("audio/mp4a-latm").O(this.v).N(this.u).p0(this.s).b0(Collections.singletonList((Object)object)).e0(this.a).m0(this.b).K();
                        if (!object.equals(this.g)) {
                            this.g = object;
                            this.t = 1024000000L / (long)object.C;
                            this.e.d((q)object);
                        }
                    } else {
                        y8.r((int)s.f(y8) - this.h(y8));
                    }
                    this.i(y8);
                    this.q = bl = y8.g();
                    this.r = 0L;
                    if (bl) {
                        if (n8 == 1) {
                            this.r = s.f(y8);
                        } else {
                            do {
                                bl = y8.g();
                                this.r = (this.r << 8) + (long)y8.h(8);
                            } while (bl);
                        }
                    }
                    if (y8.g()) {
                        y8.r(8);
                    }
                    return;
                }
                throw A.a(null, null);
            }
            throw A.a(null, null);
        }
        throw A.a(null, null);
    }

    public final void m(int n8) {
        this.c.P(n8);
        this.d.n(this.c.e());
    }
}

