// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import a3.b;
import a3.i;
import java.util.Arrays;
import java.nio.charset.Charset;
import W2.e;
import X2.y;

public final class z
{
    public static final char[] d;
    public static final char[] e;
    public static final y f;
    public byte[] a;
    public int b;
    public int c;
    
    static {
        d = new char[] { '\r', '\n' };
        e = new char[] { '\n' };
        f = y.b0(W2.e.a, W2.e.c, W2.e.f, W2.e.d, W2.e.e);
    }
    
    public z() {
        this.a = M.f;
    }
    
    public z(final int c) {
        this.a = new byte[c];
        this.c = c;
    }
    
    public z(final byte[] a) {
        this.a = a;
        this.c = a.length;
    }
    
    public z(final byte[] a, final int c) {
        this.a = a;
        this.c = c;
    }
    
    public String A() {
        return this.n('\0');
    }
    
    public String B(final int n) {
        if (n == 0) {
            return "";
        }
        final int b = this.b;
        final int n2 = b + n - 1;
        int n3;
        if (n2 < this.c && this.a[n2] == 0) {
            n3 = n - 1;
        }
        else {
            n3 = n;
        }
        final String i = M.I(this.a, b, n3);
        this.b += n;
        return i;
    }
    
    public short C() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        this.b = b + 2;
        return (short)((a[b + 1] & 0xFF) | (b2 & 0xFF) << 8);
    }
    
    public String D(final int n) {
        return this.E(n, W2.e.c);
    }
    
    public String E(final int length, final Charset charset) {
        final String s = new String(this.a, this.b, length, charset);
        this.b += length;
        return s;
    }
    
    public int F() {
        return this.G() << 21 | this.G() << 14 | this.G() << 7 | this.G();
    }
    
    public int G() {
        return this.a[this.b++] & 0xFF;
    }
    
    public int H() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        final byte b3 = a[b + 1];
        this.b = b + 4;
        return (b3 & 0xFF) | (b2 & 0xFF) << 8;
    }
    
    public long I() {
        final byte[] a = this.a;
        final int b = this.b;
        final long n = a[b];
        final long n2 = a[b + 1];
        final long n3 = a[b + 2];
        this.b = b + 4;
        return ((long)a[b + 3] & 0xFFL) | ((n & 0xFFL) << 24 | (n2 & 0xFFL) << 16 | (n3 & 0xFFL) << 8);
    }
    
    public int J() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        final byte b3 = a[b + 1];
        this.b = b + 3;
        return (a[b + 2] & 0xFF) | ((b3 & 0xFF) << 8 | (b2 & 0xFF) << 16);
    }
    
    public int K() {
        final int p = this.p();
        if (p >= 0) {
            return p;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(p);
        throw new IllegalStateException(sb.toString());
    }
    
    public long L() {
        final long z = this.z();
        if (z >= 0L) {
            return z;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(z);
        throw new IllegalStateException(sb.toString());
    }
    
    public int M() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        this.b = b + 2;
        return (a[b + 1] & 0xFF) | (b2 & 0xFF) << 8;
    }
    
    public long N() {
        long n = this.a[this.b];
        int n2 = 7;
        int i = 0;
        int n4 = 0;
        Label_0078: {
            while (true) {
                i = 1;
                if (n2 < 0) {
                    break;
                }
                final int n3 = 1 << n2;
                if (((long)n3 & n) == 0x0L) {
                    if (n2 < 6) {
                        n &= n3 - 1;
                        n4 = 7 - n2;
                        break Label_0078;
                    }
                    if (n2 == 7) {
                        n4 = 1;
                        break Label_0078;
                    }
                    break;
                }
                else {
                    --n2;
                }
            }
            n4 = 0;
        }
        if (n4 != 0) {
            while (i < n4) {
                final byte b = this.a[this.b + i];
                if ((b & 0xC0) != 0x80) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(n);
                    throw new NumberFormatException(sb.toString());
                }
                n = (n << 6 | (long)(b & 0x3F));
                ++i;
            }
            this.b += n4;
            return n;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(n);
        throw new NumberFormatException(sb2.toString());
    }
    
    public Charset O() {
        if (this.a() >= 3) {
            final byte[] a = this.a;
            final int b = this.b;
            if (a[b] == -17 && a[b + 1] == -69 && a[b + 2] == -65) {
                this.b = b + 3;
                return W2.e.c;
            }
        }
        if (this.a() >= 2) {
            final byte[] a2 = this.a;
            final int b2 = this.b;
            final byte b3 = a2[b2];
            if (b3 == -2 && a2[b2 + 1] == -1) {
                this.b = b2 + 2;
                return W2.e.d;
            }
            if (b3 == -1 && a2[b2 + 1] == -2) {
                this.b = b2 + 2;
                return W2.e.e;
            }
        }
        return null;
    }
    
    public void P(final int n) {
        byte[] a;
        if (this.b() < n) {
            a = new byte[n];
        }
        else {
            a = this.a;
        }
        this.R(a, n);
    }
    
    public void Q(final byte[] array) {
        this.R(array, array.length);
    }
    
    public void R(final byte[] a, final int c) {
        this.a = a;
        this.c = c;
        this.b = 0;
    }
    
    public void S(final int c) {
        g0.a.a(c >= 0 && c <= this.a.length);
        this.c = c;
    }
    
    public void T(final int b) {
        g0.a.a(b >= 0 && b <= this.c);
        this.b = b;
    }
    
    public void U(final int n) {
        this.T(this.b + n);
    }
    
    public final void V(final Charset charset) {
        if (this.m(charset, z.d) == '\r') {
            this.m(charset, z.e);
        }
    }
    
    public int a() {
        return this.c - this.b;
    }
    
    public int b() {
        return this.a.length;
    }
    
    public void c(final int newLength) {
        if (newLength > this.b()) {
            this.a = Arrays.copyOf(this.a, newLength);
        }
    }
    
    public final int d(final Charset obj) {
        int n;
        if (!obj.equals(W2.e.c) && !obj.equals(W2.e.a)) {
            if (!obj.equals(W2.e.f) && !obj.equals(W2.e.e) && !obj.equals(W2.e.d)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported charset: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            n = 2;
        }
        else {
            n = 1;
        }
        int b = this.b;
        while (true) {
            final int c = this.c;
            if (b >= c - (n - 1)) {
                return c;
            }
            if ((obj.equals(W2.e.c) || obj.equals(W2.e.a)) && M.C0(this.a[b])) {
                return b;
            }
            if (obj.equals(W2.e.f) || obj.equals(W2.e.d)) {
                final byte[] a = this.a;
                if (a[b] == 0 && M.C0(a[b + 1])) {
                    return b;
                }
            }
            if (obj.equals(W2.e.e)) {
                final byte[] a2 = this.a;
                if (a2[b + 1] == 0 && M.C0(a2[b])) {
                    return b;
                }
            }
            b += n;
        }
    }
    
    public byte[] e() {
        return this.a;
    }
    
    public int f() {
        return this.b;
    }
    
    public int g() {
        return this.c;
    }
    
    public char h(final Charset obj) {
        final boolean contains = z.f.contains(obj);
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported charset: ");
        sb.append(obj);
        g0.a.b(contains, sb.toString());
        return (char)(this.i(obj) >> 16);
    }
    
    public final int i(final Charset charset) {
        final boolean equals = charset.equals(W2.e.c);
        int n = 1;
        byte b;
        if ((equals || charset.equals(W2.e.a)) && this.a() >= 1) {
            b = (byte)a3.b.a(i.b(this.a[this.b]));
        }
        else {
            char c;
            if ((charset.equals(W2.e.f) || charset.equals(W2.e.d)) && this.a() >= 2) {
                final byte[] a = this.a;
                final int b2 = this.b;
                c = a3.b.c(a[b2], a[b2 + 1]);
            }
            else {
                if (!charset.equals(W2.e.e) || this.a() < 2) {
                    return 0;
                }
                final byte[] a2 = this.a;
                final int b3 = this.b;
                c = a3.b.c(a2[b3 + 1], a2[b3]);
            }
            b = (byte)c;
            n = 2;
        }
        return (a3.b.a(b) << 16) + n;
    }
    
    public int j() {
        return this.a[this.b] & 0xFF;
    }
    
    public void k(final g0.y y, final int n) {
        this.l(y.a, 0, n);
        y.p(0);
    }
    
    public void l(final byte[] array, final int n, final int n2) {
        System.arraycopy(this.a, this.b, array, n, n2);
        this.b += n2;
    }
    
    public final char m(final Charset charset, final char[] array) {
        final int i = this.i(charset);
        if (i != 0) {
            final char c = (char)(i >> 16);
            if (a3.b.b(array, c)) {
                this.b += (i & 0xFFFF);
                return c;
            }
        }
        return '\0';
    }
    
    public String n(final char c) {
        if (this.a() == 0) {
            return null;
        }
        int b;
        for (b = this.b; b < this.c && this.a[b] != c; ++b) {}
        final byte[] a = this.a;
        final int b2 = this.b;
        final String i = M.I(a, b2, b - b2);
        if ((this.b = b) < this.c) {
            this.b = b + 1;
        }
        return i;
    }
    
    public double o() {
        return Double.longBitsToDouble(this.z());
    }
    
    public int p() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        final byte b3 = a[b + 1];
        final byte b4 = a[b + 2];
        this.b = b + 4;
        return (a[b + 3] & 0xFF) | ((b3 & 0xFF) << 16 | (b2 & 0xFF) << 24 | (b4 & 0xFF) << 8);
    }
    
    public int q() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        final byte b3 = a[b + 1];
        this.b = b + 3;
        return (a[b + 2] & 0xFF) | ((b3 & 0xFF) << 8 | (b2 & 0xFF) << 24 >> 8);
    }
    
    public String r() {
        return this.s(W2.e.c);
    }
    
    public String s(final Charset obj) {
        final boolean contains = z.f.contains(obj);
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported charset: ");
        sb.append(obj);
        g0.a.b(contains, sb.toString());
        if (this.a() == 0) {
            return null;
        }
        if (!obj.equals(W2.e.a)) {
            this.O();
        }
        final String e = this.E(this.d(obj) - this.b, obj);
        if (this.b == this.c) {
            return e;
        }
        this.V(obj);
        return e;
    }
    
    public int t() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        final byte b3 = a[b + 1];
        final byte b4 = a[b + 2];
        this.b = b + 4;
        return (a[b + 3] & 0xFF) << 24 | ((b3 & 0xFF) << 8 | (b2 & 0xFF) | (b4 & 0xFF) << 16);
    }
    
    public long u() {
        final byte[] a = this.a;
        final int b = this.b;
        final long n = a[b];
        final long n2 = a[b + 1];
        final long n3 = a[b + 2];
        final long n4 = a[b + 3];
        final long n5 = a[b + 4];
        final long n6 = a[b + 5];
        final long n7 = a[b + 6];
        this.b = b + 8;
        return ((long)a[b + 7] & 0xFFL) << 56 | ((n & 0xFFL) | (n2 & 0xFFL) << 8 | (n3 & 0xFFL) << 16 | (n4 & 0xFFL) << 24 | (n5 & 0xFFL) << 32 | (n6 & 0xFFL) << 40 | (n7 & 0xFFL) << 48);
    }
    
    public short v() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        this.b = b + 2;
        return (short)((a[b + 1] & 0xFF) << 8 | (b2 & 0xFF));
    }
    
    public long w() {
        final byte[] a = this.a;
        final int b = this.b;
        final long n = a[b];
        final long n2 = a[b + 1];
        final long n3 = a[b + 2];
        this.b = b + 4;
        return ((long)a[b + 3] & 0xFFL) << 24 | ((n & 0xFFL) | (n2 & 0xFFL) << 8 | (n3 & 0xFFL) << 16);
    }
    
    public int x() {
        final int t = this.t();
        if (t >= 0) {
            return t;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }
    
    public int y() {
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        this.b = b + 2;
        return (a[b + 1] & 0xFF) << 8 | (b2 & 0xFF);
    }
    
    public long z() {
        final byte[] a = this.a;
        final int b = this.b;
        final long n = a[b];
        final long n2 = a[b + 1];
        final long n3 = a[b + 2];
        final long n4 = a[b + 3];
        final long n5 = a[b + 4];
        final long n6 = a[b + 5];
        final long n7 = a[b + 6];
        this.b = b + 8;
        return ((long)a[b + 7] & 0xFFL) | ((n & 0xFFL) << 56 | (n2 & 0xFFL) << 48 | (n3 & 0xFFL) << 40 | (n4 & 0xFFL) << 32 | (n5 & 0xFFL) << 24 | (n6 & 0xFFL) << 16 | (n7 & 0xFFL) << 8);
    }
}
