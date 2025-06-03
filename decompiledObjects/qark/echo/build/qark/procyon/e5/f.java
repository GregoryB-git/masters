// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e5;

import java.math.BigInteger;
import java.nio.charset.CharsetEncoder;
import V4.h;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public abstract class f
{
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final Charset e;
    
    static {
        final int n = 0;
        a = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0 };
        b = new byte[] { 59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0 };
        final byte[] a2 = c = new byte[128];
        d = new byte[128];
        e = StandardCharsets.ISO_8859_1;
        Arrays.fill(a2, (byte)(-1));
        int n2 = 0;
        while (true) {
            final byte[] a3 = f.a;
            if (n2 >= a3.length) {
                break;
            }
            final byte b2 = a3[n2];
            if (b2 > 0) {
                f.c[b2] = (byte)n2;
            }
            ++n2;
        }
        Arrays.fill(f.d, (byte)(-1));
        int n3 = n;
        while (true) {
            final byte[] b3 = f.b;
            if (n3 >= b3.length) {
                break;
            }
            final byte b4 = b3[n3];
            if (b4 > 0) {
                f.d[b4] = (byte)n3;
            }
            ++n3;
        }
    }
    
    public static int a(final String s, final int n, final Charset charset) {
        final CharsetEncoder encoder = charset.newEncoder();
        int length;
        int i;
        for (length = s.length(), i = n; i < length; ++i) {
            char c = s.charAt(i);
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n2;
                if (n2 >= 13) {
                    break;
                }
                n3 = n2;
                if (!k(c)) {
                    break;
                }
                ++n2;
                final int index = i + n2;
                n3 = n2;
                if (index >= length) {
                    break;
                }
                c = s.charAt(index);
            }
            if (n3 >= 13) {
                return i - n;
            }
            final char char1 = s.charAt(i);
            if (!encoder.canEncode(char1)) {
                final StringBuilder sb = new StringBuilder("Non-encodable character detected: ");
                sb.append(char1);
                sb.append(" (Unicode: ");
                sb.append((int)char1);
                sb.append(')');
                throw new h(sb.toString());
            }
        }
        return i - n;
    }
    
    public static int b(final CharSequence charSequence, int n) {
        final int length = charSequence.length();
        int n2 = 0;
        final int n3 = 0;
        Label_0084: {
            if (n < length) {
                int n4 = n;
                n = n3;
                while (true) {
                    final char char1 = charSequence.charAt(n4);
                    int n5;
                    int n6;
                    do {
                        n2 = n;
                        if (!k(char1)) {
                            break Label_0084;
                        }
                        n2 = n;
                        if (n4 >= length) {
                            break Label_0084;
                        }
                        n6 = n + 1;
                        n5 = n4 + 1;
                        n = n6;
                    } while ((n4 = n5) >= length);
                    n = n6;
                    n4 = n5;
                }
            }
        }
        return n2;
    }
    
    public static int c(final CharSequence charSequence, final int n) {
        final int length = charSequence.length();
        int n2 = n;
        int n3;
        while ((n3 = n2) < length) {
            char c;
            int n4;
            int n5;
            int n6;
            int n7;
            for (c = charSequence.charAt(n2), n4 = 0, n5 = n2; n4 < 13 && k(c) && n5 < length; c = charSequence.charAt(n7), n5 = n7, n4 = n6) {
                n6 = n4 + 1;
                n7 = ++n5;
                n4 = n6;
                if (n7 < length) {}
            }
            if (n4 >= 13) {
                return n5 - n - n4;
            }
            n2 = n5;
            if (n4 > 0) {
                continue;
            }
            n3 = n5;
            if (!n(charSequence.charAt(n5))) {
                break;
            }
            n2 = n5 + 1;
        }
        return n3 - n;
    }
    
    public static void d(final byte[] array, final int n, final int n2, int n3, final StringBuilder sb) {
        char c;
        if (n2 == 1 && n3 == 0) {
            c = '\u0391';
        }
        else if (n2 % 6 == 0) {
            c = '\u039c';
        }
        else {
            c = '\u0385';
        }
        sb.append(c);
        int i;
        if (n2 >= 6) {
            final char[] array2 = new char[5];
            n3 = n;
            while (true) {
                i = n3;
                if (n + n2 - n3 < 6) {
                    break;
                }
                final int n4 = 0;
                long n5 = 0L;
                int n6 = 0;
                int j;
                long n7;
                while (true) {
                    j = n4;
                    n7 = n5;
                    if (n6 >= 6) {
                        break;
                    }
                    n5 = (n5 << 8) + (array[n3 + n6] & 0xFF);
                    ++n6;
                }
                while (j < 5) {
                    array2[j] = (char)(n7 % 900L);
                    n7 /= 900L;
                    ++j;
                }
                for (int k = 4; k >= 0; --k) {
                    sb.append(array2[k]);
                }
                n3 += 6;
            }
        }
        else {
            i = n;
        }
        while (i < n + n2) {
            sb.append((char)(array[i] & 0xFF));
            ++i;
        }
    }
    
    public static String e(final String s, final c c, final Charset ob) {
        final StringBuilder sb = new StringBuilder(s.length());
        Charset e;
        if (ob == null) {
            e = f.e;
        }
        else {
            e = ob;
            if (!f.e.equals(ob)) {
                final Y4.c c2 = Y4.c.c(ob.name());
                e = ob;
                if (c2 != null) {
                    h(c2.e(), sb);
                    e = ob;
                }
            }
        }
        final int length = s.length();
        final int n = f$a.a[c.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    int i = 0;
                    int n2;
                    int g = n2 = i;
                    while (i < length) {
                        final int b = b(s, i);
                        if (b >= 13) {
                            sb.append('\u0386');
                            f(s, i, b, sb);
                            i += b;
                            g = 0;
                            n2 = 2;
                        }
                        else {
                            final int c3 = c(s, i);
                            if (c3 < 5 && b != length) {
                                int a;
                                if ((a = a(s, i, e)) == 0) {
                                    a = 1;
                                }
                                final int endIndex = a + i;
                                final byte[] bytes = s.substring(i, endIndex).getBytes(e);
                                if (bytes.length == 1 && n2 == 0) {
                                    d(bytes, 0, 1, 0, sb);
                                }
                                else {
                                    d(bytes, 0, bytes.length, n2, sb);
                                    n2 = 1;
                                    g = 0;
                                }
                                i = endIndex;
                            }
                            else {
                                int n3;
                                if ((n3 = n2) != 0) {
                                    sb.append('\u0384');
                                    g = (n3 = 0);
                                }
                                g = g(s, i, c3, sb, g);
                                i += c3;
                                n2 = n3;
                            }
                        }
                    }
                }
                else {
                    sb.append('\u0386');
                    f(s, 0, length, sb);
                }
            }
            else {
                final byte[] bytes2 = s.getBytes(e);
                d(bytes2, 0, bytes2.length, 1, sb);
            }
        }
        else {
            g(s, 0, length, sb, 0);
        }
        return sb.toString();
    }
    
    public static void f(final String s, final int n, final int n2, final StringBuilder sb) {
        final StringBuilder sb2 = new StringBuilder(n2 / 3 + 1);
        final BigInteger value = BigInteger.valueOf(900L);
        final BigInteger value2 = BigInteger.valueOf(0L);
        int min;
        for (int i = 0; i < n2; i += min) {
            sb2.setLength(0);
            min = Math.min(44, n2 - i);
            final StringBuilder sb3 = new StringBuilder("1");
            final int beginIndex = n + i;
            sb3.append(s.substring(beginIndex, beginIndex + min));
            BigInteger divide = new BigInteger(sb3.toString());
            do {
                sb2.append((char)divide.mod(value).intValue());
            } while (!(divide = divide.divide(value)).equals(value2));
            for (int j = sb2.length() - 1; j >= 0; --j) {
                sb.append(sb2.charAt(j));
            }
        }
    }
    
    public static int g(final CharSequence charSequence, int i, int char1, final StringBuilder sb, int n) {
        final StringBuilder sb2 = new StringBuilder(char1);
        final int n2 = 0;
        int n3 = 0;
    Label_0247_Outer:
        while (true) {
            final int n4 = i + n3;
            final char char2 = charSequence.charAt(n4);
            Label_0381: {
            Label_0289:
                while (true) {
                    Label_0271: {
                        while (true) {
                            Label_0229: {
                                Label_0141: {
                                    byte b = 0;
                                    Label_0065: {
                                        if (n != 0) {
                                            if (n != 1) {
                                                if (n != 2) {
                                                    if (m(char2)) {
                                                        b = f.d[char2];
                                                        break Label_0065;
                                                    }
                                                    sb2.append('\u001d');
                                                }
                                                else {
                                                    if (l(char2)) {
                                                        b = f.c[char2];
                                                        break Label_0065;
                                                    }
                                                    if (j(char2)) {
                                                        sb2.append('\u001c');
                                                    }
                                                    else {
                                                        if (i(char2)) {
                                                            break Label_0141;
                                                        }
                                                        final int n5 = n4 + 1;
                                                        if (n5 < char1 && m(charSequence.charAt(n5))) {
                                                            sb2.append('\u0019');
                                                            n = 3;
                                                            continue Label_0247_Outer;
                                                        }
                                                        sb2.append('\u001d');
                                                        b = f.d[char2];
                                                        break Label_0065;
                                                    }
                                                }
                                                n = 0;
                                                continue Label_0247_Outer;
                                            }
                                            if (i(char2)) {
                                                if (char2 == ' ') {
                                                    break Label_0229;
                                                }
                                                final int n6 = char2 - 'a';
                                                break Label_0247;
                                            }
                                            else {
                                                if (j(char2)) {
                                                    sb2.append('\u001b');
                                                    break Label_0271;
                                                }
                                                if (l(char2)) {
                                                    break Label_0289;
                                                }
                                                sb2.append('\u001d');
                                                b = f.d[char2];
                                            }
                                        }
                                        else if (j(char2)) {
                                            if (char2 == ' ') {
                                                break Label_0229;
                                            }
                                            break Label_0271;
                                        }
                                        else {
                                            if (i(char2)) {
                                                break Label_0141;
                                            }
                                            if (l(char2)) {
                                                break Label_0289;
                                            }
                                            sb2.append('\u001d');
                                            b = f.d[char2];
                                        }
                                    }
                                    final char c = (char)b;
                                    sb2.append(c);
                                    break Label_0381;
                                }
                                sb2.append('\u001b');
                                n = 1;
                                continue Label_0247_Outer;
                            }
                            sb2.append('\u001a');
                            break Label_0381;
                            int n6 = 0;
                            final char c = (char)n6;
                            continue;
                        }
                    }
                    final int n6 = char2 - 'A';
                    continue;
                }
                sb2.append('\u001c');
                n = 2;
                continue Label_0247_Outer;
            }
            if (++n3 >= char1) {
                break;
            }
        }
        final int length = sb2.length();
        char1 = 0;
        char c2;
        for (i = n2; i < length; ++i) {
            if (i % 2 != 0) {
                c2 = (char)(char1 * 30 + sb2.charAt(i));
                sb.append(c2);
                char1 = c2;
            }
            else {
                char1 = sb2.charAt(i);
            }
        }
        if (length % 2 != 0) {
            sb.append((char)(char1 * 30 + 29));
        }
        return n;
    }
    
    public static void h(int i, final StringBuilder sb) {
        char c = '\0';
        Label_0022: {
            if (i >= 0 && i < 900) {
                sb.append('\u039f');
            }
            else if (i < 810900) {
                sb.append('\u039e');
                sb.append((char)(i / 900 - 1));
                i %= 900;
            }
            else {
                if (i < 811800) {
                    sb.append('\u039d');
                    c = (char)(810900 - i);
                    break Label_0022;
                }
                throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
            }
            c = (char)i;
        }
        sb.append(c);
    }
    
    public static boolean i(final char c) {
        return c == ' ' || (c >= 'a' && c <= 'z');
    }
    
    public static boolean j(final char c) {
        return c == ' ' || (c >= 'A' && c <= 'Z');
    }
    
    public static boolean k(final char c) {
        return c >= '0' && c <= '9';
    }
    
    public static boolean l(final char c) {
        return f.c[c] != -1;
    }
    
    public static boolean m(final char c) {
        return f.d[c] != -1;
    }
    
    public static boolean n(final char c) {
        return c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= '~');
    }
}
