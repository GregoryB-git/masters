package ec;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f5273a;

    /* renamed from: b, reason: collision with root package name */
    public static final jc.c[] f5274b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f5273a = uVar;
        f5274b = new jc.c[0];
    }

    public static d a(Class cls) {
        f5273a.getClass();
        return new d(cls);
    }
}
