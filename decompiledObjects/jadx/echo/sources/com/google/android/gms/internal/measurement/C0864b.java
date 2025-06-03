package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864b {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f10833a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f10834b = new TreeMap();

    public static int a(C0904f3 c0904f3, C1025t c1025t, InterfaceC1016s interfaceC1016s) {
        InterfaceC1016s b7 = c1025t.b(c0904f3, Collections.singletonList(interfaceC1016s));
        if (b7 instanceof C0945k) {
            return C2.i(b7.f().doubleValue());
        }
        return -1;
    }

    public final void b(C0904f3 c0904f3, C0882d c0882d) {
        X5 x52 = new X5(c0882d);
        for (Integer num : this.f10833a.keySet()) {
            C0891e c0891e = (C0891e) c0882d.d().clone();
            int a7 = a(c0904f3, (C1025t) this.f10833a.get(num), x52);
            if (a7 == 2 || a7 == -1) {
                c0882d.e(c0891e);
            }
        }
        Iterator it = this.f10834b.keySet().iterator();
        while (it.hasNext()) {
            a(c0904f3, (C1025t) this.f10834b.get((Integer) it.next()), x52);
        }
    }

    public final void c(String str, int i7, C1025t c1025t, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f10834b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f10833a;
        }
        if (treeMap.containsKey(Integer.valueOf(i7))) {
            i7 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i7), c1025t);
    }
}
