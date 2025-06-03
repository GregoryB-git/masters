package com.google.android.gms.internal.p002firebaseauthapi;

import c8.p;

/* loaded from: classes.dex */
final class zzabm implements zzaew<zzagw> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzzv zzc;

    public zzabm(zzzv zzzvVar, String str, zzadp zzadpVar) {
        this.zza = str;
        this.zzb = zzadpVar;
        this.zzc = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzagw zzagwVar2 = zzagwVar;
        String zzc = zzagwVar2.zzc();
        zzahm zzahmVar = new zzahm();
        zzahmVar.zzd(zzc).zzf(this.zza);
        zzzv.zza(this.zzc, this.zzb, zzagwVar2, zzahmVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(p.a(str));
    }
}
