package s0;

import java.util.Map;
import s0.n;
import s0.v;

/* loaded from: classes.dex */
public final class p extends o<v.d> {
    @Override // s0.o
    public final void a(Map.Entry entry) {
        ((v.d) entry.getKey()).getClass();
    }

    @Override // s0.o
    public final v.e b(n nVar, o0 o0Var, int i10) {
        return nVar.f14052a.get(new n.a(o0Var, i10));
    }

    @Override // s0.o
    public final r<v.d> c(Object obj) {
        return ((v.c) obj).extensions;
    }

    @Override // s0.o
    public final r<v.d> d(Object obj) {
        v.c cVar = (v.c) obj;
        r<v.d> rVar = cVar.extensions;
        if (rVar.f14074b) {
            cVar.extensions = rVar.clone();
        }
        return cVar.extensions;
    }

    @Override // s0.o
    public final boolean e(o0 o0Var) {
        return o0Var instanceof v.c;
    }

    @Override // s0.o
    public final void f(Object obj) {
        r<v.d> rVar = ((v.c) obj).extensions;
        if (rVar.f14074b) {
            return;
        }
        rVar.f14073a.h();
        rVar.f14074b = true;
    }

    @Override // s0.o
    public final Object g(Object obj) {
        throw null;
    }

    @Override // s0.o
    public final void h(Object obj) {
        throw null;
    }

    @Override // s0.o
    public final void i(Object obj) {
        throw null;
    }

    @Override // s0.o
    public final void j(Map.Entry entry) {
        ((v.d) entry.getKey()).getClass();
        throw null;
    }
}
