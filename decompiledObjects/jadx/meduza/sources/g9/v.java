package g9;

import g9.l;

/* loaded from: classes.dex */
public final class v extends l {
    public v(j9.l lVar, ka.d0 d0Var) {
        super(lVar, l.a.IN, d0Var);
        x6.b.Z("InFilter expects an ArrayValue", j9.s.h(d0Var), new Object[0]);
    }

    @Override // g9.l, g9.m
    public final boolean d(j9.g gVar) {
        ka.d0 g10 = gVar.g(this.f6013c);
        return g10 != null && j9.s.f(this.f6012b.R(), g10);
    }
}
