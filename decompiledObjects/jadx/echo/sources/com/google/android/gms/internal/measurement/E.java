package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public Map f10360a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public U f10361b = new U();

    public E() {
        b(new C1070y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    public final InterfaceC1016s a(C0904f3 c0904f3, InterfaceC1016s interfaceC1016s) {
        C2.b(c0904f3);
        if (!(interfaceC1016s instanceof C1043v)) {
            return interfaceC1016s;
        }
        C1043v c1043v = (C1043v) interfaceC1016s;
        ArrayList b7 = c1043v.b();
        String a7 = c1043v.a();
        return (this.f10360a.containsKey(a7) ? (A) this.f10360a.get(a7) : this.f10361b).b(a7, c0904f3, b7);
    }

    public final void b(A a7) {
        Iterator it = a7.f10287a.iterator();
        while (it.hasNext()) {
            this.f10360a.put(((Z) it.next()).toString(), a7);
        }
    }
}
