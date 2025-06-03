package com.google.android.gms.internal.p002firebaseauthapi;

import b8.g;
import b8.r;
import b8.w;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzaby extends zzaeg<g, z0> {
    private final w zzu;
    private final String zzv;
    private final String zzw;

    public zzaby(w wVar, String str, String str2) {
        super(2);
        j.i(wVar);
        this.zzu = wVar;
        j.e(str);
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        r rVar = this.zzd;
        if (rVar != null && !rVar.a().equalsIgnoreCase(zza.f2454b.f2430a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((z0) this.zze).a(this.zzj, zza);
            zzb(new k1(zza));
        }
    }
}
