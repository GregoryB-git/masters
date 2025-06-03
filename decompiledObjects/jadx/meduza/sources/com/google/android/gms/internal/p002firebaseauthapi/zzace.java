package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c0;
import b8.g;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzace extends zzaeg<g, z0> {
    private final c0 zzu;

    public zzace(c0 c0Var) {
        super(2);
        if (c0Var == null) {
            throw new NullPointerException("credential cannot be null");
        }
        this.zzu = c0Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "linkPhoneAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(new zzaha(this.zzd.zze(), zzaex.zza(this.zzu)), this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        ((z0) this.zze).a(this.zzj, zza);
        zzb(new k1(zza));
    }
}
