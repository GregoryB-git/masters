/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e2;

import android.util.SparseArray;
import e2.i;

public abstract class o {
    public static a a() {
        return new i.b();
    }

    public abstract b b();

    public abstract c c();

    public static abstract class a {
        public abstract o a();

        public abstract a b(b var1);

        public abstract a c(c var1);
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b A;
        public static final /* enum */ b B;
        public static final /* enum */ b C;
        public static final /* enum */ b D;
        public static final /* enum */ b E;
        public static final /* enum */ b F;
        public static final /* enum */ b G;
        public static final /* enum */ b H;
        public static final /* enum */ b I;
        public static final /* enum */ b J;
        public static final SparseArray K;
        public static final /* synthetic */ b[] L;
        public static final /* enum */ b p;
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
        public final int o;

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
            b b18;
            b b19;
            b b20;
            b b21;
            b b22;
            b b23;
            b b24;
            b b25;
            b b26;
            b b27;
            b b28;
            p = b14 = new b(0);
            q = b12 = new b(1);
            r = b11 = new b(2);
            s = b26 = new b(3);
            t = b16 = new b(4);
            u = b9 = new b(5);
            v = b23 = new b(6);
            w = b19 = new b(7);
            x = b8 = new b(8);
            y = b25 = new b(9);
            z = b15 = new b(10);
            A = b22 = new b(11);
            B = b28 = new b(12);
            C = b21 = new b(13);
            D = b17 = new b(14);
            E = b13 = new b(15);
            F = b10 = new b(16);
            G = b24 = new b(17);
            H = b27 = new b(18);
            I = b18 = new b(19);
            J = b20 = new b(100);
            L = new b[]{b14, b12, b11, b26, b16, b9, b23, b19, b8, b25, b15, b22, b28, b21, b17, b13, b10, b24, b27, b18, b20};
            b20 = new SparseArray();
            K = b20;
            b20.put(0, (Object)b14);
            b20.put(1, (Object)b12);
            b20.put(2, (Object)b11);
            b20.put(3, (Object)b26);
            b20.put(4, (Object)b16);
            b20.put(5, (Object)b9);
            b20.put(6, (Object)b23);
            b20.put(7, (Object)b19);
            b20.put(8, (Object)b8);
            b20.put(9, (Object)b25);
            b20.put(10, (Object)b15);
            b20.put(11, (Object)b22);
            b20.put(12, (Object)b28);
            b20.put(13, (Object)b21);
            b20.put(14, (Object)b17);
            b20.put(15, (Object)b13);
            b20.put(16, (Object)b10);
            b20.put(17, (Object)b24);
            b20.put(18, (Object)b27);
            b20.put(19, (Object)b18);
        }

        public b(int n9) {
            this.o = n9;
        }

        public static b c(int n8) {
            return (b)((Object)K.get(n8));
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])L.clone();
        }

        public int e() {
            return this.o;
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c A;
        public static final /* enum */ c B;
        public static final /* enum */ c C;
        public static final /* enum */ c D;
        public static final /* enum */ c E;
        public static final /* enum */ c F;
        public static final /* enum */ c G;
        public static final /* enum */ c H;
        public static final SparseArray I;
        public static final /* synthetic */ c[] J;
        public static final /* enum */ c p;
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
        public final int o;

        static {
            c c8;
            c c9;
            SparseArray sparseArray;
            c c10;
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
            p = c13 = new c(0);
            q = c12 = new c(1);
            r = c21 = new c(2);
            s = c24 = new c(3);
            t = c17 = new c(4);
            u = c11 = new c(5);
            v = c26 = new c(6);
            w = c18 = new c(7);
            x = c10 = new c(8);
            y = c23 = new c(9);
            z = c16 = new c(10);
            A = c20 = new c(11);
            B = c8 = new c(12);
            C = c19 = new c(13);
            D = c15 = new c(14);
            E = c14 = new c(15);
            F = c9 = new c(16);
            G = c22 = new c(17);
            H = c25 = new c(-1);
            J = new c[]{c13, c12, c21, c24, c17, c11, c26, c18, c10, c23, c16, c20, c8, c19, c15, c14, c9, c22, c25};
            I = sparseArray = new SparseArray();
            sparseArray.put(0, (Object)c13);
            sparseArray.put(1, (Object)c12);
            sparseArray.put(2, (Object)c21);
            sparseArray.put(3, (Object)c24);
            sparseArray.put(4, (Object)c17);
            sparseArray.put(5, (Object)c11);
            sparseArray.put(6, (Object)c26);
            sparseArray.put(7, (Object)c18);
            sparseArray.put(8, (Object)c10);
            sparseArray.put(9, (Object)c23);
            sparseArray.put(10, (Object)c16);
            sparseArray.put(11, (Object)c20);
            sparseArray.put(12, (Object)c8);
            sparseArray.put(13, (Object)c19);
            sparseArray.put(14, (Object)c15);
            sparseArray.put(15, (Object)c14);
            sparseArray.put(16, (Object)c9);
            sparseArray.put(17, (Object)c22);
            sparseArray.put(-1, (Object)c25);
        }

        public c(int n9) {
            this.o = n9;
        }

        public static c c(int n8) {
            return (c)((Object)I.get(n8));
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])J.clone();
        }

        public int e() {
            return this.o;
        }
    }

}

