/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package Y4;

import java.util.HashMap;
import java.util.Map;

public final class c
extends Enum {
    public static final /* enum */ c A;
    public static final /* enum */ c B;
    public static final /* enum */ c C;
    public static final /* enum */ c D;
    public static final /* enum */ c E;
    public static final /* enum */ c F;
    public static final /* enum */ c G;
    public static final /* enum */ c H;
    public static final /* enum */ c I;
    public static final /* enum */ c J;
    public static final /* enum */ c K;
    public static final /* enum */ c L;
    public static final /* enum */ c M;
    public static final /* enum */ c N;
    public static final /* enum */ c O;
    public static final /* enum */ c P;
    public static final /* enum */ c Q;
    public static final Map R;
    public static final Map S;
    public static final /* synthetic */ c[] T;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* enum */ c s;
    public static final /* enum */ c t;
    public static final /* enum */ c u;
    public static final /* enum */ c v;
    public static final /* enum */ c w;
    public static final /* enum */ c x;
    public static final /* enum */ c y;
    public static final /* enum */ c z;
    public final int[] o;
    public final String[] p;

    static {
        c c8;
        c c9;
        c c102;
        c c11;
        c c12;
        c c13;
        c c14;
        c c15;
        c c16;
        c c17;
        c c18;
        c c19;
        c c20;
        c c21;
        c c22;
        c c23;
        c c24;
        c c25;
        c c26;
        c c27;
        c c28;
        c c29;
        c c30;
        c c31;
        c c32;
        c[] arrc = new c[](new int[]{0, 2}, new String[0]);
        q = arrc;
        r = c102 = new c(new int[]{1, 3}, "ISO-8859-1");
        int[] arrn = new int[](4, "ISO-8859-2");
        s = arrn;
        t = c25 = new c(5, "ISO-8859-3");
        u = c13 = new c(6, "ISO-8859-4");
        v = c31 = new c(7, "ISO-8859-5");
        w = c26 = new c(8, "ISO-8859-6");
        x = c17 = new c(9, "ISO-8859-7");
        y = c9 = new c(10, "ISO-8859-8");
        z = c19 = new c(11, "ISO-8859-9");
        A = c11 = new c(12, "ISO-8859-10");
        B = c32 = new c(13, "ISO-8859-11");
        C = c20 = new c(15, "ISO-8859-13");
        D = c28 = new c(16, "ISO-8859-14");
        E = c27 = new c(17, "ISO-8859-15");
        F = c21 = new c(18, "ISO-8859-16");
        G = c23 = new c(20, "Shift_JIS");
        H = c12 = new c(21, "windows-1250");
        I = c16 = new c(22, "windows-1251");
        J = c30 = new c(23, "windows-1252");
        K = c22 = new c(24, "windows-1256");
        L = c8 = new c(25, "UTF-16BE", "UnicodeBig");
        M = c24 = new c(26, "UTF-8");
        N = c15 = new c(new int[]{27, 170}, "US-ASCII");
        O = c29 = new c(28);
        P = c18 = new c(29, "GB2312", "EUC_CN", "GBK");
        Q = c14 = new c(30, "EUC-KR");
        T = new c[]{arrc, c102, arrn, c25, c13, c31, c26, c17, c9, c19, c11, c32, c20, c28, c27, c21, c23, c12, c16, c30, c22, c8, c24, c15, c29, c18, c14};
        R = new HashMap();
        S = new HashMap();
        for (c c102 : c.values()) {
            for (int n8 : c102.o) {
                R.put((Object)n8, (Object)c102);
            }
            S.put((Object)c102.name(), (Object)c102);
            arrn = c102.p;
            int n9 = arrn.length;
            for (int i8 = 0; i8 < n9; ++i8) {
                c25 = (c)arrn[i8];
                S.put((Object)c25, (Object)c102);
            }
        }
    }

    public c(int n9) {
        this(new int[]{n9}, new String[0]);
    }

    public /* varargs */ c(int n9, String ... arrstring) {
        this.o = new int[]{n9};
        this.p = arrstring;
    }

    public /* varargs */ c(int[] arrn, String ... arrstring) {
        this.o = arrn;
        this.p = arrstring;
    }

    public static c c(String string2) {
        return (c)((Object)S.get((Object)string2));
    }

    public static c valueOf(String string2) {
        return (c)Enum.valueOf(c.class, (String)string2);
    }

    public static c[] values() {
        return (c[])T.clone();
    }

    public int e() {
        return this.o[0];
    }
}

