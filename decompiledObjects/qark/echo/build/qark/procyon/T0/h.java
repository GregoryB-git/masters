// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T0;

import d0.x;
import java.nio.ByteBuffer;
import java.util.Locale;
import X2.v;
import java.util.List;
import g0.y;
import g0.o;
import java.util.ArrayList;
import java.nio.charset.Charset;
import W2.e;
import java.util.Arrays;
import g0.M;
import g0.z;
import O0.c;

public final class h extends c
{
    public static final a b;
    public final a a;
    
    static {
        b = (a)new g();
    }
    
    public h() {
        this(null);
    }
    
    public h(final a a) {
        this.a = a;
    }
    
    public static int B(final z z, int n) {
        final byte[] e = z.e();
        int f;
        final int n2 = f = z.f();
        while (true) {
            final int n3 = f + 1;
            if (n3 >= n2 + n) {
                break;
            }
            int n4 = n;
            if ((e[f] & 0xFF) == 0xFF) {
                n4 = n;
                if (e[n3] == 0) {
                    System.arraycopy(e, f + 2, e, n3, n - (f - n2) - 2);
                    n4 = n - 1;
                }
            }
            f = n3;
            n = n4;
        }
        return n;
    }
    
    public static boolean C(final z z, final int n, final int n2, final boolean b) {
        final int f = z.f();
        while (true) {
            try {
                while (true) {
                    final int a = z.a();
                    final boolean b2 = true;
                    if (a < n2) {
                        z.T(f);
                        return true;
                    }
                    int n3;
                    long i;
                    int m;
                    if (n >= 3) {
                        n3 = z.p();
                        i = z.I();
                        m = z.M();
                    }
                    else {
                        n3 = z.J();
                        i = z.J();
                        m = 0;
                    }
                    if (n3 == 0 && i == 0L && m == 0) {
                        z.T(f);
                        return true;
                    }
                    long n4 = i;
                    if (n == 4) {
                        n4 = i;
                        if (!b) {
                            if ((0x808080L & i) != 0x0L) {
                                z.T(f);
                                return false;
                            }
                            n4 = ((i >> 24 & 0xFFL) << 21 | ((i & 0xFFL) | (i >> 8 & 0xFFL) << 7 | (i >> 16 & 0xFFL) << 14));
                        }
                    }
                    int n5 = 0;
                    boolean b3 = false;
                    Label_0278: {
                        int n6;
                        if (n == 4) {
                            if ((m & 0x40) != 0x0) {
                                n5 = 1;
                            }
                            else {
                                n5 = 0;
                            }
                            n6 = n5;
                            if ((m & 0x1) != 0x0) {
                                b3 = b2;
                                break Label_0278;
                            }
                        }
                        else {
                            if (n != 3) {
                                n5 = ((b3 = false) ? 1 : 0);
                                break Label_0278;
                            }
                            if ((m & 0x20) != 0x0) {
                                n5 = 1;
                            }
                            else {
                                n5 = 0;
                            }
                            n6 = n5;
                            if ((m & 0x80) != 0x0) {
                                b3 = b2;
                                break Label_0278;
                            }
                        }
                        final boolean b4 = false;
                        n5 = n6;
                        b3 = b4;
                    }
                    int n7 = n5;
                    if (b3) {
                        n7 = n5 + 4;
                    }
                    if (n4 < n7) {
                        z.T(f);
                        return false;
                    }
                    if (z.a() < n4) {
                        z.T(f);
                        return false;
                    }
                    z.U((int)n4);
                }
                z.T(f);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static byte[] d(final byte[] original, final int from, final int to) {
        if (to <= from) {
            return M.f;
        }
        return Arrays.copyOfRange(original, from, to);
    }
    
    public static T0.a f(final z z, int z2, int n) {
        final int g = z.G();
        final Charset w = w(g);
        final int n2 = z2 - 1;
        final byte[] bytes = new byte[n2];
        z.l(bytes, 0, n2);
        String str;
        if (n == 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("image/");
            sb.append(W2.c.e(new String(bytes, 0, 3, e.b)));
            if ("image/jpg".equals(str = sb.toString())) {
                str = "image/jpeg";
            }
            z2 = 2;
        }
        else {
            z2 = z(bytes, 0);
            str = W2.c.e(new String(bytes, 0, z2, e.b));
            if (str.indexOf(47) == -1) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("image/");
                sb2.append(str);
                str = sb2.toString();
            }
        }
        n = bytes[z2 + 1];
        z2 += 2;
        final int y = y(bytes, z2, g);
        return new T0.a(str, new String(bytes, z2, y - z2, w), n & 0xFF, d(bytes, y + v(g), n2));
    }
    
    public static T0.b g(final z z, final int n, final String s) {
        final byte[] array = new byte[n];
        z.l(array, 0, n);
        return new T0.b(s, array);
    }
    
    public static T0.c h(final z z, final int n, final int n2, final boolean b, final int n3, final a a) {
        final int f = z.f();
        final int z2 = z(z.e(), f);
        final String s = new String(z.e(), f, z2 - f, e.b);
        z.T(z2 + 1);
        final int p6 = z.p();
        final int p7 = z.p();
        long i = z.I();
        if (i == 4294967295L) {
            i = -1L;
        }
        long j = z.I();
        if (j == 4294967295L) {
            j = -1L;
        }
        final ArrayList<i> list = new ArrayList<i>();
        while (z.f() < f + n) {
            final i k = k(n2, z, b, n3, a);
            if (k != null) {
                list.add(k);
            }
        }
        return new T0.c(s, p6, p7, i, j, list.toArray(new i[0]));
    }
    
    public static d i(final z z, final int n, final int n2, final boolean b, final int n3, final a a) {
        final int f = z.f();
        final int z2 = z(z.e(), f);
        final String s = new String(z.e(), f, z2 - f, e.b);
        z.T(z2 + 1);
        final int g = z.G();
        final boolean b2 = (g & 0x2) != 0x0;
        final boolean b3 = (g & 0x1) != 0x0;
        final int g2 = z.G();
        final String[] array = new String[g2];
        for (int i = 0; i < g2; ++i) {
            final int f2 = z.f();
            final int z3 = z(z.e(), f2);
            array[i] = new String(z.e(), f2, z3 - f2, e.b);
            z.T(z3 + 1);
        }
        final ArrayList<i> list = new ArrayList<i>();
        while (z.f() < f + n) {
            final i k = k(n2, z, b, n3, a);
            if (k != null) {
                list.add(k);
            }
        }
        return new d(s, b2, b3, array, list.toArray(new i[0]));
    }
    
    public static T0.e j(final z z, int y) {
        if (y < 4) {
            return null;
        }
        final int g = z.G();
        final Charset w = w(g);
        final byte[] bytes = new byte[3];
        z.l(bytes, 0, 3);
        final String s = new String(bytes, 0, 3);
        y -= 4;
        final byte[] bytes2 = new byte[y];
        z.l(bytes2, 0, y);
        y = y(bytes2, 0, g);
        final String s2 = new String(bytes2, 0, y, w);
        y += v(g);
        return new T0.e(s, s2, p(bytes2, y, y(bytes2, y, g), w));
    }
    
    public static i k(final int n, z z, final boolean b, final int n2, final a a) {
        final int g = z.G();
        final int g2 = z.G();
        final int g3 = z.G();
        int g4;
        if (n >= 3) {
            g4 = z.G();
        }
        else {
            g4 = 0;
        }
        int n4;
        if (n == 4) {
            final int n3 = n4 = z.K();
            if (!b) {
                n4 = ((n3 >> 24 & 0xFF) << 21 | ((n3 & 0xFF) | (n3 >> 8 & 0xFF) << 7 | (n3 >> 16 & 0xFF) << 14));
            }
        }
        else if (n == 3) {
            n4 = z.K();
        }
        else {
            n4 = z.J();
        }
        final int n5 = n4;
        int m;
        if (n >= 3) {
            m = z.M();
        }
        else {
            m = 0;
        }
        Object o = null;
        if (g == 0 && g2 == 0 && g3 == 0 && g4 == 0 && n5 == 0 && m == 0) {
            z.T(z.g());
            return null;
        }
        final int n6 = z.f() + n5;
        if (n6 > z.g()) {
            g0.o.h("Id3Decoder", "Frame size exceeds remaining tag data");
            z.T(z.g());
            return null;
        }
        if (a != null && !a.a(n, g, g2, g3, g4)) {
            z.T(n6);
            return null;
        }
        final int n7 = m;
        int b2;
        int n8;
        int n9;
        int n10;
        int n11;
        if (n == 3) {
            if ((n7 & 0x80) != 0x0) {
                b2 = 1;
            }
            else {
                b2 = 0;
            }
            final boolean b3 = (n7 & 0x40) != 0x0;
            final boolean b4 = (n7 & 0x20) != 0x0;
            final boolean b5 = false;
            n8 = (b4 ? 1 : 0);
            n9 = b2;
            n10 = (b3 ? 1 : 0);
            n11 = (b5 ? 1 : 0);
        }
        else if (n == 4) {
            final boolean b6 = (n7 & 0x40) != 0x0;
            if ((n7 & 0x8) != 0x0) {
                n9 = 1;
            }
            else {
                n9 = 0;
            }
            final boolean b7 = (n7 & 0x4) != 0x0;
            final boolean b8 = (n7 & 0x2) != 0x0;
            int n12;
            if ((n7 & 0x1) != 0x0) {
                n12 = 1;
            }
            else {
                n12 = 0;
            }
            final int n13 = n12;
            n10 = (b7 ? 1 : 0);
            n8 = (b6 ? 1 : 0);
            n11 = (b8 ? 1 : 0);
            b2 = n13;
        }
        else {
            n9 = 0;
            n8 = 0;
            n10 = 0;
            n11 = 0;
            b2 = 0;
        }
        Label_0975: {
            if (n9 != 0 || n10 != 0) {
                break Label_0975;
            }
            int n14 = n5;
            if (n8 != 0) {
                n14 = n5 - 1;
                z.U(1);
            }
            int n15 = n14;
            if (b2 != 0) {
                n15 = n14 - 4;
                z.U(4);
            }
            b2 = n15;
            if (n11 != 0) {
                b2 = B(z, n15);
            }
            Label_0580: {
                if (g != 84 || g2 != 88 || g3 != 88) {
                    break Label_0580;
                }
                if (n != 2) {
                    if (g4 != 88) {
                        break Label_0580;
                    }
                }
                Object o2;
                Exception ex;
                final a a2;
                Label_0895_Outer:Label_0621_Outer:Label_0690_Outer:Label_0713_Outer:Label_0724_Outer:
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                try {
                                                    o2 = s(z, b2);
                                                Label_0904_Outer:
                                                    while (true) {
                                                        z.T(n6);
                                                        z = (z)o2;
                                                        ex = null;
                                                        Block_62: {
                                                            while (true) {
                                                                while (true) {
                                                                    Block_74: {
                                                                        Block_70: {
                                                                            while (true) {
                                                                                if (z == null) {
                                                                                    o = new StringBuilder();
                                                                                    ((StringBuilder)o).append("Failed to decode frame: id=");
                                                                                    ((StringBuilder)o).append(x(n, g, g2, g3, g4));
                                                                                    ((StringBuilder)o).append(", frameSize=");
                                                                                    ((StringBuilder)o).append(b2);
                                                                                    g0.o.i("Id3Decoder", ((StringBuilder)o).toString(), ex);
                                                                                }
                                                                                return (i)z;
                                                                                Label_0651: {
                                                                                    break Block_62;
                                                                                }
                                                                                Label_0768:
                                                                                break Block_70;
                                                                                Label_0812:
                                                                                break Block_74;
                                                                                z.T(n6);
                                                                                z = (z)o;
                                                                                continue Label_0895_Outer;
                                                                            }
                                                                            o2 = q(z, b2, x(n, g, g2, g3, g4));
                                                                            continue Label_0904_Outer;
                                                                            Label_0851: {
                                                                                o2 = g(z, b2, x(n, g, g2, g3, g4));
                                                                            }
                                                                            continue Label_0904_Outer;
                                                                            Block_58: {
                                                                                break Block_58;
                                                                                o2 = h(z, b2, n, b, n2, a2);
                                                                                continue Label_0904_Outer;
                                                                            }
                                                                            o2 = t(z, b2, x(n, g, g2, g3, g4));
                                                                            continue Label_0904_Outer;
                                                                            o2 = l(z, b2);
                                                                            continue Label_0904_Outer;
                                                                            o2 = j(z, b2);
                                                                            continue Label_0904_Outer;
                                                                        }
                                                                        o2 = i(z, b2, n, b, n2, a2);
                                                                        continue Label_0904_Outer;
                                                                    }
                                                                    o2 = n(z, b2);
                                                                    continue Label_0904_Outer;
                                                                    g0.o.h("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                                                                    z.T(n6);
                                                                    return null;
                                                                    o2 = u(z, b2);
                                                                    continue Label_0904_Outer;
                                                                    continue Label_0690_Outer;
                                                                }
                                                                o2 = f(z, b2, n);
                                                                continue Label_0904_Outer;
                                                                continue Label_0621_Outer;
                                                            }
                                                        }
                                                        o2 = o(z, b2);
                                                        continue Label_0904_Outer;
                                                    }
                                                }
                                                // iftrue(Label_1042:, g != 80 || g2 != 82 || g3 != 73 || g4 != 86)
                                                // iftrue(Label_0812:, g != 67 || g2 != 84 || g3 != 79 || g4 != 67)
                                                // iftrue(Label_0851:, g != 77 || g2 != 76 || g3 != 76 || g4 != 84)
                                                // iftrue(Label_0651:, g != 87)
                                                // iftrue(Label_0768:, g != 67 || g2 != 72 || g3 != 65 || g4 != 80)
                                                // iftrue(Label_1006:, g != 84)
                                                catch (Exception ex) {
                                                    continue Label_0621_Outer;
                                                }
                                                catch (OutOfMemoryError ex) {
                                                    continue Label_0621_Outer;
                                                }
                                                break;
                                            }
                                            Label_1006: {
                                                if (g == 87 && g2 == 88 && g3 == 88 && (n == 2 || g4 == 88)) {
                                                    continue Label_0724_Outer;
                                                }
                                            }
                                            break;
                                        }
                                        continue Label_0690_Outer;
                                    }
                                    Label_1042: {
                                        if (g == 71 && g2 == 69 && g3 == 79 && (g4 == 66 || n == 2)) {
                                            continue Label_0713_Outer;
                                        }
                                    }
                                    break;
                                }
                                if (n == 2) {
                                    if (g == 80 && g2 == 73 && g3 == 67) {
                                        continue;
                                    }
                                }
                                else if (g == 65 && g2 == 80 && g3 == 73 && g4 == 67) {
                                    continue;
                                }
                                break;
                            }
                            if (g == 67 && g2 == 79 && g3 == 77 && (g4 == 77 || n == 2)) {
                                continue Label_0724_Outer;
                            }
                            break;
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static f l(final z z, int n) {
        final int g = z.G();
        final Charset w = w(g);
        --n;
        final byte[] bytes = new byte[n];
        z.l(bytes, 0, n);
        final int z2 = z(bytes, 0);
        final String t = d0.z.t(new String(bytes, 0, z2, e.b));
        final int n2 = z2 + 1;
        final int y = y(bytes, n2, g);
        final String p2 = p(bytes, n2, y, w);
        final int n3 = y + v(g);
        final int y2 = y(bytes, n3, g);
        return new f(t, p2, p(bytes, n3, y2, w), d(bytes, y2 + v(g), n));
    }
    
    public static b m(final z z) {
        final boolean b = false;
        String string = null;
        Label_0016: {
            if (z.a() < 10) {
                string = "Data too short to be an ID3 tag";
            }
            else {
                final int j = z.J();
                StringBuilder sb = null;
                Label_0074: {
                    if (j == 4801587) {
                        final int g = z.G();
                        z.U(1);
                        final int g2 = z.G();
                        final int f = z.F();
                        int n;
                        if (g == 2) {
                            n = f;
                            if ((g2 & 0x40) != 0x0) {
                                string = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                                break Label_0016;
                            }
                        }
                        else if (g == 3) {
                            n = f;
                            if ((g2 & 0x40) != 0x0) {
                                final int p = z.p();
                                z.U(p);
                                n = f - (p + 4);
                            }
                        }
                        else {
                            if (g != 4) {
                                sb = new StringBuilder();
                                sb.append("Skipped ID3 tag with unsupported majorVersion=");
                                sb.append(g);
                                break Label_0074;
                            }
                            int n2 = f;
                            if ((g2 & 0x40) != 0x0) {
                                final int f2 = z.F();
                                z.U(f2 - 4);
                                n2 = f - f2;
                            }
                            n = n2;
                            if ((g2 & 0x10) != 0x0) {
                                n = n2 - 10;
                            }
                        }
                        boolean b2 = b;
                        if (g < 4) {
                            b2 = b;
                            if ((g2 & 0x80) != 0x0) {
                                b2 = true;
                            }
                        }
                        return new b(g, b2, n);
                    }
                    sb = new StringBuilder();
                    sb.append("Unexpected first three bytes of ID3 tag header: 0x");
                    sb.append(String.format("%06X", j));
                }
                string = sb.toString();
            }
        }
        o.h("Id3Decoder", string);
        return null;
    }
    
    public static l n(final z z, int i) {
        final int m = z.M();
        final int j = z.J();
        final int k = z.J();
        final int g = z.G();
        final int g2 = z.G();
        final y y = new y();
        y.m(z);
        final int n = (i - 10) * 8 / (g + g2);
        final int[] array = new int[n];
        final int[] array2 = new int[n];
        int h;
        int h2;
        for (i = 0; i < n; ++i) {
            h = y.h(g);
            h2 = y.h(g2);
            array[i] = h;
            array2[i] = h2;
        }
        return new l(m, j, k, array, array2);
    }
    
    public static m o(final z z, final int n) {
        final byte[] bytes = new byte[n];
        z.l(bytes, 0, n);
        final int z2 = z(bytes, 0);
        return new m(new String(bytes, 0, z2, e.b), d(bytes, z2 + 1, n));
    }
    
    public static String p(final byte[] bytes, final int offset, final int n, final Charset charset) {
        if (n > offset && n <= bytes.length) {
            return new String(bytes, offset, n - offset, charset);
        }
        return "";
    }
    
    public static n q(final z z, int n, final String s) {
        if (n < 1) {
            return null;
        }
        final int g = z.G();
        --n;
        final byte[] array = new byte[n];
        z.l(array, 0, n);
        return new n(s, null, r(array, g, 0));
    }
    
    public static v r(final byte[] bytes, final int n, int offset) {
        if (offset >= bytes.length) {
            return v.Z("");
        }
        final v.a m = v.M();
        while (true) {
            final int y = y(bytes, offset, n);
            if (offset >= y) {
                break;
            }
            m.h(new String(bytes, offset, y - offset, w(n)));
            offset = v(n) + y;
        }
        v v;
        if ((v = m.k()).isEmpty()) {
            v = X2.v.Z("");
        }
        return v;
    }
    
    public static n s(final z z, int y) {
        if (y < 1) {
            return null;
        }
        final int g = z.G();
        --y;
        final byte[] bytes = new byte[y];
        z.l(bytes, 0, y);
        y = y(bytes, 0, g);
        return new n("TXXX", new String(bytes, 0, y, w(g)), r(bytes, g, y + v(g)));
    }
    
    public static T0.o t(final z z, final int n, final String s) {
        final byte[] bytes = new byte[n];
        z.l(bytes, 0, n);
        return new T0.o(s, null, new String(bytes, 0, z(bytes, 0), e.b));
    }
    
    public static T0.o u(final z z, int y) {
        if (y < 1) {
            return null;
        }
        final int g = z.G();
        --y;
        final byte[] bytes = new byte[y];
        z.l(bytes, 0, y);
        y = y(bytes, 0, g);
        final String s = new String(bytes, 0, y, w(g));
        y += v(g);
        return new T0.o("WXXX", s, p(bytes, y, z(bytes, y), e.b));
    }
    
    public static int v(final int n) {
        if (n != 0 && n != 3) {
            return 2;
        }
        return 1;
    }
    
    public static Charset w(final int n) {
        if (n == 1) {
            return e.f;
        }
        if (n == 2) {
            return e.d;
        }
        if (n != 3) {
            return e.b;
        }
        return e.c;
    }
    
    public static String x(final int n, final int n2, final int n3, final int n4, final int i) {
        if (n == 2) {
            return String.format(Locale.US, "%c%c%c", n2, n3, n4);
        }
        return String.format(Locale.US, "%c%c%c%c", n2, n3, n4, i);
    }
    
    public static int y(final byte[] array, final int n, final int n2) {
        final int z = z(array, n);
        if (n2 == 0) {
            return z;
        }
        int i = z;
        if (n2 == 3) {
            return z;
        }
        while (i < array.length - 1) {
            if ((i - n) % 2 == 0 && array[i + 1] == 0) {
                return i;
            }
            i = z(array, i + 1);
        }
        return array.length;
    }
    
    public static int z(final byte[] array, int i) {
        while (i < array.length) {
            if (array[i] == 0) {
                return i;
            }
            ++i;
        }
        return array.length;
    }
    
    @Override
    public x b(final O0.b b, final ByteBuffer byteBuffer) {
        return this.e(byteBuffer.array(), byteBuffer.limit());
    }
    
    public x e(final byte[] array, int n) {
        final ArrayList<i> list = new ArrayList<i>();
        final z z = new z(array, n);
        final b m = m(z);
        if (m == null) {
            return null;
        }
        final int f = z.f();
        if (h.b.a(m) == 2) {
            n = 6;
        }
        else {
            n = 10;
        }
        int n2 = h.b.b(m);
        if (h.b.c(m)) {
            n2 = B(z, h.b.b(m));
        }
        z.S(f + n2);
        final int a = h.b.a(m);
        boolean b = false;
        if (!C(z, a, n, false)) {
            if (h.b.a(m) != 4 || !C(z, 4, n, true)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(h.b.a(m));
                o.h("Id3Decoder", sb.toString());
                return null;
            }
            b = true;
        }
        while (z.a() >= n) {
            final i k = k(h.b.a(m), z, b, n, this.a);
            if (k != null) {
                list.add(k);
            }
        }
        return new x(list);
    }
    
    public interface a
    {
        boolean a(final int p0, final int p1, final int p2, final int p3, final int p4);
    }
    
    public static final class b
    {
        public final int a;
        public final boolean b;
        public final int c;
        
        public b(final int a, final boolean b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static /* synthetic */ int a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ int b(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ boolean c(final b b) {
            return b.b;
        }
    }
}
