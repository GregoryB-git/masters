// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import V2.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import V2.k;
import android.os.IBinder;
import android.content.ComponentName;
import D2.b;
import V2.j;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import F2.a;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Intent;
import android.content.Context;
import android.content.ServiceConnection;

public class o0 implements ServiceConnection
{
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final Queue d;
    public l0 e;
    public boolean f;
    
    public o0(final Context context, final String s) {
        this(context, s, new ScheduledThreadPoolExecutor(0, new F2.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }
    
    public o0(Context applicationContext, final String s, final ScheduledExecutorService c) {
        this.d = new ArrayDeque();
        this.f = false;
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent(s).setPackage(applicationContext.getPackageName());
        this.c = c;
    }
    
    public final void a() {
        while (!this.d.isEmpty()) {
            this.d.poll().d();
        }
    }
    
    public final void b() {
        // monitorenter(this)
        while (true) {
            try {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "flush queue called");
                }
                while (!this.d.isEmpty()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "found intent to be delivered");
                    }
                    final l0 e = this.e;
                    if (e == null || !e.isBinderAlive()) {
                        this.d();
                        // monitorexit(this)
                        return;
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.e.c((a)this.d.poll());
                }
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public j c(final Intent intent) {
        // monitorenter(this)
        while (true) {
            try {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
                }
                final a a = new a(intent);
                a.c(this.c);
                this.d.add(a);
                this.b();
                // monitorexit(this)
                return a.e();
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(this.f ^ true);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            if (D2.b.b().a(this.a, this.b, (ServiceConnection)this, 65)) {
                return;
            }
            Log.e("FirebaseMessaging", "binding to the service failed");
        }
        catch (SecurityException ex) {
            Log.e("FirebaseMessaging", "Exception while binding the service", (Throwable)ex);
        }
        this.f = false;
        this.a();
    }
    
    public void onServiceConnected(final ComponentName obj, final IBinder obj2) {
        // monitorenter(this)
        while (true) {
            try {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("onServiceConnected: ");
                    sb.append(obj);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                this.f = false;
                if (!(obj2 instanceof l0)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid service connection: ");
                    sb2.append(obj2);
                    Log.e("FirebaseMessaging", sb2.toString());
                    this.a();
                    // monitorexit(this)
                    return;
                }
                this.e = (l0)obj2;
                this.b();
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void onServiceDisconnected(final ComponentName obj) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onServiceDisconnected: ");
            sb.append(obj);
            Log.d("FirebaseMessaging", sb.toString());
        }
        this.b();
    }
    
    public static class a
    {
        public final Intent a;
        public final k b;
        
        public a(final Intent a) {
            this.b = new k();
            this.a = a;
        }
        
        public void c(final ScheduledExecutorService scheduledExecutorService) {
            this.e().c(scheduledExecutorService, new n0(scheduledExecutorService.schedule(new m0(this), 20L, TimeUnit.SECONDS)));
        }
        
        public void d() {
            this.b.e(null);
        }
        
        public j e() {
            return this.b.a();
        }
    }
}
