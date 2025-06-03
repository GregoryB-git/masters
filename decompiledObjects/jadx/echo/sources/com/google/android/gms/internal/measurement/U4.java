package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class U4 {

    /* renamed from: c, reason: collision with root package name */
    public static final U4 f10658c = new U4();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f10660b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0870b5 f10659a = new C1048v4();

    public static U4 a() {
        return f10658c;
    }

    public final Z4 b(Class cls) {
        AbstractC0860a4.f(cls, "messageType");
        Z4 z42 = (Z4) this.f10660b.get(cls);
        if (z42 != null) {
            return z42;
        }
        Z4 a7 = this.f10659a.a(cls);
        AbstractC0860a4.f(cls, "messageType");
        AbstractC0860a4.f(a7, "schema");
        Z4 z43 = (Z4) this.f10660b.putIfAbsent(cls, a7);
        return z43 != null ? z43 : a7;
    }

    public final Z4 c(Object obj) {
        return b(obj.getClass());
    }
}
