// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class l0
{
    public static final a a;
    
    static {
        a a2;
        if (d.d() && !com.google.protobuf.d.c()) {
            a2 = new d();
        }
        else {
            a2 = new b();
        }
        a = a2;
    }
    
    public static int e(final CharSequence charSequence, final byte[] array, final int n, final int n2) {
        return l0.a.a(charSequence, array, n, n2);
    }
    
    public static int f(final CharSequence charSequence) {
        int length;
        int n;
        for (length = charSequence.length(), n = 0; n < length && charSequence.charAt(n) < '\u0080'; ++n) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= length) {
                break;
            }
            final char char1 = charSequence.charAt(n);
            if (char1 >= '\u0800') {
                n3 = n2 + g(charSequence, n);
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++n;
        }
        if (n3 >= length) {
            return n3;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(n3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int g(final CharSequence seq, int i) {
        final int length = seq.length();
        int n = 0;
        while (i < length) {
            final char char1 = seq.charAt(i);
            int n2;
            if (char1 < '\u0800') {
                n += '\u007f' - char1 >>> 31;
                n2 = i;
            }
            else {
                final int n3 = n += 2;
                n2 = i;
                if ('\ud800' <= char1) {
                    n = n3;
                    n2 = i;
                    if (char1 <= '\udfff') {
                        if (Character.codePointAt(seq, i) < 65536) {
                            throw new c(i, length);
                        }
                        n2 = i + 1;
                        n = n3;
                    }
                }
            }
            i = n2 + 1;
        }
        return n;
    }
    
    public static int h(final int n) {
        int n2 = n;
        if (n > -12) {
            n2 = -1;
        }
        return n2;
    }
    
    public static int i(final int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            return n ^ n2 << 8;
        }
        return -1;
    }
    
    public static int j(final int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            return n ^ n2 << 8 ^ n3 << 16;
        }
        return -1;
    }
    
    public static int k(final byte[] array, final int n, int n2) {
        final byte b = array[n - 1];
        n2 -= n;
        if (n2 == 0) {
            return h(b);
        }
        if (n2 == 1) {
            return i(b, array[n]);
        }
        if (n2 == 2) {
            return j(b, array[n], array[n + 1]);
        }
        throw new AssertionError();
    }
    
    public static boolean l(final byte[] array) {
        return l0.a.b(array, 0, array.length);
    }
    
    public static boolean m(final byte[] array, final int n, final int n2) {
        return l0.a.b(array, n, n2);
    }
    
    public abstract static class a
    {
        public abstract int a(final CharSequence p0, final byte[] p1, final int p2, final int p3);
        
        public final boolean b(final byte[] array, final int n, final int n2) {
            boolean b = false;
            if (this.c(0, array, n, n2) == 0) {
                b = true;
            }
            return b;
        }
        
        public abstract int c(final int p0, final byte[] p1, final int p2, final int p3);
    }
    
    public static final class b extends a
    {
        public static int d(final byte[] array, int n, final int n2) {
            while (n < n2 && array[n] >= 0) {
                ++n;
            }
            if (n >= n2) {
                return 0;
            }
            return e(array, n, n2);
        }
        
        public static int e(final byte[] array, int n, final int n2) {
            while (true) {
                final int n3 = n;
                if (n3 >= n2) {
                    return 0;
                }
                final int n4 = n3 + 1;
                n = array[n3];
                if (n < 0) {
                    if (n < -32) {
                        if (n4 >= n2) {
                            return n;
                        }
                        if (n < -62) {
                            break;
                        }
                        n = n3 + 2;
                        if (array[n4] > -65) {
                            break;
                        }
                        continue;
                    }
                    else if (n < -16) {
                        if (n4 >= n2 - 1) {
                            return k(array, n4, n2);
                        }
                        final byte b = array[n4];
                        if (b > -65 || (n == -32 && b < -96) || (n == -19 && b >= -96)) {
                            return -1;
                        }
                        n = n3 + 3;
                        if (array[n3 + 2] > -65) {
                            return -1;
                        }
                        continue;
                    }
                    else {
                        if (n4 >= n2 - 2) {
                            return k(array, n4, n2);
                        }
                        final byte b2 = array[n4];
                        if (b2 > -65 || (n << 28) + (b2 + 112) >> 30 != 0 || array[n3 + 2] > -65) {
                            return -1;
                        }
                        n = n3 + 4;
                        if (array[n3 + 3] > -65) {
                            return -1;
                        }
                        continue;
                    }
                }
                else {
                    n = n4;
                }
            }
            return -1;
        }
        
        @Override
        public int a(final CharSequence charSequence, final byte[] array, int i, int j) {
            final int length = charSequence.length();
            final int n = j + i;
            int n2;
            char char1;
            for (j = 0; j < length; ++j) {
                n2 = j + i;
                if (n2 >= n) {
                    break;
                }
                char1 = charSequence.charAt(j);
                if (char1 >= '\u0080') {
                    break;
                }
                array[n2] = (byte)char1;
            }
            if (j == length) {
                return i + length;
            }
            i += j;
            while (j < length) {
                final char char2 = charSequence.charAt(j);
                Label_0396: {
                    if (char2 < '\u0080' && i < n) {
                        array[i] = (byte)char2;
                        ++i;
                    }
                    else if (char2 < '\u0800' && i <= n - 2) {
                        array[i] = (byte)(char2 >>> 6 | 0x3C0);
                        final int n3 = i + 2;
                        array[i + 1] = (byte)((char2 & '?') | 0x80);
                        i = n3;
                    }
                    else if ((char2 < '\ud800' || '\udfff' < char2) && i <= n - 3) {
                        array[i] = (byte)(char2 >>> 12 | 0x1E0);
                        array[i + 1] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                        final int n4 = i + 3;
                        array[i + 2] = (byte)((char2 & '?') | 0x80);
                        i = n4;
                    }
                    else {
                        if (i <= n - 4) {
                            final int n5 = j + 1;
                            if (n5 != charSequence.length()) {
                                final char char3 = charSequence.charAt(n5);
                                if (Character.isSurrogatePair(char2, char3)) {
                                    j = Character.toCodePoint(char2, char3);
                                    array[i] = (byte)(j >>> 18 | 0xF0);
                                    array[i + 1] = (byte)((j >>> 12 & 0x3F) | 0x80);
                                    array[i + 2] = (byte)((j >>> 6 & 0x3F) | 0x80);
                                    final int n6 = i + 4;
                                    array[i + 3] = (byte)((j & 0x3F) | 0x80);
                                    j = n5;
                                    i = n6;
                                    break Label_0396;
                                }
                                j = n5;
                            }
                            throw new c(j - 1, length);
                        }
                        if ('\ud800' <= char2 && char2 <= '\udfff') {
                            final int n7 = j + 1;
                            if (n7 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n7))) {
                                throw new c(j, length);
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed writing ");
                        sb.append(char2);
                        sb.append(" at index ");
                        sb.append(i);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                }
                ++j;
            }
            return i;
        }
        
        @Override
        public int c(int n, final byte[] array, int n2, final int n3) {
            int n4 = n2;
            if (n != 0) {
                if (n2 >= n3) {
                    return n;
                }
                final byte b = (byte)n;
                Label_0047: {
                    if (b < -32) {
                        if (b < -62) {
                            return -1;
                        }
                        n = n2 + 1;
                        if (array[n2] > -65) {
                            return -1;
                        }
                    }
                    else {
                        if (b < -16) {
                            final byte b2 = (byte)(n = (byte)(n >> 8));
                            int n5 = n2;
                            if (b2 == 0) {
                                n5 = n2 + 1;
                                n = array[n2];
                                if (n5 >= n3) {
                                    return i(b, n);
                                }
                            }
                            if (n <= -65 && (b != -32 || n >= -96) && (b != -19 || n < -96)) {
                                n = n5 + 1;
                                if (array[n5] <= -65) {
                                    break Label_0047;
                                }
                            }
                            return -1;
                        }
                        byte b3 = (byte)(n >> 8);
                        if (b3 == 0) {
                            n = n2 + 1;
                            b3 = array[n2];
                            if (n >= n3) {
                                return i(b, b3);
                            }
                            n2 = 0;
                        }
                        else {
                            final int n6 = (byte)(n >> 16);
                            n = n2;
                            n2 = n6;
                        }
                        int n7 = n;
                        int n8 = n2;
                        if (n2 == 0) {
                            n7 = n + 1;
                            n8 = array[n];
                            if (n7 >= n3) {
                                return j(b, b3, n8);
                            }
                        }
                        if (b3 <= -65 && (b << 28) + (b3 + 112) >> 30 == 0 && n8 <= -65) {
                            n4 = n7 + 1;
                            if (array[n7] <= -65) {
                                return d(array, n4, n3);
                            }
                        }
                        return -1;
                    }
                }
                n4 = n;
            }
            return d(array, n4, n3);
        }
    }
    
    public static class c extends IllegalArgumentException
    {
        public c(final int i, final int j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unpaired surrogate at index ");
            sb.append(i);
            sb.append(" of ");
            sb.append(j);
            super(sb.toString());
        }
    }
    
    public static final class d extends a
    {
        public static boolean d() {
            return k0.E() && k0.F();
        }
        
        public static int e(final byte[] array, long n, int u) {
            final int f = f(array, n, u);
            u -= f;
            n += f;
            while (true) {
                final int n2 = 0;
                int n3 = u;
                u = n2;
                long n4;
                while (true) {
                    n4 = n;
                    if (n3 <= 0) {
                        break;
                    }
                    n4 = n + 1L;
                    u = k0.u(array, n);
                    if (u < 0) {
                        break;
                    }
                    --n3;
                    n = n4;
                }
                if (n3 == 0) {
                    return 0;
                }
                final int n5 = n3 - 1;
                if (u < -32) {
                    if (n5 == 0) {
                        return u;
                    }
                    final int n6 = n3 - 2;
                    if (u < -62) {
                        return -1;
                    }
                    if (k0.u(array, n4) > -65) {
                        return -1;
                    }
                    n = 1L + n4;
                    u = n6;
                }
                else if (u < -16) {
                    if (n5 < 2) {
                        return g(array, u, n4, n5);
                    }
                    final int n7 = n3 - 3;
                    final byte u2 = k0.u(array, n4);
                    if (u2 > -65 || (u == -32 && u2 < -96) || (u == -19 && u2 >= -96)) {
                        break;
                    }
                    n = n4 + 2L;
                    u = n7;
                    if (k0.u(array, 1L + n4) > -65) {
                        break;
                    }
                    continue;
                }
                else {
                    if (n5 < 3) {
                        return g(array, u, n4, n5);
                    }
                    final int n8 = n3 - 4;
                    final byte u3 = k0.u(array, n4);
                    if (u3 > -65 || (u << 28) + (u3 + 112) >> 30 != 0 || k0.u(array, 1L + n4) > -65) {
                        return -1;
                    }
                    n = n4 + 3L;
                    u = n8;
                    if (k0.u(array, 2L + n4) > -65) {
                        return -1;
                    }
                    continue;
                }
            }
            return -1;
        }
        
        public static int f(final byte[] array, long n, final int n2) {
            int n3 = 0;
            if (n2 < 16) {
                return 0;
            }
            final int n4 = (int)n;
            long n5 = n;
            int n6;
            while (true) {
                n6 = n3;
                n = n5;
                if (n3 >= 8 - (n4 & 0x7)) {
                    break;
                }
                if (k0.u(array, n5) < 0) {
                    return n3;
                }
                ++n3;
                ++n5;
            }
            int i;
            long n8;
            while (true) {
                final int n7 = n6 + 8;
                i = n6;
                n8 = n;
                if (n7 > n2) {
                    break;
                }
                if ((k0.A(array, k0.h + n) & 0x8080808080808080L) != 0x0L) {
                    i = n6;
                    n8 = n;
                    break;
                }
                n += 8L;
                n6 = n7;
            }
            while (i < n2) {
                if (k0.u(array, n8) < 0) {
                    return i;
                }
                ++i;
                ++n8;
            }
            return n2;
        }
        
        public static int g(final byte[] array, final int n, final long n2, final int n3) {
            if (n3 == 0) {
                return h(n);
            }
            if (n3 == 1) {
                return i(n, k0.u(array, n2));
            }
            if (n3 == 2) {
                return j(n, k0.u(array, n2), k0.u(array, n2 + 1L));
            }
            throw new AssertionError();
        }
        
        @Override
        public int a(final CharSequence charSequence, final byte[] array, int i, int n) {
            long n2 = i;
            final long n3 = n + n2;
            final int length = charSequence.length();
            final String str = " at index ";
            final String str2 = "Failed writing ";
            if (length > n || array.length - n < i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed writing ");
                sb.append(charSequence.charAt(length - 1));
                sb.append(" at index ");
                sb.append(i + n);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            n = 0;
            long n4;
            while (true) {
                n4 = 1L;
                if (n >= length) {
                    break;
                }
                i = charSequence.charAt(n);
                if (i >= 128) {
                    break;
                }
                k0.K(array, n2, (byte)i);
                ++n;
                ++n2;
            }
            i = n;
            long lng = n2;
            if (n == length) {
                return (int)n2;
            }
            while (i < length) {
                final char char1 = charSequence.charAt(i);
                long n6 = 0L;
                Label_0477: {
                    if (char1 < '\u0080' && lng < n3) {
                        k0.K(array, lng, (byte)char1);
                        final long n5 = n4;
                        n6 = lng + n4;
                        n4 = n5;
                    }
                    else {
                        if (char1 < '\u0800' && lng <= n3 - 2L) {
                            k0.K(array, lng, (byte)(char1 >>> 6 | 0x3C0));
                            n6 = lng + 2L;
                            k0.K(array, lng + n4, (byte)((char1 & '?') | 0x80));
                        }
                        else if ((char1 < '\ud800' || '\udfff' < char1) && lng <= n3 - 3L) {
                            k0.K(array, lng, (byte)(char1 >>> 12 | 0x1E0));
                            k0.K(array, lng + 1L, (byte)((char1 >>> 6 & 0x3F) | 0x80));
                            n6 = lng + 3L;
                            k0.K(array, lng + 2L, (byte)((char1 & '?') | 0x80));
                        }
                        else {
                            if (lng <= n3 - 4L) {
                                n = i + 1;
                                if (n != length) {
                                    final char char2 = charSequence.charAt(n);
                                    if (Character.isSurrogatePair(char1, char2)) {
                                        i = Character.toCodePoint(char1, char2);
                                        n4 = 1L;
                                        k0.K(array, lng, (byte)(i >>> 18 | 0xF0));
                                        k0.K(array, lng + 1L, (byte)((i >>> 12 & 0x3F) | 0x80));
                                        k0.K(array, lng + 2L, (byte)((i >>> 6 & 0x3F) | 0x80));
                                        n6 = lng + 4L;
                                        k0.K(array, lng + 3L, (byte)((i & 0x3F) | 0x80));
                                        i = n;
                                        break Label_0477;
                                    }
                                    i = n;
                                }
                                throw new c(i - 1, length);
                            }
                            if ('\ud800' <= char1 && char1 <= '\udfff') {
                                n = i + 1;
                                if (n == length || !Character.isSurrogatePair(char1, charSequence.charAt(n))) {
                                    throw new c(i, length);
                                }
                            }
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(char1);
                            sb2.append(str);
                            sb2.append(lng);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        n4 = 1L;
                    }
                }
                ++i;
                lng = n6;
            }
            return (int)lng;
        }
        
        @Override
        public int c(int u, final byte[] array, int u2, int u3) {
            final int n = 0;
            if ((u2 | u3 | array.length - u3) >= 0) {
                long n2 = u2;
                final long n3 = u3;
                long n4 = n2;
                if (u != 0) {
                    if (n2 >= n3) {
                        return u;
                    }
                    final byte b = (byte)u;
                    if (b < -32) {
                        if (b < -62) {
                            return -1;
                        }
                        if (k0.u(array, n2) > -65) {
                            return -1;
                        }
                        n4 = 1L + n2;
                    }
                    else {
                        long n7 = 0L;
                        Label_0187: {
                            if (b >= -16) {
                                u2 = (byte)(u >> 8);
                                if (u2 == 0) {
                                    final long n5 = n2 + 1L;
                                    u2 = k0.u(array, n2);
                                    if (n5 >= n3) {
                                        return i(b, u2);
                                    }
                                    n2 = n5;
                                    u = n;
                                }
                                else {
                                    u = (byte)(u >> 16);
                                }
                                u3 = u;
                                long n6 = n2;
                                if (u == 0) {
                                    n6 = n2 + 1L;
                                    u3 = k0.u(array, n2);
                                    if (n6 >= n3) {
                                        return j(b, u2, u3);
                                    }
                                }
                                if (u2 <= -65 && (b << 28) + (u2 + 112) >> 30 == 0 && u3 <= -65) {
                                    n7 = n6 + 1L;
                                    if (k0.u(array, n6) <= -65) {
                                        break Label_0187;
                                    }
                                }
                                return -1;
                            }
                            u2 = (byte)(u >> 8);
                            long n8 = n2;
                            if ((u = u2) == 0) {
                                n8 = n2 + 1L;
                                u = k0.u(array, n2);
                                if (n8 >= n3) {
                                    return i(b, u);
                                }
                            }
                            if (u > -65 || (b == -32 && u < -96) || (b == -19 && u >= -96)) {
                                return -1;
                            }
                            n7 = n8 + 1L;
                            if (k0.u(array, n8) > -65) {
                                return -1;
                            }
                        }
                        n4 = n7;
                    }
                }
                return e(array, n4, (int)(n3 - n4));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", array.length, u2, u3));
        }
    }
}
