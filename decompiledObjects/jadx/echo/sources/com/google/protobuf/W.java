package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    public static final W f12006c = new W();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f12008b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a0 f12007a = new C();

    public static W a() {
        return f12006c;
    }

    public Z b(Class cls, Z z7) {
        AbstractC1154t.b(cls, "messageType");
        AbstractC1154t.b(z7, "schema");
        return (Z) this.f12008b.putIfAbsent(cls, z7);
    }

    public Z c(Class cls) {
        AbstractC1154t.b(cls, "messageType");
        Z z7 = (Z) this.f12008b.get(cls);
        if (z7 != null) {
            return z7;
        }
        Z a7 = this.f12007a.a(cls);
        Z b7 = b(cls, a7);
        return b7 != null ? b7 : a7;
    }

    public Z d(Object obj) {
        return c(obj.getClass());
    }
}
