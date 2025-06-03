/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicInteger
 */
package q0;

import B0.g;
import F0.t;
import W2.c;
import android.net.Uri;
import d0.i;
import d0.q;
import d0.x;
import g0.E;
import g0.G;
import g0.z;
import i0.g;
import i0.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.y1;
import q0.a;
import q0.f;
import q0.h;
import q0.k;
import q0.s;
import q0.v;
import r0.f;
import y0.e;
import y0.m;

public final class j
extends m {
    public static final AtomicInteger N = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final y1 C;
    public final long D;
    public k E;
    public s F;
    public int G;
    public boolean H;
    public volatile boolean I;
    public boolean J;
    public X2.v K;
    public boolean L;
    public boolean M;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final g p;
    public final i0.k q;
    public final k r;
    public final boolean s;
    public final boolean t;
    public final E u;
    public final h v;
    public final List w;
    public final d0.m x;
    public final T0.h y;
    public final z z;

    public j(h h8, g g8, i0.k k8, q q8, boolean bl, g g9, i0.k k9, boolean bl2, Uri uri, List list, int n8, Object object, long l8, long l9, long l10, int n9, boolean bl3, int n10, boolean bl4, boolean bl5, E e8, long l11, d0.m m8, k k10, T0.h h9, z z8, boolean bl6, y1 y12) {
        super(g8, k8, q8, n8, object, l8, l9, l10);
        this.A = bl;
        this.o = n9;
        this.M = bl3;
        this.l = n10;
        this.q = k9;
        this.p = g9;
        bl = k9 != null;
        this.H = bl;
        this.B = bl2;
        this.m = uri;
        this.s = bl5;
        this.u = e8;
        this.D = l11;
        this.t = bl4;
        this.v = h8;
        this.w = list;
        this.x = m8;
        this.r = k10;
        this.y = h9;
        this.z = z8;
        this.n = bl6;
        this.C = y12;
        this.K = X2.v.Y();
        this.k = N.getAndIncrement();
    }

    public static g i(g g8, byte[] arrby, byte[] arrby2) {
        if (arrby != null) {
            g0.a.e(arrby2);
            return new a(g8, arrby, arrby2);
        }
        return g8;
    }

    public static j j(h h8, g object, q q8, long l8, r0.f object2, f.e e8, Uri uri, List list, int n8, Object object3, boolean bl, v v8, long l9, j object4, byte[] arrby, byte[] object5, boolean bl2, y1 y12, g.a object6) {
        boolean bl3;
        f.e e9 = e8.a;
        object6 = new k.b().i(G.f(object2.a, e9.o)).h(e9.w).g(e9.x);
        int n9 = e8.d ? 8 : 0;
        i0.k k8 = object6.b(n9).a();
        boolean bl4 = arrby != null;
        object6 = bl4 ? j.l((String)g0.a.e(e9.v)) : null;
        g g8 = j.i((g)object, arrby, (byte[])object6);
        object6 = e9.p;
        if (object6 != null) {
            bl3 = object5 != null;
            arrby = bl3 ? j.l((String)g0.a.e(object6.v)) : null;
            Uri uri2 = G.f(object2.a, object6.o);
            object6 = new k.b().i(uri2).h(object6.w).g(object6.x).a();
            object5 = j.i((g)object, (byte[])object5, arrby);
            arrby = object6;
        } else {
            arrby = null;
            object5 = null;
            bl3 = false;
        }
        l8 += e9.s;
        long l10 = e9.q;
        int n10 = object2.j + e9.r;
        if (object4 != null) {
            object = object4.q;
            n9 = !(arrby == object || arrby != null && object != null && arrby.a.equals((Object)object.a) && arrby.g == object4.q.g) ? 0 : 1;
            boolean bl5 = uri.equals((Object)object4.m) && object4.J;
            object2 = object4.y;
            object6 = object4.z;
            object = n9 != 0 && bl5 && !object4.L && object4.l == n10 ? object4.E : null;
            object4 = object6;
        } else {
            object = new T0.h();
            object4 = new z(10);
            object6 = null;
            object2 = object;
            object = object6;
        }
        return new j(h8, g8, k8, q8, bl4, (g)object5, (i0.k)arrby, bl3, uri, list, n8, object3, l8, l8 + l10, e8.b, e8.c, e8.d ^ true, n10, e9.y, bl, v8.a(n10), l9, e9.t, (k)object, (T0.h)object2, (z)object4, bl2, y12);
    }

    public static byte[] l(String arrby) {
        byte[] arrby2 = arrby;
        if (c.e((String)arrby).startsWith("0x")) {
            arrby2 = arrby.substring(2);
        }
        arrby = new BigInteger((String)arrby2, 16).toByteArray();
        arrby2 = new byte[16];
        int n8 = arrby.length > 16 ? arrby.length - 16 : 0;
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby2, (int)(16 - arrby.length + n8), (int)(arrby.length - n8));
        return arrby2;
    }

    public static boolean p(f.e e8, r0.f f8) {
        f.e e9 = e8.a;
        if (e9 instanceof f.b) {
            if (!(((f.b)e9).z || e8.c == 0 && f8.c)) {
                return false;
            }
            return true;
        }
        return f8.c;
    }

    public static boolean w(j j8, Uri uri, r0.f f8, f.e e8, long l8) {
        boolean bl = false;
        if (j8 == null) {
            return false;
        }
        if (uri.equals((Object)j8.m) && j8.J) {
            return false;
        }
        long l9 = e8.a.s;
        if (!j.p(e8, f8) || l8 + l9 < j8.h) {
            bl = true;
        }
        return bl;
    }

    @Override
    public void b() {
        k k8;
        g0.a.e(this.F);
        if (this.E == null && (k8 = this.r) != null && k8.e()) {
            this.E = this.r;
            this.H = false;
        }
        this.s();
        if (!this.I) {
            if (!this.t) {
                this.r();
            }
            this.J = this.I ^ true;
        }
    }

    @Override
    public void c() {
        this.I = true;
    }

    @Override
    public boolean h() {
        return this.J;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void k(g var1_1, i0.k var2_2, boolean var3_4, boolean var4_5) {
        block15 : {
            var6_6 = false;
            var5_7 = false;
            if (var3_4) {
                if (this.G != 0) {
                    var5_7 = true;
                }
                var11_8 = var2_2;
            } else {
                var11_8 = var2_2.e(this.G);
                var5_7 = var6_6;
            }
            try {
                var11_8 = this.u(var1_1, (i0.k)var11_8, var4_5);
                if (var5_7) {
                    var11_8.i(this.G);
                }
                break block15;
            }
            catch (Throwable var2_3) {}
            i0.j.a(var1_1);
            throw var2_3;
        }
        while (!this.I && (var3_4 = this.E.c((F0.s)var11_8))) {
        }
        {
            block16 : {
                var9_11 = var11_8.p();
                var7_12 = var2_2.g;
                break block16;
                catch (Throwable var12_9) {
                    ** GOTO lbl-1000
                }
                catch (EOFException var12_10) {}
                {
                    if ((this.d.f & 16384) == 0) throw var12_10;
                    this.E.d();
                }
                {
                    var9_11 = var11_8.p();
                    var7_12 = var2_2.g;
                }
            }
            this.G = (int)(var9_11 - var7_12);
        }
        i0.j.a(var1_1);
        return;
lbl-1000: // 1 sources:
        {
            this.G = (int)(var11_8.p() - var2_2.g);
            throw var12_9;
        }
    }

    public int m(int n8) {
        g0.a.f(this.n ^ true);
        if (n8 >= this.K.size()) {
            return 0;
        }
        return (Integer)this.K.get(n8);
    }

    public void n(s s8, X2.v v8) {
        this.F = s8;
        this.K = v8;
    }

    public void o() {
        this.L = true;
    }

    public boolean q() {
        return this.M;
    }

    public final void r() {
        this.k(this.i, this.b, this.A, true);
    }

    public final void s() {
        if (!this.H) {
            return;
        }
        g0.a.e(this.p);
        g0.a.e(this.q);
        this.k(this.p, this.q, this.B, false);
        this.G = 0;
        this.H = false;
    }

    public final long t(F0.s object) {
        Object object2;
        object.h();
        try {
            this.z.P(10);
            object.n(this.z.e(), 0, 10);
        }
        catch (EOFException eOFException) {
            return -9223372036854775807L;
        }
        if (this.z.J() != 4801587) {
            return -9223372036854775807L;
        }
        this.z.U(3);
        int n8 = this.z.F();
        int n9 = n8 + 10;
        if (n9 > this.z.b()) {
            object2 = this.z.e();
            this.z.P(n9);
            System.arraycopy((Object)object2, (int)0, (Object)this.z.e(), (int)0, (int)10);
        }
        object.n(this.z.e(), 10, n8);
        object = this.y.e(this.z.e(), n8);
        if (object == null) {
            return -9223372036854775807L;
        }
        n9 = object.e();
        for (n8 = 0; n8 < n9; ++n8) {
            object2 = object.d(n8);
            if (!(object2 instanceof T0.m)) continue;
            object2 = (T0.m)object2;
            if (!"com.apple.streaming.transportStreamTimestamp".equals((Object)object2.p)) continue;
            System.arraycopy((Object)object2.q, (int)0, (Object)this.z.e(), (int)0, (int)8);
            this.z.T(0);
            this.z.S(8);
            return this.z.z() & 0x1FFFFFFFFL;
        }
        return -9223372036854775807L;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final F0.j u(g object, i0.k k8, boolean bl) {
        long l8 = object.e(k8);
        if (bl) {
            try {
                this.u.j(this.s, this.g, this.D);
            }
            catch (TimeoutException timeoutException) {
                throw new IOException((Throwable)timeoutException);
            }
        }
        F0.j j8 = new F0.j((i)object, k8.g, l8);
        if (this.E == null) {
            l8 = this.t(j8);
            j8.h();
            k k9 = this.r;
            object = k9 != null ? k9.f() : this.v.c(k8.a, this.d, this.w, this.u, object.g(), j8, this.C);
            this.E = object;
            if (object.a()) {
                object = this.F;
                l8 = l8 != -9223372036854775807L ? this.u.b(l8) : this.g;
            } else {
                object = this.F;
                l8 = 0L;
            }
            object.p0(l8);
            this.F.b0();
            this.E.b(this.F);
        }
        this.F.m0(this.x);
        return j8;
        catch (InterruptedException interruptedException) {
            throw new InterruptedIOException();
        }
    }

    public void v() {
        this.M = true;
    }
}

