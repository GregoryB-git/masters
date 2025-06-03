package g0;

import android.text.TextUtils;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1297a {
    public static void a(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i7, int i8, int i9) {
        if (i7 < i8 || i7 >= i9) {
            throw new IndexOutOfBoundsException();
        }
        return i7;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void f(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object h(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static Object i(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }
}
