// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.List;
import d0.i;
import g0.z;
import g0.a;
import d0.q;

public final class O implements r
{
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public t f;
    public T g;
    
    public O(final int a, final int b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final long n, final long n2) {
        if (n == 0L || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }
    
    @Override
    public void b(final t f) {
        this.f = f;
        this.c(this.c);
    }
    
    public final void c(final String s) {
        (this.g = this.f.a(1024, 4)).d(new q.b().o0(s).K());
        this.f.j();
        this.f.e(new P(-9223372036854775807L));
        this.e = 1;
    }
    
    @Override
    public boolean e(final s s) {
        g0.a.f(this.a != -1 && this.b != -1);
        final z z = new z(this.b);
        s.n(z.e(), 0, this.b);
        return z.M() == this.a;
    }
    
    public final void f(final s s) {
        final int f = ((T)g0.a.e(this.g)).f(s, 1024, true);
        if (f == -1) {
            this.e = 2;
            this.g.b(0L, 1, this.d, 0, null);
            this.d = 0;
            return;
        }
        this.d += f;
    }
    
    @Override
    public int i(final s s, final L l) {
        final int e = this.e;
        if (e == 1) {
            this.f(s);
            return 0;
        }
        if (e == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public void release() {
    }
}
