package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import nc.d0;
import x6.b;

/* loaded from: classes.dex */
public final class zzai extends TimerTask {
    public final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        d0 d0Var;
        zzan zzanVar = this.zza;
        d0Var = zzanVar.zzb;
        b.g0(d0Var, null, new zzaj(zzanVar, null), 3);
    }
}
