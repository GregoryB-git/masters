/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.SystemClock
 *  android.util.Pair
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package androidx.media3.exoplayer.dash;

import B0.g;
import B0.m;
import F0.T;
import X2.v;
import X2.w;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import d0.q;
import d0.z;
import g0.G;
import g0.M;
import i0.g;
import i0.k;
import i0.t;
import i0.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k0.d1;
import k0.y0;
import l0.y1;
import n0.h;
import n0.i;
import y0.d;
import y0.e;
import y0.f;
import y0.j;
import y0.l;
import y0.m;
import y0.n;
import y0.o;

public class c
implements androidx.media3.exoplayer.dash.a {
    public final B0.o a;
    public final n0.b b;
    public final int[] c;
    public final int d;
    public final g e;
    public final long f;
    public final int g;
    public final d.c h;
    public final b[] i;
    public A0.y j;
    public o0.c k;
    public int l;
    public IOException m;
    public boolean n;
    public long o;

    public c(f.a a8, B0.o object, o0.c c8, n0.b b8, int n8, int[] object2, A0.y y8, int n9, g arrb, long l8, int n10, boolean bl, List list, d.c c9, y1 y12, B0.f f8) {
        this.a = object;
        this.k = c8;
        this.b = b8;
        this.c = object2;
        this.j = y8;
        this.d = n9;
        this.e = arrb;
        this.l = n8;
        this.f = l8;
        this.g = n10;
        this.h = c9;
        this.o = -9223372036854775807L;
        l8 = c8.g(n8);
        c8 = this.n();
        this.i = new b[y8.length()];
        for (n8 = 0; n8 < this.i.length; ++n8) {
            object2 = (o0.j)c8.get(y8.c(n8));
            object = b8.j(object2.c);
            arrb = this.i;
            if (object == null) {
                object = (o0.b)object2.c.get(0);
            }
            arrb[n8] = new b(l8, (o0.j)object2, (o0.b)object, a8.c(n9, object2.b, bl, list, c9, y12), 0L, object2.l());
        }
    }

    @Override
    public void a() {
        IOException iOException = this.m;
        if (iOException == null) {
            this.a.a();
            return;
        }
        throw iOException;
    }

    @Override
    public boolean b(long l8, e e8, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.q(l8, e8, list);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void c(o0.c c8, int n8) {
        long l8;
        try {
            this.k = c8;
            this.l = n8;
            l8 = c8.g(n8);
            c8 = this.n();
            n8 = 0;
        }
        catch (x0.b b8) {
            this.m = b8;
        }
        do {
            if (n8 >= this.i.length) return;
            o0.j j8 = (o0.j)c8.get(this.j.c(n8));
            b[] arrb = this.i;
            arrb[n8] = arrb[n8].b(l8, j8);
            ++n8;
        } while (true);
    }

    @Override
    public long d(long l8, d1 d12) {
        for (b b8 : this.i) {
            long l9;
            if (b8.d == null || (l9 = b8.h()) == 0L) continue;
            long l10 = b8.j(l8);
            long l11 = b8.k(l10);
            l9 = l11 < l8 && (l9 == -1L || l10 < b8.f() + l9 - 1L) ? b8.k(l10 + 1L) : l11;
            return d12.a(l8, l11, l9);
        }
        return l8;
    }

    @Override
    public boolean e(e e8, boolean bl, m.c object, B0.m object2) {
        long l8;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        Object object3 = this.h;
        if (object3 != null && object3.j(e8)) {
            return true;
        }
        if (!this.k.d && e8 instanceof m && (object3 = object.c) instanceof t && ((t)object3).r == 404 && (l8 = (object3 = this.i[this.j.a(e8.d)]).h()) != -1L && l8 != 0L) {
            long l9 = object3.f();
            if (((m)e8).g() > l9 + l8 - 1L) {
                this.n = true;
                return true;
            }
        }
        int n8 = this.j.a(e8.d);
        object3 = this.i[n8];
        Object object4 = this.b.j(object3.b.c);
        if (object4 != null && !object3.c.equals(object4)) {
            return true;
        }
        object4 = this.j(this.j, object3.b.c);
        if (!object4.a(2) && !object4.a(1)) {
            return false;
        }
        object = object2.b((m.a)object4, (m.c)object);
        bl = bl2;
        if (object != null) {
            if (!object4.a(object.a)) {
                return false;
            }
            n8 = object.a;
            if (n8 == 2) {
                object2 = this.j;
                return object2.p(object2.a(e8.d), object.b);
            }
            bl = bl2;
            if (n8 == 1) {
                this.b.e(object3.c, object.b);
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public int f(long l8, List list) {
        if (this.m == null && this.j.length() >= 2) {
            return this.j.k(l8, list);
        }
        return list.size();
    }

    @Override
    public void g(e e8) {
        Object object;
        if (e8 instanceof l) {
            F0.h h8;
            object = (l)e8;
            int n8 = this.j.a(object.d);
            object = this.i[n8];
            if (object.d == null && (h8 = ((f)g0.a.h(object.a)).d()) != null) {
                this.i[n8] = object.c(new i(h8, object.b.d));
            }
        }
        if ((object = this.h) != null) {
            object.i(e8);
        }
    }

    @Override
    public void h(y0 object, long l8, List list, y0.g g8) {
        int n8;
        long l9;
        Object object2;
        b b8;
        long l10;
        if (this.m != null) {
            return;
        }
        long l11 = object.a;
        long l12 = l8 - l11;
        long l13 = M.J0(this.k.a);
        long l14 = M.J0(this.k.d((int)this.l).b);
        object = this.h;
        if (object != null && object.h(l13 + l14 + l8)) {
            return;
        }
        l13 = M.J0(M.d0(this.f));
        l14 = this.m(l13);
        m m8 = list.isEmpty() ? null : (m)list.get(list.size() - 1);
        int n9 = this.j.length();
        object = new n[n9];
        for (n8 = 0; n8 < n9; ++n8) {
            b8 = this.i[n8];
            if (b8.d == null) {
                object[n8] = n.a;
                continue;
            }
            l10 = b8.e(l13);
            l9 = b8.g(l13);
            int n10 = n8;
            object2 = object;
            long l15 = this.o(b8, m8, l8, l10, l9);
            object2[n10] = l15 < l10 ? n.a : new c(this.r(n10), l15, l9, l14);
        }
        l10 = this.k(l13, l11);
        this.j.v(l11, l12, l10, list, (n[])object);
        n8 = this.j.o();
        this.o = SystemClock.elapsedRealtime();
        b8 = this.r(n8);
        object = b8.a;
        if (object != null) {
            object2 = b8.b;
            object = object.f() == null ? object2.n() : null;
            object2 = b8.d == null ? object2.m() : null;
            if (object != null || object2 != null) {
                g8.a = this.p(b8, this.e, this.j.m(), this.j.n(), this.j.s(), (o0.i)object, (o0.i)object2, null);
                return;
            }
        }
        l11 = b8.e;
        object = this.k;
        n8 = object.d && this.l == object.e() - 1 ? 1 : 0;
        l12 = -9223372036854775807L;
        int n11 = n8 != 0 && l11 == -9223372036854775807L ? 0 : 1;
        if (b8.h() == 0L) {
            g8.b = n11;
            return;
        }
        l10 = b8.e(l13);
        l13 = b8.g(l13);
        int n12 = n11;
        if (n8 != 0) {
            l9 = b8.i(l13);
            n8 = l9 + (l9 - b8.k(l13)) >= l11 ? 1 : 0;
            n12 = n11 & n8;
        }
        if ((l9 = this.o(b8, m8, l8, l10, l13)) < l10) {
            this.m = new x0.b();
            return;
        }
        n8 = (int)(l9 LCMP l13);
        if (!(n8 > 0 || this.n && n8 >= 0)) {
            if (n12 != 0 && b8.k(l9) >= l11) {
                g8.b = true;
                return;
            }
            n9 = n8 = (int)Math.min((long)this.g, (long)(l13 - l9 + 1L));
            if (l11 != -9223372036854775807L) {
                do {
                    n9 = n8;
                    if (n8 <= 1) break;
                    n9 = n8;
                    if (b8.k((long)n8 + l9 - 1L) < l11) break;
                    --n8;
                } while (true);
            }
            l13 = l12;
            if (list.isEmpty()) {
                l13 = l8;
            }
            g8.a = this.q(b8, this.e, this.d, this.j.m(), this.j.n(), this.j.s(), l9, n9, l13, l14, null);
            return;
        }
        g8.b = n12;
    }

    @Override
    public void i(A0.y y8) {
        this.j = y8;
    }

    public final m.a j(A0.y y8, List list) {
        int n8;
        long l8 = SystemClock.elapsedRealtime();
        int n9 = y8.length();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            int n11 = n10;
            if (y8.i(n8, l8)) {
                n11 = n10 + 1;
            }
            n10 = n11;
        }
        n8 = n0.b.f(list);
        return new m.a(n8, n8 - this.b.g(list), n9, n10);
    }

    public final long k(long l8, long l9) {
        if (this.k.d && this.i[0].h() != 0L) {
            long l10 = this.i[0].g(l8);
            l10 = this.i[0].i(l10);
            return Math.max((long)0L, (long)(Math.min((long)this.m(l8), (long)l10) - l9));
        }
        return -9223372036854775807L;
    }

    public final Pair l(long l8, o0.i object, b object2) {
        if (++l8 >= object2.h()) {
            return null;
        }
        o0.i i8 = object2.l(l8);
        String string2 = G.a(object.b(object2.c.a), i8.b(object2.c.a));
        object = new StringBuilder();
        object.append(i8.a);
        object.append("-");
        object = object2 = object.toString();
        if (i8.b != -1L) {
            object = new StringBuilder();
            object.append((String)object2);
            object.append(i8.a + i8.b);
            object = object.toString();
        }
        return new Pair((Object)string2, object);
    }

    public final long m(long l8) {
        o0.c c8 = this.k;
        long l9 = c8.a;
        if (l9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l8 - M.J0(l9 + c8.d((int)this.l).b);
    }

    public final ArrayList n() {
        List list = this.k.d((int)this.l).c;
        ArrayList arrayList = new ArrayList();
        int[] arrn = this.c;
        int n8 = arrn.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.addAll((Collection)((o0.a)list.get((int)arrn[i8])).c);
        }
        return arrayList;
    }

    public final long o(b b8, m m8, long l8, long l9, long l10) {
        if (m8 != null) {
            return m8.g();
        }
        return M.q(b8.j(l8), l9, l10);
    }

    public e p(b b8, g g8, q q8, int n8, Object object, o0.i i8, o0.i i9, g.a object2) {
        object2 = b8.b;
        if (i8 != null) {
            if ((i9 = i8.a(i9, b8.c.a)) != null) {
                i8 = i9;
            }
        } else {
            i8 = (o0.i)g0.a.e(i9);
        }
        return new l(g8, h.a((o0.j)object2, b8.c.a, i8, 0, w.j()), q8, n8, object, b8.a);
    }

    public e q(b b8, g g8, int n8, q q8, int n9, Object object, long l8, int n10, long l9, long l10, g.a object2) {
        o0.j j8 = b8.b;
        long l11 = b8.k(l8);
        object2 = b8.l(l8);
        Object object3 = b8.a;
        int n11 = 8;
        if (object3 == null) {
            l9 = b8.i(l8);
            if (b8.m(l8, l10)) {
                n11 = 0;
            }
            return new o(g8, h.a(j8, b8.c.a, (o0.i)object2, n11, w.j()), q8, n9, object, l11, l9, l8, n8, q8);
        }
        n8 = 1;
        for (int i8 = 1; i8 < n10 && (object3 = object2.a(b8.l((long)i8 + l8), b8.c.a)) != null; ++i8) {
            ++n8;
            object2 = object3;
        }
        long l12 = (long)n8 + l8 - 1L;
        long l13 = b8.i(l12);
        long l14 = b8.e;
        if (l14 == -9223372036854775807L || l14 > l13) {
            l14 = -9223372036854775807L;
        }
        if (b8.m(l12, l10)) {
            n11 = 0;
        }
        object2 = h.a(j8, b8.c.a, (o0.i)object2, n11, w.j());
        l10 = l12 = - j8.d;
        if (z.p(q8.n)) {
            l10 = l12 + l11;
        }
        return new j(g8, (k)object2, q8, n9, object, l11, l13, l9, l14, l8, n8, l10, b8.a);
    }

    public final b r(int n8) {
        b b8 = this.i[n8];
        o0.b b9 = this.b.j(b8.b.c);
        b b10 = b8;
        if (b9 != null) {
            b10 = b8;
            if (!b9.equals(b8.c)) {
                this.i[n8] = b10 = b8.d(b9);
            }
        }
        return b10;
    }

    @Override
    public void release() {
        b[] arrb = this.i;
        int n8 = arrb.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            f f8 = arrb[i8].a;
            if (f8 == null) continue;
            f8.release();
        }
    }

    public static final class a
    implements a.a {
        public final g.a a;
        public final int b;
        public final f.a c;

        public a(g.a a8) {
            this(a8, 1);
        }

        public a(g.a a8, int n8) {
            this(y0.d.x, a8, n8);
        }

        public a(f.a a8, g.a a9, int n8) {
            this.c = a8;
            this.a = a9;
            this.b = n8;
        }

        @Override
        public q b(q q8) {
            return this.c.b(q8);
        }

        @Override
        public androidx.media3.exoplayer.dash.a c(B0.o o8, o0.c c8, n0.b b8, int n8, int[] arrn, A0.y y8, int n9, long l8, boolean bl, List list, d.c c9, y y9, y1 y12, B0.f f8) {
            g g8 = this.a.a();
            if (y9 != null) {
                g8.c(y9);
            }
            return new c(this.c, o8, c8, b8, n8, arrn, y8, n9, g8, l8, this.b, bl, list, c9, y12, f8);
        }

        public a d(boolean bl) {
            this.c.a(bl);
            return this;
        }
    }

    public static final class b {
        public final f a;
        public final o0.j b;
        public final o0.b c;
        public final n0.g d;
        public final long e;
        public final long f;

        public b(long l8, o0.j j8, o0.b b8, f f8, long l9, n0.g g8) {
            this.e = l8;
            this.b = j8;
            this.c = b8;
            this.f = l9;
            this.a = f8;
            this.d = g8;
        }

        /*
         * Enabled aggressive block sorting
         */
        public b b(long l8, o0.j j8) {
            n0.g g8 = this.b.l();
            n0.g g9 = j8.l();
            if (g8 == null) {
                return new b(l8, j8, this.c, this.a, this.f, g8);
            }
            if (!g8.g()) {
                return new b(l8, j8, this.c, this.a, this.f, g9);
            }
            long l9 = g8.i(l8);
            if (l9 == 0L) {
                return new b(l8, j8, this.c, this.a, this.f, g9);
            }
            g0.a.h(g9);
            long l10 = g8.h();
            long l11 = g8.c(l10);
            long l12 = (l9 += l10) - 1L;
            long l13 = g8.c(l12);
            long l14 = g8.b(l12, l8);
            l12 = g9.h();
            long l15 = g9.c(l12);
            long l16 = this.f;
            long l17 = l13 + l14 LCMP l15;
            if (l17 != false) {
                if (l17 < 0) throw new x0.b();
                if (l15 < l11) {
                    l9 = l16 - (g9.a(l11, l8) - l10);
                    return new b(l8, j8, this.c, this.a, l9, g9);
                }
                l9 = g8.a(l15, l8);
            }
            l9 = l16 + (l9 - l12);
            return new b(l8, j8, this.c, this.a, l9, g9);
        }

        public b c(n0.g g8) {
            return new b(this.e, this.b, this.c, this.a, this.f, g8);
        }

        public b d(o0.b b8) {
            return new b(this.e, this.b, b8, this.a, this.f, this.d);
        }

        public long e(long l8) {
            return ((n0.g)g0.a.h(this.d)).d(this.e, l8) + this.f;
        }

        public long f() {
            return ((n0.g)g0.a.h(this.d)).h() + this.f;
        }

        public long g(long l8) {
            return this.e(l8) + ((n0.g)g0.a.h(this.d)).j(this.e, l8) - 1L;
        }

        public long h() {
            return ((n0.g)g0.a.h(this.d)).i(this.e);
        }

        public long i(long l8) {
            return this.k(l8) + ((n0.g)g0.a.h(this.d)).b(l8 - this.f, this.e);
        }

        public long j(long l8) {
            return ((n0.g)g0.a.h(this.d)).a(l8, this.e) + this.f;
        }

        public long k(long l8) {
            return ((n0.g)g0.a.h(this.d)).c(l8 - this.f);
        }

        public o0.i l(long l8) {
            return ((n0.g)g0.a.h(this.d)).f(l8 - this.f);
        }

        public boolean m(long l8, long l9) {
            boolean bl = ((n0.g)g0.a.h(this.d)).g();
            boolean bl2 = true;
            if (bl) {
                return true;
            }
            if (l9 != -9223372036854775807L) {
                if (this.i(l8) <= l9) {
                    return true;
                }
                bl2 = false;
            }
            return bl2;
        }
    }

    public static final class c
    extends y0.b {
        public final b e;
        public final long f;

        public c(b b8, long l8, long l9, long l10) {
            super(l8, l9);
            this.e = b8;
            this.f = l10;
        }

        @Override
        public long a() {
            this.c();
            return this.e.i(this.d());
        }

        @Override
        public long b() {
            this.c();
            return this.e.k(this.d());
        }
    }

}

