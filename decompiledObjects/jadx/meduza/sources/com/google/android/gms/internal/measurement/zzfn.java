package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfn extends zzed.zzb {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzed zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfn(zzed zzedVar, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzedVar);
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        Long l10 = this.zzc;
        long longValue = l10 == null ? this.zza : l10.longValue();
        zzdlVar = this.zzi.zzj;
        j.i(zzdlVar);
        zzdlVar.logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, longValue);
    }
}
