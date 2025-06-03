package com.google.android.gms.internal.p002firebaseauthapi;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzadc extends zzaeg<Void, z0> {
    private final String zzu;
    private final String zzv;
    private final String zzw;

    public zzadc(String str, String str2, String str3) {
        super(2);
        j.e(str);
        this.zzu = str;
        j.e(str2);
        this.zzv = str2;
        this.zzw = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        ((z0) this.zze).a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
