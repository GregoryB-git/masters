package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes.dex */
public abstract class y {
    public static List a(Object obj) {
        if ((obj instanceof h6.a) && !(obj instanceof h6.b)) {
            h(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i7) {
        if (obj != null && !e(obj, i7)) {
            h(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e7) {
            throw g(e7);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof g6.a) {
            return 0;
        }
        if (obj instanceof g6.l) {
            return 1;
        }
        if (obj instanceof g6.p) {
            return 2;
        }
        return obj instanceof g6.q ? 3 : -1;
    }

    public static boolean e(Object obj, int i7) {
        return (obj instanceof V5.c) && d(obj) == i7;
    }

    public static Throwable f(Throwable th) {
        return Intrinsics.h(th, y.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
