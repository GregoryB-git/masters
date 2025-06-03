package b6;

import W5.C0681k;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0806a {

    /* renamed from: b6.a$a, reason: collision with other inner class name */
    public static final class C0168a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0168a f10009a = new C0168a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f10010b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f10011c;

        static {
            Method method;
            Method method2;
            Object r7;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.b(methods);
            int length = methods.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                method = null;
                if (i8 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i8];
                if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    r7 = C0681k.r(parameterTypes);
                    if (Intrinsics.a(r7, Throwable.class)) {
                        break;
                    }
                }
                i8++;
            }
            f10010b = method2;
            int length2 = methods.length;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                Method method3 = methods[i7];
                if (Intrinsics.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i7++;
            }
            f10011c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0168a.f10010b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public j6.c b() {
        return new j6.b();
    }
}
