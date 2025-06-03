// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import V2.e;
import java.util.concurrent.Executor;
import android.util.Log;
import android.os.IBinder;
import V2.m;
import V2.j;
import V2.k;
import android.content.Intent;
import java.util.concurrent.ExecutorService;
import android.os.Binder;
import android.app.Service;

public abstract class i extends Service
{
    static final long MESSAGE_TIMEOUT_S = 20L;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;
    
    public i() {
        this.executor = o.d();
        this.lock = new Object();
        this.runningTasks = 0;
    }
    
    public final void c(Intent lock) {
        if (lock != null) {
            j0.c(lock);
        }
        lock = (Intent)this.lock;
        // monitorenter(lock)
        while (true) {
            try {
                final int runningTasks = this.runningTasks - 1;
                this.runningTasks = runningTasks;
                if (runningTasks == 0) {
                    this.stopSelfResultHook(this.lastStartId);
                }
                // monitorexit(lock)
                return;
                // monitorexit(lock)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final j f(final Intent intent) {
        if (this.handleIntentOnMainThread(intent)) {
            return m.e(null);
        }
        final k k = new k();
        this.executor.execute(new h(this, intent, k));
        return k.a();
    }
    
    public abstract Intent getStartCommandIntent(final Intent p0);
    
    public abstract void handleIntent(final Intent p0);
    
    public boolean handleIntentOnMainThread(final Intent intent) {
        return false;
    }
    
    public final IBinder onBind(final Intent intent) {
        // monitorenter(this)
        while (true) {
            try {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "Service received bind request");
                }
                if (this.binder == null) {
                    this.binder = new l0((l0.a)new l0.a() {
                        @Override
                        public j a(final Intent intent) {
                            return i.this.f(intent);
                        }
                    });
                }
                final Binder binder = this.binder;
                // monitorexit(this)
                return (IBinder)binder;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int lastStartId) {
        Object o = this.lock;
        synchronized (o) {
            this.lastStartId = lastStartId;
            ++this.runningTasks;
            // monitorexit(o)
            o = this.getStartCommandIntent(intent);
            if (o == null) {
                this.c(intent);
                return 2;
            }
            o = this.f((Intent)o);
            if (((j)o).m()) {
                this.c(intent);
                return 2;
            }
            ((j)o).c(new r1.m(), new g(this, intent));
            return 3;
        }
    }
    
    public boolean stopSelfResultHook(final int n) {
        return this.stopSelfResult(n);
    }
}
