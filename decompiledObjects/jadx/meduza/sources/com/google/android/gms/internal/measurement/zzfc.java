package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfc extends zzed.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzdm zzf;
    private final /* synthetic */ zzed zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzed zzedVar, String str, String str2, boolean z10, zzdm zzdmVar) {
        super(zzedVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = z10;
        this.zzf = zzdmVar;
        this.zzg = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzg.zzj;
        j.i(zzdlVar);
        zzdlVar.getUserProperties(this.zzc, this.zzd, this.zze, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zzb() {
        this.zzf.zza((Bundle) null);
    }
}
