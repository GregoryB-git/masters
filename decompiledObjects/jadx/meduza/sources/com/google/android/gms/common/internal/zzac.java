package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import m6.l0;

/* loaded from: classes.dex */
public abstract class zzac extends zzb implements m6.e {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            zzd zzdVar = (zzd) this;
            m6.j.j(zzdVar.f2856a, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar.f2856a.onPostInitHandler(readInt, readStrongBinder, bundle, zzdVar.f2857b);
            zzdVar.f2856a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            l0 l0Var = (l0) zzc.zza(parcel, l0.CREATOR);
            zzc.zzb(parcel);
            zzd zzdVar2 = (zzd) this;
            a aVar = zzdVar2.f2856a;
            m6.j.j(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            m6.j.i(l0Var);
            a.zzj(aVar, l0Var);
            Bundle bundle2 = l0Var.f10292a;
            m6.j.j(zzdVar2.f2856a, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar2.f2856a.onPostInitHandler(readInt2, readStrongBinder2, bundle2, zzdVar2.f2857b);
            zzdVar2.f2856a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
