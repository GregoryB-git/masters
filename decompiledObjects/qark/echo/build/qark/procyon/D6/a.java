// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.io.Flushable;
import java.io.Closeable;

public final class a implements b, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel
{
    public static final byte[] q;
    public d o;
    public long p;
    
    static {
        q = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    }
    
    public a B(final byte[] array) {
        if (array != null) {
            return this.C(array, 0, array.length);
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public a C(final byte[] array, int i, int n) {
        if (array != null) {
            final long n2 = array.length;
            final long n3 = i;
            final long n4 = n;
            g.b(n2, n3, n4);
            d x;
            int min;
            for (n += i; i < n; i += min, x.c += min) {
                x = this.x(1);
                min = Math.min(n - i, 8192 - x.c);
                System.arraycopy(array, i, x.a, x.c, min);
            }
            this.p += n4;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public a D(final int n) {
        final d x = this.x(1);
        x.a[x.c++] = (byte)n;
        ++this.p;
        return this;
    }
    
    public a E(long i) {
        if (i == 0L) {
            return this.D(48);
        }
        final int n = Long.numberOfTrailingZeros(Long.highestOneBit(i)) / 4 + 1;
        final d x = this.x(n);
        final byte[] a = x.a;
        for (int c = x.c, j = c + n - 1; j >= c; --j) {
            a[j] = D6.a.q[(int)(0xFL & i)];
            i >>>= 4;
        }
        x.c += n;
        this.p += n;
        return this;
    }
    
    public a F(final String s, final int beginIndex, final int endIndex, final Charset charset) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (beginIndex < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(beginIndex);
            throw new IllegalAccessError(sb.toString());
        }
        if (endIndex < beginIndex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(endIndex);
            sb2.append(" < ");
            sb2.append(beginIndex);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (endIndex > s.length()) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(endIndex);
            sb3.append(" > ");
            sb3.append(s.length());
            throw new IllegalArgumentException(sb3.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(g.a)) {
            return this.H(s, beginIndex, endIndex);
        }
        final byte[] bytes = s.substring(beginIndex, endIndex).getBytes(charset);
        return this.C(bytes, 0, bytes.length);
    }
    
    public a G(final String s) {
        return this.H(s, 0, s.length());
    }
    
    public a H(final String s, int i, final int j) {
        if (s == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (j < i) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(j);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (j <= s.length()) {
            while (i < j) {
                final char char1 = s.charAt(i);
                if (char1 < '\u0080') {
                    final d x = this.x(1);
                    final byte[] a = x.a;
                    final int n = x.c - i;
                    final int min = Math.min(j, 8192 - n);
                    final int n2 = i + 1;
                    a[i + n] = (byte)char1;
                    char char2;
                    for (i = n2; i < min; ++i) {
                        char2 = s.charAt(i);
                        if (char2 >= '\u0080') {
                            break;
                        }
                        a[i + n] = (byte)char2;
                    }
                    final int c = x.c;
                    final int n3 = n + i - c;
                    x.c = c + n3;
                    this.p += n3;
                }
                else {
                    int n4;
                    if (char1 < '\u0800') {
                        n4 = (char1 >> 6 | 0xC0);
                    }
                    else if (char1 >= '\ud800' && char1 <= '\udfff') {
                        final int index = i + 1;
                        char char3;
                        if (index < j) {
                            char3 = s.charAt(index);
                        }
                        else {
                            char3 = '\0';
                        }
                        if (char1 <= '\udbff' && char3 >= '\udc00' && char3 <= '\udfff') {
                            final int n5 = ((char1 & 0xFFFF27FF) << 10 | (0xFFFF23FF & char3)) + 65536;
                            this.D(n5 >> 18 | 0xF0);
                            this.D((n5 >> 12 & 0x3F) | 0x80);
                            this.D((n5 >> 6 & 0x3F) | 0x80);
                            this.D((n5 & 0x3F) | 0x80);
                            i += 2;
                            continue;
                        }
                        this.D(63);
                        i = index;
                        continue;
                    }
                    else {
                        this.D(char1 >> 12 | 0xE0);
                        n4 = ((char1 >> 6 & 0x3F) | 0x80);
                    }
                    this.D(n4);
                    this.D((char1 & '?') | 0x80);
                    ++i;
                }
            }
            return this;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("endIndex > string.length: ");
        sb3.append(j);
        sb3.append(" > ");
        sb3.append(s.length());
        throw new IllegalArgumentException(sb3.toString());
    }
    
    public a I(int i) {
        if (i >= 128) {
            int n;
            if (i < 2048) {
                n = (i >> 6 | 0xC0);
            }
            else {
                int n2;
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        this.D(63);
                        return this;
                    }
                    n2 = (i >> 12 | 0xE0);
                }
                else {
                    if (i > 1114111) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected code point: ");
                        sb.append(Integer.toHexString(i));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.D(i >> 18 | 0xF0);
                    n2 = ((i >> 12 & 0x3F) | 0x80);
                }
                this.D(n2);
                n = ((i >> 6 & 0x3F) | 0x80);
            }
            this.D(n);
            i = ((i & 0x3F) | 0x80);
        }
        this.D(i);
        return this;
    }
    
    public a a() {
        final a a = new a();
        if (this.p == 0L) {
            return a;
        }
        final d c = this.o.c();
        a.o = c;
        c.g = c;
        c.f = c;
        d d = this.o;
        while (true) {
            d = d.f;
            if (d == this.o) {
                break;
            }
            a.o.g.b(d.c());
        }
        a.p = this.p;
        return a;
    }
    
    public boolean b() {
        return this.p == 0L;
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        final long p = this.p;
        if (p != a.p) {
            return false;
        }
        long n = 0L;
        if (p == 0L) {
            return true;
        }
        d o2 = this.o;
        d o3 = a.o;
        int b = o2.b;
        int b2 = o3.b;
        while (n < this.p) {
            final long n2 = Math.min(o2.c - b, o3.c - b2);
            for (int n3 = 0; n3 < n2; ++n3, ++b, ++b2) {
                if (o2.a[b] != o3.a[b2]) {
                    return false;
                }
            }
            d f = o2;
            int b3;
            if ((b3 = b) == o2.c) {
                f = o2.f;
                b3 = f.b;
            }
            int b4 = b2;
            d f2 = o3;
            if (b2 == o3.c) {
                f2 = o3.f;
                b4 = f2.b;
            }
            n += n2;
            o2 = f;
            b = b3;
            b2 = b4;
            o3 = f2;
        }
        return true;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public int hashCode() {
        d d = this.o;
        if (d == null) {
            return 0;
        }
        int n = 1;
        d d2;
        int n2;
        do {
            int i = d.b;
            final int c = d.c;
            n2 = n;
            while (i < c) {
                n2 = n2 * 31 + d.a[i];
                ++i;
            }
            d2 = (d = d.f);
            n = n2;
        } while (d2 != this.o);
        return n2;
    }
    
    @Override
    public boolean isOpen() {
        return true;
    }
    
    public byte l() {
        final long p = this.p;
        if (p == 0L) {
            throw new IllegalStateException("size == 0");
        }
        final d o = this.o;
        final int b = o.b;
        final int c = o.c;
        final byte[] a = o.a;
        final int b2 = b + 1;
        final byte b3 = a[b];
        this.p = p - 1L;
        if (b2 == c) {
            this.o = o.a();
            e.a(o);
            return b3;
        }
        o.b = b2;
        return b3;
    }
    
    public byte[] n(final long lng) {
        g.b(this.p, 0L, lng);
        if (lng <= 2147483647L) {
            final byte[] array = new byte[(int)lng];
            this.s(array);
            return array;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(lng);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public int read(final ByteBuffer byteBuffer) {
        final d o = this.o;
        if (o == null) {
            return -1;
        }
        final int min = Math.min(byteBuffer.remaining(), o.c - o.b);
        byteBuffer.put(o.a, o.b, min);
        final int b = o.b + min;
        o.b = b;
        this.p -= min;
        if (b == o.c) {
            this.o = o.a();
            e.a(o);
        }
        return min;
    }
    
    public int read(final byte[] array, int b, int min) {
        g.b(array.length, b, min);
        final d o = this.o;
        if (o == null) {
            return -1;
        }
        min = Math.min(min, o.c - o.b);
        System.arraycopy(o.a, o.b, array, b, min);
        b = o.b + min;
        o.b = b;
        this.p -= min;
        if (b == o.c) {
            this.o = o.a();
            e.a(o);
        }
        return min;
    }
    
    public void s(final byte[] array) {
        int read;
        for (int i = 0; i < array.length; i += read) {
            read = this.read(array, i, array.length - i);
            if (read == -1) {
                throw new EOFException();
            }
        }
    }
    
    public String t(final long lng, final Charset charset) {
        g.b(this.p, 0L, lng);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (lng > 2147483647L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString());
        }
        if (lng == 0L) {
            return "";
        }
        final d o = this.o;
        final int b = o.b;
        if (b + lng > o.c) {
            return new String(this.n(lng), charset);
        }
        final String s = new String(o.a, b, (int)lng, charset);
        final int b2 = (int)(o.b + lng);
        o.b = b2;
        this.p -= lng;
        if (b2 == o.c) {
            this.o = o.a();
            e.a(o);
        }
        return s;
    }
    
    @Override
    public String toString() {
        return this.v().toString();
    }
    
    public String u() {
        try {
            return this.t(this.p, g.a);
        }
        catch (EOFException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public final c v() {
        final long p = this.p;
        if (p <= 2147483647L) {
            return this.w((int)p);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.p);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final c w(final int n) {
        if (n == 0) {
            return c.s;
        }
        return new f(this, n);
    }
    
    @Override
    public int write(final ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int i;
            int n;
            d x;
            int min;
            for (n = (i = byteBuffer.remaining()); i > 0; i -= min, x.c += min) {
                x = this.x(1);
                min = Math.min(i, 8192 - x.c);
                byteBuffer.get(x.a, x.c, min);
            }
            this.p += n;
            return n;
        }
        throw new IllegalArgumentException("source == null");
    }
    
    public d x(final int n) {
        if (n < 1 || n > 8192) {
            throw new IllegalArgumentException();
        }
        final d o = this.o;
        if (o == null) {
            final d b = e.b();
            this.o = b;
            b.g = b;
            return b.f = b;
        }
        final d g = o.g;
        if (g.c + n <= 8192) {
            final d b2 = g;
            if (g.e) {
                return b2;
            }
        }
        return g.b(e.b());
    }
}
