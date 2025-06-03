package com.google.android.gms.internal.p002firebaseauthapi;

import c8.p;

/* loaded from: classes.dex */
final class zzaas implements zzaew<zzagw> {
    public final /* synthetic */ zzzv zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzadp zzd;

    public zzaas(zzzv zzzvVar, String str, String str2, zzadp zzadpVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzadpVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        zzaij zzaijVar = new zzaij(zzagwVar.zzc(), this.zzb, this.zzc);
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(zzaijVar, new zzaav(this, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzd.zza(p.a(str));
    }
}
