// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.concurrent.Callable;
import A2.n;
import com.google.android.gms.internal.measurement.p0;
import java.util.concurrent.FutureTask;

public final class L2 extends FutureTask implements Comparable
{
    public final long o;
    public final boolean p;
    public final String q;
    public final /* synthetic */ G2 r;
    
    public L2(final G2 r, final Runnable runnable, final boolean p4, final String q) {
        this.r = r;
        super(p0.a().b(runnable), null);
        n.i(q);
        final long andIncrement = G2.F().getAndIncrement();
        this.o = andIncrement;
        this.q = q;
        this.p = p4;
        if (andIncrement == Long.MAX_VALUE) {
            r.j().G().a("Tasks index overflow");
        }
    }
    
    public L2(final G2 r, final Callable callable, final boolean p4, final String q) {
        this.r = r;
        super(p0.a().a(callable));
        n.i(q);
        final long andIncrement = G2.F().getAndIncrement();
        this.o = andIncrement;
        this.q = q;
        this.p = p4;
        if (andIncrement == Long.MAX_VALUE) {
            r.j().G().a("Tasks index overflow");
        }
    }
    
    public final void setException(final Throwable exception) {
        this.r.j().G().b(this.q, exception);
        super.setException(exception);
    }
}
