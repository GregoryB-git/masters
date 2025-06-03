package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class H4 {

    /* renamed from: a, reason: collision with root package name */
    public static final F4 f10399a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final F4 f10400b = new E4();

    public static F4 a() {
        return f10399a;
    }

    public static F4 b() {
        return f10400b;
    }

    public static F4 c() {
        try {
            return (F4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
