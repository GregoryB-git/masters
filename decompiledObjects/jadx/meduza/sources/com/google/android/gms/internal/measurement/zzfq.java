package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import m6.j;

/* loaded from: classes.dex */
final class zzfq extends zzed.zzb {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzed.zzc zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzed.zzc zzcVar, Bundle bundle, Activity activity) {
        super(zzed.this);
        this.zzc = bundle;
        this.zzd = activity;
        this.zze = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() {
        Bundle bundle;
        zzdl zzdlVar;
        if (this.zzc != null) {
            bundle = new Bundle();
            if (this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zzc.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzdlVar = zzed.this.zzj;
        j.i(zzdlVar);
        zzdlVar.onActivityCreatedByScionActivityInfo(zzeb.zza(this.zzd), bundle, this.zzb);
    }
}
