package b4;

import V3.k;
import Y3.m;
import a4.C0747c;
import b4.InterfaceC0802d;
import d4.C1227b;
import d4.h;
import d4.i;
import d4.n;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0800b implements InterfaceC0802d {

    /* renamed from: a, reason: collision with root package name */
    public final h f9971a;

    public C0800b(h hVar) {
        this.f9971a = hVar;
    }

    @Override // b4.InterfaceC0802d
    public i a(i iVar, n nVar) {
        return iVar.k().isEmpty() ? iVar : iVar.M(nVar);
    }

    @Override // b4.InterfaceC0802d
    public i c(i iVar, C1227b c1227b, n nVar, k kVar, InterfaceC0802d.a aVar, C0799a c0799a) {
        C0747c c7;
        m.g(iVar.s(this.f9971a), "The index must match the filter");
        n k7 = iVar.k();
        n v7 = k7.v(c1227b);
        if (v7.A(kVar).equals(nVar.A(kVar)) && v7.isEmpty() == nVar.isEmpty()) {
            return iVar;
        }
        if (c0799a != null) {
            if (!nVar.isEmpty()) {
                c7 = v7.isEmpty() ? C0747c.c(c1227b, nVar) : C0747c.e(c1227b, nVar, v7);
            } else if (k7.Q(c1227b)) {
                c7 = C0747c.h(c1227b, v7);
            } else {
                m.g(k7.B(), "A child remove without an old child only makes sense on a leaf node");
            }
            c0799a.b(c7);
        }
        return (k7.B() && nVar.isEmpty()) ? iVar : iVar.D(c1227b, nVar);
    }

    @Override // b4.InterfaceC0802d
    public boolean d() {
        return false;
    }

    @Override // b4.InterfaceC0802d
    public h e() {
        return this.f9971a;
    }

    @Override // b4.InterfaceC0802d
    public i f(i iVar, i iVar2, C0799a c0799a) {
        C0747c c7;
        m.g(iVar2.s(this.f9971a), "Can't use IndexedNode that doesn't have filter's index");
        if (c0799a != null) {
            for (d4.m mVar : iVar.k()) {
                if (!iVar2.k().Q(mVar.c())) {
                    c0799a.b(C0747c.h(mVar.c(), mVar.d()));
                }
            }
            if (!iVar2.k().B()) {
                for (d4.m mVar2 : iVar2.k()) {
                    if (iVar.k().Q(mVar2.c())) {
                        n v7 = iVar.k().v(mVar2.c());
                        if (!v7.equals(mVar2.d())) {
                            c7 = C0747c.e(mVar2.c(), mVar2.d(), v7);
                        }
                    } else {
                        c7 = C0747c.c(mVar2.c(), mVar2.d());
                    }
                    c0799a.b(c7);
                }
            }
        }
        return iVar2;
    }

    @Override // b4.InterfaceC0802d
    public InterfaceC0802d b() {
        return this;
    }
}
