package s0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f13950a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f13951b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f13950a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f13951b = cls2 != null;
    }

    public static boolean a() {
        return (f13950a == null || f13951b) ? false : true;
    }
}
