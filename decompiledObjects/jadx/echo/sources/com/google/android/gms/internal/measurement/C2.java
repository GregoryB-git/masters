package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class C2 {
    public static double a(double d7) {
        if (Double.isNaN(d7)) {
            return 0.0d;
        }
        if (Double.isInfinite(d7) || d7 == 0.0d || d7 == -0.0d) {
            return d7;
        }
        return (d7 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d7));
    }

    public static int b(C0904f3 c0904f3) {
        int i7 = i(c0904f3.c("runtime.counter").f().doubleValue() + 1.0d);
        if (i7 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c0904f3.h("runtime.counter", new C0945k(Double.valueOf(i7)));
        return i7;
    }

    public static Z c(String str) {
        Z c7 = (str == null || str.isEmpty()) ? null : Z.c(Integer.parseInt(str));
        if (c7 != null) {
            return c7;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC1016s interfaceC1016s) {
        if (InterfaceC1016s.f11134e.equals(interfaceC1016s)) {
            return null;
        }
        if (InterfaceC1016s.f11133d.equals(interfaceC1016s)) {
            return "";
        }
        if (interfaceC1016s instanceof r) {
            return e((r) interfaceC1016s);
        }
        if (!(interfaceC1016s instanceof C0909g)) {
            return !interfaceC1016s.f().isNaN() ? interfaceC1016s.f() : interfaceC1016s.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0909g) interfaceC1016s).iterator();
        while (it.hasNext()) {
            Object d7 = d((InterfaceC1016s) it.next());
            if (d7 != null) {
                arrayList.add(d7);
            }
        }
        return arrayList;
    }

    public static Map e(r rVar) {
        HashMap hashMap = new HashMap();
        for (String str : rVar.b()) {
            Object d7 = d(rVar.i(str));
            if (d7 != null) {
                hashMap.put(str, d7);
            }
        }
        return hashMap;
    }

    public static void f(Z z7, int i7, List list) {
        g(z7.name(), i7, list);
    }

    public static void g(String str, int i7, List list) {
        if (list.size() != i7) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC1016s interfaceC1016s, InterfaceC1016s interfaceC1016s2) {
        if (!interfaceC1016s.getClass().equals(interfaceC1016s2.getClass())) {
            return false;
        }
        if ((interfaceC1016s instanceof C1078z) || (interfaceC1016s instanceof C0999q)) {
            return true;
        }
        if (!(interfaceC1016s instanceof C0945k)) {
            return interfaceC1016s instanceof C1034u ? interfaceC1016s.g().equals(interfaceC1016s2.g()) : interfaceC1016s instanceof C0918h ? interfaceC1016s.d().equals(interfaceC1016s2.d()) : interfaceC1016s == interfaceC1016s2;
        }
        if (Double.isNaN(interfaceC1016s.f().doubleValue()) || Double.isNaN(interfaceC1016s2.f().doubleValue())) {
            return false;
        }
        return interfaceC1016s.f().equals(interfaceC1016s2.f());
    }

    public static int i(double d7) {
        if (Double.isNaN(d7) || Double.isInfinite(d7) || d7 == 0.0d) {
            return 0;
        }
        return (int) (((d7 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d7))) % 4.294967296E9d);
    }

    public static void j(Z z7, int i7, List list) {
        k(z7.name(), i7, list);
    }

    public static void k(String str, int i7, List list) {
        if (list.size() < i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC1016s interfaceC1016s) {
        if (interfaceC1016s == null) {
            return false;
        }
        Double f7 = interfaceC1016s.f();
        return !f7.isNaN() && f7.doubleValue() >= 0.0d && f7.equals(Double.valueOf(Math.floor(f7.doubleValue())));
    }

    public static long m(double d7) {
        return i(d7) & 4294967295L;
    }

    public static void n(String str, int i7, List list) {
        if (list.size() > i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }
}
