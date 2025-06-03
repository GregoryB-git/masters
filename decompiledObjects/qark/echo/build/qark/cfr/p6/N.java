/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.locks.LockSupport
 */
package p6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import l6.d;
import p6.L0;
import p6.a0;
import p6.b0;
import p6.c;

public final class N
extends b0
implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final N w;
    public static final long x;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        N n8;
        TimeUnit timeUnit;
        block2 : {
            w = n8 = new N();
            a0.N(n8, false, 1, null);
            timeUnit = TimeUnit.MILLISECONDS;
            try {
                n8 = Long.getLong((String)"kotlinx.coroutines.DefaultExecutor.keepAlive", (long)1000L);
                break block2;
            }
            catch (SecurityException securityException) {}
            n8 = Long.valueOf((long)1000L);
        }
        x = timeUnit.toNanos(n8.longValue());
    }

    @Override
    public Thread T() {
        Thread thread;
        Thread thread2 = thread = _thread;
        if (thread == null) {
            thread2 = this.f0();
        }
        return thread2;
    }

    @Override
    public void X(Runnable runnable) {
        if (this.g0()) {
            this.j0();
        }
        super.X(runnable);
    }

    public final void e0() {
        synchronized (this) {
            block4 : {
                boolean bl = this.h0();
                if (bl) break block4;
                return;
            }
            debugStatus = 3;
            this.c0();
            Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return;
        }
    }

    public final Thread f0() {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                Thread thread;
                block4 : {
                    try {
                        Thread thread2;
                        thread = thread2 = _thread;
                        if (thread2 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    _thread = thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                    thread.setDaemon(true);
                    thread.start();
                }
                return thread;
            }
            throw throwable2;
        }
    }

    public final boolean g0() {
        if (debugStatus == 4) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        int n8 = debugStatus;
        if (n8 != 2 && n8 != 3) {
            return false;
        }
        return true;
    }

    public final boolean i0() {
        synchronized (this) {
            block4 : {
                boolean bl = this.h0();
                if (!bl) break block4;
                return false;
            }
            debugStatus = 1;
            Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return true;
        }
    }

    public final void j0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        block7 : {
            L0.a.d(this);
            c.a();
            try {
                var1_1 = this.i0();
                if (var1_1) break block7;
            }
            catch (Throwable var10_6) {}
            N._thread = null;
            this.e0();
            c.a();
            if (this.a0() != false) return;
            this.T();
            return;
        }
        var2_2 = Long.MAX_VALUE;
        do {
            Thread.interrupted();
            var6_4 = this.Q();
            if (var6_4 != Long.MAX_VALUE) ** GOTO lbl37
            c.a();
            var8_5 = System.nanoTime();
            var4_3 = var2_2;
            if (var2_2 != Long.MAX_VALUE) break block8;
            var2_2 = N.x;
            break;
        } while (true);
        {
            block9 : {
                block10 : {
                    block8 : {
                        var4_3 = var2_2 + var8_5;
                    }
                    if ((var2_2 = var4_3 - var8_5) <= 0L) {
                        N._thread = null;
                        this.e0();
                        c.a();
                        if (this.a0() != false) return;
                        this.T();
                        return;
                    }
                    var6_4 = d.c(var6_4, var2_2);
                    break block10;
lbl37: // 1 sources:
                    var4_3 = Long.MAX_VALUE;
                }
                var2_2 = var4_3;
                if (var6_4 <= 0L) continue;
                var1_1 = this.h0();
                if (!var1_1) break block9;
                N._thread = null;
                this.e0();
                c.a();
                if (this.a0() != false) return;
                this.T();
                return;
            }
            c.a();
            LockSupport.parkNanos((Object)this, (long)var6_4);
            var2_2 = var4_3;
            continue;
        }
        N._thread = null;
        this.e0();
        c.a();
        if (this.a0() != false) throw var10_6;
        this.T();
        throw var10_6;
    }

    @Override
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}

