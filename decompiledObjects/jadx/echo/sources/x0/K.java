package x0;

import B0.m;
import B0.n;
import F0.C0369n;
import F0.InterfaceC0374t;
import F0.M;
import android.net.Uri;
import android.os.Handler;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1171J;
import d0.C1194q;
import d0.C1201x;
import d0.InterfaceC1186i;
import g0.AbstractC1297a;
import g0.C1302f;
import i0.k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k0.C1441v0;
import k0.C1447y0;
import k0.d1;
import p0.v;
import x0.C2136q;
import x0.InterfaceC2117E;
import x0.InterfaceC2140v;
import x0.P;

/* loaded from: classes.dex */
public final class K implements InterfaceC2140v, InterfaceC0374t, n.b, n.f, P.d {

    /* renamed from: c0, reason: collision with root package name */
    public static final Map f20533c0 = M();

    /* renamed from: d0, reason: collision with root package name */
    public static final C1194q f20534d0 = new C1194q.b().a0("icy").o0("application/x-icy").K();

    /* renamed from: A, reason: collision with root package name */
    public final InterfaceC2118F f20535A;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC2140v.a f20540F;

    /* renamed from: G, reason: collision with root package name */
    public S0.b f20541G;

    /* renamed from: J, reason: collision with root package name */
    public boolean f20544J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f20545K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f20546L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f20547M;

    /* renamed from: N, reason: collision with root package name */
    public f f20548N;

    /* renamed from: O, reason: collision with root package name */
    public F0.M f20549O;

    /* renamed from: P, reason: collision with root package name */
    public long f20550P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f20551Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f20553S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f20554T;

    /* renamed from: U, reason: collision with root package name */
    public int f20555U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f20556V;

    /* renamed from: W, reason: collision with root package name */
    public long f20557W;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f20559Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f20560Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f20561a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f20562b0;

    /* renamed from: o, reason: collision with root package name */
    public final Uri f20563o;

    /* renamed from: p, reason: collision with root package name */
    public final i0.g f20564p;

    /* renamed from: q, reason: collision with root package name */
    public final p0.x f20565q;

    /* renamed from: r, reason: collision with root package name */
    public final B0.m f20566r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2117E.a f20567s;

    /* renamed from: t, reason: collision with root package name */
    public final v.a f20568t;

    /* renamed from: u, reason: collision with root package name */
    public final c f20569u;

    /* renamed from: v, reason: collision with root package name */
    public final B0.b f20570v;

    /* renamed from: w, reason: collision with root package name */
    public final String f20571w;

    /* renamed from: x, reason: collision with root package name */
    public final long f20572x;

    /* renamed from: y, reason: collision with root package name */
    public final long f20573y;

    /* renamed from: z, reason: collision with root package name */
    public final B0.n f20574z = new B0.n("ProgressiveMediaPeriod");

    /* renamed from: B, reason: collision with root package name */
    public final C1302f f20536B = new C1302f();

    /* renamed from: C, reason: collision with root package name */
    public final Runnable f20537C = new Runnable() { // from class: x0.G
        @Override // java.lang.Runnable
        public final void run() {
            K.this.V();
        }
    };

    /* renamed from: D, reason: collision with root package name */
    public final Runnable f20538D = new Runnable() { // from class: x0.H
        @Override // java.lang.Runnable
        public final void run() {
            K.this.S();
        }
    };

    /* renamed from: E, reason: collision with root package name */
    public final Handler f20539E = g0.M.A();

    /* renamed from: I, reason: collision with root package name */
    public e[] f20543I = new e[0];

    /* renamed from: H, reason: collision with root package name */
    public P[] f20542H = new P[0];

    /* renamed from: X, reason: collision with root package name */
    public long f20558X = -9223372036854775807L;

    /* renamed from: R, reason: collision with root package name */
    public int f20552R = 1;

    public class a extends F0.D {
        public a(F0.M m7) {
            super(m7);
        }

        @Override // F0.D, F0.M
        public long l() {
            return K.this.f20550P;
        }
    }

    public final class b implements n.e, C2136q.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f20577b;

        /* renamed from: c, reason: collision with root package name */
        public final i0.x f20578c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC2118F f20579d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC0374t f20580e;

        /* renamed from: f, reason: collision with root package name */
        public final C1302f f20581f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f20583h;

        /* renamed from: j, reason: collision with root package name */
        public long f20585j;

        /* renamed from: l, reason: collision with root package name */
        public F0.T f20587l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f20588m;

        /* renamed from: g, reason: collision with root package name */
        public final F0.L f20582g = new F0.L();

        /* renamed from: i, reason: collision with root package name */
        public boolean f20584i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f20576a = r.a();

        /* renamed from: k, reason: collision with root package name */
        public i0.k f20586k = i(0);

        public b(Uri uri, i0.g gVar, InterfaceC2118F interfaceC2118F, InterfaceC0374t interfaceC0374t, C1302f c1302f) {
            this.f20577b = uri;
            this.f20578c = new i0.x(gVar);
            this.f20579d = interfaceC2118F;
            this.f20580e = interfaceC0374t;
            this.f20581f = c1302f;
        }

        @Override // x0.C2136q.a
        public void a(g0.z zVar) {
            long max = !this.f20588m ? this.f20585j : Math.max(K.this.O(true), this.f20585j);
            int a7 = zVar.a();
            F0.T t7 = (F0.T) AbstractC1297a.e(this.f20587l);
            t7.e(zVar, a7);
            t7.b(max, 1, a7, 0, null);
            this.f20588m = true;
        }

        @Override // B0.n.e
        public void b() {
            int i7 = 0;
            while (i7 == 0 && !this.f20583h) {
                try {
                    long j7 = this.f20582g.f1788a;
                    i0.k i8 = i(j7);
                    this.f20586k = i8;
                    long e7 = this.f20578c.e(i8);
                    if (this.f20583h) {
                        if (i7 != 1 && this.f20579d.d() != -1) {
                            this.f20582g.f1788a = this.f20579d.d();
                        }
                        i0.j.a(this.f20578c);
                        return;
                    }
                    if (e7 != -1) {
                        e7 += j7;
                        K.this.a0();
                    }
                    long j8 = e7;
                    K.this.f20541G = S0.b.a(this.f20578c.g());
                    InterfaceC1186i interfaceC1186i = this.f20578c;
                    if (K.this.f20541G != null && K.this.f20541G.f5826t != -1) {
                        interfaceC1186i = new C2136q(this.f20578c, K.this.f20541G.f5826t, this);
                        F0.T P6 = K.this.P();
                        this.f20587l = P6;
                        P6.d(K.f20534d0);
                    }
                    long j9 = j7;
                    this.f20579d.b(interfaceC1186i, this.f20577b, this.f20578c.g(), j7, j8, this.f20580e);
                    if (K.this.f20541G != null) {
                        this.f20579d.e();
                    }
                    if (this.f20584i) {
                        this.f20579d.a(j9, this.f20585j);
                        this.f20584i = false;
                    }
                    while (true) {
                        long j10 = j9;
                        while (i7 == 0 && !this.f20583h) {
                            try {
                                this.f20581f.a();
                                i7 = this.f20579d.c(this.f20582g);
                                j9 = this.f20579d.d();
                                if (j9 > K.this.f20572x + j10) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f20581f.c();
                        K.this.f20539E.post(K.this.f20538D);
                    }
                    if (i7 == 1) {
                        i7 = 0;
                    } else if (this.f20579d.d() != -1) {
                        this.f20582g.f1788a = this.f20579d.d();
                    }
                    i0.j.a(this.f20578c);
                } catch (Throwable th) {
                    if (i7 != 1 && this.f20579d.d() != -1) {
                        this.f20582g.f1788a = this.f20579d.d();
                    }
                    i0.j.a(this.f20578c);
                    throw th;
                }
            }
        }

        @Override // B0.n.e
        public void c() {
            this.f20583h = true;
        }

        public final i0.k i(long j7) {
            return new k.b().i(this.f20577b).h(j7).f(K.this.f20571w).b(6).e(K.f20533c0).a();
        }

        public final void j(long j7, long j8) {
            this.f20582g.f1788a = j7;
            this.f20585j = j8;
            this.f20584i = true;
            this.f20588m = false;
        }
    }

    public interface c {
        void q(long j7, boolean z7, boolean z8);
    }

    public final class d implements Q {

        /* renamed from: o, reason: collision with root package name */
        public final int f20590o;

        public d(int i7) {
            this.f20590o = i7;
        }

        @Override // x0.Q
        public void a() {
            K.this.Z(this.f20590o);
        }

        @Override // x0.Q
        public boolean e() {
            return K.this.R(this.f20590o);
        }

        @Override // x0.Q
        public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
            return K.this.f0(this.f20590o, c1441v0, iVar, i7);
        }

        @Override // x0.Q
        public int m(long j7) {
            return K.this.j0(this.f20590o, j7);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f20592a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20593b;

        public e(int i7, boolean z7) {
            this.f20592a = i7;
            this.f20593b = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f20592a == eVar.f20592a && this.f20593b == eVar.f20593b;
        }

        public int hashCode() {
            return (this.f20592a * 31) + (this.f20593b ? 1 : 0);
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Z f20594a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f20595b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f20596c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f20597d;

        public f(Z z7, boolean[] zArr) {
            this.f20594a = z7;
            this.f20595b = zArr;
            int i7 = z7.f20702a;
            this.f20596c = new boolean[i7];
            this.f20597d = new boolean[i7];
        }
    }

    public K(Uri uri, i0.g gVar, InterfaceC2118F interfaceC2118F, p0.x xVar, v.a aVar, B0.m mVar, InterfaceC2117E.a aVar2, c cVar, B0.b bVar, String str, int i7, long j7) {
        this.f20563o = uri;
        this.f20564p = gVar;
        this.f20565q = xVar;
        this.f20568t = aVar;
        this.f20566r = mVar;
        this.f20567s = aVar2;
        this.f20569u = cVar;
        this.f20570v = bVar;
        this.f20571w = str;
        this.f20572x = i7;
        this.f20535A = interfaceC2118F;
        this.f20573y = j7;
    }

    public static Map M() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private boolean Q() {
        return this.f20558X != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        if (this.f20562b0 || this.f20545K || !this.f20544J || this.f20549O == null) {
            return;
        }
        for (P p7 : this.f20542H) {
            if (p7.G() == null) {
                return;
            }
        }
        this.f20536B.c();
        int length = this.f20542H.length;
        C1171J[] c1171jArr = new C1171J[length];
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            C1194q c1194q = (C1194q) AbstractC1297a.e(this.f20542H[i7].G());
            String str = c1194q.f12726n;
            boolean o7 = AbstractC1203z.o(str);
            boolean z7 = o7 || AbstractC1203z.s(str);
            zArr[i7] = z7;
            this.f20546L = z7 | this.f20546L;
            this.f20547M = this.f20573y != -9223372036854775807L && length == 1 && AbstractC1203z.p(str);
            S0.b bVar = this.f20541G;
            if (bVar != null) {
                if (o7 || this.f20543I[i7].f20593b) {
                    C1201x c1201x = c1194q.f12723k;
                    c1194q = c1194q.a().h0(c1201x == null ? new C1201x(bVar) : c1201x.a(bVar)).K();
                }
                if (o7 && c1194q.f12719g == -1 && c1194q.f12720h == -1 && bVar.f5821o != -1) {
                    c1194q = c1194q.a().M(bVar.f5821o).K();
                }
            }
            c1171jArr[i7] = new C1171J(Integer.toString(i7), c1194q.b(this.f20565q.b(c1194q)));
        }
        this.f20548N = new f(new Z(c1171jArr), zArr);
        if (this.f20547M && this.f20550P == -9223372036854775807L) {
            this.f20550P = this.f20573y;
            this.f20549O = new a(this.f20549O);
        }
        this.f20569u.q(this.f20550P, this.f20549O.h(), this.f20551Q);
        this.f20545K = true;
        ((InterfaceC2140v.a) AbstractC1297a.e(this.f20540F)).k(this);
    }

    public final void K() {
        AbstractC1297a.f(this.f20545K);
        AbstractC1297a.e(this.f20548N);
        AbstractC1297a.e(this.f20549O);
    }

    public final boolean L(b bVar, int i7) {
        F0.M m7;
        if (this.f20556V || !((m7 = this.f20549O) == null || m7.l() == -9223372036854775807L)) {
            this.f20560Z = i7;
            return true;
        }
        if (this.f20545K && !l0()) {
            this.f20559Y = true;
            return false;
        }
        this.f20554T = this.f20545K;
        this.f20557W = 0L;
        this.f20560Z = 0;
        for (P p7 : this.f20542H) {
            p7.W();
        }
        bVar.j(0L, 0L);
        return true;
    }

    public final int N() {
        int i7 = 0;
        for (P p7 : this.f20542H) {
            i7 += p7.H();
        }
        return i7;
    }

    public final long O(boolean z7) {
        long j7 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.f20542H.length; i7++) {
            if (z7 || ((f) AbstractC1297a.e(this.f20548N)).f20596c[i7]) {
                j7 = Math.max(j7, this.f20542H[i7].A());
            }
        }
        return j7;
    }

    public F0.T P() {
        return e0(new e(0, true));
    }

    public boolean R(int i7) {
        return !l0() && this.f20542H[i7].L(this.f20561a0);
    }

    public final /* synthetic */ void S() {
        if (this.f20562b0) {
            return;
        }
        ((InterfaceC2140v.a) AbstractC1297a.e(this.f20540F)).e(this);
    }

    public final /* synthetic */ void T() {
        this.f20556V = true;
    }

    public final void W(int i7) {
        K();
        f fVar = this.f20548N;
        boolean[] zArr = fVar.f20597d;
        if (zArr[i7]) {
            return;
        }
        C1194q a7 = fVar.f20594a.b(i7).a(0);
        this.f20567s.h(AbstractC1203z.k(a7.f12726n), a7, 0, null, this.f20557W);
        zArr[i7] = true;
    }

    public final void X(int i7) {
        K();
        boolean[] zArr = this.f20548N.f20595b;
        if (this.f20559Y && zArr[i7]) {
            if (this.f20542H[i7].L(false)) {
                return;
            }
            this.f20558X = 0L;
            this.f20559Y = false;
            this.f20554T = true;
            this.f20557W = 0L;
            this.f20560Z = 0;
            for (P p7 : this.f20542H) {
                p7.W();
            }
            ((InterfaceC2140v.a) AbstractC1297a.e(this.f20540F)).e(this);
        }
    }

    public void Y() {
        this.f20574z.k(this.f20566r.d(this.f20552R));
    }

    public void Z(int i7) {
        this.f20542H[i7].O();
        Y();
    }

    @Override // F0.InterfaceC0374t
    public F0.T a(int i7, int i8) {
        return e0(new e(i7, false));
    }

    public final void a0() {
        this.f20539E.post(new Runnable() { // from class: x0.I
            @Override // java.lang.Runnable
            public final void run() {
                K.this.T();
            }
        });
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean b() {
        return this.f20574z.j() && this.f20536B.d();
    }

    @Override // B0.n.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void t(b bVar, long j7, long j8, boolean z7) {
        i0.x xVar = bVar.f20578c;
        r rVar = new r(bVar.f20576a, bVar.f20586k, xVar.r(), xVar.s(), j7, j8, xVar.q());
        this.f20566r.a(bVar.f20576a);
        this.f20567s.q(rVar, 1, -1, null, 0, null, bVar.f20585j, this.f20550P);
        if (z7) {
            return;
        }
        for (P p7 : this.f20542H) {
            p7.W();
        }
        if (this.f20555U > 0) {
            ((InterfaceC2140v.a) AbstractC1297a.e(this.f20540F)).e(this);
        }
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long c() {
        return f();
    }

    @Override // B0.n.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void o(b bVar, long j7, long j8) {
        F0.M m7;
        if (this.f20550P == -9223372036854775807L && (m7 = this.f20549O) != null) {
            boolean h7 = m7.h();
            long O6 = O(true);
            long j9 = O6 == Long.MIN_VALUE ? 0L : O6 + 10000;
            this.f20550P = j9;
            this.f20569u.q(j9, h7, this.f20551Q);
        }
        i0.x xVar = bVar.f20578c;
        r rVar = new r(bVar.f20576a, bVar.f20586k, xVar.r(), xVar.s(), j7, j8, xVar.q());
        this.f20566r.a(bVar.f20576a);
        this.f20567s.t(rVar, 1, -1, null, 0, null, bVar.f20585j, this.f20550P);
        this.f20561a0 = true;
        ((InterfaceC2140v.a) AbstractC1297a.e(this.f20540F)).e(this);
    }

    @Override // x0.InterfaceC2140v
    public long d(long j7, d1 d1Var) {
        K();
        if (!this.f20549O.h()) {
            return 0L;
        }
        M.a j8 = this.f20549O.j(j7);
        return d1Var.a(j7, j8.f1789a.f1794a, j8.f1790b.f1794a);
    }

    @Override // B0.n.b
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public n.c r(b bVar, long j7, long j8, IOException iOException, int i7) {
        boolean z7;
        b bVar2;
        n.c h7;
        i0.x xVar = bVar.f20578c;
        r rVar = new r(bVar.f20576a, bVar.f20586k, xVar.r(), xVar.s(), j7, j8, xVar.q());
        long c7 = this.f20566r.c(new m.c(rVar, new C2139u(1, -1, null, 0, null, g0.M.i1(bVar.f20585j), g0.M.i1(this.f20550P)), iOException, i7));
        if (c7 == -9223372036854775807L) {
            h7 = B0.n.f634g;
        } else {
            int N6 = N();
            if (N6 > this.f20560Z) {
                bVar2 = bVar;
                z7 = true;
            } else {
                z7 = false;
                bVar2 = bVar;
            }
            h7 = L(bVar2, N6) ? B0.n.h(z7, c7) : B0.n.f633f;
        }
        boolean z8 = !h7.c();
        this.f20567s.v(rVar, 1, -1, null, 0, null, bVar.f20585j, this.f20550P, iOException, z8);
        if (z8) {
            this.f20566r.a(bVar.f20576a);
        }
        return h7;
    }

    @Override // F0.InterfaceC0374t
    public void e(final F0.M m7) {
        this.f20539E.post(new Runnable() { // from class: x0.J
            @Override // java.lang.Runnable
            public final void run() {
                K.this.U(m7);
            }
        });
    }

    public final F0.T e0(e eVar) {
        int length = this.f20542H.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (eVar.equals(this.f20543I[i7])) {
                return this.f20542H[i7];
            }
        }
        if (this.f20544J) {
            g0.o.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f20592a + ") after finishing tracks.");
            return new C0369n();
        }
        P k7 = P.k(this.f20570v, this.f20565q, this.f20568t);
        k7.e0(this);
        int i8 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f20543I, i8);
        eVarArr[length] = eVar;
        this.f20543I = (e[]) g0.M.j(eVarArr);
        P[] pArr = (P[]) Arrays.copyOf(this.f20542H, i8);
        pArr[length] = k7;
        this.f20542H = (P[]) g0.M.j(pArr);
        return k7;
    }

    @Override // x0.InterfaceC2140v, x0.S
    public long f() {
        long j7;
        K();
        if (this.f20561a0 || this.f20555U == 0) {
            return Long.MIN_VALUE;
        }
        if (Q()) {
            return this.f20558X;
        }
        if (this.f20546L) {
            int length = this.f20542H.length;
            j7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                f fVar = this.f20548N;
                if (fVar.f20595b[i7] && fVar.f20596c[i7] && !this.f20542H[i7].K()) {
                    j7 = Math.min(j7, this.f20542H[i7].A());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = O(false);
        }
        return j7 == Long.MIN_VALUE ? this.f20557W : j7;
    }

    public int f0(int i7, C1441v0 c1441v0, j0.i iVar, int i8) {
        if (l0()) {
            return -3;
        }
        W(i7);
        int T6 = this.f20542H[i7].T(c1441v0, iVar, i8, this.f20561a0);
        if (T6 == -3) {
            X(i7);
        }
        return T6;
    }

    @Override // x0.InterfaceC2140v, x0.S
    public boolean g(C1447y0 c1447y0) {
        if (this.f20561a0 || this.f20574z.i() || this.f20559Y) {
            return false;
        }
        if (this.f20545K && this.f20555U == 0) {
            return false;
        }
        boolean e7 = this.f20536B.e();
        if (this.f20574z.j()) {
            return e7;
        }
        k0();
        return true;
    }

    public void g0() {
        if (this.f20545K) {
            for (P p7 : this.f20542H) {
                p7.S();
            }
        }
        this.f20574z.m(this);
        this.f20539E.removeCallbacksAndMessages(null);
        this.f20540F = null;
        this.f20562b0 = true;
    }

    public final boolean h0(boolean[] zArr, long j7) {
        int length = this.f20542H.length;
        for (int i7 = 0; i7 < length; i7++) {
            P p7 = this.f20542H[i7];
            if (!(this.f20547M ? p7.Z(p7.y()) : p7.a0(j7, false)) && (zArr[i7] || !this.f20546L)) {
                return false;
            }
        }
        return true;
    }

    @Override // x0.InterfaceC2140v
    public long i(A0.y[] yVarArr, boolean[] zArr, Q[] qArr, boolean[] zArr2, long j7) {
        A0.y yVar;
        K();
        f fVar = this.f20548N;
        Z z7 = fVar.f20594a;
        boolean[] zArr3 = fVar.f20596c;
        int i7 = this.f20555U;
        int i8 = 0;
        for (int i9 = 0; i9 < yVarArr.length; i9++) {
            Q q7 = qArr[i9];
            if (q7 != null && (yVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((d) q7).f20590o;
                AbstractC1297a.f(zArr3[i10]);
                this.f20555U--;
                zArr3[i10] = false;
                qArr[i9] = null;
            }
        }
        boolean z8 = !this.f20553S ? j7 == 0 || this.f20547M : i7 != 0;
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            if (qArr[i11] == null && (yVar = yVarArr[i11]) != null) {
                AbstractC1297a.f(yVar.length() == 1);
                AbstractC1297a.f(yVar.c(0) == 0);
                int d7 = z7.d(yVar.d());
                AbstractC1297a.f(!zArr3[d7]);
                this.f20555U++;
                zArr3[d7] = true;
                qArr[i11] = new d(d7);
                zArr2[i11] = true;
                if (!z8) {
                    P p7 = this.f20542H[d7];
                    z8 = (p7.D() == 0 || p7.a0(j7, true)) ? false : true;
                }
            }
        }
        if (this.f20555U == 0) {
            this.f20559Y = false;
            this.f20554T = false;
            if (this.f20574z.j()) {
                P[] pArr = this.f20542H;
                int length = pArr.length;
                while (i8 < length) {
                    pArr[i8].r();
                    i8++;
                }
                this.f20574z.f();
            } else {
                this.f20561a0 = false;
                P[] pArr2 = this.f20542H;
                int length2 = pArr2.length;
                while (i8 < length2) {
                    pArr2[i8].W();
                    i8++;
                }
            }
        } else if (z8) {
            j7 = s(j7);
            while (i8 < qArr.length) {
                if (qArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.f20553S = true;
        return j7;
    }

    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final void U(F0.M m7) {
        this.f20549O = this.f20541G == null ? m7 : new M.b(-9223372036854775807L);
        this.f20550P = m7.l();
        boolean z7 = !this.f20556V && m7.l() == -9223372036854775807L;
        this.f20551Q = z7;
        this.f20552R = z7 ? 7 : 1;
        if (this.f20545K) {
            this.f20569u.q(this.f20550P, m7.h(), this.f20551Q);
        } else {
            V();
        }
    }

    @Override // F0.InterfaceC0374t
    public void j() {
        this.f20544J = true;
        this.f20539E.post(this.f20537C);
    }

    public int j0(int i7, long j7) {
        if (l0()) {
            return 0;
        }
        W(i7);
        P p7 = this.f20542H[i7];
        int F6 = p7.F(j7, this.f20561a0);
        p7.f0(F6);
        if (F6 == 0) {
            X(i7);
        }
        return F6;
    }

    @Override // B0.n.f
    public void k() {
        for (P p7 : this.f20542H) {
            p7.U();
        }
        this.f20535A.release();
    }

    public final void k0() {
        b bVar = new b(this.f20563o, this.f20564p, this.f20535A, this, this.f20536B);
        if (this.f20545K) {
            AbstractC1297a.f(Q());
            long j7 = this.f20550P;
            if (j7 != -9223372036854775807L && this.f20558X > j7) {
                this.f20561a0 = true;
                this.f20558X = -9223372036854775807L;
                return;
            }
            bVar.j(((F0.M) AbstractC1297a.e(this.f20549O)).j(this.f20558X).f1789a.f1795b, this.f20558X);
            for (P p7 : this.f20542H) {
                p7.c0(this.f20558X);
            }
            this.f20558X = -9223372036854775807L;
        }
        this.f20560Z = N();
        this.f20567s.z(new r(bVar.f20576a, bVar.f20586k, this.f20574z.n(bVar, this, this.f20566r.d(this.f20552R))), 1, -1, null, 0, null, bVar.f20585j, this.f20550P);
    }

    @Override // x0.InterfaceC2140v
    public long l() {
        if (!this.f20554T) {
            return -9223372036854775807L;
        }
        if (!this.f20561a0 && N() <= this.f20560Z) {
            return -9223372036854775807L;
        }
        this.f20554T = false;
        return this.f20557W;
    }

    public final boolean l0() {
        return this.f20554T || Q();
    }

    @Override // x0.P.d
    public void m(C1194q c1194q) {
        this.f20539E.post(this.f20537C);
    }

    @Override // x0.InterfaceC2140v
    public Z n() {
        K();
        return this.f20548N.f20594a;
    }

    @Override // x0.InterfaceC2140v
    public void p() {
        Y();
        if (this.f20561a0 && !this.f20545K) {
            throw C1162A.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // x0.InterfaceC2140v
    public void q(long j7, boolean z7) {
        if (this.f20547M) {
            return;
        }
        K();
        if (Q()) {
            return;
        }
        boolean[] zArr = this.f20548N.f20596c;
        int length = this.f20542H.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f20542H[i7].q(j7, z7, zArr[i7]);
        }
    }

    @Override // x0.InterfaceC2140v
    public long s(long j7) {
        K();
        boolean[] zArr = this.f20548N.f20595b;
        if (!this.f20549O.h()) {
            j7 = 0;
        }
        int i7 = 0;
        this.f20554T = false;
        this.f20557W = j7;
        if (Q()) {
            this.f20558X = j7;
            return j7;
        }
        if (this.f20552R != 7 && ((this.f20561a0 || this.f20574z.j()) && h0(zArr, j7))) {
            return j7;
        }
        this.f20559Y = false;
        this.f20558X = j7;
        this.f20561a0 = false;
        if (this.f20574z.j()) {
            P[] pArr = this.f20542H;
            int length = pArr.length;
            while (i7 < length) {
                pArr[i7].r();
                i7++;
            }
            this.f20574z.f();
        } else {
            this.f20574z.g();
            P[] pArr2 = this.f20542H;
            int length2 = pArr2.length;
            while (i7 < length2) {
                pArr2[i7].W();
                i7++;
            }
        }
        return j7;
    }

    @Override // x0.InterfaceC2140v
    public void u(InterfaceC2140v.a aVar, long j7) {
        this.f20540F = aVar;
        this.f20536B.e();
        k0();
    }

    @Override // x0.InterfaceC2140v, x0.S
    public void h(long j7) {
    }
}
