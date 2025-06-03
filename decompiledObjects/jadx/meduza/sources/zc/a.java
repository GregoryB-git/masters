package zc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: zc.a$a, reason: collision with other inner class name */
    public static class C0270a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final Object f17825a;

        public C0270a(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
            this.f17825a = featureFlagHolderBoundaryInterface;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return Class.forName(method.getDeclaringClass().getName(), true, this.f17825a.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f17825a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    public static <T> T a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
