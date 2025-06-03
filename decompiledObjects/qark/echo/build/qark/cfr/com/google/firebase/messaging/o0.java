/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Queue
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.messaging;

import D2.b;
import V2.e;
import V2.j;
import V2.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.l0;
import com.google.firebase.messaging.m0;
import com.google.firebase.messaging.n0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class o0
implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final Queue d = new ArrayDeque();
    public l0 e;
    public boolean f = false;

    public o0(Context context, String string2) {
        this(context, string2, (ScheduledExecutorService)new ScheduledThreadPoolExecutor(0, (ThreadFactory)new F2.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public o0(Context context, String string2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context = context.getApplicationContext();
        this.b = new Intent(string2).setPackage(context.getPackageName());
        this.c = scheduledExecutorService;
    }

    public final void a() {
        while (!this.d.isEmpty()) {
            ((a)this.d.poll()).d();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            try {
                if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                    Log.d((String)"FirebaseMessaging", (String)"flush queue called");
                }
                do {
                    Object object;
                    if (this.d.isEmpty()) {
                        return;
                    }
                    if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                        Log.d((String)"FirebaseMessaging", (String)"found intent to be delivered");
                    }
                    if ((object = this.e) == null || !object.isBinderAlive()) break;
                    if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                        Log.d((String)"FirebaseMessaging", (String)"binder is alive, sending the intent.");
                    }
                    object = (a)this.d.poll();
                    this.e.c((a)object);
                } while (true);
                this.d();
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
    public j c(Intent object) {
        synchronized (this) {
            try {
                if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                    Log.d((String)"FirebaseMessaging", (String)"new intent queued in the bind-strategy delivery");
                }
                object = new a((Intent)object);
                object.c(this.c);
                this.d.add(object);
                this.b();
                return object.e();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void d() {
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("binder is dead. start connection? ");
            stringBuilder.append(this.f ^ true);
            Log.d((String)"FirebaseMessaging", (String)stringBuilder.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            if (b.b().a(this.a, this.b, this, 65)) {
                return;
            }
            Log.e((String)"FirebaseMessaging", (String)"binding to the service failed");
        }
        catch (SecurityException securityException) {
            Log.e((String)"FirebaseMessaging", (String)"Exception while binding the service", (Throwable)securityException);
        }
        this.f = false;
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            try {
                if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onServiceConnected: ");
                    stringBuilder.append((Object)componentName);
                    Log.d((String)"FirebaseMessaging", (String)stringBuilder.toString());
                }
                this.f = false;
                if (!(iBinder instanceof l0)) {
                    componentName = new StringBuilder();
                    componentName.append("Invalid service connection: ");
                    componentName.append((Object)iBinder);
                    Log.e((String)"FirebaseMessaging", (String)componentName.toString());
                    this.a();
                    return;
                }
                this.e = (l0)iBinder;
                this.b();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onServiceDisconnected: ");
            stringBuilder.append((Object)componentName);
            Log.d((String)"FirebaseMessaging", (String)stringBuilder.toString());
        }
        this.b();
    }

    public static class a {
        public final Intent a;
        public final k b = new k();

        public a(Intent intent) {
            this.a = intent;
        }

        public static /* synthetic */ void a(ScheduledFuture scheduledFuture, j j8) {
            scheduledFuture.cancel(false);
        }

        public static /* synthetic */ void b(a a8) {
            a8.f();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            ScheduledFuture scheduledFuture = scheduledExecutorService.schedule((Runnable)new m0(this), 20L, TimeUnit.SECONDS);
            this.e().c((Executor)scheduledExecutorService, new n0(scheduledFuture));
        }

        public void d() {
            this.b.e(null);
        }

        public j e() {
            return this.b.a();
        }

        public final /* synthetic */ void f() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Service took too long to process intent: ");
            stringBuilder.append(this.a.getAction());
            stringBuilder.append(" finishing.");
            Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
            this.d();
        }
    }

}

