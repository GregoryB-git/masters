/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package W2;

import W2.r;

public abstract class m {
    public static String a(int n8, int n9, String string2) {
        if (n8 < 0) {
            return r.a("%s (%s) must not be negative", string2, n8);
        }
        if (n9 >= 0) {
            return r.a("%s (%s) must be less than size (%s)", string2, n8, n9);
        }
        string2 = new StringBuilder();
        string2.append("negative size: ");
        string2.append(n9);
        throw new IllegalArgumentException(string2.toString());
    }

    public static String b(int n8, int n9, String string2) {
        if (n8 < 0) {
            return r.a("%s (%s) must not be negative", string2, n8);
        }
        if (n9 >= 0) {
            return r.a("%s (%s) must not be greater than size (%s)", string2, n8, n9);
        }
        string2 = new StringBuilder();
        string2.append("negative size: ");
        string2.append(n9);
        throw new IllegalArgumentException(string2.toString());
    }

    public static String c(int n8, int n9, int n10) {
        if (n8 >= 0 && n8 <= n10) {
            if (n9 >= 0 && n9 <= n10) {
                return r.a("end index (%s) must not be less than start index (%s)", n9, n8);
            }
            return m.b(n9, n10, "end index");
        }
        return m.b(n8, n10, "start index");
    }

    public static void d(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void e(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf((Object)object));
    }

    public static void f(boolean bl, String string2, int n8, int n9) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(r.a(string2, n8, n9));
    }

    public static void g(boolean bl, String string2, long l8) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(r.a(string2, l8));
    }

    public static int h(int n8, int n9) {
        return m.i(n8, n9, "index");
    }

    public static int i(int n8, int n9, String string2) {
        if (n8 >= 0 && n8 < n9) {
            return n8;
        }
        throw new IndexOutOfBoundsException(m.a(n8, n9, string2));
    }

    public static Object j(Object object) {
        object.getClass();
        return object;
    }

    public static Object k(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(String.valueOf((Object)object2));
    }

    public static int l(int n8, int n9) {
        return m.m(n8, n9, "index");
    }

    public static int m(int n8, int n9, String string2) {
        if (n8 >= 0 && n8 <= n9) {
            return n8;
        }
        throw new IndexOutOfBoundsException(m.b(n8, n9, string2));
    }

    public static void n(int n8, int n9, int n10) {
        if (n8 >= 0 && n9 >= n8 && n9 <= n10) {
            return;
        }
        throw new IndexOutOfBoundsException(m.c(n8, n9, n10));
    }

    public static void o(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void p(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf((Object)object));
    }

    public static void q(boolean bl, String string2, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(r.a(string2, object));
    }
}

