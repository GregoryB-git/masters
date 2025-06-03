package com.google.android.gms.internal.p002firebaseauthapi;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzadh extends zzaeg<Void, z0> {
    private final String zzu;

    public zzadh(String str) {
        super(2);
        j.f("email cannot be null or empty", str);
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "updateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzd.zze(), this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        ((z0) this.zze).a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
