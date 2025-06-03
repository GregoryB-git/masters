package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0654e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.o0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11802a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f11803b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11804c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f11805d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f11806e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11807f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f11808a;

        /* renamed from: b, reason: collision with root package name */
        public final C0660k f11809b = new C0660k();

        public a(Intent intent) {
            this.f11808a = intent;
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.m0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().c(scheduledExecutorService, new InterfaceC0654e() { // from class: com.google.firebase.messaging.n0
                @Override // V2.InterfaceC0654e
                public final void a(AbstractC0659j abstractC0659j) {
                    schedule.cancel(false);
                }
            });
        }

        public void d() {
            this.f11809b.e(null);
        }

        public AbstractC0659j e() {
            return this.f11809b.a();
        }

        public final /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f11808a.getAction() + " finishing.");
            d();
        }
    }

    public o0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new F2.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final void a() {
        while (!this.f11805d.isEmpty()) {
            ((a) this.f11805d.poll()).d();
        }
    }

    public final synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f11805d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                l0 l0Var = this.f11806e;
                if (l0Var == null || !l0Var.isBinderAlive()) {
                    d();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f11806e.c((a) this.f11805d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized AbstractC0659j c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f11804c);
            this.f11805d.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f11807f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f11807f) {
            return;
        }
        this.f11807f = true;
        try {
        } catch (SecurityException e7) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e7);
        }
        if (D2.b.b().a(this.f11802a, this.f11803b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f11807f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f11807f = false;
            if (iBinder instanceof l0) {
                this.f11806e = (l0) iBinder;
                b();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    public o0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f11805d = new ArrayDeque();
        this.f11807f = false;
        Context applicationContext = context.getApplicationContext();
        this.f11802a = applicationContext;
        this.f11803b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f11804c = scheduledExecutorService;
    }
}
