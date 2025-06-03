package com.google.android.gms.internal.p002firebaseauthapi;

import b.z;
import b8.f;
import c8.i;
import c8.z0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacg extends zzaeg<Void, z0> {
    private final zzaic zzu;

    public zzacg(f fVar, String str) {
        super(2);
        if (fVar == null) {
            throw new NullPointerException("credential cannot be null");
        }
        this.zzu = z.K(fVar, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        if (!this.zzd.a().equalsIgnoreCase(zza.f2454b.f2430a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((z0) this.zze).a(this.zzj, zza);
            zzb(null);
        }
    }
}
