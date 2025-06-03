// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h5;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import g5.b;
import java.io.UnsupportedEncodingException;
import V4.h;
import Y4.a;

public abstract class c
{
    public static final int[] a;
    
    static {
        a = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1 };
    }
    
    public static void a(final String s, final a a, final String charsetName) {
        try {
            final byte[] bytes = s.getBytes(charsetName);
            for (int length = bytes.length, i = 0; i < length; ++i) {
                a.d(bytes[i], 8);
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw new h(ex);
        }
    }
    
    public static void b(final CharSequence charSequence, final a a) {
        final int length = charSequence.length();
        int i = 0;
        while (i < length) {
            final int p2 = p(charSequence.charAt(i));
            if (p2 == -1) {
                throw new h();
            }
            final int n = i + 1;
            if (n < length) {
                final int p3 = p(charSequence.charAt(n));
                if (p3 == -1) {
                    throw new h();
                }
                a.d(p2 * 45 + p3, 11);
                i += 2;
            }
            else {
                a.d(p2, 6);
                i = n;
            }
        }
    }
    
    public static void c(final String s, final b obj, final a a, final String s2) {
        final int n = c$a.a[obj.ordinal()];
        if (n == 1) {
            h(s, a);
            return;
        }
        if (n == 2) {
            b(s, a);
            return;
        }
        if (n == 3) {
            a(s, a, s2);
            return;
        }
        if (n == 4) {
            e(s, a);
            return;
        }
        throw new h("Invalid mode: ".concat(String.valueOf(obj)));
    }
    
    public static void d(final Y4.c c, final a a) {
        a.d(b.v.c(), 4);
        a.d(c.e(), 8);
    }
    
    public static void e(final String s, final a a) {
        try {
            final byte[] bytes = s.getBytes("Shift_JIS");
            for (int length = bytes.length, i = 0; i < length; i += 2) {
                final int n = (bytes[i] & 0xFF) << 8 | (bytes[i + 1] & 0xFF);
                int n2 = 33088;
                int n3 = 0;
                Label_0088: {
                    if (n < 33088 || n > 40956) {
                        if (n < 57408 || n > 60351) {
                            n3 = -1;
                            break Label_0088;
                        }
                        n2 = 49472;
                    }
                    n3 = n - n2;
                }
                if (n3 == -1) {
                    throw new h("Invalid byte sequence");
                }
                a.d((n3 >> 8) * 192 + (n3 & 0xFF), 13);
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw new h(ex);
        }
    }
    
    public static void f(final int i, final g5.c c, final b b, final a a) {
        final int e = b.e(c);
        final int n = 1 << e;
        if (i < n) {
            a.d(i, e);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(n - 1);
        throw new h(sb.toString());
    }
    
    public static void g(final b b, final a a) {
        a.d(b.c(), 4);
    }
    
    public static void h(final CharSequence charSequence, final a a) {
        final int length = charSequence.length();
        int i = 0;
        while (i < length) {
            final int n = charSequence.charAt(i) - '0';
            final int n2 = i + 2;
            if (n2 < length) {
                a.d(n * 100 + (charSequence.charAt(i + 1) - '0') * 10 + (charSequence.charAt(n2) - '0'), 10);
                i += 3;
            }
            else {
                ++i;
                if (i < length) {
                    a.d(n * 10 + (charSequence.charAt(i) - '0'), 7);
                    i = n2;
                }
                else {
                    a.d(n, 4);
                }
            }
        }
    }
    
    public static int i(final b b, final a a, final a a2, final g5.c c) {
        return a.l() + b.e(c) + a2.l();
    }
    
    public static int j(final h5.b b) {
        return d.a(b) + d.c(b) + d.d(b) + d.e(b);
    }
    
    public static int k(final a a, final g5.a a2, final g5.c c, final h5.b b) {
        int n = Integer.MAX_VALUE;
        int n2 = -1;
        int n3;
        for (int i = 0; i < 8; ++i, n = n3) {
            e.a(a, a2, c, i, b);
            final int j = j(b);
            if (j < (n3 = n)) {
                n2 = i;
                n3 = j;
            }
        }
        return n2;
    }
    
    public static b l(final String s, final String anObject) {
        if ("Shift_JIS".equals(anObject) && s(s)) {
            return b.w;
        }
        int i = 0;
        boolean b;
        int n = (b = false) ? 1 : 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 >= '0' && char1 <= '9') {
                b = true;
            }
            else {
                if (p(char1) == -1) {
                    return g5.b.u;
                }
                n = 1;
            }
            ++i;
        }
        if (n != 0) {
            return g5.b.s;
        }
        if (b) {
            return g5.b.r;
        }
        return g5.b.u;
    }
    
    public static g5.c m(final int n, final g5.a a) {
        for (int i = 1; i <= 40; ++i) {
            final g5.c e = g5.c.e(i);
            if (v(n, e, a)) {
                return e;
            }
        }
        throw new h("Data too big");
    }
    
    public static f n(final String s, final g5.a a, final Map map) {
        final boolean b = map != null && map.containsKey(V4.c.p);
        String string;
        if (b) {
            string = map.get(V4.c.p).toString();
        }
        else {
            string = "ISO-8859-1";
        }
        final b l = l(s, string);
        final a a2 = new a();
        final b u = g5.b.u;
        if (l == u && b) {
            final Y4.c c = Y4.c.c(string);
            if (c != null) {
                d(c, a2);
            }
        }
        if (map != null) {
            final V4.c z = V4.c.z;
            if (map.containsKey(z) && Boolean.valueOf(map.get(z).toString())) {
                g(g5.b.x, a2);
            }
        }
        g(l, a2);
        final a a3 = new a();
        c(s, l, a3, string);
        g5.c c2 = null;
        Label_0254: {
            if (map != null) {
                final V4.c y = V4.c.y;
                if (map.containsKey(y)) {
                    c2 = g5.c.e(Integer.parseInt(map.get(y).toString()));
                    if (v(i(l, a2, a3, c2), c2, a)) {
                        break Label_0254;
                    }
                    throw new h("Data too big for requested version");
                }
            }
            c2 = t(a, l, a2, a3);
        }
        final a a4 = new a();
        a4.b(a2);
        int n;
        if (l == u) {
            n = a3.n();
        }
        else {
            n = s.length();
        }
        f(n, c2, l, a4);
        a4.b(a3);
        final g5.c.b c3 = c2.c(a);
        final int n2 = c2.d() - c3.d();
        u(n2, a4);
        final a r = r(a4, c2.d(), n2, c3.c());
        final f f = new f();
        f.c(a);
        f.f(l);
        f.g(c2);
        final int b2 = c2.b();
        final h5.b b3 = new h5.b(b2, b2);
        final int k = k(r, a, c2, b3);
        f.d(k);
        e.a(r, a, c2, k, b3);
        f.e(b3);
        return f;
    }
    
    public static byte[] o(byte[] array, final int n) {
        final int length = array.length;
        final int[] array2 = new int[length + n];
        final int n2 = 0;
        for (int i = 0; i < length; ++i) {
            array2[i] = (array[i] & 0xFF);
        }
        new Z4.c(Z4.a.l).b(array2, n);
        array = new byte[n];
        for (int j = n2; j < n; ++j) {
            array[j] = (byte)array2[length + j];
        }
        return array;
    }
    
    public static int p(final int n) {
        final int[] a = c.a;
        if (n < a.length) {
            return a[n];
        }
        return -1;
    }
    
    public static void q(final int n, int n2, final int n3, final int n4, final int[] array, final int[] array2) {
        if (n4 >= n3) {
            throw new h("Block ID too large");
        }
        final int n5 = n % n3;
        final int n6 = n3 - n5;
        final int n7 = n / n3;
        n2 /= n3;
        final int n8 = n2 + 1;
        final int n9 = n7 - n2;
        final int n10 = n7 + 1 - n8;
        if (n9 != n10) {
            throw new h("EC bytes mismatch");
        }
        if (n3 != n6 + n5) {
            throw new h("RS blocks mismatch");
        }
        if (n != (n2 + n9) * n6 + (n8 + n10) * n5) {
            throw new h("Total bytes mismatch");
        }
        if (n4 < n6) {
            array[0] = n2;
            array2[0] = n9;
            return;
        }
        array[0] = n8;
        array2[0] = n10;
    }
    
    public static a r(final a a, final int i, int n, int j) {
        if (a.n() != n) {
            throw new h("Number of bits and data bytes does not match");
        }
        final ArrayList<h5.a> list = new ArrayList<h5.a>(j);
        final int n2 = 0;
        final int n4;
        final int n3 = n4 = 0;
        int max2;
        int max = max2 = n4;
        int n5 = n4;
        for (int k = n3; k < j; ++k) {
            final int[] array = { 0 };
            final int[] array2 = { 0 };
            q(i, n, j, k, array, array2);
            final int b = array[0];
            final byte[] array3 = new byte[b];
            a.p(n5 << 3, array3, 0, b);
            final byte[] o = o(array3, array2[0]);
            list.add(new h5.a(array3, o));
            max = Math.max(max, b);
            max2 = Math.max(max2, o.length);
            n5 += array[0];
        }
        if (n != n5) {
            throw new h("Data bytes does not match offset");
        }
        final a a2 = new a();
        n = 0;
        while (true) {
            j = n2;
            if (n >= max) {
                break;
            }
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                final byte[] a3 = iterator.next().a();
                if (n < a3.length) {
                    a2.d(a3[n], 8);
                }
            }
            ++n;
        }
        while (j < max2) {
            final Iterator<Object> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final byte[] b2 = iterator2.next().b();
                if (j < b2.length) {
                    a2.d(b2[j], 8);
                }
            }
            ++j;
        }
        if (i == a2.n()) {
            return a2;
        }
        final StringBuilder sb = new StringBuilder("Interleaving error: ");
        sb.append(i);
        sb.append(" and ");
        sb.append(a2.n());
        sb.append(" differ.");
        throw new h(sb.toString());
    }
    
    public static boolean s(final String s) {
        try {
            final byte[] bytes = s.getBytes("Shift_JIS");
            final int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                final int n = bytes[i] & 0xFF;
                if (n < 129 || n > 159) {
                    if (n < 224) {
                        return false;
                    }
                    if (n > 235) {
                        return false;
                    }
                }
            }
            return true;
        }
        catch (UnsupportedEncodingException ex) {
            return false;
        }
    }
    
    public static g5.c t(final g5.a a, final b b, final a a2, final a a3) {
        return m(i(b, a2, a3, m(i(b, a2, a3, g5.c.e(1)), a)), a);
    }
    
    public static void u(final int n, final a a) {
        final int i = n << 3;
        if (a.l() > i) {
            final StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
            sb.append(a.l());
            sb.append(" > ");
            sb.append(i);
            throw new h(sb.toString());
        }
        final int n2 = 0;
        for (int n3 = 0; n3 < 4 && a.l() < i; ++n3) {
            a.a(false);
        }
        int j = a.l() & 0x7;
        if (j > 0) {
            while (j < 8) {
                a.a(false);
                ++j;
            }
        }
        for (int n4 = a.n(), k = n2; k < n - n4; ++k) {
            int n5;
            if ((k & 0x1) == 0x0) {
                n5 = 236;
            }
            else {
                n5 = 17;
            }
            a.d(n5, 8);
        }
        if (a.l() == i) {
            return;
        }
        throw new h("Bits size does not equal capacity");
    }
    
    public static boolean v(final int n, final g5.c c, final g5.a a) {
        return c.d() - c.c(a).d() >= (n + 7) / 8;
    }
}
