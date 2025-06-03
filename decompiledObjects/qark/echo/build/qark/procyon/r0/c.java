// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import i0.t;
import d0.A;
import X2.B;
import g0.M;
import x0.u;
import java.io.IOException;
import x0.r;
import B0.p;
import java.util.Iterator;
import g0.a;
import android.os.SystemClock;
import android.net.Uri$Builder;
import java.util.List;
import android.net.Uri;
import android.os.Handler;
import x0.E;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import B0.m;
import q0.g;
import B0.n;

public final class c implements k, n.b
{
    public static final k.a D;
    public r0.f A;
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
    public r0.g y;
    public Uri z;
    
    static {
        D = new r0.b();
    }
    
    public c(final q0.g g, final m m, final j j) {
        this(g, m, j, 3.5);
    }
    
    public c(final q0.g o, final m q, final j p4, final double t) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.t = t;
        this.s = new CopyOnWriteArrayList();
        this.r = new HashMap();
        this.C = -9223372036854775807L;
    }
    
    public static /* synthetic */ r0.f A(final c c) {
        return c.A;
    }
    
    public static /* synthetic */ HashMap B(final c c) {
        return c.r;
    }
    
    public static /* synthetic */ q0.g C(final c c) {
        return c.o;
    }
    
    public static /* synthetic */ E.a D(final c c) {
        return c.u;
    }
    
    public static /* synthetic */ m E(final c c) {
        return c.q;
    }
    
    public static r0.f.d G(final r0.f f, final r0.f f2) {
        final int n = (int)(f2.k - f.k);
        final List r = f.r;
        if (n < r.size()) {
            return r.get(n);
        }
        return null;
    }
    
    public static /* synthetic */ Handler p(final c c) {
        return c.w;
    }
    
    public static /* synthetic */ r0.g q(final c c) {
        return c.y;
    }
    
    public static /* synthetic */ j s(final c c) {
        return c.p;
    }
    
    public static /* synthetic */ double w(final c c) {
        return c.t;
    }
    
    public static /* synthetic */ Uri x(final c c) {
        return c.z;
    }
    
    public static /* synthetic */ CopyOnWriteArrayList z(final c c) {
        return c.s;
    }
    
    public final void F(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Uri key = list.get(i);
            this.r.put(key, new c(key));
        }
    }
    
    public final r0.f H(final r0.f f, final r0.f f2) {
        if (!f2.f(f)) {
            r0.f d = f;
            if (f2.o) {
                d = f.d();
            }
            return d;
        }
        return f2.c(this.J(f, f2), this.I(f, f2));
    }
    
    public final int I(final r0.f f, final r0.f f2) {
        if (f2.i) {
            return f2.j;
        }
        final r0.f a = this.A;
        int j;
        if (a != null) {
            j = a.j;
        }
        else {
            j = 0;
        }
        if (f == null) {
            return j;
        }
        final r0.f.d g = G(f, f2);
        if (g != null) {
            return f.j + g.r - f2.r.get(0).r;
        }
        return j;
    }
    
    public final long J(final r0.f f, final r0.f f2) {
        if (f2.p) {
            return f2.h;
        }
        final r0.f a = this.A;
        long h;
        if (a != null) {
            h = a.h;
        }
        else {
            h = 0L;
        }
        if (f == null) {
            return h;
        }
        final int size = f.r.size();
        final r0.f.d g = G(f, f2);
        if (g != null) {
            return f.h + g.s;
        }
        if (size == f2.k - f.k) {
            return f.e();
        }
        return h;
    }
    
    public final Uri K(final Uri uri) {
        final r0.f a = this.A;
        Uri build = uri;
        if (a != null) {
            build = uri;
            if (a.v.e) {
                final r0.f.c c = a.t.get(uri);
                build = uri;
                if (c != null) {
                    final Uri$Builder buildUpon = uri.buildUpon();
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c.b));
                    final int c2 = c.c;
                    if (c2 != -1) {
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(c2));
                    }
                    build = buildUpon.build();
                }
            }
        }
        return build;
    }
    
    public final boolean L(final Uri uri) {
        final List e = this.y.e;
        for (int i = 0; i < e.size(); ++i) {
            if (uri.equals((Object)e.get(i).a)) {
                return true;
            }
        }
        return false;
    }
    
    public final void M(final Uri key) {
        final c c = this.r.get(key);
        final r0.f j = c.j();
        if (c.k()) {
            return;
        }
        c.z(true);
        if (j != null && !j.o) {
            c.n(true);
        }
    }
    
    public final boolean N() {
        final List e = this.y.e;
        final int size = e.size();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; ++i) {
            final c c = (c)a.e(this.r.get(e.get(i).a));
            if (elapsedRealtime > r0.c.c.d(c)) {
                final Uri e2 = r0.c.c.e(c);
                this.z = e2;
                c.q(this.K(e2));
                return true;
            }
        }
        return false;
    }
    
    public final void O(final Uri uri) {
        if (!uri.equals((Object)this.z) && this.L(uri)) {
            final r0.f a = this.A;
            if (a != null && a.o) {
                return;
            }
            this.z = uri;
            final c c = this.r.get(uri);
            final r0.f g = r0.c.c.g(c);
            if (g != null && g.o) {
                this.A = g;
                this.x.b(g);
                return;
            }
            c.q(this.K(uri));
        }
    }
    
    public final boolean P(final Uri uri, final m.c c, final boolean b) {
        final Iterator<k.b> iterator = this.s.iterator();
        boolean b2 = false;
        while (iterator.hasNext()) {
            b2 |= (iterator.next().e(uri, c, b) ^ true);
        }
        return b2;
    }
    
    public void Q(final p p4, final long n, final long n2, final boolean b) {
        final r r = new r(p4.a, p4.b, p4.f(), p4.d(), n, n2, p4.a());
        this.q.a(p4.a);
        this.u.p(r, 4);
    }
    
    public void R(final p p3, final long n, final long n2) {
        final r0.h h = (r0.h)p3.e();
        final boolean b = h instanceof r0.f;
        r0.g e;
        if (b) {
            e = r0.g.e(h.a);
        }
        else {
            e = (r0.g)h;
        }
        this.y = e;
        this.z = ((r0.g.b)e.e.get(0)).a;
        this.s.add(new b(null));
        this.F(e.d);
        final r r = new r(p3.a, p3.b, p3.f(), p3.d(), n, n2, p3.a());
        final c c = this.r.get(this.z);
        if (b) {
            c.x((r0.f)h, r);
        }
        else {
            c.n(false);
        }
        this.q.a(p3.a);
        this.u.s(r, 4);
    }
    
    public n.c S(final p p5, long c, final long n, final IOException ex, final int n2) {
        final r r = new r(p5.a, p5.b, p5.f(), p5.d(), c, n, p5.a());
        c = this.q.c(new m.c(r, new u(p5.c), ex, n2));
        final boolean b = c == -9223372036854775807L;
        this.u.w(r, p5.c, ex, b);
        if (b) {
            this.q.a(p5.a);
        }
        if (b) {
            return n.g;
        }
        return n.h(false, c);
    }
    
    public final void T(final Uri uri, final r0.f a) {
        if (uri.equals((Object)this.z)) {
            if (this.A == null) {
                this.B = (a.o ^ true);
                this.C = a.h;
            }
            this.A = a;
            this.x.b(a);
        }
        final Iterator<k.b> iterator = this.s.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    @Override
    public boolean a() {
        return this.B;
    }
    
    @Override
    public r0.g b() {
        return this.y;
    }
    
    @Override
    public boolean c(final Uri key, final long n) {
        final c c = this.r.get(key);
        return c != null && (c.h(n) ^ true);
    }
    
    @Override
    public boolean d(final Uri key) {
        return this.r.get(key).l();
    }
    
    @Override
    public void e(final Uri uri, final E.a u, final k.e x) {
        this.w = M.A();
        this.u = u;
        this.x = x;
        final p p3 = new p(this.o.a(4), uri, 4, this.p.b());
        a.f(this.v == null);
        final n v = new n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.v = v;
        u.y(new r(p3.a, p3.b, v.n((n.e)p3, (n.b)this, this.q.d(p3.c))), p3.c);
    }
    
    @Override
    public void f() {
        final n v = this.v;
        if (v != null) {
            v.a();
        }
        final Uri z = this.z;
        if (z != null) {
            this.h(z);
        }
    }
    
    @Override
    public void g(final Uri key) {
        final c c = this.r.get(key);
        if (c != null) {
            c.z(false);
        }
    }
    
    @Override
    public void h(final Uri key) {
        this.r.get(key).s();
    }
    
    @Override
    public void i(final Uri key) {
        this.r.get(key).n(true);
    }
    
    @Override
    public void j(final k.b e) {
        a.e(e);
        this.s.add(e);
    }
    
    @Override
    public r0.f k(final Uri key, final boolean b) {
        final r0.f j = this.r.get(key).j();
        if (j != null && b) {
            this.O(key);
            this.M(key);
        }
        return j;
    }
    
    @Override
    public void l(final k.b o) {
        this.s.remove(o);
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
        final Iterator<c> iterator = this.r.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().y();
        }
        this.w.removeCallbacksAndMessages((Object)null);
        this.w = null;
        this.r.clear();
    }
    
    public class b implements k.b
    {
        @Override
        public void a() {
            c.z(c.this).remove(this);
        }
        
        @Override
        public boolean e(final Uri key, final m.c c, final boolean b) {
            if (c.A(c.this) == null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final List e = ((r0.g)M.i(c.q(c.this))).e;
                int n;
                int n2;
                for (int i = n = 0; i < e.size(); ++i, n = n2) {
                    final c c2 = c.B(c.this).get(e.get(i).a);
                    n2 = n;
                    if (c2 != null) {
                        n2 = n;
                        if (elapsedRealtime < c.d(c2)) {
                            n2 = n + 1;
                        }
                    }
                }
                final m.b b2 = c.E(c.this).b(new m.a(1, 0, c.q(c.this).e.size(), n), c);
                if (b2 != null && b2.a == 2) {
                    final c c3 = c.B(c.this).get(key);
                    if (c3 != null) {
                        c3.h(b2.b);
                    }
                }
            }
            return false;
        }
    }
    
    public final class c implements n.b
    {
        public final Uri o;
        public final n p;
        public final i0.g q;
        public r0.f r;
        public long s;
        public long t;
        public long u;
        public long v;
        public boolean w;
        public IOException x;
        public boolean y;
        
        public c(final Uri o) {
            this.o = o;
            this.p = new n("DefaultHlsPlaylistTracker:MediaPlaylist");
            this.q = r0.c.C(r0.c.this).a(4);
        }
        
        public static /* synthetic */ long d(final c c) {
            return c.v;
        }
        
        public static /* synthetic */ Uri e(final c c) {
            return c.o;
        }
        
        public static /* synthetic */ r0.f g(final c c) {
            return c.r;
        }
        
        public final boolean h(final long n) {
            this.v = SystemClock.elapsedRealtime() + n;
            return this.o.equals((Object)r0.c.x(r0.c.this)) && !r0.c.this.N();
        }
        
        public final Uri i() {
            final r0.f r = this.r;
            if (r != null) {
                final r0.f.f v = r.v;
                if (v.a != -9223372036854775807L || v.e) {
                    final Uri$Builder buildUpon = this.o.buildUpon();
                    final r0.f r2 = this.r;
                    if (r2.v.e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(r2.k + r2.r.size()));
                        final r0.f r3 = this.r;
                        if (r3.n != -9223372036854775807L) {
                            final List s = r3.s;
                            int size;
                            final int n = size = s.size();
                            if (!s.isEmpty()) {
                                size = n;
                                if (((r0.f.b)X2.B.d(s)).A) {
                                    size = n - 1;
                                }
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    final r0.f.f v2 = this.r.v;
                    if (v2.a != -9223372036854775807L) {
                        String s2;
                        if (v2.b) {
                            s2 = "v2";
                        }
                        else {
                            s2 = "YES";
                        }
                        buildUpon.appendQueryParameter("_HLS_skip", s2);
                    }
                    return buildUpon.build();
                }
            }
            return this.o;
        }
        
        public r0.f j() {
            return this.r;
        }
        
        public boolean k() {
            return this.y;
        }
        
        public boolean l() {
            final r0.f r = this.r;
            boolean b = false;
            if (r == null) {
                return false;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long max = Math.max(30000L, M.i1(this.r.u));
            final r0.f r2 = this.r;
            if (!r2.o) {
                final int d = r2.d;
                if (d != 2 && d != 1 && this.s + max <= elapsedRealtime) {
                    return b;
                }
            }
            b = true;
            return b;
        }
        
        public void n(final boolean b) {
            Uri uri;
            if (b) {
                uri = this.i();
            }
            else {
                uri = this.o;
            }
            this.q(uri);
        }
        
        public final void p(final Uri uri) {
            final p p = new p(this.q, uri, 4, r0.c.s(r0.c.this).a(r0.c.q(r0.c.this), this.r));
            r0.c.D(r0.c.this).y(new r(p.a, p.b, this.p.n((n.e)p, (n.b)this, r0.c.E(r0.c.this).d(p.c))), p.c);
        }
        
        public final void q(final Uri uri) {
            this.v = 0L;
            if (!this.w && !this.p.j()) {
                if (this.p.i()) {
                    return;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.u) {
                    this.w = true;
                    r0.c.p(r0.c.this).postDelayed((Runnable)new d(this, uri), this.u - elapsedRealtime);
                    return;
                }
                this.p(uri);
            }
        }
        
        public void s() {
            this.p.a();
            final IOException x = this.x;
            if (x == null) {
                return;
            }
            throw x;
        }
        
        public void u(final p p4, final long n, final long n2, final boolean b) {
            final r r = new r(p4.a, p4.b, p4.f(), p4.d(), n, n2, p4.a());
            r0.c.E(r0.c.this).a(p4.a);
            r0.c.D(r0.c.this).p(r, 4);
        }
        
        public void v(final p p3, final long n, final long n2) {
            final r0.h h = (r0.h)p3.e();
            final r r = new r(p3.a, p3.b, p3.f(), p3.d(), n, n2, p3.a());
            if (h instanceof r0.f) {
                this.x((r0.f)h, r);
                r0.c.D(r0.c.this).s(r, 4);
            }
            else {
                this.x = d0.A.c("Loaded playlist has unexpected type.", null);
                r0.c.D(r0.c.this).w(r, 4, this.x, true);
            }
            r0.c.E(r0.c.this).a(p3.a);
        }
        
        public n.c w(final p p5, long c, final long n, final IOException ex, final int n2) {
            final r r = new r(p5.a, p5.b, p5.f(), p5.d(), c, n, p5.a());
            final boolean b = p5.f().getQueryParameter("_HLS_msn") != null;
            final boolean b2 = ex instanceof i.a;
            if (b || b2) {
                int r2;
                if (ex instanceof t) {
                    r2 = ((t)ex).r;
                }
                else {
                    r2 = Integer.MAX_VALUE;
                }
                if (b2 || r2 == 400 || r2 == 503) {
                    this.u = SystemClock.elapsedRealtime();
                    this.n(false);
                    ((E.a)M.i(c.D(c.this))).w(r, p5.c, ex, true);
                    return n.f;
                }
            }
            final m.c c2 = new m.c(r, new u(p5.c), ex, n2);
            n.c c3;
            if (c.this.P(this.o, c2, false)) {
                c = c.E(c.this).c(c2);
                if (c != -9223372036854775807L) {
                    c3 = n.h(false, c);
                }
                else {
                    c3 = n.g;
                }
            }
            else {
                c3 = n.f;
            }
            final boolean b3 = true ^ c3.c();
            c.D(c.this).w(r, p5.c, ex, b3);
            if (b3) {
                c.E(c.this).a(p5.a);
            }
            return c3;
        }
        
        public final void x(r0.f f, final r r) {
            final r0.f r2 = this.r;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.s = elapsedRealtime;
            final r0.f u = r0.c.this.H(r2, f);
            this.r = u;
            final k.c c = null;
            if (u != r2) {
                this.x = null;
                this.t = elapsedRealtime;
                r0.c.this.T(this.o, u);
            }
            else if (!u.o) {
                final long k = f.k;
                final long n = f.r.size();
                f = this.r;
                IOException x;
                boolean b;
                if (k + n < f.k) {
                    x = new k.c(this.o);
                    b = true;
                }
                else {
                    final double n2 = (double)(elapsedRealtime - this.t);
                    final double n3 = (double)M.i1(f.m);
                    final double w = r0.c.w(r0.c.this);
                    b = false;
                    x = c;
                    if (n2 > n3 * w) {
                        x = new k.d(this.o);
                        b = b;
                    }
                }
                if (x != null) {
                    this.x = x;
                    r0.c.this.P(this.o, new m.c(r, new u(4), x, 1), b);
                }
            }
            f = this.r;
            long m;
            if (!f.v.e) {
                m = f.m;
                if (f == r2) {
                    m /= 2L;
                }
            }
            else {
                m = 0L;
            }
            this.u = elapsedRealtime + M.i1(m) - r.f;
            if (!this.r.o && (this.o.equals((Object)r0.c.x(r0.c.this)) || this.y)) {
                this.q(this.i());
            }
        }
        
        public void y() {
            this.p.l();
        }
        
        public void z(final boolean y) {
            this.y = y;
        }
    }
}
