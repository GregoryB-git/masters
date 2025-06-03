/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 */
package g0;

import android.text.TextUtils;

public abstract class a {
    public static void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void b(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf((Object)object));
    }

    public static int c(int n8, int n9, int n10) {
        if (n8 >= n9 && n8 < n10) {
            return n8;
        }
        throw new IndexOutOfBoundsException();
    }

    public static String d(String string2) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        throw new IllegalArgumentException();
    }

    public static Object e(Object object) {
        object.getClass();
        return object;
    }

    public static void f(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void g(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf((Object)object));
    }

    public static Object h(Object object) {
        if (object != null) {
            return object;
        }
        throw new IllegalStateException();
    }

    public static Object i(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        throw new IllegalStateException(String.valueOf((Object)object2));
    }
}

