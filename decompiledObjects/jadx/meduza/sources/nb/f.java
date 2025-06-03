package nb;

import eb.k0;
import eb.n;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    public k0 f11383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f11384b;

    public f(e eVar) {
        this.f11384b = eVar;
    }

    @Override // nb.c, eb.k0.e
    public final void f(n nVar, k0.j jVar) {
        n nVar2 = n.READY;
        k0 k0Var = this.f11383a;
        e eVar = this.f11384b;
        k0 k0Var2 = eVar.f11379k;
        if (k0Var == k0Var2) {
            x6.b.I(eVar.f11382n, "there's pending lb while current lb has been out of READY");
            e eVar2 = this.f11384b;
            eVar2.f11380l = nVar;
            eVar2.f11381m = jVar;
            if (nVar == nVar2) {
                eVar2.h();
                return;
            }
            return;
        }
        if (k0Var == eVar.f11377i) {
            boolean z10 = nVar == nVar2;
            eVar.f11382n = z10;
            if (z10 || k0Var2 == eVar.f) {
                eVar.f11375g.f(nVar, jVar);
            } else {
                eVar.h();
            }
        }
    }

    @Override // nb.c
    public final k0.e g() {
        return this.f11384b.f11375g;
    }
}
