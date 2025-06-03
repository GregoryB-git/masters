package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f11314c = new a0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f11316b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f11315a = new G();

    public static a0 a() {
        return f11314c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC1110z.b(cls, "messageType");
        AbstractC1110z.b(e0Var, "schema");
        return (e0) this.f11316b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        AbstractC1110z.b(cls, "messageType");
        e0 e0Var = (e0) this.f11316b.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        e0 a7 = this.f11315a.a(cls);
        e0 b7 = b(cls, a7);
        return b7 != null ? b7 : a7;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
