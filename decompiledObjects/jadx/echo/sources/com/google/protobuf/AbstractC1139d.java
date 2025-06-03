package com.google.protobuf;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1139d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12043a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12044b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f12045c;

    static {
        f12045c = (f12043a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f12044b;
    }

    public static boolean c() {
        return f12043a || !(f12044b == null || f12045c);
    }
}
