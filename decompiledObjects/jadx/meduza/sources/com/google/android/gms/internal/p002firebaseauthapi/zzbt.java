package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzbt {
    private boolean zza;
    private zzbq zzb;
    private final zzcg zzc;
    private zzbw zzd;
    private zzbu zze;

    private zzbt(zzcg zzcgVar) {
        this.zzb = zzbq.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzcgVar;
    }

    public final zzbt zza() {
        zzbu zzbuVar = this.zze;
        if (zzbuVar != null) {
            zzbuVar.zzb();
        }
        this.zza = true;
        return this;
    }

    public final zzbt zzb() {
        zzbw zzbwVar;
        zzbwVar = zzbw.zza;
        this.zzd = zzbwVar;
        return this;
    }
}
