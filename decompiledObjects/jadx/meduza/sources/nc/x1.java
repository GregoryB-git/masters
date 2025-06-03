package nc;

import nc.o1;

/* loaded from: classes.dex */
public final class x1<T> extends n1 {

    /* renamed from: e, reason: collision with root package name */
    public final l<T> f11565e;

    public x1(o1.a aVar) {
        this.f11565e = aVar;
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
        l(th);
        return rb.h.f13851a;
    }

    @Override // nc.w
    public final void l(Throwable th) {
        l<T> lVar;
        Object f02;
        Object F = m().F();
        if (F instanceof u) {
            lVar = this.f11565e;
            f02 = rb.f.a(((u) F).f11555a);
        } else {
            lVar = this.f11565e;
            f02 = p2.m0.f0(F);
        }
        lVar.resumeWith(f02);
    }
}
