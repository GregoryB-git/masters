package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import e7.a1;
import e7.b1;
import e7.j2;
import e7.u1;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a1.a implements u1.a {

    /* renamed from: c, reason: collision with root package name */
    public u1 f2895c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b1 b1Var;
        String str;
        if (this.f2895c == null) {
            this.f2895c = new u1(this);
        }
        u1 u1Var = this.f2895c;
        u1Var.getClass();
        a1 zzj = j2.a(context, null, null).zzj();
        if (intent == null) {
            b1Var = zzj.f4063r;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            zzj.f4067w.c("Local receiver got", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                zzj.f4067w.b("Starting wakeful intent.");
                ((AppMeasurementReceiver) u1Var.f4686a).getClass();
                SparseArray<PowerManager.WakeLock> sparseArray = a1.a.f14a;
                synchronized (sparseArray) {
                    int i10 = a1.a.f15b;
                    int i11 = i10 + 1;
                    a1.a.f15b = i11;
                    if (i11 <= 0) {
                        a1.a.f15b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i10);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000L);
                        sparseArray.put(i10, newWakeLock);
                    }
                }
                return;
            }
            if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
                return;
            }
            b1Var = zzj.f4063r;
            str = "Install Referrer Broadcasts are deprecated";
        }
        b1Var.b(str);
    }
}
