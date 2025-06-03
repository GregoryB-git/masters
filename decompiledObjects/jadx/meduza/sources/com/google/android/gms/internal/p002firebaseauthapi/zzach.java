package com.google.android.gms.internal.p002firebaseauthapi;

import b8.g;
import b8.h;
import b8.r;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzach extends zzaeg<g, z0> {
    private final h zzu;

    public zzach(h hVar) {
        super(2);
        if (hVar == null) {
            throw new NullPointerException("credential cannot be null");
        }
        this.zzu = hVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        h hVar = this.zzu;
        r rVar = this.zzd;
        hVar.getClass();
        hVar.f2083d = rVar.zze();
        hVar.f2084e = true;
        zzadoVar.zza(new zzafy(hVar, null, null), this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        ((z0) this.zze).a(this.zzj, zza);
        zzb(new k1(zza));
    }
}
