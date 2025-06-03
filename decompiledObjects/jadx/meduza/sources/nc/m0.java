package nc;

import ub.f;
import ub.h;

/* loaded from: classes.dex */
public final class m0 {
    public static final Object a(long j10, wb.c cVar) {
        if (j10 <= 0) {
            return rb.h.f13851a;
        }
        l lVar = new l(1, p2.m0.P(cVar));
        lVar.t();
        if (j10 < Long.MAX_VALUE) {
            b(lVar.f11516e).f(j10, lVar);
        }
        Object s10 = lVar.s();
        return s10 == vb.a.f16085a ? s10 : rb.h.f13851a;
    }

    public static final l0 b(ub.h hVar) {
        int i10 = ub.f.f15162n;
        h.b bVar = hVar.get(f.a.f15163a);
        l0 l0Var = bVar instanceof l0 ? (l0) bVar : null;
        return l0Var == null ? i0.f11506a : l0Var;
    }
}
