/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package g5;

import g5.c;

public final class b
extends Enum {
    public static final /* synthetic */ b[] A;
    public static final /* enum */ b q;
    public static final /* enum */ b r;
    public static final /* enum */ b s;
    public static final /* enum */ b t;
    public static final /* enum */ b u;
    public static final /* enum */ b v;
    public static final /* enum */ b w;
    public static final /* enum */ b x;
    public static final /* enum */ b y;
    public static final /* enum */ b z;
    public final int[] o;
    public final int p;

    static {
        b b8;
        b b9;
        b b10;
        b b11;
        b b12;
        b b13;
        b b14;
        b b15;
        b b16;
        b b17;
        q = b10 = new b(new int[]{0, 0, 0}, 0);
        r = b12 = new b(new int[]{10, 12, 14}, 1);
        s = b14 = new b(new int[]{9, 11, 13}, 2);
        t = b11 = new b(new int[]{0, 0, 0}, 3);
        u = b16 = new b(new int[]{8, 16, 16}, 4);
        v = b13 = new b(new int[]{0, 0, 0}, 7);
        w = b8 = new b(new int[]{8, 10, 12}, 8);
        x = b17 = new b(new int[]{0, 0, 0}, 5);
        y = b9 = new b(new int[]{0, 0, 0}, 9);
        z = b15 = new b(new int[]{8, 10, 12}, 13);
        A = new b[]{b10, b12, b14, b11, b16, b13, b8, b17, b9, b15};
    }

    public b(int[] arrn, int n9) {
        this.o = arrn;
        this.p = n9;
    }

    public static b valueOf(String string2) {
        return (b)Enum.valueOf(b.class, (String)string2);
    }

    public static b[] values() {
        return (b[])A.clone();
    }

    public int c() {
        return this.p;
    }

    public int e(c c8) {
        int n8 = c8.f();
        n8 = n8 <= 9 ? 0 : (n8 <= 26 ? 1 : 2);
        return this.o[n8];
    }
}

