package com.google.android.gms.internal.p002firebaseauthapi;

import b8.e0;
import b8.f0;

/* loaded from: classes.dex */
final class zzaek implements zzaen {
    private final /* synthetic */ String zza;

    public zzaek(zzaei zzaeiVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaen
    public final void zza(f0 f0Var, Object... objArr) {
        f0Var.onCodeSent(this.zza, new e0());
    }
}
