package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0869b4 {
    public static InterfaceC1016s a(C1010r2 c1010r2) {
        if (c1010r2 == null) {
            return InterfaceC1016s.f11133d;
        }
        int i7 = E3.f10363a[c1010r2.H().ordinal()];
        if (i7 == 1) {
            return c1010r2.P() ? new C1034u(c1010r2.K()) : InterfaceC1016s.f11140k;
        }
        if (i7 == 2) {
            return c1010r2.O() ? new C0945k(Double.valueOf(c1010r2.G())) : new C0945k(null);
        }
        if (i7 == 3) {
            return c1010r2.N() ? new C0918h(Boolean.valueOf(c1010r2.M())) : new C0918h(null);
        }
        if (i7 != 4) {
            if (i7 == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(c1010r2));
        }
        List L6 = c1010r2.L();
        ArrayList arrayList = new ArrayList();
        Iterator it = L6.iterator();
        while (it.hasNext()) {
            arrayList.add(a((C1010r2) it.next()));
        }
        return new C1043v(c1010r2.J(), arrayList);
    }

    public static InterfaceC1016s b(Object obj) {
        if (obj == null) {
            return InterfaceC1016s.f11134e;
        }
        if (obj instanceof String) {
            return new C1034u((String) obj);
        }
        if (obj instanceof Double) {
            return new C0945k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0945k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0945k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0918h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0909g c0909g = new C0909g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0909g.T(b(it.next()));
            }
            return c0909g;
        }
        r rVar = new r();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC1016s b7 = b(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                rVar.a((String) obj2, b7);
            }
        }
        return rVar;
    }
}
