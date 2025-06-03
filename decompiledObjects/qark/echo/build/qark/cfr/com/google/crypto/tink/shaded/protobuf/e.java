/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.m;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;
import java.nio.charset.Charset;

public abstract class e {
    public static int A(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (F)d8;
        n9 = e.K(arrby, n9, a8);
        do {
            d8.d(i.c(a8.b));
            if (n9 >= n10) break;
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            n9 = e.K(arrby, n11, a8);
        } while (true);
        return n9;
    }

    public static int B(byte[] arrby, int n8, a a8) {
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a;
        if (n9 >= 0) {
            if (n9 == 0) {
                a8.c = "";
                return n8;
            }
            a8.c = new String(arrby, n8, n9, z.b);
            return n8 + n9;
        }
        throw A.g();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int C(int var0, byte[] var1_1, int var2_2, int var3_3, z.d var4_4, a var5_5) {
        block3 : {
            var2_2 = e.H(var1_1, var2_2, var5_5);
            var7_6 = var5_5.a;
            if (var7_6 < 0) throw A.g();
            if (var7_6 != 0) break block3;
lbl5: // 2 sources:
            var4_4.add((Object)"");
            ** GOTO lbl14
        }
        var8_8 = new String(var1_1, var2_2, var7_6, z.b);
        var6_7 = var2_2;
        var2_2 = var7_6;
        do {
            block4 : {
                var4_4.add((Object)var8_8);
                var2_2 = var6_7 + var2_2;
lbl14: // 2 sources:
                if (var2_2 >= var3_3) return var2_2;
                var6_7 = e.H(var1_1, var2_2, var5_5);
                if (var0 != var5_5.a) {
                    return var2_2;
                }
                var6_7 = e.H(var1_1, var6_7, var5_5);
                var2_2 = var5_5.a;
                if (var2_2 < 0) throw A.g();
                if (var2_2 != 0) break block4;
                var2_2 = var6_7;
                ** GOTO lbl5
            }
            var8_8 = new String(var1_1, var6_7, var2_2, z.b);
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int D(int var0, byte[] var1_1, int var2_2, int var3_3, z.d var4_4, a var5_5) {
        block3 : {
            var2_2 = e.H(var1_1, var2_2, var5_5);
            var7_6 = var5_5.a;
            if (var7_6 < 0) throw A.g();
            if (var7_6 != 0) break block3;
lbl5: // 2 sources:
            var4_4.add((Object)"");
            ** GOTO lbl14
        }
        var6_7 = var2_2 + var7_6;
        if (p0.n(var1_1, var2_2, var6_7) == false) throw A.d();
        var8_8 = new String(var1_1, var2_2, var7_6, z.b);
        var2_2 = var6_7;
        do {
            var4_4.add((Object)var8_8);
lbl14: // 2 sources:
            if (var2_2 >= var3_3) return var2_2;
            var6_7 = e.H(var1_1, var2_2, var5_5);
            if (var0 != var5_5.a) {
                return var2_2;
            }
            var2_2 = e.H(var1_1, var6_7, var5_5);
            var7_6 = var5_5.a;
            if (var7_6 < 0) throw A.g();
            if (var7_6 == 0) ** GOTO lbl5
            var6_7 = var2_2 + var7_6;
            if (p0.n(var1_1, var2_2, var6_7) == false) throw A.d();
            var8_8 = new String(var1_1, var2_2, var7_6, z.b);
            var2_2 = var6_7;
        } while (true);
    }

    public static int E(byte[] arrby, int n8, a a8) {
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a;
        if (n9 >= 0) {
            if (n9 == 0) {
                a8.c = "";
                return n8;
            }
            a8.c = p0.e(arrby, n8, n9);
            return n8 + n9;
        }
        throw A.g();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int F(int n8, byte[] object, int n9, int n10, l0 l02, a a8) {
        int n11;
        if (q0.a(n8) == 0) throw A.c();
        int n12 = q0.b(n8);
        if (n12 == 0) {
            n9 = e.K((byte[])object, n9, a8);
            l02.n(n8, a8.b);
            return n9;
        }
        if (n12 == 1) {
            l02.n(n8, e.i((byte[])object, n9));
            return n9 + 8;
        }
        if (n12 != 2) {
            if (n12 != 3) {
                if (n12 != 5) throw A.c();
                l02.n(n8, e.g((byte[])object, n9));
                return n9 + 4;
            }
        } else {
            n9 = e.H((byte[])object, n9, a8);
            n10 = a8.a;
            if (n10 < 0) throw A.g();
            if (n10 > object.length - n9) throw A.m();
            object = n10 == 0 ? h.p : h.k((byte[])object, n9, n10);
            l02.n(n8, object);
            return n9 + n10;
        }
        l0 l03 = l0.k();
        int n13 = n8 & -8 | 4;
        n12 = 0;
        do {
            n11 = n9;
            if (n9 >= n10) break;
            n11 = e.H((byte[])object, n9, a8);
            n12 = n9 = a8.a;
            if (n9 == n13) {
                n11 = n9 = n11;
                break;
            }
            n11 = e.F(n12, (byte[])object, n11, n10, l03, a8);
            n12 = n9;
            n9 = n11;
        } while (true);
        if (n11 > n10) throw A.h();
        if (n12 != n13) throw A.h();
        l02.n(n8, l03);
        return n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int G(int n8, byte[] arrby, int n9, a a8) {
        int n10;
        int n11;
        block9 : {
            block8 : {
                block7 : {
                    n10 = n8 & 127;
                    n8 = n9 + 1;
                    n11 = arrby[n9];
                    if (n11 < 0) break block7;
                    n11 <<= 7;
                    n9 = n10;
                    break block8;
                }
                n11 = n10 | (n11 & 127) << 7;
                n10 = n9 + 2;
                if ((n8 = arrby[n8]) >= 0) {
                    a8.a = n11 | n8 << 14;
                    return n10;
                }
                n11 |= (n8 & 127) << 14;
                n8 = n9 + 3;
                if ((n10 = arrby[n10]) < 0) break block9;
                n9 = n11;
                n11 = n10 <<= 21;
            }
            a8.a = n9 | n11;
            return n8;
        }
        n11 |= (n10 & 127) << 21;
        n9 += 4;
        n10 = arrby[n8];
        if (n10 >= 0) {
            a8.a = n11 | n10 << 28;
            return n9;
        }
        n8 = n9;
        do {
            n9 = n8 + 1;
            if (arrby[n8] >= 0) {
                a8.a = n11 | (n10 & 127) << 28;
                return n9;
            }
            n8 = n9;
        } while (true);
    }

    public static int H(byte[] arrby, int n8, a a8) {
        int n9 = n8 + 1;
        if ((n8 = arrby[n8]) >= 0) {
            a8.a = n8;
            return n9;
        }
        return e.G(n8, arrby, n9, a8);
    }

    public static int I(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (y)d8;
        n9 = e.H(arrby, n9, a8);
        do {
            d8.z(a8.a);
            if (n9 >= n10) break;
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            n9 = e.H(arrby, n11, a8);
        } while (true);
        return n9;
    }

    public static int J(long l8, byte[] arrby, int n8, a a8) {
        int n9 = n8 + 1;
        byte by = arrby[n8];
        l8 = l8 & 127L | (long)(by & 127) << 7;
        int n10 = 7;
        n8 = n9;
        while (by < 0) {
            by = arrby[n8];
            l8 |= (long)(by & 127) << (n10 += 7);
            ++n8;
        }
        a8.b = l8;
        return n8;
    }

    public static int K(byte[] arrby, int n8, a a8) {
        int n9 = n8 + 1;
        long l8 = arrby[n8];
        if (l8 >= 0L) {
            a8.b = l8;
            return n9;
        }
        return e.J(l8, arrby, n9, a8);
    }

    public static int L(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (F)d8;
        n9 = e.K(arrby, n9, a8);
        do {
            d8.d(a8.b);
            if (n9 >= n10) break;
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            n9 = e.K(arrby, n11, a8);
        } while (true);
        return n9;
    }

    public static int M(Object object, e0 e02, byte[] arrby, int n8, int n9, int n10, a a8) {
        n8 = ((S)e02).f0(object, arrby, n8, n9, n10, a8);
        a8.c = object;
        return n8;
    }

    public static int N(Object object, e0 e02, byte[] arrby, int n8, int n9, a a8) {
        int n10 = n8 + 1;
        int n11 = arrby[n8];
        n8 = n10;
        int n12 = n11;
        if (n11 < 0) {
            n8 = e.G(n11, arrby, n10, a8);
            n12 = a8.a;
        }
        if (n12 >= 0 && n12 <= n9 - n8) {
            n9 = n12 + n8;
            e02.h(object, arrby, n8, n9, a8);
            a8.c = object;
            return n9;
        }
        throw A.m();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int a(int var0, byte[] var1_1, int var2_2, int var3_3, z.d var4_4, a var5_5) {
        var4_4 = (f)var4_4;
        var2_2 = var6_6 = e.K(var1_1, var2_2, var5_5);
        if (var5_5.b == 0L) ** GOTO lbl8
        var2_2 = var6_6;
        do {
            var7_7 = true;
            ** GOTO lbl10
lbl8: // 1 sources:
            do {
                var7_7 = false;
lbl10: // 2 sources:
                var4_4.d(var7_7);
                if (var2_2 >= var3_3) return var2_2;
                var6_6 = e.H(var1_1, var2_2, var5_5);
                if (var0 != var5_5.a) {
                    return var2_2;
                }
                var2_2 = var6_6 = e.K(var1_1, var6_6, var5_5);
            } while (var5_5.b == 0L);
            var2_2 = var6_6;
        } while (true);
    }

    public static int b(byte[] arrby, int n8, a a8) {
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a;
        if (n9 >= 0) {
            if (n9 <= arrby.length - n8) {
                if (n9 == 0) {
                    a8.c = h.p;
                    return n8;
                }
                a8.c = h.k(arrby, n8, n9);
                return n8 + n9;
            }
            throw A.m();
        }
        throw A.g();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int c(int var0, byte[] var1_1, int var2_2, int var3_3, z.d var4_4, a var5_5) {
        var7_6 = e.H(var1_1, var2_2, var5_5);
        var8_7 = var5_5.a;
        if (var8_7 < 0) throw A.g();
        if (var8_7 > var1_1.length - var7_6) throw A.m();
        var2_2 = var8_7;
        var6_8 = var7_6;
        if (var8_7 != 0) ** GOTO lbl12
        var2_2 = var7_6;
        do {
            var4_4.add((Object)h.p);
            ** GOTO lbl15
lbl12: // 1 sources:
            do {
                var4_4.add((Object)h.k(var1_1, var6_8, var2_2));
                var2_2 = var6_8 + var2_2;
lbl15: // 2 sources:
                if (var2_2 >= var3_3) return var2_2;
                var6_8 = e.H(var1_1, var2_2, var5_5);
                if (var0 != var5_5.a) {
                    return var2_2;
                }
                var7_6 = e.H(var1_1, var6_8, var5_5);
                var8_7 = var5_5.a;
                if (var8_7 < 0) throw A.g();
                if (var8_7 > var1_1.length - var7_6) throw A.m();
                var2_2 = var8_7;
                var6_8 = var7_6;
            } while (var8_7 != 0);
            var2_2 = var7_6;
        } while (true);
    }

    public static double d(byte[] arrby, int n8) {
        return Double.longBitsToDouble((long)e.i(arrby, n8));
    }

    public static int e(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (m)d8;
        d8.d(e.d(arrby, n9));
        n9 += 8;
        while (n9 < n10) {
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            d8.d(e.d(arrby, n11));
            n9 = n11 + 8;
        }
        return n9;
    }

    public static int f(int n8, byte[] arrby, int n9, int n10, Object object, O o8, k0 k02, a a8) {
        a8.d.a(o8, n8 >>> 3);
        return e.F(n8, arrby, n9, n10, S.v(object), a8);
    }

    public static int g(byte[] arrby, int n8) {
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        return (arrby[n8 + 3] & 255) << 24 | (by & 255 | (by2 & 255) << 8 | (by3 & 255) << 16);
    }

    public static int h(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (y)d8;
        d8.z(e.g(arrby, n9));
        n9 += 4;
        while (n9 < n10) {
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            d8.z(e.g(arrby, n11));
            n9 = n11 + 4;
        }
        return n9;
    }

    public static long i(byte[] arrby, int n8) {
        long l8 = arrby[n8];
        long l9 = arrby[n8 + 1];
        long l10 = arrby[n8 + 2];
        long l11 = arrby[n8 + 3];
        long l12 = arrby[n8 + 4];
        long l13 = arrby[n8 + 5];
        long l14 = arrby[n8 + 6];
        return ((long)arrby[n8 + 7] & 255L) << 56 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16 | (l11 & 255L) << 24 | (l12 & 255L) << 32 | (l13 & 255L) << 40 | (l14 & 255L) << 48);
    }

    public static int j(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (F)d8;
        d8.d(e.i(arrby, n9));
        n9 += 8;
        while (n9 < n10) {
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            d8.d(e.i(arrby, n11));
            n9 = n11 + 8;
        }
        return n9;
    }

    public static float k(byte[] arrby, int n8) {
        return Float.intBitsToFloat((int)e.g(arrby, n8));
    }

    public static int l(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (v)d8;
        d8.d(e.k(arrby, n9));
        n9 += 4;
        while (n9 < n10) {
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            d8.d(e.k(arrby, n11));
            n9 = n11 + 4;
        }
        return n9;
    }

    public static int m(e0 e02, byte[] arrby, int n8, int n9, int n10, a a8) {
        Object object = e02.f();
        n8 = e.M(object, e02, arrby, n8, n9, n10, a8);
        e02.b(object);
        a8.c = object;
        return n8;
    }

    public static int n(e0 e02, int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        int n11 = n8 & -8 | 4;
        n9 = e.m(e02, arrby, n9, n10, n11, a8);
        do {
            d8.add(a8.c);
            if (n9 >= n10) break;
            int n12 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            n9 = e.m(e02, arrby, n12, n10, n11, a8);
        } while (true);
        return n9;
    }

    public static int o(e0 e02, byte[] arrby, int n8, int n9, a a8) {
        Object object = e02.f();
        n8 = e.N(object, e02, arrby, n8, n9, a8);
        e02.b(object);
        a8.c = object;
        return n8;
    }

    public static int p(e0 e02, int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        n9 = e.o(e02, arrby, n9, n10, a8);
        do {
            d8.add(a8.c);
            if (n9 >= n10) break;
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            n9 = e.o(e02, arrby, n11, n10, a8);
        } while (true);
        return n9;
    }

    public static int q(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (f)d8;
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a + n8;
        while (n8 < n9) {
            n8 = e.K(arrby, n8, a8);
            boolean bl = a8.b != 0L;
            d8.d(bl);
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int r(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (m)d8;
        int n9 = a8.a + n8;
        for (n8 = e.H((byte[])arrby, (int)n8, (a)a8); n8 < n9; n8 += 8) {
            d8.d(e.d(arrby, n8));
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int s(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (y)d8;
        int n9 = a8.a + n8;
        for (n8 = e.H((byte[])arrby, (int)n8, (a)a8); n8 < n9; n8 += 4) {
            d8.z(e.g(arrby, n8));
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int t(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (F)d8;
        int n9 = a8.a + n8;
        for (n8 = e.H((byte[])arrby, (int)n8, (a)a8); n8 < n9; n8 += 8) {
            d8.d(e.i(arrby, n8));
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int u(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (v)d8;
        int n9 = a8.a + n8;
        for (n8 = e.H((byte[])arrby, (int)n8, (a)a8); n8 < n9; n8 += 4) {
            d8.d(e.k(arrby, n8));
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int v(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (y)d8;
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a + n8;
        while (n8 < n9) {
            n8 = e.H(arrby, n8, a8);
            d8.z(i.b(a8.a));
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int w(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (F)d8;
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a + n8;
        while (n8 < n9) {
            n8 = e.K(arrby, n8, a8);
            d8.d(i.c(a8.b));
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int x(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (y)d8;
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a + n8;
        while (n8 < n9) {
            n8 = e.H(arrby, n8, a8);
            d8.z(a8.a);
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int y(byte[] arrby, int n8, z.d d8, a a8) {
        d8 = (F)d8;
        n8 = e.H(arrby, n8, a8);
        int n9 = a8.a + n8;
        while (n8 < n9) {
            n8 = e.K(arrby, n8, a8);
            d8.d(a8.b);
        }
        if (n8 == n9) {
            return n8;
        }
        throw A.m();
    }

    public static int z(int n8, byte[] arrby, int n9, int n10, z.d d8, a a8) {
        d8 = (y)d8;
        n9 = e.H(arrby, n9, a8);
        do {
            d8.z(i.b(a8.a));
            if (n9 >= n10) break;
            int n11 = e.H(arrby, n9, a8);
            if (n8 != a8.a) {
                return n9;
            }
            n9 = e.H(arrby, n11, a8);
        } while (true);
        return n9;
    }

    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final p d;

        public a(p p8) {
            p8.getClass();
            this.d = p8;
        }
    }

}

