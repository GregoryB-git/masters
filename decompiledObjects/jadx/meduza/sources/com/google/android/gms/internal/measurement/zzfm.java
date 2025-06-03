package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfm extends zzed.zzb {
    private final /* synthetic */ Intent zzc;
    private final /* synthetic */ zzed zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzed zzedVar, Intent intent) {
        super(zzedVar);
        this.zzc = intent;
        this.zzd = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzd.zzj;
        j.i(zzdlVar);
        zzdlVar.setSgtmDebugInfo(this.zzc);
    }
}
