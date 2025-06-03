// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.atomic.AtomicReference;

public final class X3 implements Runnable
{
    public final /* synthetic */ long o;
    public final /* synthetic */ C3 p;
    
    public X3(final C3 p2, final long o) {
        this.p = p2;
        this.o = o;
    }
    
    @Override
    public final void run() {
        this.p.E(this.o, true);
        this.p.t().Q(new AtomicReference());
    }
}
