/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Debug
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.Thread
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package com.yandex.metrica.impl.ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {
    private static final long f = TimeUnit.SECONDS.toMillis(1L);
    private final b a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Thread c = new c(this);
    private final AtomicBoolean d = new AtomicBoolean();
    private final Runnable e = new Runnable(this){
        public final a a;
        {
            this.a = a10;
        }

        public void run() {
            this.a.d.set(true);
        }
    };

    public a(b b3) {
        this.a = b3;
    }

    @VisibleForTesting
    public void b() {
        this.a.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        try {
            this.c.setName("CR-WatchDog");
        }
        catch (SecurityException securityException) {}
        this.c.start();
    }

    public static interface b {
        @WorkerThread
        public void a();
    }

    public class c
    extends Thread {
        public final a a;

        public c(a a10) {
            this.a = a10;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void run() {
            boolean bl = false;
            int n2 = 0;
            while (!this.isInterrupted()) {
                if (!bl) {
                    this.a.d.set(false);
                    this.a.b.post(this.a.e);
                    n2 = 0;
                }
                try {
                    Thread.sleep((long)f);
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
                if (!this.a.d.get()) {
                    if (++n2 == 4 && !Debug.isDebuggerConnected()) {
                        this.a.b();
                    }
                    bl = true;
                    continue;
                }
                bl = false;
            }
        }
    }
}

