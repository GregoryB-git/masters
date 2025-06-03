// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import d0.q;
import F0.t;
import g0.o;
import g0.a;
import F0.T;
import g0.z;

public final class r implements m
{
    public final z a;
    public T b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    
    public r() {
        this.a = new z(10);
        this.d = -9223372036854775807L;
    }
    
    @Override
    public void a(final z z) {
        g0.a.h(this.b);
        if (!this.c) {
            return;
        }
        final int a = z.a();
        final int f = this.f;
        if (f < 10) {
            final int min = Math.min(a, 10 - f);
            System.arraycopy(z.e(), z.f(), this.a.e(), this.f, min);
            if (this.f + min == 10) {
                this.a.T(0);
                if (73 != this.a.G() || 68 != this.a.G() || 51 != this.a.G()) {
                    o.h("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.U(3);
                this.e = this.a.F() + 10;
            }
        }
        final int min2 = Math.min(a, this.e - this.f);
        this.b.e(z, min2);
        this.f += min2;
    }
    
    @Override
    public void b() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
    
    @Override
    public void c(final boolean b) {
        g0.a.h(this.b);
        if (this.c) {
            final int e = this.e;
            if (e != 0) {
                if (this.f != e) {
                    return;
                }
                g0.a.f(this.d != -9223372036854775807L);
                this.b.b(this.d, 1, this.e, 0, null);
                this.c = false;
            }
        }
    }
    
    @Override
    public void d(final long d, final int n) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        this.d = d;
        this.e = 0;
        this.f = 0;
    }
    
    @Override
    public void e(final t t, final K.d d) {
        d.a();
        (this.b = t.a(d.c(), 5)).d(new q.b().a0(d.b()).o0("application/id3").K());
    }
}
