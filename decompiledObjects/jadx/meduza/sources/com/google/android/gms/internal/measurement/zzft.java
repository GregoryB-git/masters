package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzft extends zzed.zzb {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdm zzd;
    private final /* synthetic */ zzed.zzc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(zzed.zzc zzcVar, Activity activity, zzdm zzdmVar) {
        super(zzed.this);
        this.zzc = activity;
        this.zzd = zzdmVar;
        this.zze = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = zzed.this.zzj;
        j.i(zzdlVar);
        zzdlVar.onActivitySaveInstanceStateByScionActivityInfo(zzeb.zza(this.zzc), this.zzd, this.zzb);
    }
}
