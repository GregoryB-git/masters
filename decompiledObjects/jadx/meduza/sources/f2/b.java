package f2;

import android.app.Activity;
import dc.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f5305a;

    public static final class a<T> implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final jc.c<T> f5306a;

        /* renamed from: b, reason: collision with root package name */
        public final l<T, rb.h> f5307b;

        public a(ec.d dVar, k2.b bVar) {
            this.f5306a = dVar;
            this.f5307b = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.b.a.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: f2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0079b {
        void dispose();
    }

    public b(ClassLoader classLoader) {
        this.f5305a = classLoader;
    }

    public final c a(Object obj, ec.d dVar, Activity activity, k2.b bVar) {
        ec.i.e(obj, "obj");
        ec.i.e(activity, "activity");
        Object newProxyInstance = Proxy.newProxyInstance(this.f5305a, new Class[]{b()}, new a(dVar, bVar));
        ec.i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new c(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public final Class<?> b() {
        Class<?> loadClass = this.f5305a.loadClass("java.util.function.Consumer");
        ec.i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
