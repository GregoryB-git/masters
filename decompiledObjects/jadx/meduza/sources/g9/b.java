package g9;

import g9.l;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends l {
    public b(j9.l lVar, ka.d0 d0Var) {
        super(lVar, l.a.ARRAY_CONTAINS_ANY, d0Var);
        x6.b.Z("ArrayContainsAnyFilter expects an ArrayValue", j9.s.h(d0Var), new Object[0]);
    }

    @Override // g9.l, g9.m
    public final boolean d(j9.g gVar) {
        ka.d0 g10 = gVar.g(this.f6013c);
        if (!j9.s.h(g10)) {
            return false;
        }
        Iterator<ka.d0> it = g10.R().h().iterator();
        while (it.hasNext()) {
            if (j9.s.f(this.f6012b.R(), it.next())) {
                return true;
            }
        }
        return false;
    }
}
