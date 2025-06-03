/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package k0;

import A0.D;
import A0.E;
import X2.a0;
import X2.v;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import d0.C;
import d0.I;
import d0.q;
import d0.u;
import d0.x;
import g0.F;
import g0.M;
import g0.a;
import g0.k;
import g0.o;
import i0.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.B0;
import k0.C0;
import k0.E0;
import k0.T0;
import k0.U0;
import k0.V0;
import k0.W0;
import k0.Y0;
import k0.a1;
import k0.b1;
import k0.d1;
import k0.q0;
import k0.r0;
import k0.s;
import k0.s0;
import k0.u;
import k0.w;
import k0.w0;
import k0.x0;
import l0.y1;
import x0.Q;
import x0.S;
import x0.T;
import x0.Z;
import x0.v;
import x0.x;
import z0.i;

public final class t0
implements Handler.Callback,
v.a,
D.a,
T0.d,
s.a,
V0.a {
    public static final long l0 = M.i1(10000L);
    public final long A;
    public final boolean B;
    public final s C;
    public final ArrayList D;
    public final g0.c E;
    public final f F;
    public final E0 G;
    public final T0 H;
    public final w0 I;
    public final long J;
    public final y1 K;
    public final boolean L;
    public d1 M;
    public U0 N;
    public e O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public long T;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public int a0;
    public h b0;
    public long c0;
    public long d0;
    public int e0;
    public boolean f0;
    public u g0;
    public long h0;
    public long i0;
    public w.c j0;
    public I k0;
    public final Y0[] o;
    public final Set p;
    public final a1[] q;
    public final D r;
    public final E s;
    public final x0 t;
    public final B0.e u;
    public final k v;
    public final HandlerThread w;
    public final Looper x;
    public final I.c y;
    public final I.b z;

    public t0(Y0[] object, D d8, E object2, x0 x02, B0.e e8, int n8, boolean bl, l0.a a8, d1 d12, w0 w02, long l8, boolean bl2, boolean bl3, Looper looper, g0.c c8, f f8, y1 y12, Looper looper2, w.c c9) {
        this.F = f8;
        this.o = object;
        this.r = d8;
        this.s = object2;
        this.t = x02;
        this.u = e8;
        this.V = n8;
        this.W = bl;
        this.M = d12;
        this.I = w02;
        this.J = l8;
        this.h0 = l8;
        this.Q = bl2;
        this.L = bl3;
        this.E = c8;
        this.K = y12;
        this.j0 = c9;
        this.i0 = -9223372036854775807L;
        this.T = -9223372036854775807L;
        this.A = x02.h(y12);
        this.B = x02.f(y12);
        this.k0 = I.a;
        this.N = object2 = U0.k((E)object2);
        this.O = new e((U0)object2);
        this.q = new a1[object.length];
        object2 = d8.d();
        for (n8 = 0; n8 < object.length; ++n8) {
            object[n8].D(n8, y12, c8);
            this.q[n8] = object[n8].G();
            if (object2 == null) continue;
            this.q[n8].x((a1.a)object2);
        }
        this.C = new s(this, c8);
        this.D = new ArrayList();
        this.p = a0.h();
        this.y = new I.c();
        this.z = new I.b();
        d8.e(this, e8);
        this.f0 = true;
        object = c8.e(looper, null);
        this.G = new E0(a8, (k)object, new s0(this), c9);
        this.H = new T0(this, a8, (k)object, y12);
        if (looper2 != null) {
            this.w = null;
            this.x = looper2;
        } else {
            this.w = object = new HandlerThread("ExoPlayer:Playback", -16);
            object.start();
            this.x = object.getLooper();
        }
        this.v = c8.e(this.x, this);
    }

    public static void D0(I object, d d8, I.c c8, I.b b8) {
        int n8 = object.n((int)object.h((Object)d8.r, (I.b)b8).c, (I.c)c8).o;
        object = object.g((int)n8, (I.b)b8, (boolean)true).b;
        long l8 = b8.d;
        l8 = l8 != -9223372036854775807L ? --l8 : Long.MAX_VALUE;
        d8.e(n8, l8, object);
    }

    public static q[] E(A0.y y8) {
        int n8 = y8 != null ? y8.length() : 0;
        q[] arrq = new q[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrq[i8] = y8.b(i8);
        }
        return arrq;
    }

    public static boolean E0(d d8, I i8, I i9, int n8, boolean bl, I.c c8, I.b b8) {
        Object object = d8.r;
        if (object == null) {
            long l8 = d8.o.f() == Long.MIN_VALUE ? -9223372036854775807L : M.J0(d8.o.f());
            i9 = t0.H0(i8, new h(d8.o.h(), d8.o.d(), l8), false, n8, bl, c8, b8);
            if (i9 == null) {
                return false;
            }
            d8.e(i8.b(i9.first), (Long)i9.second, i9.first);
            if (d8.o.f() == Long.MIN_VALUE) {
                t0.D0(i8, d8, c8, b8);
            }
            return true;
        }
        n8 = i8.b(object);
        if (n8 == -1) {
            return false;
        }
        if (d8.o.f() == Long.MIN_VALUE) {
            t0.D0(i8, d8, c8, b8);
            return true;
        }
        d8.p = n8;
        i9.h(d8.r, b8);
        if (b8.f && i9.n((int)b8.c, (I.c)c8).n == i9.b(d8.r)) {
            long l9 = d8.q;
            long l10 = b8.n();
            i9 = i8.j(c8, b8, i8.h((Object)d8.r, (I.b)b8).c, l9 + l10);
            d8.e(i8.b(i9.first), (Long)i9.second, i9.first);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static g G0(I var0, U0 var1_1, h var2_2, E0 var3_3, int var4_4, boolean var5_5, I.c var6_6, I.b var7_7) {
        block20 : {
            block19 : {
                block18 : {
                    if (var0.q()) {
                        return new g(U0.l(), 0L, -9223372036854775807L, false, true, false);
                    }
                    var21_8 = var1_1.b;
                    var20_9 = var21_8.a;
                    var13_10 = t0.Z(var1_1, var7_7);
                    var14_11 = !var1_1.b.b() && !var13_10 ? var1_1.s : var1_1.c;
                    var9_12 = 1;
                    if (var2_2 == null) break block18;
                    var22_13 = t0.H0(var0, (h)var2_2, true, var4_4, var5_5, var6_6, var7_7);
                    if (var22_13 == null) {
                        var4_4 = var0.a(var5_5);
                        var16_14 = var14_11;
                        var11_15 = var5_5 = false;
                        var10_16 = true;
                    } else {
                        if (var2_2.c == -9223372036854775807L) {
                            var4_4 = var0.h((Object)var22_13.first, (I.b)var7_7).c;
                            var16_14 = var14_11;
                            var5_5 = false;
                        } else {
                            var20_9 = var22_13.first;
                            var16_14 = (Long)var22_13.second;
                            var4_4 = -1;
                            var5_5 = true;
                        }
                        var11_15 = var1_1.e == 4;
                        var10_16 = false;
                    }
                    var12_17 = var5_5;
                    var5_5 = var11_15;
                    var11_15 = var12_17;
                    ** GOTO lbl53
                }
                var2_2 = var21_8;
                var8_18 = -1;
                if (!var1_1.a.q()) break block19;
                var4_4 = var0.a(var5_5);
                ** GOTO lbl51
            }
            if (var0.b(var20_9) != var8_18) break block20;
            if ((var4_4 = t0.I0(var6_6, var7_7, var4_4, var5_5, var20_9, var1_1.a, var0)) == var8_18) {
                var4_4 = var0.a(var5_5);
                var5_5 = true;
            } else {
                var5_5 = false;
            }
            var10_16 = var5_5;
            var16_14 = var14_11;
            var11_15 = var5_5 = false;
            ** GOTO lbl53
        }
        if (var14_11 == -9223372036854775807L) {
            var4_4 = var0.h((Object)var20_9, (I.b)var7_7).c;
lbl51: // 2 sources:
            var16_14 = var14_11;
            var11_15 = var10_16 = (var5_5 = false);
lbl53: // 3 sources:
            var2_2 = var21_8;
        } else if (var13_10) {
            var21_8 = var1_1.a;
            var21_8.h(var2_2.a, var7_7);
            if (var1_1.a.n((int)var7_7.c, (I.c)var6_6).n == var1_1.a.b(var2_2.a)) {
                var16_14 = var7_7.n();
                var21_8 = var0.j(var6_6, var7_7, var0.h((Object)var20_9, (I.b)var7_7).c, var14_11 + var16_14);
                var20_9 = var21_8.first;
                var16_14 = (Long)var21_8.second;
            } else {
                var16_14 = var14_11;
            }
            var4_4 = var8_18;
            var10_16 = var5_5 = false;
            var11_15 = true;
        } else {
            var4_4 = var8_18;
            var16_14 = var14_11;
            var11_15 = var10_16 = (var5_5 = false);
        }
        if (var4_4 != -1) {
            var6_6 = var0.j(var6_6, var7_7, var4_4, -9223372036854775807L);
            var20_9 = var6_6.first;
            var16_14 = (Long)var6_6.second;
            var18_19 = -9223372036854775807L;
        } else {
            var18_19 = var16_14;
        }
        var3_3 = var3_3.L(var0, var20_9, var16_14);
        var4_4 = var3_3.e;
        var4_4 = var4_4 != -1 && ((var8_18 = var2_2.e) == -1 || var4_4 < var8_18) ? 0 : 1;
        var4_4 = var2_2.a.equals(var20_9) != false && var2_2.b() == false && var3_3.b() == false && var4_4 != 0 ? var9_12 : 0;
        var12_17 = t0.V(var13_10, (x.b)var2_2, var14_11, (x.b)var3_3, var0.h(var20_9, var7_7), var18_19);
        if (var4_4 != 0 || var12_17) {
            var3_3 = var2_2;
        }
        var14_11 = var16_14;
        if (var3_3.b() == false) return new g((x.b)var3_3, var14_11, var18_19, var5_5, var10_16, var11_15);
        if (var3_3.equals(var2_2)) {
            var14_11 = var1_1.s;
            return new g((x.b)var3_3, var14_11, var18_19, var5_5, var10_16, var11_15);
        }
        var0.h(var3_3.a, var7_7);
        if (var3_3.c == var7_7.k(var3_3.b)) {
            var14_11 = var7_7.g();
            return new g((x.b)var3_3, var14_11, var18_19, var5_5, var10_16, var11_15);
        }
        var14_11 = 0L;
        return new g((x.b)var3_3, var14_11, var18_19, var5_5, var10_16, var11_15);
    }

    public static Pair H0(I i8, h h8, boolean bl, int n8, boolean bl2, I.c c8, I.b b8) {
        Pair pair;
        I i9 = h8.a;
        if (i8.q()) {
            return null;
        }
        if (i9.q()) {
            i9 = i8;
        }
        try {
            pair = i9.j(c8, b8, h8.b, h8.c);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
        if (i8.equals(i9)) {
            return pair;
        }
        if (i8.b(pair.first) != -1) {
            Pair pair2 = pair;
            if (i9.h((Object)pair.first, (I.b)b8).f) {
                pair2 = pair;
                if (i9.n((int)b8.c, (I.c)c8).n == i9.b(pair.first)) {
                    pair2 = i8.j(c8, b8, i8.h((Object)pair.first, (I.b)b8).c, h8.c);
                }
            }
            return pair2;
        }
        if (bl && (n8 = t0.I0(c8, b8, n8, bl2, pair.first, i9, i8)) != -1) {
            return i8.j(c8, b8, n8, -9223372036854775807L);
        }
        return null;
    }

    public static int I0(I.c c8, I.b b8, int n8, boolean bl, Object object, I i8, I i9) {
        int n9;
        Object object2 = i8.n((int)i8.h((Object)object, (I.b)b8).c, (I.c)c8).a;
        int n10 = 0;
        for (n9 = 0; n9 < i9.p(); ++n9) {
            if (!i9.n((int)n9, (I.c)c8).a.equals(object2)) continue;
            return n9;
        }
        int n11 = i8.b(object);
        int n12 = i8.i();
        n9 = -1;
        while (n10 < n12 && n9 == -1 && (n11 = i8.d(n11, b8, c8, n8, bl)) != -1) {
            n9 = i9.b(i8.m(n11));
            ++n10;
        }
        if (n9 == -1) {
            return -1;
        }
        return i9.f((int)n9, (I.b)b8).c;
    }

    public static boolean V(boolean bl, x.b b8, long l8, x.b b9, I.b b10, long l9) {
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            bl4 = bl2;
            if (l8 == l9) {
                if (!b8.a.equals(b9.a)) {
                    return false;
                }
                if (b8.b() && b10.r(b8.b)) {
                    bl = bl3;
                    if (b10.h(b8.b, b8.c) != 4) {
                        bl = bl3;
                        if (b10.h(b8.b, b8.c) != 2) {
                            bl = true;
                        }
                    }
                    return bl;
                }
                bl4 = bl2;
                if (b9.b()) {
                    bl4 = bl2;
                    if (b10.r(b9.b)) {
                        bl4 = true;
                    }
                }
            }
        }
        return bl4;
    }

    public static boolean X(Y0 y02) {
        if (y02.getState() != 0) {
            return true;
        }
        return false;
    }

    public static boolean Z(U0 object, I.b b8) {
        x.b b9 = object.b;
        object = object.a;
        if (!object.q() && !object.h((Object)b9.a, (I.b)b8).f) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ B0 f(t0 t02, C0 c02, long l8) {
        return t02.t(c02, l8);
    }

    public static /* synthetic */ void g(t0 t02, V0 v02) {
        t02.b0(v02);
    }

    public static /* synthetic */ Boolean h(t0 t02) {
        return t02.a0();
    }

    public final void A(Y0 y02) {
        if (y02.getState() == 2) {
            y02.stop();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void A0(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        this.v.f(2);
        var19_5 = null;
        this.g0 = null;
        var6_6 = 1;
        this.B1(false, true);
        this.C.f();
        this.c0 = 1000000000000L;
        for (Y0 var16_26 : this.o) {
            try {
                this.v(var16_26);
                continue;
            }
            catch (RuntimeException var16_27) {
            }
            catch (u var16_28) {
                // empty catch block
            }
            o.d("ExoPlayerImplInternal", "Disable failed.", (Throwable)var16_29);
        }
        if (var1_1) {
            for (Y0 var17_9 : this.o) {
                if (!this.p.remove((Object)var17_9)) continue;
                try {
                    var17_9.b();
                }
                catch (RuntimeException var17_10) {
                    o.d("ExoPlayerImplInternal", "Reset failed.", (Throwable)var17_10);
                }
            }
        }
        this.a0 = 0;
        var17_12 = this.N;
        var16_32 = var17_12.b;
        var8_41 = var17_12.s;
        var10_42 = !this.N.b.b() && !t0.Z(this.N, this.z) ? this.N.s : this.N.c;
        if (!var2_2) ** GOTO lbl-1000
        this.b0 = null;
        var16_33 = this.H(this.N.a);
        var17_13 = (x.b)var16_33.first;
        var12_43 = (Long)var16_33.second;
        var1_1 = var17_13.equals(this.N.b);
        var14_44 = -9223372036854775807L;
        var16_34 = var17_13;
        var8_41 = var12_43;
        var10_42 = var14_44;
        if (!var1_1) {
            var10_42 = var14_44;
            var8_41 = var12_43;
            var16_35 = var17_13;
            var5_24 = var6_6;
        } else lbl-1000: // 2 sources:
        {
            var5_24 = 0;
        }
        this.G.f();
        this.U = false;
        var18_45 = this.N.a;
        var17_15 = var18_45;
        if (!var3_3) ** GOTO lbl-1000
        var17_16 = var18_45;
        if (!(var18_45 instanceof W0)) ** GOTO lbl-1000
        var18_45 = ((W0)var18_45).E(this.H.q());
        var17_17 = var18_45;
        if (var16_36.b == -1) ** GOTO lbl-1000
        var18_45.h(var16_36.a, this.z);
        var17_18 = var18_45;
        if (var18_45.n(this.z.c, this.y).f()) {
            var17_19 = new x.b(var16_36.a, var16_36.d);
            var16_38 = var18_45;
        } else lbl-1000: // 4 sources:
        {
            var18_45 = var17_20;
            var17_21 = var16_36;
            var16_39 = var18_45;
        }
        var21_46 = this.N;
        var6_6 = var21_46.e;
        var18_45 = var4_4 != false ? var19_5 : var21_46.f;
        var19_5 = var5_24 != 0 ? Z.d : var21_46.h;
        var20_47 = var5_24 != 0 ? this.s : var21_46.i;
        var21_46 = var5_24 != 0 ? v.Y() : var21_46.j;
        var22_48 = this.N;
        this.N = new U0((I)var16_40, (x.b)var17_22, var10_42, var8_41, var6_6, (u)var18_45, false, var19_5, var20_47, (List)var21_46, (x.b)var17_22, var22_48.l, var22_48.m, var22_48.n, var22_48.o, var8_41, 0L, var8_41, 0L, false);
        if (var3_3 == false) return;
        this.G.H();
        this.H.y();
    }

    public final void A1(I object, x.b object2, I i8, x.b b8, long l8, boolean bl) {
        if (!this.q1((I)object, (x.b)object2)) {
            object = object2.b() ? C.d : this.N.o;
            if (!this.C.h().equals(object)) {
                this.V0((C)object);
                this.Q(this.N.o, object.a, false, false);
            }
            return;
        }
        object.n(object.h((Object)object2.a, (I.b)this.z).c, this.y);
        this.I.b((u.g)M.i(this.y.j));
        if (l8 != -9223372036854775807L) {
            this.I.d(this.F((I)object, object2.a, l8));
            return;
        }
        object2 = this.y.a;
        object = !i8.q() ? i8.n((int)i8.h((Object)b8.a, (I.b)this.z).c, (I.c)this.y).a : null;
        if (!M.c(object, object2) || bl) {
            this.I.d(-9223372036854775807L);
        }
    }

    public void B(long l8) {
        this.h0 = l8;
    }

    public final void B0() {
        B0 b02 = this.G.t();
        boolean bl = b02 != null && b02.f.h && this.Q;
        this.R = bl;
    }

    public final void B1(boolean bl, boolean bl2) {
        this.S = bl;
        long l8 = bl && !bl2 ? this.E.b() : -9223372036854775807L;
        this.T = l8;
    }

    public final v C(A0.y[] arry) {
        int n8;
        v.a a8 = new v.a();
        int n9 = arry.length;
        int n10 = n8 = 0;
        while (n8 < n9) {
            Object object = arry[n8];
            int n11 = n10;
            if (object != null) {
                object = object.b((int)0).k;
                if (object == null) {
                    a8.h(new x(new x.b[0]));
                    n11 = n10;
                } else {
                    a8.h(object);
                    n11 = 1;
                }
            }
            ++n8;
            n10 = n11;
        }
        if (n10 != 0) {
            return a8.k();
        }
        return v.Y();
    }

    public final void C0(long l8) {
        Y0[] arry0 = this.G.t();
        l8 = arry0 == null ? (l8 += 1000000000000L) : arry0.B(l8);
        this.c0 = l8;
        this.C.c(l8);
        for (Y0 y02 : this.o) {
            if (!t0.X(y02)) continue;
            y02.z(this.c0);
        }
        this.n0();
    }

    public final void C1(float f8) {
        for (B0 b02 = this.G.t(); b02 != null; b02 = b02.k()) {
            for (A0.y y8 : b02.p().c) {
                if (y8 == null) continue;
                y8.r(f8);
            }
        }
    }

    public final long D() {
        U0 u02 = this.N;
        return this.F(u02.a, u02.b.a, u02.s);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void D1(W2.s s8, long l8) {
        synchronized (this) {
            boolean bl;
            boolean bl2;
            long l9;
            long l10;
            block7 : {
                try {
                    l10 = this.E.b();
                    bl = false;
                    l9 = l8;
                    break block7;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (!(bl2 = ((Boolean)s8.get()).booleanValue()) && l9 > 0L) {
                block8 : {
                    try {
                        this.E.f();
                        this.wait(l9);
                        break block8;
                    }
                    catch (InterruptedException interruptedException) {}
                    bl = true;
                }
                l9 = l10 + l8 - this.E.b();
            }
            if (bl) {
                Thread.currentThread().interrupt();
            }
            return;
        }
    }

    public final long F(I object, Object object2, long l8) {
        object.n(object.h((Object)object2, (I.b)this.z).c, this.y);
        object = this.y;
        if (object.f != -9223372036854775807L && object.f()) {
            object = this.y;
            if (!object.i) {
                return -9223372036854775807L;
            }
            return M.J0(object.a() - this.y.f) - (l8 + this.z.n());
        }
        return -9223372036854775807L;
    }

    public final void F0(I i8, I i9) {
        if (i8.q() && i9.q()) {
            return;
        }
        for (int i10 = this.D.size() - 1; i10 >= 0; --i10) {
            if (t0.E0((d)this.D.get(i10), i8, i9, this.V, this.W, this.y, this.z)) continue;
            ((d)this.D.get((int)i10)).o.k(false);
            this.D.remove(i10);
        }
        Collections.sort((List)this.D);
    }

    public final long G() {
        Y0[] arry0;
        B0 b02 = this.G.u();
        if (b02 == null) {
            return 0L;
        }
        long l8 = b02.m();
        if (!b02.d) {
            return l8;
        }
        for (int i8 = 0; i8 < (arry0 = this.o).length; ++i8) {
            long l9 = l8;
            if (t0.X(arry0[i8])) {
                if (this.o[i8].i() != b02.c[i8]) {
                    l9 = l8;
                } else {
                    l9 = this.o[i8].w();
                    if (l9 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    l9 = Math.max((long)l9, (long)l8);
                }
            }
            l8 = l9;
        }
        return l8;
    }

    public final Pair H(I i8) {
        boolean bl = i8.q();
        long l8 = 0L;
        if (bl) {
            return Pair.create((Object)U0.l(), (Object)0L);
        }
        int n8 = i8.a(this.W);
        Pair pair = i8.j(this.y, this.z, n8, -9223372036854775807L);
        x.b b8 = this.G.L(i8, pair.first, 0L);
        long l9 = (Long)pair.second;
        if (b8.b()) {
            i8.h(b8.a, this.z);
            l9 = l8;
            if (b8.c == this.z.k(b8.b)) {
                l9 = this.z.g();
            }
        }
        return Pair.create((Object)b8, (Object)l9);
    }

    public Looper I() {
        return this.x;
    }

    public final long J() {
        return this.K(this.N.q);
    }

    public final void J0(long l8) {
        long l9 = this.N.e == 3 && (this.L || !this.o1()) ? 1000L : l0;
        long l10 = l9;
        if (this.L) {
            l10 = l9;
            if (this.o1()) {
                Y0[] arry0 = this.o;
                int n8 = arry0.length;
                int n9 = 0;
                do {
                    l10 = l9;
                    if (n9 >= n8) break;
                    Y0 y02 = arry0[n9];
                    l10 = l9;
                    if (t0.X(y02)) {
                        l10 = Math.min((long)l9, (long)M.i1(y02.q(this.c0, this.d0)));
                    }
                    ++n9;
                    l9 = l10;
                } while (true);
            }
        }
        this.v.e(2, l8 + l10);
    }

    public final long K(long l8) {
        B0 b02 = this.G.m();
        if (b02 == null) {
            return 0L;
        }
        return Math.max((long)0L, (long)(l8 - b02.A(this.c0)));
    }

    public void K0(I i8, int n8, long l8) {
        this.v.g(3, new h(i8, n8, l8)).a();
    }

    public final void L(x0.v v8) {
        if (!this.G.B(v8)) {
            return;
        }
        this.G.F(this.c0);
        this.c0();
    }

    public final void L0(boolean bl) {
        x.b b8 = this.G.t().f.a;
        long l8 = this.O0(b8, this.N.s, true, false);
        if (l8 != this.N.s) {
            U0 u02 = this.N;
            this.N = this.S(b8, l8, u02.c, u02.d, bl, 5);
        }
    }

    public final void M(IOException object, int n8) {
        u u8 = u.c((IOException)object, n8);
        B0 b02 = this.G.t();
        object = u8;
        if (b02 != null) {
            object = u8.a(b02.f.a);
        }
        o.d("ExoPlayerImplInternal", "Playback error", (Throwable)object);
        this.t1(false, false);
        this.N = this.N.f((u)((Object)object));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void M0(h var1_1) {
        block16 : {
            block13 : {
                block15 : {
                    block14 : {
                        block17 : {
                            var14_5 = this.O;
                            var2_6 = true;
                            var14_5.b(1);
                            var15_7 = t0.H0(this.N.a, (h)var1_1, true, this.V, this.W, this.y, this.z);
                            if (var15_7 != null) break block17;
                            var16_8 = this.H(this.N.a);
                            var14_5 = (x.b)var16_8.first;
                            var6_9 = (Long)var16_8.second;
                            var12_10 = this.N.a.q() ^ true;
                            var4_11 = -9223372036854775807L;
                            ** GOTO lbl24
                        }
                        var14_5 = var15_7.first;
                        var6_9 = (Long)var15_7.second;
                        var4_11 = var1_1.c == -9223372036854775807L ? -9223372036854775807L : var6_9;
                        if ((var14_5 = this.G.L(this.N.a, var14_5, var6_9)).b()) {
                            this.N.a.h(var14_5.a, this.z);
                            var6_9 = this.z.k(var14_5.b) == var14_5.c ? this.z.g() : 0L;
                            var8_12 = var4_11;
                            var12_10 = true;
                            var4_11 = var6_9;
                        } else {
                            var12_10 = var1_1.c == -9223372036854775807L;
lbl24: // 2 sources:
                            var8_12 = var4_11;
                            var4_11 = var6_9;
                        }
                        if (this.N.a.q()) {
                            this.b0 = var1_1;
                            break block13;
                        }
                        if (var15_7 == null) {
                            if (this.N.e != 1) {
                                this.l1(4);
                            }
                            this.A0(false, true, false, true);
                            break block13;
                        }
                        if (!var14_5.equals(this.N.b)) break block14;
                        var1_1 = this.G.t();
                        var6_9 = var1_1 != null && var1_1.d != false && var4_11 != 0L ? var1_1.a.d(var4_11, this.M) : var4_11;
                        var10_13 = var6_9;
                        if (M.i1(var6_9) != M.i1(this.N.s)) break block15;
                        var1_1 = this.N;
                        var3_14 = var1_1.e;
                        if (var3_14 != 2) {
                            var10_13 = var6_9;
                            if (var3_14 != 3) break block15;
                        }
                        var6_9 = var1_1.s;
                        this.N = this.S((x.b)var14_5, var6_9, var8_12, var6_9, var12_10, 2);
                        return;
                    }
                    var10_13 = var4_11;
                }
                var13_15 = this.N.e == 4;
                var6_9 = this.N0((x.b)var14_5, var10_13, var13_15);
                if (var4_11 == var6_9) {
                    var2_6 = false;
                }
                var12_10 |= var2_6;
                try {
                    var1_1 = this.N;
                    var15_7 = var1_1.a;
                    this.A1((I)var15_7, (x.b)var14_5, (I)var15_7, var1_1.b, var8_12, true);
                    break block16;
                }
                catch (Throwable var1_2) {}
                ** GOTO lbl-1000
                catch (Throwable var1_4) {
                    var6_9 = var4_11;
                }
lbl-1000: // 2 sources:
                {
                    this.N = this.S((x.b)var14_5, var6_9, var8_12, var6_9, var12_10, 2);
                    throw var1_3;
                }
            }
            var6_9 = var4_11;
        }
        this.N = this.S((x.b)var14_5, var6_9, var8_12, var6_9, var12_10, 2);
    }

    public final void N(boolean bl) {
        B0 b02 = this.G.m();
        Object object = b02 == null ? this.N.b : b02.f.a;
        boolean bl2 = this.N.k.equals(object) ^ true;
        if (bl2) {
            this.N = this.N.c((x.b)object);
        }
        object = this.N;
        long l8 = b02 == null ? object.s : b02.j();
        object.q = l8;
        this.N.r = this.J();
        if ((bl2 || bl) && b02 != null && b02.d) {
            this.w1(b02.f.a, b02.o(), b02.p());
        }
    }

    public final long N0(x.b b8, long l8, boolean bl) {
        boolean bl2;
        bl2 = this.G.t() != this.G.u();
        return this.O0(b8, l8, bl2, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void O(I var1_1, boolean var2_2) {
        block24 : {
            block25 : {
                block26 : {
                    block23 : {
                        var20_3 = t0.G0(var1_1, this.N, this.b0, this.G, this.V, this.W, this.y, this.z);
                        var19_4 = var20_3.a;
                        var14_5 = var20_3.c;
                        var6_6 = var20_3.d;
                        var8_7 = var20_3.b;
                        var3_8 = this.N.b.equals(var19_4) && var8_7 == this.N.s ? 0 : 1;
                        var12_9 = -9223372036854775807L;
                        try {
                            if (var20_3.e) {
                                if (this.N.e != 1) {
                                    this.l1(4);
                                }
                                this.A0(false, false, false, true);
                            }
                            var18_10 = this.o;
                        }
                        catch (Throwable var18_15) {}
                        try {
                            var5_18 = var18_10.length;
                            break block23;
                        }
                        catch (Throwable var18_11) {
                            break block24;
                        }
                        break block24;
                    }
                    for (var4_19 = 0; var4_19 < var5_18; ++var4_19) {
                        var18_10[var4_19].E(var1_1);
                    }
                    if (var3_8 != 0) ** GOTO lbl35
                    try {
                        var18_10 = this.G;
                        var10_20 = this.c0;
                        var16_21 = this.G();
                    }
                    catch (Throwable var18_17) {}
                    if (!var18_10.R(var1_1, var10_20, var16_21)) {
                        this.L0(false);
                    }
                    break block25;
lbl35: // 1 sources:
                    var10_20 = var8_7;
                    var7_22 = var1_1.q();
                    if (var7_22) break block25;
                    try {
                        break block26;
                    }
                    catch (Throwable var18_13) {
                        var8_7 = var10_20;
                        break block24;
                    }
                    break block24;
                }
                for (var18_10 = this.G.t(); var18_10 != null; var18_10 = var18_10.k()) {
                    if (!var18_10.f.a.equals(var19_4)) continue;
                    var18_10.f = this.G.v(var1_1, var18_10.f);
                    var18_10.C();
                    continue;
                }
                var8_7 = var10_20;
                try {
                    var8_7 = var10_20 = this.N0(var19_4, var8_7, var6_6);
                }
                catch (Throwable var18_12) {
                    break block24;
                }
            }
            var21_23 = this.N;
            var18_10 = var21_23.a;
            var21_23 = var21_23.b;
            var10_20 = var20_3.f != false ? var8_7 : -9223372036854775807L;
            this.A1(var1_1, var19_4, (I)var18_10, (x.b)var21_23, var10_20, false);
            if (var3_8 != 0 || var14_5 != this.N.c) {
                var20_3 = this.N;
                var18_10 = var20_3.b.a;
                var20_3 = var20_3.a;
                var2_2 = var3_8 != 0 && var2_2 != false && var20_3.q() == false && var20_3.h((Object)var18_10, (I.b)this.z).f == false;
                var10_20 = this.N.d;
                var3_8 = var1_1.b(var18_10) == -1 ? 4 : 3;
                this.N = this.S(var19_4, var8_7, var14_5, var10_20, var2_2, var3_8);
            }
            this.B0();
            this.F0(var1_1, this.N.a);
            this.N = this.N.j(var1_1);
            if (!var1_1.q()) {
                this.b0 = null;
            }
            this.N(false);
            this.v.c(2);
            return;
            catch (Throwable var18_16) {}
        }
        var22_25 = this.N;
        var21_24 = var22_25.a;
        var22_25 = var22_25.b;
        var10_20 = var12_9;
        if (var20_3.f) {
            var10_20 = var8_7;
        }
        this.A1(var1_1, var19_4, (I)var21_24, (x.b)var22_25, var10_20, false);
        if (var3_8 != 0 || var14_5 != this.N.c) {
            var21_24 = this.N;
            var20_3 = var21_24.b.a;
            var21_24 = var21_24.a;
            var2_2 = var3_8 != 0 && var2_2 != false && var21_24.q() == false && var21_24.h((Object)var20_3, (I.b)this.z).f == false;
            var10_20 = this.N.d;
            var3_8 = var1_1.b(var20_3) == -1 ? 4 : 3;
            this.N = this.S(var19_4, var8_7, var14_5, var10_20, var2_2, var3_8);
        }
        this.B0();
        this.F0(var1_1, this.N.a);
        this.N = this.N.j(var1_1);
        if (!var1_1.q()) {
            this.b0 = null;
        }
        this.N(false);
        this.v.c(2);
        throw var18_14;
    }

    public final long O0(x.b object, long l8, boolean bl, boolean bl2) {
        B0 b02;
        B0 b03;
        this.u1();
        this.B1(false, true);
        if (bl2 || this.N.e == 3) {
            this.l1(2);
        }
        for (b02 = b03 = this.G.t(); b02 != null && !object.equals(b02.f.a); b02 = b02.k()) {
        }
        if (bl || b03 != b02 || b02 != null && b02.B(l8) < 0L) {
            object = this.o;
            int n8 = object.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.v((Y0)object[i8]);
            }
            if (b02 != null) {
                while (this.G.t() != b02) {
                    this.G.b();
                }
                this.G.I(b02);
                b02.z(1000000000000L);
                this.y();
            }
        }
        object = this.G;
        if (b02 != null) {
            long l9;
            object.I(b02);
            if (!b02.d) {
                b02.f = b02.f.b(l8);
                l9 = l8;
            } else {
                l9 = l8;
                if (b02.e) {
                    l9 = b02.a.s(l8);
                    b02.a.q(l9 - this.A, this.B);
                }
            }
            this.C0(l9);
            this.c0();
            l8 = l9;
        } else {
            object.f();
            this.C0(l8);
        }
        this.N(false);
        this.v.c(2);
        return l8;
    }

    public final void P(x0.v object) {
        if (!this.G.B((x0.v)object)) {
            return;
        }
        object = this.G.m();
        object.q(this.C.h().a, this.N.a);
        this.w1(object.f.a, object.o(), object.p());
        if (object == this.G.t()) {
            this.C0(object.f.b);
            this.y();
            U0 u02 = this.N;
            x.b b8 = u02.b;
            long l8 = object.f.b;
            this.N = this.S(b8, l8, u02.c, l8, false, 5);
        }
        this.c0();
    }

    public final void P0(V0 v02) {
        if (v02.f() == -9223372036854775807L) {
            this.Q0(v02);
            return;
        }
        if (this.N.a.q()) {
            this.D.add((Object)new d(v02));
            return;
        }
        d d8 = new d(v02);
        I i8 = this.N.a;
        if (t0.E0(d8, i8, i8, this.V, this.W, this.y, this.z)) {
            this.D.add((Object)d8);
            Collections.sort((List)this.D);
            return;
        }
        v02.k(false);
    }

    public final void Q(C c8, float f8, boolean bl, boolean bl2) {
        if (bl) {
            if (bl2) {
                this.O.b(1);
            }
            this.N = this.N.g(c8);
        }
        this.C1(c8.a);
        for (Y0 y02 : this.o) {
            if (y02 == null) continue;
            y02.I(f8, c8.a);
        }
    }

    public final void Q0(V0 v02) {
        if (v02.c() == this.x) {
            this.u(v02);
            int n8 = this.N.e;
            if (n8 == 3 || n8 == 2) {
                this.v.c(2);
                return;
            }
        } else {
            this.v.g(15, v02).a();
        }
    }

    public final void R(C c8, boolean bl) {
        this.Q(c8, c8.a, true, bl);
    }

    public final void R0(V0 v02) {
        Looper looper = v02.c();
        if (!looper.getThread().isAlive()) {
            o.h("TAG", "Trying to send message on a dead thread.");
            v02.k(false);
            return;
        }
        this.E.e(looper, null).j(new r0(this, v02));
    }

    public final U0 S(x.b b8, long l8, long l9, long l10, boolean bl, int n8) {
        boolean bl2 = this.f0 || l8 != this.N.s || !b8.equals(this.N.b);
        this.f0 = bl2;
        this.B0();
        Object object = this.N;
        Z z8 = object.h;
        E e8 = object.i;
        object = object.j;
        if (this.H.t()) {
            B0 b02 = this.G.t();
            z8 = b02 == null ? Z.d : b02.o();
            e8 = b02 == null ? this.s : b02.p();
            object = this.C(e8.c);
            if (b02 != null) {
                C0 c02 = b02.f;
                if (c02.c != l9) {
                    b02.f = c02.a(l9);
                }
            }
            this.g0();
        } else if (!b8.equals(this.N.b)) {
            z8 = Z.d;
            e8 = this.s;
            object = v.Y();
        }
        if (bl) {
            this.O.d(n8);
        }
        return this.N.d(b8, l8, l9, l10, this.J(), z8, e8, (List)object);
    }

    public final void S0(long l8) {
        for (Y0 y02 : this.o) {
            if (y02.i() == null) continue;
            this.T0(y02, l8);
        }
    }

    public final boolean T(Y0 y02, B0 b02) {
        B0 b03 = b02.k();
        if (b02.f.f && b03.d && (y02 instanceof i || y02 instanceof u0.c || y02.w() >= b03.n())) {
            return true;
        }
        return false;
    }

    public final void T0(Y0 y02, long l8) {
        y02.u();
        if (y02 instanceof i) {
            ((i)y02).w0(l8);
        }
    }

    public final boolean U() {
        Object object;
        B0 b02 = this.G.u();
        if (!b02.d) {
            return false;
        }
        for (int i8 = 0; i8 < (object = this.o).length; ++i8) {
            object = object[i8];
            Q q8 = b02.c[i8];
            if (object.i() == q8) {
                if (q8 == null || object.p() || this.T((Y0)object, b02)) continue;
                return false;
            }
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void U0(boolean bl, AtomicBoolean atomicBoolean) {
        if (this.X != bl) {
            this.X = bl;
            if (!bl) {
                for (Y0 y02 : this.o) {
                    if (t0.X(y02) || !this.p.remove((Object)y02)) continue;
                    y02.b();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                this.notifyAll();
                return;
            }
        }
    }

    public final void V0(C c8) {
        this.v.f(16);
        this.C.k(c8);
    }

    public final boolean W() {
        B0 b02 = this.G.m();
        if (b02 == null) {
            return false;
        }
        if (b02.r()) {
            return false;
        }
        if (b02.l() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final void W0(b b8) {
        this.O.b(1);
        if (b8.c != -1) {
            this.b0 = new h(new W0((Collection)b8.a, b8.b), b8.c, b8.d);
        }
        this.O(this.H.C(b8.a, b8.b), false);
    }

    public void X0(List list, int n8, long l8, T t8) {
        this.v.g(17, new b(list, t8, n8, l8, null)).a();
    }

    public final boolean Y() {
        B0 b02 = this.G.t();
        long l8 = b02.f.e;
        if (b02.d && (l8 == -9223372036854775807L || this.N.s < l8 || !this.o1())) {
            return true;
        }
        return false;
    }

    public final void Y0(boolean bl) {
        if (bl == this.Z) {
            return;
        }
        this.Z = bl;
        if (!bl && this.N.p) {
            this.v.c(2);
        }
    }

    public final void Z0(boolean bl) {
        this.Q = bl;
        this.B0();
        if (this.R && this.G.u() != this.G.t()) {
            this.L0(true);
            this.N(false);
        }
    }

    @Override
    public void a(Y0 y02) {
        this.v.c(26);
    }

    public final /* synthetic */ Boolean a0() {
        return this.P;
    }

    public void a1(boolean bl, int n8, int n9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void b() {
        this.v.f(2);
        this.v.c(22);
    }

    public final /* synthetic */ void b0(V0 v02) {
        try {
            this.u(v02);
            return;
        }
        catch (u u8) {
            o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", (Throwable)u8);
            throw new RuntimeException((Throwable)u8);
        }
    }

    public final void b1(boolean bl, int n8, boolean bl2, int n9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(V0 v02) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (!this.P && this.x.getThread().isAlive()) {
                        this.v.g(14, v02).a();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                v02.k(false);
                return;
            }
            throw throwable2;
        }
    }

    public final void c0() {
        boolean bl;
        this.U = bl = this.n1();
        if (bl) {
            this.G.m().e(this.c0, this.C.h().a, this.T);
        }
        this.v1();
    }

    public void c1(C c8) {
        this.v.g(4, c8).a();
    }

    @Override
    public void d() {
        this.v.c(10);
    }

    public final void d0() {
        this.O.c(this.N);
        if (this.O.a) {
            this.F.a(this.O);
            this.O = new e(this.N);
        }
    }

    public final void d1(C c8) {
        this.V0(c8);
        this.R(this.C.h(), true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e0(long var1_1, long var3_2) {
        if (this.D.isEmpty() != false) return;
        if (this.N.b.b()) {
            return;
        }
        var9_3 = var1_1;
        if (this.f0) {
            var9_3 = var1_1 - 1L;
            this.f0 = false;
        }
        var11_4 = this.N;
        var7_5 = var11_4.a.b(var11_4.b.a);
        var5_6 = Math.min((int)this.e0, (int)this.D.size());
        var11_4 = var5_6 > 0 ? (d)this.D.get(var5_6 - 1) : null;
        while (var11_4 != null && ((var6_7 = var11_4.p) > var7_5 || var6_7 == var7_5 && var11_4.q > var9_3)) {
            var6_7 = var5_6 - 1;
            var11_4 = var6_7 > 0 ? (d)this.D.get(var5_6 - 2) : null;
            var5_6 = var6_7;
        }
        var6_7 = var5_6;
        var1_1 = var9_3;
        if (var5_6 >= this.D.size()) ** GOTO lbl24
        block3 : do {
            var12_9 = (d)this.D.get(var5_6);
            var6_7 = var5_6;
            ** GOTO lbl27
lbl24: // 1 sources:
            do {
                var12_9 = null;
                var9_3 = var1_1;
lbl27: // 2 sources:
                var5_6 = var6_7;
                var11_4 = var12_9;
                if (var12_9 == null) break block3;
                var5_6 = var6_7;
                var11_4 = var12_9;
                if (var12_9.r == null) break block3;
                var8_8 = var12_9.p;
                if (var8_8 >= var7_5) {
                    var5_6 = var6_7;
                    var11_4 = var12_9;
                    if (var8_8 != var7_5) break block3;
                    var5_6 = var6_7;
                    var11_4 = var12_9;
                    if (var12_9.q > var9_3) break block3;
                }
                var6_7 = var5_6 = var6_7 + 1;
                var1_1 = var9_3;
            } while (var5_6 >= this.D.size());
        } while (true);
        while (var11_4 != null && var11_4.r != null && var11_4.p == var7_5 && (var1_1 = var11_4.q) > var9_3 && var1_1 <= var3_2) {
            try {
                this.Q0(var11_4.o);
            }
            catch (Throwable var12_10) {
                if (!var11_4.o.b()) {
                    if (var11_4.o.j() == false) throw var12_10;
                }
                this.D.remove(var5_6);
                throw var12_10;
            }
            if (!var11_4.o.b() && !var11_4.o.j()) {
                ++var5_6;
            } else {
                this.D.remove(var5_6);
            }
            if (var5_6 < this.D.size()) {
                var11_4 = (d)this.D.get(var5_6);
                continue;
            }
            var11_4 = null;
        }
        this.e0 = var5_6;
    }

    public final void e1(w.c c8) {
        this.j0 = c8;
        this.G.Q(this.N.a, c8);
    }

    public final boolean f0() {
        boolean bl;
        this.G.F(this.c0);
        boolean bl2 = this.G.O();
        boolean bl3 = bl = false;
        if (bl2) {
            C0 c02 = this.G.s(this.c0, this.N);
            bl3 = bl;
            if (c02 != null) {
                B0 b02 = this.G.g(c02);
                b02.a.u(this, c02.b);
                if (this.G.t() == b02) {
                    this.C0(c02.b);
                }
                this.N(false);
                bl3 = true;
            }
        }
        if (this.U) {
            this.U = this.W();
            this.v1();
            return bl3;
        }
        this.c0();
        return bl3;
    }

    public void f1(int n8) {
        this.v.b(11, n8, 0).a();
    }

    public final void g0() {
        Object object = this.G.t();
        if (object != null) {
            int n8;
            boolean bl;
            int n9;
            block7 : {
                object = object.p();
                bl = false;
                n9 = n8 = 0;
                while (n8 < this.o.length) {
                    int n10 = n9;
                    if (object.c(n8)) {
                        if (this.o[n8].l() != 1) {
                            n8 = 0;
                            break block7;
                        }
                        n10 = n9;
                        if (object.b[n8].a != 0) {
                            n10 = 1;
                        }
                    }
                    ++n8;
                    n9 = n10;
                }
                n8 = 1;
            }
            boolean bl2 = bl;
            if (n9 != 0) {
                bl2 = bl;
                if (n8 != 0) {
                    bl2 = true;
                }
            }
            this.Y0(bl2);
        }
    }

    public final void g1(int n8) {
        this.V = n8;
        if (!this.G.S(this.N.a, n8)) {
            this.L0(true);
        }
        this.N(false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void h0() {
        var1_1 = false;
        while (this.m1() != false) {
            if (var1_1) {
                this.d0();
            }
            var4_3 = (B0)a.e(this.G.b());
            if (!this.N.b.a.equals(var4_3.f.a.a)) ** GOTO lbl-1000
            var5_4 = this.N.b;
            if (var5_4.b != -1) ** GOTO lbl-1000
            var6_5 = var4_3.f.a;
            if (var6_5.b == -1 && var5_4.e != var6_5.e) {
                var1_1 = true;
            } else lbl-1000: // 3 sources:
            {
                var1_1 = false;
            }
            var4_3 = var4_3.f;
            var5_4 = var4_3.a;
            var2_2 = var4_3.b;
            this.N = this.S(var5_4, var2_2, var4_3.c, var2_2, var1_1 ^ true, 0);
            this.B0();
            this.z1();
            if (this.N.e == 3) {
                this.r1();
            }
            this.r();
            var1_1 = true;
        }
    }

    public final void h1(d1 d12) {
        this.M = d12;
    }

    /*
     * Exception decompiling
     */
    public boolean handleMessage(Message var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void i0(boolean bl) {
        if (this.j0.a != -9223372036854775807L) {
            I i8;
            if (!bl && this.N.a.equals(this.k0)) {
                return;
            }
            this.k0 = i8 = this.N.a;
            this.G.x(i8);
        }
    }

    public void i1(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void j(C c8) {
        this.v.g(16, c8).a();
    }

    public final void j0() {
        block13 : {
            int n8;
            Object object;
            Object object2;
            block12 : {
                object = this.G.u();
                if (object == null) {
                    return;
                }
                object2 = object.k();
                int n9 = 0;
                if (object2 != null && !this.R) {
                    if (!this.U()) {
                        return;
                    }
                    if (!object.k().d && this.c0 < object.k().n()) {
                        return;
                    }
                    object2 = object.p();
                    B0 b02 = this.G.c();
                    E e8 = b02.p();
                    Object object3 = this.N.a;
                    this.A1((I)object3, b02.f.a, (I)object3, object.f.a, -9223372036854775807L, false);
                    if (b02.d && b02.a.l() != -9223372036854775807L) {
                        this.S0(b02.n());
                        if (!b02.s()) {
                            this.G.I(b02);
                            this.N(false);
                            this.c0();
                        }
                        return;
                    }
                    for (int i8 = 0; i8 < this.o.length; ++i8) {
                        boolean bl = object2.c(i8);
                        boolean bl2 = e8.c(i8);
                        if (!bl || this.o[i8].A()) continue;
                        n9 = this.q[i8].l() == -2 ? 1 : 0;
                        object = object2.b[i8];
                        object3 = e8.b[i8];
                        if (bl2 && object3.equals(object) && n9 == 0) continue;
                        this.T0(this.o[i8], b02.n());
                    }
                    return;
                }
                n8 = n9;
                if (object.f.i) break block12;
                if (!this.R) break block13;
                n8 = n9;
            }
            while (n8 < (object2 = this.o).length) {
                object2 = object2[n8];
                Q q8 = object.c[n8];
                if (q8 != null && object2.i() == q8 && object2.p()) {
                    long l8 = object.f.e;
                    l8 = l8 != -9223372036854775807L && l8 != Long.MIN_VALUE ? object.m() + object.f.e : -9223372036854775807L;
                    this.T0((Y0)object2, l8);
                }
                ++n8;
            }
        }
    }

    public final void j1(boolean bl) {
        this.W = bl;
        if (!this.G.T(this.N.a, bl)) {
            this.L0(true);
        }
        this.N(false);
    }

    @Override
    public void k(x0.v v8) {
        this.v.g(8, v8).a();
    }

    public final void k0() {
        B0 b02 = this.G.u();
        if (b02 != null && this.G.t() != b02) {
            if (b02.g) {
                return;
            }
            if (this.x0()) {
                this.y();
            }
        }
    }

    public final void k1(T t8) {
        this.O.b(1);
        this.O(this.H.D(t8), false);
    }

    public final void l0() {
        this.O(this.H.i(), true);
    }

    public final void l1(int n8) {
        U0 u02 = this.N;
        if (u02.e != n8) {
            if (n8 != 2) {
                this.i0 = -9223372036854775807L;
            }
            this.N = u02.h(n8);
        }
    }

    public final void m0(c c8) {
        this.O.b(1);
        throw null;
    }

    public final boolean m1() {
        boolean bl = this.o1();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this.R) {
            return false;
        }
        B0 b02 = this.G.t();
        if (b02 == null) {
            return false;
        }
        b02 = b02.k();
        bl = bl2;
        if (b02 != null) {
            bl = bl2;
            if (this.c0 >= b02.n()) {
                bl = bl2;
                if (b02.g) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final void n0() {
        for (B0 b02 = this.G.t(); b02 != null; b02 = b02.k()) {
            for (A0.y y8 : b02.p().c) {
                if (y8 == null) continue;
                y8.t();
            }
        }
    }

    public final boolean n1() {
        boolean bl;
        block4 : {
            Object object;
            block5 : {
                if (!this.W()) {
                    return false;
                }
                object = this.G.m();
                long l8 = this.K(object.l());
                long l9 = object == this.G.t() ? object.A(this.c0) : object.A(this.c0) - object.f.b;
                long l10 = this.q1(this.N.a, object.f.a) ? this.I.e() : -9223372036854775807L;
                object = new x0.a(this.K, this.N.a, object.f.a, l9, l8, this.C.h().a, this.N.l, this.S, l10);
                boolean bl2 = this.t.c((x0.a)object);
                B0 b02 = this.G.t();
                bl = bl2;
                if (bl2) break block4;
                bl = bl2;
                if (!b02.d) break block4;
                bl = bl2;
                if (l8 >= 500000L) break block4;
                if (this.A > 0L) break block5;
                bl = bl2;
                if (!this.B) break block4;
            }
            b02.a.q(this.N.s, false);
            bl = this.t.c((x0.a)object);
        }
        return bl;
    }

    public final void o0(boolean bl) {
        for (B0 b02 = this.G.t(); b02 != null; b02 = b02.k()) {
            for (A0.y y8 : b02.p().c) {
                if (y8 == null) continue;
                y8.h(bl);
            }
        }
    }

    public final boolean o1() {
        U0 u02 = this.N;
        if (u02.l && u02.n == 0) {
            return true;
        }
        return false;
    }

    public final void p0() {
        for (B0 b02 = this.G.t(); b02 != null; b02 = b02.k()) {
            for (A0.y y8 : b02.p().c) {
                if (y8 == null) continue;
                y8.u();
            }
        }
    }

    public final boolean p1(boolean bl) {
        block7 : {
            block6 : {
                if (this.a0 == 0) {
                    return this.Y();
                }
                boolean bl2 = false;
                if (!bl) {
                    return false;
                }
                if (!this.N.g) {
                    return true;
                }
                B0 b02 = this.G.t();
                long l8 = this.q1(this.N.a, b02.f.a) ? this.I.e() : -9223372036854775807L;
                B0 b03 = this.G.m();
                boolean bl3 = b03.s() && b03.f.i;
                boolean bl4 = b03.f.a.b() && !b03.d;
                if (bl3 || bl4) break block6;
                bl = bl2;
                if (!this.t.e(new x0.a(this.K, this.N.a, b02.f.a, b02.A(this.c0), this.J(), this.C.h().a, this.N.l, this.S, l8))) break block7;
            }
            bl = true;
        }
        return bl;
    }

    public final void q(b b8, int n8) {
        this.O.b(1);
        T0 t02 = this.H;
        int n9 = n8;
        if (n8 == -1) {
            n9 = t02.r();
        }
        this.O(t02.f(n9, b8.a, b8.b), false);
    }

    public void q0(x0.v v8) {
        this.v.g(9, v8).a();
    }

    public final boolean q1(I object, x.b b8) {
        boolean bl;
        boolean bl2 = b8.b();
        boolean bl3 = bl = false;
        if (!bl2) {
            if (object.q()) {
                return false;
            }
            object.n(object.h((Object)b8.a, (I.b)this.z).c, this.y);
            bl3 = bl;
            if (this.y.f()) {
                object = this.y;
                bl3 = bl;
                if (object.i) {
                    bl3 = bl;
                    if (object.f != -9223372036854775807L) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    public final void r() {
        E e8 = this.G.t().p();
        for (int i8 = 0; i8 < this.o.length; ++i8) {
            if (!e8.c(i8)) continue;
            this.o[i8].j();
        }
    }

    public void r0() {
        this.v.k(29).a();
    }

    public final void r1() {
        Object object = this.G.t();
        if (object == null) {
            return;
        }
        object = object.p();
        for (int i8 = 0; i8 < this.o.length; ++i8) {
            if (!object.c(i8) || this.o[i8].getState() != 1) continue;
            this.o[i8].start();
        }
    }

    public final void s() {
        this.z0();
    }

    public final void s0() {
        this.O.b(1);
        this.A0(false, false, false, true);
        this.t.a(this.K);
        int n8 = this.N.a.q() ? 4 : 2;
        this.l1(n8);
        this.H.w(this.u.a());
        this.v.c(2);
    }

    public void s1() {
        this.v.k(6).a();
    }

    public final B0 t(C0 c02, long l8) {
        return new B0(this.q, l8, this.r, this.t.i(), this.H, c02, this.s);
    }

    public boolean t0() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (!this.P && this.x.getThread().isAlive()) {
                        this.v.c(7);
                        this.D1(new q0(this), this.J);
                        boolean bl = this.P;
                        return bl;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return true;
            }
            throw throwable2;
        }
    }

    public final void t1(boolean bl, boolean bl2) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final void u(V0 v02) {
        if (v02.j()) {
            return;
        }
        try {
            v02.g().t(v02.i(), v02.e());
            return;
        }
        finally {
            v02.k(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u0() {
        try {
            this.A0(true, false, true, false);
            this.v0();
            this.t.d(this.K);
            this.l1(1);
            return;
        }
        finally {
            HandlerThread handlerThread = this.w;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.P = true;
                this.notifyAll();
            }
        }
    }

    public final void u1() {
        this.C.f();
        for (Y0 y02 : this.o) {
            if (!t0.X(y02)) continue;
            this.A(y02);
        }
    }

    public final void v(Y0 y02) {
        if (!t0.X(y02)) {
            return;
        }
        this.C.a(y02);
        this.A(y02);
        y02.g();
        --this.a0;
    }

    public final void v0() {
        for (int i8 = 0; i8 < this.o.length; ++i8) {
            this.q[i8].o();
            this.o[i8].release();
        }
    }

    public final void v1() {
        Object object = this.G.m();
        boolean bl = this.U || object != null && object.a.b();
        object = this.N;
        if (bl != object.g) {
            this.N = object.b(bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w() {
        int n8;
        Object object;
        int n9;
        boolean bl;
        boolean bl2;
        long l8;
        block29 : {
            long l9;
            block28 : {
                block26 : {
                    block27 : {
                        Y0[] arry0;
                        block23 : {
                            block21 : {
                                block25 : {
                                    boolean bl3;
                                    block24 : {
                                        block22 : {
                                            block20 : {
                                                block19 : {
                                                    block18 : {
                                                        boolean bl4;
                                                        l8 = this.E.d();
                                                        this.v.f(2);
                                                        this.y1();
                                                        n9 = this.N.e;
                                                        bl = true;
                                                        if (n9 == 1) return;
                                                        if (n9 == 4) {
                                                            return;
                                                        }
                                                        object = this.G.t();
                                                        if (object == null) {
                                                            this.J0(l8);
                                                            return;
                                                        }
                                                        F.a("doSomeWork");
                                                        this.z1();
                                                        if (!object.d) {
                                                            object.a.p();
                                                            bl3 = bl4 = true;
                                                        } else {
                                                            boolean bl5;
                                                            this.d0 = M.J0(this.E.b());
                                                            object.a.q(this.N.s - this.A, this.B);
                                                            bl2 = bl5 = true;
                                                            n9 = 0;
                                                            do {
                                                                arry0 = this.o;
                                                                bl4 = bl5;
                                                                bl3 = bl2;
                                                                if (n9 >= arry0.length) break;
                                                                if (!t0.X((Y0)(arry0 = arry0[n9]))) {
                                                                    bl3 = bl5;
                                                                    bl4 = bl2;
                                                                } else {
                                                                    arry0.f(this.c0, this.d0);
                                                                    bl5 = bl5 && arry0.c();
                                                                    n8 = object.c[n9] != arry0.i() ? 1 : 0;
                                                                    boolean bl6 = n8 == 0 && arry0.p();
                                                                    n8 = !(n8 != 0 || bl6 || arry0.e() || arry0.c()) ? 0 : 1;
                                                                    bl2 = bl2 && n8 != 0;
                                                                    bl3 = bl5;
                                                                    bl4 = bl2;
                                                                    if (n8 == 0) {
                                                                        arry0.v();
                                                                        bl4 = bl2;
                                                                        bl3 = bl5;
                                                                    }
                                                                }
                                                                ++n9;
                                                                bl5 = bl3;
                                                                bl2 = bl4;
                                                            } while (true);
                                                        }
                                                        l9 = object.f.e;
                                                        n9 = bl4 && object.d && (l9 == -9223372036854775807L || l9 <= this.N.s) ? 1 : 0;
                                                        if (n9 == 0) break block18;
                                                        if (!this.R) break block19;
                                                        this.R = false;
                                                        this.b1(false, this.N.n, false, 5);
                                                    }
                                                    if (n9 == 0) break block20;
                                                }
                                                if (!object.f.i) break block20;
                                                this.l1(4);
                                                break block21;
                                            }
                                            if (this.N.e != 2 || !this.p1(bl3)) break block22;
                                            this.l1(3);
                                            this.g0 = null;
                                            if (this.o1()) {
                                                this.B1(false, false);
                                                this.C.e();
                                                this.r1();
                                            }
                                            break block23;
                                        }
                                        if (this.N.e != 3) break block23;
                                        if (this.a0 != 0) break block24;
                                        if (!this.Y()) break block25;
                                        break block23;
                                    }
                                    if (bl3) break block23;
                                }
                                this.B1(this.o1(), false);
                                this.l1(2);
                                if (this.S) {
                                    this.p0();
                                    this.I.a();
                                }
                            }
                            this.u1();
                        }
                        if (this.N.e != 2) break block26;
                        for (n9 = 0; n9 < (arry0 = this.o).length; ++n9) {
                            if (!t0.X(arry0[n9]) || this.o[n9].i() != object.c[n9]) continue;
                            this.o[n9].v();
                        }
                        object = this.N;
                        if (object.g || object.r >= 500000L || !this.W()) break block26;
                        if (this.i0 != -9223372036854775807L) break block27;
                        l9 = this.E.b();
                        break block28;
                    }
                    if (this.E.b() - this.i0 >= 4000L) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                    break block29;
                }
                l9 = -9223372036854775807L;
            }
            this.i0 = l9;
        }
        n9 = this.o1() && this.N.e == 3 ? 1 : 0;
        bl2 = this.Z && this.Y && n9 != 0 ? bl : false;
        object = this.N;
        if (object.p != bl2) {
            this.N = object.i(bl2);
        }
        this.Y = false;
        if (!bl2 && (n8 = this.N.e) != 4 && (n9 != 0 || n8 == 2 || n8 == 3 && this.a0 != 0)) {
            this.J0(l8);
        }
        F.b();
    }

    public final void w0(int n8, int n9, T t8) {
        this.O.b(1);
        this.O(this.H.A(n8, n9, t8), false);
    }

    public final void w1(x.b b8, Z z8, E e8) {
        this.t.b(this.K, this.N.a, b8, this.o, z8, e8.c);
    }

    public final void x(int n8, boolean bl, long l8) {
        Y0 y02 = this.o[n8];
        if (t0.X(y02)) {
            return;
        }
        B0 b02 = this.G.u();
        boolean bl2 = b02 == this.G.t();
        q[] arrq = b02.p();
        b1 b12 = arrq.b[n8];
        arrq = t0.E(arrq.c[n8]);
        boolean bl3 = this.o1() && this.N.e == 3;
        bl = !bl && bl3;
        ++this.a0;
        this.p.add((Object)y02);
        y02.C(b12, arrq, b02.c[n8], this.c0, bl, bl2, l8, b02.m(), b02.f.a);
        y02.t(11, new Y0.a(){

            @Override
            public void a() {
                t0.this.Y = true;
            }

            @Override
            public void b() {
                if (t0.this.L || t0.this.Z) {
                    t0.this.v.c(2);
                }
            }
        });
        this.C.b(y02);
        if (bl3 && bl2) {
            y02.start();
        }
    }

    public final boolean x0() {
        int n8;
        Object object;
        B0 b02 = this.G.u();
        E e8 = b02.p();
        int n9 = n8 = 0;
        while (n8 < (object = this.o).length) {
            int n10;
            if (!t0.X((Y0)(object = object[n8]))) {
                n10 = n9;
            } else {
                n10 = object.i() != b02.c[n8] ? 1 : 0;
                if (e8.c(n8) && n10 == 0) {
                    n10 = n9;
                } else if (!object.A()) {
                    object.F(t0.E(e8.c[n8]), b02.c[n8], b02.n(), b02.m(), b02.f.a);
                    n10 = n9;
                    if (this.Z) {
                        this.Y0(false);
                        n10 = n9;
                    }
                } else if (object.c()) {
                    this.v((Y0)object);
                    n10 = n9;
                } else {
                    n10 = 1;
                }
            }
            ++n8;
            n9 = n10;
        }
        return (boolean)(n9 ^ 1);
    }

    public final void x1(int n8, int n9, List list) {
        this.O.b(1);
        this.O(this.H.E(n8, n9, list), false);
    }

    public final void y() {
        this.z(new boolean[this.o.length], this.G.u().n());
    }

    public final void y0() {
        float f8 = this.C.h().a;
        Object object = this.G.u();
        boolean[] arrbl = null;
        int n8 = 1;
        for (B0 b02 = this.G.t(); b02 != null; b02 = b02.k()) {
            if (!b02.d) {
                return;
            }
            boolean[] arrbl2 = b02.x(f8, this.N.a);
            if (b02 == this.G.t()) {
                arrbl = arrbl2;
            }
            if (!arrbl2.a(b02.p())) {
                object = this.G;
                if (n8 != 0) {
                    b02 = object.t();
                    boolean bl = this.G.I(b02);
                    arrbl2 = new boolean[this.o.length];
                    long l8 = b02.b((E)a.e(arrbl), this.N.s, bl, arrbl2);
                    arrbl = this.N;
                    bl = arrbl.e != 4 && l8 != arrbl.s;
                    arrbl = this.N;
                    this.N = this.S(arrbl.b, l8, arrbl.c, arrbl.d, bl, 5);
                    if (bl) {
                        this.C0(l8);
                    }
                    arrbl = new boolean[this.o.length];
                    for (n8 = 0; n8 < (object = this.o).length; ++n8) {
                        object = object[n8];
                        arrbl[n8] = bl = t0.X((Y0)object);
                        Q q8 = b02.c[n8];
                        if (!bl) continue;
                        if (q8 != object.i()) {
                            this.v((Y0)object);
                            continue;
                        }
                        if (!arrbl2[n8]) continue;
                        object.z(this.c0);
                    }
                    this.z(arrbl, this.c0);
                } else {
                    object.I(b02);
                    if (b02.d) {
                        b02.a((E)arrbl2, Math.max((long)b02.f.b, (long)b02.A(this.c0)), false);
                    }
                }
                this.N(true);
                if (this.N.e != 4) {
                    this.c0();
                    this.z1();
                    this.v.c(2);
                }
                return;
            }
            if (b02 != object) continue;
            n8 = 0;
        }
    }

    public final void y1() {
        if (!this.N.a.q()) {
            if (!this.H.t()) {
                return;
            }
            boolean bl = this.f0();
            this.j0();
            this.k0();
            this.h0();
            this.i0(bl);
        }
    }

    public final void z(boolean[] arrbl, long l8) {
        B0 b02 = this.G.u();
        E e8 = b02.p();
        int n8 = 0;
        int n9 = 0;
        do {
            if (n9 >= this.o.length) break;
            if (!e8.c(n9) && this.p.remove((Object)this.o[n9])) {
                this.o[n9].b();
            }
            ++n9;
        } while (true);
        for (int i8 = n8; i8 < this.o.length; ++i8) {
            if (!e8.c(i8)) continue;
            this.x(i8, arrbl[i8], l8);
        }
        b02.g = true;
    }

    public final void z0() {
        this.y0();
        this.L0(true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void z1() {
        block5 : {
            block4 : {
                var10_1 = this.G.t();
                if (var10_1 == null) {
                    return;
                }
                var3_2 = var10_1.d != false ? var10_1.a.l() : -9223372036854775807L;
                if (var3_2 == -9223372036854775807L) break block4;
                if (!var10_1.s()) {
                    this.G.I((B0)var10_1);
                    this.N(false);
                    this.c0();
                }
                this.C0(var3_2);
                if (var3_2 == this.N.s) break block5;
                var11_3 = this.N;
                var10_1 = var11_3.b;
                var7_5 = var11_3.c;
                var9_6 = true;
                var2_7 = 5;
                var5_8 = var3_2;
                var3_2 = var7_5;
                ** GOTO lbl32
            }
            var11_4 = this.C;
            var9_6 = var10_1 != this.G.u();
            this.c0 = var3_2 = var11_4.g(var9_6);
            var5_8 = var10_1.A(var3_2);
            this.e0(this.N.s, var5_8);
            if (this.C.r()) {
                var9_6 = this.O.d ^ true;
                var11_4 = this.N;
                var10_1 = var11_4.b;
                var3_2 = var11_4.c;
                var2_7 = 6;
lbl32: // 2 sources:
                this.N = this.S((x.b)var10_1, var5_8, var3_2, var5_8, var9_6, var2_7);
            } else {
                this.N.o(var5_8);
            }
        }
        var10_1 = this.G.m();
        this.N.q = var10_1.j();
        this.N.r = this.J();
        var10_1 = this.N;
        if (var10_1.l == false) return;
        if (var10_1.e != 3) return;
        if (this.q1(var10_1.a, var10_1.b) == false) return;
        if (this.N.o.a != 1.0f) return;
        var1_9 = this.I.c(this.D(), this.J());
        if (this.C.h().a == var1_9) return;
        this.V0(this.N.o.b(var1_9));
        this.Q(this.N.o, this.C.h().a, false, false);
    }

    public static final class b {
        public final List a;
        public final T b;
        public final int c;
        public final long d;

        public b(List list, T t8, int n8, long l8) {
            this.a = list;
            this.b = t8;
            this.c = n8;
            this.d = l8;
        }

        public /* synthetic */ b(List list, T t8, int n8, long l8,  a8) {
            this(list, t8, n8, l8);
        }
    }

    public static abstract class c {
    }

    public static final class d
    implements Comparable {
        public final V0 o;
        public int p;
        public long q;
        public Object r;

        public d(V0 v02) {
            this.o = v02;
        }

        public int c(d d8) {
            Object object = this.r;
            int n8 = 1;
            int n9 = object == null ? 1 : 0;
            int n10 = d8.r == null;
            if (n9 != n10) {
                n9 = n8;
                if (object != null) {
                    n9 = -1;
                }
                return n9;
            }
            if (object == null) {
                return 0;
            }
            n9 = this.p - d8.p;
            if (n9 != 0) {
                return n9;
            }
            return M.n(this.q, d8.q);
        }

        public void e(int n8, long l8, Object object) {
            this.p = n8;
            this.q = l8;
            this.r = object;
        }
    }

    public static final class e {
        public boolean a;
        public U0 b;
        public int c;
        public boolean d;
        public int e;

        public e(U0 u02) {
            this.b = u02;
        }

        public void b(int n8) {
            boolean bl = this.a;
            boolean bl2 = n8 > 0;
            this.a = bl | bl2;
            this.c += n8;
        }

        public void c(U0 u02) {
            boolean bl = this.a;
            boolean bl2 = this.b != u02;
            this.a = bl | bl2;
            this.b = u02;
        }

        public void d(int n8) {
            boolean bl = this.d;
            boolean bl2 = true;
            if (bl && this.e != 5) {
                if (n8 != 5) {
                    bl2 = false;
                }
                a.a(bl2);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = n8;
        }
    }

    public static interface f {
        public void a(e var1);
    }

    public static final class g {
        public final x.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(x.b b8, long l8, long l9, boolean bl, boolean bl2, boolean bl3) {
            this.a = b8;
            this.b = l8;
            this.c = l9;
            this.d = bl;
            this.e = bl2;
            this.f = bl3;
        }
    }

    public static final class h {
        public final I a;
        public final int b;
        public final long c;

        public h(I i8, int n8, long l8) {
            this.a = i8;
            this.b = n8;
            this.c = l8;
        }
    }

}

