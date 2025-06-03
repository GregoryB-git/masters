package r0;

import B0.m;
import B0.n;
import B0.p;
import X2.B;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import d0.C1162A;
import g0.AbstractC1297a;
import g0.M;
import i0.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.c;
import r0.f;
import r0.g;
import r0.i;
import r0.k;
import x0.C2139u;
import x0.InterfaceC2117E;
import x0.r;

/* loaded from: classes.dex */
public final class c implements k, n.b {

    /* renamed from: D, reason: collision with root package name */
    public static final k.a f18917D = new k.a() { // from class: r0.b
        @Override // r0.k.a
        public final k a(q0.g gVar, m mVar, j jVar) {
            return new c(gVar, mVar, jVar);
        }
    };

    /* renamed from: A, reason: collision with root package name */
    public f f18918A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f18919B;

    /* renamed from: C, reason: collision with root package name */
    public long f18920C;

    /* renamed from: o, reason: collision with root package name */
    public final q0.g f18921o;

    /* renamed from: p, reason: collision with root package name */
    public final j f18922p;

    /* renamed from: q, reason: collision with root package name */
    public final m f18923q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f18924r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f18925s;

    /* renamed from: t, reason: collision with root package name */
    public final double f18926t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2117E.a f18927u;

    /* renamed from: v, reason: collision with root package name */
    public n f18928v;

    /* renamed from: w, reason: collision with root package name */
    public Handler f18929w;

    /* renamed from: x, reason: collision with root package name */
    public k.e f18930x;

    /* renamed from: y, reason: collision with root package name */
    public g f18931y;

    /* renamed from: z, reason: collision with root package name */
    public Uri f18932z;

    public class b implements k.b {
        public b() {
        }

        @Override // r0.k.b
        public void a() {
            c.this.f18925s.remove(this);
        }

        @Override // r0.k.b
        public boolean e(Uri uri, m.c cVar, boolean z7) {
            C0256c c0256c;
            if (c.this.f18918A == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((g) M.i(c.this.f18931y)).f18994e;
                int i7 = 0;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    C0256c c0256c2 = (C0256c) c.this.f18924r.get(((g.b) list.get(i8)).f19007a);
                    if (c0256c2 != null && elapsedRealtime < c0256c2.f18941v) {
                        i7++;
                    }
                }
                m.b b7 = c.this.f18923q.b(new m.a(1, 0, c.this.f18931y.f18994e.size(), i7), cVar);
                if (b7 != null && b7.f625a == 2 && (c0256c = (C0256c) c.this.f18924r.get(uri)) != null) {
                    c0256c.h(b7.f626b);
                }
            }
            return false;
        }
    }

    /* renamed from: r0.c$c, reason: collision with other inner class name */
    public final class C0256c implements n.b {

        /* renamed from: o, reason: collision with root package name */
        public final Uri f18934o;

        /* renamed from: p, reason: collision with root package name */
        public final n f18935p = new n("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: q, reason: collision with root package name */
        public final i0.g f18936q;

        /* renamed from: r, reason: collision with root package name */
        public f f18937r;

        /* renamed from: s, reason: collision with root package name */
        public long f18938s;

        /* renamed from: t, reason: collision with root package name */
        public long f18939t;

        /* renamed from: u, reason: collision with root package name */
        public long f18940u;

        /* renamed from: v, reason: collision with root package name */
        public long f18941v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f18942w;

        /* renamed from: x, reason: collision with root package name */
        public IOException f18943x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f18944y;

        public C0256c(Uri uri) {
            this.f18934o = uri;
            this.f18936q = c.this.f18921o.a(4);
        }

        public final boolean h(long j7) {
            this.f18941v = SystemClock.elapsedRealtime() + j7;
            return this.f18934o.equals(c.this.f18932z) && !c.this.N();
        }

        public final Uri i() {
            f fVar = this.f18937r;
            if (fVar != null) {
                f.C0257f c0257f = fVar.f18968v;
                if (c0257f.f18987a != -9223372036854775807L || c0257f.f18991e) {
                    Uri.Builder buildUpon = this.f18934o.buildUpon();
                    f fVar2 = this.f18937r;
                    if (fVar2.f18968v.f18991e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f18957k + fVar2.f18964r.size()));
                        f fVar3 = this.f18937r;
                        if (fVar3.f18960n != -9223372036854775807L) {
                            List list = fVar3.f18965s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.b) B.d(list)).f18969A) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.C0257f c0257f2 = this.f18937r.f18968v;
                    if (c0257f2.f18987a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", c0257f2.f18988b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f18934o;
        }

        public f j() {
            return this.f18937r;
        }

        public boolean k() {
            return this.f18944y;
        }

        public boolean l() {
            int i7;
            if (this.f18937r == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, M.i1(this.f18937r.f18967u));
            f fVar = this.f18937r;
            return fVar.f18961o || (i7 = fVar.f18950d) == 2 || i7 == 1 || this.f18938s + max > elapsedRealtime;
        }

        public final /* synthetic */ void m(Uri uri) {
            this.f18942w = false;
            p(uri);
        }

        public void n(boolean z7) {
            q(z7 ? i() : this.f18934o);
        }

        public final void p(Uri uri) {
            p pVar = new p(this.f18936q, uri, 4, c.this.f18922p.a(c.this.f18931y, this.f18937r));
            c.this.f18927u.y(new r(pVar.f651a, pVar.f652b, this.f18935p.n(pVar, this, c.this.f18923q.d(pVar.f653c))), pVar.f653c);
        }

        public final void q(final Uri uri) {
            this.f18941v = 0L;
            if (this.f18942w || this.f18935p.j() || this.f18935p.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f18940u) {
                p(uri);
            } else {
                this.f18942w = true;
                c.this.f18929w.postDelayed(new Runnable() { // from class: r0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0256c.this.m(uri);
                    }
                }, this.f18940u - elapsedRealtime);
            }
        }

        public void s() {
            this.f18935p.a();
            IOException iOException = this.f18943x;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // B0.n.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void t(p pVar, long j7, long j8, boolean z7) {
            r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
            c.this.f18923q.a(pVar.f651a);
            c.this.f18927u.p(rVar, 4);
        }

        @Override // B0.n.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void o(p pVar, long j7, long j8) {
            h hVar = (h) pVar.e();
            r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
            if (hVar instanceof f) {
                x((f) hVar, rVar);
                c.this.f18927u.s(rVar, 4);
            } else {
                this.f18943x = C1162A.c("Loaded playlist has unexpected type.", null);
                c.this.f18927u.w(rVar, 4, this.f18943x, true);
            }
            c.this.f18923q.a(pVar.f651a);
        }

        @Override // B0.n.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public n.c r(p pVar, long j7, long j8, IOException iOException, int i7) {
            n.c cVar;
            r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
            boolean z7 = iOException instanceof i.a;
            if ((pVar.f().getQueryParameter("_HLS_msn") != null) || z7) {
                int i8 = iOException instanceof t ? ((t) iOException).f14720r : Integer.MAX_VALUE;
                if (z7 || i8 == 400 || i8 == 503) {
                    this.f18940u = SystemClock.elapsedRealtime();
                    n(false);
                    ((InterfaceC2117E.a) M.i(c.this.f18927u)).w(rVar, pVar.f653c, iOException, true);
                    return n.f633f;
                }
            }
            m.c cVar2 = new m.c(rVar, new C2139u(pVar.f653c), iOException, i7);
            if (c.this.P(this.f18934o, cVar2, false)) {
                long c7 = c.this.f18923q.c(cVar2);
                cVar = c7 != -9223372036854775807L ? n.h(false, c7) : n.f634g;
            } else {
                cVar = n.f633f;
            }
            boolean c8 = true ^ cVar.c();
            c.this.f18927u.w(rVar, pVar.f653c, iOException, c8);
            if (c8) {
                c.this.f18923q.a(pVar.f651a);
            }
            return cVar;
        }

        public final void x(f fVar, r rVar) {
            boolean z7;
            long j7;
            f fVar2 = this.f18937r;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f18938s = elapsedRealtime;
            f H6 = c.this.H(fVar2, fVar);
            this.f18937r = H6;
            IOException iOException = null;
            if (H6 != fVar2) {
                this.f18943x = null;
                this.f18939t = elapsedRealtime;
                c.this.T(this.f18934o, H6);
            } else if (!H6.f18961o) {
                if (fVar.f18957k + fVar.f18964r.size() < this.f18937r.f18957k) {
                    iOException = new k.c(this.f18934o);
                    z7 = true;
                } else {
                    z7 = false;
                    if (elapsedRealtime - this.f18939t > M.i1(r13.f18959m) * c.this.f18926t) {
                        iOException = new k.d(this.f18934o);
                    }
                }
                if (iOException != null) {
                    this.f18943x = iOException;
                    c.this.P(this.f18934o, new m.c(rVar, new C2139u(4), iOException, 1), z7);
                }
            }
            f fVar3 = this.f18937r;
            if (fVar3.f18968v.f18991e) {
                j7 = 0;
            } else {
                j7 = fVar3.f18959m;
                if (fVar3 == fVar2) {
                    j7 /= 2;
                }
            }
            this.f18940u = (elapsedRealtime + M.i1(j7)) - rVar.f20820f;
            if (this.f18937r.f18961o) {
                return;
            }
            if (this.f18934o.equals(c.this.f18932z) || this.f18944y) {
                q(i());
            }
        }

        public void y() {
            this.f18935p.l();
        }

        public void z(boolean z7) {
            this.f18944y = z7;
        }
    }

    public c(q0.g gVar, m mVar, j jVar) {
        this(gVar, mVar, jVar, 3.5d);
    }

    public static f.d G(f fVar, f fVar2) {
        int i7 = (int) (fVar2.f18957k - fVar.f18957k);
        List list = fVar.f18964r;
        if (i7 < list.size()) {
            return (f.d) list.get(i7);
        }
        return null;
    }

    public final void F(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = (Uri) list.get(i7);
            this.f18924r.put(uri, new C0256c(uri));
        }
    }

    public final f H(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f18961o ? fVar.d() : fVar : fVar2.c(J(fVar, fVar2), I(fVar, fVar2));
    }

    public final int I(f fVar, f fVar2) {
        if (fVar2.f18955i) {
            return fVar2.f18956j;
        }
        f fVar3 = this.f18918A;
        int i7 = fVar3 != null ? fVar3.f18956j : 0;
        if (fVar == null) {
            return i7;
        }
        f.d G6 = G(fVar, fVar2);
        return G6 != null ? (fVar.f18956j + G6.f18979r) - ((f.d) fVar2.f18964r.get(0)).f18979r : i7;
    }

    public final long J(f fVar, f fVar2) {
        if (fVar2.f18962p) {
            return fVar2.f18954h;
        }
        f fVar3 = this.f18918A;
        long j7 = fVar3 != null ? fVar3.f18954h : 0L;
        if (fVar == null) {
            return j7;
        }
        int size = fVar.f18964r.size();
        f.d G6 = G(fVar, fVar2);
        return G6 != null ? fVar.f18954h + G6.f18980s : ((long) size) == fVar2.f18957k - fVar.f18957k ? fVar.e() : j7;
    }

    public final Uri K(Uri uri) {
        f.c cVar;
        f fVar = this.f18918A;
        if (fVar == null || !fVar.f18968v.f18991e || (cVar = (f.c) fVar.f18966t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f18972b));
        int i7 = cVar.f18973c;
        if (i7 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return buildUpon.build();
    }

    public final boolean L(Uri uri) {
        List list = this.f18931y.f18994e;
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (uri.equals(((g.b) list.get(i7)).f19007a)) {
                return true;
            }
        }
        return false;
    }

    public final void M(Uri uri) {
        C0256c c0256c = (C0256c) this.f18924r.get(uri);
        f j7 = c0256c.j();
        if (c0256c.k()) {
            return;
        }
        c0256c.z(true);
        if (j7 == null || j7.f18961o) {
            return;
        }
        c0256c.n(true);
    }

    public final boolean N() {
        List list = this.f18931y.f18994e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            C0256c c0256c = (C0256c) AbstractC1297a.e((C0256c) this.f18924r.get(((g.b) list.get(i7)).f19007a));
            if (elapsedRealtime > c0256c.f18941v) {
                Uri uri = c0256c.f18934o;
                this.f18932z = uri;
                c0256c.q(K(uri));
                return true;
            }
        }
        return false;
    }

    public final void O(Uri uri) {
        if (uri.equals(this.f18932z) || !L(uri)) {
            return;
        }
        f fVar = this.f18918A;
        if (fVar == null || !fVar.f18961o) {
            this.f18932z = uri;
            C0256c c0256c = (C0256c) this.f18924r.get(uri);
            f fVar2 = c0256c.f18937r;
            if (fVar2 == null || !fVar2.f18961o) {
                c0256c.q(K(uri));
            } else {
                this.f18918A = fVar2;
                this.f18930x.b(fVar2);
            }
        }
    }

    public final boolean P(Uri uri, m.c cVar, boolean z7) {
        Iterator it = this.f18925s.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= !((k.b) it.next()).e(uri, cVar, z7);
        }
        return z8;
    }

    @Override // B0.n.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void t(p pVar, long j7, long j8, boolean z7) {
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        this.f18923q.a(pVar.f651a);
        this.f18927u.p(rVar, 4);
    }

    @Override // B0.n.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void o(p pVar, long j7, long j8) {
        h hVar = (h) pVar.e();
        boolean z7 = hVar instanceof f;
        g e7 = z7 ? g.e(hVar.f19013a) : (g) hVar;
        this.f18931y = e7;
        this.f18932z = ((g.b) e7.f18994e.get(0)).f19007a;
        this.f18925s.add(new b());
        F(e7.f18993d);
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        C0256c c0256c = (C0256c) this.f18924r.get(this.f18932z);
        if (z7) {
            c0256c.x((f) hVar, rVar);
        } else {
            c0256c.n(false);
        }
        this.f18923q.a(pVar.f651a);
        this.f18927u.s(rVar, 4);
    }

    @Override // B0.n.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public n.c r(p pVar, long j7, long j8, IOException iOException, int i7) {
        r rVar = new r(pVar.f651a, pVar.f652b, pVar.f(), pVar.d(), j7, j8, pVar.a());
        long c7 = this.f18923q.c(new m.c(rVar, new C2139u(pVar.f653c), iOException, i7));
        boolean z7 = c7 == -9223372036854775807L;
        this.f18927u.w(rVar, pVar.f653c, iOException, z7);
        if (z7) {
            this.f18923q.a(pVar.f651a);
        }
        return z7 ? n.f634g : n.h(false, c7);
    }

    public final void T(Uri uri, f fVar) {
        if (uri.equals(this.f18932z)) {
            if (this.f18918A == null) {
                this.f18919B = !fVar.f18961o;
                this.f18920C = fVar.f18954h;
            }
            this.f18918A = fVar;
            this.f18930x.b(fVar);
        }
        Iterator it = this.f18925s.iterator();
        while (it.hasNext()) {
            ((k.b) it.next()).a();
        }
    }

    @Override // r0.k
    public boolean a() {
        return this.f18919B;
    }

    @Override // r0.k
    public g b() {
        return this.f18931y;
    }

    @Override // r0.k
    public boolean c(Uri uri, long j7) {
        if (((C0256c) this.f18924r.get(uri)) != null) {
            return !r2.h(j7);
        }
        return false;
    }

    @Override // r0.k
    public boolean d(Uri uri) {
        return ((C0256c) this.f18924r.get(uri)).l();
    }

    @Override // r0.k
    public void e(Uri uri, InterfaceC2117E.a aVar, k.e eVar) {
        this.f18929w = M.A();
        this.f18927u = aVar;
        this.f18930x = eVar;
        p pVar = new p(this.f18921o.a(4), uri, 4, this.f18922p.b());
        AbstractC1297a.f(this.f18928v == null);
        n nVar = new n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f18928v = nVar;
        aVar.y(new r(pVar.f651a, pVar.f652b, nVar.n(pVar, this, this.f18923q.d(pVar.f653c))), pVar.f653c);
    }

    @Override // r0.k
    public void f() {
        n nVar = this.f18928v;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = this.f18932z;
        if (uri != null) {
            h(uri);
        }
    }

    @Override // r0.k
    public void g(Uri uri) {
        C0256c c0256c = (C0256c) this.f18924r.get(uri);
        if (c0256c != null) {
            c0256c.z(false);
        }
    }

    @Override // r0.k
    public void h(Uri uri) {
        ((C0256c) this.f18924r.get(uri)).s();
    }

    @Override // r0.k
    public void i(Uri uri) {
        ((C0256c) this.f18924r.get(uri)).n(true);
    }

    @Override // r0.k
    public void j(k.b bVar) {
        AbstractC1297a.e(bVar);
        this.f18925s.add(bVar);
    }

    @Override // r0.k
    public f k(Uri uri, boolean z7) {
        f j7 = ((C0256c) this.f18924r.get(uri)).j();
        if (j7 != null && z7) {
            O(uri);
            M(uri);
        }
        return j7;
    }

    @Override // r0.k
    public void l(k.b bVar) {
        this.f18925s.remove(bVar);
    }

    @Override // r0.k
    public long m() {
        return this.f18920C;
    }

    @Override // r0.k
    public void stop() {
        this.f18932z = null;
        this.f18918A = null;
        this.f18931y = null;
        this.f18920C = -9223372036854775807L;
        this.f18928v.l();
        this.f18928v = null;
        Iterator it = this.f18924r.values().iterator();
        while (it.hasNext()) {
            ((C0256c) it.next()).y();
        }
        this.f18929w.removeCallbacksAndMessages(null);
        this.f18929w = null;
        this.f18924r.clear();
    }

    public c(q0.g gVar, m mVar, j jVar, double d7) {
        this.f18921o = gVar;
        this.f18922p = jVar;
        this.f18923q = mVar;
        this.f18926t = d7;
        this.f18925s = new CopyOnWriteArrayList();
        this.f18924r = new HashMap();
        this.f18920C = -9223372036854775807L;
    }
}
