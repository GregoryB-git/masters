/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.charset.Charset
 */
package q3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class e {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public static byte[] a(String string2, int n8) {
        return e.b(string2.getBytes(a), n8);
    }

    public static byte[] b(byte[] arrby, int n8) {
        return e.c(arrby, 0, arrby.length, n8);
    }

    public static byte[] c(byte[] arrby, int n8, int n9, int n10) {
        byte[] arrby2 = new byte[](n10, new byte[n9 * 3 / 4]);
        if (arrby2.a(arrby, n8, n9, true)) {
            n8 = arrby2.b;
            arrby = arrby2.a;
            if (n8 == arrby.length) {
                return arrby;
            }
            arrby2 = new byte[n8];
            System.arraycopy((Object)arrby, (int)0, (Object)arrby2, (int)0, (int)n8);
            return arrby2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String d(byte[] arrby) {
        return e.g(arrby, 2);
    }

    public static byte[] e(byte[] arrby, int n8) {
        return e.f(arrby, 0, arrby.length, n8);
    }

    public static byte[] f(byte[] arrby, int n8, int n9, int n10) {
        c c8 = new c(n10, null);
        int n11 = n9 / 3 * 4;
        boolean bl = c8.f;
        int n12 = 2;
        if (bl) {
            n10 = n11;
            if (n9 % 3 > 0) {
                n10 = n11 + 4;
            }
        } else {
            n10 = n9 % 3;
            n10 = n10 != 1 ? (n10 != 2 ? n11 : n11 + 3) : n11 + 2;
        }
        n11 = n10;
        if (c8.g) {
            n11 = n10;
            if (n9 > 0) {
                int n13 = (n9 - 1) / 57;
                n11 = c8.h ? n12 : 1;
                n11 = n10 + (n13 + 1) * n11;
            }
        }
        c8.a = new byte[n11];
        c8.a(arrby, n8, n9, true);
        return c8.a;
    }

    public static String g(byte[] object, int n8) {
        try {
            object = new String(e.e((byte[])object, n8), "US-ASCII");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    public static abstract class a {
        public byte[] a;
        public int b;
    }

    public static class b
    extends a {
        public static final int[] f = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int[] g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public int c;
        public int d;
        public final int[] e;

        public b(int n8, byte[] arrby) {
            this.a = arrby;
            arrby = (n8 & 8) == 0 ? f : g;
            this.e = arrby;
            this.c = 0;
            this.d = 0;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean a(byte[] var1_1, int var2_2, int var3_3, boolean var4_4) {
            var9_5 = this.c;
            if (var9_5 == 6) {
                return false;
            }
            var10_6 = var3_3 + var2_2;
            var5_7 = this.d;
            var11_8 = this.a;
            var12_9 = this.e;
            var3_3 = 0;
            var6_10 = var2_2;
            var2_2 = var5_7;
            var5_7 = var6_10;
            do {
                block38 : {
                    block35 : {
                        block40 : {
                            block39 : {
                                block36 : {
                                    block37 : {
                                        var7_11 = var2_2;
                                        var6_10 = var3_3;
                                        if (var5_7 >= var10_6) break;
                                        var8_12 = var5_7;
                                        var6_10 = var2_2;
                                        var7_11 = var3_3;
                                        if (var9_5 == 0) {
                                            while ((var7_11 = var5_7 + 4) <= var10_6) {
                                                var2_2 = var6_10 = var12_9[var1_1[var5_7] & 255] << 18 | var12_9[var1_1[var5_7 + 1] & 255] << 12 | var12_9[var1_1[var5_7 + 2] & 255] << 6 | var12_9[var1_1[var5_7 + 3] & 255];
                                                if (var6_10 < 0) break;
                                                var11_8[var3_3 + 2] = (byte)var6_10;
                                                var11_8[var3_3 + 1] = (byte)(var6_10 >> 8);
                                                var11_8[var3_3] = (byte)(var6_10 >> 16);
                                                var3_3 += 3;
                                                var5_7 = var7_11;
                                                var2_2 = var6_10;
                                            }
                                            var8_12 = var5_7;
                                            var6_10 = var2_2;
                                            var7_11 = var3_3;
                                            if (var5_7 >= var10_6) {
                                                var7_11 = var2_2;
                                                var6_10 = var3_3;
                                                break;
                                            }
                                        }
                                        var5_7 = var12_9[var1_1[var8_12] & 255];
                                        if (var9_5 == 0) break block35;
                                        if (var9_5 == 1) break block36;
                                        if (var9_5 == 2) break block37;
                                        if (var9_5 != 3) {
                                            if (var9_5 != 4) {
                                                if (var9_5 != 5) {
                                                    var2_2 = var9_5;
                                                    var3_3 = var7_11;
                                                } else {
                                                    var2_2 = var9_5;
                                                    var3_3 = var7_11;
                                                    if (var5_7 != -1) {
                                                        this.c = 6;
                                                        return false;
                                                    }
                                                }
                                            } else if (var5_7 == -2) {
                                                var2_2 = var9_5 + 1;
                                                var3_3 = var7_11;
                                            } else {
                                                var2_2 = var9_5;
                                                var3_3 = var7_11;
                                                if (var5_7 != -1) {
                                                    this.c = 6;
                                                    return false;
                                                }
                                            }
                                        } else if (var5_7 >= 0) {
                                            var6_10 = var5_7 | var6_10 << 6;
                                            var11_8[var7_11 + 2] = (byte)var6_10;
                                            var11_8[var7_11 + 1] = (byte)(var6_10 >> 8);
                                            var11_8[var7_11] = (byte)(var6_10 >> 16);
                                            var3_3 = var7_11 + 3;
                                            var2_2 = 0;
                                        } else if (var5_7 == -2) {
                                            var11_8[var7_11 + 1] = (byte)(var6_10 >> 2);
                                            var11_8[var7_11] = (byte)(var6_10 >> 10);
                                            var3_3 = var7_11 + 2;
                                            var2_2 = 5;
                                        } else {
                                            var2_2 = var9_5;
                                            var3_3 = var7_11;
                                            if (var5_7 != -1) {
                                                this.c = 6;
                                                return false;
                                            }
                                        }
                                        break block38;
                                    }
                                    if (var5_7 >= 0) break block39;
                                    if (var5_7 == -2) {
                                        var11_8[var7_11] = (byte)(var6_10 >> 4);
                                        var3_3 = var7_11 + 1;
                                        var2_2 = 4;
                                    } else {
                                        var2_2 = var9_5;
                                        var3_3 = var7_11;
                                        if (var5_7 != -1) {
                                            this.c = 6;
                                            return false;
                                        }
                                    }
                                    break block38;
                                }
                                if (var5_7 < 0) break block40;
                            }
                            var2_2 = var5_7 | var6_10 << 6;
                            ** GOTO lbl111
                        }
                        var2_2 = var9_5;
                        var3_3 = var7_11;
                        if (var5_7 != -1) {
                            this.c = 6;
                            return false;
                        }
                        break block38;
                    }
                    if (var5_7 >= 0) {
                        var2_2 = var5_7;
lbl111: // 2 sources:
                        var3_3 = var9_5 + 1;
                        var6_10 = var2_2;
                        var2_2 = var3_3;
                        var3_3 = var7_11;
                    } else {
                        var2_2 = var9_5;
                        var3_3 = var7_11;
                        if (var5_7 != -1) {
                            this.c = 6;
                            return false;
                        }
                    }
                }
                var5_7 = var8_12 + 1;
                var9_5 = var2_2;
                var2_2 = var6_10;
            } while (true);
            if (!var4_4) {
                this.c = var9_5;
                this.d = var7_11;
            } else {
                if (var9_5 == 1) {
                    this.c = 6;
                    return false;
                }
                if (var9_5 != 2) {
                    if (var9_5 != 3) {
                        if (var9_5 == 4) {
                            this.c = 6;
                            return false;
                        }
                    } else {
                        var11_8[var6_10] = (byte)(var7_11 >> 10);
                        var2_2 = var6_10 + 2;
                        var11_8[var6_10 + 1] = (byte)(var7_11 >> 2);
                        var6_10 = var2_2;
                    }
                } else {
                    var11_8[var6_10] = (byte)(var7_11 >> 4);
                    ++var6_10;
                }
                this.c = var9_5;
            }
            this.b = var6_10;
            return true;
        }
    }

    public static class c
    extends a {
        public static final byte[] j = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        public static final byte[] k = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public final byte[] c;
        public int d;
        public int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final byte[] i;

        public c(int n8, byte[] arrby) {
            this.a = arrby;
            boolean bl = true;
            boolean bl2 = (n8 & 1) == 0;
            this.f = bl2;
            bl2 = (n8 & 2) == 0;
            this.g = bl2;
            if ((n8 & 4) == 0) {
                bl = false;
            }
            this.h = bl;
            arrby = (n8 & 8) == 0 ? j : k;
            this.i = arrby;
            this.c = new byte[2];
            this.d = 0;
            n8 = bl2 ? 19 : -1;
            this.e = n8;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean a(byte[] var1_1, int var2_2, int var3_3, boolean var4_4) {
            block33 : {
                block29 : {
                    block32 : {
                        block34 : {
                            block35 : {
                                block30 : {
                                    block31 : {
                                        block28 : {
                                            block26 : {
                                                block27 : {
                                                    block25 : {
                                                        block24 : {
                                                            var11_5 = this.i;
                                                            var12_6 = this.a;
                                                            var5_7 = this.e;
                                                            var9_8 = var3_3 + var2_2;
                                                            var3_3 = this.d;
                                                            var8_9 = 0;
                                                            var7_10 = 0;
                                                            if (var3_3 == 1) break block24;
                                                            if (var3_3 != 2 || (var3_3 = var2_2 + 1) > var9_8) ** GOTO lbl-1000
                                                            var13_11 = this.c;
                                                            var6_12 = var13_11[0];
                                                            var2_2 = (var13_11[1] & 255) << 8 | (var6_12 & 255) << 16 | var1_1[var2_2] & 255;
                                                            this.d = 0;
                                                            break block25;
                                                        }
                                                        if (var2_2 + 2 <= var9_8) {
                                                            var6_12 = this.c[0];
                                                            var10_13 = var1_1[var2_2];
                                                            var3_3 = var2_2 + 2;
                                                            var2_2 = var1_1[var2_2 + 1] & 255 | ((var6_12 & 255) << 16 | (var10_13 & 255) << 8);
                                                            this.d = 0;
                                                        } else lbl-1000: // 2 sources:
                                                        {
                                                            var6_12 = -1;
                                                            var3_3 = var2_2;
                                                            var2_2 = var6_12;
                                                        }
                                                    }
                                                    if (var2_2 == -1) break block26;
                                                    var12_6[0] = var11_5[var2_2 >> 18 & 63];
                                                    var12_6[1] = var11_5[var2_2 >> 12 & 63];
                                                    var12_6[2] = var11_5[var2_2 >> 6 & 63];
                                                    var12_6[3] = var11_5[var2_2 & 63];
                                                    if (--var5_7 != 0) break block27;
                                                    if (this.h) {
                                                        var12_6[4] = 13;
                                                        var2_2 = 5;
                                                    } else {
                                                        var2_2 = 4;
                                                    }
                                                    break block28;
                                                }
                                                var2_2 = 4;
                                                ** GOTO lbl51
                                            }
                                            var2_2 = 0;
                                            ** GOTO lbl51
                                        }
                                        var5_7 = var2_2 + 1;
                                        var12_6[var2_2] = 10;
                                        var2_2 = var5_7;
                                        block0 : do {
                                            var5_7 = 19;
lbl51: // 4 sources:
                                            while ((var6_12 = var3_3 + 3) <= var9_8) {
                                                var10_13 = var1_1[var3_3];
                                                var3_3 = (var1_1[var3_3 + 1] & 255) << 8 | (var10_13 & 255) << 16 | var1_1[var3_3 + 2] & 255;
                                                var12_6[var2_2] = var11_5[var3_3 >> 18 & 63];
                                                var12_6[var2_2 + 1] = var11_5[var3_3 >> 12 & 63];
                                                var12_6[var2_2 + 2] = var11_5[var3_3 >> 6 & 63];
                                                var12_6[var2_2 + 3] = var11_5[var3_3 & 63];
                                                var3_3 = var2_2 + 4;
                                                if (--var5_7 == 0) {
                                                    var5_7 = var3_3;
                                                    if (this.h) {
                                                        var12_6[var3_3] = 13;
                                                        var5_7 = var2_2 + 5;
                                                    }
                                                    var2_2 = var5_7 + 1;
                                                    var12_6[var5_7] = 10;
                                                    var3_3 = var6_12;
                                                    continue block0;
                                                }
                                                var2_2 = var3_3;
                                                var3_3 = var6_12;
                                            }
                                            break;
                                        } while (true);
                                        if (!var4_4) break block29;
                                        var10_13 = this.d;
                                        if (var3_3 - var10_13 != var9_8 - 1) break block30;
                                        if (var10_13 > 0) {
                                            var6_12 = this.c[0];
                                            var3_3 = 1;
                                        } else {
                                            var6_12 = var1_1[var3_3];
                                            var3_3 = var7_10;
                                        }
                                        var7_10 = (var6_12 & 255) << 4;
                                        this.d = var10_13 - var3_3;
                                        var12_6[var2_2] = var11_5[var7_10 >> 6 & 63];
                                        var6_12 = var2_2 + 2;
                                        var12_6[var2_2 + 1] = var11_5[var7_10 & 63];
                                        var3_3 = var6_12;
                                        if (this.f) {
                                            var12_6[var6_12] = 61;
                                            var3_3 = var2_2 + 4;
                                            var12_6[var2_2 + 3] = 61;
                                        }
                                        if (!this.g) break block31;
                                        var2_2 = var3_3;
                                        if (this.h) {
                                            var12_6[var3_3] = 13;
                                            var2_2 = var3_3 + 1;
                                        }
                                        var3_3 = var2_2 + 1;
                                        var12_6[var2_2] = 10;
                                        var2_2 = var3_3;
                                        break block32;
                                    }
                                    var6_12 = var3_3;
                                    break block33;
                                }
                                if (var3_3 - var10_13 != var9_8 - 2) break block34;
                                if (var10_13 > 1) {
                                    var7_10 = this.c[0];
                                    var6_12 = 1;
                                } else {
                                    var7_10 = var1_1[var3_3];
                                    ++var3_3;
                                    var6_12 = var8_9;
                                }
                                if (var10_13 > 0) {
                                    var1_1 = this.c;
                                    var3_3 = var6_12 + 1;
                                    var6_12 = var1_1[var6_12];
                                } else {
                                    var8_9 = var1_1[var3_3];
                                    var3_3 = var6_12;
                                    var6_12 = var8_9;
                                }
                                var7_10 = (var7_10 & 255) << 10 | (var6_12 & 255) << 2;
                                this.d = var10_13 - var3_3;
                                var12_6[var2_2] = var11_5[var7_10 >> 12 & 63];
                                var12_6[var2_2 + 1] = var11_5[var7_10 >> 6 & 63];
                                var6_12 = var2_2 + 3;
                                var12_6[var2_2 + 2] = var11_5[var7_10 & 63];
                                var3_3 = var6_12;
                                if (this.f) {
                                    var12_6[var6_12] = 61;
                                    var3_3 = var2_2 + 4;
                                }
                                if (!this.g) break block35;
                                var2_2 = var3_3;
                                if (this.h) {
                                    var12_6[var3_3] = 13;
                                    var2_2 = var3_3 + 1;
                                }
                                var3_3 = var2_2 + 1;
                                var12_6[var2_2] = 10;
                                var2_2 = var3_3;
                                break block32;
                            }
                            var6_12 = var3_3;
                            break block33;
                        }
                        var6_12 = var2_2;
                        if (!this.g) break block33;
                        var6_12 = var2_2;
                        if (var2_2 <= 0) break block33;
                        var6_12 = var2_2;
                        if (var5_7 == 19) break block33;
                        var3_3 = var2_2;
                        if (this.h) {
                            var12_6[var2_2] = 13;
                            var3_3 = var2_2 + 1;
                        }
                        var2_2 = var3_3 + 1;
                        var12_6[var3_3] = 10;
                    }
                    var6_12 = var2_2;
                    break block33;
                }
                if (var3_3 == var9_8 - 1) {
                    var11_5 = this.c;
                    var6_12 = this.d;
                    this.d = var6_12 + 1;
                    var11_5[var6_12] = var1_1[var3_3];
                    var6_12 = var2_2;
                } else {
                    var6_12 = var2_2;
                    if (var3_3 == var9_8 - 2) {
                        var11_5 = this.c;
                        var6_12 = this.d;
                        var11_5[var6_12] = var1_1[var3_3];
                        this.d = var6_12 + 2;
                        var11_5[var6_12 + 1] = var1_1[var3_3 + 1];
                        var6_12 = var2_2;
                    }
                }
            }
            this.b = var6_12;
            this.e = var5_7;
            return true;
        }
    }

}

