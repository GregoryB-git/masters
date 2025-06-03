package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzadl extends zzaeg<Void, Void> {
    private final zzagn zzu;

    public zzadl(String str, String str2, c cVar) {
        super(6);
        j.e(str);
        j.e(str2);
        j.i(cVar);
        this.zzu = zzagn.zza(cVar, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzc(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }
}
