// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import g0.M;
import d0.v;
import d0.i;

public final class j implements s
{
    public final byte[] a;
    public final i b;
    public final long c;
    public long d;
    public byte[] e;
    public int f;
    public int g;
    
    static {
        v.a("media3.extractor");
    }
    
    public j(final i b, final long d, final long c) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = new byte[65536];
        this.a = new byte[4096];
    }
    
    @Override
    public long a() {
        return this.c;
    }
    
    @Override
    public int b(final int a) {
        int n;
        if ((n = this.u(a)) == 0) {
            final byte[] a2 = this.a;
            n = this.t(a2, 0, Math.min(a, a2.length), 0, true);
        }
        this.q(n);
        return n;
    }
    
    @Override
    public boolean d(final byte[] array, final int n, final int n2, final boolean b) {
        int n3;
        for (n3 = this.s(array, n, n2); n3 < n2 && n3 != -1; n3 = this.t(array, n, n2, n3, b)) {}
        this.q(n3);
        return n3 != -1;
    }
    
    @Override
    public int f(final byte[] array, final int n, int a) {
        this.r(a);
        final int g = this.g;
        final int f = this.f;
        final int b = g - f;
        if (b == 0) {
            a = this.t(this.e, f, a, 0, true);
            if (a == -1) {
                return -1;
            }
            this.g += a;
        }
        else {
            a = Math.min(a, b);
        }
        System.arraycopy(this.e, this.f, array, n, a);
        this.f += a;
        return a;
    }
    
    @Override
    public void h() {
        this.f = 0;
    }
    
    @Override
    public void i(final int n) {
        this.v(n, false);
    }
    
    @Override
    public boolean j(final int n, final boolean b) {
        this.r(n);
        int i = this.g - this.f;
        while (i < n) {
            i = this.t(this.e, this.f, n, i, b);
            if (i == -1) {
                return false;
            }
            this.g = this.f + i;
        }
        this.f += n;
        return true;
    }
    
    @Override
    public boolean l(final byte[] array, final int n, final int n2, final boolean b) {
        if (!this.j(n2, b)) {
            return false;
        }
        System.arraycopy(this.e, this.f - n2, array, n, n2);
        return true;
    }
    
    @Override
    public long m() {
        return this.d + this.f;
    }
    
    @Override
    public void n(final byte[] array, final int n, final int n2) {
        this.l(array, n, n2, false);
    }
    
    @Override
    public void o(final int n) {
        this.j(n, false);
    }
    
    @Override
    public long p() {
        return this.d;
    }
    
    public final void q(final int n) {
        if (n != -1) {
            this.d += n;
        }
    }
    
    public final void r(int p) {
        p += this.f;
        final byte[] e = this.e;
        if (p > e.length) {
            p = M.p(e.length * 2, 65536 + p, p + 524288);
            this.e = Arrays.copyOf(this.e, p);
        }
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        int n3;
        if ((n3 = this.s(array, n, n2)) == 0) {
            n3 = this.t(array, n, n2, 0, true);
        }
        this.q(n3);
        return n3;
    }
    
    @Override
    public void readFully(final byte[] array, final int n, final int n2) {
        this.d(array, n, n2, false);
    }
    
    public final int s(final byte[] array, final int n, int min) {
        final int g = this.g;
        if (g == 0) {
            return 0;
        }
        min = Math.min(g, min);
        System.arraycopy(this.e, 0, array, n, min);
        this.w(min);
        return min;
    }
    
    public final int t(final byte[] array, int read, final int n, final int n2, final boolean b) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        read = this.b.read(array, read + n2, n - n2);
        if (read != -1) {
            return n2 + read;
        }
        if (n2 == 0 && b) {
            return -1;
        }
        throw new EOFException();
    }
    
    public final int u(int min) {
        min = Math.min(this.g, min);
        this.w(min);
        return min;
    }
    
    public boolean v(final int a, final boolean b) {
        int n;
        for (n = this.u(a); n < a && n != -1; n = this.t(this.a, -n, Math.min(a, this.a.length + n), n, b)) {}
        this.q(n);
        return n != -1;
    }
    
    public final void w(final int n) {
        final int g = this.g - n;
        this.g = g;
        this.f = 0;
        final byte[] e = this.e;
        byte[] e2;
        if (g < e.length - 524288) {
            e2 = new byte[65536 + g];
        }
        else {
            e2 = e;
        }
        System.arraycopy(e, n, e2, 0, g);
        this.e = e2;
    }
}
