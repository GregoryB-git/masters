// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w6;

import X5.h;
import X5.g;
import l6.d;
import u6.G;
import p6.F;
import java.util.concurrent.Executor;
import p6.g0;

public final class b extends g0 implements Executor
{
    public static final b r;
    public static final F s;
    
    static {
        r = new b();
        s = m.q.G(G.g("kotlinx.coroutines.io.parallelism", d.a(64, G.a()), 0, 0, 12, null));
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        b.s.E(g, runnable);
    }
    
    @Override
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
    
    @Override
    public void execute(final Runnable runnable) {
        this.E(h.o, runnable);
    }
    
    @Override
    public String toString() {
        return "Dispatchers.IO";
    }
}
