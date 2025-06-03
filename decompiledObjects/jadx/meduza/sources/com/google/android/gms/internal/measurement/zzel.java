package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzel extends zzed.zzb {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzed zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzed zzedVar, Boolean bool) {
        super(zzedVar);
        this.zzc = bool;
        this.zzd = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdl zzdlVar2;
        if (this.zzc != null) {
            zzdlVar2 = this.zzd.zzj;
            j.i(zzdlVar2);
            zzdlVar2.setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzdlVar = this.zzd.zzj;
            j.i(zzdlVar);
            zzdlVar.clearMeasurementEnabled(this.zza);
        }
    }
}
