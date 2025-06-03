package com.google.android.gms.internal.measurement;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class H {
    public static C0909g a(C0909g c0909g, C0904f3 c0904f3, AbstractC0972n abstractC0972n) {
        return b(c0909g, c0904f3, abstractC0972n, null, null);
    }

    public static C0909g b(C0909g c0909g, C0904f3 c0904f3, AbstractC0972n abstractC0972n, Boolean bool, Boolean bool2) {
        C0909g c0909g2 = new C0909g();
        Iterator Z6 = c0909g.Z();
        while (Z6.hasNext()) {
            int intValue = ((Integer) Z6.next()).intValue();
            if (c0909g.Y(intValue)) {
                InterfaceC1016s b7 = abstractC0972n.b(c0904f3, Arrays.asList(c0909g.M(intValue), new C0945k(Double.valueOf(intValue)), c0909g));
                if (b7.d().equals(bool)) {
                    return c0909g2;
                }
                if (bool2 == null || b7.d().equals(bool2)) {
                    c0909g2.X(intValue, b7);
                }
            }
        }
        return c0909g2;
    }

    public static InterfaceC1016s c(C0909g c0909g, C0904f3 c0904f3, List list, boolean z7) {
        InterfaceC1016s interfaceC1016s;
        C2.k("reduce", 1, list);
        C2.n("reduce", 2, list);
        InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(0));
        if (!(b7 instanceof AbstractC0972n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC1016s = c0904f3.b((InterfaceC1016s) list.get(1));
            if (interfaceC1016s instanceof C0954l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c0909g.U() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1016s = null;
        }
        AbstractC0972n abstractC0972n = (AbstractC0972n) b7;
        int U6 = c0909g.U();
        int i7 = z7 ? 0 : U6 - 1;
        int i8 = z7 ? U6 - 1 : 0;
        int i9 = z7 ? 1 : -1;
        if (interfaceC1016s == null) {
            interfaceC1016s = c0909g.M(i7);
            i7 += i9;
        }
        while ((i8 - i7) * i9 >= 0) {
            if (c0909g.Y(i7)) {
                interfaceC1016s = abstractC0972n.b(c0904f3, Arrays.asList(interfaceC1016s, c0909g.M(i7), new C0945k(Double.valueOf(i7)), c0909g));
                if (interfaceC1016s instanceof C0954l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i7 += i9;
            } else {
                i7 += i9;
            }
        }
        return interfaceC1016s;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC1016s d(String str, C0909g c0909g, C0904f3 c0904f3, List list) {
        String str2;
        char c7;
        String str3;
        AbstractC0972n abstractC0972n;
        int i7;
        C0904f3 c0904f32;
        str.hashCode();
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c7 = 1;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c7 = 2;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c7 = 3;
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c7 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c7 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c7 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c7 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c7 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c7 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c7 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c7 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c7 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c7 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c7 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c7 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c7 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c7 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c7 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c7 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c7 = 65535;
                break;
            default:
                str2 = "toString";
                c7 = 65535;
                break;
        }
        double d7 = 0.0d;
        switch (c7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                C2.g(str2, 0, list);
                return new C1034u(c0909g.toString());
            case 1:
                C0909g c0909g2 = (C0909g) c0909g.c();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) it.next());
                        if (b7 instanceof C0954l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int U6 = c0909g2.U();
                        if (b7 instanceof C0909g) {
                            C0909g c0909g3 = (C0909g) b7;
                            Iterator Z6 = c0909g3.Z();
                            while (Z6.hasNext()) {
                                Integer num = (Integer) Z6.next();
                                c0909g2.X(num.intValue() + U6, c0909g3.M(num.intValue()));
                            }
                        } else {
                            c0909g2.X(U6, b7);
                        }
                    }
                }
                return c0909g2;
            case 2:
                C2.g("filter", 1, list);
                InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (!(b8 instanceof C1025t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0909g.D() == 0) {
                    return new C0909g();
                }
                C0909g c0909g4 = (C0909g) c0909g.c();
                C0909g b9 = b(c0909g, c0904f3, (C1025t) b8, null, Boolean.TRUE);
                C0909g c0909g5 = new C0909g();
                Iterator Z7 = b9.Z();
                while (Z7.hasNext()) {
                    c0909g5.T(c0909g4.M(((Integer) Z7.next()).intValue()));
                }
                return c0909g5;
            case 3:
                return c(c0909g, c0904f3, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C0909g();
                }
                int a7 = (int) C2.a(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue());
                if (a7 < 0) {
                    a7 = Math.max(0, a7 + c0909g.U());
                } else if (a7 > c0909g.U()) {
                    a7 = c0909g.U();
                }
                int U7 = c0909g.U();
                C0909g c0909g6 = new C0909g();
                if (list.size() <= 1) {
                    while (a7 < U7) {
                        c0909g6.T(c0909g.M(a7));
                        c0909g.X(a7, null);
                        a7++;
                    }
                    return c0909g6;
                }
                int max = Math.max(0, (int) C2.a(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue()));
                if (max > 0) {
                    for (int i8 = a7; i8 < Math.min(U7, a7 + max); i8++) {
                        c0909g6.T(c0909g.M(a7));
                        c0909g.W(a7);
                    }
                }
                if (list.size() > 2) {
                    for (int i9 = 2; i9 < list.size(); i9++) {
                        InterfaceC1016s b10 = c0904f3.b((InterfaceC1016s) list.get(i9));
                        if (b10 instanceof C0954l) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        c0909g.S((a7 + i9) - 2, b10);
                    }
                }
                return c0909g6;
            case 5:
                C2.g("forEach", 1, list);
                InterfaceC1016s b11 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (!(b11 instanceof C1025t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0909g.D() == 0) {
                    return InterfaceC1016s.f11133d;
                }
                a(c0909g, c0904f3, (C1025t) b11);
                return InterfaceC1016s.f11133d;
            case 6:
                C2.n("lastIndexOf", 2, list);
                InterfaceC1016s interfaceC1016s = InterfaceC1016s.f11133d;
                if (!list.isEmpty()) {
                    interfaceC1016s = c0904f3.b((InterfaceC1016s) list.get(0));
                }
                double U8 = c0909g.U() - 1;
                if (list.size() > 1) {
                    InterfaceC1016s b12 = c0904f3.b((InterfaceC1016s) list.get(1));
                    U8 = Double.isNaN(b12.f().doubleValue()) ? c0909g.U() - 1 : C2.a(b12.f().doubleValue());
                    if (U8 < 0.0d) {
                        U8 += c0909g.U();
                    }
                }
                if (U8 < 0.0d) {
                    return new C0945k(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(c0909g.U(), U8); min >= 0; min--) {
                    if (c0909g.Y(min) && C2.h(c0909g.M(min), interfaceC1016s)) {
                        return new C0945k(Double.valueOf(min));
                    }
                }
                return new C0945k(Double.valueOf(-1.0d));
            case 7:
                if (!list.isEmpty()) {
                    C0909g c0909g7 = new C0909g();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1016s b13 = c0904f3.b((InterfaceC1016s) it2.next());
                        if (b13 instanceof C0954l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c0909g7.T(b13);
                    }
                    int U9 = c0909g7.U();
                    Iterator Z8 = c0909g.Z();
                    while (Z8.hasNext()) {
                        Integer num2 = (Integer) Z8.next();
                        c0909g7.X(num2.intValue() + U9, c0909g.M(num2.intValue()));
                    }
                    c0909g.b0();
                    Iterator Z9 = c0909g7.Z();
                    while (Z9.hasNext()) {
                        Integer num3 = (Integer) Z9.next();
                        c0909g.X(num3.intValue(), c0909g7.M(num3.intValue()));
                    }
                }
                return new C0945k(Double.valueOf(c0909g.U()));
            case '\b':
                C2.g("map", 1, list);
                InterfaceC1016s b14 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (b14 instanceof C1025t) {
                    return c0909g.U() == 0 ? new C0909g() : a(c0909g, c0904f3, (C1025t) b14);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                C2.g("pop", 0, list);
                int U10 = c0909g.U();
                if (U10 == 0) {
                    return InterfaceC1016s.f11133d;
                }
                int i10 = U10 - 1;
                InterfaceC1016s M6 = c0909g.M(i10);
                c0909g.W(i10);
                return M6;
            case '\n':
                C2.n("join", 1, list);
                if (c0909g.U() == 0) {
                    return InterfaceC1016s.f11140k;
                }
                if (list.isEmpty()) {
                    str3 = ",";
                } else {
                    InterfaceC1016s b15 = c0904f3.b((InterfaceC1016s) list.get(0));
                    str3 = ((b15 instanceof C0999q) || (b15 instanceof C1078z)) ? "" : b15.g();
                }
                return new C1034u(c0909g.V(str3));
            case 11:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c0909g.T(c0904f3.b((InterfaceC1016s) it3.next()));
                    }
                }
                return new C0945k(Double.valueOf(c0909g.U()));
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C2.g("some", 1, list);
                InterfaceC1016s b16 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (!(b16 instanceof AbstractC0972n)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0909g.U() != 0) {
                    AbstractC0972n abstractC0972n2 = (AbstractC0972n) b16;
                    Iterator Z10 = c0909g.Z();
                    while (Z10.hasNext()) {
                        int intValue = ((Integer) Z10.next()).intValue();
                        if (c0909g.Y(intValue) && abstractC0972n2.b(c0904f3, Arrays.asList(c0909g.M(intValue), new C0945k(Double.valueOf(intValue)), c0909g)).d().booleanValue()) {
                            return InterfaceC1016s.f11138i;
                        }
                    }
                }
                return InterfaceC1016s.f11139j;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C2.n("sort", 1, list);
                if (c0909g.U() >= 2) {
                    List a02 = c0909g.a0();
                    if (list.isEmpty()) {
                        abstractC0972n = null;
                    } else {
                        InterfaceC1016s b17 = c0904f3.b((InterfaceC1016s) list.get(0));
                        if (!(b17 instanceof AbstractC0972n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC0972n = (AbstractC0972n) b17;
                    }
                    Collections.sort(a02, new K(abstractC0972n, c0904f3));
                    c0909g.b0();
                    Iterator it4 = a02.iterator();
                    int i11 = 0;
                    while (it4.hasNext()) {
                        c0909g.X(i11, (InterfaceC1016s) it4.next());
                        i11++;
                    }
                }
                return c0909g;
            case 14:
                C2.g("every", 1, list);
                InterfaceC1016s b18 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (b18 instanceof C1025t) {
                    return (c0909g.U() == 0 || b(c0909g, c0904f3, (C1025t) b18, Boolean.FALSE, Boolean.TRUE).U() == c0909g.U()) ? InterfaceC1016s.f11138i : InterfaceC1016s.f11139j;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                C2.g("shift", 0, list);
                if (c0909g.U() == 0) {
                    return InterfaceC1016s.f11133d;
                }
                InterfaceC1016s M7 = c0909g.M(0);
                c0909g.W(0);
                return M7;
            case 16:
                C2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c0909g.c();
                }
                double U11 = c0909g.U();
                double a8 = C2.a(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue());
                double max2 = a8 < 0.0d ? Math.max(a8 + U11, 0.0d) : Math.min(a8, U11);
                if (list.size() == 2) {
                    double a9 = C2.a(c0904f3.b((InterfaceC1016s) list.get(1)).f().doubleValue());
                    U11 = a9 < 0.0d ? Math.max(U11 + a9, 0.0d) : Math.min(U11, a9);
                }
                C0909g c0909g8 = new C0909g();
                for (int i12 = (int) max2; i12 < U11; i12++) {
                    c0909g8.T(c0909g.M(i12));
                }
                return c0909g8;
            case 17:
                return c(c0909g, c0904f3, list, false);
            case 18:
                C2.g("reverse", 0, list);
                int U12 = c0909g.U();
                if (U12 != 0) {
                    int i13 = 0;
                    while (i13 < U12 / 2) {
                        if (c0909g.Y(i13)) {
                            InterfaceC1016s M8 = c0909g.M(i13);
                            c0909g.X(i13, null);
                            i7 = 1;
                            int i14 = (U12 - 1) - i13;
                            if (c0909g.Y(i14)) {
                                c0909g.X(i13, c0909g.M(i14));
                            }
                            c0909g.X(i14, M8);
                        } else {
                            i7 = 1;
                        }
                        i13 += i7;
                    }
                }
                return c0909g;
            case 19:
                C2.n("indexOf", 2, list);
                InterfaceC1016s interfaceC1016s2 = InterfaceC1016s.f11133d;
                if (list.isEmpty()) {
                    c0904f32 = c0904f3;
                } else {
                    c0904f32 = c0904f3;
                    interfaceC1016s2 = c0904f32.b((InterfaceC1016s) list.get(0));
                }
                if (list.size() > 1) {
                    double a10 = C2.a(c0904f32.b((InterfaceC1016s) list.get(1)).f().doubleValue());
                    if (a10 >= c0909g.U()) {
                        return new C0945k(Double.valueOf(-1.0d));
                    }
                    d7 = a10 < 0.0d ? c0909g.U() + a10 : a10;
                }
                Iterator Z11 = c0909g.Z();
                while (Z11.hasNext()) {
                    int intValue2 = ((Integer) Z11.next()).intValue();
                    double d8 = intValue2;
                    if (d8 >= d7 && C2.h(c0909g.M(intValue2), interfaceC1016s2)) {
                        return new C0945k(Double.valueOf(d8));
                    }
                }
                return new C0945k(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
