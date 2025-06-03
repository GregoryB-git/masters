package g9;

import g9.l;

/* loaded from: classes.dex */
public final class w extends l {

    /* renamed from: d, reason: collision with root package name */
    public final j9.i f6098d;

    public w(j9.l lVar, l.a aVar, ka.d0 d0Var) {
        super(lVar, aVar, d0Var);
        x6.b.Z("KeyFieldFilter expects a ReferenceValue", j9.s.k(d0Var), new Object[0]);
        this.f6098d = j9.i.h(this.f6012b.Z());
    }

    @Override // g9.l, g9.m
    public final boolean d(j9.g gVar) {
        return g(gVar.getKey().compareTo(this.f6098d));
    }
}
