package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1103s {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1102q f11471a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1102q f11472b = c();

    public static AbstractC1102q a() {
        AbstractC1102q abstractC1102q = f11472b;
        if (abstractC1102q != null) {
            return abstractC1102q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC1102q b() {
        return f11471a;
    }

    public static AbstractC1102q c() {
        try {
            return (AbstractC1102q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
