/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package m1;

import F0.s;
import android.util.Pair;
import d0.A;
import g0.M;
import g0.o;
import g0.z;
import m1.c;

public abstract class d {
    public static boolean a(s s8) {
        z z8 = new z(8);
        int n8 = a.a((s)s8, (z)z8).a;
        if (n8 != 1380533830 && n8 != 1380333108) {
            return false;
        }
        s8.n(z8.e(), 0, 4);
        z8.T(0);
        n8 = z8.p();
        if (n8 != 1463899717) {
            s8 = new StringBuilder();
            s8.append("Unsupported form type: ");
            s8.append(n8);
            o.c("WavHeaderReader", s8.toString());
            return false;
        }
        return true;
    }

    public static c b(s s8) {
        byte[] arrby = new byte[](16);
        a a8 = d.d(1718449184, s8, (z)arrby);
        boolean bl = a8.b >= 16L;
        g0.a.f(bl);
        s8.n(arrby.e(), 0, 16);
        arrby.T(0);
        int n8 = arrby.y();
        int n9 = arrby.y();
        int n10 = arrby.x();
        int n11 = arrby.x();
        int n12 = arrby.y();
        int n13 = arrby.y();
        int n14 = (int)a8.b - 16;
        if (n14 > 0) {
            arrby = new byte[n14];
            s8.n(arrby, 0, n14);
        } else {
            arrby = M.f;
        }
        s8.i((int)(s8.m() - s8.p()));
        return new c(n8, n9, n10, n11, n12, n13, arrby);
    }

    public static long c(s s8) {
        z z8 = new z(8);
        a a8 = a.a(s8, z8);
        if (a8.a != 1685272116) {
            s8.h();
            return -1L;
        }
        s8.o(8);
        z8.T(0);
        s8.n(z8.e(), 0, 8);
        long l8 = z8.u();
        s8.i((int)a8.b + 8);
        return l8;
    }

    public static a d(int n8, s s8, z z8) {
        a a8;
        block2 : {
            do {
                a8 = a.a(s8, z8);
                if (a8.a == n8) break block2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring unknown WAV chunk: ");
                stringBuilder.append(a8.a);
                o.h("WavHeaderReader", stringBuilder.toString());
                long l8 = a8.b;
                long l9 = 8L + l8;
                if (l8 % 2L != 0L) {
                    l9 = 9L + l8;
                }
                if (l9 > Integer.MAX_VALUE) break;
                s8.i((int)l9);
            } while (true);
            s8 = new StringBuilder();
            s8.append("Chunk is too large (~2GB+) to skip; id: ");
            s8.append(a8.a);
            throw A.d(s8.toString());
        }
        return a8;
    }

    public static Pair e(s s8) {
        s8.h();
        a a8 = d.d(1684108385, s8, new z(8));
        s8.i(8);
        return Pair.create((Object)s8.p(), (Object)a8.b);
    }

    public static final class a {
        public final int a;
        public final long b;

        public a(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }

        public static a a(s s8, z z8) {
            s8.n(z8.e(), 0, 8);
            z8.T(0);
            return new a(z8.p(), z8.w());
        }
    }

}

