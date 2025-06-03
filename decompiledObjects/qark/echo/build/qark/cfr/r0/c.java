/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Handler
 *  android.os.SystemClock
 *  java.io.IOException
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package r0;

import B0.m;
import B0.n;
import B0.p;
import X2.B;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import d0.A;
import g0.M;
import g0.a;
import i0.t;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.d;
import r0.f;
import r0.g;
import r0.h;
import r0.i;
import r0.j;
import r0.k;
import x0.E;
import x0.r;
import x0.u;

public final class c
implements k,
n.b {
    public static final k.a D = new r0.b();
    public f A;
    public boolean B;
    public long C;
    public final q0.g o;
    public final j p;
    public final m q;
    public final HashMap r;
    public final CopyOnWriteArrayList s;
    public final double t;
    public E.a u;
    public n v;
    public Handler w;
    public k.e x;
    public g y;
    public Uri z;

    public c(q0.g g8, m m8, j j8) {
        this(g8, m8, j8, 3.5);
    }

    public c(q0.g g8, m m8, j j8, double d8) {
        this.o = g8;
        this.p = j8;
        this.q = m8;
        this.t = d8;
        this.s = new CopyOnWriteArrayList();
        this.r = new HashMap();
        this.C = -9223372036854775807L;
    }

    public static f.d G(f f8, f f9) {
        int n8 = (int)(f9.k - f8.k);
        f8 = f8.r;
        if (n8 < f8.size()) {
            return (f.d)f8.get(n8);
        }
        return null;
    }

    public final void F(List list) {
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Uri uri = (Uri)list.get(i8);
            c c8 = new c(uri);
            this.r.put((Object)uri, (Object)c8);
        }
    }

    public final f H(f f8, f f9) {
        if (!f9.f(f8)) {
            f f10 = f8;
            if (f9.o) {
                f10 = f8.d();
            }
            return f10;
        }
        return f9.c(this.J(f8, f9), this.I(f8, f9));
    }

    public final int I(f f8, f f9) {
        if (f9.i) {
            return f9.j;
        }
        Object object = this.A;
        int n8 = object != null ? object.j : 0;
        if (f8 == null) {
            return n8;
        }
        object = c.G(f8, f9);
        if (object != null) {
            return f8.j + object.r - ((f.d)f9.r.get((int)0)).r;
        }
        return n8;
    }

    public final long J(f f8, f f9) {
        if (f9.p) {
            return f9.h;
        }
        Object object = this.A;
        long l8 = object != null ? object.h : 0L;
        if (f8 == null) {
            return l8;
        }
        int n8 = f8.r.size();
        object = c.G(f8, f9);
        if (object != null) {
            return f8.h + object.s;
        }
        if ((long)n8 == f9.k - f8.k) {
            return f8.e();
        }
        return l8;
    }

    public final Uri K(Uri uri) {
        Object object = this.A;
        Uri uri2 = uri;
        if (object != null) {
            uri2 = uri;
            if (object.v.e) {
                object = (f.c)object.t.get((Object)uri);
                uri2 = uri;
                if (object != null) {
                    uri = uri.buildUpon();
                    uri.appendQueryParameter("_HLS_msn", String.valueOf((long)object.b));
                    int n8 = object.c;
                    if (n8 != -1) {
                        uri.appendQueryParameter("_HLS_part", String.valueOf((int)n8));
                    }
                    uri2 = uri.build();
                }
            }
        }
        return uri2;
    }

    public final boolean L(Uri uri) {
        List list = this.y.e;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (!uri.equals((Object)((g.b)list.get((int)i8)).a)) continue;
            return true;
        }
        return false;
    }

    public final void M(Uri object) {
        object = (c)this.r.get(object);
        f f8 = object.j();
        if (object.k()) {
            return;
        }
        object.z(true);
        if (f8 != null && !f8.o) {
            object.n(true);
        }
    }

    public final boolean N() {
        List list = this.y.e;
        int n8 = list.size();
        long l8 = SystemClock.elapsedRealtime();
        for (int i8 = 0; i8 < n8; ++i8) {
            c c8 = (c)a.e((c)this.r.get((Object)((g.b)list.get((int)i8)).a));
            if (l8 <= c8.v) continue;
            list = c8.o;
            this.z = list;
            c8.q(this.K((Uri)list));
            return true;
        }
        return false;
    }

    public final void O(Uri uri) {
        if (!uri.equals((Object)this.z) && this.L(uri)) {
            Object object = this.A;
            if (object != null && object.o) {
                return;
            }
            this.z = uri;
            object = (c)this.r.get((Object)uri);
            f f8 = ((c)object).r;
            if (f8 != null && f8.o) {
                this.A = f8;
                this.x.b(f8);
                return;
            }
            ((c)object).q(this.K(uri));
        }
    }

    public final boolean P(Uri uri, m.c c8, boolean bl) {
        Iterator iterator = this.s.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= ((k.b)iterator.next()).e(uri, c8, bl) ^ true;
        }
        return bl2;
    }

    public void Q(p p8, long l8, long l9, boolean bl) {
        r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
        this.q.a(p8.a);
        this.u.p(r8, 4);
    }

    public void R(p p8, long l8, long l9) {
        h h8 = (h)p8.e();
        boolean bl = h8 instanceof f;
        Object object = bl ? g.e(h8.a) : (g)h8;
        this.y = object;
        this.z = ((g.b)object.e.get((int)0)).a;
        this.s.add((Object)new b(null));
        this.F(object.d);
        object = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
        c c8 = (c)this.r.get((Object)this.z);
        if (bl) {
            c8.x((f)h8, (r)object);
        } else {
            c8.n(false);
        }
        this.q.a(p8.a);
        this.u.s((r)object, 4);
    }

    public n.c S(p p8, long l8, long l9, IOException iOException, int n8) {
        r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
        u u8 = new u(p8.c);
        l8 = this.q.c(new m.c(r8, u8, iOException, n8));
        boolean bl = l8 == -9223372036854775807L;
        this.u.w(r8, p8.c, iOException, bl);
        if (bl) {
            this.q.a(p8.a);
        }
        if (bl) {
            return n.g;
        }
        return n.h(false, l8);
    }

    public final void T(Uri uri, f f8) {
        if (uri.equals((Object)this.z)) {
            if (this.A == null) {
                this.B = f8.o ^ true;
                this.C = f8.h;
            }
            this.A = f8;
            this.x.b(f8);
        }
        uri = this.s.iterator();
        while (uri.hasNext()) {
            ((k.b)uri.next()).a();
        }
    }

    @Override
    public boolean a() {
        return this.B;
    }

    @Override
    public g b() {
        return this.y;
    }

    @Override
    public boolean c(Uri object, long l8) {
        if ((object = (c)this.r.get(object)) != null) {
            return ((c)object).h(l8) ^ true;
        }
        return false;
    }

    @Override
    public boolean d(Uri uri) {
        return ((c)this.r.get((Object)uri)).l();
    }

    @Override
    public void e(Uri object, E.a a8, k.e object2) {
        this.w = M.A();
        this.u = a8;
        this.x = object2;
        object = new p(this.o.a(4), (Uri)object, 4, this.p.b());
        boolean bl = this.v == null;
        a.f(bl);
        this.v = object2 = new n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        long l8 = object2.n((n.e)object, this, this.q.d(object.c));
        a8.y(new r(object.a, object.b, l8), object.c);
    }

    @Override
    public void f() {
        n n8 = this.v;
        if (n8 != null) {
            n8.a();
        }
        if ((n8 = this.z) != null) {
            this.h((Uri)n8);
        }
    }

    @Override
    public void g(Uri object) {
        if ((object = (c)this.r.get(object)) != null) {
            object.z(false);
        }
    }

    @Override
    public void h(Uri uri) {
        ((c)this.r.get((Object)uri)).s();
    }

    @Override
    public void i(Uri uri) {
        ((c)this.r.get((Object)uri)).n(true);
    }

    @Override
    public void j(k.b b8) {
        a.e(b8);
        this.s.add((Object)b8);
    }

    @Override
    public f k(Uri uri, boolean bl) {
        f f8 = ((c)this.r.get((Object)uri)).j();
        if (f8 != null && bl) {
            this.O(uri);
            this.M(uri);
        }
        return f8;
    }

    @Override
    public void l(k.b b8) {
        this.s.remove((Object)b8);
    }

    @Override
    public long m() {
        return this.C;
    }

    @Override
    public void stop() {
        this.z = null;
        this.A = null;
        this.y = null;
        this.C = -9223372036854775807L;
        this.v.l();
        this.v = null;
        Iterator iterator = this.r.values().iterator();
        while (iterator.hasNext()) {
            ((c)iterator.next()).y();
        }
        this.w.removeCallbacksAndMessages((Object)null);
        this.w = null;
        this.r.clear();
    }

    public class b
    implements k.b {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public void a() {
            c.this.s.remove((Object)this);
        }

        @Override
        public boolean e(Uri object, m.c object2, boolean bl) {
            if (c.this.A == null) {
                int n8;
                long l8 = SystemClock.elapsedRealtime();
                Object object3 = ((g)M.i((Object)c.q((c)c.this))).e;
                int n9 = n8 = 0;
                while (n8 < object3.size()) {
                    c c8 = (c)c.this.r.get((Object)((g.b)object3.get((int)n8)).a);
                    int n10 = n9;
                    if (c8 != null) {
                        n10 = n9;
                        if (l8 < c8.v) {
                            n10 = n9 + 1;
                        }
                    }
                    ++n8;
                    n9 = n10;
                }
                object3 = new m.a(1, 0, c.q((c)c.this).e.size(), n9);
                object2 = c.this.q.b((m.a)object3, (m.c)object2);
                if (object2 != null && object2.a == 2 && (object = (c)c.this.r.get(object)) != null) {
                    ((c)object).h(object2.b);
                }
            }
            return false;
        }
    }

    public final class c
    implements n.b {
        public final Uri o;
        public final n p;
        public final i0.g q;
        public f r;
        public long s;
        public long t;
        public long u;
        public long v;
        public boolean w;
        public IOException x;
        public boolean y;

        public c(Uri uri) {
            this.o = uri;
            this.p = new n("DefaultHlsPlaylistTracker:MediaPlaylist");
            this.q = c.this.o.a(4);
        }

        public static /* synthetic */ void a(c c8, Uri uri) {
            c8.m(uri);
        }

        public final boolean h(long l8) {
            this.v = SystemClock.elapsedRealtime() + l8;
            if (this.o.equals((Object)c.this.z) && !c.this.N()) {
                return true;
            }
            return false;
        }

        public final Uri i() {
            Object object = this.r;
            if (object != null) {
                object = object.v;
                if (object.a != -9223372036854775807L || object.e) {
                    Uri.Builder builder = this.o.buildUpon();
                    object = this.r;
                    if (object.v.e) {
                        builder.appendQueryParameter("_HLS_msn", String.valueOf((long)(object.k + (long)object.r.size())));
                        object = this.r;
                        if (object.n != -9223372036854775807L) {
                            int n8;
                            object = object.s;
                            int n9 = n8 = object.size();
                            if (!object.isEmpty()) {
                                n9 = n8;
                                if (((f.b)B.d((Iterable)object)).A) {
                                    n9 = n8 - 1;
                                }
                            }
                            builder.appendQueryParameter("_HLS_part", String.valueOf((int)n9));
                        }
                    }
                    object = this.r.v;
                    if (object.a != -9223372036854775807L) {
                        object = object.b ? "v2" : "YES";
                        builder.appendQueryParameter("_HLS_skip", (String)object);
                    }
                    return builder.build();
                }
            }
            return this.o;
        }

        public f j() {
            return this.r;
        }

        public boolean k() {
            return this.y;
        }

        public boolean l() {
            int n8;
            f f8 = this.r;
            boolean bl = false;
            if (f8 == null) {
                return false;
            }
            long l8 = SystemClock.elapsedRealtime();
            long l9 = Math.max((long)30000L, (long)M.i1(this.r.u));
            f8 = this.r;
            if (f8.o || (n8 = f8.d) == 2 || n8 == 1 || this.s + l9 > l8) {
                bl = true;
            }
            return bl;
        }

        public final /* synthetic */ void m(Uri uri) {
            this.w = false;
            this.p(uri);
        }

        public void n(boolean bl) {
            Uri uri = bl ? this.i() : this.o;
            this.q(uri);
        }

        public final void p(Uri object) {
            p.a a8 = c.this.p.a(c.this.y, this.r);
            object = new p(this.q, (Uri)object, 4, a8);
            long l8 = this.p.n((n.e)object, this, c.this.q.d(object.c));
            c.this.u.y(new r(object.a, object.b, l8), object.c);
        }

        public final void q(Uri uri) {
            this.v = 0L;
            if (!this.w && !this.p.j()) {
                if (this.p.i()) {
                    return;
                }
                long l8 = SystemClock.elapsedRealtime();
                if (l8 < this.u) {
                    this.w = true;
                    c.this.w.postDelayed((Runnable)new d(this, uri), this.u - l8);
                    return;
                }
                this.p(uri);
            }
        }

        public void s() {
            this.p.a();
            IOException iOException = this.x;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        public void u(p p8, long l8, long l9, boolean bl) {
            r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
            c.this.q.a(p8.a);
            c.this.u.p(r8, 4);
        }

        public void v(p p8, long l8, long l9) {
            h h8 = (h)p8.e();
            r r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
            if (h8 instanceof f) {
                this.x((f)h8, r8);
                c.this.u.s(r8, 4);
            } else {
                this.x = A.c("Loaded playlist has unexpected type.", null);
                c.this.u.w(r8, 4, this.x, true);
            }
            c.this.q.a(p8.a);
        }

        public n.c w(p p8, long l8, long l9, IOException iOException, int n8) {
            r r8;
            block5 : {
                Object object;
                boolean bl;
                block4 : {
                    r8 = new r(p8.a, p8.b, p8.f(), p8.d(), l8, l9, p8.a());
                    int n9 = p8.f().getQueryParameter("_HLS_msn") != null ? 1 : 0;
                    bl = iOException instanceof i.a;
                    if (n9 == 0 && !bl) break block4;
                    n9 = iOException instanceof t ? ((t)iOException).r : Integer.MAX_VALUE;
                    if (bl || n9 == 400 || n9 == 503) break block5;
                }
                object = c.this.P(this.o, (m.c)(object = new m.c(r8, new u(p8.c), iOException, n8)), false) ? ((l8 = c.this.q.c((m.c)object)) != -9223372036854775807L ? n.h(false, l8) : n.g) : n.f;
                bl = true ^ object.c();
                c.this.u.w(r8, p8.c, iOException, bl);
                if (bl) {
                    c.this.q.a(p8.a);
                }
                return object;
            }
            this.u = SystemClock.elapsedRealtime();
            this.n(false);
            ((E.a)M.i(c.this.u)).w(r8, p8.c, iOException, true);
            return n.f;
        }

        public final void x(f object, r r8) {
            f f8;
            long l8;
            long l9;
            f f9 = this.r;
            this.s = l8 = SystemClock.elapsedRealtime();
            this.r = f8 = c.this.H(f9, (f)object);
            Object var17_6 = null;
            if (f8 != f9) {
                this.x = null;
                this.t = l8;
                c.this.T(this.o, f8);
            } else if (!f8.o) {
                boolean bl;
                l9 = object.k;
                long l10 = object.r.size();
                object = this.r;
                if (l9 + l10 < object.k) {
                    object = new k.c(this.o);
                    bl = true;
                } else {
                    boolean bl2;
                    double d8 = l8 - this.t;
                    double d9 = M.i1(object.m);
                    double d10 = c.this.t;
                    bl = bl2 = false;
                    object = var17_6;
                    if (d8 > d9 * d10) {
                        object = new k.d(this.o);
                        bl = bl2;
                    }
                }
                if (object != null) {
                    this.x = object;
                    c.this.P(this.o, new m.c(r8, new u(4), (IOException)object, 1), bl);
                }
            }
            object = this.r;
            if (!object.v.e) {
                l9 = object.m;
                if (object == f9) {
                    l9 /= 2L;
                }
            } else {
                l9 = 0L;
            }
            this.u = l8 + M.i1(l9) - r8.f;
            if (!this.r.o && (this.o.equals((Object)c.this.z) || this.y)) {
                this.q(this.i());
            }
        }

        public void y() {
            this.p.l();
        }

        public void z(boolean bl) {
            this.y = bl;
        }
    }

}

