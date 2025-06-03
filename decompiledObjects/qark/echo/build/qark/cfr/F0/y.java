/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.System
 */
package F0;

import F0.B;
import F0.s;
import F0.u;
import d0.A;
import g0.M;
import g0.z;

public abstract class y {
    public static boolean a(z z8, B b8, int n8) {
        if ((n8 = y.j(z8, n8)) != -1 && n8 <= b8.b) {
            return true;
        }
        return false;
    }

    public static boolean b(z z8, int n8) {
        int n9 = z8.G();
        int n10 = z8.f();
        if (n9 == M.y(z8.e(), n8, n10 - 1, 0)) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(z z8, B b8, boolean bl, a a8) {
        long l8;
        block3 : {
            try {
                l8 = z8.N();
                if (bl) break block3;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            l8 *= (long)b8.b;
        }
        a8.a = l8;
        return true;
    }

    public static boolean d(z z8, B b8, int n8, a a8) {
        int n9 = z8.f();
        long l8 = z8.I();
        long l9 = l8 >>> 16;
        long l10 = n8;
        boolean bl = false;
        if (l9 != l10) {
            return false;
        }
        boolean bl2 = (l9 & 1L) == 1L;
        int n10 = (int)(l8 >> 12 & 15L);
        int n11 = (int)(l8 >> 8 & 15L);
        int n12 = (int)(l8 >> 4 & 15L);
        int n13 = (int)(l8 >> 1 & 7L);
        n8 = (l8 & 1L) == 1L ? 1 : 0;
        boolean bl3 = bl;
        if (y.g(n12, b8)) {
            bl3 = bl;
            if (y.f(n13, b8)) {
                bl3 = bl;
                if (n8 == 0) {
                    bl3 = bl;
                    if (y.c(z8, b8, bl2, a8)) {
                        bl3 = bl;
                        if (y.a(z8, b8, n10)) {
                            bl3 = bl;
                            if (y.e(z8, b8, n11)) {
                                bl3 = bl;
                                if (y.b(z8, n9)) {
                                    bl3 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl3;
    }

    public static boolean e(z z8, B b8, int n8) {
        int n9 = b8.e;
        if (n8 == 0) {
            return true;
        }
        if (n8 <= 11) {
            if (n8 == b8.f) {
                return true;
            }
            return false;
        }
        if (n8 == 12) {
            if (z8.G() * 1000 == n9) {
                return true;
            }
            return false;
        }
        if (n8 <= 14) {
            int n10;
            int n11 = n10 = z8.M();
            if (n8 == 14) {
                n11 = n10 * 10;
            }
            if (n11 == n9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean f(int n8, B b8) {
        if (n8 == 0) {
            return true;
        }
        if (n8 == b8.i) {
            return true;
        }
        return false;
    }

    public static boolean g(int n8, B b8) {
        boolean bl = false;
        boolean bl2 = false;
        if (n8 <= 7) {
            if (n8 == b8.g - 1) {
                bl2 = true;
            }
            return bl2;
        }
        bl2 = bl;
        if (n8 <= 10) {
            bl2 = bl;
            if (b8.g == 2) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public static boolean h(s s8, B b8, int n8, a a8) {
        long l8 = s8.m();
        byte[] arrby = new byte[2];
        s8.n(arrby, 0, 2);
        if (((arrby[0] & 255) << 8 | arrby[1] & 255) != n8) {
            s8.h();
            s8.o((int)(l8 - s8.p()));
            return false;
        }
        z z8 = new z(16);
        System.arraycopy((Object)arrby, (int)0, (Object)z8.e(), (int)0, (int)2);
        z8.S(u.c(s8, z8.e(), 2, 14));
        s8.h();
        s8.o((int)(l8 - s8.p()));
        return y.d(z8, b8, n8, a8);
    }

    public static long i(s object, B b8) {
        object.h();
        boolean bl = true;
        object.o(1);
        Object object2 = new byte[1];
        object.n((byte[])object2, 0, 1);
        if ((object2[0] & 1) != 1) {
            bl = false;
        }
        object.o(2);
        int n8 = bl ? 7 : 6;
        object2 = new z(n8);
        object2.S(u.c((s)object, object2.e(), 0, n8));
        object.h();
        object = new a();
        if (y.c((z)object2, b8, bl, (a)object)) {
            return object.a;
        }
        throw A.a(null, null);
    }

    public static int j(z z8, int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 256 << n8 - 8;
            }
            case 7: {
                return z8.M() + 1;
            }
            case 6: {
                return z8.G() + 1;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 576 << n8 - 2;
            }
            case 1: 
        }
        return 192;
    }

    public static final class a {
        public long a;
    }

}

