// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import b3.b;

public final class Q3 implements b
{
    public final /* synthetic */ v5 a;
    public final /* synthetic */ C3 b;
    
    public Q3(final C3 b, final v5 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        this.b.n();
        C3.N(this.b, false);
        this.b.r0();
        this.b.j().F().b("registerTriggerAsync ran. uri", this.a.o);
    }
    
    @Override
    public final void onFailure(final Throwable t) {
        this.b.n();
        C3.N(this.b, false);
        this.b.r0();
        this.b.j().G().b("registerTriggerAsync failed with throwable", t);
    }
}
