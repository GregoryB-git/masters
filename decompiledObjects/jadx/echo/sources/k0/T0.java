package k0;

import android.util.Pair;
import d0.AbstractC1170I;
import d0.C1198u;
import g0.AbstractC1297a;
import g0.InterfaceC1307k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.T0;
import l0.InterfaceC1533a;
import l0.y1;
import p0.AbstractC1783o;
import x0.C2137s;
import x0.C2138t;
import x0.C2139u;
import x0.InterfaceC2117E;
import x0.InterfaceC2140v;
import x0.InterfaceC2142x;
import x0.T;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f15605a;

    /* renamed from: e, reason: collision with root package name */
    public final d f15609e;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1533a f15612h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1307k f15613i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15615k;

    /* renamed from: l, reason: collision with root package name */
    public i0.y f15616l;

    /* renamed from: j, reason: collision with root package name */
    public x0.T f15614j = new T.a(0);

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f15607c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f15608d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List f15606b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f15610f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Set f15611g = new HashSet();

    public final class a implements InterfaceC2117E, p0.v {

        /* renamed from: a, reason: collision with root package name */
        public final c f15617a;

        public a(c cVar) {
            this.f15617a = cVar;
        }

        public final Pair G(int i7, InterfaceC2142x.b bVar) {
            InterfaceC2142x.b bVar2 = null;
            if (bVar != null) {
                InterfaceC2142x.b n7 = T0.n(this.f15617a, bVar);
                if (n7 == null) {
                    return null;
                }
                bVar2 = n7;
            }
            return Pair.create(Integer.valueOf(T0.s(this.f15617a, i7)), bVar2);
        }

        public final /* synthetic */ void H(Pair pair, C2139u c2139u) {
            T0.this.f15612h.W(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, c2139u);
        }

        public final /* synthetic */ void I(Pair pair) {
            T0.this.f15612h.S(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second);
        }

        public final /* synthetic */ void J(Pair pair) {
            T0.this.f15612h.g0(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second);
        }

        @Override // x0.InterfaceC2117E
        public void K(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.K0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.Y(G6, rVar, c2139u);
                    }
                });
            }
        }

        @Override // p0.v
        public void M(int i7, InterfaceC2142x.b bVar, final int i8) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.Q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.P(G6, i8);
                    }
                });
            }
        }

        public final /* synthetic */ void O(Pair pair) {
            T0.this.f15612h.l0(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second);
        }

        public final /* synthetic */ void P(Pair pair, int i7) {
            T0.this.f15612h.M(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, i7);
        }

        public final /* synthetic */ void Q(Pair pair, Exception exc) {
            T0.this.f15612h.d0(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, exc);
        }

        public final /* synthetic */ void R(Pair pair) {
            T0.this.f15612h.T(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second);
        }

        @Override // p0.v
        public void S(int i7, InterfaceC2142x.b bVar) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.J0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.I(G6);
                    }
                });
            }
        }

        @Override // p0.v
        public void T(int i7, InterfaceC2142x.b bVar) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.R(G6);
                    }
                });
            }
        }

        public final /* synthetic */ void U(Pair pair, x0.r rVar, C2139u c2139u) {
            T0.this.f15612h.p0(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, rVar, c2139u);
        }

        public final /* synthetic */ void V(Pair pair, x0.r rVar, C2139u c2139u) {
            T0.this.f15612h.m0(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, rVar, c2139u);
        }

        @Override // x0.InterfaceC2117E
        public void W(int i7, InterfaceC2142x.b bVar, final C2139u c2139u) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.L0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.H(G6, c2139u);
                    }
                });
            }
        }

        public final /* synthetic */ void X(Pair pair, x0.r rVar, C2139u c2139u, IOException iOException, boolean z7) {
            T0.this.f15612h.a0(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, rVar, c2139u, iOException, z7);
        }

        public final /* synthetic */ void Y(Pair pair, x0.r rVar, C2139u c2139u) {
            T0.this.f15612h.K(((Integer) pair.first).intValue(), (InterfaceC2142x.b) pair.second, rVar, c2139u);
        }

        @Override // x0.InterfaceC2117E
        public void Z(int i7, InterfaceC2142x.b bVar, final C2139u c2139u) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.H0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.c0(G6, c2139u);
                    }
                });
            }
        }

        @Override // x0.InterfaceC2117E
        public void a0(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u, final IOException iOException, final boolean z7) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.R0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.X(G6, rVar, c2139u, iOException, z7);
                    }
                });
            }
        }

        @Override // p0.v
        public /* synthetic */ void b0(int i7, InterfaceC2142x.b bVar) {
            AbstractC1783o.a(this, i7, bVar);
        }

        public final /* synthetic */ void c0(Pair pair, C2139u c2139u) {
            T0.this.f15612h.Z(((Integer) pair.first).intValue(), (InterfaceC2142x.b) AbstractC1297a.e((InterfaceC2142x.b) pair.second), c2139u);
        }

        @Override // p0.v
        public void d0(int i7, InterfaceC2142x.b bVar, final Exception exc) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.N0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.Q(G6, exc);
                    }
                });
            }
        }

        @Override // p0.v
        public void g0(int i7, InterfaceC2142x.b bVar) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.S0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.J(G6);
                    }
                });
            }
        }

        @Override // p0.v
        public void l0(int i7, InterfaceC2142x.b bVar) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.I0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.O(G6);
                    }
                });
            }
        }

        @Override // x0.InterfaceC2117E
        public void m0(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.P0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.V(G6, rVar, c2139u);
                    }
                });
            }
        }

        @Override // x0.InterfaceC2117E
        public void p0(int i7, InterfaceC2142x.b bVar, final x0.r rVar, final C2139u c2139u) {
            final Pair G6 = G(i7, bVar);
            if (G6 != null) {
                T0.this.f15613i.j(new Runnable() { // from class: k0.M0
                    @Override // java.lang.Runnable
                    public final void run() {
                        T0.a.this.U(G6, rVar, c2139u);
                    }
                });
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC2142x f15619a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2142x.c f15620b;

        /* renamed from: c, reason: collision with root package name */
        public final a f15621c;

        public b(InterfaceC2142x interfaceC2142x, InterfaceC2142x.c cVar, a aVar) {
            this.f15619a = interfaceC2142x;
            this.f15620b = cVar;
            this.f15621c = aVar;
        }
    }

    public static final class c implements F0 {

        /* renamed from: a, reason: collision with root package name */
        public final C2138t f15622a;

        /* renamed from: d, reason: collision with root package name */
        public int f15625d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f15626e;

        /* renamed from: c, reason: collision with root package name */
        public final List f15624c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f15623b = new Object();

        public c(InterfaceC2142x interfaceC2142x, boolean z7) {
            this.f15622a = new C2138t(interfaceC2142x, z7);
        }

        @Override // k0.F0
        public Object a() {
            return this.f15623b;
        }

        @Override // k0.F0
        public AbstractC1170I b() {
            return this.f15622a.Z();
        }

        public void c(int i7) {
            this.f15625d = i7;
            this.f15626e = false;
            this.f15624c.clear();
        }
    }

    public interface d {
        void b();
    }

    public T0(d dVar, InterfaceC1533a interfaceC1533a, InterfaceC1307k interfaceC1307k, y1 y1Var) {
        this.f15605a = y1Var;
        this.f15609e = dVar;
        this.f15612h = interfaceC1533a;
        this.f15613i = interfaceC1307k;
    }

    public static Object m(Object obj) {
        return AbstractC1399a.v(obj);
    }

    public static InterfaceC2142x.b n(c cVar, InterfaceC2142x.b bVar) {
        for (int i7 = 0; i7 < cVar.f15624c.size(); i7++) {
            if (((InterfaceC2142x.b) cVar.f15624c.get(i7)).f20851d == bVar.f20851d) {
                return bVar.a(p(cVar, bVar.f20848a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return AbstractC1399a.w(obj);
    }

    public static Object p(c cVar, Object obj) {
        return AbstractC1399a.y(cVar.f15623b, obj);
    }

    public static int s(c cVar, int i7) {
        return i7 + cVar.f15625d;
    }

    public AbstractC1170I A(int i7, int i8, x0.T t7) {
        AbstractC1297a.a(i7 >= 0 && i7 <= i8 && i8 <= r());
        this.f15614j = t7;
        B(i7, i8);
        return i();
    }

    public final void B(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            c cVar = (c) this.f15606b.remove(i9);
            this.f15608d.remove(cVar.f15623b);
            g(i9, -cVar.f15622a.Z().p());
            cVar.f15626e = true;
            if (this.f15615k) {
                v(cVar);
            }
        }
    }

    public AbstractC1170I C(List list, x0.T t7) {
        B(0, this.f15606b.size());
        return f(this.f15606b.size(), list, t7);
    }

    public AbstractC1170I D(x0.T t7) {
        int r7 = r();
        if (t7.a() != r7) {
            t7 = t7.h().d(0, r7);
        }
        this.f15614j = t7;
        return i();
    }

    public AbstractC1170I E(int i7, int i8, List list) {
        AbstractC1297a.a(i7 >= 0 && i7 <= i8 && i8 <= r());
        AbstractC1297a.a(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((c) this.f15606b.get(i9)).f15622a.l((C1198u) list.get(i9 - i7));
        }
        return i();
    }

    public AbstractC1170I f(int i7, List list, x0.T t7) {
        int i8;
        if (!list.isEmpty()) {
            this.f15614j = t7;
            for (int i9 = i7; i9 < list.size() + i7; i9++) {
                c cVar = (c) list.get(i9 - i7);
                if (i9 > 0) {
                    c cVar2 = (c) this.f15606b.get(i9 - 1);
                    i8 = cVar2.f15625d + cVar2.f15622a.Z().p();
                } else {
                    i8 = 0;
                }
                cVar.c(i8);
                g(i9, cVar.f15622a.Z().p());
                this.f15606b.add(i9, cVar);
                this.f15608d.put(cVar.f15623b, cVar);
                if (this.f15615k) {
                    x(cVar);
                    if (this.f15607c.isEmpty()) {
                        this.f15611g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i7, int i8) {
        while (i7 < this.f15606b.size()) {
            ((c) this.f15606b.get(i7)).f15625d += i8;
            i7++;
        }
    }

    public InterfaceC2140v h(InterfaceC2142x.b bVar, B0.b bVar2, long j7) {
        Object o7 = o(bVar.f20848a);
        InterfaceC2142x.b a7 = bVar.a(m(bVar.f20848a));
        c cVar = (c) AbstractC1297a.e((c) this.f15608d.get(o7));
        l(cVar);
        cVar.f15624c.add(a7);
        C2137s f7 = cVar.f15622a.f(a7, bVar2, j7);
        this.f15607c.put(f7, cVar);
        k();
        return f7;
    }

    public AbstractC1170I i() {
        if (this.f15606b.isEmpty()) {
            return AbstractC1170I.f12388a;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f15606b.size(); i8++) {
            c cVar = (c) this.f15606b.get(i8);
            cVar.f15625d = i7;
            i7 += cVar.f15622a.Z().p();
        }
        return new W0(this.f15606b, this.f15614j);
    }

    public final void j(c cVar) {
        b bVar = (b) this.f15610f.get(cVar);
        if (bVar != null) {
            bVar.f15619a.d(bVar.f15620b);
        }
    }

    public final void k() {
        Iterator it = this.f15611g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f15624c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f15611g.add(cVar);
        b bVar = (b) this.f15610f.get(cVar);
        if (bVar != null) {
            bVar.f15619a.n(bVar.f15620b);
        }
    }

    public x0.T q() {
        return this.f15614j;
    }

    public int r() {
        return this.f15606b.size();
    }

    public boolean t() {
        return this.f15615k;
    }

    public final /* synthetic */ void u(InterfaceC2142x interfaceC2142x, AbstractC1170I abstractC1170I) {
        this.f15609e.b();
    }

    public final void v(c cVar) {
        if (cVar.f15626e && cVar.f15624c.isEmpty()) {
            b bVar = (b) AbstractC1297a.e((b) this.f15610f.remove(cVar));
            bVar.f15619a.m(bVar.f15620b);
            bVar.f15619a.c(bVar.f15621c);
            bVar.f15619a.o(bVar.f15621c);
            this.f15611g.remove(cVar);
        }
    }

    public void w(i0.y yVar) {
        AbstractC1297a.f(!this.f15615k);
        this.f15616l = yVar;
        for (int i7 = 0; i7 < this.f15606b.size(); i7++) {
            c cVar = (c) this.f15606b.get(i7);
            x(cVar);
            this.f15611g.add(cVar);
        }
        this.f15615k = true;
    }

    public final void x(c cVar) {
        C2138t c2138t = cVar.f15622a;
        InterfaceC2142x.c cVar2 = new InterfaceC2142x.c() { // from class: k0.G0
            @Override // x0.InterfaceC2142x.c
            public final void a(InterfaceC2142x interfaceC2142x, AbstractC1170I abstractC1170I) {
                T0.this.u(interfaceC2142x, abstractC1170I);
            }
        };
        a aVar = new a(cVar);
        this.f15610f.put(cVar, new b(c2138t, cVar2, aVar));
        c2138t.p(g0.M.C(), aVar);
        c2138t.k(g0.M.C(), aVar);
        c2138t.g(cVar2, this.f15616l, this.f15605a);
    }

    public void y() {
        for (b bVar : this.f15610f.values()) {
            try {
                bVar.f15619a.m(bVar.f15620b);
            } catch (RuntimeException e7) {
                g0.o.d("MediaSourceList", "Failed to release child source.", e7);
            }
            bVar.f15619a.c(bVar.f15621c);
            bVar.f15619a.o(bVar.f15621c);
        }
        this.f15610f.clear();
        this.f15611g.clear();
        this.f15615k = false;
    }

    public void z(InterfaceC2140v interfaceC2140v) {
        c cVar = (c) AbstractC1297a.e((c) this.f15607c.remove(interfaceC2140v));
        cVar.f15622a.e(interfaceC2140v);
        cVar.f15624c.remove(((C2137s) interfaceC2140v).f20822o);
        if (!this.f15607c.isEmpty()) {
            k();
        }
        v(cVar);
    }
}
