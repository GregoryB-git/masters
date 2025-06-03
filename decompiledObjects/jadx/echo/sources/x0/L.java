package x0;

import F0.InterfaceC0378x;
import android.os.Looper;
import d0.AbstractC1170I;
import d0.C1198u;
import g0.AbstractC1297a;
import i0.g;
import l0.y1;
import p0.C1780l;
import p0.InterfaceC1767A;
import x0.InterfaceC2118F;
import x0.InterfaceC2142x;
import x0.K;
import x0.L;

/* loaded from: classes.dex */
public final class L extends AbstractC2120a implements K.c {

    /* renamed from: h, reason: collision with root package name */
    public final g.a f20598h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2118F.a f20599i;

    /* renamed from: j, reason: collision with root package name */
    public final p0.x f20600j;

    /* renamed from: k, reason: collision with root package name */
    public final B0.m f20601k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20602l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20603m;

    /* renamed from: n, reason: collision with root package name */
    public long f20604n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20605o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20606p;

    /* renamed from: q, reason: collision with root package name */
    public i0.y f20607q;

    /* renamed from: r, reason: collision with root package name */
    public C1198u f20608r;

    public class a extends AbstractC2135p {
        public a(AbstractC1170I abstractC1170I) {
            super(abstractC1170I);
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
            super.g(i7, bVar, z7);
            bVar.f12402f = true;
            return bVar;
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
            super.o(i7, cVar, j7);
            cVar.f12430k = true;
            return cVar;
        }
    }

    public static final class b implements InterfaceC2142x.a {

        /* renamed from: a, reason: collision with root package name */
        public final g.a f20610a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC2118F.a f20611b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC1767A f20612c;

        /* renamed from: d, reason: collision with root package name */
        public B0.m f20613d;

        /* renamed from: e, reason: collision with root package name */
        public int f20614e;

        public b(g.a aVar, final InterfaceC0378x interfaceC0378x) {
            this(aVar, new InterfaceC2118F.a() { // from class: x0.M
                @Override // x0.InterfaceC2118F.a
                public final InterfaceC2118F a(y1 y1Var) {
                    InterfaceC2118F c7;
                    c7 = L.b.c(InterfaceC0378x.this, y1Var);
                    return c7;
                }
            });
        }

        public static /* synthetic */ InterfaceC2118F c(InterfaceC0378x interfaceC0378x, y1 y1Var) {
            return new C2123d(interfaceC0378x);
        }

        public L b(C1198u c1198u) {
            AbstractC1297a.e(c1198u.f12800b);
            return new L(c1198u, this.f20610a, this.f20611b, this.f20612c.a(c1198u), this.f20613d, this.f20614e, null);
        }

        public b(g.a aVar, InterfaceC2118F.a aVar2) {
            this(aVar, aVar2, new C1780l(), new B0.k(), 1048576);
        }

        public b(g.a aVar, InterfaceC2118F.a aVar2, InterfaceC1767A interfaceC1767A, B0.m mVar, int i7) {
            this.f20610a = aVar;
            this.f20611b = aVar2;
            this.f20612c = interfaceC1767A;
            this.f20613d = mVar;
            this.f20614e = i7;
        }
    }

    public L(C1198u c1198u, g.a aVar, InterfaceC2118F.a aVar2, p0.x xVar, B0.m mVar, int i7) {
        this.f20608r = c1198u;
        this.f20598h = aVar;
        this.f20599i = aVar2;
        this.f20600j = xVar;
        this.f20601k = mVar;
        this.f20602l = i7;
        this.f20603m = true;
        this.f20604n = -9223372036854775807L;
    }

    @Override // x0.AbstractC2120a
    public void B() {
        this.f20600j.release();
    }

    public final C1198u.h C() {
        return (C1198u.h) AbstractC1297a.e(a().f12800b);
    }

    public final void D() {
        AbstractC1170I v7 = new V(this.f20604n, this.f20605o, false, this.f20606p, null, a());
        if (this.f20603m) {
            v7 = new a(v7);
        }
        A(v7);
    }

    @Override // x0.InterfaceC2142x
    public synchronized C1198u a() {
        return this.f20608r;
    }

    @Override // x0.InterfaceC2142x
    public void e(InterfaceC2140v interfaceC2140v) {
        ((K) interfaceC2140v).g0();
    }

    @Override // x0.InterfaceC2142x
    public InterfaceC2140v f(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        i0.g a7 = this.f20598h.a();
        i0.y yVar = this.f20607q;
        if (yVar != null) {
            a7.c(yVar);
        }
        C1198u.h C7 = C();
        return new K(C7.f12892a, a7, this.f20599i.a(x()), this.f20600j, s(bVar), this.f20601k, u(bVar), this, bVar2, C7.f12896e, this.f20602l, g0.M.J0(C7.f12900i));
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public synchronized void l(C1198u c1198u) {
        this.f20608r = c1198u;
    }

    @Override // x0.K.c
    public void q(long j7, boolean z7, boolean z8) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f20604n;
        }
        if (!this.f20603m && this.f20604n == j7 && this.f20605o == z7 && this.f20606p == z8) {
            return;
        }
        this.f20604n = j7;
        this.f20605o = z7;
        this.f20606p = z8;
        this.f20603m = false;
        D();
    }

    @Override // x0.AbstractC2120a
    public void z(i0.y yVar) {
        this.f20607q = yVar;
        this.f20600j.a((Looper) AbstractC1297a.e(Looper.myLooper()), x());
        this.f20600j.g();
        D();
    }

    public /* synthetic */ L(C1198u c1198u, g.a aVar, InterfaceC2118F.a aVar2, p0.x xVar, B0.m mVar, int i7, a aVar3) {
        this(c1198u, aVar, aVar2, xVar, mVar, i7);
    }

    @Override // x0.InterfaceC2142x
    public void h() {
    }
}
