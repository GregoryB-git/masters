/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package b5;

import V4.b;
import b5.d;
import b5.l;

public class k {
    public static final k[] i;
    public static k[] j;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    static {
        k k8 = new k(false, 3, 5, 8, 8, 1);
        k k9 = new k(false, 5, 7, 10, 10, 1);
        k k10 = new k(true, 5, 7, 16, 6, 1);
        k k11 = new k(false, 8, 10, 12, 12, 1);
        k k12 = new k(true, 10, 11, 14, 6, 2);
        k k13 = new k(false, 12, 12, 14, 14, 1);
        k k14 = new k(true, 16, 14, 24, 10, 1);
        k k15 = new k(false, 18, 14, 16, 16, 1);
        k k16 = new k(false, 22, 18, 18, 18, 1);
        k k17 = new k(true, 22, 18, 16, 10, 2);
        k k18 = new k(false, 30, 20, 20, 20, 1);
        k k19 = new k(true, 32, 24, 16, 14, 2);
        k k20 = new k(false, 36, 24, 22, 22, 1);
        k k21 = new k(false, 44, 28, 24, 24, 1);
        k k22 = new k(true, 49, 28, 22, 14, 2);
        k k23 = new k(false, 62, 36, 14, 14, 4);
        k k24 = new k(false, 86, 42, 16, 16, 4);
        k k25 = new k(false, 114, 48, 18, 18, 4);
        k k26 = new k(false, 144, 56, 20, 20, 4);
        k k27 = new k(false, 174, 68, 22, 22, 4);
        k k28 = new k(false, 204, 84, 24, 24, 4, 102, 42);
        k k29 = new k(false, 280, 112, 14, 14, 16, 140, 56);
        k k30 = new k(false, 368, 144, 16, 16, 16, 92, 36);
        k k31 = new k(false, 456, 192, 18, 18, 16, 114, 48);
        k k32 = new k(false, 576, 224, 20, 20, 16, 144, 56);
        k k33 = new k(false, 696, 272, 22, 22, 16, 174, 68);
        k k34 = new k(false, 816, 336, 24, 24, 16, 136, 56);
        k k35 = new k(false, 1050, 408, 18, 18, 36, 175, 68);
        k k36 = new k(false, 1304, 496, 20, 20, 36, 163, 62);
        d d8 = new d();
        k[] arrk = new k[]{k8, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, d8};
        i = arrk;
        j = arrk;
    }

    public k(boolean bl, int n8, int n9, int n10, int n11, int n12) {
        this(bl, n8, n9, n10, n11, n12, n8, n9);
    }

    public k(boolean bl, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        this.a = bl;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = n11;
        this.f = n12;
        this.g = n13;
        this.h = n14;
    }

    public static k l(int n8, l l8, b arrk, b object2, boolean bl) {
        void var4_6;
        for (k k8 : j) {
            if (l8 == l.p && k8.a || l8 == l.q && !k8.a || n8 > k8.b) continue;
            return k8;
        }
        if (var4_6 == false) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf((int)n8)));
    }

    public final int a() {
        return this.b;
    }

    public int b(int n8) {
        return this.g;
    }

    public final int c() {
        return this.c;
    }

    public final int d(int n8) {
        return this.h;
    }

    public final int e() {
        int n8 = this.f;
        int n9 = 1;
        if (n8 != 1) {
            int n10;
            n9 = n10 = 2;
            if (n8 != 2) {
                n9 = n10;
                if (n8 != 4) {
                    if (n8 != 16) {
                        if (n8 == 36) {
                            return 6;
                        }
                        throw new IllegalStateException("Cannot handle this number of data regions");
                    }
                    return 4;
                }
            }
        }
        return n9;
    }

    public int f() {
        return this.b / this.g;
    }

    public final int g() {
        return this.k() * this.e;
    }

    public final int h() {
        return this.e() * this.d;
    }

    public final int i() {
        return this.g() + (this.k() << 1);
    }

    public final int j() {
        return this.h() + (this.e() << 1);
    }

    public final int k() {
        int n8 = this.f;
        if (n8 != 1 && n8 != 2) {
            if (n8 != 4) {
                if (n8 != 16) {
                    if (n8 == 36) {
                        return 6;
                    }
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a ? "Rectangular Symbol:" : "Square Symbol:";
        stringBuilder.append(string2);
        stringBuilder.append(" data region ");
        stringBuilder.append(this.d);
        stringBuilder.append('x');
        stringBuilder.append(this.e);
        stringBuilder.append(", symbol size ");
        stringBuilder.append(this.j());
        stringBuilder.append('x');
        stringBuilder.append(this.i());
        stringBuilder.append(", symbol data size ");
        stringBuilder.append(this.h());
        stringBuilder.append('x');
        stringBuilder.append(this.g());
        stringBuilder.append(", codewords ");
        stringBuilder.append(this.b);
        stringBuilder.append('+');
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

