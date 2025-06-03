package com.google.protobuf;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1152q implements J {

    /* renamed from: a, reason: collision with root package name */
    public static final C1152q f12235a = new C1152q();

    public static C1152q c() {
        return f12235a;
    }

    @Override // com.google.protobuf.J
    public I a(Class cls) {
        if (!r.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (I) r.A(cls.asSubclass(r.class)).m();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // com.google.protobuf.J
    public boolean b(Class cls) {
        return r.class.isAssignableFrom(cls);
    }
}
