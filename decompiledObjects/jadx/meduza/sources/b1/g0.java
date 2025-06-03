package b1;

import b1.k;

/* loaded from: classes.dex */
public final class g0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f1732b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1733c;

    public g0(String str, e0 e0Var) {
        this.f1731a = str;
        this.f1732b = e0Var;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        if (aVar == k.a.ON_DESTROY) {
            this.f1733c = false;
            oVar.getLifecycle().c(this);
        }
    }

    public final void b(k kVar, s1.c cVar) {
        ec.i.e(cVar, "registry");
        ec.i.e(kVar, "lifecycle");
        if (!(!this.f1733c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f1733c = true;
        kVar.a(this);
        cVar.c(this.f1731a, this.f1732b.f1729e);
    }
}
