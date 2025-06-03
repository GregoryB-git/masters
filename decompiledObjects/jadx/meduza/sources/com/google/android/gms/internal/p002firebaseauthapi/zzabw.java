package com.google.android.gms.internal.p002firebaseauthapi;

import b8.j0;
import c8.s;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import m6.j;

/* loaded from: classes.dex */
final class zzabw extends zzaeg<j0, z0> {
    private final String zzu;
    private final String zzv;

    public zzabw(String str, String str2) {
        super(3);
        j.f("email cannot be null or empty", str);
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zze(this.zzu, this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        List<String> zza;
        if (this.zzl.zza() == null) {
            zza = zzaj.zzh();
        } else {
            zza = this.zzl.zza();
            j.i(zza);
        }
        zzb(new s(zza));
    }
}
