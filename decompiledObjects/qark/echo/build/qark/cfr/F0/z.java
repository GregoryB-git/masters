/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package F0;

import F0.B;
import F0.G;
import F0.W;
import F0.s;
import T0.h;
import X2.v;
import d0.A;
import d0.x;
import g0.y;
import java.util.Arrays;
import java.util.List;

public abstract class z {
    public static boolean a(s s8) {
        g0.z z8 = new g0.z(4);
        byte[] arrby = z8.e();
        boolean bl = false;
        s8.n(arrby, 0, 4);
        if (z8.I() == 1716281667L) {
            bl = true;
        }
        return bl;
    }

    public static int b(s s8) {
        s8.h();
        g0.z z8 = new g0.z(2);
        s8.n(z8.e(), 0, 2);
        int n8 = z8.M();
        s8.h();
        if (n8 >> 2 == 16382) {
            return n8;
        }
        throw A.a("First frame does not start with sync code.", null);
    }

    public static x c(s object, boolean bl) {
        Object var3_2 = null;
        Object object2 = bl ? null : h.b;
        object2 = new G().a((s)object, (h.a)object2);
        object = var3_2;
        if (object2 != null) {
            if (object2.e() == 0) {
                return null;
            }
            object = object2;
        }
        return object;
    }

    public static x d(s s8, boolean bl) {
        s8.h();
        long l8 = s8.m();
        x x8 = z.c(s8, bl);
        s8.i((int)(s8.m() - l8));
        return x8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean e(s object, a a8) {
        object.h();
        Object object2 = new y(new byte[4]);
        object.n(object2.a, 0, 4);
        boolean bl = object2.g();
        int n8 = object2.h(7);
        int n9 = object2.h(24) + 4;
        if (n8 == 0) {
            object = z.h((s)object);
        } else {
            object2 = a8.a;
            if (object2 == null) {
                throw new IllegalArgumentException();
            }
            if (n8 == 3) {
                object = object2.b(z.f((s)object, n9));
            } else if (n8 == 4) {
                object = object2.c(z.j((s)object, n9));
            } else {
                if (n8 != 6) {
                    object.i(n9);
                    return bl;
                }
                g0.z z8 = new g0.z(n9);
                object.readFully(z8.e(), 0, n9);
                z8.U(4);
                object = object2.a(v.Z(R0.a.a(z8)));
            }
        }
        a8.a = object;
        return bl;
    }

    public static B.a f(s s8, int n8) {
        g0.z z8 = new g0.z(n8);
        s8.readFully(z8.e(), 0, n8);
        return z.g(z8);
    }

    public static B.a g(g0.z z8) {
        long[] arrl;
        long[] arrl2;
        z8.U(1);
        int n8 = z8.J();
        long l8 = z8.f();
        long l9 = n8;
        int n9 = n8 / 18;
        long[] arrl3 = new long[n9];
        long[] arrl4 = new long[n9];
        n8 = 0;
        do {
            arrl2 = arrl3;
            arrl = arrl4;
            if (n8 >= n9) break;
            long l10 = z8.z();
            if (l10 == -1L) {
                arrl2 = Arrays.copyOf((long[])arrl3, (int)n8);
                arrl = Arrays.copyOf((long[])arrl4, (int)n8);
                break;
            }
            arrl3[n8] = l10;
            arrl4[n8] = z8.z();
            z8.U(2);
            ++n8;
        } while (true);
        z8.U((int)(l8 + l9 - (long)z8.f()));
        return new B.a(arrl2, arrl);
    }

    public static B h(s s8) {
        byte[] arrby = new byte[38];
        s8.readFully(arrby, 0, 38);
        return new B(arrby, 4);
    }

    public static void i(s s8) {
        g0.z z8 = new g0.z(4);
        s8.readFully(z8.e(), 0, 4);
        if (z8.I() == 1716281667L) {
            return;
        }
        throw A.a("Failed to read FLAC stream marker.", null);
    }

    public static List j(s s8, int n8) {
        g0.z z8 = new g0.z(n8);
        s8.readFully(z8.e(), 0, n8);
        z8.U(4);
        return Arrays.asList((Object[])W.k((g0.z)z8, (boolean)false, (boolean)false).b);
    }

    public static final class a {
        public B a;

        public a(B b8) {
            this.a = b8;
        }
    }

}

