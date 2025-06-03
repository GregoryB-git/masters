/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package F0;

public abstract class I {
    public static final String[] a = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = new int[]{44100, 48000, 32000};
    public static final int[] c = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static /* synthetic */ boolean a(int n8) {
        return I.l(n8);
    }

    public static /* synthetic */ String[] b() {
        return a;
    }

    public static /* synthetic */ int[] c() {
        return b;
    }

    public static /* synthetic */ int d(int n8, int n9) {
        return I.k(n8, n9);
    }

    public static /* synthetic */ int[] e() {
        return c;
    }

    public static /* synthetic */ int[] f() {
        return d;
    }

    public static /* synthetic */ int[] g() {
        return e;
    }

    public static /* synthetic */ int[] h() {
        return f;
    }

    public static /* synthetic */ int[] i() {
        return g;
    }

    public static int j(int n8) {
        if (!I.l(n8)) {
            return -1;
        }
        int n9 = n8 >>> 19 & 3;
        if (n9 == 1) {
            return -1;
        }
        int n10 = n8 >>> 17 & 3;
        if (n10 == 0) {
            return -1;
        }
        int n11 = n8 >>> 12 & 15;
        if (n11 != 0) {
            if (n11 == 15) {
                return -1;
            }
            int n12 = n8 >>> 10 & 3;
            if (n12 == 3) {
                return -1;
            }
            int n13 = b[n12];
            if (n9 == 2) {
                n12 = n13 / 2;
            } else {
                n12 = n13;
                if (n9 == 0) {
                    n12 = n13 / 4;
                }
            }
            int n14 = n8 >>> 9 & 1;
            if (n10 == 3) {
                n8 = n9 == 3 ? c[n11 - 1] : d[n11 - 1];
                return (n8 * 12 / n12 + n14) * 4;
            }
            n8 = n9 == 3 ? (n10 == 2 ? e[n11 - 1] : f[n11 - 1]) : g[n11 - 1];
            n13 = 144;
            if (n9 == 3) {
                return n8 * 144 / n12 + n14;
            }
            if (n10 == 1) {
                n13 = 72;
            }
            return n13 * n8 / n12 + n14;
        }
        return -1;
    }

    public static int k(int n8, int n9) {
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
            return 1152;
        }
        if (n8 == 3) {
            return 1152;
        }
        return 576;
    }

    public static boolean l(int n8) {
        if ((n8 & -2097152) == -2097152) {
            return true;
        }
        return false;
    }

    public static int m(int n8) {
        if (!I.l(n8)) {
            return -1;
        }
        int n9 = n8 >>> 19 & 3;
        if (n9 == 1) {
            return -1;
        }
        int n10 = n8 >>> 17 & 3;
        if (n10 == 0) {
            return -1;
        }
        int n11 = n8 >>> 12 & 15;
        if (n11 != 0 && n11 != 15) {
            if ((n8 >>> 10 & 3) == 3) {
                return -1;
            }
            return I.k(n9, n10);
        }
        return -1;
    }

    public static final class a {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a() {
        }

        public a(a a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
            this.d = a8.d;
            this.e = a8.e;
            this.f = a8.f;
            this.g = a8.g;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean a(int var1_1) {
            block15 : {
                block14 : {
                    block13 : {
                        block12 : {
                            if (!I.a(var1_1)) {
                                return false;
                            }
                            var6_2 = var1_1 >>> 19 & 3;
                            if (var6_2 == 1) {
                                return false;
                            }
                            var5_3 = var1_1 >>> 17 & 3;
                            if (var5_3 == 0) {
                                return false;
                            }
                            var7_4 = var1_1 >>> 12 & 15;
                            if (var7_4 == 0) return false;
                            if (var7_4 == 15) {
                                return false;
                            }
                            var2_5 = var1_1 >>> 10 & 3;
                            if (var2_5 == 3) {
                                return false;
                            }
                            this.a = var6_2;
                            this.b = I.b()[3 - var5_3];
                            this.d = var2_5 = I.c()[var2_5];
                            var3_6 = 2;
                            if (var6_2 != 2) break block12;
                            var2_5 /= 2;
                            break block13;
                        }
                        if (var6_2 != 0) break block14;
                        var2_5 /= 4;
                    }
                    this.d = var2_5;
                }
                var4_7 = var1_1 >>> 9 & 1;
                this.g = I.d(var6_2, var5_3);
                if (var5_3 != 3) break block15;
                var2_5 = var6_2 == 3 ? I.e()[var7_4 - 1] : I.f()[var7_4 - 1];
                this.f = var2_5;
                var2_5 = (var2_5 * 12 / this.d + var4_7) * 4;
                ** GOTO lbl42
            }
            var2_5 = 144;
            if (var6_2 == 3) {
                var2_5 = var5_3 == 2 ? I.g()[var7_4 - 1] : I.h()[var7_4 - 1];
                this.f = var2_5;
                var2_5 = var2_5 * 144 / this.d + var4_7;
lbl42: // 2 sources:
                this.c = var2_5;
            } else {
                this.f = var6_2 = I.i()[var7_4 - 1];
                if (var5_3 == 1) {
                    var2_5 = 72;
                }
                this.c = var2_5 * var6_2 / this.d + var4_7;
            }
            var2_5 = var3_6;
            if ((var1_1 >> 6 & 3) == 3) {
                var2_5 = 1;
            }
            this.e = var2_5;
            return true;
        }
    }

}

