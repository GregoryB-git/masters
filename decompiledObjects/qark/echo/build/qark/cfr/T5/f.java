/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AutoCloseable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package T5;

import t1.b;

public final class f
implements AutoCloseable {
    public f(String string2) {
        f.a(string2);
    }

    public static void a(String string2) {
        b.c(f.c(string2));
    }

    public static void b(String string2, int n8) {
        b.a(f.c(string2), n8);
    }

    public static String c(String string2) {
        if (string2.length() < 124) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.substring(0, 124));
        stringBuilder.append("...");
        return stringBuilder.toString();
    }

    public static void e() {
        b.f();
    }

    public static void h(String string2, int n8) {
        b.d(f.c(string2), n8);
    }

    public static f i(String string2) {
        return new f(string2);
    }

    public void close() {
        f.e();
    }
}

