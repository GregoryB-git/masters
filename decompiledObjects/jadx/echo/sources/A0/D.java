package A0;

import d0.AbstractC1170I;
import d0.C1172K;
import d0.C1179b;
import g0.AbstractC1297a;
import k0.Y0;
import k0.a1;
import x0.InterfaceC2142x;
import x0.Z;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public a f39a;

    /* renamed from: b, reason: collision with root package name */
    public B0.e f40b;

    public interface a {
        void a(Y0 y02);

        void d();
    }

    public final B0.e b() {
        return (B0.e) AbstractC1297a.h(this.f40b);
    }

    public abstract C1172K c();

    public abstract a1.a d();

    public void e(a aVar, B0.e eVar) {
        this.f39a = aVar;
        this.f40b = eVar;
    }

    public final void f() {
        a aVar = this.f39a;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void g(Y0 y02) {
        a aVar = this.f39a;
        if (aVar != null) {
            aVar.a(y02);
        }
    }

    public abstract boolean h();

    public abstract void i(Object obj);

    public void j() {
        this.f39a = null;
        this.f40b = null;
    }

    public abstract E k(a1[] a1VarArr, Z z7, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I);

    public abstract void l(C1179b c1179b);

    public abstract void m(C1172K c1172k);
}
