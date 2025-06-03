package q0;

import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import c1.t;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.E;
import l1.C1586b;
import l1.C1589e;
import l1.C1592h;
import l1.J;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final L f18607f = new L();

    /* renamed from: a, reason: collision with root package name */
    public final F0.r f18608a;

    /* renamed from: b, reason: collision with root package name */
    public final C1194q f18609b;

    /* renamed from: c, reason: collision with root package name */
    public final E f18610c;

    /* renamed from: d, reason: collision with root package name */
    public final t.a f18611d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18612e;

    public C1881b(F0.r rVar, C1194q c1194q, E e7, t.a aVar, boolean z7) {
        this.f18608a = rVar;
        this.f18609b = c1194q;
        this.f18610c = e7;
        this.f18611d = aVar;
        this.f18612e = z7;
    }

    @Override // q0.k
    public boolean a() {
        F0.r d7 = this.f18608a.d();
        return (d7 instanceof C1592h) || (d7 instanceof C1586b) || (d7 instanceof C1589e) || (d7 instanceof Y0.f);
    }

    @Override // q0.k
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f18608a.b(interfaceC0374t);
    }

    @Override // q0.k
    public boolean c(InterfaceC0373s interfaceC0373s) {
        return this.f18608a.i(interfaceC0373s, f18607f) == 0;
    }

    @Override // q0.k
    public void d() {
        this.f18608a.a(0L, 0L);
    }

    @Override // q0.k
    public boolean e() {
        F0.r d7 = this.f18608a.d();
        return (d7 instanceof J) || (d7 instanceof Z0.h);
    }

    @Override // q0.k
    public k f() {
        F0.r fVar;
        AbstractC1297a.f(!e());
        AbstractC1297a.g(this.f18608a.d() == this.f18608a, "Can't recreate wrapped extractors. Outer type: " + this.f18608a.getClass());
        F0.r rVar = this.f18608a;
        if (rVar instanceof w) {
            fVar = new w(this.f18609b.f12716d, this.f18610c, this.f18611d, this.f18612e);
        } else if (rVar instanceof C1592h) {
            fVar = new C1592h();
        } else if (rVar instanceof C1586b) {
            fVar = new C1586b();
        } else if (rVar instanceof C1589e) {
            fVar = new C1589e();
        } else {
            if (!(rVar instanceof Y0.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f18608a.getClass().getSimpleName());
            }
            fVar = new Y0.f();
        }
        return new C1881b(fVar, this.f18609b, this.f18610c, this.f18611d, this.f18612e);
    }
}
