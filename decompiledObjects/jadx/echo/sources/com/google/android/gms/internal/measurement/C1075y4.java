package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075y4 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public final C0882d f11217q;

    public C1075y4(C0882d c0882d) {
        super("internal.eventLogger");
        this.f11217q = c0882d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        C2.g(this.f11052o, 3, list);
        String g7 = c0904f3.b((InterfaceC1016s) list.get(0)).g();
        long a7 = (long) C2.a(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue());
        InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(2));
        this.f11217q.c(g7, a7, b7 instanceof r ? C2.e((r) b7) : new HashMap());
        return InterfaceC1016s.f11133d;
    }
}
