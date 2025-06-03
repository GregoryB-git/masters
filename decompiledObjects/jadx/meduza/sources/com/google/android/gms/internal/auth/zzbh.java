package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import f6.a;

/* loaded from: classes.dex */
public final class zzbh extends zza {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, a aVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbgVar);
        zzc.zzc(zza, aVar);
        zzc(1, zza);
    }
}
