package y0;

import B0.n;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.C1441v0;
import k0.C1447y0;
import k0.d1;
import p0.v;
import p0.x;
import x0.InterfaceC2117E;
import x0.P;
import x0.Q;
import x0.S;
import x0.r;

/* renamed from: y0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2229h implements Q, S, n.b, n.f {

    /* renamed from: A, reason: collision with root package name */
    public final P f21263A;

    /* renamed from: B, reason: collision with root package name */
    public final P[] f21264B;

    /* renamed from: C, reason: collision with root package name */
    public final C2224c f21265C;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC2226e f21266D;

    /* renamed from: E, reason: collision with root package name */
    public C1194q f21267E;

    /* renamed from: F, reason: collision with root package name */
    public b f21268F;

    /* renamed from: G, reason: collision with root package name */
    public long f21269G;

    /* renamed from: H, reason: collision with root package name */
    public long f21270H;

    /* renamed from: I, reason: collision with root package name */
    public int f21271I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC2222a f21272J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f21273K;

    /* renamed from: o, reason: collision with root package name */
    public final int f21274o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f21275p;

    /* renamed from: q, reason: collision with root package name */
    public final C1194q[] f21276q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f21277r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2230i f21278s;

    /* renamed from: t, reason: collision with root package name */
    public final S.a f21279t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2117E.a f21280u;

    /* renamed from: v, reason: collision with root package name */
    public final B0.m f21281v;

    /* renamed from: w, reason: collision with root package name */
    public final B0.n f21282w;

    /* renamed from: x, reason: collision with root package name */
    public final C2228g f21283x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f21284y;

    /* renamed from: z, reason: collision with root package name */
    public final List f21285z;

    /* renamed from: y0.h$b */
    public interface b {
        void a(C2229h c2229h);
    }

    public C2229h(int i7, int[] iArr, C1194q[] c1194qArr, InterfaceC2230i interfaceC2230i, S.a aVar, B0.b bVar, long j7, x xVar, v.a aVar2, B0.m mVar, InterfaceC2117E.a aVar3) {
        this.f21274o = i7;
        int i8 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f21275p = iArr;
        this.f21276q = c1194qArr == null ? new C1194q[0] : c1194qArr;
        this.f21278s = interfaceC2230i;
        this.f21279t = aVar;
        this.f21280u = aVar3;
        this.f21281v = mVar;
        this.f21282w = new B0.n("ChunkSampleStream");
        this.f21283x = new C2228g();
        ArrayList arrayList = new ArrayList();
        this.f21284y = arrayList;
        this.f21285z = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f21264B = new P[length];
        this.f21277r = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        P[] pArr = new P[i9];
        P k7 = P.k(bVar, xVar, aVar2);
        this.f21263A = k7;
        iArr2[0] = i7;
        pArr[0] = k7;
        while (i8 < length) {
            P l7 = P.l(bVar);
            this.f21264B[i8] = l7;
            int i10 = i8 + 1;
            pArr[i10] = l7;
            iArr2[i10] = this.f21275p[i8];
            i8 = i10;
        }
        this.f21265C = new C2224c(iArr2, pArr);
        this.f21269G = j7;
        this.f21270H = j7;
    }

    private void C(int i7) {
        AbstractC1297a.f(!this.f21282w.j());
        int size = this.f21284y.size();
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (!G(i7)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j7 = F().f21259h;
        AbstractC2222a D7 = D(i7);
        if (this.f21284y.isEmpty()) {
            this.f21269G = this.f21270H;
        }
        this.f21273K = false;
        this.f21280u.C(this.f21274o, D7.f21258g, j7);
    }

    private boolean H(AbstractC2226e abstractC2226e) {
        return abstractC2226e instanceof AbstractC2222a;
    }

    private void Q() {
        this.f21263A.W();
        for (P p7 : this.f21264B) {
            p7.W();
        }
    }

    public final void B(int i7) {
        int min = Math.min(O(i7, 0), this.f21271I);
        if (min > 0) {
            M.U0(this.f21284y, 0, min);
            this.f21271I -= min;
        }
    }

    public final AbstractC2222a D(int i7) {
        AbstractC2222a abstractC2222a = (AbstractC2222a) this.f21284y.get(i7);
        ArrayList arrayList = this.f21284y;
        M.U0(arrayList, i7, arrayList.size());
        this.f21271I = Math.max(this.f21271I, this.f21284y.size());
        P p7 = this.f21263A;
        int i8 = 0;
        while (true) {
            p7.u(abstractC2222a.i(i8));
            P[] pArr = this.f21264B;
            if (i8 >= pArr.length) {
                return abstractC2222a;
            }
            p7 = pArr[i8];
            i8++;
        }
    }

    public InterfaceC2230i E() {
        return this.f21278s;
    }

    public final AbstractC2222a F() {
        return (AbstractC2222a) this.f21284y.get(r0.size() - 1);
    }

    public final boolean G(int i7) {
        int D7;
        AbstractC2222a abstractC2222a = (AbstractC2222a) this.f21284y.get(i7);
        if (this.f21263A.D() > abstractC2222a.i(0)) {
            return true;
        }
        int i8 = 0;
        do {
            P[] pArr = this.f21264B;
            if (i8 >= pArr.length) {
                return false;
            }
            D7 = pArr[i8].D();
            i8++;
        } while (D7 <= abstractC2222a.i(i8));
        return true;
    }

    public boolean I() {
        return this.f21269G != -9223372036854775807L;
    }

    public final void J() {
        int O6 = O(this.f21263A.D(), this.f21271I - 1);
        while (true) {
            int i7 = this.f21271I;
            if (i7 > O6) {
                return;
            }
            this.f21271I = i7 + 1;
            K(i7);
        }
    }

    public final void K(int i7) {
        AbstractC2222a abstractC2222a = (AbstractC2222a) this.f21284y.get(i7);
        C1194q c1194q = abstractC2222a.f21255d;
        if (!c1194q.equals(this.f21267E)) {
            this.f21280u.h(this.f21274o, c1194q, abstractC2222a.f21256e, abstractC2222a.f21257f, abstractC2222a.f21258g);
        }
        this.f21267E = c1194q;
    }

    @Override // B0.n.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void t(AbstractC2226e abstractC2226e, long j7, long j8, boolean z7) {
        this.f21266D = null;
        this.f21272J = null;
        r rVar = new r(abstractC2226e.f21252a, abstractC2226e.f21253b, abstractC2226e.f(), abstractC2226e.e(), j7, j8, abstractC2226e.a());
        this.f21281v.a(abstractC2226e.f21252a);
        this.f21280u.q(rVar, abstractC2226e.f21254c, this.f21274o, abstractC2226e.f21255d, abstractC2226e.f21256e, abstractC2226e.f21257f, abstractC2226e.f21258g, abstractC2226e.f21259h);
        if (z7) {
            return;
        }
        if (I()) {
            Q();
        } else if (H(abstractC2226e)) {
            D(this.f21284y.size() - 1);
            if (this.f21284y.isEmpty()) {
                this.f21269G = this.f21270H;
            }
        }
        this.f21279t.e(this);
    }

    @Override // B0.n.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void o(AbstractC2226e abstractC2226e, long j7, long j8) {
        this.f21266D = null;
        this.f21278s.g(abstractC2226e);
        r rVar = new r(abstractC2226e.f21252a, abstractC2226e.f21253b, abstractC2226e.f(), abstractC2226e.e(), j7, j8, abstractC2226e.a());
        this.f21281v.a(abstractC2226e.f21252a);
        this.f21280u.t(rVar, abstractC2226e.f21254c, this.f21274o, abstractC2226e.f21255d, abstractC2226e.f21256e, abstractC2226e.f21257f, abstractC2226e.f21258g, abstractC2226e.f21259h);
        this.f21279t.e(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // B0.n.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B0.n.c r(y0.AbstractC2226e r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C2229h.r(y0.e, long, long, java.io.IOException, int):B0.n$c");
    }

    public final int O(int i7, int i8) {
        do {
            i8++;
            if (i8 >= this.f21284y.size()) {
                return this.f21284y.size() - 1;
            }
        } while (((AbstractC2222a) this.f21284y.get(i8)).i(0) <= i7);
        return i8 - 1;
    }

    public void P(b bVar) {
        this.f21268F = bVar;
        this.f21263A.S();
        for (P p7 : this.f21264B) {
            p7.S();
        }
        this.f21282w.m(this);
    }

    public void R(long j7) {
        AbstractC2222a abstractC2222a;
        this.f21270H = j7;
        if (I()) {
            this.f21269G = j7;
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f21284y.size(); i8++) {
            abstractC2222a = (AbstractC2222a) this.f21284y.get(i8);
            long j8 = abstractC2222a.f21258g;
            if (j8 == j7 && abstractC2222a.f21223k == -9223372036854775807L) {
                break;
            } else {
                if (j8 > j7) {
                    break;
                }
            }
        }
        abstractC2222a = null;
        if (abstractC2222a != null ? this.f21263A.Z(abstractC2222a.i(0)) : this.f21263A.a0(j7, j7 < c())) {
            this.f21271I = O(this.f21263A.D(), 0);
            P[] pArr = this.f21264B;
            int length = pArr.length;
            while (i7 < length) {
                pArr[i7].a0(j7, true);
                i7++;
            }
            return;
        }
        this.f21269G = j7;
        this.f21273K = false;
        this.f21284y.clear();
        this.f21271I = 0;
        if (!this.f21282w.j()) {
            this.f21282w.g();
            Q();
            return;
        }
        this.f21263A.r();
        P[] pArr2 = this.f21264B;
        int length2 = pArr2.length;
        while (i7 < length2) {
            pArr2[i7].r();
            i7++;
        }
        this.f21282w.f();
    }

    public a S(long j7, int i7) {
        for (int i8 = 0; i8 < this.f21264B.length; i8++) {
            if (this.f21275p[i8] == i7) {
                AbstractC1297a.f(!this.f21277r[i8]);
                this.f21277r[i8] = true;
                this.f21264B[i8].a0(j7, true);
                return new a(this, this.f21264B[i8], i8);
            }
        }
        throw new IllegalStateException();
    }

    @Override // x0.Q
    public void a() {
        this.f21282w.a();
        this.f21263A.O();
        if (this.f21282w.j()) {
            return;
        }
        this.f21278s.a();
    }

    @Override // x0.S
    public boolean b() {
        return this.f21282w.j();
    }

    @Override // x0.S
    public long c() {
        if (I()) {
            return this.f21269G;
        }
        if (this.f21273K) {
            return Long.MIN_VALUE;
        }
        return F().f21259h;
    }

    public long d(long j7, d1 d1Var) {
        return this.f21278s.d(j7, d1Var);
    }

    @Override // x0.Q
    public boolean e() {
        return !I() && this.f21263A.L(this.f21273K);
    }

    @Override // x0.S
    public long f() {
        if (this.f21273K) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f21269G;
        }
        long j7 = this.f21270H;
        AbstractC2222a F6 = F();
        if (!F6.h()) {
            if (this.f21284y.size() > 1) {
                F6 = (AbstractC2222a) this.f21284y.get(r2.size() - 2);
            } else {
                F6 = null;
            }
        }
        if (F6 != null) {
            j7 = Math.max(j7, F6.f21259h);
        }
        return Math.max(j7, this.f21263A.A());
    }

    @Override // x0.S
    public boolean g(C1447y0 c1447y0) {
        List list;
        long j7;
        if (this.f21273K || this.f21282w.j() || this.f21282w.i()) {
            return false;
        }
        boolean I6 = I();
        if (I6) {
            list = Collections.emptyList();
            j7 = this.f21269G;
        } else {
            list = this.f21285z;
            j7 = F().f21259h;
        }
        this.f21278s.h(c1447y0, j7, list, this.f21283x);
        C2228g c2228g = this.f21283x;
        boolean z7 = c2228g.f21262b;
        AbstractC2226e abstractC2226e = c2228g.f21261a;
        c2228g.a();
        if (z7) {
            this.f21269G = -9223372036854775807L;
            this.f21273K = true;
            return true;
        }
        if (abstractC2226e == null) {
            return false;
        }
        this.f21266D = abstractC2226e;
        if (H(abstractC2226e)) {
            AbstractC2222a abstractC2222a = (AbstractC2222a) abstractC2226e;
            if (I6) {
                long j8 = abstractC2222a.f21258g;
                long j9 = this.f21269G;
                if (j8 != j9) {
                    this.f21263A.c0(j9);
                    for (P p7 : this.f21264B) {
                        p7.c0(this.f21269G);
                    }
                }
                this.f21269G = -9223372036854775807L;
            }
            abstractC2222a.k(this.f21265C);
            this.f21284y.add(abstractC2222a);
        } else if (abstractC2226e instanceof l) {
            ((l) abstractC2226e).g(this.f21265C);
        }
        this.f21280u.z(new r(abstractC2226e.f21252a, abstractC2226e.f21253b, this.f21282w.n(abstractC2226e, this, this.f21281v.d(abstractC2226e.f21254c))), abstractC2226e.f21254c, this.f21274o, abstractC2226e.f21255d, abstractC2226e.f21256e, abstractC2226e.f21257f, abstractC2226e.f21258g, abstractC2226e.f21259h);
        return true;
    }

    @Override // x0.S
    public void h(long j7) {
        if (this.f21282w.i() || I()) {
            return;
        }
        if (!this.f21282w.j()) {
            int f7 = this.f21278s.f(j7, this.f21285z);
            if (f7 < this.f21284y.size()) {
                C(f7);
                return;
            }
            return;
        }
        AbstractC2226e abstractC2226e = (AbstractC2226e) AbstractC1297a.e(this.f21266D);
        if (!(H(abstractC2226e) && G(this.f21284y.size() - 1)) && this.f21278s.b(j7, abstractC2226e, this.f21285z)) {
            this.f21282w.f();
            if (H(abstractC2226e)) {
                this.f21272J = (AbstractC2222a) abstractC2226e;
            }
        }
    }

    @Override // x0.Q
    public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
        if (I()) {
            return -3;
        }
        AbstractC2222a abstractC2222a = this.f21272J;
        if (abstractC2222a != null && abstractC2222a.i(0) <= this.f21263A.D()) {
            return -3;
        }
        J();
        return this.f21263A.T(c1441v0, iVar, i7, this.f21273K);
    }

    @Override // B0.n.f
    public void k() {
        this.f21263A.U();
        for (P p7 : this.f21264B) {
            p7.U();
        }
        this.f21278s.release();
        b bVar = this.f21268F;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // x0.Q
    public int m(long j7) {
        if (I()) {
            return 0;
        }
        int F6 = this.f21263A.F(j7, this.f21273K);
        AbstractC2222a abstractC2222a = this.f21272J;
        if (abstractC2222a != null) {
            F6 = Math.min(F6, abstractC2222a.i(0) - this.f21263A.D());
        }
        this.f21263A.f0(F6);
        J();
        return F6;
    }

    public void q(long j7, boolean z7) {
        if (I()) {
            return;
        }
        int y7 = this.f21263A.y();
        this.f21263A.q(j7, z7, true);
        int y8 = this.f21263A.y();
        if (y8 > y7) {
            long z8 = this.f21263A.z();
            int i7 = 0;
            while (true) {
                P[] pArr = this.f21264B;
                if (i7 >= pArr.length) {
                    break;
                }
                pArr[i7].q(z8, z7, this.f21277r[i7]);
                i7++;
            }
        }
        B(y8);
    }

    /* renamed from: y0.h$a */
    public final class a implements Q {

        /* renamed from: o, reason: collision with root package name */
        public final C2229h f21286o;

        /* renamed from: p, reason: collision with root package name */
        public final P f21287p;

        /* renamed from: q, reason: collision with root package name */
        public final int f21288q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f21289r;

        public a(C2229h c2229h, P p7, int i7) {
            this.f21286o = c2229h;
            this.f21287p = p7;
            this.f21288q = i7;
        }

        public final void b() {
            if (this.f21289r) {
                return;
            }
            C2229h.this.f21280u.h(C2229h.this.f21275p[this.f21288q], C2229h.this.f21276q[this.f21288q], 0, null, C2229h.this.f21270H);
            this.f21289r = true;
        }

        public void c() {
            AbstractC1297a.f(C2229h.this.f21277r[this.f21288q]);
            C2229h.this.f21277r[this.f21288q] = false;
        }

        @Override // x0.Q
        public boolean e() {
            return !C2229h.this.I() && this.f21287p.L(C2229h.this.f21273K);
        }

        @Override // x0.Q
        public int j(C1441v0 c1441v0, j0.i iVar, int i7) {
            if (C2229h.this.I()) {
                return -3;
            }
            if (C2229h.this.f21272J != null && C2229h.this.f21272J.i(this.f21288q + 1) <= this.f21287p.D()) {
                return -3;
            }
            b();
            return this.f21287p.T(c1441v0, iVar, i7, C2229h.this.f21273K);
        }

        @Override // x0.Q
        public int m(long j7) {
            if (C2229h.this.I()) {
                return 0;
            }
            int F6 = this.f21287p.F(j7, C2229h.this.f21273K);
            if (C2229h.this.f21272J != null) {
                F6 = Math.min(F6, C2229h.this.f21272J.i(this.f21288q + 1) - this.f21287p.D());
            }
            this.f21287p.f0(F6);
            if (F6 > 0) {
                b();
            }
            return F6;
        }

        @Override // x0.Q
        public void a() {
        }
    }
}
