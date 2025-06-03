package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class J extends A {
    public J() {
        this.f10287a.add(Z.AND);
        this.f10287a.add(Z.NOT);
        this.f10287a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        int i7 = M.f10483a[C2.c(str).ordinal()];
        if (i7 == 1) {
            C2.f(Z.AND, 2, list);
            InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
            if (!b7.d().booleanValue()) {
                return b7;
            }
        } else {
            if (i7 == 2) {
                C2.f(Z.NOT, 1, list);
                return new C0918h(Boolean.valueOf(!c0904f3.b((InterfaceC1016s) list.get(0)).d().booleanValue()));
            }
            if (i7 != 3) {
                return super.a(str);
            }
            C2.f(Z.OR, 2, list);
            InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(0));
            if (b8.d().booleanValue()) {
                return b8;
            }
        }
        return c0904f3.b((InterfaceC1016s) list.get(1));
    }
}
