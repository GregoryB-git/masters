package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzem extends zzed.zzb {
    private final /* synthetic */ zzeb zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzed zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzed zzedVar, zzeb zzebVar, String str, String str2) {
        super(zzedVar);
        this.zzc = zzebVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzf.zzj;
        j.i(zzdlVar);
        zzdlVar.setCurrentScreenByScionActivityInfo(this.zzc, this.zzd, this.zze, this.zza);
    }
}
