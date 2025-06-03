package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzig;
import e7.a1;
import e7.i6;
import e7.j2;
import e7.m5;
import e7.o5;
import i6.t;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements o5 {

    /* renamed from: a, reason: collision with root package name */
    public m5<AppMeasurementService> f2896a;

    @Override // e7.o5
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a1.a.f14a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = a1.a.f14a;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray2.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    @Override // e7.o5
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final m5<AppMeasurementService> c() {
        if (this.f2896a == null) {
            this.f2896a = new m5<>(this);
        }
        return this.f2896a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m5<AppMeasurementService> c10 = c();
        if (intent == null) {
            c10.b().f4060o.b("onBind called with null intent");
            return null;
        }
        c10.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzig(i6.f(c10.f4496a));
        }
        c10.b().f4063r.c("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        j2.a(c().f4496a, null, null).zzj().f4067w.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        j2.a(c().f4496a, null, null).zzj().f4067w.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().a(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        final m5<AppMeasurementService> c10 = c();
        final a1 zzj = j2.a(c10.f4496a, null, null).zzj();
        if (intent == null) {
            zzj.f4063r.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.f4067w.d("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: e7.n5
            @Override // java.lang.Runnable
            public final void run() {
                m5 m5Var = m5.this;
                int i12 = i11;
                a1 a1Var = zzj;
                Intent intent2 = intent;
                if (m5Var.f4496a.zza(i12)) {
                    a1Var.f4067w.c("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i12));
                    m5Var.b().f4067w.b("Completed wakeful intent.");
                    m5Var.f4496a.a(intent2);
                }
            }
        };
        i6 f = i6.f(c10.f4496a);
        f.zzl().u(new t(f, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().c(intent);
        return true;
    }

    @Override // e7.o5
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
