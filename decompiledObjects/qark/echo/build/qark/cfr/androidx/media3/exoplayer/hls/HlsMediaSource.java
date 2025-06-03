/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Looper
 *  java.lang.Comparable
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.List
 */
package androidx.media3.exoplayer.hls;

import B0.b;
import android.net.Uri;
import android.os.Looper;
import d0.I;
import d0.u;
import g0.M;
import i0.g;
import i0.y;
import java.util.List;
import l0.y1;
import p0.A;
import p0.l;
import p0.v;
import q0.c;
import q0.g;
import q0.h;
import q0.i;
import q0.m;
import r0.a;
import r0.e;
import r0.f;
import r0.j;
import r0.k;
import x0.E;
import x0.V;
import x0.x;

public final class HlsMediaSource
extends x0.a
implements k.e {
    public final h h;
    public final g i;
    public final x0.j j;
    public final p0.x k;
    public final B0.m l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final k p;
    public final long q;
    public final long r;
    public u.g s;
    public y t;
    public u u;

    static {
        d0.v.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(u u8, g g8, h h8, x0.j j8, B0.f f8, p0.x x8, B0.m m8, k k8, long l8, boolean bl, int n8, boolean bl2, long l9) {
        this.u = u8;
        this.s = u8.d;
        this.i = g8;
        this.h = h8;
        this.j = j8;
        this.k = x8;
        this.l = m8;
        this.p = k8;
        this.q = l8;
        this.m = bl;
        this.n = n8;
        this.o = bl2;
        this.r = l9;
    }

    public /* synthetic */ HlsMediaSource(u u8, g g8, h h8, x0.j j8, B0.f f8, p0.x x8, B0.m m8, k k8, long l8, boolean bl, int n8, boolean bl2, long l9,  a8) {
        this(u8, g8, h8, j8, f8, x8, m8, k8, l8, bl, n8, bl2, l9);
    }

    public static f.b E(List list, long l8) {
        f.b b8 = null;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            f.b b9 = (f.b)list.get(i8);
            long l9 = b9.s;
            if (l9 > l8 || !b9.z) {
                b9 = b8;
                if (l9 > l8) {
                    return b8;
                }
            }
            b8 = b9;
        }
        return b8;
    }

    public static f.d F(List list, long l8) {
        return (f.d)list.get(M.f(list, (Comparable)Long.valueOf((long)l8), true, true));
    }

    public static long I(f f8, long l8) {
        f.f f9 = f8.v;
        long l9 = f8.e;
        if (l9 != -9223372036854775807L) {
            l9 = f8.u - l9;
        } else {
            l9 = f9.d;
            if ((l9 == -9223372036854775807L || f8.n == -9223372036854775807L) && (l9 = f9.c) == -9223372036854775807L) {
                l9 = f8.m * 3L;
            }
        }
        return l9 + l8;
    }

    @Override
    public void B() {
        this.p.stop();
        this.k.release();
    }

    public final V C(f f8, long l8, long l9, i i8) {
        long l10 = f8.h - this.p.m();
        long l11 = f8.o ? l10 + f8.u : -9223372036854775807L;
        long l12 = this.G(f8);
        long l13 = this.s.a;
        l13 = l13 != -9223372036854775807L ? M.J0(l13) : HlsMediaSource.I(f8, l12);
        this.J(f8, M.q(l13, l12, f8.u + l12));
        l13 = this.H(f8, l12);
        boolean bl = f8.d == 2 && f8.f;
        return new V(l8, l9, -9223372036854775807L, l11, f8.u, l10, l13, true, f8.o ^ true, bl, i8, this.a(), this.s);
    }

    public final V D(f f8, long l8, long l9, i i8) {
        long l10;
        l10 = f8.e != -9223372036854775807L && !f8.r.isEmpty() ? (!f8.g && (l10 = f8.e) != f8.u ? HlsMediaSource.F((List)f8.r, (long)l10).s : f8.e) : 0L;
        long l11 = f8.u;
        return new V(l8, l9, -9223372036854775807L, l11, l11, 0L, l10, true, false, true, i8, this.a(), null);
    }

    public final long G(f f8) {
        if (f8.p) {
            return M.J0(M.d0(this.q)) - f8.e();
        }
        return 0L;
    }

    public final long H(f object, long l8) {
        long l9 = object.e;
        l8 = l9 != -9223372036854775807L ? l9 : object.u + l8 - M.J0(this.s.a);
        if (object.g) {
            return l8;
        }
        f.b b8 = HlsMediaSource.E(object.s, l8);
        if (b8 != null) {
            return b8.s;
        }
        if (object.r.isEmpty()) {
            return 0L;
        }
        object = HlsMediaSource.F(object.r, l8);
        b8 = HlsMediaSource.E(object.A, l8);
        if (b8 != null) {
            return b8.s;
        }
        return object.s;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void J(f var1_1, long var2_2) {
        var7_3 = this.a().d;
        if (var7_3.d != -3.4028235E38f || var7_3.e != -3.4028235E38f) ** GOTO lbl-1000
        var1_1 = var1_1.v;
        if (var1_1.c == -9223372036854775807L && var1_1.d == -9223372036854775807L) {
            var6_4 = true;
        } else lbl-1000: // 2 sources:
        {
            var6_4 = false;
        }
        var1_1 = new u.g.a().k(M.i1(var2_2));
        var5_5 = 1.0f;
        var4_6 = var6_4 != false ? 1.0f : this.s.d;
        var1_1 = var1_1.j(var4_6);
        var4_6 = var6_4 != false ? var5_5 : this.s.e;
        this.s = var1_1.h(var4_6).f();
    }

    @Override
    public u a() {
        synchronized (this) {
            u u8 = this.u;
            return u8;
        }
    }

    @Override
    public void b(f object) {
        long l8 = object.p ? M.i1(object.h) : -9223372036854775807L;
        int n8 = object.d;
        long l9 = n8 != 2 && n8 != 1 ? -9223372036854775807L : l8;
        i i8 = new i((r0.g)g0.a.e(this.p.b()), (f)object);
        object = this.p.a() ? this.C((f)object, l9, l8, i8) : this.D((f)object, l9, l8, i8);
        this.A((I)object);
    }

    @Override
    public void e(x0.v v8) {
        ((m)v8).D();
    }

    @Override
    public x0.v f(x.b object, b b8, long l8) {
        E.a a8 = this.u((x.b)object);
        object = this.s((x.b)object);
        return new m(this.h, this.p, this.i, this.t, null, this.k, (v.a)object, this.l, a8, b8, this.j, this.m, this.n, this.o, this.x(), this.r);
    }

    @Override
    public void h() {
        this.p.f();
    }

    @Override
    public void l(u u8) {
        synchronized (this) {
            this.u = u8;
            return;
        }
    }

    @Override
    public void z(y object) {
        this.t = object;
        this.k.a((Looper)g0.a.e((Object)Looper.myLooper()), this.x());
        this.k.g();
        object = this.u(null);
        this.p.e(((u.h)g0.a.e((Object)this.a().b)).a, (E.a)object, this);
    }

    public static final class Factory
    implements x.a {
        public final g a;
        public h b;
        public j c;
        public k.a d;
        public x0.j e;
        public A f;
        public B0.m g;
        public boolean h;
        public int i;
        public boolean j;
        public long k;
        public long l;

        public Factory(g.a a8) {
            this(new c(a8));
        }

        public Factory(g g8) {
            this.a = (g)g0.a.e(g8);
            this.f = new l();
            this.c = new a();
            this.d = r0.c.D;
            this.b = h.a;
            this.g = new B0.k();
            this.e = new x0.m();
            this.i = 1;
            this.k = -9223372036854775807L;
            this.h = true;
            this.b(true);
        }

        public HlsMediaSource a(u u8) {
            g0.a.e(u8.b);
            j j8 = this.c;
            Object object = u8.b.d;
            if (!object.isEmpty()) {
                j8 = new e(j8, (List)object);
            }
            object = this.a;
            h h8 = this.b;
            x0.j j9 = this.e;
            p0.x x8 = this.f.a(u8);
            B0.m m8 = this.g;
            return new HlsMediaSource(u8, (g)object, h8, j9, null, x8, m8, this.d.a(this.a, m8, j8), this.k, this.h, this.i, this.j, this.l, null);
        }

        public Factory b(boolean bl) {
            this.b.a(bl);
            return this;
        }
    }

}

