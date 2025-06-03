package b1;

import b1.k;

/* loaded from: classes.dex */
public final class f0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1730a;

    public f0(i0 i0Var) {
        this.f1730a = i0Var;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        if (aVar == k.a.ON_CREATE) {
            oVar.getLifecycle().c(this);
            this.f1730a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
