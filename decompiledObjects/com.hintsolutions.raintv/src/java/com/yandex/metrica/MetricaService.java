/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.F0
 *  com.yandex.metrica.impl.ob.Il
 *  com.yandex.metrica.impl.ob.k2
 *  com.yandex.metrica.impl.ob.p1
 *  com.yandex.metrica.impl.ob.q1
 *  com.yandex.metrica.impl.ob.r1
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Il;
import com.yandex.metrica.impl.ob.k2;
import com.yandex.metrica.impl.ob.p1;
import com.yandex.metrica.impl.ob.q1;
import com.yandex.metrica.impl.ob.r1;

public class MetricaService
extends Service {
    private static p1 c;
    private final d a = new d(this){
        public final MetricaService a;
        {
            this.a = metricaService;
        }

        @Override
        public void a(int n) {
            this.a.stopSelfResult(n);
        }
    };
    private final IMetricaService.a b = new IMetricaService.a(this){

        @Override
        public void a(int n, Bundle bundle) throws RemoteException {
            c.a(n, bundle);
        }

        @Override
        public void a(@NonNull Bundle bundle) throws RemoteException {
            c.a(bundle);
        }

        @Override
        public void b(@NonNull Bundle bundle) throws RemoteException {
            c.b(bundle);
        }

        @Override
        public void reportData(Bundle bundle) throws RemoteException {
            c.reportData(bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        Binder binder = "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals((Object)intent.getAction()) ? new c() : this.b;
        c.a(intent);
        return binder;
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        F0.a((Context)this.getApplicationContext());
        Il.a((Context)this.getApplicationContext());
        p1 p12 = c;
        if (p12 == null) {
            c = new q1((p1)new r1(this.getApplicationContext(), this.a));
        } else {
            p12.a(this.a);
        }
        c.a();
        F0.g().a(new k2(c));
    }

    public void onDestroy() {
        c.b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
        c.c(intent);
    }

    public void onStart(Intent intent, int n) {
        c.a(intent, n);
    }

    public int onStartCommand(Intent intent, int n, int n2) {
        c.a(intent, n, n2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        c.b(intent);
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals((Object)intent.getAction())) {
            return false;
        }
        boolean bl = intent.getData() == null;
        return !bl;
    }

    public static class c
    extends Binder {
    }

    public static interface d {
        public void a(int var1);
    }
}

