// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e0;

import g0.M;
import g0.a;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.nio.ByteBuffer;

public class f implements b
{
    public int b;
    public float c;
    public float d;
    public a e;
    public a f;
    public a g;
    public a h;
    public boolean i;
    public e j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;
    
    public f() {
        this.c = 1.0f;
        this.d = 1.0f;
        final a e = e0.b.a.e;
        this.e = e;
        this.f = e;
        this.g = e;
        this.h = e;
        final ByteBuffer a = e0.b.a;
        this.k = a;
        this.l = a.asShortBuffer();
        this.m = a;
        this.b = -1;
    }
    
    @Override
    public final boolean a() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }
    
    @Override
    public final void b() {
        this.c = 1.0f;
        this.d = 1.0f;
        final a e = e0.b.a.e;
        this.e = e;
        this.f = e;
        this.g = e;
        this.h = e;
        final ByteBuffer a = e0.b.a;
        this.k = a;
        this.l = a.asShortBuffer();
        this.m = a;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
    
    @Override
    public final boolean c() {
        if (this.p) {
            final e j = this.j;
            if (j == null || j.k() == 0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final ByteBuffer d() {
        final e j = this.j;
        if (j != null) {
            final int k = j.k();
            if (k > 0) {
                if (this.k.capacity() < k) {
                    final ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                }
                else {
                    this.k.clear();
                    this.l.clear();
                }
                j.j(this.l);
                this.o += k;
                this.k.limit(k);
                this.m = this.k;
            }
        }
        final ByteBuffer m = this.m;
        this.m = e0.b.a;
        return m;
    }
    
    @Override
    public final void e() {
        final e j = this.j;
        if (j != null) {
            j.s();
        }
        this.p = true;
    }
    
    @Override
    public final void f(final ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        final e e = (e)g0.a.e(this.j);
        final ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        final int remaining = byteBuffer.remaining();
        this.n += remaining;
        e.t(shortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }
    
    @Override
    public final void flush() {
        if (this.a()) {
            final a e = this.e;
            this.g = e;
            final a f = this.f;
            this.h = f;
            if (this.i) {
                this.j = new e(e.a, e.b, this.c, this.d, f.a);
            }
            else {
                final e j = this.j;
                if (j != null) {
                    j.i();
                }
            }
        }
        this.m = e0.b.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
    
    @Override
    public final a g(final a e) {
        if (e.c == 2) {
            int n;
            if ((n = this.b) == -1) {
                n = e.a;
            }
            this.e = e;
            final a f = new a(n, e.b, 2);
            this.f = f;
            this.i = true;
            return f;
        }
        throw new b(e);
    }
    
    public final long h(final long n) {
        if (this.o < 1024L) {
            return (long)(this.c * (double)n);
        }
        final long n2 = this.n - ((e)g0.a.e(this.j)).l();
        final int a = this.h.a;
        final int a2 = this.g.a;
        if (a == a2) {
            return M.W0(n, n2, this.o);
        }
        return M.W0(n, n2 * a, this.o * a2);
    }
    
    public final void i(final float d) {
        if (this.d != d) {
            this.d = d;
            this.i = true;
        }
    }
    
    public final void j(final float c) {
        if (this.c != c) {
            this.c = c;
            this.i = true;
        }
    }
}
