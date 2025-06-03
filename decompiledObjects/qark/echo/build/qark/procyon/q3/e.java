// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class e
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static byte[] a(final String s, final int n) {
        return b(s.getBytes(e.a), n);
    }
    
    public static byte[] b(final byte[] array, final int n) {
        return c(array, 0, array.length, n);
    }
    
    public static byte[] c(byte[] a, int b, final int n, final int n2) {
        final b b2 = new b(n2, new byte[n * 3 / 4]);
        if (!b2.a(a, b, n, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        b = ((a)b2).b;
        a = ((a)b2).a;
        if (b == a.length) {
            return a;
        }
        final byte[] array = new byte[b];
        System.arraycopy(a, 0, array, 0, b);
        return array;
    }
    
    public static String d(final byte[] array) {
        return g(array, 2);
    }
    
    public static byte[] e(final byte[] array, final int n) {
        return f(array, 0, array.length, n);
    }
    
    public static byte[] f(final byte[] array, final int n, final int n2, int n3) {
        final c c = new c(n3, null);
        final int n4 = n2 / 3 * 4;
        final boolean f = c.f;
        final int n5 = 2;
        if (f) {
            n3 = n4;
            if (n2 % 3 > 0) {
                n3 = n4 + 4;
            }
        }
        else {
            n3 = n2 % 3;
            if (n3 != 1) {
                if (n3 != 2) {
                    n3 = n4;
                }
                else {
                    n3 = n4 + 3;
                }
            }
            else {
                n3 = n4 + 2;
            }
        }
        int n6 = n3;
        if (c.g) {
            n6 = n3;
            if (n2 > 0) {
                final int n7 = (n2 - 1) / 57;
                int n8;
                if (c.h) {
                    n8 = n5;
                }
                else {
                    n8 = 1;
                }
                n6 = n3 + (n7 + 1) * n8;
            }
        }
        ((a)c).a = new byte[n6];
        c.a(array, n, n2, true);
        return ((a)c).a;
    }
    
    public static String g(final byte[] array, final int n) {
        try {
            return new String(e(array, n), "US-ASCII");
        }
        catch (UnsupportedEncodingException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public abstract static class a
    {
        public byte[] a;
        public int b;
    }
    
    public static class b extends a
    {
        public static final int[] f;
        public static final int[] g;
        public int c;
        public int d;
        public final int[] e;
        
        static {
            f = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
            g = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        }
        
        public b(final int n, final byte[] a) {
            super.a = a;
            int[] e;
            if ((n & 0x8) == 0x0) {
                e = b.f;
            }
            else {
                e = b.g;
            }
            this.e = e;
            this.c = 0;
            this.d = 0;
        }
        
        public boolean a(final byte[] array, int n, int n2, final boolean b) {
            int c = this.c;
            if (c == 6) {
                return false;
            }
            final int n3 = n2 + n;
            final int d = this.d;
            final byte[] a = super.a;
            final int[] e = this.e;
            n2 = 0;
            final int n4 = n;
            n = d;
            int n5 = n4;
            int d2;
            int b2;
            while (true) {
                d2 = n;
                b2 = n2;
                if (n5 >= n3) {
                    break;
                }
                int n6 = n5;
                int n7 = n;
                int n8 = n2;
                if (c == 0) {
                    while (true) {
                        final int n9 = n5 + 4;
                        if (n9 > n3) {
                            break;
                        }
                        final int n10 = e[array[n5] & 0xFF] << 18 | e[array[n5 + 1] & 0xFF] << 12 | e[array[n5 + 2] & 0xFF] << 6 | e[array[n5 + 3] & 0xFF];
                        if ((n = n10) < 0) {
                            break;
                        }
                        a[n2 + 2] = (byte)n10;
                        a[n2 + 1] = (byte)(n10 >> 8);
                        a[n2] = (byte)(n10 >> 16);
                        n2 += 3;
                        n5 = n9;
                        n = n10;
                    }
                    n6 = n5;
                    n7 = n;
                    n8 = n2;
                    if (n5 >= n3) {
                        d2 = n;
                        b2 = n2;
                        break;
                    }
                }
                final int n11 = e[array[n6] & 0xFF];
                Label_0604: {
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3) {
                                    if (c != 4) {
                                        if (c != 5) {
                                            n = c;
                                            n2 = n8;
                                            break Label_0604;
                                        }
                                        n = c;
                                        n2 = n8;
                                        if (n11 != -1) {
                                            this.c = 6;
                                            return false;
                                        }
                                        break Label_0604;
                                    }
                                    else {
                                        if (n11 == -2) {
                                            n = c + 1;
                                            n2 = n8;
                                            break Label_0604;
                                        }
                                        n = c;
                                        n2 = n8;
                                        if (n11 != -1) {
                                            this.c = 6;
                                            return false;
                                        }
                                        break Label_0604;
                                    }
                                }
                                else {
                                    if (n11 >= 0) {
                                        n7 = (n11 | n7 << 6);
                                        a[n8 + 2] = (byte)n7;
                                        a[n8 + 1] = (byte)(n7 >> 8);
                                        a[n8] = (byte)(n7 >> 16);
                                        n2 = n8 + 3;
                                        n = 0;
                                        break Label_0604;
                                    }
                                    if (n11 == -2) {
                                        a[n8 + 1] = (byte)(n7 >> 2);
                                        a[n8] = (byte)(n7 >> 10);
                                        n2 = n8 + 2;
                                        n = 5;
                                        break Label_0604;
                                    }
                                    n = c;
                                    n2 = n8;
                                    if (n11 != -1) {
                                        this.c = 6;
                                        return false;
                                    }
                                    break Label_0604;
                                }
                            }
                            else if (n11 < 0) {
                                if (n11 == -2) {
                                    a[n8] = (byte)(n7 >> 4);
                                    n2 = n8 + 1;
                                    n = 4;
                                    break Label_0604;
                                }
                                n = c;
                                n2 = n8;
                                if (n11 != -1) {
                                    this.c = 6;
                                    return false;
                                }
                                break Label_0604;
                            }
                        }
                        else if (n11 < 0) {
                            n = c;
                            n2 = n8;
                            if (n11 != -1) {
                                this.c = 6;
                                return false;
                            }
                            break Label_0604;
                        }
                        n = (n11 | n7 << 6);
                    }
                    else if (n11 >= 0) {
                        n = n11;
                    }
                    else {
                        n = c;
                        n2 = n8;
                        if (n11 != -1) {
                            this.c = 6;
                            return false;
                        }
                        break Label_0604;
                    }
                    n2 = c + 1;
                    n7 = n;
                    n = n2;
                    n2 = n8;
                }
                n5 = n6 + 1;
                c = n;
                n = n7;
            }
            if (!b) {
                this.c = c;
                this.d = d2;
            }
            else {
                if (c == 1) {
                    this.c = 6;
                    return false;
                }
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            this.c = 6;
                            return false;
                        }
                    }
                    else {
                        a[b2] = (byte)(d2 >> 10);
                        n = b2 + 2;
                        a[b2 + 1] = (byte)(d2 >> 2);
                        b2 = n;
                    }
                }
                else {
                    a[b2] = (byte)(d2 >> 4);
                    ++b2;
                }
                this.c = c;
            }
            super.b = b2;
            return true;
        }
    }
    
    public static class c extends a
    {
        public static final byte[] j;
        public static final byte[] k;
        public final byte[] c;
        public int d;
        public int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final byte[] i;
        
        static {
            j = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
            k = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        }
        
        public c(int e, byte[] array) {
            super.a = array;
            boolean h = true;
            this.f = ((e & 0x1) == 0x0);
            final boolean g = (e & 0x2) == 0x0;
            this.g = g;
            if ((e & 0x4) == 0x0) {
                h = false;
            }
            this.h = h;
            if ((e & 0x8) == 0x0) {
                array = c.j;
            }
            else {
                array = c.k;
            }
            this.i = array;
            this.c = new byte[2];
            this.d = 0;
            if (g) {
                e = 19;
            }
            else {
                e = -1;
            }
            this.e = e;
        }
        
        public boolean a(byte[] c, int n, int d, final boolean b) {
            final byte[] i = this.i;
            final byte[] a = super.a;
            int e = this.e;
            final int n2 = d + n;
            d = this.d;
            final int n3 = 0;
            final int n4 = 0;
            Label_0178: {
                if (d != 1) {
                    if (d == 2) {
                        d = n + 1;
                        if (d <= n2) {
                            final byte[] c2 = this.c;
                            n = ((c2[1] & 0xFF) << 8 | (c2[0] & 0xFF) << 16 | (c[n] & 0xFF));
                            this.d = 0;
                            break Label_0178;
                        }
                    }
                }
                else if (n + 2 <= n2) {
                    final byte b2 = this.c[0];
                    final byte b3 = c[n];
                    d = n + 2;
                    n = ((c[n + 1] & 0xFF) | ((b2 & 0xFF) << 16 | (b3 & 0xFF) << 8));
                    this.d = 0;
                    break Label_0178;
                }
                final int n5 = -1;
                d = n;
                n = n5;
            }
            while (true) {
                Label_0281: {
                    if (n != -1) {
                        a[0] = i[n >> 18 & 0x3F];
                        a[1] = i[n >> 12 & 0x3F];
                        a[2] = i[n >> 6 & 0x3F];
                        a[3] = i[n & 0x3F];
                        --e;
                        if (e == 0) {
                            if (this.h) {
                                a[4] = 13;
                                n = 5;
                            }
                            else {
                                n = 4;
                            }
                            final int n6 = n + 1;
                            a[n] = 10;
                            n = n6;
                            break Label_0281;
                        }
                        n = 4;
                    }
                    else {
                        n = 0;
                    }
                    while (true) {
                        final int n7 = d + 3;
                        if (n7 > n2) {
                            int b5 = 0;
                            Label_1027: {
                                if (b) {
                                    final int d2 = this.d;
                                    if (d - d2 == n2 - 1) {
                                        byte b4;
                                        if (d2 > 0) {
                                            b4 = this.c[0];
                                            d = 1;
                                        }
                                        else {
                                            b4 = c[d];
                                            d = n4;
                                        }
                                        final int n8 = (b4 & 0xFF) << 4;
                                        this.d = d2 - d;
                                        a[n] = i[n8 >> 6 & 0x3F];
                                        final int n9 = n + 2;
                                        a[n + 1] = i[n8 & 0x3F];
                                        d = n9;
                                        if (this.f) {
                                            a[n9] = 61;
                                            d = n + 4;
                                            a[n + 3] = 61;
                                        }
                                        if (!this.g) {
                                            b5 = d;
                                            break Label_1027;
                                        }
                                        n = d;
                                        if (this.h) {
                                            a[d] = 13;
                                            n = d + 1;
                                        }
                                        d = n + 1;
                                        a[n] = 10;
                                        n = d;
                                    }
                                    else if (d - d2 == n2 - 2) {
                                        byte b6;
                                        int n10;
                                        if (d2 > 1) {
                                            b6 = this.c[0];
                                            n10 = 1;
                                        }
                                        else {
                                            b6 = c[d];
                                            ++d;
                                            n10 = n3;
                                        }
                                        int n11;
                                        if (d2 > 0) {
                                            c = this.c;
                                            d = n10 + 1;
                                            n11 = c[n10];
                                        }
                                        else {
                                            final byte b7 = c[d];
                                            d = n10;
                                            n11 = b7;
                                        }
                                        final int n12 = (b6 & 0xFF) << 10 | (n11 & 0xFF) << 2;
                                        this.d = d2 - d;
                                        a[n] = i[n12 >> 12 & 0x3F];
                                        a[n + 1] = i[n12 >> 6 & 0x3F];
                                        final int n13 = n + 3;
                                        a[n + 2] = i[n12 & 0x3F];
                                        d = n13;
                                        if (this.f) {
                                            a[n13] = 61;
                                            d = n + 4;
                                        }
                                        if (!this.g) {
                                            b5 = d;
                                            break Label_1027;
                                        }
                                        n = d;
                                        if (this.h) {
                                            a[d] = 13;
                                            n = d + 1;
                                        }
                                        d = n + 1;
                                        a[n] = 10;
                                        n = d;
                                    }
                                    else {
                                        b5 = n;
                                        if (!this.g || (b5 = n) <= 0) {
                                            break Label_1027;
                                        }
                                        b5 = n;
                                        if (e == 19) {
                                            break Label_1027;
                                        }
                                        d = n;
                                        if (this.h) {
                                            a[n] = 13;
                                            d = n + 1;
                                        }
                                        n = d + 1;
                                        a[d] = 10;
                                    }
                                    b5 = n;
                                }
                                else if (d == n2 - 1) {
                                    this.c[this.d++] = c[d];
                                    b5 = n;
                                }
                                else {
                                    b5 = n;
                                    if (d == n2 - 2) {
                                        final byte[] c3 = this.c;
                                        final int d3 = this.d;
                                        c3[d3] = c[d];
                                        this.d = d3 + 2;
                                        c3[d3 + 1] = c[d + 1];
                                        b5 = n;
                                    }
                                }
                            }
                            super.b = b5;
                            this.e = e;
                            return true;
                        }
                        d = ((c[d + 1] & 0xFF) << 8 | (c[d] & 0xFF) << 16 | (c[d + 2] & 0xFF));
                        a[n] = i[d >> 18 & 0x3F];
                        a[n + 1] = i[d >> 12 & 0x3F];
                        a[n + 2] = i[d >> 6 & 0x3F];
                        a[n + 3] = i[d & 0x3F];
                        d = n + 4;
                        --e;
                        if (e == 0) {
                            int n14 = d;
                            if (this.h) {
                                a[d] = 13;
                                n14 = n + 5;
                            }
                            n = n14 + 1;
                            a[n14] = 10;
                            d = n7;
                            break;
                        }
                        n = d;
                        d = n7;
                    }
                }
                e = 19;
                continue;
            }
        }
    }
}
