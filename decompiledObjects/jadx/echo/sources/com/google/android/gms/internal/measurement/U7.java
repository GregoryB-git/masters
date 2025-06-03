package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class U7 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public C0864b f10675q;

    public U7(C0864b c0864b) {
        super("internal.registerCallback");
        this.f10675q = c0864b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        C2.g(this.f11052o, 3, list);
        String g7 = c0904f3.b((InterfaceC1016s) list.get(0)).g();
        InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(1));
        if (!(b7 instanceof C1025t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(2));
        if (!(b8 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        r rVar = (r) b8;
        if (!rVar.q("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f10675q.c(g7, rVar.q("priority") ? C2.i(rVar.i("priority").f().doubleValue()) : 1000, (C1025t) b7, rVar.i("type").g());
        return InterfaceC1016s.f11133d;
    }
}
