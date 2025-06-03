package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import nc.d0;
import x6.b;

/* loaded from: classes.dex */
public final class zzep extends TimerTask {
    public final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        d0 d0Var;
        zzes zzesVar = this.zza;
        d0Var = zzesVar.zzd;
        b.g0(d0Var, null, new zzeq(zzesVar, null), 3);
    }
}
