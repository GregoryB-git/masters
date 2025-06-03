/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package x0;

import A0.y;
import B0.m;
import B0.n;
import F0.D;
import F0.L;
import F0.M;
import F0.N;
import F0.T;
import F0.t;
import android.net.Uri;
import android.os.Handler;
import d0.A;
import d0.q;
import d0.x;
import g0.a;
import g0.o;
import g0.z;
import i0.g;
import i0.j;
import i0.k;
import j0.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k0.d1;
import k0.v0;
import k0.y0;
import p0.v;
import p0.x;
import x0.E;
import x0.F;
import x0.G;
import x0.H;
import x0.I;
import x0.J;
import x0.P;
import x0.Q;
import x0.S;
import x0.Z;
import x0.q;
import x0.r;
import x0.u;
import x0.v;

public final class K
implements v,
t,
n.b,
n.f,
P.d {
    public static final Map c0 = K.M();
    public static final d0.q d0 = new q.b().a0("icy").o0("application/x-icy").K();
    public final F A;
    public final g0.f B;
    public final Runnable C;
    public final Runnable D;
    public final Handler E;
    public v.a F;
    public S0.b G;
    public P[] H;
    public e[] I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public f N;
    public M O;
    public long P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public long W;
    public long X;
    public boolean Y;
    public int Z;
    public boolean a0;
    public boolean b0;
    public final Uri o;
    public final g p;
    public final x q;
    public final m r;
    public final E.a s;
    public final v.a t;
    public final c u;
    public final B0.b v;
    public final String w;
    public final long x;
    public final long y;
    public final n z;

    public K(Uri uri, g g8, F f8, x x8, v.a a8, m m8, E.a a9, c c8, B0.b b8, String string2, int n8, long l8) {
        this.o = uri;
        this.p = g8;
        this.q = x8;
        this.t = a8;
        this.r = m8;
        this.s = a9;
        this.u = c8;
        this.v = b8;
        this.w = string2;
        this.x = n8;
        this.z = new n("ProgressiveMediaPeriod");
        this.A = f8;
        this.y = l8;
        this.B = new g0.f();
        this.C = new G(this);
        this.D = new H(this);
        this.E = g0.M.A();
        this.I = new e[0];
        this.H = new P[0];
        this.X = -9223372036854775807L;
        this.R = 1;
    }

    public static /* synthetic */ Runnable A(K k8) {
        return k8.D;
    }

    public static /* synthetic */ Handler B(K k8) {
        return k8.E;
    }

    public static /* synthetic */ void G(K k8) {
        k8.a0();
    }

    public static /* synthetic */ S0.b H(K k8) {
        return k8.G;
    }

    public static /* synthetic */ S0.b I(K k8, S0.b b8) {
        k8.G = b8;
        return b8;
    }

    public static /* synthetic */ d0.q J() {
        return d0;
    }

    public static Map M() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"Icy-MetaData", (Object)"1");
        return Collections.unmodifiableMap((Map)hashMap);
    }

    private boolean Q() {
        if (this.X != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    private void V() {
        block11 : {
            int n8;
            if (this.b0 || this.K || !this.J) break block11;
            if (this.O == null) {
                return;
            }
            Object object = this.H;
            int n9 = object.length;
            for (n8 = 0; n8 < n9; ++n8) {
                if (object[n8].G() != null) continue;
                return;
            }
            this.B.c();
            n9 = this.H.length;
            d0.J[] arrj = new d0.J[n9];
            boolean[] arrbl = new boolean[n9];
            for (n8 = 0; n8 < n9; ++n8) {
                Object object2;
                block12 : {
                    boolean bl;
                    block14 : {
                        d0.q q8;
                        S0.b b8;
                        block13 : {
                            q8 = (d0.q)a.e(this.H[n8].G());
                            object = q8.n;
                            bl = d0.z.o((String)object);
                            boolean bl2 = bl || d0.z.s((String)object);
                            arrbl[n8] = bl2;
                            this.L = bl2 | this.L;
                            bl2 = d0.z.p((String)object);
                            bl2 = this.y != -9223372036854775807L && n9 == 1 && bl2;
                            this.M = bl2;
                            b8 = this.G;
                            object2 = q8;
                            if (b8 == null) break block12;
                            if (bl) break block13;
                            object = q8;
                            if (!this.I[n8].b) break block14;
                        }
                        object = (object = q8.k) == null ? new d0.x(b8) : object.a(b8);
                        object = q8.a().h0((d0.x)object).K();
                    }
                    object2 = object;
                    if (bl) {
                        object2 = object;
                        if (object.g == -1) {
                            object2 = object;
                            if (object.h == -1) {
                                object2 = object;
                                if (b8.o != -1) {
                                    object2 = object.a().M(b8.o).K();
                                }
                            }
                        }
                    }
                }
                object = object2.b(this.q.b((d0.q)object2));
                arrj[n8] = new d0.J(Integer.toString((int)n8), new d0.q[]{object});
            }
            this.N = new f(new Z(arrj), arrbl);
            if (this.M && this.P == -9223372036854775807L) {
                this.P = this.y;
                this.O = new D(this.O){

                    @Override
                    public long l() {
                        return K.this.P;
                    }
                };
            }
            this.u.q(this.P, this.O.h(), this.Q);
            this.K = true;
            ((v.a)a.e(this.F)).k(this);
        }
    }

    public static /* synthetic */ void v(K k8, M m8) {
        k8.U(m8);
    }

    public static /* synthetic */ void w(K k8) {
        k8.V();
    }

    public static /* synthetic */ void x(K k8) {
        k8.S();
    }

    public static /* synthetic */ void y(K k8) {
        k8.T();
    }

    public static /* synthetic */ long z(K k8) {
        return k8.x;
    }

    public final void K() {
        a.f(this.K);
        a.e(this.N);
        a.e(this.O);
    }

    public final boolean L(b b8, int n8) {
        P[] arrp;
        if (!(this.V || (arrp = this.O) != null && arrp.l() != -9223372036854775807L)) {
            boolean bl = this.K;
            if (bl && !this.l0()) {
                this.Y = true;
                return false;
            }
            this.T = this.K;
            this.W = 0L;
            this.Z = 0;
            arrp = this.H;
            int n9 = arrp.length;
            for (n8 = 0; n8 < n9; ++n8) {
                arrp[n8].W();
            }
            b8.j(0L, 0L);
            return true;
        }
        this.Z = n8;
        return true;
    }

    public final int N() {
        P[] arrp = this.H;
        int n8 = arrp.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += arrp[i8].H();
        }
        return n9;
    }

    public final long O(boolean bl) {
        long l8 = Long.MIN_VALUE;
        for (int i8 = 0; i8 < this.H.length; ++i8) {
            long l9;
            block4 : {
                block3 : {
                    if (bl) break block3;
                    l9 = l8;
                    if (!((f)a.e((Object)this.N)).c[i8]) break block4;
                }
                l9 = Math.max((long)l8, (long)this.H[i8].A());
            }
            l8 = l9;
        }
        return l8;
    }

    public T P() {
        return this.e0(new e(0, true));
    }

    public boolean R(int n8) {
        if (!this.l0() && this.H[n8].L(this.a0)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void S() {
        if (!this.b0) {
            ((v.a)a.e(this.F)).e(this);
        }
    }

    public final /* synthetic */ void T() {
        this.V = true;
    }

    public final /* synthetic */ void U(M m8) {
        this.i0(m8);
    }

    public final void W(int n8) {
        this.K();
        Object object = this.N;
        boolean[] arrbl = object.d;
        if (!arrbl[n8]) {
            object = object.a.b(n8).a(0);
            this.s.h(d0.z.k(object.n), (d0.q)object, 0, null, this.W);
            arrbl[n8] = true;
        }
    }

    public final void X(int n8) {
        this.K();
        P[] arrp = this.N.b;
        if (this.Y && arrp[n8]) {
            arrp = this.H[n8];
            if (arrp.L(false)) {
                return;
            }
            this.X = 0L;
            this.Y = false;
            this.T = true;
            this.W = 0L;
            this.Z = 0;
            arrp = this.H;
            int n9 = arrp.length;
            for (n8 = 0; n8 < n9; ++n8) {
                arrp[n8].W();
            }
            ((v.a)a.e(this.F)).e(this);
        }
    }

    public void Y() {
        this.z.k(this.r.d(this.R));
    }

    public void Z(int n8) {
        this.H[n8].O();
        this.Y();
    }

    @Override
    public T a(int n8, int n9) {
        return this.e0(new e(n8, false));
    }

    public final void a0() {
        this.E.post((Runnable)new I(this));
    }

    @Override
    public boolean b() {
        if (this.z.j() && this.B.d()) {
            return true;
        }
        return false;
    }

    public void b0(b arrp, long l8, long l9, boolean bl) {
        Object object = ((b)arrp).c;
        object = new r(((b)arrp).a, ((b)arrp).k, object.r(), object.s(), l8, l9, object.q());
        this.r.a(((b)arrp).a);
        this.s.q((r)object, 1, -1, null, 0, null, ((b)arrp).j, this.P);
        if (!bl) {
            arrp = this.H;
            int n8 = arrp.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrp[i8].W();
            }
            if (this.U > 0) {
                ((v.a)a.e(this.F)).e(this);
            }
        }
    }

    @Override
    public long c() {
        return this.f();
    }

    public void c0(b b8, long l8, long l9) {
        Object object;
        if (this.P == -9223372036854775807L && (object = this.O) != null) {
            boolean bl = object.h();
            long l10 = this.O(true);
            l10 = l10 == Long.MIN_VALUE ? 0L : (l10 += 10000L);
            this.P = l10;
            this.u.q(l10, bl, this.Q);
        }
        object = b8.c;
        object = new r(b8.a, b8.k, object.r(), object.s(), l8, l9, object.q());
        this.r.a(b8.a);
        this.s.t((r)object, 1, -1, null, 0, null, b8.j, this.P);
        this.a0 = true;
        ((v.a)a.e(this.F)).e(this);
    }

    @Override
    public long d(long l8, d1 d12) {
        this.K();
        if (!this.O.h()) {
            return 0L;
        }
        M.a a8 = this.O.j(l8);
        return d12.a(l8, a8.a.a, a8.b.a);
    }

    public n.c d0(b b8, long l8, long l9, IOException iOException, int n8) {
        boolean bl;
        Object object = b8.c;
        r r8 = new r(b8.a, b8.k, object.r(), object.s(), l8, l9, object.q());
        object = new u(1, -1, null, 0, null, g0.M.i1(b8.j), g0.M.i1(this.P));
        l8 = this.r.c(new m.c(r8, (u)object, iOException, n8));
        if (l8 == -9223372036854775807L) {
            object = n.g;
        } else {
            n8 = this.N();
            bl = n8 > this.Z;
            object = this.L(b8, n8) ? n.h(bl, l8) : n.f;
        }
        bl = object.c() ^ true;
        this.s.v(r8, 1, -1, null, 0, null, b8.j, this.P, iOException, bl);
        if (bl) {
            this.r.a(b8.a);
        }
        return object;
    }

    @Override
    public void e(M m8) {
        this.E.post((Runnable)new J(this, m8));
    }

    public final T e0(e arrobject) {
        int n8;
        int n9 = this.H.length;
        for (n8 = 0; n8 < n9; ++n8) {
            if (!arrobject.equals(this.I[n8])) continue;
            return this.H[n8];
        }
        if (this.J) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Extractor added new track (id=");
            stringBuilder.append(arrobject.a);
            stringBuilder.append(") after finishing tracks.");
            o.h("ProgressiveMediaPeriod", stringBuilder.toString());
            return new F0.n();
        }
        P p8 = P.k(this.v, this.q, this.t);
        p8.e0(this);
        Object[] arrobject2 = this.I;
        n8 = n9 + 1;
        arrobject2 = (e[])Arrays.copyOf((Object[])arrobject2, (int)n8);
        arrobject2[n9] = arrobject;
        this.I = (e[])g0.M.j(arrobject2);
        arrobject = (P[])Arrays.copyOf((Object[])this.H, (int)n8);
        arrobject[n9] = p8;
        this.H = (P[])g0.M.j(arrobject);
        return p8;
    }

    @Override
    public long f() {
        this.K();
        if (!this.a0) {
            long l8;
            long l9;
            if (this.U == 0) {
                return Long.MIN_VALUE;
            }
            if (this.Q()) {
                return this.X;
            }
            if (this.L) {
                int n8 = this.H.length;
                int n9 = 0;
                l8 = Long.MAX_VALUE;
                do {
                    l9 = l8;
                    if (n9 < n8) {
                        f f8 = this.N;
                        l9 = l8;
                        if (f8.b[n9]) {
                            l9 = l8;
                            if (f8.c[n9]) {
                                l9 = l8;
                                if (!this.H[n9].K()) {
                                    l9 = Math.min((long)l8, (long)this.H[n9].A());
                                }
                            }
                        }
                        ++n9;
                        l8 = l9;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                l9 = Long.MAX_VALUE;
            }
            l8 = l9;
            if (l9 == Long.MAX_VALUE) {
                l8 = this.O(false);
            }
            l9 = l8;
            if (l8 == Long.MIN_VALUE) {
                l9 = this.W;
            }
            return l9;
        }
        return Long.MIN_VALUE;
    }

    public int f0(int n8, v0 v02, i i8, int n9) {
        if (this.l0()) {
            return -3;
        }
        this.W(n8);
        n9 = this.H[n8].T(v02, i8, n9, this.a0);
        if (n9 == -3) {
            this.X(n8);
        }
        return n9;
    }

    @Override
    public boolean g(y0 y02) {
        if (!(this.a0 || this.z.i() || this.Y || this.K && this.U == 0)) {
            boolean bl = this.B.e();
            if (!this.z.j()) {
                this.k0();
                bl = true;
            }
            return bl;
        }
        return false;
    }

    public void g0() {
        if (this.K) {
            P[] arrp = this.H;
            int n8 = arrp.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrp[i8].S();
            }
        }
        this.z.m(this);
        this.E.removeCallbacksAndMessages((Object)null);
        this.F = null;
        this.b0 = true;
    }

    @Override
    public void h(long l8) {
    }

    public final boolean h0(boolean[] arrbl, long l8) {
        int n8 = this.H.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            P p8 = this.H[i8];
            boolean bl = this.M ? p8.Z(p8.y()) : p8.a0(l8, false);
            if (bl || !arrbl[i8] && this.L) continue;
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
    public long i(y[] var1_1, boolean[] var2_2, Q[] var3_3, boolean[] var4_4, long var5_5) {
        block13 : {
            this.K();
            var18_6 = this.N;
            var17_7 = var18_6.a;
            var18_6 = var18_6.c;
            var8_8 = this.U;
            var11_9 = 0;
            var12_10 = 0;
            var10_11 = 0;
            for (var7_12 = 0; var7_12 < var1_1.length; ++var7_12) {
                var19_14 = var3_3[var7_12];
                if (var19_14 == null || var1_1[var7_12] != null && var2_2[var7_12] != false) continue;
                var9_13 = d.b((d)var19_14);
                a.f(var18_6[var9_13]);
                --this.U;
                var18_6[var9_13] = false;
                var3_3[var7_12] = null;
            }
            var7_12 = (this.S != false ? var8_8 == 0 : var5_5 != 0L && this.M == false) ? 1 : 0;
            var9_13 = var7_12;
            for (var8_8 = 0; var8_8 < var1_1.length; ++var8_8) {
                var7_12 = var9_13;
                if (var3_3[var8_8] == null) {
                    var2_2 = var1_1[var8_8];
                    var7_12 = var9_13;
                    if (var2_2 != null) {
                        var16_16 = var2_2.length() == 1;
                        a.f(var16_16);
                        var16_16 = var2_2.c(0) == 0;
                        a.f(var16_16);
                        var13_15 = var17_7.d(var2_2.d());
                        a.f(var18_6[var13_15] ^ true);
                        ++this.U;
                        var18_6[var13_15] = true;
                        var3_3[var8_8] = new d(var13_15);
                        var4_4[var8_8] = true;
                        var7_12 = var9_13;
                        if (var9_13 == 0) {
                            var2_2 = this.H[var13_15];
                            var7_12 = var2_2.D() != 0 && var2_2.a0(var5_5, true) == false ? 1 : 0;
                        }
                    }
                }
                var9_13 = var7_12;
            }
            if (this.U != 0) ** GOTO lbl65
            this.Y = false;
            this.T = false;
            if (this.z.j()) {
                var1_1 = this.H;
                var8_8 = var1_1.length;
                for (var7_12 = var10_11; var7_12 < var8_8; ++var7_12) {
                    var1_1[var7_12].r();
                }
                this.z.f();
                var14_17 = var5_5;
            } else {
                this.a0 = false;
                var1_1 = this.H;
                var8_8 = var1_1.length;
                var7_12 = var11_9;
                do {
                    var14_17 = var5_5;
                    if (var7_12 < var8_8) {
                        var1_1[var7_12].W();
                        ++var7_12;
                        continue;
                    }
                    break block13;
                    break;
                } while (true);
lbl65: // 1 sources:
                var14_17 = var5_5;
                if (var9_13 != 0) {
                    var5_5 = this.s(var5_5);
                    var7_12 = var12_10;
                    do {
                        var14_17 = var5_5;
                        if (var7_12 >= var3_3.length) break;
                        if (var3_3[var7_12] != null) {
                            var4_4[var7_12] = true;
                        }
                        ++var7_12;
                    } while (true);
                }
            }
        }
        this.S = true;
        return var14_17;
    }

    public final void i0(M m8) {
        M m9 = this.G == null ? m8 : new M.b(-9223372036854775807L);
        this.O = m9;
        this.P = m8.l();
        boolean bl = this.V;
        int n8 = 1;
        bl = !bl && m8.l() == -9223372036854775807L;
        this.Q = bl;
        if (bl) {
            n8 = 7;
        }
        this.R = n8;
        if (this.K) {
            this.u.q(this.P, m8.h(), this.Q);
            return;
        }
        this.V();
    }

    @Override
    public void j() {
        this.J = true;
        this.E.post(this.C);
    }

    public int j0(int n8, long l8) {
        if (this.l0()) {
            return 0;
        }
        this.W(n8);
        P p8 = this.H[n8];
        int n9 = p8.F(l8, this.a0);
        p8.f0(n9);
        if (n9 == 0) {
            this.X(n8);
        }
        return n9;
    }

    @Override
    public void k() {
        P[] arrp = this.H;
        int n8 = arrp.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrp[i8].U();
        }
        this.A.release();
    }

    public final void k0() {
        long l8;
        P[] arrp;
        b b8 = new b(this.o, this.p, this.A, this, this.B);
        if (this.K) {
            a.f(this.Q());
            l8 = this.P;
            if (l8 != -9223372036854775807L && this.X > l8) {
                this.a0 = true;
                this.X = -9223372036854775807L;
                return;
            }
            b8.j(((M)a.e((Object)this.O)).j((long)this.X).a.b, this.X);
            arrp = this.H;
            int n8 = arrp.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrp[i8].c0(this.X);
            }
            this.X = -9223372036854775807L;
        }
        this.Z = this.N();
        l8 = this.z.n(b8, this, this.r.d(this.R));
        arrp = b8.k;
        this.s.z(new r(b8.a, (k)arrp, l8), 1, -1, null, 0, null, b8.j, this.P);
    }

    @Override
    public long l() {
        if (this.T && (this.a0 || this.N() > this.Z)) {
            this.T = false;
            return this.W;
        }
        return -9223372036854775807L;
    }

    public final boolean l0() {
        if (!this.T && !this.Q()) {
            return false;
        }
        return true;
    }

    @Override
    public void m(d0.q q8) {
        this.E.post(this.C);
    }

    @Override
    public Z n() {
        this.K();
        return this.N.a;
    }

    @Override
    public void p() {
        this.Y();
        if (this.a0) {
            if (this.K) {
                return;
            }
            throw A.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override
    public void q(long l8, boolean bl) {
        if (this.M) {
            return;
        }
        this.K();
        if (this.Q()) {
            return;
        }
        boolean[] arrbl = this.N.c;
        int n8 = this.H.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.H[i8].q(l8, bl, arrbl[i8]);
        }
    }

    @Override
    public long s(long l8) {
        int n8;
        this.K();
        boolean[] arrbl = this.N.b;
        if (!this.O.h()) {
            l8 = 0L;
        }
        int n9 = 0;
        this.T = false;
        this.W = l8;
        if (this.Q()) {
            this.X = l8;
            return l8;
        }
        if (this.R != 7 && (this.a0 || this.z.j()) && this.h0(arrbl, l8)) {
            return l8;
        }
        this.Y = false;
        this.X = l8;
        this.a0 = false;
        if (this.z.j()) {
            arrbl = this.H;
            n9 = arrbl.length;
            for (n8 = 0; n8 < n9; ++n8) {
                arrbl[n8].r();
            }
            this.z.f();
            return l8;
        }
        this.z.g();
        arrbl = this.H;
        int n10 = arrbl.length;
        for (n8 = n9; n8 < n10; ++n8) {
            arrbl[n8].W();
        }
        return l8;
    }

    @Override
    public void u(v.a a8, long l8) {
        this.F = a8;
        this.B.e();
        this.k0();
    }

    public final class b
    implements n.e,
    q.a {
        public final long a;
        public final Uri b;
        public final i0.x c;
        public final F d;
        public final t e;
        public final g0.f f;
        public final L g;
        public volatile boolean h;
        public boolean i;
        public long j;
        public k k;
        public T l;
        public boolean m;

        public b(Uri uri, g g8, F f8, t t8, g0.f f9) {
            this.b = uri;
            this.c = new i0.x(g8);
            this.d = f8;
            this.e = t8;
            this.f = f9;
            this.g = new L();
            this.i = true;
            this.a = r.a();
            this.k = this.i(0L);
        }

        @Override
        public void a(z z8) {
            long l8 = !this.m ? this.j : Math.max((long)K.this.O(true), (long)this.j);
            int n8 = z8.a();
            T t8 = (T)a.e(this.l);
            t8.e(z8, n8);
            t8.b(l8, 1, n8, 0, null);
            this.m = true;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @Override
        public void b() {
            var1_1 = 0;
lbl2: // 2 sources:
            do {
                block18 : {
                    if (var1_1 != 0) return;
                    if (this.h != false) return;
                    var2_2 = var1_1;
                    try {
                        var8_6 = this.g.a;
                        var2_2 = var1_1;
                        var11_8 = this.i(var8_6);
                        var2_2 = var1_1;
                        this.k = var11_8;
                        var2_2 = var1_1;
                        var6_5 = this.c.e((k)var11_8);
                        var2_2 = var1_1;
                        var10_7 = this.h;
                        if (!var10_7) break block18;
                    }
                    catch (Throwable var11_9) {}
                    if (var1_1 != 1 && this.d.d() != -1L) {
                        this.g.a = this.d.d();
                    }
                    j.a(this.c);
                    return;
                }
                var4_4 = var6_5;
                if (var6_5 == -1L) ** GOTO lbl29
                var4_4 = var6_5 + var8_6;
                var2_2 = var1_1;
                K.G(K.this);
lbl29: // 2 sources:
                var2_2 = var1_1;
                K.I(K.this, S0.b.a(this.c.g()));
                var2_2 = var1_1;
                var11_8 = var12_11 = this.c;
                var2_2 = var1_1;
                if (K.H(K.this) != null) {
                    var11_8 = var12_11;
                    var2_2 = var1_1;
                    if (K.H((K)K.this).t != -1) {
                        var2_2 = var1_1;
                        var11_8 = new q(this.c, K.H((K)K.this).t, this);
                        var2_2 = var1_1;
                        var12_11 = K.this.P();
                        var2_2 = var1_1;
                        this.l = var12_11;
                        var2_2 = var1_1;
                        var12_11.d(K.J());
                    }
                }
                var2_2 = var1_1;
                var12_11 = this.d;
                var2_2 = var1_1;
                var13_12 = this.b;
                var2_2 = var1_1;
                var14_13 = this.c.g();
                var2_2 = var1_1;
                var15_14 = this.e;
                var6_5 = var8_6;
                var2_2 = var1_1;
                var12_11.b((d0.i)var11_8, var13_12, var14_13, var8_6, var4_4, var15_14);
                var2_2 = var1_1;
                if (K.H(K.this) != null) {
                    var2_2 = var1_1;
                    this.d.e();
                }
                var2_2 = var1_1;
                var3_3 = var1_1;
                var4_4 = var6_5;
                if (this.i) {
                    var2_2 = var1_1;
                    this.d.a(var6_5, this.j);
                    var2_2 = var1_1;
                    this.i = false;
                    var3_3 = var1_1;
                    var4_4 = var6_5;
                }
                ** GOTO lbl107
                if (var2_2 != 1 && this.d.d() != -1L) {
                    this.g.a = this.d.d();
                }
                j.a(this.c);
                throw var11_9;
                break;
            } while (true);
lbl-1000: // 2 sources:
            {
                if (var1_1 != 0) ** GOTO lbl-1000
                var2_2 = var1_1;
                var10_7 = this.h;
                if (!var10_7) {
                    var2_2 = var1_1;
                    this.f.a();
                    var2_2 = var1_1;
                    var2_2 = var3_3 = this.d.c(this.g);
                    var4_4 = this.d.d();
                    var1_1 = var3_3;
                    var2_2 = var3_3;
                    if (var4_4 <= K.z(K.this) + var6_5) continue;
                    var2_2 = var3_3;
                    this.f.c();
                    var2_2 = var3_3;
                    K.B(K.this).post(K.A(K.this));
                } else lbl-1000: // 2 sources:
                {
                    if (var1_1 == 1) {
                        var2_2 = 0;
                    } else {
                        var2_2 = var1_1;
                        if (this.d.d() != -1L) {
                            this.g.a = this.d.d();
                            var2_2 = var1_1;
                        }
                    }
                    j.a(this.c);
                    var1_1 = var2_2;
                    ** continue;
                    catch (InterruptedException var11_10) {}
                    var2_2 = var1_1;
                    throw new InterruptedIOException();
                }
lbl107: // 2 sources:
                var6_5 = var4_4;
                var1_1 = var3_3;
                ** while (true)
            }
        }

        @Override
        public void c() {
            this.h = true;
        }

        public final k i(long l8) {
            return new k.b().i(this.b).h(l8).f(K.this.w).b(6).e(c0).a();
        }

        public final void j(long l8, long l9) {
            this.g.a = l8;
            this.j = l9;
            this.i = true;
            this.m = false;
        }
    }

    public static interface c {
        public void q(long var1, boolean var3, boolean var4);
    }

    public final class d
    implements Q {
        public final int o;

        public d(int n8) {
            this.o = n8;
        }

        public static /* synthetic */ int b(d d8) {
            return d8.o;
        }

        @Override
        public void a() {
            K.this.Z(this.o);
        }

        @Override
        public boolean e() {
            return K.this.R(this.o);
        }

        @Override
        public int j(v0 v02, i i8, int n8) {
            return K.this.f0(this.o, v02, i8, n8);
        }

        @Override
        public int m(long l8) {
            return K.this.j0(this.o, l8);
        }
    }

    public static final class e {
        public final int a;
        public final boolean b;

        public e(int n8, boolean bl) {
            this.a = n8;
            this.b = bl;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (e.class != object.getClass()) {
                    return false;
                }
                object = (e)object;
                if (this.a == object.a && this.b == object.b) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }
    }

    public static final class f {
        public final Z a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public f(Z z8, boolean[] arrbl) {
            this.a = z8;
            this.b = arrbl;
            int n8 = z8.a;
            this.c = new boolean[n8];
            this.d = new boolean[n8];
        }
    }

}

