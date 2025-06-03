// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

import java.util.Arrays;
import V4.b;

public abstract class j
{
    public static int a(final CharSequence charSequence, int n) {
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
                        if (!f(char1)) {
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
    
    public static String b(final String s, final l l, final b b, final b b2) {
        final a a = new a();
        final c c = new c();
        final m m = new m();
        final n n = new n();
        final f f = new f();
        final b5.b b3 = new b5.b();
        final int n2 = 0;
        final h h = new h(s);
        h.n(l);
        h.l(b, b2);
        while (true) {
            char c2 = '\0';
            Label_0103: {
                if (s.startsWith("[)>\u001e05\u001d") && s.endsWith("\u001e\u0004")) {
                    c2 = '\u00ec';
                    break Label_0103;
                }
                int e = n2;
                if (s.startsWith("[)>\u001e06\u001d")) {
                    e = n2;
                    if (s.endsWith("\u001e\u0004")) {
                        c2 = '\u00ed';
                        break Label_0103;
                    }
                }
                while (h.i()) {
                    (new g[] { a, c, m, n, f, b3 })[e].a(h);
                    if (h.e() >= 0) {
                        e = h.e();
                        h.j();
                    }
                }
                final int a2 = h.a();
                h.p();
                final int a3 = h.g().a();
                if (a2 < a3 && e != 0 && e != 5 && e != 4) {
                    h.r('\u00fe');
                }
                final StringBuilder b4 = h.b();
                if (b4.length() < a3) {
                    b4.append('\u0081');
                }
                while (b4.length() < a3) {
                    b4.append(o('\u0081', b4.length() + 1));
                }
                return h.b().toString();
            }
            h.r(c2);
            h.m(2);
            h.d += 7;
            int e = n2;
            continue;
        }
    }
    
    public static int c(final float[] array, final int[] array2, int i, final byte[] array3) {
        Arrays.fill(array3, (byte)0);
        final int n = 0;
        int n2 = i;
        int n3;
        int n4;
        for (i = n; i < 6; ++i, n2 = n4) {
            n3 = (int)Math.ceil(array[i]);
            if ((n4 = n2) > (array2[i] = n3)) {
                Arrays.fill(array3, (byte)0);
                n4 = n3;
            }
            if (n4 == n3) {
                ++array3[i];
            }
        }
        return n2;
    }
    
    public static int d(final byte[] array) {
        int i = 0;
        int n = 0;
        while (i < 6) {
            n += array[i];
            ++i;
        }
        return n;
    }
    
    public static void e(final char c) {
        final String hexString = Integer.toHexString(c);
        final StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder("Illegal character: ");
        sb2.append(c);
        sb2.append(" (0x");
        sb2.append(string);
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static boolean f(final char c) {
        return c >= '0' && c <= '9';
    }
    
    public static boolean g(final char c) {
        return c >= '\u0080' && c <= '\u00ff';
    }
    
    public static boolean h(final char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }
    
    public static boolean i(final char c) {
        return c >= ' ' && c <= '^';
    }
    
    public static boolean j(final char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }
    
    public static boolean k(final char c) {
        return m(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }
    
    public static boolean l(final char c) {
        return false;
    }
    
    public static boolean m(final char c) {
        return c == '\r' || c == '*' || c == '>';
    }
    
    public static int n(final CharSequence charSequence, int c, int d) {
        if (c >= charSequence.length()) {
            return d;
        }
        float[] array;
        if (d == 0) {
            final float[] array2;
            array = (array2 = new float[6]);
            array2[0] = 0.0f;
            array2[2] = (array2[1] = 1.0f);
            array2[4] = (array2[3] = 1.0f);
            array2[5] = 1.25f;
        }
        else {
            final float[] array3;
            array = (array3 = new float[6]);
            array3[0] = 1.0f;
            array3[2] = (array3[1] = 2.0f);
            array3[4] = (array3[3] = 2.0f);
            array3[5] = 2.25f;
            array[d] = 0.0f;
        }
        d = 0;
        Block_42: {
            while (true) {
                final int n = c + d;
                if (n == charSequence.length()) {
                    final byte[] array4 = new byte[6];
                    final int[] array5 = new int[6];
                    c = c(array, array5, Integer.MAX_VALUE, array4);
                    d = d(array4);
                    if (array5[0] == c) {
                        return 0;
                    }
                    if (d == 1 && array4[5] > 0) {
                        return 5;
                    }
                    if (d == 1 && array4[4] > 0) {
                        return 4;
                    }
                    if (d == 1 && array4[2] > 0) {
                        return 2;
                    }
                    if (d == 1 && array4[3] > 0) {
                        return 3;
                    }
                    return 1;
                }
                else {
                    final char char1 = charSequence.charAt(n);
                    ++d;
                    if (f(char1)) {
                        array[0] += 0.5f;
                    }
                    else if (g(char1)) {
                        array[0] = (array[0] = (float)Math.ceil(array[0])) + 2.0f;
                    }
                    else {
                        array[0] = (array[0] = (float)Math.ceil(array[0])) + 1.0f;
                    }
                    if (h(char1)) {
                        array[1] += 0.6666667f;
                    }
                    else if (g(char1)) {
                        array[1] += 2.6666667f;
                    }
                    else {
                        array[1] += 1.3333334f;
                    }
                    if (j(char1)) {
                        array[2] += 0.6666667f;
                    }
                    else if (g(char1)) {
                        array[2] += 2.6666667f;
                    }
                    else {
                        array[2] += 1.3333334f;
                    }
                    if (k(char1)) {
                        array[3] += 0.6666667f;
                    }
                    else if (g(char1)) {
                        array[3] += 4.3333335f;
                    }
                    else {
                        array[3] += 3.3333333f;
                    }
                    if (i(char1)) {
                        array[4] += 0.75f;
                    }
                    else if (g(char1)) {
                        array[4] += 4.25f;
                    }
                    else {
                        array[4] += 3.25f;
                    }
                    if (l(char1)) {
                        array[5] += 4.0f;
                    }
                    else {
                        ++array[5];
                    }
                    if (d < 4) {
                        continue;
                    }
                    final int[] array6 = new int[6];
                    final byte[] array7 = new byte[6];
                    c(array, array6, Integer.MAX_VALUE, array7);
                    final int d2 = d(array7);
                    final int n2 = array6[0];
                    final int n3 = array6[5];
                    if (n2 < n3 && n2 < array6[1] && n2 < array6[2] && n2 < array6[3] && n2 < array6[4]) {
                        return 0;
                    }
                    if (n3 < n2) {
                        break;
                    }
                    final byte b = array7[1];
                    final byte b2 = array7[2];
                    final byte b3 = array7[3];
                    final byte b4 = array7[4];
                    if (b + b2 + b3 + b4 == 0) {
                        break;
                    }
                    if (d2 == 1 && b4 > 0) {
                        return 4;
                    }
                    if (d2 == 1 && b2 > 0) {
                        return 2;
                    }
                    if (d2 == 1 && b3 > 0) {
                        return 3;
                    }
                    final int n4 = array6[1];
                    if (n4 + 1 >= n2 || n4 + 1 >= n3 || n4 + 1 >= array6[4] || n4 + 1 >= array6[2]) {
                        continue;
                    }
                    final int n5 = array6[3];
                    if (n4 < n5) {
                        return 1;
                    }
                    if (n4 == n5) {
                        break Block_42;
                    }
                    continue;
                }
            }
            return 5;
        }
        c += d;
        char char2;
        do {
            ++c;
            if (c >= charSequence.length()) {
                break;
            }
            char2 = charSequence.charAt(c);
            if (m(char2)) {
                return 3;
            }
        } while (k(char2));
        return 1;
    }
    
    public static char o(final char c, final int n) {
        int n2 = c + (n * 149 % 253 + 1);
        if (n2 > 254) {
            n2 -= 254;
        }
        return (char)n2;
    }
}
