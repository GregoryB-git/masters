// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import e0.b;
import java.nio.ByteBuffer;
import g0.M;
import g0.a;
import e0.d;

public final class d0 extends d
{
    public final float i;
    public final short j;
    public final int k;
    public final long l;
    public final long m;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public int r;
    public byte[] s;
    public int t;
    public int u;
    public byte[] v;
    
    public d0() {
        this(100000L, 0.2f, 2000000L, 10, (short)1024);
    }
    
    public d0(final long l, final float i, final long m, final int k, final short j) {
        final boolean b = false;
        this.r = 0;
        this.t = 0;
        this.u = 0;
        boolean b2 = b;
        if (i >= 0.0f) {
            b2 = b;
            if (i <= 1.0f) {
                b2 = true;
            }
        }
        g0.a.a(b2);
        this.l = l;
        this.i = i;
        this.m = m;
        this.k = k;
        this.j = j;
        final byte[] f = M.f;
        this.s = f;
        this.v = f;
    }
    
    public static void D(final byte[] array, final int n, final int n2) {
        if (n2 >= 32767) {
            array[n] = -1;
            array[n + 1] = 127;
            return;
        }
        if (n2 <= -32768) {
            array[n] = 0;
            array[n + 1] = -128;
            return;
        }
        array[n] = (byte)(n2 & 0xFF);
        array[n + 1] = (byte)(n2 >> 8);
    }
    
    public static int G(final byte b, final byte b2) {
        return b << 8 | (b2 & 0xFF);
    }
    
    public final void A(final boolean b) {
        final int u = this.u;
        final byte[] s = this.s;
        if (u == s.length || b) {
            final int r = this.r;
            final boolean b2 = false;
            int i;
            int r2;
            if (r == 0) {
                if (b) {
                    this.B(u, 3);
                    i = u;
                }
                else {
                    g0.a.f(u >= s.length / 2);
                    i = this.s.length / 2;
                    this.B(i, 0);
                }
                r2 = i;
            }
            else if (b) {
                final int n = u - s.length / 2;
                final int n2 = s.length / 2;
                r2 = this.r(n) + this.s.length / 2;
                this.B(r2, 2);
                i = n2 + n;
            }
            else {
                i = u - s.length / 2;
                r2 = this.r(i);
                this.B(r2, 1);
            }
            final boolean b3 = i % this.n == 0;
            final StringBuilder sb = new StringBuilder();
            sb.append("bytesConsumed is not aligned to frame size: %s");
            sb.append(i);
            g0.a.g(b3, sb.toString());
            boolean b4 = b2;
            if (u >= r2) {
                b4 = true;
            }
            g0.a.f(b4);
            this.u -= i;
            final int t = this.t + i;
            this.t = t;
            this.t = t % this.s.length;
            final int r3 = this.r;
            final int n3 = this.n;
            this.r = r3 + r2 / n3;
            this.q += (i - r2) / n3;
        }
    }
    
    public final void B(final int i, final int n) {
        if (i == 0) {
            return;
        }
        final int u = this.u;
        final boolean b = true;
        g0.a.a(u >= i);
        if (n == 2) {
            final int t = this.t;
            final int u2 = this.u;
            final byte[] s = this.s;
            if (t + u2 <= s.length) {
                System.arraycopy(s, t + u2 - i, this.v, 0, i);
            }
            else {
                final int n2 = u2 - (s.length - t);
                if (n2 >= i) {
                    System.arraycopy(s, n2 - i, this.v, 0, i);
                }
                else {
                    final int n3 = i - n2;
                    System.arraycopy(s, s.length - n3, this.v, 0, n3);
                    System.arraycopy(this.s, 0, this.v, n3, n2);
                }
            }
        }
        else {
            final int t2 = this.t;
            final byte[] s2 = this.s;
            if (t2 + i <= s2.length) {
                System.arraycopy(s2, t2, this.v, 0, i);
            }
            else {
                final int n4 = s2.length - t2;
                System.arraycopy(s2, t2, this.v, 0, n4);
                System.arraycopy(this.s, 0, this.v, n4, i - n4);
            }
        }
        final boolean b2 = i % this.n == 0;
        final StringBuilder sb = new StringBuilder();
        sb.append("sizeToOutput is not aligned to frame size: ");
        sb.append(i);
        g0.a.b(b2, sb.toString());
        g0.a.f(this.t < this.s.length && b);
        this.z(this.v, i, n);
    }
    
    public final void C(final ByteBuffer byteBuffer) {
        final int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.s.length));
        final int t = this.t(byteBuffer);
        if (t == byteBuffer.position()) {
            this.p = 1;
        }
        else {
            byteBuffer.limit(Math.min(t, byteBuffer.capacity()));
            this.y(byteBuffer);
        }
        byteBuffer.limit(limit);
    }
    
    public void E(final boolean o) {
        this.o = o;
    }
    
    public final void F(final ByteBuffer byteBuffer) {
        final int t = this.t;
        final int length = this.s.length;
        final boolean b = true;
        g0.a.f(t < length);
        final int limit = byteBuffer.limit();
        final int u = this.u(byteBuffer);
        final int a = u - byteBuffer.position();
        final int t2 = this.t;
        final int u2 = this.u;
        final byte[] s = this.s;
        int b2;
        int offset;
        if (t2 + u2 < s.length) {
            b2 = s.length - (u2 + t2);
            offset = t2 + u2;
        }
        else {
            offset = u2 - (s.length - t2);
            b2 = t2 - offset;
        }
        final boolean b3 = u < limit;
        final int min = Math.min(a, b2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.s, offset, min);
        final int u3 = this.u + min;
        this.u = u3;
        g0.a.f(u3 <= this.s.length);
        final boolean b4 = b3 && a < b2 && b;
        this.A(b4);
        if (b4) {
            this.p = 0;
            this.r = 0;
        }
        byteBuffer.limit(limit);
    }
    
    @Override
    public boolean a() {
        return super.a() && this.o;
    }
    
    @Override
    public void f(final ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.h()) {
            final int p = this.p;
            if (p != 0) {
                if (p != 1) {
                    throw new IllegalStateException();
                }
                this.F(byteBuffer);
            }
            else {
                this.C(byteBuffer);
            }
        }
    }
    
    @Override
    public a i(final a a) {
        if (a.c == 2) {
            Object e = a;
            if (a.a == -1) {
                e = e0.b.a.e;
            }
            return (a)e;
        }
        throw new b.b(a);
    }
    
    @Override
    public void j() {
        if (this.a()) {
            this.n = super.b.b * 2;
            final int n = this.o(this.s(this.l) / 2) * 2;
            if (this.s.length != n) {
                this.s = new byte[n];
                this.v = new byte[n];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }
    
    @Override
    public void k() {
        if (this.u > 0) {
            this.A(true);
            this.r = 0;
        }
    }
    
    @Override
    public void l() {
        this.o = false;
        final byte[] f = M.f;
        this.s = f;
        this.v = f;
    }
    
    public final int n(final float n) {
        return this.o((int)n);
    }
    
    public final int o(final int n) {
        final int n2 = this.n;
        return n / n2 * n2;
    }
    
    public final int p(final int n, final int n2) {
        final int k = this.k;
        return k + (100 - k) * (n * 1000) / n2 / 1000;
    }
    
    public final int q(final int n, final int n2) {
        return (this.k - 100) * (n * 1000 / n2) / 1000 + 100;
    }
    
    public final int r(final int n) {
        final int n2 = (this.s(this.m) - this.r) * this.n - this.s.length / 2;
        g0.a.f(n2 >= 0);
        return this.n(Math.min(n * this.i + 0.5f, (float)n2));
    }
    
    public final int s(final long n) {
        return (int)(n * super.b.a / 1000000L);
    }
    
    public final int t(final ByteBuffer byteBuffer) {
        for (int i = byteBuffer.limit() - 1; i >= byteBuffer.position(); i -= 2) {
            if (this.w(byteBuffer.get(i), byteBuffer.get(i - 1))) {
                final int n = this.n;
                return i / n * n + n;
            }
        }
        return byteBuffer.position();
    }
    
    public final int u(final ByteBuffer byteBuffer) {
        for (int i = byteBuffer.position() + 1; i < byteBuffer.limit(); i += 2) {
            if (this.w(byteBuffer.get(i), byteBuffer.get(i - 1))) {
                final int n = this.n;
                return n * (i / n);
            }
        }
        return byteBuffer.limit();
    }
    
    public long v() {
        return this.q;
    }
    
    public final boolean w(final byte b, final byte b2) {
        return Math.abs(G(b, b2)) > this.j;
    }
    
    public final void x(final byte[] array, final int n, final int n2) {
        if (n2 == 3) {
            return;
        }
        for (int i = 0; i < n; i += 2) {
            final int g = G(array[i + 1], array[i]);
            int n3;
            if (n2 == 0) {
                n3 = this.q(i, n - 1);
            }
            else if (n2 == 2) {
                n3 = this.p(i, n - 1);
            }
            else {
                n3 = this.k;
            }
            D(array, i, g * n3 / 100);
        }
    }
    
    public final void y(final ByteBuffer src) {
        this.m(src.remaining()).put(src).flip();
    }
    
    public final void z(final byte[] src, final int n, final int n2) {
        final boolean b = n % this.n == 0;
        final StringBuilder sb = new StringBuilder();
        sb.append("byteOutput size is not aligned to frame size ");
        sb.append(n);
        g0.a.b(b, sb.toString());
        this.x(src, n, n2);
        this.m(n).put(src, 0, n).flip();
    }
}
