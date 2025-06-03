package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class X extends A {
    public X() {
        this.f10287a.add(Z.ASSIGN);
        this.f10287a.add(Z.CONST);
        this.f10287a.add(Z.CREATE_ARRAY);
        this.f10287a.add(Z.CREATE_OBJECT);
        this.f10287a.add(Z.EXPRESSION_LIST);
        this.f10287a.add(Z.GET);
        this.f10287a.add(Z.GET_INDEX);
        this.f10287a.add(Z.GET_PROPERTY);
        this.f10287a.add(Z.NULL);
        this.f10287a.add(Z.SET_PROPERTY);
        this.f10287a.add(Z.TYPEOF);
        this.f10287a.add(Z.UNDEFINED);
        this.f10287a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        String str2;
        int i7 = 0;
        switch (W.f10696a[C2.c(str).ordinal()]) {
            case 1:
                C2.f(Z.ASSIGN, 2, list);
                InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (!(b7 instanceof C1034u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b7.getClass().getCanonicalName()));
                }
                if (!c0904f3.g(b7.g())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b7.g()));
                }
                InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(1));
                c0904f3.h(b7.g(), b8);
                return b8;
            case 2:
                C2.j(Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                for (int i8 = 0; i8 < list.size() - 1; i8 += 2) {
                    InterfaceC1016s b9 = c0904f3.b((InterfaceC1016s) list.get(i8));
                    if (!(b9 instanceof C1034u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b9.getClass().getCanonicalName()));
                    }
                    c0904f3.f(b9.g(), c0904f3.b((InterfaceC1016s) list.get(i8 + 1)));
                }
                return InterfaceC1016s.f11133d;
            case 3:
                if (list.isEmpty()) {
                    return new C0909g();
                }
                C0909g c0909g = new C0909g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1016s b10 = c0904f3.b((InterfaceC1016s) it.next());
                    if (b10 instanceof C0954l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c0909g.X(i7, b10);
                    i7++;
                }
                return c0909g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                r rVar = new r();
                while (i7 < list.size() - 1) {
                    InterfaceC1016s b11 = c0904f3.b((InterfaceC1016s) list.get(i7));
                    InterfaceC1016s b12 = c0904f3.b((InterfaceC1016s) list.get(i7 + 1));
                    if ((b11 instanceof C0954l) || (b12 instanceof C0954l)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.a(b11.g(), b12);
                    i7 += 2;
                }
                return rVar;
            case 5:
                C2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC1016s interfaceC1016s = InterfaceC1016s.f11133d;
                while (i7 < list.size()) {
                    interfaceC1016s = c0904f3.b((InterfaceC1016s) list.get(i7));
                    if (interfaceC1016s instanceof C0954l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i7++;
                }
                return interfaceC1016s;
            case 6:
                C2.f(Z.GET, 1, list);
                InterfaceC1016s b13 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (b13 instanceof C1034u) {
                    return c0904f3.c(b13.g());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b13.getClass().getCanonicalName()));
            case 7:
            case 8:
                C2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC1016s b14 = c0904f3.b((InterfaceC1016s) list.get(0));
                InterfaceC1016s b15 = c0904f3.b((InterfaceC1016s) list.get(1));
                if ((b14 instanceof C0909g) && C2.l(b15)) {
                    return ((C0909g) b14).M(b15.f().intValue());
                }
                if (b14 instanceof InterfaceC0963m) {
                    return ((InterfaceC0963m) b14).i(b15.g());
                }
                if (b14 instanceof C1034u) {
                    if ("length".equals(b15.g())) {
                        return new C0945k(Double.valueOf(b14.g().length()));
                    }
                    if (C2.l(b15) && b15.f().doubleValue() < b14.g().length()) {
                        return new C1034u(String.valueOf(b14.g().charAt(b15.f().intValue())));
                    }
                }
                return InterfaceC1016s.f11133d;
            case 9:
                C2.f(Z.NULL, 0, list);
                return InterfaceC1016s.f11134e;
            case 10:
                C2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC1016s b16 = c0904f3.b((InterfaceC1016s) list.get(0));
                InterfaceC1016s b17 = c0904f3.b((InterfaceC1016s) list.get(1));
                InterfaceC1016s b18 = c0904f3.b((InterfaceC1016s) list.get(2));
                if (b16 == InterfaceC1016s.f11133d || b16 == InterfaceC1016s.f11134e) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", b17.g(), b16.g()));
                }
                if ((b16 instanceof C0909g) && (b17 instanceof C0945k)) {
                    ((C0909g) b16).X(b17.f().intValue(), b18);
                } else if (b16 instanceof InterfaceC0963m) {
                    ((InterfaceC0963m) b16).a(b17.g(), b18);
                }
                return b18;
            case 11:
                C2.f(Z.TYPEOF, 1, list);
                InterfaceC1016s b19 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (b19 instanceof C1078z) {
                    str2 = "undefined";
                } else if (b19 instanceof C0918h) {
                    str2 = "boolean";
                } else if (b19 instanceof C0945k) {
                    str2 = "number";
                } else if (b19 instanceof C1034u) {
                    str2 = "string";
                } else if (b19 instanceof C1025t) {
                    str2 = "function";
                } else {
                    if ((b19 instanceof C1043v) || (b19 instanceof C0954l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b19));
                    }
                    str2 = "object";
                }
                return new C1034u(str2);
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C2.f(Z.UNDEFINED, 0, list);
                return InterfaceC1016s.f11133d;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C2.j(Z.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1016s b20 = c0904f3.b((InterfaceC1016s) it2.next());
                    if (!(b20 instanceof C1034u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b20.getClass().getCanonicalName()));
                    }
                    c0904f3.e(b20.g(), InterfaceC1016s.f11133d);
                }
                return InterfaceC1016s.f11133d;
            default:
                return super.a(str);
        }
    }
}
