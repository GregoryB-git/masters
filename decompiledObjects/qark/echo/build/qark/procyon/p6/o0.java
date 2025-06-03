// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.t;
import g6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class o0 extends s0
{
    public static final AtomicIntegerFieldUpdater t;
    private volatile int _invoked;
    public final l s;
    
    static {
        t = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_invoked");
    }
    
    public o0(final l s) {
        this.s = s;
    }
    
    @Override
    public void v(final Throwable t) {
        if (o0.t.compareAndSet(this, 0, 1)) {
            this.s.invoke(t);
        }
    }
}
