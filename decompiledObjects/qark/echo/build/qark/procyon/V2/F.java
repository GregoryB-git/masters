// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class F implements g, f, d, G
{
    public final Executor a;
    public final i b;
    public final K c;
    
    public F(final Executor a, final i b, final K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Object o) {
        this.c.r(o);
    }
    
    @Override
    public final void b() {
        this.c.s();
    }
    
    @Override
    public final void c(final j j) {
        this.a.execute(new E(this, j));
    }
    
    @Override
    public final void d(final Exception ex) {
        this.c.q(ex);
    }
}
