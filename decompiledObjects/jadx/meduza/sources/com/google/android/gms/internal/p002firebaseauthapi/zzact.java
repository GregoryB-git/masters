package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzact extends zzaeg<Void, z0> {
    private final zzagn zzu;
    private final String zzv;

    public zzact(String str, c cVar, String str2, String str3, String str4) {
        super(4);
        j.f("email cannot be null or empty", str);
        zzagn zzagnVar = new zzagn(cVar.f2044q);
        this.zzu = zzagnVar;
        zzagnVar.zzb(str);
        zzagnVar.zza(cVar);
        zzagnVar.zzc(str2);
        zzagnVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }
}
