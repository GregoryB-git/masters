/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package Z4;

import Z4.b;

public final class a {
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public final int[] a;
    public final int[] b;
    public final b c;
    public final b d;
    public final int e;
    public final int f;
    public final int g;

    static {
        a a8;
        a a9;
        h = new a(4201, 4096, 1);
        i = new a(1033, 1024, 1);
        j = a9 = new a(67, 64, 1);
        k = new a(19, 16, 1);
        l = new a(285, 256, 0);
        m = a8 = new a(301, 256, 1);
        n = a8;
        o = a9;
    }

    public a(int n8, int n9, int n10) {
        this.f = n8;
        this.e = n9;
        this.g = n10;
        this.a = new int[n9];
        this.b = new int[n9];
        n10 = 1;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n11;
            this.a[i8] = n10;
            n10 = n11 = n10 << 1;
            if (n11 < n9) continue;
            n10 = (n11 ^ n8) & n9 - 1;
        }
        n8 = 0;
        while (n8 < n9 - 1) {
            this.b[this.a[n8]] = n8++;
        }
        this.c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public static int a(int n8, int n9) {
        return n8 ^ n9;
    }

    public b b(int n8, int n9) {
        if (n8 >= 0) {
            if (n9 == 0) {
                return this.c;
            }
            int[] arrn = new int[n8 + 1];
            arrn[0] = n9;
            return new b(this, arrn);
        }
        throw new IllegalArgumentException();
    }

    public int c(int n8) {
        return this.a[n8];
    }

    public int d() {
        return this.g;
    }

    public b e() {
        return this.c;
    }

    public int f(int n8) {
        if (n8 != 0) {
            return this.a[this.e - this.b[n8] - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int n8) {
        if (n8 != 0) {
            return this.b[n8];
        }
        throw new IllegalArgumentException();
    }

    public int h(int n8, int n9) {
        if (n8 != 0 && n9 != 0) {
            int[] arrn = this.a;
            int[] arrn2 = this.b;
            return arrn[(arrn2[n8] + arrn2[n9]) % (this.e - 1)];
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        stringBuilder.append(Integer.toHexString((int)this.f));
        stringBuilder.append(',');
        stringBuilder.append(this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

