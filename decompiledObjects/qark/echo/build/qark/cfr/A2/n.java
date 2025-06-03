/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package A2;

import E2.r;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public abstract class n {
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

    public static void c(Handler object) {
        Object object2 = Looper.myLooper();
        if (object2 != object.getLooper()) {
            object2 = object2 != null ? object2.getThread().getName() : "null current looper";
            object = object.getLooper().getThread().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Must be called on ");
            stringBuilder.append((String)object);
            stringBuilder.append(" thread, but got ");
            stringBuilder.append((String)object2);
            stringBuilder.append(".");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static void d(String string2) {
        if (r.a()) {
            return;
        }
        throw new IllegalStateException(string2);
    }

    public static String e(String string2) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String f(String string2, Object object) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return string2;
        }
        throw new IllegalArgumentException(String.valueOf((Object)object));
    }

    public static void g() {
        n.h("Must not be called on the main application thread");
    }

    public static void h(String string2) {
        if (!r.a()) {
            return;
        }
        throw new IllegalStateException(string2);
    }

    public static Object i(Object object) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException("null reference");
    }

    public static Object j(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(String.valueOf((Object)object2));
    }

    public static int k(int n8) {
        if (n8 != 0) {
            return n8;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void l(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf((Object)object));
    }
}

