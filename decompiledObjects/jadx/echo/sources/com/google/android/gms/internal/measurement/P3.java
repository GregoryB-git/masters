package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class P3 {

    /* renamed from: a, reason: collision with root package name */
    public static final O3 f10542a = new Q3();

    /* renamed from: b, reason: collision with root package name */
    public static final O3 f10543b = c();

    public static O3 a() {
        O3 o32 = f10543b;
        if (o32 != null) {
            return o32;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static O3 b() {
        return f10542a;
    }

    public static O3 c() {
        try {
            return (O3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
