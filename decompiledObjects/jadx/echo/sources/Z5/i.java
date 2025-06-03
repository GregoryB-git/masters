package Z5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7880a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final a f7881b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    public static a f7882c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f7883a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f7884b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f7885c;

        public a(Method method, Method method2, Method method3) {
            this.f7883a = method;
            this.f7884b = method2;
            this.f7885c = method3;
        }
    }

    public final a a(Z5.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f7882c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f7881b;
            f7882c = aVar3;
            return aVar3;
        }
    }

    public final String b(Z5.a continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVar = f7882c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f7881b) {
            return null;
        }
        Method method = aVar.f7883a;
        Object invoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.f7884b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.f7885c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
