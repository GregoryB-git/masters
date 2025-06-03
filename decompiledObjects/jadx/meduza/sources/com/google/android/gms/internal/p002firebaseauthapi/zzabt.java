package com.google.android.gms.internal.p002firebaseauthapi;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzabt extends zzaeg<Void, z0> {
    private final String zzu;
    private final String zzv;

    public zzabt(String str, String str2) {
        super(7);
        j.f("code cannot be null or empty", str);
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "applyActionCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }
}
