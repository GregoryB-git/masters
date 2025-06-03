package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import b8.s;
import c8.d0;
import c8.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import m6.j;

/* loaded from: classes.dex */
final class zzacb extends zzaeg<s, z0> {
    private final String zzu;

    public zzacb(String str) {
        super(1);
        j.f("refresh token cannot be null", str);
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzu);
        }
        ((z0) this.zze).a(this.zzj, this.zzd);
        zzb(d0.a(this.zzj.zzc()));
    }
}
