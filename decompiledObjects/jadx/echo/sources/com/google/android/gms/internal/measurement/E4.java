package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E4 implements F4 {
    @Override // com.google.android.gms.internal.measurement.F4
    public final D4 b(Object obj) {
        android.support.v4.media.a.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final Map c(Object obj) {
        return (C4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final Object d(Object obj, Object obj2) {
        C4 c42 = (C4) obj;
        C4 c43 = (C4) obj2;
        if (!c43.isEmpty()) {
            if (!c42.j()) {
                c42 = c42.f();
            }
            c42.d(c43);
        }
        return c42;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final Object e(Object obj) {
        ((C4) obj).g();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final Object f(Object obj) {
        return C4.b().f();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final boolean g(Object obj) {
        return !((C4) obj).j();
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final Map h(Object obj) {
        return (C4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final int i(int i7, Object obj, Object obj2) {
        C4 c42 = (C4) obj;
        android.support.v4.media.a.a(obj2);
        if (c42.isEmpty()) {
            return 0;
        }
        Iterator it = c42.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
