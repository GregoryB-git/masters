// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.nio.charset.Charset;

public final class y
{
    public byte[] a;
    public int b;
    public int c;
    public int d;
    
    public y() {
        this.a = M.f;
    }
    
    public y(final byte[] array) {
        this(array, array.length);
    }
    
    public y(final byte[] a, final int d) {
        this.a = a;
        this.d = d;
    }
    
    public final void a() {
        final int b = this.b;
        boolean b2 = false;
        Label_0038: {
            if (b >= 0) {
                final int d = this.d;
                if (b < d || (b == d && this.c == 0)) {
                    b2 = true;
                    break Label_0038;
                }
            }
            b2 = false;
        }
        g0.a.f(b2);
    }
    
    public int b() {
        return (this.d - this.b) * 8 - this.c;
    }
    
    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        ++this.b;
        this.a();
    }
    
    public int d() {
        g0.a.f(this.c == 0);
        return this.b;
    }
    
    public int e() {
        return this.b * 8 + this.c;
    }
    
    public void f(int n, final int b) {
        int n2 = n;
        if (b < 32) {
            n2 = (n & (1 << b) - 1);
        }
        final int min = Math.min(8 - this.c, b);
        final int c = this.c;
        n = 8 - c - min;
        final byte[] a = this.a;
        final int b2 = this.b;
        final byte b3 = (byte)((65280 >> c | (1 << n) - 1) & a[b2]);
        a[b2] = b3;
        int i = b - min;
        a[b2] = (byte)(b3 | n2 >>> i << n);
        for (n = b2 + 1; i > 8; i -= 8, ++n) {
            this.a[n] = (byte)(n2 >>> i - 8);
        }
        final int n3 = 8 - i;
        final byte[] a2 = this.a;
        final byte b4 = (byte)(a2[n] & (1 << n3) - 1);
        a2[n] = b4;
        a2[n] = (byte)((n2 & (1 << i) - 1) << n3 | b4);
        this.r(b);
        this.a();
    }
    
    public boolean g() {
        final boolean b = (this.a[this.b] & 128 >> this.c) != 0x0;
        this.q();
        return b;
    }
    
    public int h(final int n) {
        if (n == 0) {
            return 0;
        }
        this.c += n;
        int n2 = 0;
        int c;
        while (true) {
            c = this.c;
            if (c <= 8) {
                break;
            }
            final int c2 = c - 8;
            this.c = c2;
            n2 |= (this.a[this.b++] & 0xFF) << c2;
        }
        final byte[] a = this.a;
        final int b = this.b;
        final byte b2 = a[b];
        if (c == 8) {
            this.c = 0;
            this.b = b + 1;
        }
        this.a();
        return -1 >>> 32 - n & (n2 | (b2 & 0xFF) >> 8 - c);
    }
    
    public void i(final byte[] array, int i, int c) {
        int n;
        for (n = (c >> 3) + i; i < n; ++i) {
            final byte[] a = this.a;
            final int b = this.b;
            final int b2 = b + 1;
            this.b = b2;
            final byte b3 = a[b];
            final int c2 = this.c;
            final byte b4 = (byte)(b3 << c2);
            array[i] = b4;
            array[i] = (byte)((0xFF & a[b2]) >> 8 - c2 | b4);
        }
        i = (c & 0x7);
        if (i == 0) {
            return;
        }
        final byte b5 = (byte)(array[n] & 255 >> i);
        array[n] = b5;
        c = this.c;
        if (c + i > 8) {
            array[n] = (byte)(b5 | (this.a[this.b++] & 0xFF) << c);
            this.c = c - 8;
        }
        c = this.c + i;
        this.c = c;
        final byte[] a2 = this.a;
        final int b6 = this.b;
        array[n] |= (byte)((0xFF & a2[b6]) >> 8 - c << 8 - i);
        if (c == 8) {
            this.c = 0;
            this.b = b6 + 1;
        }
        this.a();
    }
    
    public long j(final int n) {
        if (n <= 32) {
            return M.h1(this.h(n));
        }
        return M.g1(this.h(n - 32), this.h(32));
    }
    
    public void k(final byte[] array, final int n, final int n2) {
        g0.a.f(this.c == 0);
        System.arraycopy(this.a, this.b, array, n, n2);
        this.b += n2;
        this.a();
    }
    
    public String l(final int n, final Charset charset) {
        final byte[] bytes = new byte[n];
        this.k(bytes, 0, n);
        return new String(bytes, charset);
    }
    
    public void m(final z z) {
        this.o(z.e(), z.g());
        this.p(z.f() * 8);
    }
    
    public void n(final byte[] array) {
        this.o(array, array.length);
    }
    
    public void o(final byte[] a, final int d) {
        this.a = a;
        this.b = 0;
        this.c = 0;
        this.d = d;
    }
    
    public void p(final int n) {
        final int b = n / 8;
        this.b = b;
        this.c = n - b * 8;
        this.a();
    }
    
    public void q() {
        final int c = this.c + 1;
        this.c = c;
        if (c == 8) {
            this.c = 0;
            ++this.b;
        }
        this.a();
    }
    
    public void r(int c) {
        final int n = c / 8;
        final int b = this.b + n;
        this.b = b;
        c = this.c + (c - n * 8);
        this.c = c;
        if (c > 7) {
            this.b = b + 1;
            this.c = c - 8;
        }
        this.a();
    }
    
    public void s(final int n) {
        g0.a.f(this.c == 0);
        this.b += n;
        this.a();
    }
}
