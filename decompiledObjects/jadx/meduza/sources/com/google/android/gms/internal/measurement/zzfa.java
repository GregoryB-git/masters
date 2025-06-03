package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfa extends zzed.zzb {
    private final /* synthetic */ zzdm zzc;
    private final /* synthetic */ zzed zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfa(zzed zzedVar, zzdm zzdmVar) {
        super(zzedVar);
        this.zzc = zzdmVar;
        this.zzd = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzd.zzj;
        j.i(zzdlVar);
        zzdlVar.getCurrentScreenName(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
