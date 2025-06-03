package g9;

import g9.l;

/* loaded from: classes.dex */
public final class c0 extends l {
    public c0(j9.l lVar, ka.d0 d0Var) {
        super(lVar, l.a.NOT_IN, d0Var);
        x6.b.Z("NotInFilter expects an ArrayValue", j9.s.h(d0Var), new Object[0]);
    }

    @Override // g9.l, g9.m
    public final boolean d(j9.g gVar) {
        ka.d0 g10;
        return (j9.s.f(this.f6012b.R(), j9.s.f8708b) || (g10 = gVar.g(this.f6013c)) == null || j9.s.f(this.f6012b.R(), g10)) ? false : true;
    }
}
