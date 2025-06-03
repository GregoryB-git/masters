/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package k0;

public abstract class Z0 {
    public static int a(int n8) {
        return Z0.b(n8, 0, 0, 0);
    }

    public static int b(int n8, int n9, int n10, int n11) {
        return Z0.d(n8, n9, n10, 0, 128, n11);
    }

    public static int c(int n8, int n9, int n10, int n11, int n12) {
        return Z0.d(n8, n9, n10, n11, n12, 0);
    }

    public static int d(int n8, int n9, int n10, int n11, int n12, int n13) {
        return n8 | n9 | n10 | n11 | n12 | n13;
    }

    public static int e(int n8) {
        return n8 & 24;
    }

    public static int f(int n8) {
        return n8 & 3584;
    }

    public static int g(int n8) {
        return n8 & 384;
    }

    public static int h(int n8) {
        return n8 & 7;
    }

    public static int i(int n8) {
        return n8 & 64;
    }

    public static int j(int n8) {
        return n8 & 32;
    }

    public static boolean k(int n8, boolean bl) {
        if (!((n8 = Z0.h(n8)) == 4 || bl && n8 == 3)) {
            return false;
        }
        return true;
    }
}

