package com.google.android.gms.internal.p002firebaseauthapi;

import b8.g;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzacx extends zzaeg<g, z0> {
    private final zzaid zzu;

    public zzacx(String str, String str2) {
        super(2);
        j.f("token cannot be null or empty", str);
        this.zzu = new zzaid(str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "signInWithCustomToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        ((z0) this.zze).a(this.zzj, zza);
        zzb(new k1(zza));
    }
}
