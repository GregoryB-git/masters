// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import X5.g;
import u6.c;
import java.util.concurrent.Executor;

public final class h0 extends g0 implements S
{
    public final Executor r;
    
    public h0(final Executor r) {
        this.r = r;
        c.a(this.I());
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        try {
            final Executor i = this.I();
            c.a();
            i.execute(runnable);
        }
        catch (RejectedExecutionException ex) {
            c.a();
            this.H(g, ex);
            W.b().E(g, runnable);
        }
    }
    
    public final void H(final g g, final RejectedExecutionException ex) {
        u0.c(g, f0.a("The task was rejected", ex));
    }
    
    public Executor I() {
        return this.r;
    }
    
    @Override
    public void close() {
        final Executor i = this.I();
        ExecutorService executorService;
        if (i instanceof ExecutorService) {
            executorService = (ExecutorService)i;
        }
        else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof h0 && ((h0)o).I() == this.I();
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this.I());
    }
    
    @Override
    public String toString() {
        return this.I().toString();
    }
}
