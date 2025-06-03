/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package k0;

import d0.I;
import d0.q;
import g0.M;
import g0.a;
import g0.c;
import j0.i;
import k0.A0;
import k0.X0;
import k0.Y0;
import k0.Z0;
import k0.a1;
import k0.b1;
import k0.u;
import k0.v0;
import l0.y1;
import x0.Q;
import x0.x;

public abstract class n
implements Y0,
a1 {
    public long A;
    public boolean B;
    public boolean C;
    public I D;
    public a1.a E;
    public final Object o = new Object();
    public final int p;
    public final v0 q;
    public b1 r;
    public int s;
    public y1 t;
    public c u;
    public int v;
    public Q w;
    public q[] x;
    public long y;
    public long z;

    public n(int n8) {
        this.p = n8;
        this.q = new v0();
        this.A = Long.MIN_VALUE;
        this.D = I.a;
    }

    @Override
    public final boolean A() {
        return this.B;
    }

    @Override
    public A0 B() {
        return null;
    }

    @Override
    public final void C(b1 b12, q[] arrq, Q q8, long l8, boolean bl, boolean bl2, long l9, long l10, x.b b8) {
        boolean bl3 = this.v == 0;
        a.f(bl3);
        this.r = b12;
        this.v = 1;
        this.U(bl, bl2);
        this.F(arrq, q8, l9, l10, b8);
        this.f0(l9, bl);
    }

    @Override
    public final void D(int n8, y1 y12, c c8) {
        this.s = n8;
        this.t = y12;
        this.u = c8;
        this.V();
    }

    @Override
    public final void E(I i8) {
        if (!M.c(this.D, i8)) {
            this.D = i8;
            this.d0(i8);
        }
    }

    @Override
    public final void F(q[] arrq, Q q8, long l8, long l9, x.b b8) {
        a.f(this.B ^ true);
        this.w = q8;
        if (this.A == Long.MIN_VALUE) {
            this.A = l8;
        }
        this.x = arrq;
        this.y = l9;
        this.c0(arrq, l8, l9, b8);
    }

    @Override
    public final a1 G() {
        return this;
    }

    @Override
    public /* synthetic */ void I(float f8, float f9) {
        X0.c(this, f8, f9);
    }

    public final u J(Throwable throwable, q q8, int n8) {
        return this.K(throwable, q8, false, n8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final u K(Throwable var1_1, q var2_3, boolean var3_4, int var4_5) {
        if (var2_3 == null || this.C) ** GOTO lbl12
        this.C = true;
        try {
            var5_6 = Z0.h(this.a(var2_3));
        }
        catch (Throwable var1_2) {
            this.C = false;
            throw var1_2;
        }
        this.C = false;
        ** GOTO lbl13
lbl10: // 1 sources:
        do {
            this.C = false;
lbl12: // 2 sources:
            var5_6 = 4;
lbl13: // 2 sources:
            return u.b(var1_1, this.d(), this.O(), var2_3, var5_6, var3_4, var4_5);
            break;
        } while (true);
        catch (u var6_7) {
            ** continue;
        }
    }

    public final c L() {
        return (c)a.e(this.u);
    }

    public final b1 M() {
        return (b1)a.e(this.r);
    }

    public final v0 N() {
        this.q.a();
        return this.q;
    }

    public final int O() {
        return this.s;
    }

    public final long P() {
        return this.z;
    }

    public final y1 Q() {
        return (y1)a.e(this.t);
    }

    public final q[] R() {
        return (q[])a.e(this.x);
    }

    public final boolean S() {
        if (this.p()) {
            return this.B;
        }
        return ((Q)a.e(this.w)).e();
    }

    public abstract void T();

    public void U(boolean bl, boolean bl2) {
    }

    public void V() {
    }

    public abstract void W(long var1, boolean var3);

    public void X() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void Y() {
        Object object = this.o;
        // MONITORENTER : object
        a1.a a8 = this.E;
        // MONITOREXIT : object
        if (a8 == null) return;
        a8.a(this);
    }

    public void Z() {
    }

    public void a0() {
    }

    @Override
    public final void b() {
        boolean bl = this.v == 0;
        a.f(bl);
        this.q.a();
        this.Z();
    }

    public void b0() {
    }

    public void c0(q[] arrq, long l8, long l9, x.b b8) {
    }

    public void d0(I i8) {
    }

    public final int e0(v0 v02, i object, int n8) {
        n8 = ((Q)a.e(this.w)).j(v02, (i)object, n8);
        if (n8 == -4) {
            long l8;
            if (object.p()) {
                this.A = Long.MIN_VALUE;
                if (this.B) {
                    return -4;
                }
                return -3;
            }
            object.t = l8 = object.t + this.y;
            this.A = Math.max((long)this.A, (long)l8);
            return n8;
        }
        if (n8 == -5) {
            object = (q)a.e(v02.b);
            if (object.s != Long.MAX_VALUE) {
                v02.b = object.a().s0(object.s + this.y).K();
            }
        }
        return n8;
    }

    public final void f0(long l8, boolean bl) {
        this.B = false;
        this.z = l8;
        this.A = l8;
        this.W(l8, bl);
    }

    @Override
    public final void g() {
        int n8 = this.v;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.f(bl);
        this.q.a();
        this.v = 0;
        this.w = null;
        this.x = null;
        this.B = false;
        this.T();
    }

    public int g0(long l8) {
        return ((Q)a.e(this.w)).m(l8 - this.y);
    }

    @Override
    public final int getState() {
        return this.v;
    }

    @Override
    public final Q i() {
        return this.w;
    }

    @Override
    public /* synthetic */ void j() {
        X0.a(this);
    }

    @Override
    public final int l() {
        return this.p;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o() {
        Object object = this.o;
        synchronized (object) {
            this.E = null;
            return;
        }
    }

    @Override
    public final boolean p() {
        if (this.A == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ long q(long l8, long l9) {
        return X0.b(this, l8, l9);
    }

    @Override
    public final void release() {
        boolean bl = this.v == 0;
        a.f(bl);
        this.X();
    }

    @Override
    public int s() {
        return 0;
    }

    @Override
    public final void start() {
        int n8 = this.v;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.f(bl);
        this.v = 2;
        this.a0();
    }

    @Override
    public final void stop() {
        boolean bl = this.v == 2;
        a.f(bl);
        this.v = 1;
        this.b0();
    }

    @Override
    public void t(int n8, Object object) {
    }

    @Override
    public final void u() {
        this.B = true;
    }

    @Override
    public final void v() {
        ((Q)a.e(this.w)).a();
    }

    @Override
    public final long w() {
        return this.A;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void x(a1.a a8) {
        Object object = this.o;
        synchronized (object) {
            this.E = a8;
            return;
        }
    }

    @Override
    public final void z(long l8) {
        this.f0(l8, false);
    }
}

