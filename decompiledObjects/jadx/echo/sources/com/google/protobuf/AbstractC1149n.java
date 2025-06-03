package com.google.protobuf;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1149n {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1147l f12157a = new C1148m();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1147l f12158b = c();

    public static AbstractC1147l a() {
        AbstractC1147l abstractC1147l = f12158b;
        if (abstractC1147l != null) {
            return abstractC1147l;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC1147l b() {
        return f12157a;
    }

    public static AbstractC1147l c() {
        try {
            return (AbstractC1147l) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
