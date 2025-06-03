package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfs extends zzed.zzb {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzed.zzc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzed.zzc zzcVar, Activity activity) {
        super(zzed.this);
        this.zzc = activity;
        this.zzd = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        zzdl zzdlVar;
        zzdlVar = zzed.this.zzj;
        j.i(zzdlVar);
        zzdlVar.onActivityResumedByScionActivityInfo(zzeb.zza(this.zzc), this.zzb);
    }
}
