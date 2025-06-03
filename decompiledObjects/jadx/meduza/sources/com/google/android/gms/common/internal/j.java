package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import m6.a0;

/* loaded from: classes.dex */
public final class j extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f2854h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, int i10, IBinder iBinder, Bundle bundle) {
        super(aVar, i10, bundle);
        this.f2854h = aVar;
        this.f2853g = iBinder;
    }

    @Override // m6.a0
    public final void c(j6.b bVar) {
        if (this.f2854h.zzx != null) {
            this.f2854h.zzx.g(bVar);
        }
        this.f2854h.onConnectionFailed(bVar);
    }

    @Override // m6.a0
    public final boolean d() {
        String str;
        String interfaceDescriptor;
        a.InterfaceC0041a interfaceC0041a;
        a.InterfaceC0041a interfaceC0041a2;
        try {
            IBinder iBinder = this.f2853g;
            m6.j.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f2854h.getServiceDescriptor().equals(interfaceDescriptor)) {
            str = a0.j.k("service descriptor mismatch: ", this.f2854h.getServiceDescriptor(), " vs. ", interfaceDescriptor);
            Log.w("GmsClient", str);
            return false;
        }
        IInterface createServiceInterface = this.f2854h.createServiceInterface(this.f2853g);
        if (createServiceInterface == null) {
            return false;
        }
        if (!a.zzn(this.f2854h, 2, 4, createServiceInterface) && !a.zzn(this.f2854h, 3, 4, createServiceInterface)) {
            return false;
        }
        this.f2854h.zzC = null;
        a aVar = this.f2854h;
        Bundle connectionHint = aVar.getConnectionHint();
        interfaceC0041a = aVar.zzw;
        if (interfaceC0041a != null) {
            interfaceC0041a2 = this.f2854h.zzw;
            interfaceC0041a2.s(connectionHint);
        }
        return true;
    }
}
