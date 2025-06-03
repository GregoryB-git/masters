package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.internal.common.zzh;
import java.util.ArrayList;
import m6.k0;

/* loaded from: classes.dex */
public final class h extends zzh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2850a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Looper looper) {
        super(looper);
        this.f2850a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        a.InterfaceC0041a interfaceC0041a;
        a.InterfaceC0041a interfaceC0041a2;
        j6.b bVar;
        j6.b bVar2;
        boolean z10;
        ArrayList arrayList7;
        ArrayList arrayList8;
        if (this.f2850a.zzd.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                k0 k0Var = (k0) message.obj;
                k0Var.b();
                synchronized (k0Var) {
                    k0Var.f10284a = null;
                }
                arrayList7 = k0Var.f10286c.zzt;
                synchronized (arrayList7) {
                    arrayList8 = k0Var.f10286c.zzt;
                    arrayList8.remove(k0Var);
                }
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || ((i11 == 4 && !this.f2850a.enableLocalFallback()) || message.what == 5)) && !this.f2850a.isConnecting()) {
            k0 k0Var2 = (k0) message.obj;
            k0Var2.b();
            synchronized (k0Var2) {
                k0Var2.f10284a = null;
            }
            arrayList = k0Var2.f10286c.zzt;
            synchronized (arrayList) {
                arrayList2 = k0Var2.f10286c.zzt;
                arrayList2.remove(k0Var2);
            }
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            this.f2850a.zzC = new j6.b(message.arg2);
            if (a.zzo(this.f2850a)) {
                a aVar = this.f2850a;
                z10 = aVar.zzD;
                if (!z10) {
                    aVar.zzp(3, null);
                    return;
                }
            }
            a aVar2 = this.f2850a;
            bVar2 = aVar2.zzC;
            j6.b bVar3 = bVar2 != null ? aVar2.zzC : new j6.b(8);
            this.f2850a.zzc.a(bVar3);
            this.f2850a.onConnectionFailed(bVar3);
            return;
        }
        if (i12 == 5) {
            a aVar3 = this.f2850a;
            bVar = aVar3.zzC;
            j6.b bVar4 = bVar != null ? aVar3.zzC : new j6.b(8);
            this.f2850a.zzc.a(bVar4);
            this.f2850a.onConnectionFailed(bVar4);
            return;
        }
        if (i12 == 3) {
            Object obj2 = message.obj;
            j6.b bVar5 = new j6.b(message.arg2, obj2 instanceof PendingIntent ? (PendingIntent) obj2 : null);
            this.f2850a.zzc.a(bVar5);
            this.f2850a.onConnectionFailed(bVar5);
            return;
        }
        if (i12 == 6) {
            this.f2850a.zzp(5, null);
            a aVar4 = this.f2850a;
            interfaceC0041a = aVar4.zzw;
            if (interfaceC0041a != null) {
                interfaceC0041a2 = aVar4.zzw;
                interfaceC0041a2.r(message.arg2);
            }
            this.f2850a.onConnectionSuspended(message.arg2);
            a.zzn(this.f2850a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f2850a.isConnected()) {
            k0 k0Var3 = (k0) message.obj;
            k0Var3.b();
            synchronized (k0Var3) {
                k0Var3.f10284a = null;
            }
            arrayList5 = k0Var3.f10286c.zzt;
            synchronized (arrayList5) {
                arrayList6 = k0Var3.f10286c.zzt;
                arrayList6.remove(k0Var3);
            }
            return;
        }
        int i13 = message.what;
        if (!(i13 == 2 || i13 == 1 || i13 == 7)) {
            Log.wtf("GmsClient", defpackage.f.h("Don't know how to handle message: ", i13), new Exception());
            return;
        }
        k0 k0Var4 = (k0) message.obj;
        synchronized (k0Var4) {
            obj = k0Var4.f10284a;
            if (k0Var4.f10285b) {
                Log.w("GmsClient", "Callback proxy " + k0Var4.toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                k0Var4.a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (k0Var4) {
            k0Var4.f10285b = true;
        }
        synchronized (k0Var4) {
            k0Var4.f10284a = null;
        }
        arrayList3 = k0Var4.f10286c.zzt;
        synchronized (arrayList3) {
            arrayList4 = k0Var4.f10286c.zzt;
            arrayList4.remove(k0Var4);
        }
    }
}
