// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import F0.t;
import g0.M;
import g0.a;
import g0.z;
import F0.T;
import g0.E;
import d0.q;

public final class x implements D
{
    public q a;
    public E b;
    public T c;
    
    public x(final String s) {
        this.a = new q.b().o0(s).K();
    }
    
    @Override
    public void a(final z z) {
        this.b();
        final long e = this.b.e();
        final long f = this.b.f();
        if (e != -9223372036854775807L) {
            if (f == -9223372036854775807L) {
                return;
            }
            final q a = this.a;
            if (f != a.s) {
                final q k = a.a().s0(f).K();
                this.a = k;
                this.c.d(k);
            }
            final int a2 = z.a();
            this.c.e(z, a2);
            this.c.b(e, 1, a2, 0, null);
        }
    }
    
    public final void b() {
        g0.a.h(this.b);
        M.i(this.c);
    }
    
    @Override
    public void c(final E b, final t t, final K.d d) {
        this.b = b;
        d.a();
        (this.c = t.a(d.c(), 5)).d(this.a);
    }
}
