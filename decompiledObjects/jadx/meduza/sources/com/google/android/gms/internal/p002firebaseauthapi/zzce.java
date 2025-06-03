package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzce {
    public static zzbs zza(zzca zzcaVar, zzcm zzcmVar) {
        if (zzcmVar != null) {
            return zzbs.zza(zzcaVar.zzb());
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void zza(zzbs zzbsVar, zzbz zzbzVar, zzcm zzcmVar) {
        if (zzcmVar == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        zzbzVar.zza(zzbsVar.zzb());
    }
}
