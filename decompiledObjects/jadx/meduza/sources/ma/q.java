package ma;

import java.util.Map;
import ma.o;
import ma.w;

/* loaded from: classes.dex */
public final class q extends p<w.d> {
    @Override // ma.p
    public final void a(Map.Entry entry) {
        ((w.d) entry.getKey()).getClass();
    }

    @Override // ma.p
    public final w.e b(o oVar, s0 s0Var, int i10) {
        return oVar.f11060a.get(new o.a(s0Var, i10));
    }

    @Override // ma.p
    public final s<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // ma.p
    public final s<w.d> d(Object obj) {
        w.c cVar = (w.c) obj;
        s<w.d> sVar = cVar.extensions;
        if (sVar.f11074b) {
            cVar.extensions = sVar.clone();
        }
        return cVar.extensions;
    }

    @Override // ma.p
    public final boolean e(s0 s0Var) {
        return s0Var instanceof w.c;
    }

    @Override // ma.p
    public final void f(Object obj) {
        ((w.c) obj).extensions.m();
    }

    @Override // ma.p
    public final Object g(Object obj) {
        throw null;
    }

    @Override // ma.p
    public final void h(Object obj) {
        throw null;
    }

    @Override // ma.p
    public final void i(Object obj) {
        throw null;
    }

    @Override // ma.p
    public final void j(Map.Entry entry) {
        ((w.d) entry.getKey()).getClass();
        throw null;
    }
}
