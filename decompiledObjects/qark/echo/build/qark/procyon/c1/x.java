// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import java.util.List;
import F0.S;
import java.io.EOFException;
import d0.i;
import g0.g;
import g0.a;
import g0.M;
import d0.q;
import g0.z;
import F0.T;

public final class x implements T
{
    public final T a;
    public final t.a b;
    public final d c;
    public final z d;
    public int e;
    public int f;
    public byte[] g;
    public t h;
    public q i;
    
    public x(final T a, final t.a b) {
        this.a = a;
        this.b = b;
        this.c = new d();
        this.e = 0;
        this.f = 0;
        this.g = M.f;
        this.d = new z();
    }
    
    @Override
    public void a(final z z, final int n, final int n2) {
        if (this.h == null) {
            this.a.a(z, n, n2);
            return;
        }
        this.h(n);
        z.l(this.g, this.f, n);
        this.f += n;
    }
    
    @Override
    public void b(final long n, int e, final int n2, int n3, final a a) {
        if (this.h == null) {
            this.a.b(n, e, n2, n3, a);
            return;
        }
        a.b(a == null, "DRM on subtitles is not supported");
        n3 = this.f - n3 - n2;
        this.h.c(this.g, n3, n2, t.b.b(), new w(this, n, e));
        e = n3 + n2;
        if ((this.e = e) == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }
    
    @Override
    public int c(final i i, int read, final boolean b, final int n) {
        if (this.h == null) {
            return this.a.c(i, read, b, n);
        }
        this.h(read);
        read = i.read(this.g, this.f, read);
        if (read != -1) {
            this.f += read;
            return read;
        }
        if (b) {
            return -1;
        }
        throw new EOFException();
    }
    
    @Override
    public void d(final q i) {
        g0.a.e(i.n);
        g0.a.a(d0.z.k(i.n) == 3);
        if (!i.equals(this.i)) {
            this.i = i;
            t b;
            if (this.b.a(i)) {
                b = this.b.b(i);
            }
            else {
                b = null;
            }
            this.h = b;
        }
        q q;
        T t;
        if (this.h == null) {
            final T a = this.a;
            q = i;
            t = a;
        }
        else {
            final T a2 = this.a;
            final q k = i.a().o0("application/x-media3-cues").O(i.n).s0(Long.MAX_VALUE).S(this.b.c(i)).K();
            t = a2;
            q = k;
        }
        t.d(q);
    }
    
    public final void h(int max) {
        final int length = this.g.length;
        final int f = this.f;
        if (length - f >= max) {
            return;
        }
        final int f2 = f - this.e;
        max = Math.max(f2 * 2, max + f2);
        final byte[] g = this.g;
        byte[] g2;
        if (max <= g.length) {
            g2 = g;
        }
        else {
            g2 = new byte[max];
        }
        System.arraycopy(g, this.e, g2, 0, f2);
        this.e = 0;
        this.f = f2;
        this.g = g2;
    }
    
    public final void j(final e e, long n, final int n2) {
        g0.a.h(this.i);
        final byte[] a = this.c.a(e.a, e.c);
        this.d.Q(a);
        this.a.e(this.d, a.length);
        final long b = e.b;
        if (b == -9223372036854775807L) {
            g0.a.f(this.i.s == Long.MAX_VALUE);
        }
        else {
            final long s = this.i.s;
            if (s == Long.MAX_VALUE) {
                n += b;
            }
            else {
                n = b + s;
            }
        }
        this.a.b(n, n2, a.length, 0, null);
    }
    
    public void k() {
        final t h = this.h;
        if (h != null) {
            h.b();
        }
    }
}
