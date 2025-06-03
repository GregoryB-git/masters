/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 *  java.lang.ref.WeakReference
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package s2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import s2.a;

public final class c
extends Thread {
    public final WeakReference o;
    public final long p;
    public final CountDownLatch q;
    public boolean r;

    public c(a a8, long l8) {
        this.o = new WeakReference((Object)a8);
        this.p = l8;
        this.q = new CountDownLatch(1);
        this.r = false;
        this.start();
    }

    public final void a() {
        a a8 = (a)this.o.get();
        if (a8 != null) {
            a8.c();
            this.r = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            if (!this.q.await(this.p, TimeUnit.MILLISECONDS)) {
                this.a();
            }
            return;
        }
        catch (InterruptedException interruptedException) {}
        this.a();
    }
}

