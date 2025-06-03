package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class L extends A {
    public L() {
        this.f10287a.add(Z.FOR_IN);
        this.f10287a.add(Z.FOR_IN_CONST);
        this.f10287a.add(Z.FOR_IN_LET);
        this.f10287a.add(Z.FOR_LET);
        this.f10287a.add(Z.FOR_OF);
        this.f10287a.add(Z.FOR_OF_CONST);
        this.f10287a.add(Z.FOR_OF_LET);
        this.f10287a.add(Z.WHILE);
    }

    public static InterfaceC1016s c(P p7, InterfaceC1016s interfaceC1016s, InterfaceC1016s interfaceC1016s2) {
        return d(p7, interfaceC1016s.k(), interfaceC1016s2);
    }

    public static InterfaceC1016s d(P p7, Iterator it, InterfaceC1016s interfaceC1016s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1016s a7 = p7.a((InterfaceC1016s) it.next()).a((C0909g) interfaceC1016s);
                if (a7 instanceof C0954l) {
                    C0954l c0954l = (C0954l) a7;
                    if ("break".equals(c0954l.b())) {
                        return InterfaceC1016s.f11133d;
                    }
                    if ("return".equals(c0954l.b())) {
                        return c0954l;
                    }
                }
            }
        }
        return InterfaceC1016s.f11133d;
    }

    public static InterfaceC1016s e(P p7, InterfaceC1016s interfaceC1016s, InterfaceC1016s interfaceC1016s2) {
        if (interfaceC1016s instanceof Iterable) {
            return d(p7, ((Iterable) interfaceC1016s).iterator(), interfaceC1016s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        switch (O.f10526a[C2.c(str).ordinal()]) {
            case 1:
                C2.f(Z.FOR_IN, 3, list);
                if (!(list.get(0) instanceof C1034u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new T(c0904f3, ((InterfaceC1016s) list.get(0)).g()), c0904f3.b((InterfaceC1016s) list.get(1)), c0904f3.b((InterfaceC1016s) list.get(2)));
            case 2:
                C2.f(Z.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof C1034u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new N(c0904f3, ((InterfaceC1016s) list.get(0)).g()), c0904f3.b((InterfaceC1016s) list.get(1)), c0904f3.b((InterfaceC1016s) list.get(2)));
            case 3:
                C2.f(Z.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof C1034u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new Q(c0904f3, ((InterfaceC1016s) list.get(0)).g()), c0904f3.b((InterfaceC1016s) list.get(1)), c0904f3.b((InterfaceC1016s) list.get(2)));
            case 4:
                C2.f(Z.FOR_LET, 4, list);
                InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (!(b7 instanceof C0909g)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C0909g c0909g = (C0909g) b7;
                InterfaceC1016s interfaceC1016s = (InterfaceC1016s) list.get(1);
                InterfaceC1016s interfaceC1016s2 = (InterfaceC1016s) list.get(2);
                InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(3));
                C0904f3 d7 = c0904f3.d();
                for (int i7 = 0; i7 < c0909g.U(); i7++) {
                    String g7 = c0909g.M(i7).g();
                    d7.h(g7, c0904f3.c(g7));
                }
                while (c0904f3.b(interfaceC1016s).d().booleanValue()) {
                    InterfaceC1016s a7 = c0904f3.a((C0909g) b8);
                    if (a7 instanceof C0954l) {
                        C0954l c0954l = (C0954l) a7;
                        if ("break".equals(c0954l.b())) {
                            return InterfaceC1016s.f11133d;
                        }
                        if ("return".equals(c0954l.b())) {
                            return c0954l;
                        }
                    }
                    C0904f3 d8 = c0904f3.d();
                    for (int i8 = 0; i8 < c0909g.U(); i8++) {
                        String g8 = c0909g.M(i8).g();
                        d8.h(g8, d7.c(g8));
                    }
                    d8.b(interfaceC1016s2);
                    d7 = d8;
                }
                return InterfaceC1016s.f11133d;
            case 5:
                C2.f(Z.FOR_OF, 3, list);
                if (!(list.get(0) instanceof C1034u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new T(c0904f3, ((InterfaceC1016s) list.get(0)).g()), c0904f3.b((InterfaceC1016s) list.get(1)), c0904f3.b((InterfaceC1016s) list.get(2)));
            case 6:
                C2.f(Z.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof C1034u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new N(c0904f3, ((InterfaceC1016s) list.get(0)).g()), c0904f3.b((InterfaceC1016s) list.get(1)), c0904f3.b((InterfaceC1016s) list.get(2)));
            case 7:
                C2.f(Z.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof C1034u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new Q(c0904f3, ((InterfaceC1016s) list.get(0)).g()), c0904f3.b((InterfaceC1016s) list.get(1)), c0904f3.b((InterfaceC1016s) list.get(2)));
            case 8:
                C2.f(Z.WHILE, 4, list);
                InterfaceC1016s interfaceC1016s3 = (InterfaceC1016s) list.get(0);
                InterfaceC1016s interfaceC1016s4 = (InterfaceC1016s) list.get(1);
                InterfaceC1016s interfaceC1016s5 = (InterfaceC1016s) list.get(2);
                InterfaceC1016s b9 = c0904f3.b((InterfaceC1016s) list.get(3));
                if (c0904f3.b(interfaceC1016s5).d().booleanValue()) {
                    InterfaceC1016s a8 = c0904f3.a((C0909g) b9);
                    if (a8 instanceof C0954l) {
                        C0954l c0954l2 = (C0954l) a8;
                        if (!"break".equals(c0954l2.b())) {
                            if ("return".equals(c0954l2.b())) {
                                return c0954l2;
                            }
                        }
                        return InterfaceC1016s.f11133d;
                    }
                }
                while (c0904f3.b(interfaceC1016s3).d().booleanValue()) {
                    InterfaceC1016s a9 = c0904f3.a((C0909g) b9);
                    if (a9 instanceof C0954l) {
                        C0954l c0954l3 = (C0954l) a9;
                        if ("break".equals(c0954l3.b())) {
                            return InterfaceC1016s.f11133d;
                        }
                        if ("return".equals(c0954l3.b())) {
                            return c0954l3;
                        }
                    }
                    c0904f3.b(interfaceC1016s4);
                }
                return InterfaceC1016s.f11133d;
            default:
                return super.a(str);
        }
    }
}
