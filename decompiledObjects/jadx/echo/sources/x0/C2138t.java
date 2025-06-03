package x0;

import d0.AbstractC1170I;
import d0.C1178a;
import d0.C1198u;
import x0.InterfaceC2142x;

/* renamed from: x0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138t extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20829m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1170I.c f20830n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1170I.b f20831o;

    /* renamed from: p, reason: collision with root package name */
    public a f20832p;

    /* renamed from: q, reason: collision with root package name */
    public C2137s f20833q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20834r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20835s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20836t;

    /* renamed from: x0.t$a */
    public static final class a extends AbstractC2135p {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f20837h = new Object();

        /* renamed from: f, reason: collision with root package name */
        public final Object f20838f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f20839g;

        public a(AbstractC1170I abstractC1170I, Object obj, Object obj2) {
            super(abstractC1170I);
            this.f20838f = obj;
            this.f20839g = obj2;
        }

        public static a u(C1198u c1198u) {
            return new a(new b(c1198u), AbstractC1170I.c.f12410q, f20837h);
        }

        public static a v(AbstractC1170I abstractC1170I, Object obj, Object obj2) {
            return new a(abstractC1170I, obj, obj2);
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public int b(Object obj) {
            Object obj2;
            AbstractC1170I abstractC1170I = this.f20808e;
            if (f20837h.equals(obj) && (obj2 = this.f20839g) != null) {
                obj = obj2;
            }
            return abstractC1170I.b(obj);
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
            this.f20808e.g(i7, bVar, z7);
            if (g0.M.c(bVar.f12398b, this.f20839g) && z7) {
                bVar.f12398b = f20837h;
            }
            return bVar;
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public Object m(int i7) {
            Object m7 = this.f20808e.m(i7);
            return g0.M.c(m7, this.f20839g) ? f20837h : m7;
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
            this.f20808e.o(i7, cVar, j7);
            if (g0.M.c(cVar.f12420a, this.f20838f)) {
                cVar.f12420a = AbstractC1170I.c.f12410q;
            }
            return cVar;
        }

        public a t(AbstractC1170I abstractC1170I) {
            return new a(abstractC1170I, this.f20838f, this.f20839g);
        }
    }

    /* renamed from: x0.t$b */
    public static final class b extends AbstractC1170I {

        /* renamed from: e, reason: collision with root package name */
        public final C1198u f20840e;

        public b(C1198u c1198u) {
            this.f20840e = c1198u;
        }

        @Override // d0.AbstractC1170I
        public int b(Object obj) {
            return obj == a.f20837h ? 0 : -1;
        }

        @Override // d0.AbstractC1170I
        public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
            bVar.t(z7 ? 0 : null, z7 ? a.f20837h : null, 0, -9223372036854775807L, 0L, C1178a.f12564g, true);
            return bVar;
        }

        @Override // d0.AbstractC1170I
        public int i() {
            return 1;
        }

        @Override // d0.AbstractC1170I
        public Object m(int i7) {
            return a.f20837h;
        }

        @Override // d0.AbstractC1170I
        public AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
            cVar.g(AbstractC1170I.c.f12410q, this.f20840e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f12430k = true;
            return cVar;
        }

        @Override // d0.AbstractC1170I
        public int p() {
            return 1;
        }
    }

    public C2138t(InterfaceC2142x interfaceC2142x, boolean z7) {
        super(interfaceC2142x);
        this.f20829m = z7 && interfaceC2142x.i();
        this.f20830n = new AbstractC1170I.c();
        this.f20831o = new AbstractC1170I.b();
        AbstractC1170I j7 = interfaceC2142x.j();
        if (j7 == null) {
            this.f20832p = a.u(interfaceC2142x.a());
        } else {
            this.f20832p = a.v(j7, null, null);
            this.f20836t = true;
        }
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public void B() {
        this.f20835s = false;
        this.f20834r = false;
        super.B();
    }

    @Override // x0.b0
    public InterfaceC2142x.b N(InterfaceC2142x.b bVar) {
        return bVar.a(X(bVar.f20848a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    @Override // x0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S(d0.AbstractC1170I r15) {
        /*
            r14 = this;
            boolean r0 = r14.f20835s
            if (r0 == 0) goto L19
            x0.t$a r0 = r14.f20832p
            x0.t$a r15 = r0.t(r15)
            r14.f20832p = r15
            x0.s r15 = r14.f20833q
            if (r15 == 0) goto Lb1
            long r0 = r15.j()
            r14.a0(r0)
            goto Lb1
        L19:
            boolean r0 = r15.q()
            if (r0 == 0) goto L36
            boolean r0 = r14.f20836t
            if (r0 == 0) goto L2a
            x0.t$a r0 = r14.f20832p
            x0.t$a r15 = r0.t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = d0.AbstractC1170I.c.f12410q
            java.lang.Object r1 = x0.C2138t.a.f20837h
            x0.t$a r15 = x0.C2138t.a.v(r15, r0, r1)
        L32:
            r14.f20832p = r15
            goto Lb1
        L36:
            d0.I$c r0 = r14.f20830n
            r1 = 0
            r15.n(r1, r0)
            d0.I$c r0 = r14.f20830n
            long r2 = r0.c()
            d0.I$c r0 = r14.f20830n
            java.lang.Object r0 = r0.f12420a
            x0.s r4 = r14.f20833q
            if (r4 == 0) goto L74
            long r4 = r4.r()
            x0.t$a r6 = r14.f20832p
            x0.s r7 = r14.f20833q
            x0.x$b r7 = r7.f20822o
            java.lang.Object r7 = r7.f20848a
            d0.I$b r8 = r14.f20831o
            r6.h(r7, r8)
            d0.I$b r6 = r14.f20831o
            long r6 = r6.n()
            long r6 = r6 + r4
            x0.t$a r4 = r14.f20832p
            d0.I$c r5 = r14.f20830n
            d0.I$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            d0.I$c r9 = r14.f20830n
            d0.I$b r10 = r14.f20831o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.j(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f20836t
            if (r1 == 0) goto L94
            x0.t$a r0 = r14.f20832p
            x0.t$a r15 = r0.t(r15)
            goto L98
        L94:
            x0.t$a r15 = x0.C2138t.a.v(r15, r0, r2)
        L98:
            r14.f20832p = r15
            x0.s r15 = r14.f20833q
            if (r15 == 0) goto Lb1
            boolean r0 = r14.a0(r3)
            if (r0 == 0) goto Lb1
            x0.x$b r15 = r15.f20822o
            java.lang.Object r0 = r15.f20848a
            java.lang.Object r0 = r14.Y(r0)
            x0.x$b r15 = r15.a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.f20836t = r0
            r14.f20835s = r0
            x0.t$a r0 = r14.f20832p
            r14.A(r0)
            if (r15 == 0) goto Lc9
            x0.s r0 = r14.f20833q
            java.lang.Object r0 = g0.AbstractC1297a.e(r0)
            x0.s r0 = (x0.C2137s) r0
            r0.a(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C2138t.S(d0.I):void");
    }

    @Override // x0.b0
    public void V() {
        if (this.f20829m) {
            return;
        }
        this.f20834r = true;
        U();
    }

    @Override // x0.InterfaceC2142x
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public C2137s f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        C2137s c2137s = new C2137s(bVar, bVar2, j7);
        c2137s.y(this.f20715k);
        if (this.f20835s) {
            c2137s.a(bVar.a(Y(bVar.f20848a)));
        } else {
            this.f20833q = c2137s;
            if (!this.f20834r) {
                this.f20834r = true;
                U();
            }
        }
        return c2137s;
    }

    public final Object X(Object obj) {
        return (this.f20832p.f20839g == null || !this.f20832p.f20839g.equals(obj)) ? obj : a.f20837h;
    }

    public final Object Y(Object obj) {
        return (this.f20832p.f20839g == null || !obj.equals(a.f20837h)) ? obj : this.f20832p.f20839g;
    }

    public AbstractC1170I Z() {
        return this.f20832p;
    }

    public final boolean a0(long j7) {
        C2137s c2137s = this.f20833q;
        int b7 = this.f20832p.b(c2137s.f20822o.f20848a);
        if (b7 == -1) {
            return false;
        }
        long j8 = this.f20832p.f(b7, this.f20831o).f12400d;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        c2137s.w(j7);
        return true;
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
        ((C2137s) interfaceC2140v).x();
        if (interfaceC2140v == this.f20833q) {
            this.f20833q = null;
        }
    }

    @Override // x0.b0, x0.AbstractC2120a, x0.InterfaceC2142x
    public void l(C1198u c1198u) {
        this.f20832p = this.f20836t ? this.f20832p.t(new X(this.f20832p.f20808e, c1198u)) : a.u(c1198u);
        this.f20715k.l(c1198u);
    }

    @Override // x0.AbstractC2127h, x0.InterfaceC2142x
    public void h() {
    }
}
