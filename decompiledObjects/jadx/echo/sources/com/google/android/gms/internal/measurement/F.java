package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends A {
    public F() {
        this.f10287a.add(Z.APPLY);
        this.f10287a.add(Z.BLOCK);
        this.f10287a.add(Z.BREAK);
        this.f10287a.add(Z.CASE);
        this.f10287a.add(Z.DEFAULT);
        this.f10287a.add(Z.CONTINUE);
        this.f10287a.add(Z.DEFINE_FUNCTION);
        this.f10287a.add(Z.FN);
        this.f10287a.add(Z.IF);
        this.f10287a.add(Z.QUOTE);
        this.f10287a.add(Z.RETURN);
        this.f10287a.add(Z.SWITCH);
        this.f10287a.add(Z.TERNARY);
    }

    public static InterfaceC1016s c(C0904f3 c0904f3, List list) {
        C2.j(Z.FN, 2, list);
        InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
        InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(1));
        if (!(b8 instanceof C0909g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b8.getClass().getCanonicalName()));
        }
        List a02 = ((C0909g) b8).a0();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1025t(b7.g(), a02, arrayList, c0904f3);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        int i7 = 0;
        switch (I.f10404a[C2.c(str).ordinal()]) {
            case 1:
                C2.f(Z.APPLY, 3, list);
                InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
                String g7 = c0904f3.b((InterfaceC1016s) list.get(1)).g();
                InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(2));
                if (!(b8 instanceof C0909g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b8.getClass().getCanonicalName()));
                }
                if (g7.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return b7.s(g7, c0904f3, ((C0909g) b8).a0());
            case 2:
                return c0904f3.d().a(new C0909g(list));
            case 3:
                C2.f(Z.BREAK, 0, list);
                return InterfaceC1016s.f11136g;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC1016s b9 = c0904f3.b((InterfaceC1016s) list.get(0));
                    if (b9 instanceof C0909g) {
                        return c0904f3.a((C0909g) b9);
                    }
                }
                return InterfaceC1016s.f11133d;
            case 6:
                C2.f(Z.BREAK, 0, list);
                return InterfaceC1016s.f11135f;
            case 7:
                C2.j(Z.DEFINE_FUNCTION, 2, list);
                C1025t c1025t = (C1025t) c(c0904f3, list);
                c0904f3.h(c1025t.e() == null ? "" : c1025t.e(), c1025t);
                return c1025t;
            case 8:
                return c(c0904f3, list);
            case 9:
                C2.j(Z.IF, 2, list);
                InterfaceC1016s b10 = c0904f3.b((InterfaceC1016s) list.get(0));
                InterfaceC1016s b11 = c0904f3.b((InterfaceC1016s) list.get(1));
                InterfaceC1016s b12 = list.size() > 2 ? c0904f3.b((InterfaceC1016s) list.get(2)) : null;
                InterfaceC1016s interfaceC1016s = InterfaceC1016s.f11133d;
                InterfaceC1016s a7 = b10.d().booleanValue() ? c0904f3.a((C0909g) b11) : b12 != null ? c0904f3.a((C0909g) b12) : interfaceC1016s;
                return a7 instanceof C0954l ? a7 : interfaceC1016s;
            case 10:
                return new C0909g(list);
            case 11:
                if (list.isEmpty()) {
                    return InterfaceC1016s.f11137h;
                }
                C2.f(Z.RETURN, 1, list);
                return new C0954l("return", c0904f3.b((InterfaceC1016s) list.get(0)));
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C2.f(Z.SWITCH, 3, list);
                InterfaceC1016s b13 = c0904f3.b((InterfaceC1016s) list.get(0));
                InterfaceC1016s b14 = c0904f3.b((InterfaceC1016s) list.get(1));
                InterfaceC1016s b15 = c0904f3.b((InterfaceC1016s) list.get(2));
                if (!(b14 instanceof C0909g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(b15 instanceof C0909g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C0909g c0909g = (C0909g) b14;
                C0909g c0909g2 = (C0909g) b15;
                boolean z7 = false;
                while (true) {
                    if (i7 < c0909g.U()) {
                        if (z7 || b13.equals(c0904f3.b(c0909g.M(i7)))) {
                            InterfaceC1016s b16 = c0904f3.b(c0909g2.M(i7));
                            if (!(b16 instanceof C0954l)) {
                                z7 = true;
                            } else if (!((C0954l) b16).b().equals("break")) {
                                return b16;
                            }
                        }
                        i7++;
                    } else if (c0909g.U() + 1 == c0909g2.U()) {
                        InterfaceC1016s b17 = c0904f3.b(c0909g2.M(c0909g.U()));
                        if (b17 instanceof C0954l) {
                            String b18 = ((C0954l) b17).b();
                            if (b18.equals("return") || b18.equals("continue")) {
                                return b17;
                            }
                        }
                    }
                }
                return InterfaceC1016s.f11133d;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C2.f(Z.TERNARY, 3, list);
                return c0904f3.b((InterfaceC1016s) list.get(0)).d().booleanValue() ? c0904f3.b((InterfaceC1016s) list.get(1)) : c0904f3.b((InterfaceC1016s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
