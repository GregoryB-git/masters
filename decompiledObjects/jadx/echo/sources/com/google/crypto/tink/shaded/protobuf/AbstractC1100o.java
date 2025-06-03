package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1100o {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11400a = c();

    public static C1101p a() {
        C1101p b7 = b("getEmptyRegistry");
        return b7 != null ? b7 : C1101p.f11427d;
    }

    public static final C1101p b(String str) {
        Class cls = f11400a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1101p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
