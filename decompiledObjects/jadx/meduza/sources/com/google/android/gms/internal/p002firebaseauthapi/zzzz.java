package com.google.android.gms.internal.p002firebaseauthapi;

import b8.h;
import c8.p;

/* loaded from: classes.dex */
final class zzzz implements zzaew<zzagw> {
    private final /* synthetic */ h zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzadp zzc;
    private final /* synthetic */ zzzv zzd;

    public zzzz(zzzv zzzvVar, h hVar, String str, zzadp zzadpVar) {
        this.zza = hVar;
        this.zzb = str;
        this.zzc = zzadpVar;
        this.zzd = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        this.zzd.zza(new zzafy(this.zza, zzagwVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzc.zza(p.a(str));
    }
}
