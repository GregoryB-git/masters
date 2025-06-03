// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import e0.b;
import java.nio.ByteBuffer;
import g0.M;
import e0.d;

public final class f0 extends d
{
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;
    
    public f0() {
        this.m = M.f;
    }
    
    @Override
    public boolean c() {
        return super.c() && this.n == 0;
    }
    
    @Override
    public ByteBuffer d() {
        if (super.c()) {
            final int n = this.n;
            if (n > 0) {
                this.m(n).put(this.m, 0, this.n).flip();
                this.n = 0;
            }
        }
        return super.d();
    }
    
    @Override
    public void f(final ByteBuffer src) {
        final int position = src.position();
        final int limit = src.limit();
        final int a = limit - position;
        if (a == 0) {
            return;
        }
        final int min = Math.min(a, this.l);
        this.o += min / super.b.d;
        this.l -= min;
        src.position(position + min);
        if (this.l > 0) {
            return;
        }
        final int n = a - min;
        final int n2 = this.n + n - this.m.length;
        final ByteBuffer m = this.m(n2);
        final int p = M.p(n2, 0, this.n);
        m.put(this.m, 0, p);
        final int p2 = M.p(n2 - p, 0, n);
        src.limit(src.position() + p2);
        m.put(src);
        src.limit(limit);
        final int length = n - p2;
        final int n3 = this.n - p;
        this.n = n3;
        final byte[] i = this.m;
        System.arraycopy(i, p, i, 0, n3);
        src.get(this.m, this.n, length);
        this.n += length;
        m.flip();
    }
    
    @Override
    public a i(final a a) {
        if (a.c == 2) {
            this.k = true;
            Object e = a;
            if (this.i == 0) {
                if (this.j != 0) {
                    return a;
                }
                e = e0.b.a.e;
            }
            return (a)e;
        }
        throw new b.b(a);
    }
    
    @Override
    public void j() {
        if (this.k) {
            this.k = false;
            final int j = this.j;
            final int d = super.b.d;
            this.m = new byte[j * d];
            this.l = this.i * d;
        }
        this.n = 0;
    }
    
    @Override
    public void k() {
        if (this.k) {
            final int n = this.n;
            if (n > 0) {
                this.o += n / super.b.d;
            }
            this.n = 0;
        }
    }
    
    @Override
    public void l() {
        this.m = M.f;
    }
    
    public long n() {
        return this.o;
    }
    
    public void o() {
        this.o = 0L;
    }
    
    public void p(final int i, final int j) {
        this.i = i;
        this.j = j;
    }
}
