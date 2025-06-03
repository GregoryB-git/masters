package nc;

/* loaded from: classes.dex */
public final class u0 extends i {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f11556a;

    public u0(t0 t0Var) {
        this.f11556a = t0Var;
    }

    @Override // nc.j
    public final void h(Throwable th) {
        this.f11556a.dispose();
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
        h(th);
        return rb.h.f13851a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DisposeOnCancel[");
        l10.append(this.f11556a);
        l10.append(']');
        return l10.toString();
    }
}
