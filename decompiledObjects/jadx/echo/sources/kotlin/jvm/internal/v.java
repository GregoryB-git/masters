package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final w f16231a;

    /* renamed from: b, reason: collision with root package name */
    public static final m6.c[] f16232b;

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        f16231a = wVar;
        f16232b = new m6.c[0];
    }

    public static m6.e a(i iVar) {
        return f16231a.a(iVar);
    }

    public static m6.c b(Class cls) {
        return f16231a.b(cls);
    }

    public static m6.d c(Class cls) {
        return f16231a.c(cls, "");
    }

    public static m6.f d(n nVar) {
        return f16231a.d(nVar);
    }

    public static m6.g e(p pVar) {
        return f16231a.e(pVar);
    }

    public static String f(h hVar) {
        return f16231a.f(hVar);
    }

    public static String g(l lVar) {
        return f16231a.g(lVar);
    }
}
