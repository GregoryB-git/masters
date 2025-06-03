package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final F f11975a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final F f11976b = new G();

    public static F a() {
        return f11975a;
    }

    public static F b() {
        return f11976b;
    }

    public static F c() {
        try {
            return (F) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
