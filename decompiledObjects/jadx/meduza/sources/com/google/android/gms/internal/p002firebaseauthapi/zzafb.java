package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c0;
import b8.e0;
import b8.f0;
import u7.h;

/* loaded from: classes.dex */
final class zzafb extends f0 {
    private final /* synthetic */ f0 zza;
    private final /* synthetic */ String zzb;

    public zzafb(f0 f0Var, String str) {
        this.zza = f0Var;
        this.zzb = str;
    }

    @Override // b8.f0
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzafc.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // b8.f0
    public final void onCodeSent(String str, e0 e0Var) {
        this.zza.onCodeSent(str, e0Var);
    }

    @Override // b8.f0
    public final void onVerificationCompleted(c0 c0Var) {
        zzafc.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(c0Var);
    }

    @Override // b8.f0
    public final void onVerificationFailed(h hVar) {
        zzafc.zza.remove(this.zzb);
        this.zza.onVerificationFailed(hVar);
    }
}
