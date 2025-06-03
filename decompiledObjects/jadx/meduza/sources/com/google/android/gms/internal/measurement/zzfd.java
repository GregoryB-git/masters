package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfd extends zzed.zzb {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzdm zzd;
    private final /* synthetic */ zzed zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(zzed zzedVar, Bundle bundle, zzdm zzdmVar) {
        super(zzedVar);
        this.zzc = bundle;
        this.zzd = zzdmVar;
        this.zze = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zze.zzj;
        j.i(zzdlVar);
        zzdlVar.performAction(this.zzc, this.zzd, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
