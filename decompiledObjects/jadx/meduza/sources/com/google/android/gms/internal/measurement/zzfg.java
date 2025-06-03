package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfg extends zzed.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzdm zzd;
    private final /* synthetic */ zzed zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfg(zzed zzedVar, String str, zzdm zzdmVar) {
        super(zzedVar);
        this.zzc = str;
        this.zzd = zzdmVar;
        this.zze = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zze.zzj;
        j.i(zzdlVar);
        zzdlVar.getMaxUserProperties(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
