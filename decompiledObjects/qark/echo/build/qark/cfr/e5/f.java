/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.nio.charset.Charset
 *  java.nio.charset.CharsetEncoder
 *  java.nio.charset.StandardCharsets
 *  java.util.Arrays
 */
package e5;

import V4.h;
import e5.c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public abstract class f {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final Charset e;

    static {
        int n8;
        int n9 = 0;
        a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
        b = new byte[]{59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
        byte[] arrby = new byte[128];
        c = arrby;
        d = new byte[128];
        e = StandardCharsets.ISO_8859_1;
        Arrays.fill((byte[])arrby, (byte)-1);
        for (n8 = 0; n8 < (arrby = a).length; ++n8) {
            byte by = arrby[n8];
            if (by <= 0) continue;
            f.c[by] = (byte)n8;
        }
        Arrays.fill((byte[])d, (byte)-1);
        for (n8 = n9; n8 < (arrby = b).length; ++n8) {
            n9 = arrby[n8];
            if (n9 <= 0) continue;
            f.d[n9] = (byte)n8;
        }
    }

    public static int a(String string2, int n8, Charset charset) {
        int n9;
        charset = charset.newEncoder();
        int n10 = string2.length();
        for (n9 = n8; n9 < n10; ++n9) {
            int n11;
            char c8 = string2.charAt(n9);
            int n12 = 0;
            do {
                n11 = n12;
                if (n12 >= 13) break;
                n11 = n12++;
                if (!f.k(c8)) break;
                int n13 = n9 + n12;
                n11 = n12;
                if (n13 >= n10) break;
                c8 = string2.charAt(n13);
            } while (true);
            if (n11 >= 13) {
                return n9 - n8;
            }
            c8 = string2.charAt(n9);
            if (charset.canEncode(c8)) {
                continue;
            }
            string2 = new StringBuilder("Non-encodable character detected: ");
            string2.append(c8);
            string2.append(" (Unicode: ");
            string2.append((int)c8);
            string2.append(')');
            throw new h(string2.toString());
        }
        return n9 - n8;
    }

    public static int b(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        int n10 = 0;
        int n11 = 0;
        if (n8 < n9) {
            int n12 = n8;
            n8 = n11;
            block0 : do {
                char c8 = charSequence.charAt(n12);
                do {
                    n10 = n8;
                    if (!f.k(c8)) break block0;
                    n10 = n8;
                    if (n12 >= n9) break block0;
                    n11 = n8 + 1;
                    n10 = n12 + 1;
                    n8 = n11;
                    n12 = n10;
                } while (n10 >= n9);
                n8 = n11;
                n12 = n10;
            } while (true);
        }
        return n10;
    }

    public static int c(CharSequence charSequence, int n8) {
        int n9;
        int n10 = charSequence.length();
        int n11 = n8;
        do {
            n9 = n11;
            if (n11 >= n10) break;
            char c8 = charSequence.charAt(n11);
            n9 = 0;
            int n12 = n11;
            while (n9 < 13 && f.k(c8) && n12 < n10) {
                int n13;
                n11 = n9 + 1;
                n12 = n13 = n12 + 1;
                n9 = n11;
                if (n13 >= n10) continue;
                c8 = charSequence.charAt(n13);
                n12 = n13;
                n9 = n11;
            }
            if (n9 >= 13) {
                return n12 - n8 - n9;
            }
            n11 = n12;
            if (n9 > 0) continue;
            n9 = n12;
            if (!f.n(charSequence.charAt(n12))) break;
            n11 = n12 + 1;
        } while (true);
        return n9 - n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d(byte[] arrby, int n8, int n9, int n10, StringBuilder stringBuilder) {
        int n11;
        char c8 = n9 == 1 && n10 == 0 ? '\u0391' : (n9 % 6 == 0 ? '\u039c' : '\u0385');
        stringBuilder.append(c8);
        if (n9 < 6) {
            n11 = n8;
        } else {
            char[] arrc = new char[5];
            n10 = n8;
            do {
                long l8;
                n11 = n10;
                if (n8 + n9 - n10 < 6) break;
                int n12 = 0;
                long l9 = 0L;
                n11 = 0;
                do {
                    l8 = l9;
                    if (n11 >= 6) break;
                    l9 = (l9 << 8) + (long)(arrby[n10 + n11] & 255);
                    ++n11;
                } while (true);
                for (int i8 = n12; i8 < 5; l8 /= 900L, ++i8) {
                    arrc[i8] = (char)(l8 % 900L);
                }
                for (n11 = 4; n11 >= 0; --n11) {
                    stringBuilder.append(arrc[n11]);
                }
                n10 += 6;
            } while (true);
        }
        while (n11 < n8 + n9) {
            stringBuilder.append((char)(arrby[n11] & 255));
            ++n11;
        }
        return;
    }

    public static String e(String arrby, c arrby2, Charset charset) {
        Charset charset2;
        StringBuilder stringBuilder = new StringBuilder(arrby.length());
        if (charset == null) {
            charset2 = e;
        } else {
            charset2 = charset;
            if (!e.equals((Object)charset)) {
                Y4.c c8 = Y4.c.c(charset.name());
                charset2 = charset;
                if (c8 != null) {
                    f.h(c8.e(), stringBuilder);
                    charset2 = charset;
                }
            }
        }
        int n8 = arrby.length();
        int n9 = .a[arrby2.ordinal()];
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    int n10;
                    int n11 = n9 = (n10 = 0);
                    while (n10 < n8) {
                        int n12 = f.b((CharSequence)arrby, n10);
                        if (n12 >= 13) {
                            stringBuilder.append('\u0386');
                            f.f((String)arrby, n10, n12, stringBuilder);
                            n10 += n12;
                            n9 = 0;
                            n11 = 2;
                            continue;
                        }
                        int n13 = f.c((CharSequence)arrby, n10);
                        if (n13 < 5 && n12 != n8) {
                            n12 = n13 = f.a((String)arrby, n10, charset2);
                            if (n13 == 0) {
                                n12 = 1;
                            }
                            if ((arrby2 = arrby.substring(n10, n12 += n10).getBytes(charset2)).length == 1 && n11 == 0) {
                                f.d(arrby2, 0, 1, 0, stringBuilder);
                            } else {
                                f.d(arrby2, 0, arrby2.length, n11, stringBuilder);
                                n11 = 1;
                                n9 = 0;
                            }
                            n10 = n12;
                            continue;
                        }
                        n12 = n11;
                        if (n11 != 0) {
                            stringBuilder.append('\u0384');
                            n12 = n9 = 0;
                        }
                        n9 = f.g((CharSequence)arrby, n10, n13, stringBuilder, n9);
                        n10 += n13;
                        n11 = n12;
                    }
                } else {
                    stringBuilder.append('\u0386');
                    f.f((String)arrby, 0, n8, stringBuilder);
                }
            } else {
                arrby = arrby.getBytes(charset2);
                f.d(arrby, 0, arrby.length, 1, stringBuilder);
            }
        } else {
            f.g((CharSequence)arrby, 0, n8, stringBuilder, 0);
        }
        return stringBuilder.toString();
    }

    public static void f(String string2, int n8, int n9, StringBuilder stringBuilder) {
        int n10;
        StringBuilder stringBuilder2 = new StringBuilder(n9 / 3 + 1);
        BigInteger bigInteger2 = BigInteger.valueOf((long)900L);
        BigInteger bigInteger3 = BigInteger.valueOf((long)0L);
        for (int i8 = 0; i8 < n9; i8 += n10) {
            BigInteger bigInteger4;
            stringBuilder2.setLength(0);
            n10 = Math.min((int)44, (int)(n9 - i8));
            StringBuilder stringBuilder3 = new StringBuilder("1");
            int n11 = n8 + i8;
            stringBuilder3.append(string2.substring(n11, n11 + n10));
            stringBuilder3 = new BigInteger(stringBuilder3.toString());
            do {
                stringBuilder2.append((char)stringBuilder3.mod(bigInteger2).intValue());
                bigInteger4 = stringBuilder3.divide(bigInteger2);
                stringBuilder3 = bigInteger4;
            } while (!bigInteger4.equals((Object)bigInteger3));
            for (n11 = stringBuilder2.length() - 1; n11 >= 0; --n11) {
                stringBuilder.append(stringBuilder2.charAt(n11));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int g(CharSequence charSequence, int n8, int n9, StringBuilder stringBuilder, int n10) {
        int n11;
        char c8;
        StringBuilder stringBuilder2 = new StringBuilder(n9);
        int n12 = 0;
        int n13 = 0;
        do {
            block30 : {
                block31 : {
                    block18 : {
                        block33 : {
                            block28 : {
                                block32 : {
                                    block22 : {
                                        block29 : {
                                            block25 : {
                                                block27 : {
                                                    block24 : {
                                                        block14 : {
                                                            block26 : {
                                                                block23 : {
                                                                    block15 : {
                                                                        block21 : {
                                                                            block19 : {
                                                                                block20 : {
                                                                                    block16 : {
                                                                                        block17 : {
                                                                                            n11 = n8 + n13;
                                                                                            c8 = charSequence.charAt(n11);
                                                                                            if (n10 == 0) break block14;
                                                                                            if (n10 == 1) break block15;
                                                                                            if (n10 == 2) break block16;
                                                                                            if (!f.m(c8)) break block17;
                                                                                            n11 = d[c8];
                                                                                            break block18;
                                                                                        }
                                                                                        stringBuilder2.append('\u001d');
                                                                                        break block19;
                                                                                    }
                                                                                    if (!f.l(c8)) break block20;
                                                                                    n11 = c[c8];
                                                                                    break block18;
                                                                                }
                                                                                if (!f.j(c8)) break block21;
                                                                                stringBuilder2.append('\u001c');
                                                                            }
                                                                            n10 = 0;
                                                                            continue;
                                                                        }
                                                                        if (f.i(c8)) break block22;
                                                                        if (++n11 < n9 && f.m(charSequence.charAt(n11))) {
                                                                            stringBuilder2.append('\u0019');
                                                                            n10 = 3;
                                                                            continue;
                                                                        }
                                                                        stringBuilder2.append('\u001d');
                                                                        n11 = d[c8];
                                                                        break block18;
                                                                    }
                                                                    if (!f.i(c8)) break block23;
                                                                    if (c8 == ' ') break block24;
                                                                    n11 = c8 - 97;
                                                                    break block25;
                                                                }
                                                                if (!f.j(c8)) break block26;
                                                                stringBuilder2.append('\u001b');
                                                                break block27;
                                                            }
                                                            if (f.l(c8)) break block28;
                                                            stringBuilder2.append('\u001d');
                                                            n11 = d[c8];
                                                            break block18;
                                                        }
                                                        if (!f.j(c8)) break block29;
                                                        if (c8 != ' ') break block27;
                                                    }
                                                    stringBuilder2.append('\u001a');
                                                    break block30;
                                                }
                                                n11 = c8 - 65;
                                            }
                                            c8 = (char)n11;
                                            break block31;
                                        }
                                        if (!f.i(c8)) break block32;
                                    }
                                    stringBuilder2.append('\u001b');
                                    n10 = 1;
                                    continue;
                                }
                                if (!f.l(c8)) break block33;
                            }
                            stringBuilder2.append('\u001c');
                            n10 = 2;
                            continue;
                        }
                        stringBuilder2.append('\u001d');
                        n11 = d[c8];
                    }
                    c8 = (char)n11;
                }
                stringBuilder2.append(c8);
            }
            n13 = n11 = n13 + 1;
            if (n11 >= n9) break;
        } while (true);
        n11 = stringBuilder2.length();
        n9 = 0;
        for (n8 = n12; n8 < n11; ++n8) {
            if (n8 % 2 != 0) {
                c8 = (char)(n9 * 30 + stringBuilder2.charAt(n8));
                stringBuilder.append(c8);
                n9 = c8;
                continue;
            }
            n9 = stringBuilder2.charAt(n8);
        }
        if (n11 % 2 != 0) {
            stringBuilder.append((char)(n9 * 30 + 29));
        }
        return n10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void h(int var0, StringBuilder var1_1) {
        block2 : {
            if (var0 < 0 || var0 >= 900) break block2;
            var1_1.append('\u039f');
            ** GOTO lbl9
        }
        if (var0 < 810900) {
            var1_1.append('\u039e');
            var1_1.append((char)(var0 / 900 - 1));
            var0 %= 900;
lbl9: // 2 sources:
            var2_2 = (char)var0;
        } else {
            if (var0 >= 811800) throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf((int)var0)));
            var1_1.append('\u039d');
            var2_2 = (char)(810900 - var0);
        }
        var1_1.append(var2_2);
    }

    public static boolean i(char c8) {
        if (c8 != ' ' && (c8 < 'a' || c8 > 'z')) {
            return false;
        }
        return true;
    }

    public static boolean j(char c8) {
        if (c8 != ' ' && (c8 < 'A' || c8 > 'Z')) {
            return false;
        }
        return true;
    }

    public static boolean k(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return true;
        }
        return false;
    }

    public static boolean l(char c8) {
        if (c[c8] != -1) {
            return true;
        }
        return false;
    }

    public static boolean m(char c8) {
        if (d[c8] != -1) {
            return true;
        }
        return false;
    }

    public static boolean n(char c8) {
        if (c8 != '\t' && c8 != '\n' && c8 != '\r' && (c8 < ' ' || c8 > '~')) {
            return false;
        }
        return true;
    }

}

