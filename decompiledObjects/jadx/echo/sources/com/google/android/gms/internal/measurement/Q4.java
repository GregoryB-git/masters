package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class Q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final P4 f10553a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final P4 f10554b = new R4();

    public static P4 a() {
        return f10553a;
    }

    public static P4 b() {
        return f10554b;
    }

    public static P4 c() {
        try {
            return (P4) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
