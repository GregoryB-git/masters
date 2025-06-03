// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public abstract class q0
{
    public static final b a;
    
    static {
        b a2;
        if (e.e() && !androidx.datastore.preferences.protobuf.d.c()) {
            a2 = new e();
        }
        else {
            a2 = new c();
        }
        a = a2;
    }
    
    public static String e(final byte[] array, final int n, final int n2) {
        return q0.a.a(array, n, n2);
    }
    
    public static int f(final CharSequence charSequence, final byte[] array, final int n, final int n2) {
        return q0.a.b(charSequence, array, n, n2);
    }
    
    public static int g(final CharSequence charSequence) {
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
                n3 = n2 + h(charSequence, n);
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
    
    public static int h(final CharSequence seq, int i) {
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
                            throw new d(i, length);
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
    
    public static int i(final int n) {
        int n2 = n;
        if (n > -12) {
            n2 = -1;
        }
        return n2;
    }
    
    public static int j(final int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            return n ^ n2 << 8;
        }
        return -1;
    }
    
    public static int k(final int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            return n ^ n2 << 8 ^ n3 << 16;
        }
        return -1;
    }
    
    public static int l(final byte[] array, final int n, int n2) {
        final byte b = array[n - 1];
        n2 -= n;
        if (n2 == 0) {
            return i(b);
        }
        if (n2 == 1) {
            return j(b, array[n]);
        }
        if (n2 == 2) {
            return k(b, array[n], array[n + 1]);
        }
        throw new AssertionError();
    }
    
    public static boolean m(final byte[] array) {
        return q0.a.c(array, 0, array.length);
    }
    
    public static boolean n(final byte[] array, final int n, final int n2) {
        return q0.a.c(array, n, n2);
    }
    
    public abstract static class a
    {
        public static void h(final byte b, final byte b2, final byte b3, final byte b4, final char[] array, final int n) {
            if (!m(b2) && (b << 28) + (b2 + 112) >> 30 == 0 && !m(b3) && !m(b4)) {
                final int n2 = (b & 0x7) << 18 | r(b2) << 12 | r(b3) << 6 | r(b4);
                array[n] = l(n2);
                array[n + 1] = q(n2);
                return;
            }
            throw z.c();
        }
        
        public static void i(final byte b, final char[] array, final int n) {
            array[n] = (char)b;
        }
        
        public static void j(final byte b, final byte b2, final byte b3, final char[] array, final int n) {
            if (!m(b2) && (b != -32 || b2 >= -96) && (b != -19 || b2 < -96) && !m(b3)) {
                array[n] = (char)((b & 0xF) << 12 | r(b2) << 6 | r(b3));
                return;
            }
            throw z.c();
        }
        
        public static void k(final byte b, final byte b2, final char[] array, final int n) {
            if (b >= -62 && !m(b2)) {
                array[n] = (char)((b & 0x1F) << 6 | r(b2));
                return;
            }
            throw z.c();
        }
        
        public static char l(final int n) {
            return (char)((n >>> 10) + 55232);
        }
        
        public static boolean m(final byte b) {
            return b > -65;
        }
        
        public static boolean n(final byte b) {
            return b >= 0;
        }
        
        public static boolean o(final byte b) {
            return b < -16;
        }
        
        public static boolean p(final byte b) {
            return b < -32;
        }
        
        public static char q(final int n) {
            return (char)((n & 0x3FF) + 56320);
        }
        
        public static int r(final byte b) {
            return b & 0x3F;
        }
    }
    
    public abstract static class b
    {
        public abstract String a(final byte[] p0, final int p1, final int p2);
        
        public abstract int b(final CharSequence p0, final byte[] p1, final int p2, final int p3);
        
        public final boolean c(final byte[] array, final int n, final int n2) {
            boolean b = false;
            if (this.d(0, array, n, n2) == 0) {
                b = true;
            }
            return b;
        }
        
        public abstract int d(final int p0, final byte[] p1, final int p2, final int p3);
    }
    
    public static final class c extends b
    {
        public static int e(final byte[] array, int n, final int n2) {
            while (n < n2 && array[n] >= 0) {
                ++n;
            }
            if (n >= n2) {
                return 0;
            }
            return f(array, n, n2);
        }
        
        public static int f(final byte[] array, int n, final int n2) {
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
                            return l(array, n4, n2);
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
                            return l(array, n4, n2);
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
        public String a(final byte[] array, int i, int n) {
            if ((i | n | array.length - i - n) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", array.length, i, n));
            }
            final int n2 = i + n;
            final char[] value = new char[n];
            n = 0;
            while (i < n2) {
                final byte b = array[i];
                if (!n(b)) {
                    break;
                }
                ++i;
                i(b, value, n);
                ++n;
            }
            while (true) {
                final int n3 = i;
                if (n3 >= n2) {
                    return new String(value, 0, n);
                }
                i = n3 + 1;
                final byte b2 = array[n3];
                if (n(b2)) {
                    final int n4 = n + 1;
                    i(b2, value, n);
                    n = n4;
                    while (i < n2) {
                        final byte b3 = array[i];
                        if (!n(b3)) {
                            break;
                        }
                        ++i;
                        i(b3, value, n);
                        ++n;
                    }
                }
                else if (p(b2)) {
                    if (i >= n2) {
                        throw z.c();
                    }
                    final int n5 = n3 + 2;
                    k(b2, array[i], value, n);
                    ++n;
                    i = n5;
                }
                else if (o(b2)) {
                    if (i >= n2 - 1) {
                        throw z.c();
                    }
                    final byte b4 = array[i];
                    i = n3 + 3;
                    j(b2, b4, array[n3 + 2], value, n);
                    ++n;
                }
                else {
                    if (i >= n2 - 2) {
                        throw z.c();
                    }
                    final byte b5 = array[i];
                    final byte b6 = array[n3 + 2];
                    i = n3 + 4;
                    h(b2, b5, b6, array[n3 + 3], value, n);
                    n += 2;
                }
            }
        }
        
        @Override
        public int b(final CharSequence charSequence, final byte[] array, int i, int j) {
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
                            throw new d(j - 1, length);
                        }
                        if ('\ud800' <= char2 && char2 <= '\udfff') {
                            final int n7 = j + 1;
                            if (n7 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n7))) {
                                throw new d(j, length);
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
        public int d(int n, final byte[] array, int n2, final int n3) {
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
                                    return j(b, n);
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
                                return j(b, b3);
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
                                return k(b, b3, n8);
                            }
                        }
                        if (b3 <= -65 && (b << 28) + (b3 + 112) >> 30 == 0 && n8 <= -65) {
                            n4 = n7 + 1;
                            if (array[n7] <= -65) {
                                return e(array, n4, n3);
                            }
                        }
                        return -1;
                    }
                }
                n4 = n;
            }
            return e(array, n4, n3);
        }
    }
    
    public static class d extends IllegalArgumentException
    {
        public d(final int i, final int j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unpaired surrogate at index ");
            sb.append(i);
            sb.append(" of ");
            sb.append(j);
            super(sb.toString());
        }
    }
    
    public static final class e extends b
    {
        public static boolean e() {
            return p0.C() && p0.D();
        }
        
        public static int f(final byte[] array, long n, int s) {
            final int g = g(array, n, s);
            s -= g;
            n += g;
            while (true) {
                final int n2 = 0;
                int n3 = s;
                s = n2;
                long n4;
                while (true) {
                    n4 = n;
                    if (n3 <= 0) {
                        break;
                    }
                    n4 = n + 1L;
                    s = p0.s(array, n);
                    if (s < 0) {
                        break;
                    }
                    --n3;
                    n = n4;
                }
                if (n3 == 0) {
                    return 0;
                }
                final int n5 = n3 - 1;
                if (s < -32) {
                    if (n5 == 0) {
                        return s;
                    }
                    final int n6 = n3 - 2;
                    if (s < -62) {
                        return -1;
                    }
                    if (p0.s(array, n4) > -65) {
                        return -1;
                    }
                    n = 1L + n4;
                    s = n6;
                }
                else if (s < -16) {
                    if (n5 < 2) {
                        return h(array, s, n4, n5);
                    }
                    final int n7 = n3 - 3;
                    final byte s2 = p0.s(array, n4);
                    if (s2 > -65 || (s == -32 && s2 < -96) || (s == -19 && s2 >= -96)) {
                        break;
                    }
                    n = n4 + 2L;
                    s = n7;
                    if (p0.s(array, 1L + n4) > -65) {
                        break;
                    }
                    continue;
                }
                else {
                    if (n5 < 3) {
                        return h(array, s, n4, n5);
                    }
                    final int n8 = n3 - 4;
                    final byte s3 = p0.s(array, n4);
                    if (s3 > -65 || (s << 28) + (s3 + 112) >> 30 != 0 || p0.s(array, 1L + n4) > -65) {
                        return -1;
                    }
                    n = n4 + 3L;
                    s = n8;
                    if (p0.s(array, 2L + n4) > -65) {
                        return -1;
                    }
                    continue;
                }
            }
            return -1;
        }
        
        public static int g(final byte[] array, long n, final int n2) {
            int i = 0;
            if (n2 < 16) {
                return 0;
            }
            while (i < n2) {
                if (p0.s(array, n) < 0) {
                    return i;
                }
                ++i;
                ++n;
            }
            return n2;
        }
        
        public static int h(final byte[] array, final int n, final long n2, final int n3) {
            if (n3 == 0) {
                return i(n);
            }
            if (n3 == 1) {
                return j(n, p0.s(array, n2));
            }
            if (n3 == 2) {
                return k(n, p0.s(array, n2), p0.s(array, n2 + 1L));
            }
            throw new AssertionError();
        }
        
        @Override
        public String a(final byte[] array, int i, int n) {
            if ((i | n | array.length - i - n) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", array.length, i, n));
            }
            final int n2 = i + n;
            final char[] value = new char[n];
            n = 0;
            while (i < n2) {
                final byte s = p0.s(array, i);
                if (!n(s)) {
                    break;
                }
                ++i;
                i(s, value, n);
                ++n;
            }
            while (true) {
                final int n3 = i;
                if (n3 >= n2) {
                    return new String(value, 0, n);
                }
                i = n3 + 1;
                final byte s2 = p0.s(array, n3);
                if (n(s2)) {
                    final int n4 = n + 1;
                    i(s2, value, n);
                    n = n4;
                    while (i < n2) {
                        final byte s3 = p0.s(array, i);
                        if (!n(s3)) {
                            break;
                        }
                        ++i;
                        i(s3, value, n);
                        ++n;
                    }
                }
                else if (p(s2)) {
                    if (i >= n2) {
                        throw z.c();
                    }
                    final int n5 = n3 + 2;
                    k(s2, p0.s(array, i), value, n);
                    ++n;
                    i = n5;
                }
                else if (o(s2)) {
                    if (i >= n2 - 1) {
                        throw z.c();
                    }
                    final byte s4 = p0.s(array, i);
                    i = n3 + 3;
                    j(s2, s4, p0.s(array, n3 + 2), value, n);
                    ++n;
                }
                else {
                    if (i >= n2 - 2) {
                        throw z.c();
                    }
                    final byte s5 = p0.s(array, i);
                    final byte s6 = p0.s(array, n3 + 2);
                    i = n3 + 4;
                    h(s2, s5, s6, p0.s(array, n3 + 3), value, n);
                    n += 2;
                }
            }
        }
        
        @Override
        public int b(final CharSequence charSequence, final byte[] array, int i, int n) {
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
                p0.H(array, n2, (byte)i);
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
                        p0.H(array, lng, (byte)char1);
                        final long n5 = n4;
                        n6 = lng + n4;
                        n4 = n5;
                    }
                    else {
                        if (char1 < '\u0800' && lng <= n3 - 2L) {
                            p0.H(array, lng, (byte)(char1 >>> 6 | 0x3C0));
                            n6 = lng + 2L;
                            p0.H(array, lng + n4, (byte)((char1 & '?') | 0x80));
                        }
                        else if ((char1 < '\ud800' || '\udfff' < char1) && lng <= n3 - 3L) {
                            p0.H(array, lng, (byte)(char1 >>> 12 | 0x1E0));
                            p0.H(array, lng + 1L, (byte)((char1 >>> 6 & 0x3F) | 0x80));
                            n6 = lng + 3L;
                            p0.H(array, lng + 2L, (byte)((char1 & '?') | 0x80));
                        }
                        else {
                            if (lng <= n3 - 4L) {
                                n = i + 1;
                                if (n != length) {
                                    final char char2 = charSequence.charAt(n);
                                    if (Character.isSurrogatePair(char1, char2)) {
                                        i = Character.toCodePoint(char1, char2);
                                        n4 = 1L;
                                        p0.H(array, lng, (byte)(i >>> 18 | 0xF0));
                                        p0.H(array, lng + 1L, (byte)((i >>> 12 & 0x3F) | 0x80));
                                        p0.H(array, lng + 2L, (byte)((i >>> 6 & 0x3F) | 0x80));
                                        n6 = lng + 4L;
                                        p0.H(array, lng + 3L, (byte)((i & 0x3F) | 0x80));
                                        i = n;
                                        break Label_0477;
                                    }
                                    i = n;
                                }
                                throw new d(i - 1, length);
                            }
                            if ('\ud800' <= char1 && char1 <= '\udfff') {
                                n = i + 1;
                                if (n == length || !Character.isSurrogatePair(char1, charSequence.charAt(n))) {
                                    throw new d(i, length);
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
        public int d(int s, final byte[] array, int s2, int s3) {
            final int n = 0;
            if ((s2 | s3 | array.length - s3) >= 0) {
                long n2 = s2;
                final long n3 = s3;
                long n4 = n2;
                if (s != 0) {
                    if (n2 >= n3) {
                        return s;
                    }
                    final byte b = (byte)s;
                    if (b < -32) {
                        if (b < -62) {
                            return -1;
                        }
                        if (p0.s(array, n2) > -65) {
                            return -1;
                        }
                        n4 = 1L + n2;
                    }
                    else {
                        long n7 = 0L;
                        Label_0187: {
                            if (b >= -16) {
                                s2 = (byte)(s >> 8);
                                if (s2 == 0) {
                                    final long n5 = n2 + 1L;
                                    s2 = p0.s(array, n2);
                                    if (n5 >= n3) {
                                        return j(b, s2);
                                    }
                                    n2 = n5;
                                    s = n;
                                }
                                else {
                                    s = (byte)(s >> 16);
                                }
                                s3 = s;
                                long n6 = n2;
                                if (s == 0) {
                                    n6 = n2 + 1L;
                                    s3 = p0.s(array, n2);
                                    if (n6 >= n3) {
                                        return k(b, s2, s3);
                                    }
                                }
                                if (s2 <= -65 && (b << 28) + (s2 + 112) >> 30 == 0 && s3 <= -65) {
                                    n7 = n6 + 1L;
                                    if (p0.s(array, n6) <= -65) {
                                        break Label_0187;
                                    }
                                }
                                return -1;
                            }
                            s2 = (byte)(s >> 8);
                            long n8 = n2;
                            if ((s = s2) == 0) {
                                n8 = n2 + 1L;
                                s = p0.s(array, n2);
                                if (n8 >= n3) {
                                    return j(b, s);
                                }
                            }
                            if (s > -65 || (b == -32 && s < -96) || (b == -19 && s >= -96)) {
                                return -1;
                            }
                            n7 = n8 + 1L;
                            if (p0.s(array, n8) > -65) {
                                return -1;
                            }
                        }
                        n4 = n7;
                    }
                }
                return f(array, n4, (int)(n3 - n4));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", array.length, s2, s3));
        }
    }
}
