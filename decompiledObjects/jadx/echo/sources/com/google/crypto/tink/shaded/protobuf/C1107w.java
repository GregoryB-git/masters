package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1107w implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C1107w f11540a = new C1107w();

    public static C1107w c() {
        return f11540a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public M a(Class cls) {
        if (!AbstractC1108x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC1108x.v(cls.asSubclass(AbstractC1108x.class)).k();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public boolean b(Class cls) {
        return AbstractC1108x.class.isAssignableFrom(cls);
    }
}
