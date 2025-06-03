package com.google.android.gms.internal.p002firebaseauthapi;

import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzabv extends zzaeg<Void, z0> {
    private final zzahd zzu;

    public zzabv(String str, String str2, String str3) {
        super(4);
        j.f("code cannot be null or empty", str);
        j.f("new password cannot be null or empty", str2);
        this.zzu = new zzahd(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "confirmPasswordReset";
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
