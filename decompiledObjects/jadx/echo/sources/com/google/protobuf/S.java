package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final P f12001a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final P f12002b = new Q();

    public static P a() {
        return f12001a;
    }

    public static P b() {
        return f12002b;
    }

    public static P c() {
        try {
            return (P) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
