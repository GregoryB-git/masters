package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfh extends zzed.zzb {
    private final /* synthetic */ zzdm zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzed zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzed zzedVar, zzdm zzdmVar, int i10) {
        super(zzedVar);
        this.zzc = zzdmVar;
        this.zzd = i10;
        this.zze = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zze.zzj;
        j.i(zzdlVar);
        zzdlVar.getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
