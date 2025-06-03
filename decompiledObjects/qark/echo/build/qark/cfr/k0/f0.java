/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.media.AudioTrack
 *  android.media.MediaFormat
 *  android.media.metrics.LogSessionId
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.TimeoutException
 */
package k0;

import A0.D;
import A0.y;
import B0.e;
import W2.s;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import d0.B;
import d0.C;
import d0.D;
import d0.I;
import d0.l;
import d0.q;
import d0.w;
import d0.x;
import g0.A;
import g0.a;
import g0.k;
import g0.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k0.E;
import k0.F;
import k0.F0;
import k0.G;
import k0.H;
import k0.I;
import k0.J;
import k0.K;
import k0.L;
import k0.M;
import k0.N;
import k0.O;
import k0.P;
import k0.Q;
import k0.S;
import k0.T;
import k0.T0;
import k0.U;
import k0.U0;
import k0.V;
import k0.V0;
import k0.W;
import k0.W0;
import k0.X;
import k0.Y;
import k0.Y0;
import k0.Z;
import k0.a0;
import k0.b;
import k0.b0;
import k0.b1;
import k0.c0;
import k0.c1;
import k0.d0;
import k0.d1;
import k0.e0;
import k0.g0;
import k0.g1;
import k0.h0;
import k0.i0;
import k0.i1;
import k0.j0;
import k0.j1;
import k0.k0;
import k0.l0;
import k0.m;
import k0.m0;
import k0.n0;
import k0.o;
import k0.o0;
import k0.p;
import k0.p0;
import k0.t0;
import k0.u;
import k0.u0;
import k0.v;
import k0.w;
import k0.w0;
import k0.x0;
import l0.w1;
import l0.y1;
import m0.z;
import x0.T;
import x0.t;
import x0.x;
import z0.h;

public final class f0
extends d0.f
implements w {
    public final k0.b A;
    public final m B;
    public final g1 C;
    public final i1 D;
    public final j1 E;
    public final long F;
    public AudioManager G;
    public final boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public d1 N;
    public x0.T O;
    public w.c P;
    public boolean Q;
    public D.b R;
    public d0.w S;
    public d0.w T;
    public q U;
    public q V;
    public AudioTrack W;
    public Object X;
    public Surface Y;
    public SurfaceHolder Z;
    public boolean a0;
    public final A0.E b;
    public TextureView b0;
    public final D.b c;
    public int c0;
    public final g0.f d;
    public int d0;
    public final Context e;
    public A e0;
    public final d0.D f;
    public o f0;
    public final Y0[] g;
    public o g0;
    public final D h;
    public int h0;
    public final k i;
    public d0.b i0;
    public final t0.f j;
    public float j0;
    public final t0 k;
    public boolean k0;
    public final n l;
    public f0.b l0;
    public final CopyOnWriteArraySet m;
    public boolean m0;
    public final I.b n;
    public boolean n0;
    public final List o;
    public int o0;
    public final boolean p;
    public boolean p0;
    public final x.a q;
    public boolean q0;
    public final l0.a r;
    public l r0;
    public final Looper s;
    public d0.P s0;
    public final B0.e t;
    public d0.w t0;
    public final long u;
    public U0 u0;
    public final long v;
    public int v0;
    public final long w;
    public int w0;
    public final g0.c x;
    public long x0;
    public final d y;
    public final e z;

    static {
        d0.v.a("media3.exoplayer");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public f0(w.b var1_1, d0.D var2_3) {
        super();
        this.d = var8_4 = new g0.f();
        try {
            var9_5 = new StringBuilder();
            var9_5.append("Init ");
            var9_5.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
            var9_5.append(" [");
            var9_5.append("AndroidXMedia3/1.4.1");
            var9_5.append("] [");
            var9_5.append(g0.M.e);
            var9_5.append("]");
            g0.o.f("ExoPlayerImpl", var9_5.toString());
            this.e = var14_6 = var1_1.a.getApplicationContext();
            var15_7 = (l0.a)var1_1.i.apply(var1_1.b);
            this.r = var15_7;
            this.o0 = var1_1.k;
            this.i0 = var1_1.l;
            this.c0 = var1_1.r;
            this.d0 = var1_1.s;
            this.k0 = var1_1.p;
            this.F = var1_1.A;
            this.y = var11_8 = new d(null);
            this.z = var9_5 = new e(null);
            var12_9 = new Handler(var1_1.j);
            var17_10 = ((c1)var1_1.d.get()).a(var12_9, var11_8, var11_8, var11_8, var11_8);
            this.g = var17_10;
            var5_11 = var17_10.length > 0;
            a.f(var5_11);
            this.h = var10_12 = (D)var1_1.f.get();
            this.q = (x.a)var1_1.e.get();
            this.t = var16_13 = (B0.e)var1_1.h.get();
            this.p = var1_1.t;
            this.N = var1_1.u;
            this.u = var1_1.v;
            this.v = var1_1.w;
            this.w = var1_1.x;
            this.Q = var1_1.B;
            this.s = var13_14 = var1_1.j;
            this.x = var18_15 = var1_1.b;
            if (var2_3 == null) {
                var2_3 = this;
            }
            this.f = var2_3;
            this.H = var5_11 = var1_1.F;
            this.l = new n(var13_14, var18_15, new O(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.O = new T.a(0);
            this.P = w.c.b;
            this.b = var19_16 = new A0.E(new b1[var17_10.length], new y[var17_10.length], d0.L.b, null);
            this.n = new I.b();
            var20_17 = new D.b.a().c(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}).d(29, var10_12.h()).d(23, var1_1.q).d(25, var1_1.q).d(33, var1_1.q).d(26, var1_1.q).d(34, var1_1.q).e();
            this.c = var20_17;
            this.R = new D.b.a().b((D.b)var20_17).a(4).a(10).e();
            this.i = var18_15.e(var13_14, null);
            this.j = var20_17 = new Q(this);
            this.u0 = U0.k(var19_16);
            var15_7.o0((d0.D)var2_3, var13_14);
            var4_18 = g0.M.a;
            var2_3 = var4_18 < 31 ? new y1(var1_1.G) : c.a(var14_6, this, var1_1.C, var1_1.G);
            this.k = var2_3 = new t0((Y0[])var17_10, var10_12, var19_16, (x0)var1_1.g.get(), var16_13, this.I, this.J, (l0.a)var15_7, this.N, var1_1.y, var1_1.z, this.Q, var1_1.H, var13_14, var18_15, (t0.f)var20_17, (y1)var2_3, var1_1.D, this.P);
            this.j0 = 1.0f;
            this.I = 0;
            this.S = var17_10 = d0.w.H;
            this.T = var17_10;
            this.t0 = var17_10;
            this.v0 = -1;
            var3_19 = var4_18 < 21 ? this.x1(0) : g0.M.J(var14_6);
            this.h0 = var3_19;
            this.l0 = f0.b.c;
            this.m0 = true;
            this.v((D.d)var15_7);
            var16_13.i(new Handler(var13_14), (e.a)var15_7);
            this.d1(var11_8);
            var6_20 = var1_1.c;
            if (var6_20 > 0L) {
                var2_3.B(var6_20);
            }
            this.A = var2_3 = new k0.b(var1_1.a, var12_9, var11_8);
            var2_3.b(var1_1.o);
            this.B = var15_7 = new m(var1_1.a, var12_9, var11_8);
            var2_3 = var1_1.m != false ? this.i0 : null;
            var15_7.m((d0.b)var2_3);
            if (!var5_11 || var4_18 < 23) ** GOTO lbl87
        }
        catch (Throwable var1_2) {}
        this.G = var2_3 = (AudioManager)var14_6.getSystemService("audio");
        b.b((AudioManager)var2_3, new g(null), new Handler(var13_14));
lbl87: // 2 sources:
        if (var1_1.q) {
            this.C = var2_3 = new g1(var1_1.a, var12_9, var11_8);
            var2_3.h(g0.M.k0(this.i0.c));
        } else {
            this.C = null;
        }
        this.D = var2_3 = new i1(var1_1.a);
        var5_11 = var1_1.n != 0;
        var2_3.a(var5_11);
        this.E = var2_3 = new j1(var1_1.a);
        var5_11 = var1_1.n == 2;
        var2_3.a(var5_11);
        this.r0 = f0.h1(this.C);
        this.s0 = d0.P.e;
        this.e0 = A.c;
        var10_12.l(this.i0);
        this.f2(1, 10, this.h0);
        this.f2(2, 10, this.h0);
        this.f2(1, 3, this.i0);
        this.f2(2, 4, this.c0);
        this.f2(2, 5, this.d0);
        this.f2(1, 9, this.k0);
        this.f2(2, 7, var9_5);
        this.f2(6, 8, var9_5);
        this.g2(16, this.o0);
        var8_4.e();
        return;
        this.d.e();
        throw var1_2;
    }

    public static /* synthetic */ void M1(int n8, D.e e8, D.e e9, D.d d8) {
        d8.H(n8);
        d8.k0(e8, e9, n8);
    }

    public static /* synthetic */ void S1(U0 u02, D.d d8) {
        d8.G(u02.g);
        d8.Q(u02.g);
    }

    public static /* synthetic */ U0 U0(f0 f02) {
        return f02.u0;
    }

    public static /* synthetic */ void X(U0 u02, D.d d8) {
        d8.X(u02.e);
    }

    public static /* synthetic */ void Y(f0 f02, D.d d8) {
        f02.K1(d8);
    }

    public static /* synthetic */ void Z(int n8, D.d d8) {
        d8.m(n8);
    }

    public static /* synthetic */ void a0(U0 u02, D.d d8) {
        d8.j(u02.o);
    }

    public static /* synthetic */ void b0(U0 u02, D.d d8) {
        d8.B(u02.n);
    }

    public static /* synthetic */ void c0(int n8, D.e e8, D.e e9, D.d d8) {
        f0.M1(n8, e8, e9, d8);
    }

    public static /* synthetic */ void d0(boolean bl, D.d d8) {
        d8.c(bl);
    }

    public static /* synthetic */ void e0(boolean bl, D.d d8) {
        d8.h0(bl);
    }

    public static /* synthetic */ void f0(f0 f02, D.d d8, d0.p p8) {
        f02.A1(d8, p8);
    }

    public static /* synthetic */ void g0(U0 u02, D.d d8) {
        d8.e0(u02.f);
    }

    public static /* synthetic */ void h0(U0 u02, D.d d8) {
        d8.E(u02.f);
    }

    public static l h1(g1 g12) {
        int n8 = 0;
        l.b b8 = new l.b(0);
        int n9 = g12 != null ? g12.d() : 0;
        b8 = b8.g(n9);
        n9 = n8;
        if (g12 != null) {
            n9 = g12.c();
        }
        return b8.f(n9).e();
    }

    public static /* synthetic */ void i0(float f8, D.d d8) {
        d8.U(f8);
    }

    public static /* synthetic */ void j0(int n8, int n9, D.d d8) {
        d8.i0(n8, n9);
    }

    public static /* synthetic */ void k0(U0 u02, D.d d8) {
        d8.Y(u02.l, u02.m);
    }

    public static /* synthetic */ void l0(U0 u02, D.d d8) {
        f0.S1(u02, d8);
    }

    public static /* synthetic */ void m0(d0.u u8, int n8, D.d d8) {
        d8.O(u8, n8);
    }

    public static /* synthetic */ void n0(d0.b b8, D.d d8) {
        d8.F(b8);
    }

    public static /* synthetic */ void o0(d0.w w8, D.d d8) {
        d8.I(w8);
    }

    public static /* synthetic */ void p0(U0 u02, D.d d8) {
        d8.r0(u02.n());
    }

    public static /* synthetic */ void q0(d0.K k8, D.d d8) {
        d8.D(k8);
    }

    public static int q1(int n8) {
        if (n8 == -1) {
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ void r0(f0 f02, t0.e e8) {
        f02.B1(e8);
    }

    public static /* synthetic */ void s0(U0 u02, int n8, D.d d8) {
        d8.P(u02.a, n8);
    }

    public static /* synthetic */ void t0(f0 f02, t0.e e8) {
        f02.C1(e8);
    }

    public static /* synthetic */ void u0(D.d d8) {
        d8.e0(u.d(new u0(1), 1003));
    }

    public static long u1(U0 u02) {
        I.c c8 = new I.c();
        I.b b8 = new I.b();
        u02.a.h(u02.b.a, b8);
        if (u02.c == -9223372036854775807L) {
            return u02.a.n(b8.c, c8).c();
        }
        return b8.n() + u02.c;
    }

    public static /* synthetic */ void v0(U0 u02, D.d d8) {
        d8.C(u02.l, u02.e);
    }

    public static /* synthetic */ void w0(U0 u02, D.d d8) {
        d8.J(u02.i.d);
    }

    @Override
    public void A(d0.b b8, boolean bl) {
        Object object;
        this.u2();
        if (this.q0) {
            return;
        }
        if (!g0.M.c(this.i0, b8)) {
            this.i0 = b8;
            this.f2(1, 3, b8);
            object = this.C;
            if (object != null) {
                object.h(g0.M.k0(b8.c));
            }
            this.l.i(20, new S(b8));
        }
        m m8 = this.B;
        object = bl ? b8 : null;
        m8.m((d0.b)object);
        this.h.l(b8);
        bl = this.u();
        int n8 = this.B.p(bl, this.f());
        this.p2(bl, n8, f0.q1(n8));
        this.l.f();
    }

    public final /* synthetic */ void A1(D.d d8, d0.p p8) {
        d8.n0(this.f, new D.c(p8));
    }

    public final /* synthetic */ void B1(t0.e e8) {
        this.v1(e8);
    }

    @Override
    public int C() {
        this.u2();
        if (this.u0.a.q()) {
            return this.w0;
        }
        U0 u02 = this.u0;
        return u02.a.b(u02.b.a);
    }

    public final /* synthetic */ void C1(t0.e e8) {
        this.i.j(new V(this, e8));
    }

    @Override
    public int D() {
        this.u2();
        if (this.o()) {
            return this.u0.b.b;
        }
        return -1;
    }

    @Override
    public int E() {
        int n8;
        this.u2();
        int n9 = n8 = this.p1(this.u0);
        if (n8 == -1) {
            n9 = 0;
        }
        return n9;
    }

    @Override
    public void F(d0.K k8) {
        this.u2();
        if (this.h.h()) {
            if (k8.equals(this.h.c())) {
                return;
            }
            this.h.m(k8);
            this.l.k(19, new T(k8));
        }
    }

    @Override
    public int H() {
        this.u2();
        if (this.o()) {
            return this.u0.b.c;
        }
        return -1;
    }

    @Override
    public int J() {
        this.u2();
        return this.u0.n;
    }

    @Override
    public long K() {
        this.u2();
        if (this.o()) {
            U0 u02 = this.u0;
            x.b b8 = u02.b;
            u02.a.h(b8.a, this.n);
            return g0.M.i1(this.n.b(b8.b, b8.c));
        }
        return this.a();
    }

    public final /* synthetic */ void K1(D.d d8) {
        d8.j0(this.R);
    }

    @Override
    public d0.I L() {
        this.u2();
        return this.u0.a;
    }

    @Override
    public boolean N() {
        this.u2();
        return this.J;
    }

    @Override
    public d0.K O() {
        this.u2();
        return this.h.c();
    }

    @Override
    public long P() {
        this.u2();
        return g0.M.i1(this.o1(this.u0));
    }

    @Override
    public void U(int n8, long l8, int n9, boolean bl) {
        U0 u02;
        d0.I i8;
        block7 : {
            block6 : {
                this.u2();
                if (n8 == -1) {
                    return;
                }
                boolean bl2 = n8 >= 0;
                a.a(bl2);
                i8 = this.u0.a;
                if (!i8.q() && n8 >= i8.p()) {
                    return;
                }
                this.r.f0();
                ++this.K;
                if (this.o()) {
                    g0.o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    t0.e e8 = new t0.e(this.u0);
                    e8.b(1);
                    this.j.a(e8);
                    return;
                }
                U0 u03 = this.u0;
                n9 = u03.e;
                if (n9 == 3) break block6;
                u02 = u03;
                if (n9 != 4) break block7;
                u02 = u03;
                if (i8.q()) break block7;
            }
            u02 = this.u0.h(2);
        }
        n9 = this.E();
        u02 = this.Z1(u02, i8, this.a2(i8, n8, l8));
        this.k.K0(i8, n8, g0.M.J0(l8));
        this.q2(u02, 0, true, 1, this.o1(u02), n9, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final U0 Z1(U0 object, d0.I object2, Pair object3) {
        long l8;
        long l9;
        boolean bl = object2.q() || object3 != null;
        a.a(bl);
        Object object4 = object.a;
        long l10 = this.n1((U0)object);
        U0 u02 = object.j((d0.I)object2);
        if (object2.q()) {
            object = U0.l();
            l10 = g0.M.J0(this.x0);
            object = u02.d((x.b)object, l10, l10, l10, 0L, x0.Z.d, this.b, X2.v.Y()).c((x.b)object);
            object.q = object.s;
            return object;
        }
        Object object5 = u02.b.a;
        int n8 = object5.equals(((Pair)g0.M.i((Object)object3)).first) ^ true;
        object = n8 != 0 ? new x.b(object3.first) : u02.b;
        long l11 = (Long)object3.second;
        l10 = l9 = g0.M.J0(l10);
        if (!object4.q()) {
            l10 = l9 - object4.h(object5, this.n).n();
        }
        if (n8 == 0 && (l8 = (l11 LCMP l10)) >= 0) {
            if (l8 == false) {
                n8 = object2.b(u02.k.a);
                if (n8 != -1) {
                    object3 = u02;
                    if (object2.f((int)n8, (I.b)this.n).c == object2.h((Object)object.a, (I.b)this.n).c) return object3;
                }
                object2.h(object.a, this.n);
                l10 = object.b() ? this.n.b(object.b, object.c) : this.n.d;
                object = u02.d((x.b)object, u02.s, u02.s, u02.d, l10 - u02.s, u02.h, u02.i, u02.j).c((x.b)object);
            } else {
                a.f(object.b() ^ true);
                l9 = Math.max((long)0L, (long)(u02.r - (l11 - l10)));
                l10 = u02.q;
                if (u02.k.equals(u02.b)) {
                    l10 = l11 + l9;
                }
                object = u02.d((x.b)object, l11, l11, l11, l9, u02.h, u02.i, u02.j);
            }
            object.q = l10;
            return object;
        }
        a.f(object.b() ^ true);
        object2 = n8 != 0 ? x0.Z.d : u02.h;
        object3 = n8 != 0 ? this.b : u02.i;
        object4 = n8 != 0 ? X2.v.Y() : u02.j;
        object = u02.d((x.b)object, l11, l11, l11, 0L, (x0.Z)object2, (A0.E)object3, (List)object4).c((x.b)object);
        object.q = l11;
        return object;
    }

    public final Pair a2(d0.I i8, int n8, long l8) {
        int n9;
        block3 : {
            block2 : {
                if (i8.q()) {
                    this.v0 = n8;
                    long l9 = l8;
                    if (l8 == -9223372036854775807L) {
                        l9 = 0L;
                    }
                    this.x0 = l9;
                    this.w0 = 0;
                    return null;
                }
                if (n8 == -1) break block2;
                n9 = n8;
                if (n8 < i8.p()) break block3;
            }
            n9 = i8.a(this.J);
            l8 = i8.n(n9, this.a).b();
        }
        return i8.j(this.a, this.n, n9, g0.M.J0(l8));
    }

    public final void b2(int n8, int n9) {
        if (n8 != this.e0.b() || n9 != this.e0.a()) {
            this.e0 = new A(n8, n9);
            this.l.k(24, new U(n8, n9));
            this.f2(2, 14, new A(n8, n9));
        }
    }

    public void c1(l0.c c8) {
        this.r.N((l0.c)a.e(c8));
    }

    public final long c2(d0.I i8, x.b b8, long l8) {
        i8.h(b8.a, this.n);
        return l8 + this.n.n();
    }

    @Override
    public void d(boolean bl) {
        this.u2();
        if (this.k0 == bl) {
            return;
        }
        this.k0 = bl;
        this.f2(1, 9, bl);
        this.l.k(23, new J(bl));
    }

    public void d1(w.a a8) {
        this.m.add((Object)a8);
    }

    public final void d2(int n8, int n9) {
        for (int i8 = n9 - 1; i8 >= n8; --i8) {
            this.o.remove(i8);
        }
        this.O = this.O.b(n8, n9);
    }

    @Override
    public void e(x0.x x8) {
        this.u2();
        this.i2(Collections.singletonList((Object)x8));
    }

    public final List e1(int n8, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            T0.c c8 = new T0.c((x0.x)list.get(i8), this.p);
            arrayList.add((Object)c8);
            this.o.add(i8 + n8, (Object)new f(c8.b, c8.a));
        }
        this.O = this.O.d(n8, arrayList.size());
        return arrayList;
    }

    public final void e2() {
        TextureView textureView = this.b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.y) {
                g0.o.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.b0.setSurfaceTextureListener(null);
            }
            this.b0 = null;
        }
        if ((textureView = this.Z) != null) {
            textureView.removeCallback((SurfaceHolder.Callback)this.y);
            this.Z = null;
        }
    }

    @Override
    public int f() {
        this.u2();
        return this.u0.e;
    }

    public final d0.w f1() {
        Object object = this.L();
        if (object.q()) {
            return this.t0;
        }
        object = object.n((int)this.E(), (I.c)this.a).c;
        return this.t0.a().K(object.e).I();
    }

    public final void f2(int n8, int n9, Object object) {
        for (Y0 y02 : this.g) {
            if (n8 != -1 && y02.l() != n8) continue;
            this.j1(y02).n(n9).m(object).l();
        }
    }

    @Override
    public void g() {
        this.u2();
        boolean bl = this.u();
        Object object = this.B;
        int n8 = 2;
        int n9 = object.p(bl, 2);
        this.p2(bl, n9, f0.q1(n9));
        object = this.u0;
        if (object.e != 1) {
            return;
        }
        object = object.f(null);
        if (object.a.q()) {
            n8 = 4;
        }
        object = object.h(n8);
        ++this.K;
        this.k.r0();
        this.q2((U0)object, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final int g1(boolean bl, int n8) {
        if (n8 == 0) {
            return 1;
        }
        if (this.H) {
            if (bl && !this.w1()) {
                return 3;
            }
            if (!bl && this.u0.n == 3) {
                return 3;
            }
        }
        return 0;
    }

    public final void g2(int n8, Object object) {
        this.f2(-1, n8, object);
    }

    @Override
    public C h() {
        this.u2();
        return this.u0.o;
    }

    public final void h2() {
        this.f2(1, 2, (Object)Float.valueOf((float)(this.j0 * this.B.g())));
    }

    @Override
    public void i(int n8) {
        this.u2();
        if (this.I != n8) {
            this.I = n8;
            this.k.f1(n8);
            this.l.i(8, new M(n8));
            this.o2();
            this.l.f();
        }
    }

    public final d0.I i1() {
        return new W0((Collection)this.o, this.O);
    }

    public void i2(List list) {
        this.u2();
        this.j2(list, true);
    }

    @Override
    public int j() {
        this.u2();
        return this.h0;
    }

    public final V0 j1(V0.b b8) {
        int n8 = this.p1(this.u0);
        t0 t02 = this.k;
        d0.I i8 = this.u0.a;
        int n9 = n8;
        if (n8 == -1) {
            n9 = 0;
        }
        return new V0(t02, b8, i8, n9, this.x, t02.I());
    }

    public void j2(List list, boolean bl) {
        this.u2();
        this.k2(list, -1, -9223372036854775807L, bl);
    }

    @Override
    public void k(C object) {
        this.u2();
        C c8 = object;
        if (object == null) {
            c8 = C.d;
        }
        if (this.u0.o.equals(c8)) {
            return;
        }
        object = this.u0.g(c8);
        ++this.K;
        this.k.c1(c8);
        this.q2((U0)object, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final Pair k1(U0 u02, U0 u03, boolean bl, int n8, boolean bl2, boolean bl3) {
        Integer n9;
        block7 : {
            block11 : {
                block9 : {
                    int n10;
                    block10 : {
                        block8 : {
                            d0.I i8 = u03.a;
                            d0.I i9 = u02.a;
                            boolean bl4 = i9.q();
                            n9 = -1;
                            if (bl4 && i8.q()) {
                                return new Pair((Object)Boolean.FALSE, (Object)n9);
                            }
                            bl4 = i9.q();
                            boolean bl5 = i8.q();
                            n10 = 3;
                            if (bl4 != bl5) {
                                return new Pair((Object)Boolean.TRUE, (Object)3);
                            }
                            if (i8.n((int)i8.h((Object)u03.b.a, (I.b)this.n).c, (I.c)this.a).a.equals(i9.n((int)i9.h((Object)u02.b.a, (I.b)this.n).c, (I.c)this.a).a)) break block7;
                            if (!bl || n8 != 0) break block8;
                            n8 = 1;
                            break block9;
                        }
                        if (!bl || n8 != 1) break block10;
                        n8 = 2;
                        break block9;
                    }
                    if (!bl2) break block11;
                    n8 = n10;
                }
                return new Pair((Object)Boolean.TRUE, (Object)n8);
            }
            throw new IllegalStateException();
        }
        if (bl && n8 == 0 && u03.b.d < u02.b.d) {
            return new Pair((Object)Boolean.TRUE, (Object)0);
        }
        if (bl && n8 == 1 && bl3) {
            return new Pair((Object)Boolean.TRUE, (Object)2);
        }
        return new Pair((Object)Boolean.FALSE, (Object)n9);
    }

    public final void k2(List list, int n8, long l8, boolean bl) {
        int n9 = this.p1(this.u0);
        long l9 = this.P();
        int n10 = this.K;
        boolean bl2 = true;
        this.K = n10 + 1;
        if (!this.o.isEmpty()) {
            this.d2(0, this.o.size());
        }
        list = this.e1(0, list);
        Object object = this.i1();
        if (!object.q() && n8 >= object.p()) {
            throw new d0.s((d0.I)object, n8, l8);
        }
        if (bl) {
            n8 = object.a(this.J);
            l8 = -9223372036854775807L;
        } else if (n8 == -1) {
            n8 = n9;
            l8 = l9;
        }
        U0 u02 = this.Z1(this.u0, (d0.I)object, this.a2((d0.I)object, n8, l8));
        n9 = n10 = u02.e;
        if (n8 != -1) {
            n9 = n10;
            if (n10 != 1) {
                n9 = !object.q() && n8 < object.p() ? 2 : 4;
            }
        }
        object = u02.h(n9);
        this.k.X0(list, n8, g0.M.J0(l8), this.O);
        bl = !this.u0.b.a.equals(object.b.a) && !this.u0.a.q() ? bl2 : false;
        this.q2((U0)object, 0, bl, 4, this.o1((U0)object), -1, false);
    }

    @Override
    public void l(float f8) {
        this.u2();
        f8 = g0.M.o(f8, 0.0f, 1.0f);
        if (this.j0 == f8) {
            return;
        }
        this.j0 = f8;
        this.h2();
        this.l.k(22, new K(f8));
    }

    public Looper l1() {
        return this.s;
    }

    public final void l2(SurfaceTexture surfaceTexture) {
        surfaceTexture = new Surface(surfaceTexture);
        this.m2((Object)surfaceTexture);
        this.Y = surfaceTexture;
    }

    public long m1() {
        this.u2();
        if (this.u0.a.q()) {
            return this.x0;
        }
        Object object = this.u0;
        if (object.k.d != object.b.d) {
            return object.a.n(this.E(), this.a).d();
        }
        long l8 = object.q;
        if (this.u0.k.b()) {
            object = this.u0;
            object = object.a.h(object.k.a, this.n);
            l8 = object.f(this.u0.k.b);
            if (l8 == Long.MIN_VALUE) {
                l8 = object.d;
            }
        }
        object = this.u0;
        return g0.M.i1(this.c2(object.a, object.k, l8));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void m2(Object object) {
        int n8;
        block8 : {
            int n9;
            Object object2;
            Object object3;
            block7 : {
                object3 = new ArrayList();
                object2 = this.g;
                n8 = object2.length;
                int n10 = 0;
                int n11 = 0;
                for (n9 = 0; n9 < n8; ++n9) {
                    Y0 y02 = object2[n9];
                    if (y02.l() != 2) continue;
                    object3.add((Object)this.j1(y02).n(1).m(object).l());
                }
                object2 = this.X;
                n8 = n10;
                if (object2 == null) break block8;
                n8 = n10;
                if (object2 == object) break block8;
                try {
                    object3 = object3.iterator();
                    do {
                        n9 = n11;
                        if (object3.hasNext()) {
                            ((V0)object3.next()).a(this.F);
                            continue;
                        }
                        break block7;
                        break;
                    } while (true);
                }
                catch (InterruptedException interruptedException) {}
                Thread.currentThread().interrupt();
                n9 = n11;
                break block7;
                catch (TimeoutException timeoutException) {}
                n9 = 1;
            }
            object3 = this.X;
            object2 = this.Y;
            n8 = n9;
            if (object3 == object2) {
                object2.release();
                this.Y = null;
                n8 = n9;
            }
        }
        this.X = object;
        if (n8 == 0) return;
        this.n2(u.d(new u0(3), 1003));
    }

    @Override
    public void n(boolean bl) {
        this.u2();
        int n8 = this.B.p(bl, this.f());
        this.p2(bl, n8, f0.q1(n8));
    }

    public final long n1(U0 u02) {
        if (u02.b.b()) {
            u02.a.h(u02.b.a, this.n);
            if (u02.c == -9223372036854775807L) {
                return u02.a.n(this.p1(u02), this.a).b();
            }
            return this.n.m() + g0.M.i1(u02.c);
        }
        return g0.M.i1(this.o1(u02));
    }

    public final void n2(u u8) {
        U0 u02;
        U0 u03 = this.u0;
        u03 = u03.c(u03.b);
        u03.q = u03.s;
        u03.r = 0L;
        u03 = u02 = u03.h(1);
        if (u8 != null) {
            u03 = u02.f(u8);
        }
        ++this.K;
        this.k.s1();
        this.q2(u03, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public boolean o() {
        this.u2();
        return this.u0.b.b();
    }

    public final long o1(U0 u02) {
        if (u02.a.q()) {
            return g0.M.J0(this.x0);
        }
        long l8 = u02.p ? u02.m() : u02.s;
        if (u02.b.b()) {
            return l8;
        }
        return this.c2(u02.a, u02.b, l8);
    }

    public final void o2() {
        D.b b8;
        D.b b9 = this.R;
        this.R = b8 = g0.M.N(this.f, this.c);
        if (!b8.equals(b9)) {
            this.l.i(13, new W(this));
        }
    }

    @Override
    public long p() {
        this.u2();
        return this.n1(this.u0);
    }

    public final int p1(U0 u02) {
        if (u02.a.q()) {
            return this.v0;
        }
        return u02.a.h((Object)u02.b.a, (I.b)this.n).c;
    }

    public final void p2(boolean bl, int n8, int n9) {
        bl = bl && n8 != -1;
        n8 = this.g1(bl, n8);
        U0 u02 = this.u0;
        if (u02.l == bl && u02.n == n8 && u02.m == n9) {
            return;
        }
        this.r2(bl, n9, n8);
    }

    @Override
    public int q() {
        this.u2();
        return this.I;
    }

    public final void q2(U0 u02, int n8, boolean bl, int n9, long l8, int n10, boolean bl2) {
        boolean bl3;
        int n11;
        boolean bl4;
        U0 u03 = this.u0;
        this.u0 = u02;
        boolean bl5 = u03.a.equals(u02.a) ^ true;
        Object object = this.k1(u02, u03, bl, n9, bl5, bl2);
        bl2 = (Boolean)object.first;
        int n12 = (Integer)object.second;
        object = null;
        Object object2 = null;
        if (bl2) {
            object = object2;
            if (!u02.a.q()) {
                n11 = u02.a.h((Object)u02.b.a, (I.b)this.n).c;
                object = u02.a.n((int)n11, (I.c)this.a).c;
            }
            this.t0 = d0.w.H;
        }
        if (bl2 || !u03.j.equals((Object)u02.j)) {
            this.t0 = this.t0.a().M(u02.j).I();
        }
        object2 = this.f1();
        boolean bl6 = object2.equals(this.S);
        this.S = object2;
        n11 = u03.l != u02.l ? 1 : 0;
        boolean bl7 = u03.e != u02.e;
        if (bl7 || n11 != 0) {
            this.t2();
        }
        boolean bl8 = (bl3 = u03.g) != (bl4 = u02.g);
        if (bl8) {
            this.s2(bl4);
        }
        if (bl5) {
            this.l.i(0, new E(u02, n8));
        }
        if (bl) {
            object2 = this.t1(n9, u03, n10);
            D.e e8 = this.s1(l8);
            this.l.i(11, new a0(n9, (D.e)object2, e8));
        }
        if (bl2) {
            this.l.i(1, new b0((d0.u)object, n12));
        }
        if (u03.f != u02.f) {
            this.l.i(10, new c0(u02));
            if (u02.f != null) {
                this.l.i(10, new d0(u02));
            }
        }
        if ((object = u03.i) != (object2 = u02.i)) {
            this.h.i(object2.e);
            this.l.i(2, new e0(u02));
        }
        if (bl6 ^ true) {
            object = this.S;
            this.l.i(14, new F((d0.w)object));
        }
        if (bl8) {
            this.l.i(3, new G(u02));
        }
        if (bl7 || n11 != 0) {
            this.l.i(-1, new H(u02));
        }
        if (bl7) {
            this.l.i(4, new I(u02));
        }
        if (n11 != 0 || u03.m != u02.m) {
            this.l.i(5, new P(u02));
        }
        if (u03.n != u02.n) {
            this.l.i(6, new X(u02));
        }
        if (u03.n() != u02.n()) {
            this.l.i(7, new Y(u02));
        }
        if (!u03.o.equals(u02.o)) {
            this.l.i(12, new Z(u02));
        }
        this.o2();
        this.l.f();
        if (u03.p != u02.p) {
            object = this.m.iterator();
            while (object.hasNext()) {
                ((w.a)object.next()).C(u02.p);
            }
        }
    }

    @Override
    public long r() {
        this.u2();
        return g0.M.i1(this.u0.r);
    }

    public u r1() {
        this.u2();
        return this.u0.f;
    }

    public final void r2(boolean bl, int n8, int n9) {
        U0 u02;
        ++this.K;
        U0 u03 = u02 = this.u0;
        if (u02.p) {
            u03 = u02.a();
        }
        u03 = u03.e(bl, n8, n9);
        this.k.a1(bl, n8, n9);
        this.q2(u03, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public void release() {
        Object object = new StringBuilder();
        object.append("Release ");
        object.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        object.append(" [");
        object.append("AndroidXMedia3/1.4.1");
        object.append("] [");
        object.append(g0.M.e);
        object.append("] [");
        object.append(d0.v.b());
        object.append("]");
        g0.o.f("ExoPlayerImpl", object.toString());
        this.u2();
        if (g0.M.a < 21 && (object = this.W) != null) {
            object.release();
            this.W = null;
        }
        this.A.b(false);
        object = this.C;
        if (object != null) {
            object.g();
        }
        this.D.b(false);
        this.E.b(false);
        this.B.i();
        if (!this.k.t0()) {
            this.l.k(10, new L());
        }
        this.l.j();
        this.i.h(null);
        this.t.c(this.r);
        object = this.u0;
        if (object.p) {
            this.u0 = object.a();
        }
        this.u0 = object = this.u0.h(1);
        this.u0 = object = object.c(object.b);
        object.q = object.s;
        this.u0.r = 0L;
        this.r.release();
        this.h.j();
        this.e2();
        object = this.Y;
        if (object != null) {
            object.release();
            this.Y = null;
        }
        if (!this.p0) {
            this.l0 = f0.b.c;
            this.q0 = true;
            return;
        }
        android.support.v4.media.a.a(a.e(null));
        throw null;
    }

    public final D.e s1(long l8) {
        Object object;
        int n8;
        Object object2;
        Object object3;
        int n9 = this.E();
        if (!this.u0.a.q()) {
            object2 = this.u0;
            object = object2.b.a;
            object2.a.h(object, this.n);
            n8 = this.u0.a.b(object);
            object2 = this.u0.a.n((int)n9, (I.c)this.a).a;
            object3 = this.a.c;
        } else {
            object = object3 = null;
            n8 = -1;
            object2 = object;
        }
        long l9 = g0.M.i1(l8);
        l8 = this.u0.b.b() ? g0.M.i1(f0.u1(this.u0)) : l9;
        x.b b8 = this.u0.b;
        return new D.e(object2, n9, (d0.u)object3, object, n8, l9, l8, b8.b, b8.c);
    }

    public final void s2(boolean bl) {
    }

    @Override
    public void stop() {
        this.u2();
        this.B.p(this.u(), 1);
        this.n2(null);
        this.l0 = new f0.b(X2.v.Y(), this.u0.s);
    }

    @Override
    public long t() {
        this.u2();
        if (this.o()) {
            U0 u02 = this.u0;
            if (u02.k.equals(u02.b)) {
                return g0.M.i1(this.u0.q);
            }
            return this.K();
        }
        return this.m1();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final D.e t1(int var1_1, U0 var2_2, int var3_3) {
        block4 : {
            block5 : {
                var15_4 = new I.b();
                if (!var2_2.a.q()) {
                    var13_5 = var2_2.b.a;
                    var2_2.a.h(var13_5, var15_4);
                    var4_6 = var15_4.c;
                    var3_3 = var2_2.a.b(var13_5);
                    var11_7 = var2_2.a.n((int)var4_6, (I.c)this.a).a;
                    var12_8 = this.a.c;
                    var5_9 = var3_3;
                } else {
                    var14_10 = null;
                    var13_5 = var11_7 = var14_10;
                    var5_9 = -1;
                    var12_8 = var11_7;
                    var4_6 = var3_3;
                    var11_7 = var14_10;
                }
                var6_11 = var2_2.b.b();
                if (var1_1 != 0) break block4;
                if (!var6_11) break block5;
                var14_10 = var2_2.b;
                var7_12 = var15_4.b(var14_10.b, var14_10.c);
                ** GOTO lbl29
            }
            var7_12 = var2_2.b.e != -1 ? f0.u1(this.u0) : var15_4.e + var15_4.d;
            ** GOTO lbl32
        }
        if (var6_11) {
            var7_12 = var2_2.s;
lbl29: // 2 sources:
            var9_13 = f0.u1((U0)var2_2);
        } else {
            var7_12 = var15_4.e + var2_2.s;
lbl32: // 2 sources:
            var9_13 = var7_12;
        }
        var7_12 = g0.M.i1(var7_12);
        var9_13 = g0.M.i1(var9_13);
        var2_2 = var2_2.b;
        return new D.e(var11_7, var4_6, (d0.u)var12_8, var13_5, var5_9, var7_12, var9_13, var2_2.b, var2_2.c);
    }

    public final void t2() {
        int n8 = this.f();
        boolean bl = true;
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                if (n8 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean bl2 = this.y1();
                i1 i12 = this.D;
                if (!this.u() || bl2) {
                    bl = false;
                }
                i12.b(bl);
                this.E.b(this.u());
                return;
            }
        }
        this.D.b(false);
        this.E.b(false);
    }

    @Override
    public boolean u() {
        this.u2();
        return this.u0.l;
    }

    public final void u2() {
        this.d.b();
        if (Thread.currentThread() != this.l1().getThread()) {
            String string2 = g0.M.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.l1().getThread().getName());
            if (!this.m0) {
                IllegalStateException illegalStateException = this.n0 ? null : new IllegalStateException();
                g0.o.i("ExoPlayerImpl", string2, (Throwable)illegalStateException);
                this.n0 = true;
                return;
            }
            throw new IllegalStateException(string2);
        }
    }

    @Override
    public void v(D.d d8) {
        this.l.c((D.d)a.e(d8));
    }

    public final void v1(t0.e e8) {
        int n8;
        this.K = n8 = this.K - e8.c;
        boolean bl = e8.d;
        boolean bl2 = true;
        if (bl) {
            this.L = e8.e;
            this.M = true;
        }
        if (n8 == 0) {
            Object object;
            d0.I i8 = e8.b.a;
            if (!this.u0.a.q() && i8.q()) {
                this.v0 = -1;
                this.x0 = 0L;
                this.w0 = 0;
            }
            if (!i8.q()) {
                object = ((W0)i8).F();
                bl = object.size() == this.o.size();
                a.f(bl);
                for (n8 = 0; n8 < object.size(); ++n8) {
                    ((f)this.o.get(n8)).c((d0.I)object.get(n8));
                }
            }
            bl = this.M;
            long l8 = -9223372036854775807L;
            if (bl) {
                bl = bl2;
                if (e8.b.b.equals(this.u0.b)) {
                    bl = e8.b.d != this.u0.s ? bl2 : false;
                }
                bl2 = bl;
                if (bl) {
                    if (!i8.q() && !e8.b.b.b()) {
                        object = e8.b;
                        l8 = this.c2(i8, object.b, object.d);
                    } else {
                        l8 = e8.b.d;
                    }
                    bl2 = bl;
                }
            } else {
                bl2 = false;
            }
            this.M = false;
            this.q2(e8.b, 1, bl2, this.L, l8, -1, false);
        }
    }

    public final boolean w1() {
        AudioManager audioManager = this.G;
        if (audioManager != null && g0.M.a >= 23) {
            return b.a(this.e, audioManager.getDevices(2));
        }
        return true;
    }

    @Override
    public void x(boolean bl) {
        this.u2();
        if (this.J != bl) {
            this.J = bl;
            this.k.i1(bl);
            this.l.i(9, new N(bl));
            this.o2();
            this.l.f();
        }
    }

    public final int x1(int n8) {
        AudioTrack audioTrack = this.W;
        if (audioTrack != null && audioTrack.getAudioSessionId() != n8) {
            this.W.release();
            this.W = null;
        }
        if (this.W == null) {
            this.W = new AudioTrack(3, 4000, 4, 2, 2, 0, n8);
        }
        return this.W.getAudioSessionId();
    }

    public boolean y1() {
        this.u2();
        return this.u0.p;
    }

    @Override
    public d0.L z() {
        this.u2();
        return this.u0.i.d;
    }

    public static final abstract class b {
        public static boolean a(Context context2, AudioDeviceInfo[] arraudioDeviceInfo) {
            void var1_3;
            if (!g0.M.F0(context2)) {
                return true;
            }
            for (void var0_2 : var1_3) {
                if (var0_2.getType() != 8 && var0_2.getType() != 5 && var0_2.getType() != 6 && var0_2.getType() != 11 && var0_2.getType() != 4) {
                    if (var0_2.getType() == 3) {
                        return true;
                    }
                    int n8 = g0.M.a;
                    if (n8 >= 26 && var0_2.getType() == 22) {
                        return true;
                    }
                    if (n8 >= 28 && var0_2.getType() == 23) {
                        return true;
                    }
                    if (n8 >= 31 && (var0_2.getType() == 26 || var0_2.getType() == 27)) {
                        return true;
                    }
                    if (n8 < 33 || var0_2.getType() != 30) continue;
                    return true;
                }
                return true;
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    public static final abstract class c {
        public static y1 a(Context object, f0 f02, boolean bl, String string2) {
            if ((object = w1.x0((Context)object)) == null) {
                g0.o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new y1(g0.a(), string2);
            }
            if (bl) {
                f02.c1((l0.c)object);
            }
            return new y1(object.E0(), string2);
        }
    }

    public final class d
    implements D0.E,
    m0.x,
    h,
    u0.b,
    SurfaceHolder.Callback,
    TextureView.SurfaceTextureListener,
    m.b,
    b.b,
    g1.b,
    w.a {
        public d() {
        }

        public /* synthetic */ d( a8) {
            this();
        }

        public static /* synthetic */ void G(int n8, boolean bl, D.d d8) {
            d8.q0(n8, bl);
        }

        public static /* synthetic */ void H(List list, D.d d8) {
            d8.k(list);
        }

        public static /* synthetic */ void I(x x8, D.d d8) {
            d8.x(x8);
        }

        public static /* synthetic */ void J(f0.b b8, D.d d8) {
            d8.r(b8);
        }

        public static /* synthetic */ void K(d0.P p8, D.d d8) {
            d8.b(p8);
        }

        public static /* synthetic */ void L(l l8, D.d d8) {
            d8.V(l8);
        }

        public static /* synthetic */ void M(boolean bl, D.d d8) {
            d8.c(bl);
        }

        public static /* synthetic */ void N(d d8, D.d d9) {
            d8.Q(d9);
        }

        @Override
        public void A(o o8) {
            f0.this.g0 = o8;
            f0.this.r.A(o8);
        }

        @Override
        public void B(int n8, boolean bl) {
            f0.this.l.k(30, new m0(n8, bl));
        }

        @Override
        public void C(boolean bl) {
            f0.this.t2();
        }

        @Override
        public void D(int n8) {
            l l8 = f0.h1(f0.this.C);
            if (!l8.equals(f0.this.r0)) {
                f0.this.r0 = l8;
                f0.this.l.k(29, new l0(l8));
            }
        }

        @Override
        public void E() {
            f0.this.p2(false, -1, 3);
        }

        @Override
        public void F(float f8) {
            f0.this.h2();
        }

        public final /* synthetic */ void Q(D.d d8) {
            d8.I(f0.this.S);
        }

        @Override
        public void a(z.a a8) {
            f0.this.r.a(a8);
        }

        @Override
        public void b(d0.P p8) {
            f0.this.s0 = p8;
            f0.this.l.k(25, new n0(p8));
        }

        @Override
        public void c(boolean bl) {
            if (f0.this.k0 == bl) {
                return;
            }
            f0.this.k0 = bl;
            f0.this.l.k(23, new p0(bl));
        }

        @Override
        public void d(Exception exception) {
            f0.this.r.d(exception);
        }

        @Override
        public void e(z.a a8) {
            f0.this.r.e(a8);
        }

        @Override
        public void f(o o8) {
            f0.this.r.f(o8);
            f0.this.V = null;
            f0.this.g0 = null;
        }

        @Override
        public void g(String string2) {
            f0.this.r.g(string2);
        }

        @Override
        public void h(Object object, long l8) {
            f0.this.r.h(object, l8);
            if (f0.this.X == object) {
                f0.this.l.k(26, new o0());
            }
        }

        @Override
        public void i(String string2, long l8, long l9) {
            f0.this.r.i(string2, l8, l9);
        }

        @Override
        public void j(int n8) {
            boolean bl = f0.this.u();
            f0.this.p2(bl, n8, f0.q1(n8));
        }

        @Override
        public void k(List list) {
            f0.this.l.k(27, new k0(list));
        }

        @Override
        public void l(long l8) {
            f0.this.r.l(l8);
        }

        @Override
        public /* synthetic */ void m(boolean bl) {
            v.a(this, bl);
        }

        @Override
        public void n(o o8) {
            f0.this.f0 = o8;
            f0.this.r.n(o8);
        }

        @Override
        public void o(o o8) {
            f0.this.r.o(o8);
            f0.this.U = null;
            f0.this.f0 = null;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n8, int n9) {
            f0.this.l2(surfaceTexture);
            f0.this.b2(n8, n9);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            f0.this.m2(null);
            f0.this.b2(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n8, int n9) {
            f0.this.b2(n8, n9);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void p(Exception exception) {
            f0.this.r.p(exception);
        }

        @Override
        public void q(Exception exception) {
            f0.this.r.q(exception);
        }

        @Override
        public void r(f0.b b8) {
            f0.this.l0 = b8;
            f0.this.l.k(27, new h0(b8));
        }

        @Override
        public void s(String string2) {
            f0.this.r.s(string2);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int n8, int n9, int n10) {
            f0.this.b2(n9, n10);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (f0.this.a0) {
                f0.this.m2((Object)surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (f0.this.a0) {
                f0.this.m2(null);
            }
            f0.this.b2(0, 0);
        }

        @Override
        public void t(String string2, long l8, long l9) {
            f0.this.r.t(string2, l8, l9);
        }

        @Override
        public void u(q q8, p p8) {
            f0.this.U = q8;
            f0.this.r.u(q8, p8);
        }

        @Override
        public void v(int n8, long l8, long l9) {
            f0.this.r.v(n8, l8, l9);
        }

        @Override
        public void w(int n8, long l8) {
            f0.this.r.w(n8, l8);
        }

        @Override
        public void x(x x8) {
            Object object = f0.this;
            ((f0)object).t0 = ((f0)object).t0.a().L(x8).I();
            object = f0.this.f1();
            if (!object.equals(f0.this.S)) {
                f0.this.S = (d0.w)object;
                f0.this.l.i(14, new i0(this));
            }
            f0.this.l.i(28, new j0(x8));
            f0.this.l.f();
        }

        @Override
        public void y(long l8, int n8) {
            f0.this.r.y(l8, n8);
        }

        @Override
        public void z(q q8, p p8) {
            f0.this.V = q8;
            f0.this.r.z(q8, p8);
        }
    }

    public static final class e
    implements D0.p,
    E0.a,
    V0.b {
        public D0.p o;
        public E0.a p;
        public D0.p q;
        public E0.a r;

        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        @Override
        public void a(long l8, float[] arrf) {
            E0.a a8 = this.r;
            if (a8 != null) {
                a8.a(l8, arrf);
            }
            if ((a8 = this.p) != null) {
                a8.a(l8, arrf);
            }
        }

        @Override
        public void h() {
            E0.a a8 = this.r;
            if (a8 != null) {
                a8.h();
            }
            if ((a8 = this.p) != null) {
                a8.h();
            }
        }

        @Override
        public void k(long l8, long l9, q q8, MediaFormat mediaFormat) {
            D0.p p8 = this.q;
            if (p8 != null) {
                p8.k(l8, l9, q8, mediaFormat);
            }
            if ((p8 = this.o) != null) {
                p8.k(l8, l9, q8, mediaFormat);
            }
        }

        @Override
        public void t(int n8, Object object) {
            if (n8 != 7) {
                if (n8 != 8) {
                    if (n8 != 10000) {
                        return;
                    }
                    android.support.v4.media.a.a(object);
                    this.q = null;
                    this.r = null;
                    return;
                }
                this.p = (E0.a)object;
                return;
            }
            this.o = (D0.p)object;
        }
    }

    public static final class f
    implements F0 {
        public final Object a;
        public final x0.x b;
        public d0.I c;

        public f(Object object, t t8) {
            this.a = object;
            this.b = t8;
            this.c = t8.Z();
        }

        @Override
        public Object a() {
            return this.a;
        }

        @Override
        public d0.I b() {
            return this.c;
        }

        public void c(d0.I i8) {
            this.c = i8;
        }
    }

    public final class g
    extends AudioDeviceCallback {
        public g() {
        }

        public /* synthetic */ g( a8) {
            this();
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] object) {
            if (f0.this.w1() && f0.U0((f0)f0.this).n == 3) {
                object = f0.this;
                ((f0)object).r2(f0.U0((f0)object).l, 1, 0);
            }
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] object) {
            if (!f0.this.w1()) {
                object = f0.this;
                ((f0)object).r2(f0.U0((f0)object).l, 1, 3);
            }
        }
    }

}

