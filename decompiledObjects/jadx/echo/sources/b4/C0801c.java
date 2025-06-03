package b4;

import V3.k;
import a4.C0747c;
import b4.InterfaceC0802d;
import d4.C1227b;
import d4.g;
import d4.h;
import d4.i;
import d4.m;
import d4.n;
import d4.r;
import java.util.Iterator;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0801c implements InterfaceC0802d {

    /* renamed from: a, reason: collision with root package name */
    public final e f9972a;

    /* renamed from: b, reason: collision with root package name */
    public final h f9973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9974c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9975d;

    public C0801c(a4.h hVar) {
        this.f9972a = new e(hVar);
        this.f9973b = hVar.d();
        this.f9974c = hVar.i();
        this.f9975d = !hVar.r();
    }

    @Override // b4.InterfaceC0802d
    public InterfaceC0802d b() {
        return this.f9972a.b();
    }

    @Override // b4.InterfaceC0802d
    public i c(i iVar, C1227b c1227b, n nVar, k kVar, InterfaceC0802d.a aVar, C0799a c0799a) {
        if (!this.f9972a.k(new m(c1227b, nVar))) {
            nVar = g.W();
        }
        n nVar2 = nVar;
        return iVar.k().v(c1227b).equals(nVar2) ? iVar : iVar.k().E() < this.f9974c ? this.f9972a.b().c(iVar, c1227b, nVar2, kVar, aVar, c0799a) : g(iVar, c1227b, nVar2, aVar, c0799a);
    }

    @Override // b4.InterfaceC0802d
    public boolean d() {
        return true;
    }

    @Override // b4.InterfaceC0802d
    public h e() {
        return this.f9973b;
    }

    @Override // b4.InterfaceC0802d
    public i f(i iVar, i iVar2, C0799a c0799a) {
        i f7;
        Iterator it;
        m i7;
        m g7;
        int i8;
        if (iVar2.k().B() || iVar2.k().isEmpty()) {
            f7 = i.f(g.W(), this.f9973b);
        } else {
            f7 = iVar2.M(r.a());
            if (this.f9975d) {
                it = iVar2.P();
                i7 = this.f9972a.g();
                g7 = this.f9972a.i();
                i8 = -1;
            } else {
                it = iVar2.iterator();
                i7 = this.f9972a.i();
                g7 = this.f9972a.g();
                i8 = 1;
            }
            boolean z7 = false;
            int i9 = 0;
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (!z7 && this.f9973b.compare(i7, mVar) * i8 <= 0) {
                    z7 = true;
                }
                if (!z7 || i9 >= this.f9974c || this.f9973b.compare(mVar, g7) * i8 > 0) {
                    f7 = f7.D(mVar.c(), g.W());
                } else {
                    i9++;
                }
            }
        }
        return this.f9972a.b().f(iVar, f7, c0799a);
    }

    public final i g(i iVar, C1227b c1227b, n nVar, InterfaceC0802d.a aVar, C0799a c0799a) {
        i D7;
        C1227b c7;
        n W6;
        Y3.m.f(iVar.k().E() == this.f9974c);
        m mVar = new m(c1227b, nVar);
        m g7 = this.f9975d ? iVar.g() : iVar.i();
        boolean k7 = this.f9972a.k(mVar);
        if (iVar.k().Q(c1227b)) {
            n v7 = iVar.k().v(c1227b);
            while (true) {
                g7 = aVar.a(this.f9973b, g7, this.f9975d);
                if (g7 == null || (!g7.c().equals(c1227b) && !iVar.k().Q(g7.c()))) {
                    break;
                }
            }
            int a7 = g7 != null ? this.f9973b.a(g7, mVar, this.f9975d) : 1;
            if (k7 && !nVar.isEmpty() && a7 >= 0) {
                if (c0799a != null) {
                    c0799a.b(C0747c.e(c1227b, nVar, v7));
                }
                return iVar.D(c1227b, nVar);
            }
            if (c0799a != null) {
                c0799a.b(C0747c.h(c1227b, v7));
            }
            D7 = iVar.D(c1227b, g.W());
            if (g7 == null || !this.f9972a.k(g7)) {
                return D7;
            }
            if (c0799a != null) {
                c0799a.b(C0747c.c(g7.c(), g7.d()));
            }
            c7 = g7.c();
            W6 = g7.d();
        } else {
            if (nVar.isEmpty()) {
                return iVar;
            }
            if (!k7 || this.f9973b.a(g7, mVar, this.f9975d) < 0) {
                return iVar;
            }
            if (c0799a != null) {
                c0799a.b(C0747c.h(g7.c(), g7.d()));
                c0799a.b(C0747c.c(c1227b, nVar));
            }
            D7 = iVar.D(c1227b, nVar);
            c7 = g7.c();
            W6 = g.W();
        }
        return D7.D(c7, W6);
    }

    @Override // b4.InterfaceC0802d
    public i a(i iVar, n nVar) {
        return iVar;
    }
}
