package x0;

import android.os.Handler;
import d0.AbstractC1170I;
import g0.AbstractC1297a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p0.AbstractC1783o;
import p0.v;
import x0.InterfaceC2117E;
import x0.InterfaceC2142x;

/* renamed from: x0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2127h extends AbstractC2120a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f20747h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f20748i;

    /* renamed from: j, reason: collision with root package name */
    public i0.y f20749j;

    /* renamed from: x0.h$a */
    public final class a implements InterfaceC2117E, p0.v {

        /* renamed from: a, reason: collision with root package name */
        public final Object f20750a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC2117E.a f20751b;

        /* renamed from: c, reason: collision with root package name */
        public v.a f20752c;

        public a(Object obj) {
            this.f20751b = AbstractC2127h.this.u(null);
            this.f20752c = AbstractC2127h.this.s(null);
            this.f20750a = obj;
        }

        @Override // x0.InterfaceC2117E
        public void K(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u) {
            if (b(i7, bVar)) {
                this.f20751b.A(rVar, c(c2139u, bVar));
            }
        }

        @Override // p0.v
        public void M(int i7, InterfaceC2142x.b bVar, int i8) {
            if (b(i7, bVar)) {
                this.f20752c.k(i8);
            }
        }

        @Override // p0.v
        public void S(int i7, InterfaceC2142x.b bVar) {
            if (b(i7, bVar)) {
                this.f20752c.h();
            }
        }

        @Override // p0.v
        public void T(int i7, InterfaceC2142x.b bVar) {
            if (b(i7, bVar)) {
                this.f20752c.m();
            }
        }

        @Override // x0.InterfaceC2117E
        public void W(int i7, InterfaceC2142x.b bVar, C2139u c2139u) {
            if (b(i7, bVar)) {
                this.f20751b.i(c(c2139u, bVar));
            }
        }

        @Override // x0.InterfaceC2117E
        public void Z(int i7, InterfaceC2142x.b bVar, C2139u c2139u) {
            if (b(i7, bVar)) {
                this.f20751b.D(c(c2139u, bVar));
            }
        }

        @Override // x0.InterfaceC2117E
        public void a0(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u, IOException iOException, boolean z7) {
            if (b(i7, bVar)) {
                this.f20751b.x(rVar, c(c2139u, bVar), iOException, z7);
            }
        }

        public final boolean b(int i7, InterfaceC2142x.b bVar) {
            InterfaceC2142x.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC2127h.this.F(this.f20750a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int H6 = AbstractC2127h.this.H(this.f20750a, i7);
            InterfaceC2117E.a aVar = this.f20751b;
            if (aVar.f20523a != H6 || !g0.M.c(aVar.f20524b, bVar2)) {
                this.f20751b = AbstractC2127h.this.t(H6, bVar2);
            }
            v.a aVar2 = this.f20752c;
            if (aVar2.f18343a == H6 && g0.M.c(aVar2.f18344b, bVar2)) {
                return true;
            }
            this.f20752c = AbstractC2127h.this.r(H6, bVar2);
            return true;
        }

        @Override // p0.v
        public /* synthetic */ void b0(int i7, InterfaceC2142x.b bVar) {
            AbstractC1783o.a(this, i7, bVar);
        }

        public final C2139u c(C2139u c2139u, InterfaceC2142x.b bVar) {
            long G6 = AbstractC2127h.this.G(this.f20750a, c2139u.f20846f, bVar);
            long G7 = AbstractC2127h.this.G(this.f20750a, c2139u.f20847g, bVar);
            return (G6 == c2139u.f20846f && G7 == c2139u.f20847g) ? c2139u : new C2139u(c2139u.f20841a, c2139u.f20842b, c2139u.f20843c, c2139u.f20844d, c2139u.f20845e, G6, G7);
        }

        @Override // p0.v
        public void d0(int i7, InterfaceC2142x.b bVar, Exception exc) {
            if (b(i7, bVar)) {
                this.f20752c.l(exc);
            }
        }

        @Override // p0.v
        public void g0(int i7, InterfaceC2142x.b bVar) {
            if (b(i7, bVar)) {
                this.f20752c.i();
            }
        }

        @Override // p0.v
        public void l0(int i7, InterfaceC2142x.b bVar) {
            if (b(i7, bVar)) {
                this.f20752c.j();
            }
        }

        @Override // x0.InterfaceC2117E
        public void m0(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u) {
            if (b(i7, bVar)) {
                this.f20751b.u(rVar, c(c2139u, bVar));
            }
        }

        @Override // x0.InterfaceC2117E
        public void p0(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u) {
            if (b(i7, bVar)) {
                this.f20751b.r(rVar, c(c2139u, bVar));
            }
        }
    }

    /* renamed from: x0.h$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2142x f20754a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2142x.c f20755b;

        /* renamed from: c, reason: collision with root package name */
        public final a f20756c;

        public b(InterfaceC2142x interfaceC2142x, InterfaceC2142x.c cVar, a aVar) {
            this.f20754a = interfaceC2142x;
            this.f20755b = cVar;
            this.f20756c = aVar;
        }
    }

    @Override // x0.AbstractC2120a
    public void B() {
        for (b bVar : this.f20747h.values()) {
            bVar.f20754a.m(bVar.f20755b);
            bVar.f20754a.c(bVar.f20756c);
            bVar.f20754a.o(bVar.f20756c);
        }
        this.f20747h.clear();
    }

    public final void D(Object obj) {
        b bVar = (b) AbstractC1297a.e((b) this.f20747h.get(obj));
        bVar.f20754a.d(bVar.f20755b);
    }

    public final void E(Object obj) {
        b bVar = (b) AbstractC1297a.e((b) this.f20747h.get(obj));
        bVar.f20754a.n(bVar.f20755b);
    }

    public abstract InterfaceC2142x.b F(Object obj, InterfaceC2142x.b bVar);

    public abstract int H(Object obj, int i7);

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract void I(Object obj, InterfaceC2142x interfaceC2142x, AbstractC1170I abstractC1170I);

    public final void K(final Object obj, InterfaceC2142x interfaceC2142x) {
        AbstractC1297a.a(!this.f20747h.containsKey(obj));
        InterfaceC2142x.c cVar = new InterfaceC2142x.c() { // from class: x0.g
            @Override // x0.InterfaceC2142x.c
            public final void a(InterfaceC2142x interfaceC2142x2, AbstractC1170I abstractC1170I) {
                AbstractC2127h.this.I(obj, interfaceC2142x2, abstractC1170I);
            }
        };
        a aVar = new a(obj);
        this.f20747h.put(obj, new b(interfaceC2142x, cVar, aVar));
        interfaceC2142x.p((Handler) AbstractC1297a.e(this.f20748i), aVar);
        interfaceC2142x.k((Handler) AbstractC1297a.e(this.f20748i), aVar);
        interfaceC2142x.g(cVar, this.f20749j, x());
        if (y()) {
            return;
        }
        interfaceC2142x.d(cVar);
    }

    public final void L(Object obj) {
        b bVar = (b) AbstractC1297a.e((b) this.f20747h.remove(obj));
        bVar.f20754a.m(bVar.f20755b);
        bVar.f20754a.c(bVar.f20756c);
        bVar.f20754a.o(bVar.f20756c);
    }

    @Override // x0.InterfaceC2142x
    public void h() {
        Iterator it = this.f20747h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f20754a.h();
        }
    }

    @Override // x0.AbstractC2120a
    public void v() {
        for (b bVar : this.f20747h.values()) {
            bVar.f20754a.d(bVar.f20755b);
        }
    }

    @Override // x0.AbstractC2120a
    public void w() {
        for (b bVar : this.f20747h.values()) {
            bVar.f20754a.n(bVar.f20755b);
        }
    }

    @Override // x0.AbstractC2120a
    public void z(i0.y yVar) {
        this.f20749j = yVar;
        this.f20748i = g0.M.A();
    }

    public long G(Object obj, long j7, InterfaceC2142x.b bVar) {
        return j7;
    }
}
