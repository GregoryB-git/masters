package e5;

import V4.h;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: e5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1278f {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14024c;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14022a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14023b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14025d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f14026e = StandardCharsets.ISO_8859_1;

    /* renamed from: e5.f$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14027a;

        static {
            int[] iArr = new int[EnumC1275c.values().length];
            f14027a = iArr;
            try {
                iArr[EnumC1275c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14027a[EnumC1275c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14027a[EnumC1275c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i7 = 0;
        byte[] bArr = new byte[128];
        f14024c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f14022a;
            if (i8 >= bArr2.length) {
                break;
            }
            byte b7 = bArr2[i8];
            if (b7 > 0) {
                f14024c[b7] = (byte) i8;
            }
            i8++;
        }
        Arrays.fill(f14025d, (byte) -1);
        while (true) {
            byte[] bArr3 = f14023b;
            if (i7 >= bArr3.length) {
                return;
            }
            byte b8 = bArr3[i7];
            if (b8 > 0) {
                f14025d[b8] = (byte) i7;
            }
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = k(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            V4.h r5 = new V4.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.AbstractC1278f.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    public static int b(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        if (i7 < length) {
            loop0: while (true) {
                char charAt = charSequence.charAt(i7);
                while (k(charAt) && i7 < length) {
                    i8++;
                    i7++;
                    if (i7 < length) {
                        break;
                    }
                }
            }
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = k(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = n(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.AbstractC1278f.c(java.lang.CharSequence, int):int");
    }

    public static void d(byte[] bArr, int i7, int i8, int i9, StringBuilder sb) {
        int i10;
        sb.append((i8 == 1 && i9 == 0) ? (char) 913 : i8 % 6 == 0 ? (char) 924 : (char) 901);
        if (i8 >= 6) {
            char[] cArr = new char[5];
            i10 = i7;
            while ((i7 + i8) - i10 >= 6) {
                long j7 = 0;
                for (int i11 = 0; i11 < 6; i11++) {
                    j7 = (j7 << 8) + (bArr[i10 + i11] & 255);
                }
                for (int i12 = 0; i12 < 5; i12++) {
                    cArr[i12] = (char) (j7 % 900);
                    j7 /= 900;
                }
                for (int i13 = 4; i13 >= 0; i13--) {
                    sb.append(cArr[i13]);
                }
                i10 += 6;
            }
        } else {
            i10 = i7;
        }
        while (i10 < i7 + i8) {
            sb.append((char) (bArr[i10] & 255));
            i10++;
        }
    }

    public static String e(String str, EnumC1275c enumC1275c, Charset charset) {
        Y4.c c7;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f14026e;
        } else if (!f14026e.equals(charset) && (c7 = Y4.c.c(charset.name())) != null) {
            h(c7.e(), sb);
        }
        int length = str.length();
        int i7 = a.f14027a[enumC1275c.ordinal()];
        if (i7 == 1) {
            g(str, 0, length, sb, 0);
        } else if (i7 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (i7 != 3) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < length) {
                int b7 = b(str, i8);
                if (b7 >= 13) {
                    sb.append((char) 902);
                    f(str, i8, b7, sb);
                    i8 += b7;
                    i9 = 0;
                    i10 = 2;
                } else {
                    int c8 = c(str, i8);
                    if (c8 >= 5 || b7 == length) {
                        if (i10 != 0) {
                            sb.append((char) 900);
                            i9 = 0;
                            i10 = 0;
                        }
                        i9 = g(str, i8, c8, sb, i9);
                        i8 += c8;
                    } else {
                        int a7 = a(str, i8, charset);
                        if (a7 == 0) {
                            a7 = 1;
                        }
                        int i11 = a7 + i8;
                        byte[] bytes2 = str.substring(i8, i11).getBytes(charset);
                        if (bytes2.length == 1 && i10 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i10, sb);
                            i10 = 1;
                            i9 = 0;
                        }
                        i8 = i11;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            f(str, 0, length, sb);
        }
        return sb.toString();
    }

    public static void f(String str, int i7, int i8, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i8 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i9 = 0;
        while (i9 < i8) {
            sb2.setLength(0);
            int min = Math.min(44, i8 - i9);
            StringBuilder sb3 = new StringBuilder("1");
            int i10 = i7 + i9;
            sb3.append(str.substring(i10, i10 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i9 += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00af, code lost:
    
        if (r8 == ' ') goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.AbstractC1278f.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static void h(int i7, StringBuilder sb) {
        char c7;
        if (i7 >= 0 && i7 < 900) {
            sb.append((char) 927);
        } else {
            if (i7 >= 810900) {
                if (i7 >= 811800) {
                    throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i7)));
                }
                sb.append((char) 925);
                c7 = (char) (810900 - i7);
                sb.append(c7);
            }
            sb.append((char) 926);
            sb.append((char) ((i7 / 900) - 1));
            i7 %= 900;
        }
        c7 = (char) i7;
        sb.append(c7);
    }

    public static boolean i(char c7) {
        if (c7 != ' ') {
            return c7 >= 'a' && c7 <= 'z';
        }
        return true;
    }

    public static boolean j(char c7) {
        if (c7 != ' ') {
            return c7 >= 'A' && c7 <= 'Z';
        }
        return true;
    }

    public static boolean k(char c7) {
        return c7 >= '0' && c7 <= '9';
    }

    public static boolean l(char c7) {
        return f14024c[c7] != -1;
    }

    public static boolean m(char c7) {
        return f14025d[c7] != -1;
    }

    public static boolean n(char c7) {
        if (c7 == '\t' || c7 == '\n' || c7 == '\r') {
            return true;
        }
        return c7 >= ' ' && c7 <= '~';
    }
}
