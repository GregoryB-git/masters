package x0;

import d0.AbstractC1170I;
import d0.C1198u;

/* loaded from: classes.dex */
public final class X extends AbstractC2135p {

    /* renamed from: f, reason: collision with root package name */
    public final C1198u f20699f;

    public X(AbstractC1170I abstractC1170I, C1198u c1198u) {
        super(abstractC1170I);
        this.f20699f = c1198u;
    }

    @Override // x0.AbstractC2135p, d0.AbstractC1170I
    public AbstractC1170I.c o(int i7, AbstractC1170I.c cVar, long j7) {
        super.o(i7, cVar, j7);
        C1198u c1198u = this.f20699f;
        cVar.f12422c = c1198u;
        C1198u.h hVar = c1198u.f12800b;
        cVar.f12421b = hVar != null ? hVar.f12899h : null;
        return cVar;
    }
}
