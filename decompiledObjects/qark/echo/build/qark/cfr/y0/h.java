/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package y0;

import B0.m;
import B0.n;
import android.net.Uri;
import d0.q;
import g0.M;
import g0.o;
import i0.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k0.d1;
import k0.v0;
import k0.y0;
import p0.v;
import p0.x;
import x0.E;
import x0.P;
import x0.Q;
import x0.S;
import x0.r;
import x0.u;
import y0.c;
import y0.e;
import y0.f;
import y0.g;
import y0.i;
import y0.l;

public class h
implements Q,
S,
n.b,
n.f {
    public final P A;
    public final P[] B;
    public final c C;
    public e D;
    public q E;
    public b F;
    public long G;
    public long H;
    public int I;
    public y0.a J;
    public boolean K;
    public final int o;
    public final int[] p;
    public final q[] q;
    public final boolean[] r;
    public final i s;
    public final S.a t;
    public final E.a u;
    public final m v;
    public final n w;
    public final g x;
    public final ArrayList y;
    public final List z;

    public h(int n8, int[] arrn, q[] arrq, i object, S.a a8, B0.b b8, long l8, x x8, v.a a9, m m8, E.a a10) {
        this.o = n8;
        int n9 = 0;
        int[] arrn2 = arrn;
        if (arrn == null) {
            arrn2 = new int[]{};
        }
        this.p = arrn2;
        arrn = arrq;
        if (arrq == null) {
            arrn = new q[]{};
        }
        this.q = arrn;
        this.s = object;
        this.t = a8;
        this.u = a10;
        this.v = m8;
        this.w = new n("ChunkSampleStream");
        this.x = new g();
        arrn = new int[]();
        this.y = arrn;
        this.z = Collections.unmodifiableList((List)arrn);
        int n10 = arrn2.length;
        this.B = new P[n10];
        this.r = new boolean[n10];
        int n11 = n10 + 1;
        arrn = new int[n11];
        arrq = new P[n11];
        this.A = object = P.k(b8, x8, a9);
        arrn[0] = n8;
        arrq[0] = object;
        n8 = n9;
        while (n8 < n10) {
            this.B[n8] = object = P.l(b8);
            n9 = n8 + 1;
            arrq[n9] = object;
            arrn[n9] = this.p[n8];
            n8 = n9;
        }
        this.C = new c(arrn, (P[])arrq);
        this.G = l8;
        this.H = l8;
    }

    private void C(int n8) {
        block4 : {
            g0.a.f(this.w.j() ^ true);
            int n9 = this.y.size();
            while (n8 < n9) {
                if (this.G(n8)) {
                    ++n8;
                    continue;
                }
                break block4;
            }
            n8 = -1;
        }
        if (n8 == -1) {
            return;
        }
        long l8 = this.F().h;
        y0.a a8 = this.D(n8);
        if (this.y.isEmpty()) {
            this.G = this.H;
        }
        this.K = false;
        this.u.C(this.o, a8.g, l8);
    }

    private boolean H(e e8) {
        return e8 instanceof y0.a;
    }

    private void Q() {
        this.A.W();
        P[] arrp = this.B;
        int n8 = arrp.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrp[i8].W();
        }
    }

    public final void B(int n8) {
        if ((n8 = Math.min((int)this.O(n8, 0), (int)this.I)) > 0) {
            M.U0((List)this.y, 0, n8);
            this.I -= n8;
        }
    }

    public final y0.a D(int n8) {
        y0.a a8 = (y0.a)this.y.get(n8);
        Object object = this.y;
        M.U0((List)object, n8, object.size());
        this.I = Math.max((int)this.I, (int)this.y.size());
        object = this.A;
        n8 = 0;
        do {
            object.u(a8.i(n8));
            object = this.B;
            if (n8 >= object.length) break;
            object = object[n8];
            ++n8;
        } while (true);
        return a8;
    }

    public i E() {
        return this.s;
    }

    public final y0.a F() {
        ArrayList arrayList = this.y;
        return (y0.a)arrayList.get(arrayList.size() - 1);
    }

    public final boolean G(int n8) {
        P[] arrp;
        y0.a a8 = (y0.a)this.y.get(n8);
        if (this.A.D() > a8.i(0)) {
            return true;
        }
        n8 = 0;
        while (n8 < (arrp = this.B).length) {
            int n9;
            int n10 = arrp[n8].D();
            n8 = n9 = n8 + 1;
            if (n10 <= a8.i(n9)) continue;
            return true;
        }
        return false;
    }

    public boolean I() {
        if (this.G != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void J() {
        int n8;
        int n9 = this.O(this.A.D(), this.I - 1);
        while ((n8 = this.I) <= n9) {
            this.I = n8 + 1;
            this.K(n8);
        }
    }

    public final void K(int n8) {
        y0.a a8 = (y0.a)this.y.get(n8);
        q q8 = a8.d;
        if (!q8.equals(this.E)) {
            this.u.h(this.o, q8, a8.e, a8.f, a8.g);
        }
        this.E = q8;
    }

    public void L(e e8, long l8, long l9, boolean bl) {
        this.D = null;
        this.J = null;
        r r8 = new r(e8.a, e8.b, e8.f(), e8.e(), l8, l9, e8.a());
        this.v.a(e8.a);
        this.u.q(r8, e8.c, this.o, e8.d, e8.e, e8.f, e8.g, e8.h);
        if (!bl) {
            if (this.I()) {
                this.Q();
            } else if (this.H(e8)) {
                this.D(this.y.size() - 1);
                if (this.y.isEmpty()) {
                    this.G = this.H;
                }
            }
            this.t.e(this);
        }
    }

    public void M(e e8, long l8, long l9) {
        this.D = null;
        this.s.g(e8);
        r r8 = new r(e8.a, e8.b, e8.f(), e8.e(), l8, l9, e8.a());
        this.v.a(e8.a);
        this.u.t(r8, e8.c, this.o, e8.d, e8.e, e8.f, e8.g, e8.h);
        this.t.e(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public n.c N(e var1_1, long var2_2, long var4_3, IOException var6_4, int var7_5) {
        var9_6 = var1_1.a();
        var12_7 = this.H(var1_1);
        var8_8 = this.y.size() - 1;
        var11_9 = var9_6 == 0L || !var12_7 || !this.G(var8_8);
        var15_10 = new r(var1_1.a, var1_1.b, var1_1.f(), var1_1.e(), var2_2, var4_3, var9_6);
        var16_11 = new m.c(var15_10, new u(var1_1.c, this.o, var1_1.d, var1_1.e, var1_1.f, M.i1(var1_1.g), M.i1(var1_1.h)), var6_4, var7_5);
        if (!this.s.e(var1_1, var11_9, var16_11, this.v)) ** GOTO lbl19
        if (var11_9) {
            var13_13 = var14_12 = n.f;
            if (var12_7) {
                var11_9 = this.D(var8_8) == var1_1;
                g0.a.f(var11_9);
                var13_13 = var14_12;
                if (this.y.isEmpty()) {
                    this.G = this.H;
                    var13_13 = var14_12;
                }
            }
        } else {
            o.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
lbl19: // 2 sources:
            var13_13 = null;
        }
        var14_12 = var13_13;
        if (var13_13 == null) {
            var2_2 = this.v.c(var16_11);
            var14_12 = var2_2 != -9223372036854775807L ? n.h(false, var2_2) : n.g;
        }
        var11_9 = var14_12.c() ^ true;
        this.u.v(var15_10, var1_1.c, this.o, var1_1.d, var1_1.e, var1_1.f, var1_1.g, var1_1.h, var6_4, var11_9);
        if (var11_9 == false) return var14_12;
        this.D = null;
        this.v.a(var1_1.a);
        this.t.e(this);
        return var14_12;
    }

    public final int O(int n8, int n9) {
        int n10;
        while ((n10 = n9 + 1) < this.y.size()) {
            n9 = n10;
            if (((y0.a)this.y.get(n10)).i(0) <= n8) continue;
            return n10 - 1;
        }
        return this.y.size() - 1;
    }

    public void P(b arrp) {
        this.F = arrp;
        this.A.S();
        arrp = this.B;
        int n8 = arrp.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrp[i8].S();
        }
        this.w.m(this);
    }

    public void R(long l8) {
        boolean bl;
        int n8;
        int n9;
        P[] arrp;
        int n10;
        block10 : {
            this.H = l8;
            if (this.I()) {
                this.G = l8;
                return;
            }
            n9 = 0;
            n8 = 0;
            for (n10 = 0; n10 < this.y.size(); ++n10) {
                arrp = (y0.a)this.y.get(n10);
                long l9 = arrp.g LCMP l8;
                if (l9 != false || arrp.k != -9223372036854775807L) {
                    if (l9 > 0) break;
                    continue;
                }
                break block10;
            }
            arrp = null;
        }
        if (arrp != null) {
            bl = this.A.Z(arrp.i(0));
        } else {
            arrp = this.A;
            bl = l8 < this.c();
            bl = arrp.a0(l8, bl);
        }
        if (bl) {
            this.I = this.O(this.A.D(), 0);
            arrp = this.B;
            n9 = arrp.length;
            for (n10 = n8; n10 < n9; ++n10) {
                arrp[n10].a0(l8, true);
            }
        } else {
            this.G = l8;
            this.K = false;
            this.y.clear();
            this.I = 0;
            if (this.w.j()) {
                this.A.r();
                arrp = this.B;
                n8 = arrp.length;
                for (n10 = n9; n10 < n8; ++n10) {
                    arrp[n10].r();
                }
                this.w.f();
                return;
            }
            this.w.g();
            this.Q();
        }
    }

    public a S(long l8, int n8) {
        for (int i8 = 0; i8 < this.B.length; ++i8) {
            if (this.p[i8] != n8) continue;
            g0.a.f(this.r[i8] ^ true);
            this.r[i8] = true;
            this.B[i8].a0(l8, true);
            return new a(this, this.B[i8], i8);
        }
        throw new IllegalStateException();
    }

    @Override
    public void a() {
        this.w.a();
        this.A.O();
        if (!this.w.j()) {
            this.s.a();
        }
    }

    @Override
    public boolean b() {
        return this.w.j();
    }

    @Override
    public long c() {
        if (this.I()) {
            return this.G;
        }
        if (this.K) {
            return Long.MIN_VALUE;
        }
        return this.F().h;
    }

    public long d(long l8, d1 d12) {
        return this.s.d(l8, d12);
    }

    @Override
    public boolean e() {
        if (!this.I() && this.A.L(this.K)) {
            return true;
        }
        return false;
    }

    @Override
    public long f() {
        if (this.K) {
            return Long.MIN_VALUE;
        }
        if (this.I()) {
            return this.G;
        }
        long l8 = this.H;
        y0.a a8 = this.F();
        if (!a8.h()) {
            if (this.y.size() > 1) {
                a8 = this.y;
                a8 = (y0.a)a8.get(a8.size() - 2);
            } else {
                a8 = null;
            }
        }
        long l9 = l8;
        if (a8 != null) {
            l9 = Math.max((long)l8, (long)a8.h);
        }
        return Math.max((long)l9, (long)this.A.A());
    }

    @Override
    public boolean g(y0 object) {
        boolean bl = this.K;
        int n8 = 0;
        if (!bl && !this.w.j()) {
            long l8;
            Object object2;
            if (this.w.i()) {
                return false;
            }
            bl = this.I();
            if (bl) {
                object2 = Collections.emptyList();
                l8 = this.G;
            } else {
                object2 = this.z;
                l8 = this.F().h;
            }
            this.s.h((y0)object, l8, (List)object2, this.x);
            object2 = this.x;
            boolean bl2 = object2.b;
            object = object2.a;
            object2.a();
            if (bl2) {
                this.G = -9223372036854775807L;
                this.K = true;
                return true;
            }
            if (object == null) {
                return false;
            }
            this.D = object;
            if (this.H((e)object)) {
                object2 = (y0.a)object;
                if (bl) {
                    l8 = object2.g;
                    long l9 = this.G;
                    if (l8 != l9) {
                        this.A.c0(l9);
                        P[] arrp = this.B;
                        int n9 = arrp.length;
                        while (n8 < n9) {
                            arrp[n8].c0(this.G);
                            ++n8;
                        }
                    }
                    this.G = -9223372036854775807L;
                }
                object2.k(this.C);
                this.y.add(object2);
            } else if (object instanceof l) {
                ((l)object).g(this.C);
            }
            l8 = this.w.n((n.e)object, this, this.v.d(object.c));
            this.u.z(new r(object.a, object.b, l8), object.c, this.o, object.d, object.e, object.f, object.g, object.h);
            return true;
        }
        return false;
    }

    @Override
    public void h(long l8) {
        if (!this.w.i()) {
            if (this.I()) {
                return;
            }
            if (this.w.j()) {
                e e8 = (e)g0.a.e(this.D);
                if (this.H(e8) && this.G(this.y.size() - 1)) {
                    return;
                }
                if (this.s.b(l8, e8, this.z)) {
                    this.w.f();
                    if (this.H(e8)) {
                        this.J = (y0.a)e8;
                    }
                }
                return;
            }
            int n8 = this.s.f(l8, this.z);
            if (n8 < this.y.size()) {
                this.C(n8);
            }
        }
    }

    @Override
    public int j(v0 v02, j0.i i8, int n8) {
        if (this.I()) {
            return -3;
        }
        y0.a a8 = this.J;
        if (a8 != null && a8.i(0) <= this.A.D()) {
            return -3;
        }
        this.J();
        return this.A.T(v02, i8, n8, this.K);
    }

    @Override
    public void k() {
        this.A.U();
        Object object = this.B;
        int n8 = object.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            object[i8].U();
        }
        this.s.release();
        object = this.F;
        if (object != null) {
            object.a(this);
        }
    }

    @Override
    public int m(long l8) {
        if (this.I()) {
            return 0;
        }
        int n8 = this.A.F(l8, this.K);
        y0.a a8 = this.J;
        int n9 = n8;
        if (a8 != null) {
            n9 = Math.min((int)n8, (int)(a8.i(0) - this.A.D()));
        }
        this.A.f0(n9);
        this.J();
        return n9;
    }

    public void q(long l8, boolean bl) {
        if (this.I()) {
            return;
        }
        int n8 = this.A.y();
        this.A.q(l8, bl, true);
        int n9 = this.A.y();
        if (n9 > n8) {
            P[] arrp;
            l8 = this.A.z();
            for (n8 = 0; n8 < (arrp = this.B).length; ++n8) {
                arrp[n8].q(l8, bl, this.r[n8]);
            }
        }
        this.B(n9);
    }

    public final class a
    implements Q {
        public final h o;
        public final P p;
        public final int q;
        public boolean r;

        public a(h h9, P p8, int n8) {
            this.o = h9;
            this.p = p8;
            this.q = n8;
        }

        @Override
        public void a() {
        }

        public final void b() {
            if (!this.r) {
                h.this.u.h(h.this.p[this.q], h.this.q[this.q], 0, null, h.this.H);
                this.r = true;
            }
        }

        public void c() {
            g0.a.f(h.this.r[this.q]);
            h.w((h)h.this)[this.q] = false;
        }

        @Override
        public boolean e() {
            if (!h.this.I() && this.p.L(h.this.K)) {
                return true;
            }
            return false;
        }

        @Override
        public int j(v0 v02, j0.i i8, int n8) {
            if (h.this.I()) {
                return -3;
            }
            if (h.this.J != null && h.this.J.i(this.q + 1) <= this.p.D()) {
                return -3;
            }
            this.b();
            return this.p.T(v02, i8, n8, h.this.K);
        }

        @Override
        public int m(long l8) {
            int n8;
            if (h.this.I()) {
                return 0;
            }
            int n9 = n8 = this.p.F(l8, h.this.K);
            if (h.this.J != null) {
                n9 = Math.min((int)n8, (int)(h.this.J.i(this.q + 1) - this.p.D()));
            }
            this.p.f0(n9);
            if (n9 > 0) {
                this.b();
            }
            return n9;
        }
    }

    public static interface b {
        public void a(h var1);
    }

}

