package com.google.android.gms.internal.p002firebaseauthapi;

import c8.p;

/* loaded from: classes.dex */
final class zzaah implements zzaew<zzaig> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzaah(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaig zzaigVar) {
        zzaig zzaigVar2 = zzaigVar;
        this.zzb.zza(new zzagw(zzaigVar2.zzc(), zzaigVar2.zzb(), Long.valueOf(zzaigVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaigVar2.zzd()), null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(p.a(str));
    }
}
