package com.google.android.gms.internal.p002firebaseauthapi;

import c8.p;

/* loaded from: classes.dex */
final class zzaaq implements zzaew<zzagw> {
    public final /* synthetic */ zzzv zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzadp zzc;

    public zzaaq(zzzv zzzvVar, String str, zzadp zzadpVar) {
        this.zzb = str;
        this.zzc = zzadpVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        zzagw zzagwVar2 = zzagwVar;
        zzagj zzagjVar = new zzagj(zzagwVar2.zzc());
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(zzagjVar, new zzaat(this, this, zzagwVar2, this.zzb, this.zzc));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzc.zza(p.a(str));
    }
}
