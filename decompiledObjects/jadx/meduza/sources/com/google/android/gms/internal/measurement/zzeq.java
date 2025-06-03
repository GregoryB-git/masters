package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzeq extends zzed.zzb {
    private final /* synthetic */ zzed zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzed zzedVar) {
        super(zzedVar);
        this.zzc = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzc.zzj;
        j.i(zzdlVar);
        zzdlVar.resetAnalyticsData(this.zza);
    }
}
