package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfl extends zzed.zzb {
    private final /* synthetic */ zzed.zzd zzc;
    private final /* synthetic */ zzed zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfl(zzed zzedVar, zzed.zzd zzdVar) {
        super(zzedVar);
        this.zzc = zzdVar;
        this.zzd = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzd.zzj;
        j.i(zzdlVar);
        zzdlVar.registerOnMeasurementEventListener(this.zzc);
    }
}
