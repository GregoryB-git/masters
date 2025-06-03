package W2;

/* loaded from: classes.dex */
public abstract class m {
    public static String a(int i7, int i8, String str) {
        if (i7 < 0) {
            return r.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return r.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    public static String b(int i7, int i8, String str) {
        if (i7 < 0) {
            return r.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return r.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    public static String c(int i7, int i8, int i9) {
        return (i7 < 0 || i7 > i9) ? b(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? b(i8, i9, "end index") : r.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
    }

    public static void d(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z7, String str, int i7, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(r.a(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    public static void g(boolean z7, String str, long j7) {
        if (!z7) {
            throw new IllegalArgumentException(r.a(str, Long.valueOf(j7)));
        }
    }

    public static int h(int i7, int i8) {
        return i(i7, i8, "index");
    }

    public static int i(int i7, int i8, String str) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(a(i7, i8, str));
        }
        return i7;
    }

    public static Object j(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object k(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int l(int i7, int i8) {
        return m(i7, i8, "index");
    }

    public static int m(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(b(i7, i8, str));
        }
        return i7;
    }

    public static void n(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException(c(i7, i8, i9));
        }
    }

    public static void o(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void q(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalStateException(r.a(str, obj));
        }
    }
}
