package com.google.protobuf;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1145j {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12085a = c();

    public static C1146k a() {
        C1146k b7 = b("getEmptyRegistry");
        return b7 != null ? b7 : C1146k.f12094d;
    }

    public static final C1146k b(String str) {
        Class cls = f12085a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1146k) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
