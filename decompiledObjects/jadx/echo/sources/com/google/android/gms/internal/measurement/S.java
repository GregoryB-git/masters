package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class S extends A {
    public S() {
        this.f10287a.add(Z.ADD);
        this.f10287a.add(Z.DIVIDE);
        this.f10287a.add(Z.MODULUS);
        this.f10287a.add(Z.MULTIPLY);
        this.f10287a.add(Z.NEGATE);
        this.f10287a.add(Z.POST_DECREMENT);
        this.f10287a.add(Z.POST_INCREMENT);
        this.f10287a.add(Z.PRE_DECREMENT);
        this.f10287a.add(Z.PRE_INCREMENT);
        this.f10287a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        switch (V.f10676a[C2.c(str).ordinal()]) {
            case 1:
                C2.f(Z.ADD, 2, list);
                InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
                InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(1));
                if (!(b7 instanceof InterfaceC0963m) && !(b7 instanceof C1034u) && !(b8 instanceof InterfaceC0963m) && !(b8 instanceof C1034u)) {
                    return new C0945k(Double.valueOf(b7.f().doubleValue() + b8.f().doubleValue()));
                }
                return new C1034u(b7.g() + b8.g());
            case 2:
                C2.f(Z.DIVIDE, 2, list);
                return new C0945k(Double.valueOf(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue() / c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()));
            case 3:
                C2.f(Z.MODULUS, 2, list);
                return new C0945k(Double.valueOf(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue() % c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()));
            case 4:
                C2.f(Z.MULTIPLY, 2, list);
                return new C0945k(Double.valueOf(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue() * c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()));
            case 5:
                C2.f(Z.NEGATE, 1, list);
                return new C0945k(Double.valueOf(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                C2.g(str, 2, list);
                InterfaceC1016s b9 = c0904f3.b((InterfaceC1016s) list.get(0));
                c0904f3.b((InterfaceC1016s) list.get(1));
                return b9;
            case 8:
            case 9:
                C2.g(str, 1, list);
                return c0904f3.b((InterfaceC1016s) list.get(0));
            case 10:
                C2.f(Z.SUBTRACT, 2, list);
                return new C0945k(Double.valueOf(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue() + new C0945k(Double.valueOf(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue() * (-1.0d))).f().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
