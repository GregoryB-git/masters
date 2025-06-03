package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0767n {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9031a = c();

    public static C0768o a() {
        if (f9031a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0768o.f9035e;
    }

    public static final C0768o b(String str) {
        return (C0768o) f9031a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
