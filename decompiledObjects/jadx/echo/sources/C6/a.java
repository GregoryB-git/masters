package C6;

import B6.f;
import B6.h;
import D6.c;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1025a;

    /* renamed from: c, reason: collision with root package name */
    public static final h f1027c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f1028d;

    /* renamed from: r, reason: collision with root package name */
    public static final Method f1042r;

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f1043s;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1026b = new String[0];

    /* renamed from: e, reason: collision with root package name */
    public static final c f1029e = c.h("efbbbf");

    /* renamed from: f, reason: collision with root package name */
    public static final c f1030f = c.h("feff");

    /* renamed from: g, reason: collision with root package name */
    public static final c f1031g = c.h("fffe");

    /* renamed from: h, reason: collision with root package name */
    public static final c f1032h = c.h("0000ffff");

    /* renamed from: i, reason: collision with root package name */
    public static final c f1033i = c.h("ffff0000");

    /* renamed from: j, reason: collision with root package name */
    public static final Charset f1034j = Charset.forName("UTF-8");

    /* renamed from: k, reason: collision with root package name */
    public static final Charset f1035k = Charset.forName("ISO-8859-1");

    /* renamed from: l, reason: collision with root package name */
    public static final Charset f1036l = Charset.forName("UTF-16BE");

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f1037m = Charset.forName("UTF-16LE");

    /* renamed from: n, reason: collision with root package name */
    public static final Charset f1038n = Charset.forName("UTF-32BE");

    /* renamed from: o, reason: collision with root package name */
    public static final Charset f1039o = Charset.forName("UTF-32LE");

    /* renamed from: p, reason: collision with root package name */
    public static final TimeZone f1040p = TimeZone.getTimeZone("GMT");

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator f1041q = new C0013a();

    /* renamed from: C6.a$a, reason: collision with other inner class name */
    public class C0013a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        f1025a = bArr;
        Method method = null;
        f1027c = h.b(null, bArr);
        f1028d = f.a(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f1042r = method;
        f1043s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static String a(String str) {
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (d(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress g7 = (str.startsWith("[") && str.endsWith("]")) ? g(str, 1, str.length() - 1) : g(str, 0, str.length());
        if (g7 == null) {
            return null;
        }
        byte[] address = g7.getAddress();
        if (address.length == 16) {
            return j(address);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    public static void b(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int e(char c7) {
        if (c7 >= '0' && c7 <= '9') {
            return c7 - '0';
        }
        if (c7 >= 'a' && c7 <= 'f') {
            return c7 - 'W';
        }
        if (c7 < 'A' || c7 > 'F') {
            return -1;
        }
        return c7 - '7';
    }

    public static boolean f(String str, int i7, int i8, byte[] bArr, int i9) {
        int i10 = i9;
        while (i7 < i8) {
            if (i10 == bArr.length) {
                return false;
            }
            if (i10 != i9) {
                if (str.charAt(i7) != '.') {
                    return false;
                }
                i7++;
            }
            int i11 = i7;
            int i12 = 0;
            while (i11 < i8) {
                char charAt = str.charAt(i11);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i11++;
            }
            if (i11 - i7 == 0) {
                return false;
            }
            bArr[i10] = (byte) i12;
            i10++;
            i7 = i11;
        }
        return i10 == i9 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress g(java.lang.String r12, int r13, int r14) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r13 >= r14) goto L79
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r13 + 2
            r9 = 2
            if (r8 > r14) goto L27
            java.lang.String r10 = "::"
            boolean r10 = r12.regionMatches(r13, r10, r2, r9)
            if (r10 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r14) goto L25
            goto L79
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L34
            java.lang.String r8 = ":"
            r10 = 1
            boolean r8 = r12.regionMatches(r13, r8, r2, r10)
            if (r8 == 0) goto L36
            int r13 = r13 + 1
        L34:
            r6 = r13
            goto L4b
        L36:
            java.lang.String r8 = "."
            boolean r13 = r12.regionMatches(r13, r8, r2, r10)
            if (r13 == 0) goto L4a
            int r13 = r4 + (-2)
            boolean r12 = f(r12, r6, r14, r1, r13)
            if (r12 != 0) goto L47
            return r7
        L47:
            int r4 = r4 + 2
            goto L79
        L4a:
            return r7
        L4b:
            r8 = r2
            r13 = r6
        L4d:
            if (r13 >= r14) goto L60
            char r10 = r12.charAt(r13)
            int r10 = e(r10)
            if (r10 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r10
            int r13 = r13 + 1
            goto L4d
        L60:
            int r10 = r13 - r6
            if (r10 == 0) goto L78
            r11 = 4
            if (r10 <= r11) goto L68
            goto L78
        L68:
            int r7 = r4 + 1
            int r10 = r8 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r1[r4] = r10
            int r4 = r4 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L78:
            return r7
        L79:
            if (r4 == r0) goto L8a
            if (r5 != r3) goto L7e
            return r7
        L7e:
            int r12 = r4 - r5
            int r13 = 16 - r12
            java.lang.System.arraycopy(r1, r5, r1, r13, r12)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8a:
            java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
            return r12
        L8f:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.a.g(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int h(String str, int i7, int i8, char c7) {
        while (i7 < i8) {
            if (str.charAt(i7) == c7) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static int i(String str, int i7, int i8, String str2) {
        while (i7 < i8) {
            if (str2.indexOf(str.charAt(i7)) != -1) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static String j(byte[] bArr) {
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < bArr.length) {
            int i11 = i9;
            while (i11 < 16 && bArr[i11] == 0 && bArr[i11 + 1] == 0) {
                i11 += 2;
            }
            int i12 = i11 - i9;
            if (i12 > i10 && i12 >= 4) {
                i7 = i9;
                i10 = i12;
            }
            i9 = i11 + 2;
        }
        D6.a aVar = new D6.a();
        while (i8 < bArr.length) {
            if (i8 == i7) {
                aVar.D(58);
                i8 += i10;
                if (i8 == 16) {
                    aVar.D(58);
                }
            } else {
                if (i8 > 0) {
                    aVar.D(58);
                }
                aVar.E(((bArr[i8] & 255) << 8) | (bArr[i8 + 1] & 255));
                i8 += 2;
            }
        }
        return aVar.u();
    }

    public static int k(String str, int i7, int i8) {
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    public static int l(String str, int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            char charAt = str.charAt(i9);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i9 + 1;
            }
        }
        return i7;
    }
}
