package com.google.android.gms.internal.p002firebaseauthapi;

import b8.f0;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzael implements zzaen {
    private final /* synthetic */ Status zza;

    public zzael(zzaei zzaeiVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaen
    public final void zza(f0 f0Var, Object... objArr) {
        f0Var.onVerificationFailed(zzadr.zza(this.zza));
    }
}
