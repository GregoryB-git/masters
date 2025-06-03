package b4;

import V3.k;
import b4.InterfaceC0802d;
import d4.C1227b;
import d4.g;
import d4.h;
import d4.i;
import d4.m;
import d4.n;
import d4.r;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements InterfaceC0802d {

    /* renamed from: a, reason: collision with root package name */
    public final C0800b f9976a;

    /* renamed from: b, reason: collision with root package name */
    public final h f9977b;

    /* renamed from: c, reason: collision with root package name */
    public final m f9978c;

    /* renamed from: d, reason: collision with root package name */
    public final m f9979d;

    public e(a4.h hVar) {
        this.f9976a = new C0800b(hVar.d());
        this.f9977b = hVar.d();
        this.f9978c = j(hVar);
        this.f9979d = h(hVar);
    }

    public static m h(a4.h hVar) {
        if (!hVar.m()) {
            return hVar.d().g();
        }
        return hVar.d().f(hVar.e(), hVar.f());
    }

    public static m j(a4.h hVar) {
        if (!hVar.o()) {
            return hVar.d().h();
        }
        return hVar.d().f(hVar.g(), hVar.h());
    }

    @Override // b4.InterfaceC0802d
    public InterfaceC0802d b() {
        return this.f9976a;
    }

    @Override // b4.InterfaceC0802d
    public i c(i iVar, C1227b c1227b, n nVar, k kVar, InterfaceC0802d.a aVar, C0799a c0799a) {
        if (!k(new m(c1227b, nVar))) {
            nVar = g.W();
        }
        return this.f9976a.c(iVar, c1227b, nVar, kVar, aVar, c0799a);
    }

    @Override // b4.InterfaceC0802d
    public boolean d() {
        return true;
    }

    @Override // b4.InterfaceC0802d
    public h e() {
        return this.f9977b;
    }

    @Override // b4.InterfaceC0802d
    public i f(i iVar, i iVar2, C0799a c0799a) {
        i iVar3;
        if (iVar2.k().B()) {
            iVar3 = i.f(g.W(), this.f9977b);
        } else {
            i M6 = iVar2.M(r.a());
            Iterator it = iVar2.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (!k(mVar)) {
                    M6 = M6.D(mVar.c(), g.W());
                }
            }
            iVar3 = M6;
        }
        return this.f9976a.f(iVar, iVar3, c0799a);
    }

    public m g() {
        return this.f9979d;
    }

    public m i() {
        return this.f9978c;
    }

    public boolean k(m mVar) {
        return this.f9977b.compare(i(), mVar) <= 0 && this.f9977b.compare(mVar, g()) <= 0;
    }

    @Override // b4.InterfaceC0802d
    public i a(i iVar, n nVar) {
        return iVar;
    }
}
