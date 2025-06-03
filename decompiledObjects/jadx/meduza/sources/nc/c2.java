package nc;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<x0> f11479a = new ThreadLocal<>();

    public static x0 a() {
        ThreadLocal<x0> threadLocal = f11479a;
        x0 x0Var = threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
