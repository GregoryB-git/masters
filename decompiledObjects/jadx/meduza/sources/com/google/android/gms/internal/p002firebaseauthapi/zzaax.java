package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import c8.p;

/* loaded from: classes.dex */
final class zzaax implements zzaew<zzahs> {
    private final /* synthetic */ zzahp zza;
    private final /* synthetic */ zzadp zzb;

    public zzaax(zzzv zzzvVar, zzahp zzahpVar, zzadp zzadpVar) {
        this.zza = zzahpVar;
        this.zzb = zzadpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzahs zzahsVar) {
        zzahs zzahsVar2 = zzahsVar;
        zzahp zzahpVar = this.zza;
        if (zzahpVar instanceof zzaht) {
            this.zzb.zzb(zzahsVar2.zza());
        } else {
            if (!(zzahpVar instanceof zzahv)) {
                throw new IllegalArgumentException(j.j("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
            }
            this.zzb.zza(zzahsVar2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(p.a(str));
    }
}
