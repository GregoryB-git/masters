// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C6;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.io.Closeable;
import java.net.InetAddress;
import java.util.Locale;
import java.net.IDN;
import B6.d;
import java.util.regex.Pattern;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.TimeZone;
import java.nio.charset.Charset;
import D6.c;
import B6.f;
import B6.h;

public abstract class a
{
    public static final byte[] a;
    public static final String[] b;
    public static final h c;
    public static final f d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final Charset j;
    public static final Charset k;
    public static final Charset l;
    public static final Charset m;
    public static final Charset n;
    public static final Charset o;
    public static final TimeZone p;
    public static final Comparator q;
    public static final Method r;
    public static final Pattern s;
    
    static {
        final byte[] array = a = new byte[0];
        b = new String[0];
        Method declaredMethod = null;
        c = B6.h.b(null, array);
        d = B6.f.a(null, array);
        e = D6.c.h("efbbbf");
        f = D6.c.h("feff");
        g = D6.c.h("fffe");
        h = D6.c.h("0000ffff");
        i = D6.c.h("ffff0000");
        j = Charset.forName("UTF-8");
        k = Charset.forName("ISO-8859-1");
        l = Charset.forName("UTF-16BE");
        m = Charset.forName("UTF-16LE");
        n = Charset.forName("UTF-32BE");
        o = Charset.forName("UTF-32LE");
        p = TimeZone.getTimeZone("GMT");
        q = new Comparator() {
            public int a(final String s, final String anotherString) {
                return s.compareTo(anotherString);
            }
        };
        while (true) {
            try {
                declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
                r = declaredMethod;
                s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public static String a(String lowerCase) {
        if (lowerCase.contains(":")) {
            InetAddress inetAddress;
            if (lowerCase.startsWith("[") && lowerCase.endsWith("]")) {
                inetAddress = g(lowerCase, 1, lowerCase.length() - 1);
            }
            else {
                inetAddress = g(lowerCase, 0, lowerCase.length());
            }
            if (inetAddress == null) {
                return null;
            }
            final byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return j(address);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid IPv6 address: '");
            sb.append(lowerCase);
            sb.append("'");
            throw new AssertionError((Object)sb.toString());
        }
        else {
            try {
                lowerCase = IDN.toASCII(lowerCase).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (d(lowerCase)) {
                    return null;
                }
                return lowerCase;
            }
            catch (IllegalArgumentException ex) {
                return null;
            }
        }
    }
    
    public static void b(final long n, final long n2, final long n3) {
        if ((n2 | n3) >= 0L && n2 <= n && n - n2 >= n3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static void c(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0014;
        }
        try {
            closeable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static boolean d(final String s) {
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 <= '\u001f') {
                return true;
            }
            if (char1 >= '\u007f') {
                return true;
            }
            if (" #%/:?@[\\]".indexOf(char1) != -1) {
                return true;
            }
        }
        return false;
    }
    
    public static int e(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        return -1;
    }
    
    public static boolean f(final String s, int n, final int n2, final byte[] array, final int n3) {
        int n4 = n3;
        int i = n;
        while (i < n2) {
            if (n4 == array.length) {
                return false;
            }
            n = i;
            if (n4 != n3) {
                if (s.charAt(i) != '.') {
                    return false;
                }
                n = i + 1;
            }
            i = n;
            int n5 = 0;
            while (i < n2) {
                final char char1 = s.charAt(i);
                if (char1 < '0') {
                    break;
                }
                if (char1 > '9') {
                    break;
                }
                if (n5 == 0 && n != i) {
                    return false;
                }
                n5 = n5 * 10 + char1 - 48;
                if (n5 > 255) {
                    return false;
                }
                ++i;
            }
            if (i - n == 0) {
                return false;
            }
            array[n4] = (byte)n5;
            ++n4;
        }
        return n4 == n3 + 4;
    }
    
    public static InetAddress g(final String s, int toffset, final int n) {
        final byte[] array = new byte[16];
        int n2 = 0;
        int n4;
        int n3 = n4 = -1;
        int n5;
        int fromIndex;
        while (true) {
            n5 = n2;
            fromIndex = n3;
            if (toffset >= n) {
                break;
            }
            if (n2 == 16) {
                return null;
            }
            final int n6 = toffset + 2;
            if (n6 <= n && s.regionMatches(toffset, "::", 0, 2)) {
                if (n3 != -1) {
                    return null;
                }
                n5 = (toffset = n2 + 2);
                if (n6 == n) {
                    fromIndex = toffset;
                    break;
                }
                final int n7 = n6;
                n2 = n5;
                n3 = toffset;
                toffset = n7;
            }
            else {
                int n8 = toffset;
                if (n2 != 0) {
                    if (s.regionMatches(toffset, ":", 0, 1)) {
                        n8 = toffset + 1;
                    }
                    else {
                        if (!s.regionMatches(toffset, ".", 0, 1)) {
                            return null;
                        }
                        if (!f(s, n4, n, array, n2 - 2)) {
                            return null;
                        }
                        n5 = n2 + 2;
                        fromIndex = n3;
                        break;
                    }
                }
                toffset = n8;
            }
            int n9 = 0;
            int i;
            for (i = toffset; i < n; ++i) {
                final int e = e(s.charAt(i));
                if (e == -1) {
                    break;
                }
                n9 = (n9 << 4) + e;
            }
            final int n10 = i - toffset;
            if (n10 == 0) {
                return null;
            }
            if (n10 > 4) {
                return null;
            }
            array[n2] = (byte)(n9 >>> 8 & 0xFF);
            final int n11 = n2 + 2;
            array[n2 + 1] = (byte)(n9 & 0xFF);
            n2 = n11;
            n4 = toffset;
            toffset = i;
        }
        if (n5 != 16) {
            if (fromIndex == -1) {
                return null;
            }
            toffset = n5 - fromIndex;
            System.arraycopy(array, fromIndex, array, 16 - toffset, toffset);
            Arrays.fill(array, fromIndex, 16 - n5 + fromIndex, (byte)0);
        }
        try {
            return InetAddress.getByAddress(array);
        }
        catch (UnknownHostException ex) {
            throw new AssertionError();
        }
    }
    
    public static int h(final String s, int i, final int n, final char c) {
        while (i < n) {
            if (s.charAt(i) == c) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int i(final String s, int i, final int n, final String s2) {
        while (i < n) {
            if (s2.indexOf(s.charAt(i)) != -1) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static String j(final byte[] array) {
        int n = -1;
        final int n2 = 0;
        int n3;
        int n4;
        int n6;
        int n7;
        for (int i = n3 = 0; i < array.length; i = n4 + 2, n = n6, n3 = n7) {
            for (n4 = i; n4 < 16 && array[n4] == 0 && array[n4 + 1] == 0; n4 += 2) {}
            final int n5 = n4 - i;
            n6 = n;
            if (n5 > (n7 = n3)) {
                n6 = n;
                n7 = n3;
                if (n5 >= 4) {
                    n7 = n5;
                    n6 = i;
                }
            }
        }
        final D6.a a = new D6.a();
        int j = n2;
        while (j < array.length) {
            if (j == n) {
                a.D(58);
                final int n8 = j + n3;
                if ((j = n8) != 16) {
                    continue;
                }
                a.D(58);
                j = n8;
            }
            else {
                if (j > 0) {
                    a.D(58);
                }
                a.E((array[j] & 0xFF) << 8 | (array[j + 1] & 0xFF));
                j += 2;
            }
        }
        return a.u();
    }
    
    public static int k(final String s, int i, final int n) {
        while (i < n) {
            final char char1 = s.charAt(i);
            if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int l(final String s, final int n, int i) {
        char char1;
        for (--i; i >= n; --i) {
            char1 = s.charAt(i);
            if (char1 != '\t' && char1 != '\n' && char1 != '\f' && char1 != '\r' && char1 != ' ') {
                return i + 1;
            }
        }
        return n;
    }
}
