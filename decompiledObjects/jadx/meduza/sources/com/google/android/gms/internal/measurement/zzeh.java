package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzeh extends zzed.zzb {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Bundle zze;
    private final /* synthetic */ zzed zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzed zzedVar, String str, String str2, Bundle bundle) {
        super(zzedVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = bundle;
        this.zzf = zzedVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = this.zzf.zzj;
        j.i(zzdlVar);
        zzdlVar.clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}
