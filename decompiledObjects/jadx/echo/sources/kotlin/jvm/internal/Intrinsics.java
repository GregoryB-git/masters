package kotlin.jvm.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Intrinsics {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            j();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            k(str);
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) g(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            l(str);
        }
    }

    public static int d(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    public static int e(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    public static String f(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static Throwable g(Throwable th) {
        return h(th, Intrinsics.class.getName());
    }

    public static Throwable h(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
        return th;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static void j() {
        throw ((NullPointerException) g(new NullPointerException()));
    }

    public static void k(String str) {
        throw ((NullPointerException) g(new NullPointerException(str)));
    }

    public static void l(String str) {
        throw ((NullPointerException) g(new NullPointerException(f(str))));
    }

    public static void m(String str) {
        throw ((V5.s) g(new V5.s(str)));
    }

    public static void n(String str) {
        m("lateinit property " + str + " has not been initialized");
    }
}
