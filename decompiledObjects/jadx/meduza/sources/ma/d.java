package ma;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f10928a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f10929b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f10928a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f10929b = cls2 != null;
    }

    public static boolean a() {
        return (f10928a == null || f10929b) ? false : true;
    }
}
