// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.CancellationException;
import X5.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class p extends z
{
    public static final AtomicIntegerFieldUpdater c;
    private volatile int _resumed;
    
    static {
        c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_resumed");
    }
    
    public p(final d obj, final Throwable t, final boolean b) {
        Throwable t2 = t;
        if (t == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(obj);
            sb.append(" was cancelled normally");
            t2 = new CancellationException(sb.toString());
        }
        super(t2, b);
        this._resumed = 0;
    }
    
    public final boolean c() {
        return p.c.compareAndSet(this, 0, 1);
    }
}
