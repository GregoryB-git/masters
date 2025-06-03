/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicInteger
 */
package l1;

import F0.T;
import F0.p;
import F0.t;
import a3.f;
import d0.q;
import g0.M;
import g0.a;
import g0.z;
import java.util.concurrent.atomic.AtomicInteger;
import l1.K;
import l1.m;

public final class k
implements m {
    public final z a;
    public final AtomicInteger b;
    public final String c;
    public final int d;
    public String e;
    public T f;
    public int g;
    public int h;
    public int i;
    public long j;
    public q k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;

    public k(String string2, int n8, int n9) {
        this.a = new z(new byte[n9]);
        this.g = 0;
        this.p = -9223372036854775807L;
        this.b = new AtomicInteger();
        this.n = -1;
        this.o = -1;
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1) {
        a.h(this.f);
        block9 : while (var1_1.a() > 0) {
            block16 : {
                block15 : {
                    switch (this.g) {
                        default: {
                            throw new IllegalStateException();
                        }
                        case 6: {
                            var2_2 = Math.min((int)var1_1.a(), (int)(this.l - this.h));
                            this.f.e(var1_1, var2_2);
                            this.h = var2_2 = this.h + var2_2;
                            if (var2_2 != this.l) continue block9;
                            var4_4 = this.p != -9223372036854775807L;
                            a.f(var4_4);
                            var7_6 = this.f;
                            var5_5 = this.p;
                            var2_2 = this.m == 4 ? 0 : 1;
                            var7_6.b(var5_5, var2_2, this.l, 0, null);
                            this.p += this.j;
                            this.g = 0;
                            continue block9;
                        }
                        case 5: {
                            if (!this.f(var1_1, this.a.e(), this.o)) continue block9;
                            this.i();
                            this.a.T(0);
                            var7_6 = this.f;
                            var8_7 = this.a;
                            var2_2 = this.o;
                            ** GOTO lbl45
                        }
                        case 4: {
                            if (!this.f(var1_1, this.a.e(), 6)) continue block9;
                            this.o = var3_3 = p.l(this.a.e());
                            var2_2 = this.h;
                            if (var2_2 > var3_3) {
                                var3_3 = var2_2 - var3_3;
                                this.h = var2_2 - var3_3;
                                var1_1.T(var1_1.f() - var3_3);
                            }
                            var2_2 = 5;
                            break block15;
                        }
                        case 3: {
                            if (!this.f(var1_1, this.a.e(), this.n)) continue block9;
                            this.h();
                            this.a.T(0);
                            var7_6 = this.f;
                            var8_7 = this.a;
                            var2_2 = this.n;
lbl45: // 2 sources:
                            var7_6.e(var8_7, var2_2);
                            ** GOTO lbl57
                        }
                        case 2: {
                            if (!this.f(var1_1, this.a.e(), 7)) continue block9;
                            this.n = p.j(this.a.e());
                            this.g = 3;
                            continue block9;
                        }
                        case 1: {
                            if (!this.f(var1_1, this.a.e(), 18)) continue block9;
                            this.g();
                            this.a.T(0);
                            this.f.e(this.a, 18);
lbl57: // 2 sources:
                            this.g = 6;
                            continue block9;
                        }
                        case 0: 
                    }
                    if (!this.j(var1_1)) continue;
                    var2_2 = this.m;
                    if (var2_2 == 3 || var2_2 == 4) break block16;
                    if (var2_2 == 1) {
                        this.g = 1;
                        continue;
                    }
                    var2_2 = 2;
                }
                this.g = var2_2;
                continue;
            }
            this.g = 4;
        }
    }

    @Override
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(long l8, int n8) {
        this.p = l8;
    }

    @Override
    public void e(t t8, K.d d8) {
        d8.a();
        this.e = d8.b();
        this.f = t8.a(d8.c(), 1);
    }

    public final void g() {
        byte[] arrby = this.a.e();
        if (this.k == null) {
            q q8;
            this.k = q8 = p.h(arrby, this.e, this.c, this.d, null);
            this.f.d(q8);
        }
        this.l = p.b(arrby);
        this.j = f.d(M.V0(p.g(arrby), this.k.C));
    }

    public final void h() {
        long l8;
        p.b b8 = p.i(this.a.e());
        this.k(b8);
        this.l = b8.d;
        long l9 = l8 = b8.e;
        if (l8 == -9223372036854775807L) {
            l9 = 0L;
        }
        this.j = l9;
    }

    public final void i() {
        long l8;
        p.b b8 = p.k(this.a.e(), this.b);
        if (this.m == 3) {
            this.k(b8);
        }
        this.l = b8.d;
        long l9 = l8 = b8.e;
        if (l8 == -9223372036854775807L) {
            l9 = 0L;
        }
        this.j = l9;
    }

    public final boolean j(z arrby) {
        while (arrby.a() > 0) {
            int n8;
            this.i = n8 = this.i << 8;
            this.i = n8 |= arrby.G();
            this.m = n8 = p.c(n8);
            if (n8 == 0) continue;
            arrby = this.a.e();
            n8 = this.i;
            arrby[0] = (byte)(n8 >> 24 & 255);
            arrby[1] = (byte)(n8 >> 16 & 255);
            arrby[2] = (byte)(n8 >> 8 & 255);
            arrby[3] = (byte)(n8 & 255);
            this.h = 4;
            this.i = 0;
            return true;
        }
        return false;
    }

    public final void k(p.b object) {
        int n8 = object.b;
        if (n8 != -2147483647) {
            int n9 = object.c;
            if (n9 == -1) {
                return;
            }
            Object object2 = this.k;
            if (object2 == null || n9 != object2.B || n8 != object2.C || !M.c(object.a, object2.n)) {
                object2 = this.k;
                object2 = object2 == null ? new q.b() : object2.a();
                this.k = object = object2.a0(this.e).o0(object.a).N(object.c).p0(object.b).e0(this.c).m0(this.d).K();
                this.f.d((q)object);
            }
        }
    }
}

