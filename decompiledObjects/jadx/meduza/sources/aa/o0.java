package aa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f347a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f348b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f349c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f350d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f351e;
    public boolean f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f352a;

        /* renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<Void> f353b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f352a = intent;
        }
    }

    public o0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f350d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.f347a = applicationContext;
        this.f348b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f349c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f350d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            n0 n0Var = this.f351e;
            if (n0Var == null || !n0Var.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f351e.a((a) this.f350d.poll());
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f349c;
        aVar.f353b.getTask().addOnCompleteListener(scheduledExecutorService, new defpackage.e(scheduledExecutorService.schedule(new b.d(aVar, 21), 20L, TimeUnit.SECONDS), 1));
        this.f350d.add(aVar);
        a();
        return aVar.f353b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder l10 = defpackage.f.l("binder is dead. start connection? ");
            l10.append(!this.f);
            Log.d("FirebaseMessaging", l10.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (u6.a.b().a(this.f347a, this.f348b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f = false;
        while (!this.f350d.isEmpty()) {
            ((a) this.f350d.poll()).f353b.trySetResult(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f = false;
        if (iBinder instanceof n0) {
            this.f351e = (n0) iBinder;
            a();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        while (!this.f350d.isEmpty()) {
            ((a) this.f350d.poll()).f353b.trySetResult(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
