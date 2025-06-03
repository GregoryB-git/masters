package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.Parcel;
import b7.l;
import b7.m;

/* loaded from: classes.dex */
public final class zzn extends zza {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, l lVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, lVar);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, m mVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, mVar);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
