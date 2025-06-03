// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.Executor;

public final class v implements g, f, d, G
{
    public final Executor a;
    public final b b;
    public final K c;
    
    public v(final Executor a, final b b, final K c) {
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
        this.a.execute(new u(this, j));
    }
    
    @Override
    public final void d(final Exception ex) {
        this.c.q(ex);
    }
}
