/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.List
 */
package L0;

import F0.H;
import F0.L;
import F0.M;
import F0.T;
import F0.q;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import L0.a;
import L0.b;
import L0.d;
import L0.f;
import g0.z;
import java.util.List;

public final class c
implements r {
    public static final x q = new b();
    public final z a = new z(4);
    public final z b = new z(9);
    public final z c = new z(11);
    public final z d = new z();
    public final d e = new d();
    public t f;
    public int g = 1;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public f p;

    public static /* synthetic */ r[] c() {
        return c.j();
    }

    private static /* synthetic */ r[] j() {
        return new r[]{new c()};
    }

    @Override
    public void a(long l8, long l9) {
        if (l8 == 0L) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override
    public void b(t t8) {
        this.f = t8;
    }

    @Override
    public /* synthetic */ r d() {
        return q.b(this);
    }

    @Override
    public boolean e(s s8) {
        byte[] arrby = this.a.e();
        boolean bl = false;
        s8.n(arrby, 0, 3);
        this.a.T(0);
        if (this.a.J() != 4607062) {
            return false;
        }
        s8.n(this.a.e(), 0, 2);
        this.a.T(0);
        if ((this.a.M() & 250) != 0) {
            return false;
        }
        s8.n(this.a.e(), 0, 4);
        this.a.T(0);
        int n8 = this.a.p();
        s8.h();
        s8.o(n8);
        s8.n(this.a.e(), 0, 4);
        this.a.T(0);
        if (this.a.p() == 0) {
            bl = true;
        }
        return bl;
    }

    public final void f() {
        if (!this.n) {
            this.f.e(new M.b(-9223372036854775807L));
            this.n = true;
        }
    }

    @Override
    public /* synthetic */ List g() {
        return q.a(this);
    }

    public final long h() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }

    @Override
    public int i(s s8, L l8) {
        g0.a.h(this.f);
        do {
            int n8;
            if ((n8 = this.g) != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            if (!this.m(s8)) continue;
                            return 0;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.n(s8)) continue;
                    return -1;
                }
                this.o(s8);
                continue;
            }
            if (!this.l(s8)) break;
        } while (true);
        return -1;
    }

    public final z k(s s8) {
        if (this.l > this.d.b()) {
            z z8 = this.d;
            z8.R(new byte[Math.max((int)(z8.b() * 2), (int)this.l)], 0);
        } else {
            this.d.T(0);
        }
        this.d.S(this.l);
        s8.readFully(this.d.e(), 0, this.l);
        return this.d;
    }

    public final boolean l(s s8) {
        byte[] arrby = this.b.e();
        boolean bl = false;
        if (!s8.d(arrby, 0, 9, true)) {
            return false;
        }
        this.b.T(0);
        this.b.U(4);
        int n8 = this.b.G();
        boolean bl2 = (n8 & 4) != 0;
        if ((n8 & 1) != 0) {
            bl = true;
        }
        if (bl2 && this.o == null) {
            this.o = new a(this.f.a(8, 1));
        }
        if (bl && this.p == null) {
            this.p = new f(this.f.a(9, 2));
        }
        this.f.j();
        this.j = this.b.p() - 5;
        this.g = 2;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean m(s var1_1) {
        block6 : {
            block5 : {
                block4 : {
                    var3_2 = this.h();
                    var2_3 = this.k;
                    if (var2_3 != 8 || this.o == null) break block4;
                    this.f();
                    var7_4 = this.o;
                    break block5;
                }
                if (var2_3 != 9 || this.p == null) break block6;
                this.f();
                var7_6 = this.p;
            }
            var5_7 = var7_5.a(this.k(var1_1), var3_2);
            ** GOTO lbl23
        }
        if (var2_3 == 18 && !this.n) {
            var6_8 = this.e.a(this.k(var1_1), var3_2);
            var3_2 = this.e.d();
            var5_7 = var6_8;
            if (var3_2 != -9223372036854775807L) {
                this.f.e(new H(this.e.e(), this.e.f(), var3_2));
                this.n = true;
                var5_7 = var6_8;
            }
lbl23: // 4 sources:
            var6_8 = true;
        } else {
            var1_1.i(this.l);
            var5_7 = false;
            var6_8 = false;
        }
        if (!this.h && var5_7) {
            this.h = true;
            var3_2 = this.e.d() == -9223372036854775807L ? - this.m : 0L;
            this.i = var3_2;
        }
        this.j = 4;
        this.g = 2;
        return var6_8;
    }

    public final boolean n(s s8) {
        if (!s8.d(this.c.e(), 0, 11, true)) {
            return false;
        }
        this.c.T(0);
        this.k = this.c.G();
        this.l = this.c.J();
        this.m = this.c.J();
        this.m = ((long)(this.c.G() << 24) | this.m) * 1000L;
        this.c.U(3);
        this.g = 4;
        return true;
    }

    public final void o(s s8) {
        s8.i(this.j);
        this.j = 0;
        this.g = 3;
    }

    @Override
    public void release() {
    }
}

