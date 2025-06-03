/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
package k0;

import A0.D;
import A0.E;
import A0.y;
import B0.b;
import d0.I;
import g0.o;
import java.io.IOException;
import k0.C0;
import k0.E0;
import k0.T0;
import k0.a1;
import k0.y0;
import x0.Q;
import x0.Z;
import x0.e;
import x0.v;
import x0.x;

public final class B0 {
    public final v a;
    public final Object b;
    public final Q[] c;
    public boolean d;
    public boolean e;
    public C0 f;
    public boolean g;
    public final boolean[] h;
    public final a1[] i;
    public final D j;
    public final T0 k;
    public B0 l;
    public Z m;
    public E n;
    public long o;

    public B0(a1[] arra1, long l8, D object, b b8, T0 t02, C0 c02, E e8) {
        this.i = arra1;
        this.o = l8;
        this.j = object;
        this.k = t02;
        object = c02.a;
        this.b = object.a;
        this.f = c02;
        this.m = Z.d;
        this.n = e8;
        this.c = new Q[arra1.length];
        this.h = new boolean[arra1.length];
        this.a = B0.f((x.b)object, t02, b8, c02.b, c02.d);
    }

    public static v f(x.b object, T0 object2, b b8, long l8, long l9) {
        object = object2 = object2.h((x.b)object, b8, l8);
        if (l9 != -9223372036854775807L) {
            object = new e((v)object2, true, 0L, l9);
        }
        return object;
    }

    public static void w(T0 t02, v v8) {
        v v9 = v8;
        try {
            if (v8 instanceof e) {
                v9 = ((e)v8).o;
            }
            t02.z(v9);
            return;
        }
        catch (RuntimeException runtimeException) {
            o.d("MediaPeriodHolder", "Period release failed.", (Throwable)runtimeException);
            return;
        }
    }

    public long A(long l8) {
        return l8 - this.m();
    }

    public long B(long l8) {
        return l8 + this.m();
    }

    public void C() {
        v v8 = this.a;
        if (v8 instanceof e) {
            long l8;
            long l9 = l8 = this.f.d;
            if (l8 == -9223372036854775807L) {
                l9 = Long.MIN_VALUE;
            }
            ((e)v8).w(0L, l9);
        }
    }

    public long a(E e8, long l8, boolean bl) {
        return this.b(e8, l8, bl, new boolean[this.i.length]);
    }

    public long b(E e8, long l8, boolean bl, boolean[] arrbl) {
        int n8 = 0;
        do {
            int n9 = e8.a;
            boolean bl2 = true;
            if (n8 >= n9) break;
            boolean[] arrbl2 = this.h;
            if (bl || !e8.b(this.n, n8)) {
                bl2 = false;
            }
            arrbl2[n8] = bl2;
            ++n8;
        } while (true);
        this.h(this.c);
        this.g();
        this.n = e8;
        this.i();
        l8 = this.a.i(e8.c, this.h, this.c, arrbl, l8);
        this.c(this.c);
        this.e = false;
        for (n8 = 0; n8 < (arrbl = this.c).length; ++n8) {
            if (arrbl[n8] != null) {
                g0.a.f(e8.c(n8));
                if (this.i[n8].l() == -2) continue;
                this.e = true;
                continue;
            }
            bl = e8.c[n8] == null;
            g0.a.f(bl);
        }
        return l8;
    }

    public final void c(Q[] arrq) {
        a1[] arra1;
        for (int i8 = 0; i8 < (arra1 = this.i).length; ++i8) {
            if (arra1[i8].l() != -2 || !this.n.c(i8)) continue;
            arrq[i8] = new x0.o();
        }
    }

    public boolean d(C0 c02) {
        if (E0.d(this.f.e, c02.e)) {
            C0 c03 = this.f;
            if (c03.b == c02.b && c03.a.equals(c02.a)) {
                return true;
            }
        }
        return false;
    }

    public void e(long l8, float f8, long l9) {
        g0.a.f(this.t());
        l8 = this.A(l8);
        this.a.g(new y0.b().f(l8).g(f8).e(l9).d());
    }

    public final void g() {
        if (!this.t()) {
            return;
        }
        int n8 = 0;
        do {
            Object object = this.n;
            if (n8 >= object.a) break;
            boolean bl = object.c(n8);
            object = this.n.c[n8];
            if (bl && object != null) {
                object.g();
            }
            ++n8;
        } while (true);
    }

    public final void h(Q[] arrq) {
        a1[] arra1;
        for (int i8 = 0; i8 < (arra1 = this.i).length; ++i8) {
            if (arra1[i8].l() != -2) continue;
            arrq[i8] = null;
        }
    }

    public final void i() {
        if (!this.t()) {
            return;
        }
        int n8 = 0;
        do {
            Object object = this.n;
            if (n8 >= object.a) break;
            boolean bl = object.c(n8);
            object = this.n.c[n8];
            if (bl && object != null) {
                object.j();
            }
            ++n8;
        } while (true);
    }

    public long j() {
        if (!this.d) {
            return this.f.b;
        }
        long l8 = this.e ? this.a.f() : Long.MIN_VALUE;
        long l9 = l8;
        if (l8 == Long.MIN_VALUE) {
            l9 = this.f.e;
        }
        return l9;
    }

    public B0 k() {
        return this.l;
    }

    public long l() {
        if (!this.d) {
            return 0L;
        }
        return this.a.c();
    }

    public long m() {
        return this.o;
    }

    public long n() {
        return this.f.b + this.o;
    }

    public Z o() {
        return this.m;
    }

    public E p() {
        return this.n;
    }

    public void q(float f8, I object) {
        this.d = true;
        this.m = this.a.n();
        object = this.x(f8, (I)object);
        C0 c02 = this.f;
        long l8 = c02.b;
        long l9 = c02.e;
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            l10 = l8;
            if (l8 >= l9) {
                l10 = Math.max((long)0L, (long)(l9 - 1L));
            }
        }
        l10 = this.a((E)object, l10, false);
        l8 = this.o;
        object = this.f;
        this.o = l8 + (object.b - l10);
        this.f = object.b(l10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean r() {
        int n8;
        int n9;
        Q[] arrq;
        block7 : {
            if (this.d) break block7;
            this.a.p();
            return false;
        }
        try {
            arrq = this.c;
            n8 = arrq.length;
            n9 = 0;
        }
        catch (IOException iOException) {
            return true;
        }
        while (n9 < n8) {
            Q q8 = arrq[n9];
            if (q8 != null) {
                q8.a();
            }
            ++n9;
        }
        return false;
    }

    public boolean s() {
        if (this.d && (!this.e || this.a.f() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.l == null) {
            return true;
        }
        return false;
    }

    public void u(long l8) {
        g0.a.f(this.t());
        if (this.d) {
            this.a.h(this.A(l8));
        }
    }

    public void v() {
        this.g();
        B0.w(this.k, this.a);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public E x(float var1_1, I var2_2) {
        var2_2 = this.j.k(this.i, this.o(), this.f.a, (I)var2_2);
        var4_3 = 0;
        for (var3_4 = 0; var3_4 < var2_2.a; ++var3_4) {
            block6 : {
                block5 : {
                    var6_5 = var2_2.c(var3_4);
                    var7_6 = true;
                    if (!var6_5) break block5;
                    var6_5 = var7_6;
                    if (var2_2.c[var3_4] != null) break block6;
                    if (this.i[var3_4].l() != -2) ** GOTO lbl-1000
                    var6_5 = var7_6;
                    break block6;
                }
                if (var2_2.c[var3_4] == null) {
                    var6_5 = var7_6;
                } else lbl-1000: // 2 sources:
                {
                    var6_5 = false;
                }
            }
            g0.a.f(var6_5);
        }
        var8_7 = var2_2.c;
        var5_8 = var8_7.length;
        var3_4 = var4_3;
        while (var3_4 < var5_8) {
            var9_9 = var8_7[var3_4];
            if (var9_9 != null) {
                var9_9.r(var1_1);
            }
            ++var3_4;
        }
        return var2_2;
    }

    public void y(B0 b02) {
        if (b02 == this.l) {
            return;
        }
        this.g();
        this.l = b02;
        this.i();
    }

    public void z(long l8) {
        this.o = l8;
    }

    public static interface a {
        public B0 a(C0 var1, long var2);
    }

}

