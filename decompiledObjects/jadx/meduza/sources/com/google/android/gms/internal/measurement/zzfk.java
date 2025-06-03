package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfk extends zzed.zzb {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzed zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfk(zzed zzedVar, boolean z10) {
        super(zzedVar);
        this.zzc = z10;
        this.zzd = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzd.zzj;
        j.i(zzdlVar);
        zzdlVar.setDataCollectionEnabled(this.zzc);
    }
}
