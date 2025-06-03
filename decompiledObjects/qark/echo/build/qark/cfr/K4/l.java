/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.Executors
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package K4;

import F4.a;
import K4.j;
import K4.k;
import M4.o;
import N4.b;
import com.google.protobuf.r;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class l {
    public static final a f = a.e();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d = null;
    public long e = -1L;

    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.a = scheduledExecutorService;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public static /* synthetic */ void a(l l8, M4.l l9) {
        l8.g(l9);
    }

    public static /* synthetic */ void b(l l8, M4.l l9) {
        l8.f(l9);
    }

    public static boolean e(long l8) {
        if (l8 <= 0L) {
            return true;
        }
        return false;
    }

    public void c(M4.l l8) {
        this.h(l8);
    }

    public final int d() {
        return o.c(M4.k.t.c(this.c.totalMemory() - this.c.freeMemory()));
    }

    public final /* synthetic */ void f(M4.l object) {
        if ((object = this.l((M4.l)object)) != null) {
            this.b.add(object);
        }
    }

    public final /* synthetic */ void g(M4.l object) {
        if ((object = this.l((M4.l)object)) != null) {
            this.b.add(object);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h(M4.l l8) {
        // MONITORENTER : this
        this.a.schedule((Runnable)new k(this, l8), 0L, TimeUnit.MILLISECONDS);
        return;
        catch (RejectedExecutionException rejectedExecutionException) {
            a a8 = f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect Memory Metric: ");
            stringBuilder.append(rejectedExecutionException.getMessage());
            a8.j(stringBuilder.toString());
        }
        // MONITOREXIT : this
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(long l8, M4.l l9) {
        // MONITORENTER : this
        this.e = l8;
        this.d = this.a.scheduleAtFixedRate((Runnable)new j(this, l9), 0L, l8, TimeUnit.MILLISECONDS);
        return;
        catch (RejectedExecutionException rejectedExecutionException) {
            a a8 = f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to start collecting Memory Metrics: ");
            stringBuilder.append(rejectedExecutionException.getMessage());
            a8.j(stringBuilder.toString());
        }
        // MONITOREXIT : this
    }

    public void j(long l8, M4.l l9) {
        if (l.e(l8)) {
            return;
        }
        if (this.d != null) {
            if (this.e != l8) {
                this.k();
                this.i(l8, l9);
            }
            return;
        }
        this.i(l8, l9);
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.d = null;
        this.e = -1L;
    }

    public final b l(M4.l l8) {
        if (l8 == null) {
            return null;
        }
        long l9 = l8.b();
        return (b)b.W().D(l9).E(this.d()).v();
    }
}

