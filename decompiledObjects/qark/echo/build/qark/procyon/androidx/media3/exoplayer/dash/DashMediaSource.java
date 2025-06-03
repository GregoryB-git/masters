// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media3.exoplayer.dash;

import java.util.regex.Matcher;
import java.text.ParseException;
import android.text.TextUtils;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.regex.Pattern;
import B0.k;
import android.os.Looper;
import o0.l;
import d0.A;
import d0.I;
import android.os.SystemClock;
import x0.r;
import java.math.RoundingMode;
import java.util.List;
import g0.M;
import n0.e;
import B0.f;
import d0.v;
import B0.o;
import android.util.SparseArray;
import B0.p;
import x0.E;
import n0.b;
import B0.m;
import p0.x;
import x0.j;
import i0.g;
import o0.c;
import android.net.Uri;
import d0.u;
import android.os.Handler;
import java.io.IOException;
import i0.y;
import B0.n;
import x0.a;

public final class DashMediaSource extends a
{
    public n A;
    public y B;
    public IOException C;
    public Handler D;
    public u.g E;
    public Uri F;
    public Uri G;
    public o0.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public u P;
    public final boolean h;
    public final i0.g.a i;
    public final androidx.media3.exoplayer.dash.a.a j;
    public final j k;
    public final p0.x l;
    public final m m;
    public final n0.b n;
    public final long o;
    public final long p;
    public final E.a q;
    public final p.a r;
    public final e s;
    public final Object t;
    public final SparseArray u;
    public final Runnable v;
    public final Runnable w;
    public final androidx.media3.exoplayer.dash.d.b x;
    public final o y;
    public i0.g z;
    
    static {
        v.a("media3.exoplayer.dash");
    }
    
    public DashMediaSource(final u p11, final o0.c h, final i0.g.a i, final p.a r, final androidx.media3.exoplayer.dash.a.a j, final j k, final B0.f f, final p0.x l, final m m, final long o, final long p12) {
        this.P = p11;
        this.E = p11.d;
        this.F = ((u.h)g0.a.e(p11.b)).a;
        this.G = p11.b.a;
        this.H = h;
        this.i = i;
        this.r = r;
        this.j = j;
        this.l = l;
        this.m = m;
        this.o = o;
        this.p = p12;
        this.k = k;
        this.n = new n0.b();
        final boolean h2 = h != null;
        this.h = h2;
        this.q = this.u(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new c(null);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (h2) {
            g0.a.f(true ^ h.d);
            this.s = null;
            this.v = null;
            this.w = null;
            this.y = new o.a();
            return;
        }
        this.s = new e(null);
        this.y = new f();
        this.v = new n0.e(this);
        this.w = new n0.f(this);
    }
    
    public static /* synthetic */ n G(final DashMediaSource dashMediaSource) {
        return dashMediaSource.A;
    }
    
    public static /* synthetic */ IOException H(final DashMediaSource dashMediaSource) {
        return dashMediaSource.C;
    }
    
    public static long I(final o0.g g, final long n, final long n2) {
        final long j0 = M.J0(g.b);
        final boolean m = M(g);
        long a = Long.MAX_VALUE;
        long min;
        for (int i = 0; i < g.c.size(); ++i, a = min) {
            final o0.a a2 = g.c.get(i);
            final List c = a2.c;
            final int b = a2.b;
            boolean b2 = true;
            if (b == 1 || b == 2) {
                b2 = false;
            }
            if (m) {
                min = a;
                if (b2) {
                    continue;
                }
            }
            if (c.isEmpty()) {
                min = a;
            }
            else {
                final n0.g l = c.get(0).l();
                if (l == null) {
                    return j0 + n;
                }
                final long k = l.j(n, n2);
                if (k == 0L) {
                    return j0;
                }
                final long n3 = l.d(n, n2) + k - 1L;
                min = Math.min(a, l.b(n3, n) + (l.c(n3) + j0));
            }
        }
        return a;
    }
    
    public static long J(final o0.g g, final long n, final long n2) {
        final long j0 = M.J0(g.b);
        final boolean m = M(g);
        long a = j0;
        long max;
        for (int i = 0; i < g.c.size(); ++i, a = max) {
            final o0.a a2 = g.c.get(i);
            final List c = a2.c;
            final int b = a2.b;
            boolean b2 = true;
            if (b == 1 || b == 2) {
                b2 = false;
            }
            if (m) {
                max = a;
                if (b2) {
                    continue;
                }
            }
            if (c.isEmpty()) {
                max = a;
            }
            else {
                final n0.g l = c.get(0).l();
                if (l == null) {
                    return j0;
                }
                if (l.j(n, n2) == 0L) {
                    return j0;
                }
                max = Math.max(a, l.c(l.d(n, n2)) + j0);
            }
        }
        return a;
    }
    
    public static long K(final o0.c c, long j0) {
        final int n = c.e() - 1;
        final o0.g d = c.d(n);
        final long j2 = M.J0(d.b);
        final long g = c.g(n);
        final long j3 = M.J0(j0);
        final long j4 = M.J0(c.a);
        j0 = M.J0(5000L);
        long n2;
        for (int i = 0; i < d.c.size(); ++i, j0 = n2) {
            final List c2 = d.c.get(i).c;
            if (c2.isEmpty()) {
                n2 = j0;
            }
            else {
                final n0.g l = c2.get(0).l();
                n2 = j0;
                if (l != null) {
                    final long n3 = j4 + j2 + l.e(g, j3) - j3;
                    if (n3 >= j0 - 100000L) {
                        n2 = j0;
                        if (n3 <= j0) {
                            continue;
                        }
                        n2 = j0;
                        if (n3 >= j0 + 100000L) {
                            continue;
                        }
                    }
                    n2 = n3;
                }
            }
        }
        return Z2.e.b(j0, 1000L, RoundingMode.CEILING);
    }
    
    public static boolean M(final o0.g g) {
        for (int i = 0; i < g.c.size(); ++i) {
            final int b = g.c.get(i).b;
            if (b == 1) {
                return true;
            }
            if (b == 2) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean N(final o0.g g) {
        for (int i = 0; i < g.c.size(); ++i) {
            final n0.g l = g.c.get(i).c.get(0).l();
            if (l == null || l.g()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void B() {
        this.I = false;
        this.z = null;
        final n a = this.A;
        if (a != null) {
            a.l();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        final Handler d = this.D;
        if (d != null) {
            d.removeCallbacksAndMessages((Object)null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.u.clear();
        this.n.i();
        this.l.release();
    }
    
    public final long L() {
        return Math.min((this.M - 1) * 1000, 5000);
    }
    
    public final void P() {
        C0.a.j(this.A, (C0.a.b)new C0.a.b() {
            @Override
            public void a() {
                DashMediaSource.this.Y(C0.a.h());
            }
            
            @Override
            public void b(final IOException ex) {
                DashMediaSource.this.X(ex);
            }
        });
    }
    
    public void Q(final long n) {
        final long n2 = this.N;
        if (n2 == -9223372036854775807L || n2 < n) {
            this.N = n;
        }
    }
    
    public void R() {
        this.D.removeCallbacks(this.w);
        this.f0();
    }
    
    public void S(final p p3, final long n, final long n2) {
        final r r = new r(p3.a, p3.b, p3.f(), p3.d(), n, n2, p3.a());
        this.m.a(p3.a);
        this.q.p(r, p3.c);
    }
    
    public void T(final p p3, final long k, final long n) {
        final r r = new r(p3.a, p3.b, p3.f(), p3.d(), k, n, p3.a());
        this.m.a(p3.a);
        this.q.s(r, p3.c);
        final o0.c h = (o0.c)p3.e();
        final o0.c h2 = this.H;
        int e;
        if (h2 == null) {
            e = 0;
        }
        else {
            e = h2.e();
        }
        long b;
        int n2;
        for (b = h.d(0).b, n2 = 0; n2 < e && this.H.d(n2).b < b; ++n2) {}
        Label_0319: {
            if (h.d) {
                if (e - n2 > h.e()) {
                    g0.o.h("DashMediaSource", "Loaded out of sync manifest");
                }
                else {
                    final long n3 = this.N;
                    if (n3 == -9223372036854775807L || h.h * 1000L > n3) {
                        this.M = 0;
                        break Label_0319;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Loaded stale dynamic manifest: ");
                    sb.append(h.h);
                    sb.append(", ");
                    sb.append(this.N);
                    g0.o.h("DashMediaSource", sb.toString());
                }
                if (this.M++ < this.m.d(p3.c)) {
                    this.d0(this.L());
                    return;
                }
                this.C = new n0.c();
                return;
            }
        }
        this.H = h;
        this.I &= h.d;
        this.J = k - n;
        this.K = k;
        this.O += n2;
        final Object t = this.t;
        // monitorenter(t)
        while (true) {
            try {
                if (p3.b.a == this.F) {
                    final Uri i = this.H.k;
                    Uri f;
                    if (i != null) {
                        f = i;
                    }
                    else {
                        f = p3.f();
                    }
                    this.F = f;
                }
                // monitorexit(t)
                final o0.c h3 = this.H;
                if (!h3.d || this.L != -9223372036854775807L) {
                    this.Z(true);
                    return;
                }
                final o0.o j = h3.i;
                if (j != null) {
                    this.a0(j);
                    return;
                }
                this.P();
                return;
                // monitorexit(t)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public n.c U(final p p5, long c, final long n, final IOException ex, final int n2) {
        final r r = new r(p5.a, p5.b, p5.f(), p5.d(), c, n, p5.a());
        c = this.m.c(new m.c(r, new x0.u(p5.c), ex, n2));
        n.c c2;
        if (c == -9223372036854775807L) {
            c2 = n.g;
        }
        else {
            c2 = n.h(false, c);
        }
        final boolean b = c2.c() ^ true;
        this.q.w(r, p5.c, ex, b);
        if (b) {
            this.m.a(p5.a);
        }
        return c2;
    }
    
    public void V(final p p3, final long n, final long n2) {
        final r r = new r(p3.a, p3.b, p3.f(), p3.d(), n, n2, p3.a());
        this.m.a(p3.a);
        this.q.s(r, p3.c);
        this.Y((long)p3.e() - n);
    }
    
    public n.c W(final p p4, final long n, final long n2, final IOException ex) {
        this.q.w(new r(p4.a, p4.b, p4.f(), p4.d(), n, n2, p4.a()), p4.c, ex, true);
        this.m.a(p4.a);
        this.X(ex);
        return n.f;
    }
    
    public final void X(final IOException ex) {
        g0.o.d("DashMediaSource", "Failed to resolve time offset.", ex);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        this.Z(true);
    }
    
    public final void Y(final long l) {
        this.L = l;
        this.Z(true);
    }
    
    public final void Z(final boolean b) {
        for (int i = 0; i < this.u.size(); ++i) {
            final int key = this.u.keyAt(i);
            if (key >= this.O) {
                ((androidx.media3.exoplayer.dash.b)this.u.valueAt(i)).P(this.H, key - this.O);
            }
        }
        final o0.g d = this.H.d(0);
        final int n = this.H.e() - 1;
        final o0.g d2 = this.H.d(n);
        final long g = this.H.g(n);
        final long j0 = g0.M.J0(g0.M.d0(this.L));
        final long k = J(d, this.H.g(0), j0);
        final long l = I(d2, g, j0);
        final boolean b2 = this.H.d && !N(d2);
        long max = k;
        if (b2) {
            final long f = this.H.f;
            max = k;
            if (f != -9223372036854775807L) {
                max = Math.max(k, l - g0.M.J0(f));
            }
        }
        final long n2 = l - max;
        final o0.c h = this.H;
        long n4;
        long n5;
        if (h.d) {
            g0.a.f(h.a != -9223372036854775807L);
            final long n3 = j0 - g0.M.J0(this.H.a) - max;
            this.g0(n3, n2);
            final long a = this.H.a;
            final long i2 = g0.M.i1(max);
            n4 = n3 - g0.M.J0(this.E.a);
            final long min = Math.min(this.p, n2 / 2L);
            n5 = a + i2;
            if (n4 < min) {
                n4 = min;
            }
        }
        else {
            n5 = -9223372036854775807L;
            n4 = 0L;
        }
        final long j2 = g0.M.J0(d.b);
        final o0.c h2 = this.H;
        final long a2 = h2.a;
        final long m = this.L;
        final int o = this.O;
        final u a3 = this.a();
        u.g e;
        if (this.H.d) {
            e = this.E;
        }
        else {
            e = null;
        }
        this.A(new b(a2, n5, m, o, max - j2, n2, n4, h2, a3, e));
        if (!this.h) {
            this.D.removeCallbacks(this.w);
            if (b2) {
                this.D.postDelayed(this.w, K(this.H, g0.M.d0(this.L)));
            }
            if (this.I) {
                this.f0();
                return;
            }
            if (b) {
                final o0.c h3 = this.H;
                if (h3.d) {
                    final long e2 = h3.e;
                    if (e2 != -9223372036854775807L) {
                        long n6 = e2;
                        if (e2 == 0L) {
                            n6 = 5000L;
                        }
                        this.d0(Math.max(0L, this.J + n6 - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }
    
    @Override
    public u a() {
        synchronized (this) {
            return this.P;
        }
    }
    
    public final void a0(final o0.o o) {
        final String a = o.a;
        if (!g0.M.c(a, "urn:mpeg:dash:utc:direct:2014") && !g0.M.c(a, "urn:mpeg:dash:utc:direct:2012")) {
            p.a a2;
            if (!g0.M.c(a, "urn:mpeg:dash:utc:http-iso:2014") && !g0.M.c(a, "urn:mpeg:dash:utc:http-iso:2012")) {
                if (!g0.M.c(a, "urn:mpeg:dash:utc:http-xsdate:2014") && !g0.M.c(a, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                    if (!g0.M.c(a, "urn:mpeg:dash:utc:ntp:2014") && !g0.M.c(a, "urn:mpeg:dash:utc:ntp:2012")) {
                        this.X(new IOException("Unsupported UTC timing scheme"));
                        return;
                    }
                    this.P();
                    return;
                }
                else {
                    a2 = new h(null);
                }
            }
            else {
                a2 = new d();
            }
            this.c0(o, a2);
            return;
        }
        this.b0(o);
    }
    
    public final void b0(final o0.o o) {
        try {
            this.Y(g0.M.Q0(o.b) - this.K);
        }
        catch (A a) {
            this.X(a);
        }
    }
    
    public final void c0(final o0.o o, final p.a a) {
        this.e0(new p(this.z, Uri.parse(o.b), 5, a), new g(null), 1);
    }
    
    public final void d0(final long n) {
        this.D.postDelayed(this.v, n);
    }
    
    @Override
    public void e(final x0.v v) {
        final androidx.media3.exoplayer.dash.b b = (androidx.media3.exoplayer.dash.b)v;
        b.L();
        this.u.remove(b.o);
    }
    
    public final void e0(final p p3, final n.b b, final int n) {
        this.q.y(new r(p3.a, p3.b, this.A.n((n.e)p3, b, n)), p3.c);
    }
    
    @Override
    public x0.v f(final x.b b, final B0.b b2, final long n) {
        final int n2 = (int)b.a - this.O;
        final androidx.media3.exoplayer.dash.b b3 = new androidx.media3.exoplayer.dash.b(n2 + this.O, this.H, this.n, n2, this.j, this.B, null, this.l, this.s(b), this.m, this.u(b), this.L, this.y, b2, this.k, this.x, this.x());
        this.u.put(b3.o, (Object)b3);
        return b3;
    }
    
    public final void f0() {
        this.D.removeCallbacks(this.v);
        if (this.A.i()) {
            return;
        }
        if (this.A.j()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            final Uri f = this.F;
            // monitorexit(this.t)
            this.I = false;
            this.e0(new p(this.z, f, 4, this.r), this.s, this.m.d(4));
        }
    }
    
    public final void g0(final long n, final long n2) {
        final u.g d = this.a().d;
        final long i1 = g0.M.i1(n);
        long b = d.c;
        long min = 0L;
        Label_0080: {
            Label_0031: {
                if (b == -9223372036854775807L) {
                    final l j = this.H.j;
                    if (j != null) {
                        b = j.c;
                        if (b != -9223372036854775807L) {
                            break Label_0031;
                        }
                    }
                    min = i1;
                    break Label_0080;
                }
            }
            min = Math.min(i1, b);
        }
        long i2;
        final long n3 = i2 = g0.M.i1(n - n2);
        if (n3 < 0L) {
            i2 = n3;
            if (min > 0L) {
                i2 = 0L;
            }
        }
        final long c = this.H.c;
        long min2 = i2;
        if (c != -9223372036854775807L) {
            min2 = Math.min(i2 + c, i1);
        }
        long b2 = d.b;
        long q = 0L;
        Label_0222: {
            if (b2 == -9223372036854775807L) {
                final l k = this.H.j;
                q = min2;
                if (k == null) {
                    break Label_0222;
                }
                final long b3 = k.b;
                q = min2;
                if (b3 == -9223372036854775807L) {
                    break Label_0222;
                }
                b2 = b3;
            }
            q = g0.M.q(b2, min2, i1);
        }
        long n4 = min;
        if (q > min) {
            n4 = q;
        }
        long n5 = this.E.a;
        Label_0321: {
            if (n5 == -9223372036854775807L) {
                final o0.c h = this.H;
                final l l = h.j;
                if (l != null) {
                    n5 = l.a;
                    if (n5 != -9223372036854775807L) {
                        break Label_0321;
                    }
                }
                n5 = h.g;
                if (n5 == -9223372036854775807L) {
                    n5 = this.o;
                }
            }
        }
        long n6 = n5;
        if (n5 < q) {
            n6 = q;
        }
        long q2 = n6;
        if (n6 > n4) {
            q2 = g0.M.q(g0.M.i1(n - Math.min(this.p, n2 / 2L)), q, n4);
        }
        float n7 = d.d;
        if (n7 == -3.4028235E38f) {
            final l m = this.H.j;
            if (m != null) {
                n7 = m.d;
            }
            else {
                n7 = -3.4028235E38f;
            }
        }
        float n8 = d.e;
        if (n8 == -3.4028235E38f) {
            final l j2 = this.H.j;
            if (j2 != null) {
                n8 = j2.e;
            }
            else {
                n8 = -3.4028235E38f;
            }
        }
        float n9 = n8;
        float n10 = n7;
        Label_0545: {
            if (n7 == -3.4028235E38f) {
                n9 = n8;
                n10 = n7;
                if (n8 == -3.4028235E38f) {
                    final l j3 = this.H.j;
                    if (j3 != null) {
                        n9 = n8;
                        n10 = n7;
                        if (j3.a != -9223372036854775807L) {
                            break Label_0545;
                        }
                    }
                    n10 = 1.0f;
                    n9 = 1.0f;
                }
            }
        }
        this.E = new u.g.a().k(q2).i(q).g(n4).j(n10).h(n9).f();
    }
    
    @Override
    public void h() {
        this.y.a();
    }
    
    @Override
    public void l(final u p) {
        synchronized (this) {
            this.P = p;
        }
    }
    
    @Override
    public void z(final y b) {
        this.B = b;
        this.l.a(Looper.myLooper(), this.x());
        this.l.g();
        if (this.h) {
            this.Z(false);
            return;
        }
        this.z = this.i.a();
        this.A = new n("DashMediaSource");
        this.D = g0.M.A();
        this.f0();
    }
    
    public static final class Factory implements x.a
    {
        public final a.a a;
        public final i0.g.a b;
        public p0.A c;
        public j d;
        public m e;
        public long f;
        public long g;
        public p.a h;
        
        public Factory(final a.a a, final i0.g.a b) {
            this.a = (a.a)g0.a.e(a);
            this.b = b;
            this.c = new p0.l();
            this.e = new k();
            this.f = 30000L;
            this.g = 5000000L;
            this.d = new x0.m();
            this.b(true);
        }
        
        public Factory(final i0.g.a a) {
            this(new c.a(a), a);
        }
        
        public DashMediaSource a(final u p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        d0/u.b:Ld0/u$h;
            //     4: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
            //     7: pop            
            //     8: aload_0        
            //     9: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.h:LB0/p$a;
            //    12: astore_3       
            //    13: aload_3        
            //    14: astore_2       
            //    15: aload_3        
            //    16: ifnonnull       27
            //    19: new             Lo0/d;
            //    22: dup            
            //    23: invokespecial   o0/d.<init>:()V
            //    26: astore_2       
            //    27: aload_1        
            //    28: getfield        d0/u.b:Ld0/u$h;
            //    31: getfield        d0/u$h.d:Ljava/util/List;
            //    34: astore_3       
            //    35: aload_3        
            //    36: invokeinterface java/util/List.isEmpty:()Z
            //    41: ifne            57
            //    44: new             Lv0/b;
            //    47: dup            
            //    48: aload_2        
            //    49: aload_3        
            //    50: invokespecial   v0/b.<init>:(LB0/p$a;Ljava/util/List;)V
            //    53: astore_2       
            //    54: goto            57
            //    57: new             Landroidx/media3/exoplayer/dash/DashMediaSource;
            //    60: dup            
            //    61: aload_1        
            //    62: aconst_null    
            //    63: aload_0        
            //    64: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.b:Li0/g$a;
            //    67: aload_2        
            //    68: aload_0        
            //    69: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.a:Landroidx/media3/exoplayer/dash/a$a;
            //    72: aload_0        
            //    73: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.d:Lx0/j;
            //    76: aconst_null    
            //    77: aload_0        
            //    78: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.c:Lp0/A;
            //    81: aload_1        
            //    82: invokeinterface p0/A.a:(Ld0/u;)Lp0/x;
            //    87: aload_0        
            //    88: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.e:LB0/m;
            //    91: aload_0        
            //    92: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.f:J
            //    95: aload_0        
            //    96: getfield        androidx/media3/exoplayer/dash/DashMediaSource$Factory.g:J
            //    99: aconst_null    
            //   100: invokespecial   androidx/media3/exoplayer/dash/DashMediaSource.<init>:(Ld0/u;Lo0/c;Li0/g$a;LB0/p$a;Landroidx/media3/exoplayer/dash/a$a;Lx0/j;LB0/f;Lp0/x;LB0/m;JJLandroidx/media3/exoplayer/dash/DashMediaSource$a;)V
            //   103: areturn        
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Invalid BootstrapMethods attribute entry: 2 additional arguments required for method java/lang/invoke/StringConcatFactory.makeConcatWithConstants, but only 1 specified.
            //     at com.strobel.assembler.ir.Error.invalidBootstrapMethodEntry(Error.java:244)
            //     at com.strobel.assembler.ir.MetadataReader.readAttributeCore(MetadataReader.java:267)
            //     at com.strobel.assembler.metadata.ClassFileReader.readAttributeCore(ClassFileReader.java:261)
            //     at com.strobel.assembler.ir.MetadataReader.inflateAttributes(MetadataReader.java:426)
            //     at com.strobel.assembler.metadata.ClassFileReader.visitAttributes(ClassFileReader.java:1134)
            //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:439)
            //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:377)
            //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
            //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:476)
            //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
            //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
            //     at com.strobel.assembler.metadata.MetadataHelper.isRawType(MetadataHelper.java:1581)
            //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2362)
            //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2323)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
            //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2337)
            //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
            //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
            //     at java.base/java.util.AbstractCollection.contains(AbstractCollection.java:108)
            //     at com.strobel.assembler.metadata.ClassFileReader.defineMethods(ClassFileReader.java:994)
            //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:441)
            //     at com.strobel.assembler.metadata.ClassFileReader.readClass(ClassFileReader.java:377)
            //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:129)
            //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:476)
            //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
            //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
            //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2115)
            //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2076)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:21)
            //     at com.strobel.assembler.metadata.MetadataHelper.getSuperType(MetadataHelper.java:1264)
            //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2012)
            //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:1995)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:727)
            //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2018)
            //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:1995)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:727)
            //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1853)
            //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1815)
            //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
            //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
            //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
            //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:568)
            //     at com.strobel.assembler.metadata.MetadataHelper.isSubtypeUncheckedInternal(MetadataHelper.java:540)
            //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeUnchecked(MetadataHelper.java:520)
            //     at com.strobel.assembler.metadata.MetadataHelper.isConvertible(MetadataHelper.java:507)
            //     at com.strobel.assembler.metadata.MetadataHelper.isConvertible(MetadataHelper.java:488)
            //     at com.strobel.assembler.metadata.MetadataHelper.isAssignableFrom(MetadataHelper.java:557)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperTypeCore(MetadataHelper.java:248)
            //     at com.strobel.assembler.metadata.MetadataHelper.findCommonSuperType(MetadataHelper.java:200)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:369)
            //     at com.strobel.assembler.ir.Frame.merge(Frame.java:254)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2206)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public Factory b(final boolean b) {
            this.a.a(b);
            return this;
        }
    }
    
    public static final class b extends I
    {
        public final long e;
        public final long f;
        public final long g;
        public final int h;
        public final long i;
        public final long j;
        public final long k;
        public final c l;
        public final u m;
        public final u.g n;
        
        public b(final long e, final long f, final long g, final int h, final long i, final long j, final long k, final c l, final u m, final u.g n) {
            final boolean d = l.d;
            final boolean b = true;
            g0.a.f(d == (n != null) && b);
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
        }
        
        public static boolean t(final c c) {
            return c.d && c.e != -9223372036854775807L && c.b == -9223372036854775807L;
        }
        
        @Override
        public int b(final Object o) {
            final boolean b = o instanceof Integer;
            int n = -1;
            if (!b) {
                return -1;
            }
            final int n2 = (int)o - this.h;
            if (n2 >= 0) {
                if (n2 >= this.i()) {
                    return -1;
                }
                n = n2;
            }
            return n;
        }
        
        @Override
        public I.b g(final int n, final I.b b, final boolean b2) {
            g0.a.c(n, 0, this.i());
            Object value = null;
            String a;
            if (b2) {
                a = this.l.d(n).a;
            }
            else {
                a = null;
            }
            if (b2) {
                value = this.h + n;
            }
            return b.s(a, value, 0, this.l.g(n), g0.M.J0(this.l.d(n).b - this.l.d(0).b) - this.i);
        }
        
        @Override
        public int i() {
            return this.l.e();
        }
        
        @Override
        public Object m(final int n) {
            g0.a.c(n, 0, this.i());
            return this.h + n;
        }
        
        @Override
        public I.c o(final int n, final I.c c, long s) {
            g0.a.c(n, 0, 1);
            s = this.s(s);
            final Object q = c.q;
            final u m = this.m;
            final c l = this.l;
            return c.g(q, m, l, this.e, this.f, this.g, true, t(l), this.n, s, this.j, 0, this.i() - 1, this.i);
        }
        
        @Override
        public int p() {
            return 1;
        }
        
        public final long s(long n) {
            final long k = this.k;
            if (!t(this.l)) {
                return k;
            }
            long n2 = k;
            if (n > 0L) {
                n = (n2 = k + n);
                if (n > this.j) {
                    return -9223372036854775807L;
                }
            }
            long n3;
            int n4;
            for (n3 = this.i + n2, n = this.l.g(0), n4 = 0; n4 < this.l.e() - 1 && n3 >= n; n3 -= n, ++n4, n = this.l.g(n4)) {}
            final o0.g d = this.l.d(n4);
            final int a = d.a(2);
            if (a == -1) {
                return n2;
            }
            final n0.g l = d.c.get(a).c.get(0).l();
            long n5 = n2;
            if (l != null) {
                if (l.i(n) == 0L) {
                    return n2;
                }
                n5 = n2 + l.c(l.a(n3, n)) - n3;
            }
            return n5;
        }
    }
    
    public final class c implements d.b
    {
        @Override
        public void a() {
            DashMediaSource.this.R();
        }
        
        @Override
        public void b(final long n) {
            DashMediaSource.this.Q(n);
        }
    }
    
    public static final class d implements p.a
    {
        public static final Pattern a;
        
        static {
            a = Pattern.compile("(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");
        }
        
        public Long b(final Uri uri, final InputStream in) {
            final String line = new BufferedReader(new InputStreamReader(in, W2.e.c)).readLine();
            while (true) {
                try {
                    final Matcher matcher = d.a.matcher(line);
                    if (matcher.matches()) {
                        final String group = matcher.group(1);
                        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        final long time = simpleDateFormat.parse(group).getTime();
                        long l;
                        if ("Z".equals(matcher.group(2))) {
                            l = time;
                        }
                        else {
                            long n;
                            if ("+".equals(matcher.group(4))) {
                                n = 1L;
                            }
                            else {
                                n = -1L;
                            }
                            final long long1 = Long.parseLong(matcher.group(5));
                            final String group2 = matcher.group(7);
                            long long2;
                            if (TextUtils.isEmpty((CharSequence)group2)) {
                                long2 = 0L;
                            }
                            else {
                                long2 = Long.parseLong(group2);
                            }
                            l = time - n * ((long1 * 60L + long2) * 60000L);
                        }
                        return l;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't parse timestamp: ");
                    sb.append(line);
                    throw d0.A.c(sb.toString(), null);
                    final ParseException ex;
                    throw d0.A.c(null, ex);
                }
                catch (ParseException ex2) {}
                final ParseException ex2;
                final ParseException ex = ex2;
                continue;
            }
        }
    }
    
    public final class e implements n.b
    {
        public void a(final p p4, final long n, final long n2, final boolean b) {
            DashMediaSource.this.S(p4, n, n2);
        }
        
        public void b(final p p3, final long n, final long n2) {
            DashMediaSource.this.T(p3, n, n2);
        }
        
        public n.c c(final p p5, final long n, final long n2, final IOException ex, final int n3) {
            return DashMediaSource.this.U(p5, n, n2, ex, n3);
        }
    }
    
    public final class f implements o
    {
        @Override
        public void a() {
            DashMediaSource.G(DashMediaSource.this).a();
            this.b();
        }
        
        public final void b() {
            if (DashMediaSource.H(DashMediaSource.this) == null) {
                return;
            }
            throw DashMediaSource.H(DashMediaSource.this);
        }
    }
    
    public final class g implements n.b
    {
        public void a(final p p4, final long n, final long n2, final boolean b) {
            DashMediaSource.this.S(p4, n, n2);
        }
        
        public void b(final p p3, final long n, final long n2) {
            DashMediaSource.this.V(p3, n, n2);
        }
        
        public n.c c(final p p5, final long n, final long n2, final IOException ex, final int n3) {
            return DashMediaSource.this.W(p5, n, n2, ex);
        }
    }
    
    public static final class h implements p.a
    {
        public Long b(final Uri uri, final InputStream in) {
            return g0.M.Q0(new BufferedReader(new InputStreamReader(in)).readLine());
        }
    }
}
