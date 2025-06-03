package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zznw {
    private final zzbq zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    private zznw(zzbq zzbqVar, int i10, String str, String str2) {
        this.zza = zzbqVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznw)) {
            return false;
        }
        zznw zznwVar = (zznw) obj;
        return this.zza == zznwVar.zza && this.zzb == zznwVar.zzb && this.zzc.equals(zznwVar.zzc) && this.zzd.equals(zznwVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
