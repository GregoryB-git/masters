package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import b7.u;
import b7.x;

/* loaded from: classes.dex */
public final class zzs extends zza {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, u uVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, uVar);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, x xVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, xVar);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
