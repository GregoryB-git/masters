/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Future
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.PriorityBlockingQueue
 *  java.util.concurrent.Semaphore
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import A2.n;
import E2.e;
import R2.C;
import R2.J2;
import R2.K2;
import R2.L2;
import R2.N2;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.f;
import R2.g;
import R2.l2;
import R2.l3;
import R2.m3;
import android.content.Context;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class G2
extends l3 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public K2 c;
    public K2 d;
    public final PriorityBlockingQueue e = new PriorityBlockingQueue();
    public final BlockingQueue f = new LinkedBlockingQueue();
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i = new Object();
    public final Semaphore j = new Semaphore(2);
    public volatile boolean k;

    public G2(N2 n22) {
        super(n22);
        this.g = new J2(this, "Thread death: Uncaught exception on worker thread");
        this.h = new J2(this, "Thread death: Uncaught exception on network thread");
    }

    public final Future B(Callable object) {
        this.o();
        n.i(object);
        object = new L2(this, (Callable)object, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            object.run();
            return object;
        }
        this.y((L2)((Object)object));
        return object;
    }

    public final void D(Runnable runnable) {
        this.o();
        n.i((Object)runnable);
        this.y(new L2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        this.o();
        n.i((Object)runnable);
        this.y(new L2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        if (Thread.currentThread() == this.c) {
            return true;
        }
        return false;
    }

    @Override
    public final void l() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override
    public final void n() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override
    public final boolean s() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object v(AtomicReference object, long l8, String string2, Runnable object2) {
        synchronized (object) {
            try {
                this.e().D((Runnable)object2);
                try {
                    object.wait(l8);
                    // MONITOREXIT [0, 1, 3] lbl6 : MonitorExitStatement: MONITOREXIT : var1_1
                }
                catch (InterruptedException interruptedException) {}
                object = object.get();
                if (object == null) {
                    object2 = this.j().L();
                    StringBuilder stringBuilder = new StringBuilder("Timed out waiting for ");
                    stringBuilder.append(string2);
                    object2.a(stringBuilder.toString());
                }
                return object;
                a2 a22 = this.j().L();
                StringBuilder stringBuilder = new StringBuilder("Interrupted waiting for ");
                stringBuilder.append(string2);
                a22.a(stringBuilder.toString());
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Future w(Callable object) {
        this.o();
        n.i(object);
        object = new L2(this, (Callable)object, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                this.j().L().a("Callable skipped the worker queue.");
            }
            object.run();
            return object;
        }
        this.y((L2)((Object)object));
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void y(L2 object) {
        Object object2 = this.i;
        synchronized (object2) {
            try {
                this.e.add(object);
                object = this.c;
                if (object == null) {
                    this.c = object = new K2(this, "Measurement Worker", (BlockingQueue)this.e);
                    object.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    object.a();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(Runnable object) {
        this.o();
        n.i(object);
        Object object2 = new L2(this, (Runnable)object, false, "Task exception on network thread");
        object = this.i;
        synchronized (object) {
            try {
                this.f.add(object2);
                object2 = this.d;
                if (object2 == null) {
                    this.d = object2 = new K2(this, "Measurement Network", this.f);
                    object2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    object2.a();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

