package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070y extends A {
    public C1070y() {
        this.f10287a.add(Z.BITWISE_AND);
        this.f10287a.add(Z.BITWISE_LEFT_SHIFT);
        this.f10287a.add(Z.BITWISE_NOT);
        this.f10287a.add(Z.BITWISE_OR);
        this.f10287a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f10287a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f10287a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        switch (B.f10294a[C2.c(str).ordinal()]) {
            case 1:
                C2.f(Z.BITWISE_AND, 2, list);
                return new C0945k(Double.valueOf(C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()) & C2.i(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue())));
            case 2:
                C2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C0945k(Double.valueOf(C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()) << ((int) (C2.m(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()) & 31))));
            case 3:
                C2.f(Z.BITWISE_NOT, 1, list);
                return new C0945k(Double.valueOf(~C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue())));
            case 4:
                C2.f(Z.BITWISE_OR, 2, list);
                return new C0945k(Double.valueOf(C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()) | C2.i(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue())));
            case 5:
                C2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C0945k(Double.valueOf(C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()) >> ((int) (C2.m(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()) & 31))));
            case 6:
                C2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C0945k(Double.valueOf(C2.m(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()) >>> ((int) (C2.m(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()) & 31))));
            case 7:
                C2.f(Z.BITWISE_XOR, 2, list);
                return new C0945k(Double.valueOf(C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()) ^ C2.i(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
