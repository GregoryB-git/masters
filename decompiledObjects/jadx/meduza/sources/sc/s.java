package sc;

import b.a0;
import p2.m0;

/* loaded from: classes.dex */
public class s<T> extends nc.a<T> implements wb.d {

    /* renamed from: d, reason: collision with root package name */
    public final ub.e<T> f14365d;

    public s(ub.e eVar, ub.h hVar) {
        super(hVar, true);
        this.f14365d = eVar;
    }

    @Override // nc.o1
    public final boolean K() {
        return true;
    }

    @Override // nc.a
    public void Z(Object obj) {
        this.f14365d.resumeWith(eb.y.c(obj));
    }

    @Override // wb.d
    public final wb.d getCallerFrame() {
        ub.e<T> eVar = this.f14365d;
        if (eVar instanceof wb.d) {
            return (wb.d) eVar;
        }
        return null;
    }

    @Override // nc.o1
    public void p(Object obj) {
        a0.C(m0.P(this.f14365d), eb.y.c(obj), null);
    }
}
