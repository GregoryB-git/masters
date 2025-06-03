package r3;

import c3.C0847y;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920b {

    /* renamed from: a, reason: collision with root package name */
    public final C1919a f19078a;

    public C1920b(C1919a c1919a) {
        this.f19078a = c1919a;
    }

    public static C1920b a(byte[] bArr, C0847y c0847y) {
        if (c0847y != null) {
            return new C1920b(C1919a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.f19078a.c();
    }
}
