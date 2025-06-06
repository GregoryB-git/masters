package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import z5.b;
import z5.c;

/* loaded from: classes.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String str, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        Parcel zzb = zzb(2, zza);
        Bundle bundle2 = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account account, String str, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzc(zza, account);
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        Parcel zzb = zzb(5, zza);
        Bundle bundle2 = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account account) {
        Parcel zza = zza();
        zzc.zzc(zza, account);
        Parcel zzb = zzb(7, zza);
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(8, zza);
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final c zzh(b bVar) {
        Parcel zza = zza();
        zzc.zzc(zza, bVar);
        Parcel zzb = zzb(3, zza);
        c cVar = (c) zzc.zza(zzb, c.CREATOR);
        zzb.recycle();
        return cVar;
    }
}
