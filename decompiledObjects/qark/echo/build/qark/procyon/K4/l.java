// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K4;

import com.google.protobuf.r;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import N4.b;
import M4.o;
import M4.k;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import F4.a;

public class l
{
    public static final a f;
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;
    
    static {
        f = a.e();
    }
    
    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }
    
    public l(final ScheduledExecutorService a, final Runtime c) {
        this.d = null;
        this.e = -1L;
        this.a = a;
        this.b = new ConcurrentLinkedQueue();
        this.c = c;
    }
    
    public static boolean e(final long n) {
        return n <= 0L;
    }
    
    public void c(final M4.l l) {
        this.h(l);
    }
    
    public final int d() {
        return o.c(k.t.c(this.c.totalMemory() - this.c.freeMemory()));
    }
    
    public final void h(final M4.l l) {
        // monitorenter(this)
        try {
            try {
                this.a.schedule(new K4.k(this, l), 0L, TimeUnit.MILLISECONDS);
            }
            finally {}
        }
        catch (RejectedExecutionException ex) {
            final a f = l.f;
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect Memory Metric: ");
            sb.append(ex.getMessage());
            f.j(sb.toString());
        }
        // monitorexit(this)
        return;
    }
    // monitorexit(this)
    
    public final void i(final long e, final M4.l l) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0087: {
            Label_0084: {
                try {
                    this.e = e;
                    final l i = this;
                    final l j = this;
                    final ScheduledExecutorService scheduledExecutorService = j.a;
                    final l k = this;
                    final M4.l m = l;
                    final j j2 = new j(k, m);
                    final long n = 0L;
                    final long n2 = e;
                    final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(j2, n, n2, timeUnit);
                    i.d = scheduledFuture;
                    break Label_0084;
                }
                finally {
                    break Label_0087;
                }
                try {
                    final l i = this;
                    final l j = this;
                    final ScheduledExecutorService scheduledExecutorService = j.a;
                    final l k = this;
                    final M4.l m = l;
                    final j j2 = new j(k, m);
                    final long n = 0L;
                    final long n2 = e;
                    final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(j2, n, n2, timeUnit);
                    i.d = scheduledFuture;
                }
                catch (RejectedExecutionException ex) {
                    final a f = l.f;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to start collecting Memory Metrics: ");
                    sb.append(ex.getMessage());
                    f.j(sb.toString());
                }
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void j(final long n, final M4.l l) {
        if (e(n)) {
            return;
        }
        if (this.d != null) {
            if (this.e != n) {
                this.k();
                this.i(n, l);
            }
            return;
        }
        this.i(n, l);
    }
    
    public void k() {
        final ScheduledFuture d = this.d;
        if (d == null) {
            return;
        }
        d.cancel(false);
        this.d = null;
        this.e = -1L;
    }
    
    public final b l(final M4.l l) {
        if (l == null) {
            return null;
        }
        return (b)((r.a)N4.b.W().D(l.b()).E(this.d())).v();
    }
}
