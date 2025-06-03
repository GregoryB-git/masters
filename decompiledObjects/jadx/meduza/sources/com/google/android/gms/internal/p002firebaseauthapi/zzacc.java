package com.google.android.gms.internal.p002firebaseauthapi;

import b8.g;
import b8.h;
import c8.i;
import c8.k1;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzacc extends zzaeg<g, z0> {
    private final h zzu;
    private final String zzv;

    public zzacc(h hVar, String str) {
        super(2);
        if (hVar == null) {
            throw new NullPointerException("credential cannot be null");
        }
        this.zzu = hVar;
        j.f("email cannot be null", hVar.f2080a);
        j.f("password cannot be null", hVar.f2081b);
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        h hVar = this.zzu;
        String str = hVar.f2080a;
        String str2 = hVar.f2081b;
        j.e(str2);
        zzadoVar.zza(str, str2, this.zzd.zze(), this.zzd.G(), this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        i zza = zzabq.zza(this.zzc, this.zzk);
        ((z0) this.zze).a(this.zzj, zza);
        zzb(new k1(zza));
    }
}
