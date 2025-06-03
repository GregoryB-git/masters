package com.google.android.gms.internal.p002firebaseauthapi;

import b8.p0;
import c8.p;

/* loaded from: classes.dex */
final class zzabk implements zzaew<zzagw> {
    private final /* synthetic */ p0 zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzzv zzc;

    public zzabk(zzzv zzzvVar, p0 p0Var, zzadp zzadpVar) {
        this.zza = p0Var;
        this.zzb = zzadpVar;
        this.zzc = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final void zza(zzagw zzagwVar) {
        zzagw zzagwVar2 = zzagwVar;
        zzahm zzahmVar = new zzahm();
        zzahmVar.zzd(zzagwVar2.zzc());
        p0 p0Var = this.zza;
        if (p0Var.f2127c || p0Var.f2125a != null) {
            zzahmVar.zzb(p0Var.f2125a);
        }
        p0 p0Var2 = this.zza;
        if (p0Var2.f2128d || p0Var2.f2129e != null) {
            zzahmVar.zzg(p0Var2.f2126b);
        }
        zzzv.zza(this.zzc, this.zzb, zzagwVar2, zzahmVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(p.a(str));
    }
}
