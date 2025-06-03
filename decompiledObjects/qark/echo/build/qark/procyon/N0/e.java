// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N0;

import F0.N;
import F0.D;
import F0.M;
import F0.T;
import F0.t;

public final class e implements t
{
    public final long o;
    public final t p;
    
    public e(final long o, final t p2) {
        this.o = o;
        this.p = p2;
    }
    
    public static /* synthetic */ long b(final e e) {
        return e.o;
    }
    
    @Override
    public T a(final int n, final int n2) {
        return this.p.a(n, n2);
    }
    
    @Override
    public void e(final M m) {
        this.p.e(new D(m) {
            @Override
            public a j(final long n) {
                final M.a j = m.j(n);
                final N a = j.a;
                final N n2 = new N(a.a, a.b + e.b(e.this));
                final N b = j.b;
                return new M.a(n2, new N(b.a, b.b + e.b(e.this)));
            }
        });
    }
    
    @Override
    public void j() {
        this.p.j();
    }
}
