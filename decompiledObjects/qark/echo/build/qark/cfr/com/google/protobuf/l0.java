/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.protobuf;

import com.google.protobuf.k0;

public abstract class l0 {
    public static final a a;

    static {
        a a8 = d.d() && !com.google.protobuf.d.c() ? new d() : new b();
        a = a8;
    }

    public static int e(CharSequence charSequence, byte[] arrby, int n8, int n9) {
        return a.a(charSequence, arrby, n8, n9);
    }

    public static int f(CharSequence charSequence) {
        int n8;
        int n9;
        block3 : {
            int n10;
            n8 = charSequence.length();
            for (n10 = 0; n10 < n8 && charSequence.charAt(n10) < ''; ++n10) {
            }
            int n11 = n8;
            do {
                n9 = n11;
                if (n10 >= n8) break block3;
                n9 = charSequence.charAt(n10);
                if (n9 >= 2048) break;
                n11 += 127 - n9 >>> 31;
                ++n10;
            } while (true);
            n9 = n11 + l0.g(charSequence, n10);
        }
        if (n9 >= n8) {
            return n9;
        }
        charSequence = new StringBuilder();
        charSequence.append("UTF-8 length does not fit in int: ");
        charSequence.append((long)n9 + 0x100000000L);
        throw new IllegalArgumentException(charSequence.toString());
    }

    public static int g(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        int n10 = 0;
        while (n8 < n9) {
            int n11;
            char c8 = charSequence.charAt(n8);
            if (c8 < '\u0800') {
                n10 += 127 - c8 >>> 31;
                n11 = n8;
            } else {
                int n12;
                n10 = n12 = n10 + 2;
                n11 = n8;
                if ('\ud800' <= c8) {
                    n10 = n12;
                    n11 = n8;
                    if (c8 <= '\udfff') {
                        if (Character.codePointAt((CharSequence)charSequence, (int)n8) >= 65536) {
                            n11 = n8 + 1;
                            n10 = n12;
                        } else {
                            throw new c(n8, n9);
                        }
                    }
                }
            }
            n8 = n11 + 1;
        }
        return n10;
    }

    public static int h(int n8) {
        int n9 = n8;
        if (n8 > -12) {
            n9 = -1;
        }
        return n9;
    }

    public static int i(int n8, int n9) {
        if (n8 <= -12 && n9 <= -65) {
            return n8 ^ n9 << 8;
        }
        return -1;
    }

    public static int j(int n8, int n9, int n10) {
        if (n8 <= -12 && n9 <= -65 && n10 <= -65) {
            return n8 ^ n9 << 8 ^ n10 << 16;
        }
        return -1;
    }

    public static int k(byte[] arrby, int n8, int n9) {
        byte by = arrby[n8 - 1];
        if ((n9 -= n8) != 0) {
            if (n9 != 1) {
                if (n9 == 2) {
                    return l0.j(by, arrby[n8], arrby[n8 + 1]);
                }
                throw new AssertionError();
            }
            return l0.i(by, arrby[n8]);
        }
        return l0.h(by);
    }

    public static boolean l(byte[] arrby) {
        return a.b(arrby, 0, arrby.length);
    }

    public static boolean m(byte[] arrby, int n8, int n9) {
        return a.b(arrby, n8, n9);
    }

    public static abstract class a {
        public abstract int a(CharSequence var1, byte[] var2, int var3, int var4);

        public final boolean b(byte[] arrby, int n8, int n9) {
            boolean bl = false;
            if (this.c(0, arrby, n8, n9) == 0) {
                bl = true;
            }
            return bl;
        }

        public abstract int c(int var1, byte[] var2, int var3, int var4);
    }

    public static final class b
    extends a {
        public static int d(byte[] arrby, int n8, int n9) {
            while (n8 < n9 && arrby[n8] >= 0) {
                ++n8;
            }
            if (n8 >= n9) {
                return 0;
            }
            return b.e(arrby, n8, n9);
        }

        public static int e(byte[] arrby, int n8, int n9) {
            int n10;
            while ((n10 = n8) < n9) {
                int n11 = n10 + 1;
                n8 = arrby[n10];
                if (n8 < 0) {
                    if (n8 < -32) {
                        if (n11 >= n9) {
                            return n8;
                        }
                        if (n8 >= -62) {
                            n8 = n10 + 2;
                            if (arrby[n11] <= -65) continue;
                        }
                        return -1;
                    }
                    if (n8 < -16) {
                        if (n11 >= n9 - 1) {
                            return l0.k(arrby, n11, n9);
                        }
                        if (!((n11 = arrby[n11]) > -65 || n8 == -32 && n11 < -96 || n8 == -19 && n11 >= -96)) {
                            n8 = n10 + 3;
                            if (arrby[n10 + 2] <= -65) continue;
                        }
                        return -1;
                    }
                    if (n11 >= n9 - 2) {
                        return l0.k(arrby, n11, n9);
                    }
                    if ((n11 = arrby[n11]) <= -65 && (n8 << 28) + (n11 + 112) >> 30 == 0 && arrby[n10 + 2] <= -65) {
                        n8 = n10 + 4;
                        if (arrby[n10 + 3] <= -65) continue;
                    }
                    return -1;
                }
                n8 = n11;
            }
            return 0;
        }

        @Override
        public int a(CharSequence charSequence, byte[] arrby, int n8, int n9) {
            int n10;
            int n11;
            int n12 = charSequence.length();
            int n13 = n9 + n8;
            for (n9 = 0; n9 < n12 && (n10 = n9 + n8) < n13 && (n11 = charSequence.charAt(n9)) < 128; ++n9) {
                arrby[n10] = (byte)n11;
            }
            if (n9 == n12) {
                return n8 + n12;
            }
            n8 += n9;
            while (n9 < n12) {
                char c8;
                block11 : {
                    block12 : {
                        block13 : {
                            block8 : {
                                block10 : {
                                    block9 : {
                                        block7 : {
                                            c8 = charSequence.charAt(n9);
                                            if (c8 >= '' || n8 >= n13) break block7;
                                            arrby[n8] = (byte)c8;
                                            ++n8;
                                            break block8;
                                        }
                                        if (c8 >= '\u0800' || n8 > n13 - 2) break block9;
                                        arrby[n8] = (byte)(c8 >>> 6 | 960);
                                        n10 = n8 + 2;
                                        arrby[n8 + 1] = (byte)(c8 & 63 | 128);
                                        n8 = n10;
                                        break block8;
                                    }
                                    if (c8 >= '\ud800' && '\udfff' >= c8 || n8 > n13 - 3) break block10;
                                    arrby[n8] = (byte)(c8 >>> 12 | 480);
                                    arrby[n8 + 1] = (byte)(c8 >>> 6 & 63 | 128);
                                    n10 = n8 + 3;
                                    arrby[n8 + 2] = (byte)(c8 & 63 | 128);
                                    n8 = n10;
                                    break block8;
                                }
                                if (n8 > n13 - 4) break block11;
                                n10 = n9 + 1;
                                if (n10 == charSequence.length()) break block12;
                                char c9 = charSequence.charAt(n10);
                                if (!Character.isSurrogatePair((char)c8, (char)c9)) break block13;
                                n9 = Character.toCodePoint((char)c8, (char)c9);
                                arrby[n8] = (byte)(n9 >>> 18 | 240);
                                arrby[n8 + 1] = (byte)(n9 >>> 12 & 63 | 128);
                                arrby[n8 + 2] = (byte)(n9 >>> 6 & 63 | 128);
                                n11 = n8 + 4;
                                arrby[n8 + 3] = (byte)(n9 & 63 | 128);
                                n9 = n10;
                                n8 = n11;
                            }
                            ++n9;
                            continue;
                        }
                        n9 = n10;
                    }
                    throw new c(n9 - 1, n12);
                }
                if (!('\ud800' > c8 || c8 > '\udfff' || (n10 = n9 + 1) != charSequence.length() && Character.isSurrogatePair((char)c8, (char)charSequence.charAt(n10)))) {
                    throw new c(n9, n12);
                }
                charSequence = new StringBuilder();
                charSequence.append("Failed writing ");
                charSequence.append(c8);
                charSequence.append(" at index ");
                charSequence.append(n8);
                throw new ArrayIndexOutOfBoundsException(charSequence.toString());
            }
            return n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public int c(int n8, byte[] arrby, int n9, int n10) {
            int n11;
            int n12;
            byte by;
            block17 : {
                block18 : {
                    block16 : {
                        block15 : {
                            n11 = n9;
                            if (n8 == 0) return b.d(arrby, n11, n10);
                            if (n9 >= n10) {
                                return n8;
                            }
                            by = (byte)n8;
                            if (by >= -32) break block15;
                            if (by < -62) return -1;
                            n8 = n9 + 1;
                            if (arrby[n9] > -65) {
                                return -1;
                            }
                            break block16;
                        }
                        if (by >= -16) break block17;
                        byte by2 = (byte)(n8 >> 8);
                        n8 = by2;
                        n11 = n9;
                        if (by2 == 0) {
                            n11 = n9 + 1;
                            n8 = arrby[n9];
                            if (n11 >= n10) {
                                return l0.i(by, n8);
                            }
                        }
                        if (n8 > -65) return -1;
                        if (by == -32) {
                            if (n8 < -96) return -1;
                        }
                        if (by == -19) {
                            if (n8 >= -96) return -1;
                        }
                        n8 = n11 + 1;
                        if (arrby[n11] > -65) break block18;
                    }
                    n11 = n8;
                    return b.d(arrby, n11, n10);
                }
                return -1;
            }
            n11 = (byte)(n8 >> 8);
            if (n11 == 0) {
                n8 = n9 + 1;
                n11 = arrby[n9];
                if (n8 >= n10) {
                    return l0.i(by, n11);
                }
                n9 = 0;
            } else {
                n12 = n8 >> 16;
                n8 = n9;
                n9 = n12;
            }
            n12 = n8;
            int n13 = n9;
            if (n9 == 0) {
                n12 = n8 + 1;
                n13 = arrby[n8];
                if (n12 >= n10) {
                    return l0.j(by, n11, n13);
                }
            }
            if (n11 > -65) return -1;
            if ((by << 28) + (n11 + 112) >> 30 != 0) return -1;
            if (n13 > -65) return -1;
            n11 = n12 + 1;
            if (arrby[n12] <= -65) return b.d(arrby, n11, n10);
            return -1;
        }
    }

    public static class c
    extends IllegalArgumentException {
        public c(int n8, int n9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unpaired surrogate at index ");
            stringBuilder.append(n8);
            stringBuilder.append(" of ");
            stringBuilder.append(n9);
            super(stringBuilder.toString());
        }
    }

    public static final class d
    extends a {
        public static boolean d() {
            if (k0.E() && k0.F()) {
                return true;
            }
            return false;
        }

        public static int e(byte[] arrby, long l8, int n8) {
            int n9 = d.f(arrby, l8, n8);
            n8 -= n9;
            l8 += (long)n9;
            do {
                long l9;
                int n10 = 0;
                n9 = n8;
                n8 = n10;
                do {
                    l9 = l8;
                    if (n9 <= 0) break;
                    l9 = l8 + 1L;
                    n8 = k0.u(arrby, l8);
                    if (n8 < 0) break;
                    --n9;
                    l8 = l9;
                } while (true);
                if (n9 == 0) {
                    return 0;
                }
                n10 = n9 - 1;
                if (n8 < -32) {
                    if (n10 == 0) {
                        return n8;
                    }
                    n9 -= 2;
                    if (n8 >= -62) {
                        if (k0.u(arrby, l9) > -65) {
                            return -1;
                        }
                        l8 = 1L + l9;
                        n8 = n9;
                        continue;
                    }
                    return -1;
                }
                if (n8 < -16) {
                    if (n10 < 2) {
                        return d.g(arrby, n8, l9, n10);
                    }
                    n9 -= 3;
                    n10 = k0.u(arrby, l9);
                    if (!(n10 > -65 || n8 == -32 && n10 < -96 || n8 == -19 && n10 >= -96)) {
                        l8 = l9 + 2L;
                        n8 = n9;
                        if (k0.u(arrby, 1L + l9) <= -65) continue;
                    }
                    return -1;
                }
                if (n10 < 3) {
                    return d.g(arrby, n8, l9, n10);
                }
                n9 -= 4;
                n10 = k0.u(arrby, l9);
                if (n10 > -65 || (n8 << 28) + (n10 + 112) >> 30 != 0 || k0.u(arrby, 1L + l9) > -65) break;
                l8 = l9 + 3L;
                n8 = n9;
                if (k0.u(arrby, 2L + l9) > -65) break;
            } while (true);
            return -1;
        }

        public static int f(byte[] arrby, long l8, int n8) {
            int n9;
            int n10 = 0;
            if (n8 < 16) {
                return 0;
            }
            int n11 = (int)l8;
            long l9 = l8;
            do {
                n9 = n10;
                l8 = l9;
                if (n10 >= 8 - (n11 & 7)) break;
                if (k0.u(arrby, l9) < 0) {
                    return n10;
                }
                ++n10;
                l9 = 1L + l9;
            } while (true);
            do {
                n11 = n9 + 8;
                n10 = n9;
                l9 = l8;
                if (n11 > n8) break;
                if ((k0.A(arrby, k0.h + l8) & -9187201950435737472L) != 0L) {
                    n10 = n9;
                    l9 = l8;
                    break;
                }
                l8 += 8L;
                n9 = n11;
            } while (true);
            while (n10 < n8) {
                if (k0.u(arrby, l9) < 0) {
                    return n10;
                }
                ++n10;
                ++l9;
            }
            return n8;
        }

        public static int g(byte[] arrby, int n8, long l8, int n9) {
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 == 2) {
                        return l0.j(n8, k0.u(arrby, l8), k0.u(arrby, l8 + 1L));
                    }
                    throw new AssertionError();
                }
                return l0.i(n8, k0.u(arrby, l8));
            }
            return l0.h(n8);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        @Override
        public int a(CharSequence var1_1, byte[] var2_2, int var3_3, int var4_4) {
            block12 : {
                var8_5 = var3_3;
                var12_6 = (long)var4_4 + var8_5;
                var7_7 = var1_1.length();
                var18_8 = " at index ";
                var19_9 = "Failed writing ";
                if (var7_7 <= var4_4 && var2_2.length - var4_4 >= var3_3) {
                    var4_4 = 0;
                    do {
                        var10_10 = 1L;
                        if (var4_4 >= var7_7 || (var3_3 = (int)var1_1.charAt(var4_4)) >= 128) break;
                        k0.K((byte[])var2_2, var8_5, (byte)var3_3);
                        ++var4_4;
                        var8_5 = 1L + var8_5;
                    } while (true);
                    var3_3 = var4_4;
                    var14_11 = var8_5;
                    if (var4_4 == var7_7) {
                        return (int)var8_5;
                    }
                } else {
                    var2_2 = new StringBuilder();
                    var2_2.append("Failed writing ");
                    var2_2.append(var1_1.charAt(var7_7 - 1));
                    var2_2.append(" at index ");
                    var2_2.append(var3_3 + var4_4);
                    throw new ArrayIndexOutOfBoundsException(var2_2.toString());
                }
                while (var3_3 < var7_7) {
                    block14 : {
                        block15 : {
                            block13 : {
                                var5_12 = var1_1.charAt(var3_3);
                                if (var5_12 >= '' || var14_11 >= var12_6) break block13;
                                k0.K((byte[])var2_2, var14_11, (byte)var5_12);
                                var16_14 = var10_10;
                                var8_5 = var14_11 + var10_10;
                                var10_10 = var16_14;
                                break block14;
                            }
                            if (var5_12 >= '\u0800' || var14_11 > var12_6 - 2L) break block15;
                            k0.K((byte[])var2_2, var14_11, (byte)(var5_12 >>> 6 | 960));
                            var8_5 = var14_11 + 2L;
                            k0.K((byte[])var2_2, var14_11 + var10_10, (byte)(var5_12 & 63 | 128));
                            ** GOTO lbl46
                        }
                        if ((var5_12 < '\ud800' || '\udfff' < var5_12) && var14_11 <= var12_6 - 3L) {
                            k0.K((byte[])var2_2, var14_11, (byte)(var5_12 >>> 12 | 480));
                            k0.K((byte[])var2_2, var14_11 + 1L, (byte)(var5_12 >>> 6 & 63 | 128));
                            var8_5 = var14_11 + 3L;
                            k0.K((byte[])var2_2, var14_11 + 2L, (byte)(var5_12 & 63 | 128));
lbl46: // 2 sources:
                            var10_10 = 1L;
                        } else {
                            if (var14_11 > var12_6 - 4L) break block12;
                            var4_4 = var3_3 + 1;
                            if (var4_4 == var7_7) throw new c(var3_3 - 1, var7_7);
                            var6_13 = var1_1.charAt(var4_4);
                            if (!Character.isSurrogatePair((char)var5_12, (char)var6_13)) {
                                var3_3 = var4_4;
                                throw new c(var3_3 - 1, var7_7);
                            }
                            var3_3 = Character.toCodePoint((char)var5_12, (char)var6_13);
                            var10_10 = 1L;
                            k0.K((byte[])var2_2, var14_11, (byte)(var3_3 >>> 18 | 240));
                            k0.K((byte[])var2_2, var14_11 + 1L, (byte)(var3_3 >>> 12 & 63 | 128));
                            k0.K((byte[])var2_2, var14_11 + 2L, (byte)(var3_3 >>> 6 & 63 | 128));
                            var8_5 = var14_11 + 4L;
                            k0.K((byte[])var2_2, var14_11 + 3L, (byte)(var3_3 & 63 | 128));
                            var3_3 = var4_4;
                        }
                    }
                    ++var3_3;
                    var14_11 = var8_5;
                }
                return (int)var14_11;
            }
            if ('\ud800' <= var5_12 && var5_12 <= '\udfff') {
                var4_4 = var3_3 + 1;
                if (var4_4 == var7_7) throw new c(var3_3, var7_7);
                if (!Character.isSurrogatePair((char)var5_12, (char)var1_1.charAt(var4_4))) {
                    throw new c(var3_3, var7_7);
                }
            }
            var1_1 = new StringBuilder();
            var1_1.append(var19_9);
            var1_1.append(var5_12);
            var1_1.append(var18_8);
            var1_1.append(var14_11);
            throw new ArrayIndexOutOfBoundsException(var1_1.toString());
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public int c(int n8, byte[] arrby, int n9, int n10) {
            block20 : {
                long l8;
                long l9;
                long l10;
                block19 : {
                    int n11;
                    byte by;
                    block18 : {
                        n11 = 0;
                        if ((n9 | n10 | arrby.length - n10) < 0) {
                            throw new ArrayIndexOutOfBoundsException(String.format((String)"Array length=%d, index=%d, limit=%d", (Object[])new Object[]{arrby.length, n9, n10}));
                        }
                        l8 = n9;
                        l9 = n10;
                        l10 = l8;
                        if (n8 == 0) return d.e(arrby, l10, (int)(l9 - l10));
                        if (l8 >= l9) {
                            return n8;
                        }
                        by = (byte)n8;
                        if (by < -32) {
                            if (by < -62) return -1;
                            if (k0.u(arrby, l8) > -65) {
                                return -1;
                            }
                            l10 = 1L + l8;
                            return d.e(arrby, l10, (int)(l9 - l10));
                        }
                        if (by >= -16) break block18;
                        n9 = (byte)(n8 >> 8);
                        l10 = l8;
                        n8 = n9;
                        if (n9 == 0) {
                            l10 = l8 + 1L;
                            n8 = k0.u(arrby, l8);
                            if (l10 >= l9) {
                                return l0.i(by, n8);
                            }
                        }
                        if (n8 > -65) return -1;
                        if (by == -32) {
                            if (n8 < -96) return -1;
                        }
                        if (by == -19) {
                            if (n8 >= -96) return -1;
                        }
                        l8 = l10 + 1L;
                        if (k0.u(arrby, l10) > -65) {
                            return -1;
                        }
                        break block19;
                    }
                    n9 = (byte)(n8 >> 8);
                    if (n9 == 0) {
                        l10 = l8 + 1L;
                        n9 = k0.u(arrby, l8);
                        if (l10 >= l9) {
                            return l0.i(by, n9);
                        }
                        l8 = l10;
                        n8 = n11;
                    } else {
                        n8 = (byte)(n8 >> 16);
                    }
                    n10 = n8;
                    l10 = l8;
                    if (n8 == 0) {
                        l10 = l8 + 1L;
                        n10 = k0.u(arrby, l8);
                        if (l10 >= l9) {
                            return l0.j(by, n9, n10);
                        }
                    }
                    if (n9 > -65) return -1;
                    if ((by << 28) + (n9 + 112) >> 30 != 0) return -1;
                    if (n10 > -65) return -1;
                    l8 = l10 + 1L;
                    if (k0.u(arrby, l10) > -65) break block20;
                }
                l10 = l8;
                return d.e(arrby, l10, (int)(l9 - l10));
            }
            return -1;
        }
    }

}

