package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* loaded from: classes.dex */
public final class zzw extends zza {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzv zzvVar, RegisterRequestParams registerRequestParams) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzvVar);
        zzc.zzd(zza, registerRequestParams);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzv zzvVar, SignRequestParams signRequestParams) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzvVar);
        zzc.zzd(zza, signRequestParams);
        zzb(2, zza);
    }
}
