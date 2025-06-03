package l0;

import X2.AbstractC0703v;
import X2.AbstractC0704w;
import android.os.Looper;
import android.util.SparseArray;
import d0.AbstractC1163B;
import d0.AbstractC1170I;
import d0.C1164C;
import d0.C1172K;
import d0.C1173L;
import d0.C1177P;
import d0.C1179b;
import d0.C1189l;
import d0.C1193p;
import d0.C1194q;
import d0.C1198u;
import d0.C1200w;
import d0.C1201x;
import d0.InterfaceC1165D;
import f0.C1281b;
import g0.AbstractC1297a;
import g0.C1310n;
import g0.InterfaceC1299c;
import g0.InterfaceC1307k;
import java.io.IOException;
import java.util.List;
import k0.C1427o;
import k0.C1429p;
import k0.C1438u;
import l0.InterfaceC1537c;
import m0.InterfaceC1659z;
import p0.AbstractC1783o;
import x0.C2139u;
import x0.InterfaceC2142x;

/* renamed from: l0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1569s0 implements InterfaceC1533a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1299c f16646a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1170I.b f16647b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1170I.c f16648c;

    /* renamed from: d, reason: collision with root package name */
    public final a f16649d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f16650e;

    /* renamed from: f, reason: collision with root package name */
    public C1310n f16651f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1165D f16652g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1307k f16653h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16654i;

    /* renamed from: l0.s0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC1170I.b f16655a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC0703v f16656b = AbstractC0703v.Y();

        /* renamed from: c, reason: collision with root package name */
        public AbstractC0704w f16657c = AbstractC0704w.j();

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC2142x.b f16658d;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC2142x.b f16659e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC2142x.b f16660f;

        public a(AbstractC1170I.b bVar) {
            this.f16655a = bVar;
        }

        public static InterfaceC2142x.b c(InterfaceC1165D interfaceC1165D, AbstractC0703v abstractC0703v, InterfaceC2142x.b bVar, AbstractC1170I.b bVar2) {
            AbstractC1170I L6 = interfaceC1165D.L();
            int C7 = interfaceC1165D.C();
            Object m7 = L6.q() ? null : L6.m(C7);
            int d7 = (interfaceC1165D.o() || L6.q()) ? -1 : L6.f(C7, bVar2).d(g0.M.J0(interfaceC1165D.P()) - bVar2.n());
            for (int i7 = 0; i7 < abstractC0703v.size(); i7++) {
                InterfaceC2142x.b bVar3 = (InterfaceC2142x.b) abstractC0703v.get(i7);
                if (i(bVar3, m7, interfaceC1165D.o(), interfaceC1165D.D(), interfaceC1165D.H(), d7)) {
                    return bVar3;
                }
            }
            if (abstractC0703v.isEmpty() && bVar != null) {
                if (i(bVar, m7, interfaceC1165D.o(), interfaceC1165D.D(), interfaceC1165D.H(), d7)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean i(InterfaceC2142x.b bVar, Object obj, boolean z7, int i7, int i8, int i9) {
            if (bVar.f20848a.equals(obj)) {
                return (z7 && bVar.f20849b == i7 && bVar.f20850c == i8) || (!z7 && bVar.f20849b == -1 && bVar.f20852e == i9);
            }
            return false;
        }

        public final void b(AbstractC0704w.a aVar, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I) {
            if (bVar == null) {
                return;
            }
            if (abstractC1170I.b(bVar.f20848a) == -1 && (abstractC1170I = (AbstractC1170I) this.f16657c.get(bVar)) == null) {
                return;
            }
            aVar.f(bVar, abstractC1170I);
        }

        public InterfaceC2142x.b d() {
            return this.f16658d;
        }

        public InterfaceC2142x.b e() {
            if (this.f16656b.isEmpty()) {
                return null;
            }
            return (InterfaceC2142x.b) X2.B.d(this.f16656b);
        }

        public AbstractC1170I f(InterfaceC2142x.b bVar) {
            return (AbstractC1170I) this.f16657c.get(bVar);
        }

        public InterfaceC2142x.b g() {
            return this.f16659e;
        }

        public InterfaceC2142x.b h() {
            return this.f16660f;
        }

        public void j(InterfaceC1165D interfaceC1165D) {
            this.f16658d = c(interfaceC1165D, this.f16656b, this.f16659e, this.f16655a);
        }

        public void k(List list, InterfaceC2142x.b bVar, InterfaceC1165D interfaceC1165D) {
            this.f16656b = AbstractC0703v.U(list);
            if (!list.isEmpty()) {
                this.f16659e = (InterfaceC2142x.b) list.get(0);
                this.f16660f = (InterfaceC2142x.b) AbstractC1297a.e(bVar);
            }
            if (this.f16658d == null) {
                this.f16658d = c(interfaceC1165D, this.f16656b, this.f16659e, this.f16655a);
            }
            m(interfaceC1165D.L());
        }

        public void l(InterfaceC1165D interfaceC1165D) {
            this.f16658d = c(interfaceC1165D, this.f16656b, this.f16659e, this.f16655a);
            m(interfaceC1165D.L());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            b(r0, r3.f16658d, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            if (r3.f16656b.contains(r3.f16658d) == false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            if (W2.k.a(r3.f16658d, r3.f16660f) == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m(d0.AbstractC1170I r4) {
            /*
                r3 = this;
                X2.w$a r0 = X2.AbstractC0704w.a()
                X2.v r1 = r3.f16656b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3a
                x0.x$b r1 = r3.f16659e
                r3.b(r0, r1, r4)
                x0.x$b r1 = r3.f16660f
                x0.x$b r2 = r3.f16659e
                boolean r1 = W2.k.a(r1, r2)
                if (r1 != 0) goto L20
                x0.x$b r1 = r3.f16660f
                r3.b(r0, r1, r4)
            L20:
                x0.x$b r1 = r3.f16658d
                x0.x$b r2 = r3.f16659e
                boolean r1 = W2.k.a(r1, r2)
                if (r1 != 0) goto L5c
                x0.x$b r1 = r3.f16658d
                x0.x$b r2 = r3.f16660f
                boolean r1 = W2.k.a(r1, r2)
                if (r1 != 0) goto L5c
            L34:
                x0.x$b r1 = r3.f16658d
                r3.b(r0, r1, r4)
                goto L5c
            L3a:
                r1 = 0
            L3b:
                X2.v r2 = r3.f16656b
                int r2 = r2.size()
                if (r1 >= r2) goto L51
                X2.v r2 = r3.f16656b
                java.lang.Object r2 = r2.get(r1)
                x0.x$b r2 = (x0.InterfaceC2142x.b) r2
                r3.b(r0, r2, r4)
                int r1 = r1 + 1
                goto L3b
            L51:
                X2.v r1 = r3.f16656b
                x0.x$b r2 = r3.f16658d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5c
                goto L34
            L5c:
                X2.w r4 = r0.c()
                r3.f16657c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.C1569s0.a.m(d0.I):void");
        }
    }

    public C1569s0(InterfaceC1299c interfaceC1299c) {
        this.f16646a = (InterfaceC1299c) AbstractC1297a.e(interfaceC1299c);
        this.f16651f = new C1310n(g0.M.U(), interfaceC1299c, new C1310n.b() { // from class: l0.A
            @Override // g0.C1310n.b
            public final void a(Object obj, C1193p c1193p) {
                C1569s0.O1((InterfaceC1537c) obj, c1193p);
            }
        });
        AbstractC1170I.b bVar = new AbstractC1170I.b();
        this.f16647b = bVar;
        this.f16648c = new AbstractC1170I.c();
        this.f16649d = new a(bVar);
        this.f16650e = new SparseArray();
    }

    public static /* synthetic */ void G2(InterfaceC1537c.a aVar, int i7, InterfaceC1165D.e eVar, InterfaceC1165D.e eVar2, InterfaceC1537c interfaceC1537c) {
        interfaceC1537c.Z(aVar, i7);
        interfaceC1537c.k0(aVar, eVar, eVar2, i7);
    }

    public static /* synthetic */ void R2(InterfaceC1537c.a aVar, String str, long j7, long j8, InterfaceC1537c interfaceC1537c) {
        interfaceC1537c.Q(aVar, str, j7);
        interfaceC1537c.z(aVar, str, j8, j7);
    }

    public static /* synthetic */ void S1(InterfaceC1537c.a aVar, String str, long j7, long j8, InterfaceC1537c interfaceC1537c) {
        interfaceC1537c.u(aVar, str, j7);
        interfaceC1537c.v(aVar, str, j8, j7);
    }

    public static /* synthetic */ void X2(InterfaceC1537c.a aVar, C1177P c1177p, InterfaceC1537c interfaceC1537c) {
        interfaceC1537c.T(aVar, c1177p);
        interfaceC1537c.j0(aVar, c1177p.f12560a, c1177p.f12561b, c1177p.f12562c, c1177p.f12563d);
    }

    public static /* synthetic */ void m2(InterfaceC1537c.a aVar, int i7, InterfaceC1537c interfaceC1537c) {
        interfaceC1537c.b(aVar);
        interfaceC1537c.x(aVar, i7);
    }

    public static /* synthetic */ void q2(InterfaceC1537c.a aVar, boolean z7, InterfaceC1537c interfaceC1537c) {
        interfaceC1537c.i0(aVar, z7);
        interfaceC1537c.t0(aVar, z7);
    }

    @Override // l0.InterfaceC1533a
    public final void A(final C1427o c1427o) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1007, new C1310n.a() { // from class: l0.o0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).B(InterfaceC1537c.a.this, c1427o);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void B(final int i7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 6, new C1310n.a() { // from class: l0.s
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).y(InterfaceC1537c.a.this, i7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void C(final boolean z7, final int i7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, -1, new C1310n.a() { // from class: l0.l
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).G(InterfaceC1537c.a.this, z7, i7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void D(final C1172K c1172k) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 19, new C1310n.a() { // from class: l0.h0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).r(InterfaceC1537c.a.this, c1172k);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void E(final AbstractC1163B abstractC1163B) {
        final InterfaceC1537c.a N12 = N1(abstractC1163B);
        c3(N12, 10, new C1310n.a() { // from class: l0.v
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).C(InterfaceC1537c.a.this, abstractC1163B);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void F(final C1179b c1179b) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 20, new C1310n.a() { // from class: l0.m
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).p(InterfaceC1537c.a.this, c1179b);
            }
        });
    }

    public final InterfaceC1537c.a G1() {
        return I1(this.f16649d.d());
    }

    public final InterfaceC1537c.a H1(AbstractC1170I abstractC1170I, int i7, InterfaceC2142x.b bVar) {
        InterfaceC2142x.b bVar2 = abstractC1170I.q() ? null : bVar;
        long b7 = this.f16646a.b();
        boolean z7 = abstractC1170I.equals(this.f16652g.L()) && i7 == this.f16652g.E();
        long j7 = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z7) {
                j7 = this.f16652g.p();
            } else if (!abstractC1170I.q()) {
                j7 = abstractC1170I.n(i7, this.f16648c).b();
            }
        } else if (z7 && this.f16652g.D() == bVar2.f20849b && this.f16652g.H() == bVar2.f20850c) {
            j7 = this.f16652g.P();
        }
        return new InterfaceC1537c.a(b7, abstractC1170I, i7, bVar2, j7, this.f16652g.L(), this.f16652g.E(), this.f16649d.d(), this.f16652g.P(), this.f16652g.r());
    }

    @Override // d0.InterfaceC1165D.d
    public void I(final C1200w c1200w) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 14, new C1310n.a() { // from class: l0.W
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).q0(InterfaceC1537c.a.this, c1200w);
            }
        });
    }

    public final InterfaceC1537c.a I1(InterfaceC2142x.b bVar) {
        AbstractC1297a.e(this.f16652g);
        AbstractC1170I f7 = bVar == null ? null : this.f16649d.f(bVar);
        if (bVar != null && f7 != null) {
            return H1(f7, f7.h(bVar.f20848a, this.f16647b).f12399c, bVar);
        }
        int E6 = this.f16652g.E();
        AbstractC1170I L6 = this.f16652g.L();
        if (E6 >= L6.p()) {
            L6 = AbstractC1170I.f12388a;
        }
        return H1(L6, E6, null);
    }

    @Override // d0.InterfaceC1165D.d
    public void J(final C1173L c1173l) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 2, new C1310n.a() { // from class: l0.o
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).e0(InterfaceC1537c.a.this, c1173l);
            }
        });
    }

    public final InterfaceC1537c.a J1() {
        return I1(this.f16649d.e());
    }

    @Override // x0.InterfaceC2117E
    public final void K(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1000, new C1310n.a() { // from class: l0.r0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).i(InterfaceC1537c.a.this, rVar, c2139u);
            }
        });
    }

    public final InterfaceC1537c.a K1(int i7, InterfaceC2142x.b bVar) {
        AbstractC1297a.e(this.f16652g);
        if (bVar != null) {
            return this.f16649d.f(bVar) != null ? I1(bVar) : H1(AbstractC1170I.f12388a, i7, bVar);
        }
        AbstractC1170I L6 = this.f16652g.L();
        if (i7 >= L6.p()) {
            L6 = AbstractC1170I.f12388a;
        }
        return H1(L6, i7, null);
    }

    @Override // l0.InterfaceC1533a
    public final void L(List list, InterfaceC2142x.b bVar) {
        this.f16649d.k(list, bVar, (InterfaceC1165D) AbstractC1297a.e(this.f16652g));
    }

    public final InterfaceC1537c.a L1() {
        return I1(this.f16649d.g());
    }

    @Override // p0.v
    public final void M(int i7, InterfaceC2142x.b bVar, final int i8) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1022, new C1310n.a() { // from class: l0.e0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1569s0.m2(InterfaceC1537c.a.this, i8, (InterfaceC1537c) obj);
            }
        });
    }

    public final InterfaceC1537c.a M1() {
        return I1(this.f16649d.h());
    }

    @Override // l0.InterfaceC1533a
    public void N(InterfaceC1537c interfaceC1537c) {
        AbstractC1297a.e(interfaceC1537c);
        this.f16651f.c(interfaceC1537c);
    }

    public final InterfaceC1537c.a N1(AbstractC1163B abstractC1163B) {
        InterfaceC2142x.b bVar;
        return (!(abstractC1163B instanceof C1438u) || (bVar = ((C1438u) abstractC1163B).f16017C) == null) ? G1() : I1(bVar);
    }

    @Override // d0.InterfaceC1165D.d
    public final void O(final C1198u c1198u, final int i7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 1, new C1310n.a() { // from class: l0.g
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).F(InterfaceC1537c.a.this, c1198u, i7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void P(AbstractC1170I abstractC1170I, final int i7) {
        this.f16649d.l((InterfaceC1165D) AbstractC1297a.e(this.f16652g));
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 0, new C1310n.a() { // from class: l0.f
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).E(InterfaceC1537c.a.this, i7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void Q(final boolean z7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 3, new C1310n.a() { // from class: l0.p0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1569s0.q2(InterfaceC1537c.a.this, z7, (InterfaceC1537c) obj);
            }
        });
    }

    @Override // p0.v
    public final void S(int i7, InterfaceC2142x.b bVar) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1023, new C1310n.a() { // from class: l0.n0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).P(InterfaceC1537c.a.this);
            }
        });
    }

    @Override // p0.v
    public final void T(int i7, InterfaceC2142x.b bVar) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1027, new C1310n.a() { // from class: l0.k0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).r0(InterfaceC1537c.a.this);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void U(final float f7) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 22, new C1310n.a() { // from class: l0.i
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).k(InterfaceC1537c.a.this, f7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void V(final C1189l c1189l) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 29, new C1310n.a() { // from class: l0.F
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).R(InterfaceC1537c.a.this, c1189l);
            }
        });
    }

    @Override // x0.InterfaceC2117E
    public final void W(int i7, InterfaceC2142x.b bVar, final C2139u c2139u) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1004, new C1310n.a() { // from class: l0.U
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).K(InterfaceC1537c.a.this, c2139u);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void X(final int i7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 4, new C1310n.a() { // from class: l0.E
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).S(InterfaceC1537c.a.this, i7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void Y(final boolean z7, final int i7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 5, new C1310n.a() { // from class: l0.x
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).H(InterfaceC1537c.a.this, z7, i7);
            }
        });
    }

    @Override // x0.InterfaceC2117E
    public final void Z(int i7, InterfaceC2142x.b bVar, final C2139u c2139u) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1005, new C1310n.a() { // from class: l0.a0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).N(InterfaceC1537c.a.this, c2139u);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public void a(final InterfaceC1659z.a aVar) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1031, new C1310n.a() { // from class: l0.i0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).w(InterfaceC1537c.a.this, aVar);
            }
        });
    }

    @Override // x0.InterfaceC2117E
    public final void a0(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u, final IOException iOException, final boolean z7) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1003, new C1310n.a() { // from class: l0.c0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).m(InterfaceC1537c.a.this, rVar, c2139u, iOException, z7);
            }
        });
    }

    public final /* synthetic */ void a3(InterfaceC1165D interfaceC1165D, InterfaceC1537c interfaceC1537c, C1193p c1193p) {
        interfaceC1537c.O(interfaceC1165D, new InterfaceC1537c.b(c1193p, this.f16650e));
    }

    @Override // d0.InterfaceC1165D.d
    public final void b(final C1177P c1177p) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 25, new C1310n.a() { // from class: l0.Y
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1569s0.X2(InterfaceC1537c.a.this, c1177p, (InterfaceC1537c) obj);
            }
        });
    }

    @Override // p0.v
    public /* synthetic */ void b0(int i7, InterfaceC2142x.b bVar) {
        AbstractC1783o.a(this, i7, bVar);
    }

    public final void b3() {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 1028, new C1310n.a() { // from class: l0.V
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).Y(InterfaceC1537c.a.this);
            }
        });
        this.f16651f.j();
    }

    @Override // d0.InterfaceC1165D.d
    public final void c(final boolean z7) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 23, new C1310n.a() { // from class: l0.h
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).l0(InterfaceC1537c.a.this, z7);
            }
        });
    }

    @Override // B0.e.a
    public final void c0(final int i7, final long j7, final long j8) {
        final InterfaceC1537c.a J12 = J1();
        c3(J12, 1006, new C1310n.a() { // from class: l0.b0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).X(InterfaceC1537c.a.this, i7, j7, j8);
            }
        });
    }

    public final void c3(InterfaceC1537c.a aVar, int i7, C1310n.a aVar2) {
        this.f16650e.put(i7, aVar);
        this.f16651f.k(i7, aVar2);
    }

    @Override // l0.InterfaceC1533a
    public final void d(final Exception exc) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1014, new C1310n.a() { // from class: l0.Q
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).m0(InterfaceC1537c.a.this, exc);
            }
        });
    }

    @Override // p0.v
    public final void d0(int i7, InterfaceC2142x.b bVar, final Exception exc) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1024, new C1310n.a() { // from class: l0.f0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).A(InterfaceC1537c.a.this, exc);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public void e(final InterfaceC1659z.a aVar) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1032, new C1310n.a() { // from class: l0.j0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).g0(InterfaceC1537c.a.this, aVar);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void e0(final AbstractC1163B abstractC1163B) {
        final InterfaceC1537c.a N12 = N1(abstractC1163B);
        c3(N12, 10, new C1310n.a() { // from class: l0.C
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).L(InterfaceC1537c.a.this, abstractC1163B);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void f(final C1427o c1427o) {
        final InterfaceC1537c.a L12 = L1();
        c3(L12, 1013, new C1310n.a() { // from class: l0.D
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).l(InterfaceC1537c.a.this, c1427o);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void f0() {
        if (this.f16654i) {
            return;
        }
        final InterfaceC1537c.a G12 = G1();
        this.f16654i = true;
        c3(G12, -1, new C1310n.a() { // from class: l0.H
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).a0(InterfaceC1537c.a.this);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void g(final String str) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1019, new C1310n.a() { // from class: l0.t
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).D(InterfaceC1537c.a.this, str);
            }
        });
    }

    @Override // p0.v
    public final void g0(int i7, InterfaceC2142x.b bVar) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1026, new C1310n.a() { // from class: l0.l0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).s(InterfaceC1537c.a.this);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void h(final Object obj, final long j7) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 26, new C1310n.a() { // from class: l0.Z
            @Override // g0.C1310n.a
            public final void invoke(Object obj2) {
                ((InterfaceC1537c) obj2).t(InterfaceC1537c.a.this, obj, j7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void h0(final boolean z7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 9, new C1310n.a() { // from class: l0.S
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).j(InterfaceC1537c.a.this, z7);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void i(final String str, final long j7, final long j8) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1016, new C1310n.a() { // from class: l0.P
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1569s0.R2(InterfaceC1537c.a.this, str, j8, j7, (InterfaceC1537c) obj);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void i0(final int i7, final int i8) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 24, new C1310n.a() { // from class: l0.T
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).h(InterfaceC1537c.a.this, i7, i8);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void j(final C1164C c1164c) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 12, new C1310n.a() { // from class: l0.d
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).v0(InterfaceC1537c.a.this, c1164c);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void j0(final InterfaceC1165D.b bVar) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 13, new C1310n.a() { // from class: l0.e
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).M(InterfaceC1537c.a.this, bVar);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void k(final List list) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 27, new C1310n.a() { // from class: l0.y
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).s0(InterfaceC1537c.a.this, list);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void k0(final InterfaceC1165D.e eVar, final InterfaceC1165D.e eVar2, final int i7) {
        if (i7 == 1) {
            this.f16654i = false;
        }
        this.f16649d.j((InterfaceC1165D) AbstractC1297a.e(this.f16652g));
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 11, new C1310n.a() { // from class: l0.J
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1569s0.G2(InterfaceC1537c.a.this, i7, eVar, eVar2, (InterfaceC1537c) obj);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void l(final long j7) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1010, new C1310n.a() { // from class: l0.p
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).c0(InterfaceC1537c.a.this, j7);
            }
        });
    }

    @Override // p0.v
    public final void l0(int i7, InterfaceC2142x.b bVar) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1025, new C1310n.a() { // from class: l0.m0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).n(InterfaceC1537c.a.this);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void m(final int i7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 8, new C1310n.a() { // from class: l0.N
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).n0(InterfaceC1537c.a.this, i7);
            }
        });
    }

    @Override // x0.InterfaceC2117E
    public final void m0(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1001, new C1310n.a() { // from class: l0.g0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).q(InterfaceC1537c.a.this, rVar, c2139u);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void n(final C1427o c1427o) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1015, new C1310n.a() { // from class: l0.L
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).o0(InterfaceC1537c.a.this, c1427o);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void o(final C1427o c1427o) {
        final InterfaceC1537c.a L12 = L1();
        c3(L12, 1020, new C1310n.a() { // from class: l0.z
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).g(InterfaceC1537c.a.this, c1427o);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public void o0(final InterfaceC1165D interfaceC1165D, Looper looper) {
        AbstractC1297a.f(this.f16652g == null || this.f16649d.f16656b.isEmpty());
        this.f16652g = (InterfaceC1165D) AbstractC1297a.e(interfaceC1165D);
        this.f16653h = this.f16646a.e(looper, null);
        this.f16651f = this.f16651f.e(looper, new C1310n.b() { // from class: l0.k
            @Override // g0.C1310n.b
            public final void a(Object obj, C1193p c1193p) {
                C1569s0.this.a3(interfaceC1165D, (InterfaceC1537c) obj, c1193p);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void p(final Exception exc) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1029, new C1310n.a() { // from class: l0.O
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).e(InterfaceC1537c.a.this, exc);
            }
        });
    }

    @Override // x0.InterfaceC2117E
    public final void p0(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u) {
        final InterfaceC1537c.a K12 = K1(i7, bVar);
        c3(K12, 1002, new C1310n.a() { // from class: l0.d0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).J(InterfaceC1537c.a.this, rVar, c2139u);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void q(final Exception exc) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1030, new C1310n.a() { // from class: l0.j
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).d0(InterfaceC1537c.a.this, exc);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void q0(final int i7, final boolean z7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 30, new C1310n.a() { // from class: l0.w
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).c(InterfaceC1537c.a.this, i7, z7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void r(final C1281b c1281b) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 27, new C1310n.a() { // from class: l0.K
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).V(InterfaceC1537c.a.this, c1281b);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void r0(final boolean z7) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 7, new C1310n.a() { // from class: l0.q
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).d(InterfaceC1537c.a.this, z7);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public void release() {
        ((InterfaceC1307k) AbstractC1297a.h(this.f16653h)).j(new Runnable() { // from class: l0.M
            @Override // java.lang.Runnable
            public final void run() {
                C1569s0.this.b3();
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void s(final String str) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1012, new C1310n.a() { // from class: l0.q0
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).I(InterfaceC1537c.a.this, str);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void t(final String str, final long j7, final long j8) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1008, new C1310n.a() { // from class: l0.r
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                C1569s0.S1(InterfaceC1537c.a.this, str, j8, j7, (InterfaceC1537c) obj);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void u(final C1194q c1194q, final C1429p c1429p) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1017, new C1310n.a() { // from class: l0.G
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).W(InterfaceC1537c.a.this, c1194q, c1429p);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void v(final int i7, final long j7, final long j8) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1011, new C1310n.a() { // from class: l0.X
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).u0(InterfaceC1537c.a.this, i7, j7, j8);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void w(final int i7, final long j7) {
        final InterfaceC1537c.a L12 = L1();
        c3(L12, 1018, new C1310n.a() { // from class: l0.u
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).a(InterfaceC1537c.a.this, i7, j7);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public final void x(final C1201x c1201x) {
        final InterfaceC1537c.a G12 = G1();
        c3(G12, 28, new C1310n.a() { // from class: l0.n
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).o(InterfaceC1537c.a.this, c1201x);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void y(final long j7, final int i7) {
        final InterfaceC1537c.a L12 = L1();
        c3(L12, 1021, new C1310n.a() { // from class: l0.B
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).f0(InterfaceC1537c.a.this, j7, i7);
            }
        });
    }

    @Override // l0.InterfaceC1533a
    public final void z(final C1194q c1194q, final C1429p c1429p) {
        final InterfaceC1537c.a M12 = M1();
        c3(M12, 1009, new C1310n.a() { // from class: l0.I
            @Override // g0.C1310n.a
            public final void invoke(Object obj) {
                ((InterfaceC1537c) obj).h0(InterfaceC1537c.a.this, c1194q, c1429p);
            }
        });
    }

    @Override // d0.InterfaceC1165D.d
    public void R() {
    }

    @Override // d0.InterfaceC1165D.d
    public void G(boolean z7) {
    }

    @Override // d0.InterfaceC1165D.d
    public void H(int i7) {
    }

    public static /* synthetic */ void O1(InterfaceC1537c interfaceC1537c, C1193p c1193p) {
    }

    @Override // d0.InterfaceC1165D.d
    public void n0(InterfaceC1165D interfaceC1165D, InterfaceC1165D.c cVar) {
    }
}
