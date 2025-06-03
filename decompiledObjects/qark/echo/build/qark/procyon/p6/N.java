// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.locks.LockSupport;
import l6.d;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.TimeUnit;

public final class N extends b0 implements Runnable
{
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final N w;
    public static final long x;
    
    static {
        a0.N(w = new N(), false, 1, null);
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        while (true) {
            try {
                Long n = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
                while (true) {
                    x = milliseconds.toNanos(n);
                    return;
                    n = 1000L;
                    continue;
                }
            }
            catch (SecurityException ex) {}
            continue;
        }
    }
    
    @Override
    public Thread T() {
        Thread thread;
        if ((thread = N._thread) == null) {
            thread = this.f0();
        }
        return thread;
    }
    
    @Override
    public void X(final Runnable runnable) {
        if (this.g0()) {
            this.j0();
        }
        super.X(runnable);
    }
    
    public final void e0() {
        synchronized (this) {
            if (!this.h0()) {
                return;
            }
            N.debugStatus = 3;
            this.c0();
            Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }
    
    public final Thread f0() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0047: {
            try {
                if (N._thread == null) {
                    final Thread thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    (N._thread = thread).setDaemon(true);
                    thread.start();
                }
            }
            finally {
                break Label_0047;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public final boolean g0() {
        return N.debugStatus == 4;
    }
    
    public final boolean h0() {
        final int debugStatus = N.debugStatus;
        return debugStatus == 2 || debugStatus == 3;
    }
    
    public final boolean i0() {
        synchronized (this) {
            if (this.h0()) {
                return false;
            }
            N.debugStatus = 1;
            Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return true;
        }
    }
    
    public final void j0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
    
    @Override
    public void run() {
    Label_0154_Outer:
        while (true) {
            L0.a.d(this);
            c.a();
        Label_0154:
            while (true) {
            Block_10_Outer:
                while (true) {
                    Label_0106: {
                        try {
                            if (!this.i0()) {
                                N._thread = null;
                                this.e0();
                                c.a();
                                if (!this.a0()) {
                                    this.T();
                                }
                                return;
                            }
                            final long n = Long.MAX_VALUE;
                            Thread.interrupted();
                            final long nanos = this.Q();
                            if (nanos == Long.MAX_VALUE) {
                                c.a();
                                final long nanoTime = System.nanoTime();
                                long n2 = n;
                                if (n == Long.MAX_VALUE) {
                                    n2 = N.x + nanoTime;
                                }
                                break Label_0106;
                            }
                        }
                        finally {
                            N._thread = null;
                            this.e0();
                            c.a();
                            if (!this.a0()) {
                                this.T();
                            }
                            Label_0143: {
                                final long n3;
                                final long nanos = d.c(nanos, n3);
                            }
                            break Label_0154;
                            // iftrue(Label_0143:, n3 > 0L)
                            // iftrue(Label_0142:, this.a0())
                            // iftrue(Label_0198:, !this.h0())
                            // iftrue(Label_0197:, this.a0())
                            // iftrue(Label_0049:, nanos <= 0L)
                            while (true) {
                                while (true) {
                                    this.T();
                                    return;
                                    final long nanoTime;
                                    final long n2;
                                    final long n3 = n2 - nanoTime;
                                    N._thread = null;
                                    this.e0();
                                    c.a();
                                    Block_11: {
                                        Block_9: {
                                            break Block_9;
                                            break Block_11;
                                            Label_0198:
                                            c.a();
                                            final long nanos;
                                            LockSupport.parkNanos(this, nanos);
                                            final long n = n2;
                                            continue Label_0154_Outer;
                                        }
                                        this.T();
                                        return;
                                    }
                                    N._thread = null;
                                    this.e0();
                                    c.a();
                                    continue Block_10_Outer;
                                }
                                Label_0142:
                                return;
                                final long n2;
                                final long n = n2;
                                continue;
                            }
                            Label_0197:
                            return;
                        }
                    }
                    break;
                }
                long n2 = Long.MAX_VALUE;
                continue Label_0154;
            }
        }
    }
    
    @Override
    public void shutdown() {
        N.debugStatus = 4;
        super.shutdown();
    }
}
