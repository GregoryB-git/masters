// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.Arrays;
import d0.A;
import X2.v;
import g0.z;
import android.util.Base64;
import g0.o;
import g0.M;
import R0.a;
import java.util.ArrayList;
import d0.x;
import java.util.List;

public abstract class W
{
    public static int[] a(final int n) {
        if (n == 3) {
            return new int[] { 0, 2, 1 };
        }
        if (n == 5) {
            return new int[] { 0, 2, 1, 3, 4 };
        }
        if (n == 6) {
            return new int[] { 0, 2, 1, 5, 3, 4 };
        }
        if (n == 7) {
            return new int[] { 0, 2, 1, 6, 5, 3, 4 };
        }
        if (n != 8) {
            return null;
        }
        return new int[] { 0, 2, 1, 7, 5, 6, 3, 4 };
    }
    
    public static int b(int i) {
        int n = 0;
        while (i > 0) {
            ++n;
            i >>>= 1;
        }
        return n;
    }
    
    public static long c(final long n, final long n2) {
        return (long)Math.floor(Math.pow((double)n, 1.0 / n2));
    }
    
    public static x d(final List list) {
        final ArrayList<R0.a> list2 = new ArrayList<R0.a>();
        for (int i = 0; i < list.size(); ++i) {
            final String str = list.get(i);
            final String[] c1 = M.c1(str, "=");
            if (c1.length != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse Vorbis comment: ");
                sb.append(str);
                o.h("VorbisUtil", sb.toString());
            }
            else if (c1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    list2.add(R0.a.a(new z(Base64.decode(c1[1], 0))));
                }
                catch (RuntimeException ex) {
                    o.i("VorbisUtil", "Failed to parse vorbis picture", ex);
                }
            }
            else {
                list2.add((R0.a)new W0.a(c1[0], c1[1]));
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new x(list2);
    }
    
    public static v e(final byte[] array) {
        final z z = new z(array);
        z.U(1);
        int n = 0;
        while (z.a() > 0 && z.j() == 255) {
            n += 255;
            z.U(1);
        }
        final int n2 = n + z.G();
        int n3 = 0;
        while (z.a() > 0 && z.j() == 255) {
            n3 += 255;
            z.U(1);
        }
        final int g = z.G();
        final byte[] array2 = new byte[n2];
        final int f = z.f();
        System.arraycopy(array, f, array2, 0, n2);
        final int n4 = f + n2 + (n3 + g);
        final int n5 = array.length - n4;
        final byte[] array3 = new byte[n5];
        System.arraycopy(array, n4, array3, 0, n5);
        return v.a0(array2, array3);
    }
    
    public static void f(final V v) {
        for (int d = v.d(6), i = 0; i < d + 1; ++i) {
            final int d2 = v.d(16);
            if (d2 != 0) {
                if (d2 != 1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("floor type greater than 1 not decodable: ");
                    sb.append(d2);
                    throw A.a(sb.toString(), null);
                }
                final int d3 = v.d(5);
                final int[] array = new int[d3];
                int n = -1;
                int n2;
                for (int j = 0; j < d3; ++j, n = n2) {
                    final int d4 = v.d(4);
                    if ((array[j] = d4) > (n2 = n)) {
                        n2 = d4;
                    }
                }
                final int n3 = n + 1;
                final int[] array2 = new int[n3];
                for (int k = 0; k < n3; ++k) {
                    array2[k] = v.d(3) + 1;
                    final int d5 = v.d(2);
                    if (d5 > 0) {
                        v.e(8);
                    }
                    for (int l = 0; l < 1 << d5; ++l) {
                        v.e(8);
                    }
                }
                v.e(2);
                final int d6 = v.d(4);
                final int n4 = 0;
                int n6;
                int n5 = n6 = n4;
                for (int n7 = n4; n7 < d3; ++n7) {
                    for (n6 += array2[array[n7]]; n5 < n6; ++n5) {
                        v.e(d6);
                    }
                }
            }
            else {
                v.e(8);
                v.e(16);
                v.e(16);
                v.e(6);
                v.e(8);
                for (int d7 = v.d(4), n8 = 0; n8 < d7 + 1; ++n8) {
                    v.e(8);
                }
            }
        }
    }
    
    public static void g(final int n, final V v) {
        for (int d = v.d(6), i = 0; i < d + 1; ++i) {
            final int d2 = v.d(16);
            if (d2 != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("mapping type other than 0 not supported: ");
                sb.append(d2);
                o.c("VorbisUtil", sb.toString());
            }
            else {
                int n2;
                if (v.c()) {
                    n2 = v.d(4) + 1;
                }
                else {
                    n2 = 1;
                }
                if (v.c()) {
                    for (int d3 = v.d(8), j = 0; j < d3 + 1; ++j) {
                        final int n3 = n - 1;
                        v.e(b(n3));
                        v.e(b(n3));
                    }
                }
                if (v.d(2) != 0) {
                    throw A.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (n2 > 1) {
                    for (int k = 0; k < n; ++k) {
                        v.e(4);
                    }
                }
                for (int l = 0; l < n2; ++l) {
                    v.e(8);
                    v.e(8);
                    v.e(8);
                }
            }
        }
    }
    
    public static b[] h(final V v) {
        final int n = v.d(6) + 1;
        final b[] array = new b[n];
        for (int i = 0; i < n; ++i) {
            array[i] = new b(v.c(), v.d(16), v.d(16), v.d(8));
        }
        return array;
    }
    
    public static void i(final V v) {
        for (int d = v.d(6), i = 0; i < d + 1; ++i) {
            if (v.d(16) > 2) {
                throw A.a("residueType greater than 2 is not decodable", null);
            }
            v.e(24);
            v.e(24);
            v.e(24);
            final int n = v.d(6) + 1;
            v.e(8);
            final int[] array = new int[n];
            for (int j = 0; j < n; ++j) {
                final int d2 = v.d(3);
                int d3;
                if (v.c()) {
                    d3 = v.d(5);
                }
                else {
                    d3 = 0;
                }
                array[j] = d3 * 8 + d2;
            }
            for (int k = 0; k < n; ++k) {
                for (int l = 0; l < 8; ++l) {
                    if ((array[k] & 1 << l) != 0x0) {
                        v.e(8);
                    }
                }
            }
        }
    }
    
    public static a j(final z z) {
        return k(z, true, true);
    }
    
    public static a k(final z z, final boolean b, final boolean b2) {
        int n = 0;
        if (b) {
            o(3, z, false);
        }
        final String d = z.D((int)z.w());
        final int length = d.length();
        final long w = z.w();
        final String[] array = new String[(int)w];
        int n2 = length + 15;
        while (n < w) {
            final String d2 = z.D((int)z.w());
            array[n] = d2;
            n2 = n2 + 4 + d2.length();
            ++n;
        }
        if (b2 && (z.G() & 0x1) == 0x0) {
            throw A.a("framing bit expected to be set", null);
        }
        return new a(d, array, n2 + 1);
    }
    
    public static c l(final z z) {
        boolean b = true;
        o(1, z, false);
        final int x = z.x();
        final int g = z.G();
        final int x2 = z.x();
        int t;
        if ((t = z.t()) <= 0) {
            t = -1;
        }
        int t2;
        if ((t2 = z.t()) <= 0) {
            t2 = -1;
        }
        int t3;
        if ((t3 = z.t()) <= 0) {
            t3 = -1;
        }
        final int g2 = z.G();
        final int n = (int)Math.pow(2.0, g2 & 0xF);
        final int n2 = (int)Math.pow(2.0, (g2 & 0xF0) >> 4);
        if ((z.G() & 0x1) <= 0) {
            b = false;
        }
        return new c(x, g, x2, t, t2, t3, n, n2, b, Arrays.copyOf(z.e(), z.g()));
    }
    
    public static b[] m(final z z, final int n) {
        final int n2 = 0;
        o(5, z, false);
        final int g = z.G();
        final V v = new V(z.e());
        v.e(z.f() * 8);
        for (int i = 0; i < g + 1; ++i) {
            n(v);
        }
        for (int d = v.d(6), j = n2; j < d + 1; ++j) {
            if (v.d(16) != 0) {
                throw A.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(v);
        i(v);
        g(n, v);
        final b[] h = h(v);
        if (v.c()) {
            return h;
        }
        throw A.a("framing bit after modes not set as expected", null);
    }
    
    public static void n(final V v) {
        if (v.d(24) != 5653314) {
            final StringBuilder sb = new StringBuilder();
            sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb.append(v.b());
            throw A.a(sb.toString(), null);
        }
        final int d = v.d(16);
        final int d2 = v.d(24);
        final boolean c = v.c();
        final int n = 0;
        int i = 0;
        if (!c) {
            final boolean c2 = v.c();
            while (i < d2) {
                if (!c2 || v.c()) {
                    v.e(5);
                }
                ++i;
            }
        }
        else {
            v.e(5);
            for (int j = n; j < d2; j += v.d(b(d2 - j))) {}
        }
        final int d3 = v.d(4);
        if (d3 <= 2) {
            if (d3 == 1 || d3 == 2) {
                v.e(32);
                v.e(32);
                final int d4 = v.d(4);
                v.e(1);
                long c3;
                if (d3 == 1) {
                    if (d != 0) {
                        c3 = c(d2, d);
                    }
                    else {
                        c3 = 0L;
                    }
                }
                else {
                    c3 = d * (long)d2;
                }
                v.e((int)(c3 * (d4 + 1)));
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("lookup type greater than 2 not decodable: ");
        sb2.append(d3);
        throw A.a(sb2.toString(), null);
    }
    
    public static boolean o(final int i, final z z, final boolean b) {
        if (z.a() < 7) {
            if (b) {
                return false;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("too short header: ");
            sb.append(z.a());
            throw A.a(sb.toString(), null);
        }
        else if (z.G() != i) {
            if (b) {
                return false;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw A.a(sb2.toString(), null);
        }
        else {
            if (z.G() == 118 && z.G() == 111 && z.G() == 114 && z.G() == 98 && z.G() == 105 && z.G() == 115) {
                return true;
            }
            if (b) {
                return false;
            }
            throw A.a("expected characters 'vorbis'", null);
        }
    }
    
    public static final class a
    {
        public final String a;
        public final String[] b;
        public final int c;
        
        public a(final String a, final String[] b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class b
    {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;
        
        public b(final boolean a, final int b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final byte[] j;
        
        public c(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final boolean i, final byte[] j) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
    }
}
