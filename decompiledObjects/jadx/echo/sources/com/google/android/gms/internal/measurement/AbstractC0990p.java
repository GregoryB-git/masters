package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0990p {
    public static InterfaceC1016s a(InterfaceC0963m interfaceC0963m, InterfaceC1016s interfaceC1016s, C0904f3 c0904f3, List list) {
        if (interfaceC0963m.q(interfaceC1016s.g())) {
            InterfaceC1016s i7 = interfaceC0963m.i(interfaceC1016s.g());
            if (i7 instanceof AbstractC0972n) {
                return ((AbstractC0972n) i7).b(c0904f3, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC1016s.g()));
        }
        if (!"hasOwnProperty".equals(interfaceC1016s.g())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC1016s.g()));
        }
        C2.g("hasOwnProperty", 1, list);
        return interfaceC0963m.q(c0904f3.b((InterfaceC1016s) list.get(0)).g()) ? InterfaceC1016s.f11138i : InterfaceC1016s.f11139j;
    }

    public static Iterator b(Map map) {
        return new C0981o(map.keySet().iterator());
    }
}
