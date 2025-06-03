package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzacq extends zzaeg<Void, z0> {
    private final zzagn zzu;

    public zzacq(String str, c cVar) {
        super(6);
        j.f("token cannot be null or empty", str);
        zzagn zzagnVar = new zzagn(4);
        this.zzu = zzagnVar;
        zzagnVar.zzd(str);
        if (cVar != null) {
            zzagnVar.zza(cVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }
}
