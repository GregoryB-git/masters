/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 */
package F0;

import d0.A;
import g0.o;
import g0.y;

public abstract class a {
    public static final int[] a = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int n8, int n9, int n10) {
        return new byte[]{(byte)(n8 << 3 & 248 | n9 >> 1 & 7), (byte)(n9 << 7 & 128 | n10 << 3 & 120)};
    }

    public static int b(y y8) {
        int n8;
        int n9 = n8 = y8.h(5);
        if (n8 == 31) {
            n9 = y8.h(6) + 32;
        }
        return n9;
    }

    public static int c(y y8) {
        int n8 = y8.h(4);
        if (n8 == 15) {
            if (y8.b() >= 24) {
                return y8.h(24);
            }
            throw A.a("AAC header insufficient data", null);
        }
        if (n8 < 13) {
            return a[n8];
        }
        throw A.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(y y8, boolean bl) {
        int n8;
        int n9;
        Object object;
        int n10;
        block14 : {
            int n11;
            int n12;
            int n13;
            block13 : {
                n13 = a.b(y8);
                n8 = a.c(y8);
                n11 = y8.h(4);
                object = new StringBuilder();
                object.append("mp4a.40.");
                object.append(n13);
                object = object.toString();
                if (n13 == 5) break block13;
                n9 = n13;
                n10 = n11;
                if (n13 != 29) break block14;
            }
            n13 = a.c(y8);
            n9 = n12 = a.b(y8);
            n8 = n13;
            n10 = n11;
            if (n12 == 22) {
                n10 = y8.h(4);
                n8 = n13;
                n9 = n12;
            }
        }
        if (bl) {
            if (n9 != 1 && n9 != 2 && n9 != 3 && n9 != 4 && n9 != 6 && n9 != 7 && n9 != 17) {
                switch (n9) {
                    default: {
                        y8 = new StringBuilder();
                        y8.append("Unsupported audio object type: ");
                        y8.append(n9);
                        throw A.d(y8.toString());
                    }
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                }
            }
            a.f(y8, n9, n10);
            switch (n9) {
                default: {
                    break;
                }
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    n9 = y8.h(2);
                    if (n9 != 2 && n9 != 3) break;
                    y8 = new StringBuilder();
                    y8.append("Unsupported epConfig: ");
                    y8.append(n9);
                    throw A.d(y8.toString());
                }
            }
        }
        if ((n9 = b[n10]) != -1) {
            return new b(n8, n9, (String)object, null);
        }
        throw A.a(null, null);
    }

    public static b e(byte[] arrby) {
        return a.d(new y(arrby), false);
    }

    public static void f(y y8, int n8, int n9) {
        if (y8.g()) {
            o.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (y8.g()) {
            y8.r(14);
        }
        boolean bl = y8.g();
        if (n9 != 0) {
            if (n8 == 6 || n8 == 20) {
                y8.r(3);
            }
            if (bl) {
                if (n8 == 22) {
                    y8.r(16);
                }
                if (n8 == 17 || n8 == 19 || n8 == 20 || n8 == 23) {
                    y8.r(3);
                }
                y8.r(1);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        public b(int n8, int n9, String string2) {
            this.a = n8;
            this.b = n9;
            this.c = string2;
        }

        public /* synthetic */ b(int n8, int n9, String string2,  a8) {
            this(n8, n9, string2);
        }
    }

}

