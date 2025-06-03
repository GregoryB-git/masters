package com.google.android.gms.internal.p002firebaseauthapi;

import c8.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzada extends zzaeg<zzahs, Void> {
    private final zzahv zzu;

    public zzada(n nVar, String str) {
        super(12);
        j.i(nVar);
        String str2 = nVar.f2490a;
        j.e(str2);
        this.zzu = zzahv.zza(str2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(this.zzt);
    }
}
