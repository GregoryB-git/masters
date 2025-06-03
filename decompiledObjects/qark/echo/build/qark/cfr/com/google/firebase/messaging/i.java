/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package com.google.firebase.messaging;

import V2.e;
import V2.j;
import V2.k;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.g;
import com.google.firebase.messaging.h;
import com.google.firebase.messaging.j0;
import com.google.firebase.messaging.l0;
import com.google.firebase.messaging.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r1.m;

public abstract class i
extends Service {
    static final long MESSAGE_TIMEOUT_S = 20L;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor = o.d();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    public static /* synthetic */ void a(i i8, Intent intent, k k8) {
        i8.e(intent, k8);
    }

    public static /* synthetic */ void b(i i8, Intent intent, j j8) {
        i8.d(intent, j8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Intent object) {
        if (object != null) {
            j0.c((Intent)object);
        }
        object = this.lock;
        synchronized (object) {
            try {
                int n8;
                this.runningTasks = n8 = this.runningTasks - 1;
                if (n8 == 0) {
                    this.stopSelfResultHook(this.lastStartId);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final /* synthetic */ void d(Intent intent, j j8) {
        this.c(intent);
    }

    public final /* synthetic */ void e(Intent intent, k k8) {
        try {
            this.handleIntent(intent);
            return;
        }
        finally {
            k8.c(null);
        }
    }

    public final j f(Intent intent) {
        if (this.handleIntentOnMainThread(intent)) {
            return V2.m.e(null);
        }
        k k8 = new k();
        this.executor.execute((Runnable)new h(this, intent, k8));
        return k8.a();
    }

    public abstract Intent getStartCommandIntent(Intent var1);

    public abstract void handleIntent(Intent var1);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IBinder onBind(Intent intent) {
        synchronized (this) {
            try {
                if (Log.isLoggable((String)"EnhancedIntentService", (int)3)) {
                    Log.d((String)"EnhancedIntentService", (String)"Service received bind request");
                }
                if (this.binder != null) return this.binder;
                this.binder = new l0(new l0.a(){

                    @Override
                    public j a(Intent intent) {
                        return i.this.f(intent);
                    }
                });
                return this.binder;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onStartCommand(Intent intent, int n8, int n9) {
        Object object = this.lock;
        synchronized (object) {
            this.lastStartId = n9;
            ++this.runningTasks;
        }
        object = this.getStartCommandIntent(intent);
        if (object == null) {
            this.c(intent);
            return 2;
        }
        if ((object = this.f((Intent)object)).m()) {
            this.c(intent);
            return 2;
        }
        object.c(new m(), new g(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int n8) {
        return this.stopSelfResult(n8);
    }

}

