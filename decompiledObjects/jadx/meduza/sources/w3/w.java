package w3;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import o7.l0;
import o7.m0;
import o7.t;
import o7.u;
import v3.c0;
import v3.e1;
import v3.f1;
import v3.i0;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.s1;
import v5.e0;
import v5.l;
import w3.b;
import z4.t;

/* loaded from: classes.dex */
public final class w implements w3.a {

    /* renamed from: a, reason: collision with root package name */
    public final v5.c f16228a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.b f16229b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.c f16230c;

    /* renamed from: d, reason: collision with root package name */
    public final a f16231d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<b.a> f16232e;
    public v5.l<b> f;

    /* renamed from: o, reason: collision with root package name */
    public f1 f16233o;

    /* renamed from: p, reason: collision with root package name */
    public v5.k f16234p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16235q;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r1.b f16236a;

        /* renamed from: b, reason: collision with root package name */
        public o7.t<t.b> f16237b;

        /* renamed from: c, reason: collision with root package name */
        public m0 f16238c;

        /* renamed from: d, reason: collision with root package name */
        public t.b f16239d;

        /* renamed from: e, reason: collision with root package name */
        public t.b f16240e;
        public t.b f;

        public a(r1.b bVar) {
            this.f16236a = bVar;
            t.b bVar2 = o7.t.f12050b;
            this.f16237b = l0.f12009e;
            this.f16238c = m0.f12013o;
        }

        public static t.b b(f1 f1Var, o7.t<t.b> tVar, t.b bVar, r1.b bVar2) {
            r1 J = f1Var.J();
            int p10 = f1Var.p();
            Object l10 = J.p() ? null : J.l(p10);
            int b10 = (f1Var.g() || J.p()) ? -1 : J.f(p10, bVar2, false).b(e0.I(f1Var.P()) - bVar2.f15752e);
            for (int i10 = 0; i10 < tVar.size(); i10++) {
                t.b bVar3 = tVar.get(i10);
                if (c(bVar3, l10, f1Var.g(), f1Var.E(), f1Var.r(), b10)) {
                    return bVar3;
                }
            }
            if (tVar.isEmpty() && bVar != null) {
                if (c(bVar, l10, f1Var.g(), f1Var.E(), f1Var.r(), b10)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean c(t.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f17725a.equals(obj)) {
                return (z10 && bVar.f17726b == i10 && bVar.f17727c == i11) || (!z10 && bVar.f17726b == -1 && bVar.f17729e == i12);
            }
            return false;
        }

        public final void a(u.a<t.b, r1> aVar, t.b bVar, r1 r1Var) {
            if (bVar == null) {
                return;
            }
            if (r1Var.b(bVar.f17725a) == -1 && (r1Var = (r1) this.f16238c.get(bVar)) == null) {
                return;
            }
            aVar.b(bVar, r1Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
        
            a(r0, r3.f16239d, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        
            if (r3.f16237b.contains(r3.f16239d) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        
            if (x6.b.Q(r3.f16239d, r3.f) == false) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(v3.r1 r4) {
            /*
                r3 = this;
                o7.u$a r0 = new o7.u$a
                r1 = 4
                r0.<init>(r1)
                o7.t<z4.t$b> r1 = r3.f16237b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L37
                z4.t$b r1 = r3.f16240e
                r3.a(r0, r1, r4)
                z4.t$b r1 = r3.f
                z4.t$b r2 = r3.f16240e
                boolean r1 = x6.b.Q(r1, r2)
                if (r1 != 0) goto L22
                z4.t$b r1 = r3.f
                r3.a(r0, r1, r4)
            L22:
                z4.t$b r1 = r3.f16239d
                z4.t$b r2 = r3.f16240e
                boolean r1 = x6.b.Q(r1, r2)
                if (r1 != 0) goto L5d
                z4.t$b r1 = r3.f16239d
                z4.t$b r2 = r3.f
                boolean r1 = x6.b.Q(r1, r2)
                if (r1 != 0) goto L5d
                goto L58
            L37:
                r1 = 0
            L38:
                o7.t<z4.t$b> r2 = r3.f16237b
                int r2 = r2.size()
                if (r1 >= r2) goto L4e
                o7.t<z4.t$b> r2 = r3.f16237b
                java.lang.Object r2 = r2.get(r1)
                z4.t$b r2 = (z4.t.b) r2
                r3.a(r0, r2, r4)
                int r1 = r1 + 1
                goto L38
            L4e:
                o7.t<z4.t$b> r1 = r3.f16237b
                z4.t$b r2 = r3.f16239d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5d
            L58:
                z4.t$b r1 = r3.f16239d
                r3.a(r0, r1, r4)
            L5d:
                o7.m0 r4 = r0.a()
                r3.f16238c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w3.w.a.d(v3.r1):void");
        }
    }

    public w(v5.c cVar) {
        cVar.getClass();
        this.f16228a = cVar;
        int i10 = e0.f15881a;
        Looper myLooper = Looper.myLooper();
        this.f = new v5.l<>(myLooper == null ? Looper.getMainLooper() : myLooper, cVar, new e0.e(10));
        r1.b bVar = new r1.b();
        this.f16229b = bVar;
        this.f16230c = new r1.c();
        this.f16231d = new a(bVar);
        this.f16232e = new SparseArray<>();
    }

    @Override // w3.a
    public final void A(z3.e eVar) {
        b.a s02 = s0(this.f16231d.f16240e);
        v0(s02, 1013, new f(1, s02, eVar));
    }

    @Override // a4.g
    public final /* synthetic */ void B() {
    }

    @Override // w3.a
    public final void C(long j10, long j11, String str) {
        b.a u02 = u0();
        v0(u02, 1008, new a0.j(u02, str, j11, j10));
    }

    @Override // v3.f1.c
    public final void D(boolean z10) {
    }

    @Override // a4.g
    public final void E(int i10, t.b bVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1025, new c(t02, 1));
    }

    @Override // v3.f1.c
    public final void F(f1.a aVar) {
        b.a q02 = q0();
        v0(q02, 13, new k1.a(6, q02, aVar));
    }

    @Override // v3.f1.c
    public final void G(final int i10, final f1.d dVar, final f1.d dVar2) {
        if (i10 == 1) {
            this.f16235q = false;
        }
        a aVar = this.f16231d;
        f1 f1Var = this.f16233o;
        f1Var.getClass();
        aVar.f16239d = a.b(f1Var, aVar.f16237b, aVar.f16240e, aVar.f16236a);
        final b.a q02 = q0();
        v0(q02, 11, new l.a(i10, dVar, dVar2, q02) { // from class: w3.l

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f16217a;

            @Override // v5.l.a
            public final void invoke(Object obj) {
                int i11 = this.f16217a;
                b bVar = (b) obj;
                bVar.q0();
                bVar.d(i11);
            }
        });
    }

    @Override // a4.g
    public final void H(int i10, t.b bVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1027, new c(t02, 0));
    }

    @Override // v3.f1.c
    public final void I(final boolean z10) {
        final b.a q02 = q0();
        v0(q02, 3, new l.a(q02, z10) { // from class: w3.j
            @Override // v5.l.a
            public final void invoke(Object obj) {
                b bVar = (b) obj;
                bVar.d0();
                bVar.o0();
            }
        });
    }

    @Override // w3.a
    public final void J(l0 l0Var, t.b bVar) {
        a aVar = this.f16231d;
        f1 f1Var = this.f16233o;
        f1Var.getClass();
        aVar.getClass();
        aVar.f16237b = o7.t.p(l0Var);
        if (!l0Var.isEmpty()) {
            aVar.f16240e = (t.b) l0Var.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.f16239d == null) {
            aVar.f16239d = a.b(f1Var, aVar.f16237b, aVar.f16240e, aVar.f16236a);
        }
        aVar.d(f1Var.J());
    }

    @Override // v3.f1.c
    public final void K(final int i10, final boolean z10) {
        final b.a q02 = q0();
        v0(q02, 5, new l.a(i10, q02, z10) { // from class: w3.h
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).e();
            }
        });
    }

    @Override // v3.f1.c
    public final void L(float f) {
        b.a u02 = u0();
        v0(u02, 22, new defpackage.f(u02, f));
    }

    @Override // z4.w
    public final void M(int i10, t.b bVar, z4.n nVar, z4.q qVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1002, new d9.p(t02, nVar, qVar, 0));
    }

    @Override // v3.f1.c
    public final void N(int i10) {
        b.a q02 = q0();
        v0(q02, 4, new p(q02, i10, 0));
    }

    @Override // a4.g
    public final void O(int i10, t.b bVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1026, new aa.m0(t02, 4));
    }

    @Override // a4.g
    public final void P(int i10, t.b bVar, Exception exc) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1024, new e0.e(t02, exc, 1));
    }

    @Override // t5.e.a
    public final void Q(final int i10, final long j10, final long j11) {
        a aVar = this.f16231d;
        final b.a s02 = s0(aVar.f16237b.isEmpty() ? null : (t.b) p2.m0.K(aVar.f16237b));
        v0(s02, 1006, new l.a(i10, j10, j11) { // from class: w3.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f16220b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f16221c;

            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).P(b.a.this, this.f16220b, this.f16221c);
            }
        });
    }

    @Override // v3.f1.c
    public final void R(p0 p0Var) {
        b.a q02 = q0();
        v0(q02, 14, new k1.a(4, q02, p0Var));
    }

    @Override // w3.a
    public final void S() {
        if (this.f16235q) {
            return;
        }
        b.a q02 = q0();
        this.f16235q = true;
        v0(q02, -1, new r(q02, 0));
    }

    @Override // v3.f1.c
    public final void T(boolean z10) {
        b.a q02 = q0();
        v0(q02, 9, new t(q02, z10));
    }

    @Override // a4.g
    public final void U(int i10, t.b bVar, int i11) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1022, new c0(t02, i11, 1));
    }

    @Override // z4.w
    public final void V(int i10, t.b bVar, z4.q qVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1004, new q3.h(5, t02, qVar));
    }

    @Override // v3.f1.c
    public final void W(final int i10, final boolean z10) {
        final b.a q02 = q0();
        v0(q02, 30, new l.a(i10, q02, z10) { // from class: w3.u
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).b0();
            }
        });
    }

    @Override // v3.f1.c
    public final void X(v3.n nVar) {
        z4.s sVar;
        b.a q02 = (!(nVar instanceof v3.n) || (sVar = nVar.f15523p) == null) ? q0() : s0(new t.b(sVar));
        v0(q02, 10, new r3.l(1, q02, nVar));
    }

    @Override // v3.f1.c
    public final void Y(r1 r1Var, int i10) {
        a aVar = this.f16231d;
        f1 f1Var = this.f16233o;
        f1Var.getClass();
        aVar.f16239d = a.b(f1Var, aVar.f16237b, aVar.f16240e, aVar.f16236a);
        aVar.d(f1Var.J());
        b.a q02 = q0();
        v0(q02, 0, new v3.y(q02, i10, 1));
    }

    @Override // v3.f1.c
    public final void Z(s1 s1Var) {
        b.a q02 = q0();
        v0(q02, 2, new q3.h(4, q02, s1Var));
    }

    @Override // w3.a
    public final void a(z3.e eVar) {
        b.a s02 = s0(this.f16231d.f16240e);
        v0(s02, 1020, new f(0, s02, eVar));
    }

    @Override // v3.f1.c
    public final void a0(v3.n nVar) {
        z4.s sVar;
        b.a q02 = (!(nVar instanceof v3.n) || (sVar = nVar.f15523p) == null) ? q0() : s0(new t.b(sVar));
        v0(q02, 10, new q3.h(2, q02, nVar));
    }

    @Override // v3.f1.c
    public final void b(w5.o oVar) {
        b.a u02 = u0();
        v0(u02, 25, new o9.l(4, u02, oVar));
    }

    @Override // v3.f1.c
    public final void b0(final int i10, final boolean z10) {
        final b.a q02 = q0();
        v0(q02, -1, new l.a(i10, q02, z10) { // from class: w3.e
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).o();
            }
        });
    }

    @Override // w3.a
    public final void c(String str) {
        b.a u02 = u0();
        v0(u02, 1019, new o9.l(2, u02, str));
    }

    @Override // v3.f1.c
    public final void c0(e1 e1Var) {
        b.a q02 = q0();
        v0(q02, 12, new q3.h(7, q02, e1Var));
    }

    @Override // v3.f1.c
    public final void d(int i10) {
    }

    @Override // v3.f1.c
    public final void d0(x3.d dVar) {
        b.a u02 = u0();
        v0(u02, 20, new r3.l(3, u02, dVar));
    }

    @Override // w3.a
    public final void e(int i10, long j10) {
        b.a s02 = s0(this.f16231d.f16240e);
        v0(s02, 1021, new q(s02, j10, i10));
    }

    @Override // v3.f1.c
    public final void e0(f1 f1Var, f1.b bVar) {
    }

    @Override // v3.f1.c
    public final void f() {
        b.a q02 = q0();
        v0(q02, -1, new r(q02, 1));
    }

    @Override // z4.w
    public final void f0(int i10, t.b bVar, final z4.n nVar, final z4.q qVar, final IOException iOException, final boolean z10) {
        final b.a t02 = t0(i10, bVar);
        v0(t02, 1003, new l.a(t02, nVar, qVar, iOException, z10) { // from class: w3.i

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z4.q f16213a;

            {
                this.f16213a = qVar;
            }

            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).g0(this.f16213a);
            }
        });
    }

    @Override // w3.a
    public final void g(z3.e eVar) {
        b.a u02 = u0();
        v0(u02, 1007, new o9.l(3, u02, eVar));
    }

    @Override // w3.a
    public final void g0(y yVar) {
        this.f.a(yVar);
    }

    @Override // w3.a
    public final void h(i0 i0Var, z3.i iVar) {
        b.a u02 = u0();
        v0(u02, 1017, new d9.q(u02, i0Var, iVar, 1));
    }

    @Override // z4.w
    public final void h0(int i10, t.b bVar, final z4.n nVar, final z4.q qVar) {
        final b.a t02 = t0(i10, bVar);
        v0(t02, 1000, new l.a() { // from class: w3.k
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).p0();
            }
        });
    }

    @Override // w3.a
    public final void i(String str) {
        b.a u02 = u0();
        v0(u02, 1012, new k1.a(5, u02, str));
    }

    @Override // w3.a
    public final void i0(f1 f1Var, Looper looper) {
        x6.b.H(this.f16233o == null || this.f16231d.f16237b.isEmpty());
        f1Var.getClass();
        this.f16233o = f1Var;
        this.f16234p = this.f16228a.b(looper, null);
        v5.l<b> lVar = this.f;
        this.f = new v5.l<>(lVar.f15916d, looper, lVar.f15913a, new q3.h(3, this, f1Var));
    }

    @Override // v3.f1.c
    public final void j(h5.c cVar) {
        b.a q02 = q0();
        v0(q02, 27, new q3.h(6, q02, cVar));
    }

    @Override // a4.g
    public final void j0(int i10, t.b bVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1023, new io.flutter.plugins.firebase.auth.g(t02, 9));
    }

    @Override // w3.a
    public final void k(int i10, long j10) {
        b.a s02 = s0(this.f16231d.f16240e);
        v0(s02, 1018, new q(s02, i10, j10));
    }

    @Override // v3.f1.c
    public final void k0(o0 o0Var, int i10) {
        b.a q02 = q0();
        v0(q02, 1, new defpackage.g(q02, o0Var, i10));
    }

    @Override // w3.a
    public final void l(final Object obj, final long j10) {
        final b.a u02 = u0();
        v0(u02, 26, new l.a(u02, obj, j10) { // from class: w3.n

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f16218a;

            {
                this.f16218a = obj;
            }

            @Override // v5.l.a
            public final void invoke(Object obj2) {
                ((b) obj2).m();
            }
        });
    }

    @Override // v3.f1.c
    public final void l0(v3.m mVar) {
        b.a q02 = q0();
        v0(q02, 29, new k1.a(3, q02, mVar));
    }

    @Override // v3.f1.c
    public final void m() {
    }

    @Override // v3.f1.c
    public final void m0(final int i10, final int i11) {
        final b.a u02 = u0();
        v0(u02, 24, new l.a(u02, i10, i11) { // from class: w3.g
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).H();
            }
        });
    }

    @Override // w3.a
    public final void n(z3.e eVar) {
        b.a u02 = u0();
        v0(u02, 1015, new r3.l(2, u02, eVar));
    }

    @Override // z4.w
    public final void n0(int i10, t.b bVar, z4.n nVar, z4.q qVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1001, new d9.p(t02, nVar, qVar, 1));
    }

    @Override // v3.f1.c
    public final void o(boolean z10) {
        b.a u02 = u0();
        v0(u02, 23, new v(0, u02, z10));
    }

    @Override // z4.w
    public final void o0(int i10, t.b bVar, z4.q qVar) {
        b.a t02 = t0(i10, bVar);
        v0(t02, 1005, new r3.l(4, t02, qVar));
    }

    @Override // w3.a
    public final void p(Exception exc) {
        b.a u02 = u0();
        v0(u02, 1014, new e0.d(u02, exc, 0));
    }

    @Override // v3.f1.c
    public final void p0(boolean z10) {
        b.a q02 = q0();
        v0(q02, 7, new v(1, q02, z10));
    }

    @Override // v3.f1.c
    public final void q(int i10) {
        b.a q02 = q0();
        v0(q02, 8, new p(q02, i10, 1));
    }

    public final b.a q0() {
        return s0(this.f16231d.f16239d);
    }

    @Override // v3.f1.c
    public final void r(List<h5.a> list) {
        b.a q02 = q0();
        v0(q02, 27, new k1.a(7, q02, list));
    }

    public final b.a r0(r1 r1Var, int i10, t.b bVar) {
        long y10;
        t.b bVar2 = r1Var.p() ? null : bVar;
        long d10 = this.f16228a.d();
        boolean z10 = r1Var.equals(this.f16233o.J()) && i10 == this.f16233o.F();
        long j10 = 0;
        if (bVar2 != null && bVar2.a()) {
            if (z10 && this.f16233o.E() == bVar2.f17726b && this.f16233o.r() == bVar2.f17727c) {
                j10 = this.f16233o.P();
            }
        } else {
            if (z10) {
                y10 = this.f16233o.y();
                return new b.a(d10, r1Var, i10, bVar2, y10, this.f16233o.J(), this.f16233o.F(), this.f16231d.f16239d, this.f16233o.P(), this.f16233o.i());
            }
            if (!r1Var.p()) {
                j10 = e0.R(r1Var.m(i10, this.f16230c).f15765u);
            }
        }
        y10 = j10;
        return new b.a(d10, r1Var, i10, bVar2, y10, this.f16233o.J(), this.f16233o.F(), this.f16231d.f16239d, this.f16233o.P(), this.f16233o.i());
    }

    @Override // w3.a
    public final void release() {
        v5.k kVar = this.f16234p;
        x6.b.K(kVar);
        kVar.e(new u.a(this, 8));
    }

    @Override // w3.a
    public final void s(long j10) {
        b.a u02 = u0();
        v0(u02, 1010, new v3.q(u02, j10));
    }

    public final b.a s0(t.b bVar) {
        this.f16233o.getClass();
        r1 r1Var = bVar == null ? null : (r1) this.f16231d.f16238c.get(bVar);
        if (bVar != null && r1Var != null) {
            return r0(r1Var, r1Var.g(bVar.f17725a, this.f16229b).f15750c, bVar);
        }
        int F = this.f16233o.F();
        r1 J = this.f16233o.J();
        if (!(F < J.o())) {
            J = r1.f15743a;
        }
        return r0(J, F, null);
    }

    @Override // w3.a
    public final void t(Exception exc) {
        b.a u02 = u0();
        v0(u02, 1029, new e0.d(u02, exc, 1));
    }

    public final b.a t0(int i10, t.b bVar) {
        this.f16233o.getClass();
        if (bVar != null) {
            return ((r1) this.f16231d.f16238c.get(bVar)) != null ? s0(bVar) : r0(r1.f15743a, i10, bVar);
        }
        r1 J = this.f16233o.J();
        if (!(i10 < J.o())) {
            J = r1.f15743a;
        }
        return r0(J, i10, null);
    }

    @Override // w3.a
    public final void u(i0 i0Var, z3.i iVar) {
        b.a u02 = u0();
        v0(u02, 1009, new d9.q(u02, i0Var, iVar, 0));
    }

    public final b.a u0() {
        return s0(this.f16231d.f);
    }

    @Override // w3.a
    public final void v(Exception exc) {
        b.a u02 = u0();
        v0(u02, 1030, new e0.e(u02, exc, 0));
    }

    public final void v0(b.a aVar, int i10, l.a<b> aVar2) {
        this.f16232e.put(i10, aVar);
        this.f.e(i10, aVar2);
    }

    @Override // v3.f1.c
    public final void w(p4.a aVar) {
        b.a q02 = q0();
        v0(q02, 28, new q3.h(1, q02, aVar));
    }

    @Override // v3.f1.c
    public final void x(final int i10) {
        final b.a q02 = q0();
        v0(q02, 6, new l.a(q02, i10) { // from class: w3.d
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).C0();
            }
        });
    }

    @Override // w3.a
    public final void y(final long j10, final long j11, final String str) {
        final b.a u02 = u0();
        v0(u02, 1016, new l.a(u02, str, j11, j10) { // from class: w3.s
            @Override // v5.l.a
            public final void invoke(Object obj) {
                b bVar = (b) obj;
                bVar.T();
                bVar.f0();
                bVar.r0();
            }
        });
    }

    @Override // w3.a
    public final void z(final int i10, final long j10, final long j11) {
        final b.a u02 = u0();
        v0(u02, 1011, new l.a(u02, i10, j10, j11) { // from class: w3.m
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((b) obj).W();
            }
        });
    }
}
