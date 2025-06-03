/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package l1;

import Z2.d;
import Z2.e;
import d0.A;
import g0.a;
import g0.y;

public abstract class v {
    public static int a(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2 && n8 != 3) {
                    if (n8 == 4) {
                        return 4096;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported coreSbrFrameLengthIndex ");
                    stringBuilder.append(n8);
                    throw A.d(stringBuilder.toString());
                }
                return 2048;
            }
            return 1024;
        }
        return 768;
    }

    public static double b(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported sampling rate ");
                stringBuilder.append(n8);
                throw A.d(stringBuilder.toString());
            }
            case 44100: 
            case 48000: 
            case 88200: 
            case 96000: {
                return 1.0;
            }
            case 29400: 
            case 32000: 
            case 58800: 
            case 64000: {
                return 1.5;
            }
            case 22050: 
            case 24000: {
                return 2.0;
            }
            case 14700: 
            case 16000: 
        }
        return 3.0;
    }

    public static int c(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported sampling rate index ");
                stringBuilder.append(n8);
                throw A.d(stringBuilder.toString());
            }
            case 27: {
                return 9600;
            }
            case 26: {
                return 12800;
            }
            case 25: {
                return 14400;
            }
            case 24: {
                return 17075;
            }
            case 23: {
                return 19200;
            }
            case 22: {
                return 20000;
            }
            case 21: {
                return 25600;
            }
            case 20: {
                return 28800;
            }
            case 19: {
                return 34150;
            }
            case 18: {
                return 38400;
            }
            case 17: {
                return 40000;
            }
            case 16: {
                return 51200;
            }
            case 15: {
                return 57600;
            }
            case 12: {
                return 7350;
            }
            case 11: {
                return 8000;
            }
            case 10: {
                return 11025;
            }
            case 9: {
                return 12000;
            }
            case 8: {
                return 16000;
            }
            case 7: {
                return 22050;
            }
            case 6: {
                return 24000;
            }
            case 5: {
                return 32000;
            }
            case 4: {
                return 44100;
            }
            case 3: {
                return 48000;
            }
            case 2: {
                return 64000;
            }
            case 1: {
                return 88200;
            }
            case 0: 
        }
        return 96000;
    }

    public static int d(int n8) {
        if (n8 != 0 && n8 != 1) {
            int n9 = 2;
            if (n8 != 2) {
                n9 = 3;
                if (n8 != 3) {
                    if (n8 == 4) {
                        return 1;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported coreSbrFrameLengthIndex ");
                    stringBuilder.append(n8);
                    throw A.d(stringBuilder.toString());
                }
            }
            return n9;
        }
        return 0;
    }

    public static boolean e(int n8) {
        if ((n8 & 16777215) == 12583333) {
            return true;
        }
        return false;
    }

    public static int f(y y8) {
        if (y8.g()) {
            y8.r(2);
            return y8.h(13);
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean g(y y8, b b8) {
        int n8;
        long l8;
        y8.d();
        b8.a = n8 = v.k(y8, 3, 8, 8);
        boolean bl = false;
        if (n8 == -1) {
            return false;
        }
        b8.b = l8 = v.l(y8, 2, 8, 32);
        if (l8 == -1L) {
            return false;
        }
        if (l8 <= 16L) {
            if (l8 == 0L) {
                n8 = b8.a;
                if (n8 == 1) throw A.a("Mpegh3daConfig packet with invalid packet label 0", null);
                if (n8 == 2) throw A.a("Mpegh3daFrame packet with invalid packet label 0", null);
                if (n8 == 17) throw A.a("AudioTruncation packet with invalid packet label 0", null);
            }
            b8.c = n8 = v.k(y8, 11, 24, 24);
            if (n8 == -1) return bl;
            return true;
        }
        y8 = new StringBuilder();
        y8.append("Contains sub-stream with an invalid packet label ");
        y8.append(b8.b);
        throw A.d(y8.toString());
    }

    public static c h(y y8) {
        int n8 = y8.h(8);
        int n9 = y8.h(5);
        n9 = n9 == 31 ? y8.h(24) : v.c(n9);
        int n10 = y8.h(3);
        int n11 = v.a(n10);
        n10 = v.d(n10);
        y8.r(2);
        v.p(y8);
        v.m(y8, v.j(y8), n10);
        boolean bl = y8.g();
        byte[] arrby = null;
        byte[] arrby2 = null;
        if (bl) {
            int n12 = v.k(y8, 2, 4, 8);
            n10 = 0;
            do {
                arrby = arrby2;
                if (n10 >= n12 + 1) break;
                int n13 = v.k(y8, 4, 8, 16);
                int n14 = v.k(y8, 4, 8, 16);
                if (n13 == 7) {
                    n14 = y8.h(4) + 1;
                    y8.r(4);
                    arrby2 = new byte[n14];
                    for (n13 = 0; n13 < n14; ++n13) {
                        arrby2[n13] = (byte)y8.h(8);
                    }
                } else {
                    y8.r(n14 * 8);
                }
                ++n10;
            } while (true);
        }
        double d8 = v.b(n9);
        return new c(n8, (int)((double)n9 * d8), (int)((double)n11 * d8), arrby, null);
    }

    public static boolean i(y y8) {
        y8.r(3);
        boolean bl = y8.g();
        if (bl) {
            y8.r(13);
        }
        return bl;
    }

    public static int j(y y8) {
        int n8 = y8.h(5);
        int n9 = 0;
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            int n10 = y8.h(3);
            n9 += v.k(y8, 5, 8, 16) + 1;
            if (n10 != 0 && n10 != 2 || !y8.g()) continue;
            v.p(y8);
        }
        return n9;
    }

    public static int k(y y8, int n8, int n9, int n10) {
        int n11;
        boolean bl = Math.max((int)Math.max((int)n8, (int)n9), (int)n10) <= 31;
        a.a(bl);
        int n12 = (1 << n8) - 1;
        int n13 = (1 << n9) - 1;
        d.a(d.a(n12, n13), 1 << n10);
        if (y8.b() < n8) {
            return -1;
        }
        n8 = n11 = y8.h(n8);
        if (n11 == n12) {
            if (y8.b() < n9) {
                return -1;
            }
            n12 = y8.h(n9);
            n8 = n9 = n11 + n12;
            if (n12 == n13) {
                if (y8.b() < n10) {
                    return -1;
                }
                n8 = n9 + y8.h(n10);
            }
        }
        return n8;
    }

    public static long l(y y8, int n8, int n9, int n10) {
        long l8;
        boolean bl = Math.max((int)Math.max((int)n8, (int)n9), (int)n10) <= 63;
        a.a(bl);
        long l9 = (1L << n8) - 1L;
        long l10 = (1L << n9) - 1L;
        e.a(e.a(l9, l10), 1L << n10);
        if (y8.b() < n8) {
            return -1L;
        }
        long l11 = l8 = y8.j(n8);
        if (l8 == l9) {
            if (y8.b() < n9) {
                return -1L;
            }
            l9 = y8.j(n9);
            l11 = l8 += l9;
            if (l9 == l10) {
                if (y8.b() < n10) {
                    return -1L;
                }
                l11 = l8 + y8.j(n10);
            }
        }
        return l11;
    }

    public static void m(y y8, int n8, int n9) {
        int n10 = v.k(y8, 4, 8, 16);
        y8.q();
        for (int i8 = 0; i8 < n10 + 1; ++i8) {
            int n11 = y8.h(2);
            if (n11 != 0) {
                int n12;
                if (n11 != 1) {
                    if (n11 != 3) continue;
                    v.k(y8, 4, 8, 16);
                    n11 = v.k(y8, 4, 8, 16);
                    if (y8.g()) {
                        v.k(y8, 8, 16, 0);
                    }
                    y8.q();
                    if (n11 <= 0) continue;
                    y8.r(n11 * 8);
                    continue;
                }
                if (v.i(y8)) {
                    y8.q();
                }
                if (n9 > 0) {
                    v.o(y8);
                    n11 = y8.h(2);
                } else {
                    n11 = 0;
                }
                if (n11 > 0) {
                    y8.r(6);
                    n12 = y8.h(2);
                    y8.r(4);
                    if (y8.g()) {
                        y8.r(5);
                    }
                    if (n11 == 2 || n11 == 3) {
                        y8.r(6);
                    }
                    if (n12 == 2) {
                        y8.q();
                    }
                }
                n11 = (int)Math.floor((double)(Math.log((double)(n8 - 1)) / Math.log((double)2.0))) + 1;
                n12 = y8.h(2);
                if (n12 > 0 && y8.g()) {
                    y8.r(n11);
                }
                if (y8.g()) {
                    y8.r(n11);
                }
                if (n9 != 0 || n12 != 0) continue;
                y8.q();
                continue;
            }
            v.i(y8);
            if (n9 <= 0) continue;
            v.o(y8);
        }
    }

    public static void n(y y8, int n8) {
        boolean bl = y8.g();
        int n9 = 5;
        int n10 = bl ? 1 : 5;
        if (bl) {
            n9 = 7;
        }
        int n11 = bl ? 8 : 6;
        int n12 = 0;
        while (n12 < n8) {
            int n13;
            if (y8.g()) {
                y8.r(7);
                n13 = 0;
            } else {
                if (y8.h(2) == 3 && y8.h(n9) * n10 != 0) {
                    y8.q();
                }
                if ((n13 = y8.h(n11) * n10) != 0 && n13 != 180) {
                    y8.q();
                }
                y8.q();
            }
            int n14 = n12;
            if (n13 != 0) {
                n14 = n12;
                if (n13 != 180) {
                    n14 = n12;
                    if (y8.g()) {
                        n14 = n12 + 1;
                    }
                }
            }
            n12 = n14 + 1;
        }
    }

    public static void o(y y8) {
        y8.r(3);
        y8.r(8);
        boolean bl = y8.g();
        boolean bl2 = y8.g();
        if (bl) {
            y8.r(5);
        }
        if (bl2) {
            y8.r(6);
        }
    }

    public static void p(y y8) {
        int n8 = y8.h(2);
        if (n8 == 0) {
            y8.r(6);
            return;
        }
        int n9 = v.k(y8, 5, 8, 16) + 1;
        if (n8 == 1) {
            y8.r(n9 * 7);
            return;
        }
        if (n8 == 2) {
            v.n(y8, n9);
        }
    }

    public static class b {
        public int a;
        public long b;
        public int c;
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final byte[] d;

        public c(int n8, int n9, int n10, byte[] arrby) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = arrby;
        }

        public /* synthetic */ c(int n8, int n9, int n10, byte[] arrby,  a8) {
            this(n8, n9, n10, arrby);
        }
    }

}

