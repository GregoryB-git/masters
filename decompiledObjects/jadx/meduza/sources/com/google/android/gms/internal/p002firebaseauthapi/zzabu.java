package com.google.android.gms.internal.p002firebaseauthapi;

import b8.g;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzabu extends zzaeg<g, z0> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzabu(String str, String str2, String str3, String str4) {
        super(2);
        j.f("email cannot be null or empty", str);
        j.f("password cannot be null or empty", str2);
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "createUserWithEmailAndPassword";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        ((z0) this.zze).a(this.zzj, zza);
        zzb(new k1(zza));
    }
}
