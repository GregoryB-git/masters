/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.M4;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.v5;

public abstract class n3 {
    public static double a(byte[] arrby, int n8) {
        return Double.longBitsToDouble((long)n3.q(arrby, n8));
    }

    public static int b(int n8, byte[] arrby, int n9, int n10, h4 h42, p3 p32) {
        h42 = (c4)h42;
        n9 = n3.o(arrby, n9, p32);
        do {
            h42.g(p32.a);
            if (n9 >= n10) break;
            int n11 = n3.o(arrby, n9, p32);
            if (n8 != p32.a) break;
            n9 = n3.o(arrby, n11, p32);
        } while (true);
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int c(int n8, byte[] object, int n9, int n10, v5 v52, p3 p32) {
        if (n8 >>> 3 == 0) throw k4.b();
        int n11 = n8 & 7;
        if (n11 == 0) {
            n9 = n3.p((byte[])object, n9, p32);
            v52.e(n8, p32.b);
            return n9;
        }
        if (n11 == 1) {
            v52.e(n8, n3.q((byte[])object, n9));
            return n9 + 8;
        }
        if (n11 != 2) {
            v5 v53;
            int n12;
            int n13;
            block5 : {
                if (n11 != 3) {
                    if (n11 != 5) throw k4.b();
                    v52.e(n8, n3.n((byte[])object, n9));
                    return n9 + 4;
                }
                v53 = v5.l();
                n12 = n8 & -8 | 4;
                n11 = 0;
                do {
                    n13 = n11;
                    n11 = n9;
                    if (n9 >= n10) break block5;
                    n13 = n3.o((byte[])object, n9, p32);
                    n9 = n11 = p32.a;
                    if (n11 == n12) break;
                    n9 = n3.c(n9, (byte[])object, n13, n10, v53, p32);
                } while (true);
                n11 = n13;
                n13 = n9;
            }
            if (n11 > n10) throw k4.e();
            if (n13 != n12) throw k4.e();
            v52.e(n8, v53);
            return n11;
        }
        n9 = n3.o((byte[])object, n9, p32);
        n10 = p32.a;
        if (n10 < 0) throw k4.d();
        if (n10 > object.length - n9) throw k4.f();
        object = n10 == 0 ? q3.p : q3.q((byte[])object, n9, n10);
        v52.e(n8, object);
        return n9 + n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int d(int n8, byte[] arrby, int n9, p3 p32) {
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
                    p32.a = n11 | n8 << 14;
                    return n10;
                }
                n11 |= (n8 & 127) << 14;
                n8 = n9 + 3;
                if ((n10 = arrby[n10]) < 0) break block9;
                n9 = n11;
                n11 = n10 <<= 21;
            }
            p32.a = n9 | n11;
            return n8;
        }
        n11 |= (n10 & 127) << 21;
        n9 += 4;
        n10 = arrby[n8];
        if (n10 >= 0) {
            p32.a = n11 | n10 << 28;
            return n9;
        }
        n8 = n9;
        do {
            n9 = n8 + 1;
            if (arrby[n8] >= 0) {
                p32.a = n11 | (n10 & 127) << 28;
                return n9;
            }
            n8 = n9;
        } while (true);
    }

    public static int e(Z4 z42, int n8, byte[] arrby, int n9, int n10, h4 h42, p3 p32) {
        n9 = n3.g(z42, arrby, n9, n10, p32);
        do {
            h42.add(p32.c);
            if (n9 >= n10) break;
            int n11 = n3.o(arrby, n9, p32);
            if (n8 != p32.a) break;
            n9 = n3.g(z42, arrby, n11, n10, p32);
        } while (true);
        return n9;
    }

    public static int f(Z4 z42, byte[] arrby, int n8, int n9, int n10, p3 p32) {
        Object object = z42.a();
        n8 = n3.h(object, z42, arrby, n8, n9, n10, p32);
        z42.e(object);
        p32.c = object;
        return n8;
    }

    public static int g(Z4 z42, byte[] arrby, int n8, int n9, p3 p32) {
        Object object = z42.a();
        n8 = n3.i(object, z42, arrby, n8, n9, p32);
        z42.e(object);
        p32.c = object;
        return n8;
    }

    public static int h(Object object, Z4 z42, byte[] arrby, int n8, int n9, int n10, p3 p32) {
        n8 = ((M4)z42).m(object, arrby, n8, n9, n10, p32);
        p32.c = object;
        return n8;
    }

    public static int i(Object object, Z4 z42, byte[] arrby, int n8, int n9, p3 p32) {
        int n10 = n8 + 1;
        int n11 = arrby[n8];
        n8 = n10;
        int n12 = n11;
        if (n11 < 0) {
            n8 = n3.d(n11, arrby, n10, p32);
            n12 = p32.a;
        }
        if (n12 >= 0 && n12 <= n9 - n8) {
            n9 = n12 + n8;
            z42.g(object, arrby, n8, n9, p32);
            p32.c = object;
            return n9;
        }
        throw k4.f();
    }

    public static int j(byte[] arrby, int n8, p3 p32) {
        n8 = n3.o(arrby, n8, p32);
        int n9 = p32.a;
        if (n9 >= 0) {
            if (n9 <= arrby.length - n8) {
                if (n9 == 0) {
                    p32.c = q3.p;
                    return n8;
                }
                p32.c = q3.q(arrby, n8, n9);
                return n8 + n9;
            }
            throw k4.f();
        }
        throw k4.d();
    }

    public static int k(byte[] arrby, int n8, h4 h42, p3 p32) {
        h42 = (c4)h42;
        n8 = n3.o(arrby, n8, p32);
        int n9 = p32.a + n8;
        while (n8 < n9) {
            n8 = n3.o(arrby, n8, p32);
            h42.g(p32.a);
        }
        if (n8 == n9) {
            return n8;
        }
        throw k4.f();
    }

    public static float l(byte[] arrby, int n8) {
        return Float.intBitsToFloat((int)n3.n(arrby, n8));
    }

    public static int m(byte[] arrby, int n8, p3 p32) {
        n8 = n3.o(arrby, n8, p32);
        int n9 = p32.a;
        if (n9 >= 0) {
            if (n9 == 0) {
                p32.c = "";
                return n8;
            }
            p32.c = E5.e(arrby, n8, n9);
            return n8 + n9;
        }
        throw k4.d();
    }

    public static int n(byte[] arrby, int n8) {
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        return (arrby[n8 + 3] & 255) << 24 | (by & 255 | (by2 & 255) << 8 | (by3 & 255) << 16);
    }

    public static int o(byte[] arrby, int n8, p3 p32) {
        int n9 = n8 + 1;
        if ((n8 = arrby[n8]) >= 0) {
            p32.a = n8;
            return n9;
        }
        return n3.d(n8, arrby, n9, p32);
    }

    public static int p(byte[] arrby, int n8, p3 p32) {
        int n9 = n8 + 1;
        long l8 = arrby[n8];
        if (l8 >= 0L) {
            p32.b = l8;
            return n9;
        }
        n8 += 2;
        byte by = arrby[n9];
        l8 = l8 & 127L | (long)(by & 127) << 7;
        n9 = 7;
        while (by < 0) {
            by = arrby[n8];
            l8 |= (long)(by & 127) << (n9 += 7);
            ++n8;
        }
        p32.b = l8;
        return n8;
    }

    public static long q(byte[] arrby, int n8) {
        long l8 = arrby[n8];
        long l9 = arrby[n8 + 1];
        long l10 = arrby[n8 + 2];
        long l11 = arrby[n8 + 3];
        long l12 = arrby[n8 + 4];
        long l13 = arrby[n8 + 5];
        long l14 = arrby[n8 + 6];
        return ((long)arrby[n8 + 7] & 255L) << 56 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16 | (l11 & 255L) << 24 | (l12 & 255L) << 32 | (l13 & 255L) << 40 | (l14 & 255L) << 48);
    }
}

