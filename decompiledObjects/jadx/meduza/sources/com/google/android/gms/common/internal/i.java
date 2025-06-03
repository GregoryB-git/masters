package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class i implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2852b;

    public i(a aVar, int i10) {
        this.f2852b = aVar;
        this.f2851a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        a aVar = this.f2852b;
        if (iBinder == null) {
            a.zzk(aVar, 16);
            return;
        }
        obj = aVar.zzq;
        synchronized (obj) {
            a aVar2 = this.f2852b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            aVar2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new g(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }
        this.f2852b.zzl(0, null, this.f2851a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f2852b.zzq;
        synchronized (obj) {
            this.f2852b.zzr = null;
        }
        a aVar = this.f2852b;
        int i10 = this.f2851a;
        Handler handler = aVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
