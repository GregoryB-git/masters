package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0757d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8948a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8949b;

    static {
        f8949b = a("org.robolectric.Robolectric") != null;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f8948a;
    }

    public static boolean c() {
        return (f8948a == null || f8949b) ? false : true;
    }
}
