package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1089d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11326a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f11327b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f11328c;

    static {
        f11328c = (f11326a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f11327b;
    }

    public static boolean c() {
        return f11326a || !(f11327b == null || f11328c);
    }
}
