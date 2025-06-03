/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package l1;

import F0.T;
import F0.t;
import d0.q;
import g0.M;
import g0.a;
import g0.y;
import g0.z;
import java.util.List;
import l1.K;
import l1.m;
import l1.v;

public final class u
implements m {
    public final z a = new z(new byte[15], 2);
    public final y b = new y();
    public final z c = new z();
    public int d = 0;
    public String e;
    public T f;
    public double g = -9.223372036854776E18;
    public double h = -9.223372036854776E18;
    public boolean i;
    public boolean j = true;
    public int k;
    public int l;
    public boolean m = true;
    public int n;
    public int o;
    public v.b p = new v.b();
    public int q = -2147483647;
    public int r = -1;
    public int s;
    public long t = -1L;
    public boolean u;

    private boolean k(z z8) {
        int n8 = this.k;
        if ((n8 & 2) == 0) {
            z8.T(z8.g());
            return false;
        }
        if ((n8 & 4) == 0) {
            while (z8.a() > 0) {
                this.l = n8 = this.l << 8;
                this.l = n8 |= z8.G();
                if (!v.e(n8)) continue;
                z8.T(z8.f() - 3);
                this.l = 0;
                return true;
            }
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1) {
        a.h(this.f);
        while (var1_1.a() > 0) {
            var2_2 = this.d;
            if (var2_2 == 0) ** GOTO lbl40
            if (var2_2 != 1) {
                if (var2_2 != 2) throw new IllegalStateException();
                if (this.j(this.p.a)) {
                    this.f(var1_1, this.c, true);
                }
                this.l(var1_1);
                var2_2 = this.n;
                var3_3 = this.p;
                if (var2_2 != var3_3.c) continue;
                var2_2 = var3_3.a;
                if (var2_2 == 1) {
                    this.h(new y(this.c.e()));
                } else if (var2_2 == 17) {
                    this.s = v.f(new y(this.c.e()));
                } else if (var2_2 == 2) {
                    this.g();
                }
            } else {
                this.f(var1_1, this.a, false);
                if (this.a.a() == 0) {
                    if (this.i()) {
                        this.a.T(0);
                        var3_3 = this.f;
                        var4_4 = this.a;
                        var3_3.e(var4_4, var4_4.g());
                        this.a.P(2);
                        this.c.P(this.p.c);
                        this.m = true;
                        this.d = 2;
                        continue;
                    }
                    if (this.a.g() >= 15) continue;
                    var3_3 = this.a;
                    var3_3.S(var3_3.g() + 1);
                }
                this.m = false;
                continue;
lbl40: // 1 sources:
                if (!this.k(var1_1)) continue;
            }
            this.d = 1;
        }
    }

    @Override
    public void b() {
        this.d = 0;
        this.l = 0;
        this.a.P(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18;
        this.h = -9.223372036854776E18;
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(long l8, int n8) {
        this.k = n8;
        if (!(this.j || this.o == 0 && this.m)) {
            this.i = true;
        }
        if (l8 != -9223372036854775807L) {
            boolean bl = this.i;
            double d8 = l8;
            if (bl) {
                this.h = d8;
                return;
            }
            this.g = d8;
        }
    }

    @Override
    public void e(t t8, K.d d8) {
        d8.a();
        this.e = d8.b();
        this.f = t8.a(d8.c(), 1);
    }

    public final void f(z z8, z z9, boolean bl) {
        int n8 = z8.f();
        int n9 = Math.min((int)z8.a(), (int)z9.a());
        z8.l(z9.e(), z9.f(), n9);
        z9.U(n9);
        if (bl) {
            z8.T(n8);
        }
    }

    public final void g() {
        int n8;
        if (this.u) {
            this.j = false;
            n8 = 1;
        } else {
            n8 = 0;
        }
        double d8 = (double)(this.r - this.s) * 1000000.0 / (double)this.q;
        long l8 = Math.round((double)this.g);
        if (this.i) {
            this.i = false;
            this.g = this.h;
        } else {
            this.g += d8;
        }
        this.f.b(l8, n8, this.o, 0, null);
        this.u = false;
        this.s = 0;
        this.o = 0;
    }

    public final void h(y object) {
        Object object2 = v.h((y)object);
        this.q = object2.b;
        this.r = object2.c;
        long l8 = this.t;
        long l9 = this.p.b;
        if (l8 != l9) {
            this.t = l9;
            int n8 = object2.a;
            object = "mhm1";
            if (n8 != -1) {
                object = new StringBuilder();
                object.append("mhm1");
                object.append(String.format((String)".%02X", (Object[])new Object[]{object2.a}));
                object = object.toString();
            }
            object2 = (object2 = object2.d) != null && object2.length > 0 ? X2.v.a0(M.f, object2) : null;
            object = new q.b().a0(this.e).o0("audio/mhm1").p0(this.q).O((String)object).b0((List)object2).K();
            this.f.d((q)object);
        }
        this.u = true;
    }

    public final boolean i() {
        int n8 = this.a.g();
        this.b.o(this.a.e(), n8);
        boolean bl = v.g(this.b, this.p);
        if (bl) {
            this.n = 0;
            this.o += this.p.c + n8;
        }
        return bl;
    }

    public final boolean j(int n8) {
        boolean bl = true;
        if (n8 != 1) {
            if (n8 == 17) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public final void l(z z8) {
        int n8 = Math.min((int)z8.a(), (int)(this.p.c - this.n));
        this.f.e(z8, n8);
        this.n += n8;
    }
}

