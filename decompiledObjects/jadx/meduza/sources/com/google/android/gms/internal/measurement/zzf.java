package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgr;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzf {
    public final zzh zza;
    public final zzh zzb;
    private final zzbb zzc;
    private final zzl zzd;

    public zzf() {
        zzbb zzbbVar = new zzbb();
        this.zzc = zzbbVar;
        zzh zzhVar = new zzh(null, zzbbVar);
        this.zzb = zzhVar;
        this.zza = zzhVar.zza();
        zzl zzlVar = new zzl();
        this.zzd = zzlVar;
        zzhVar.zzc("require", new zzz(zzlVar));
        zzlVar.zza("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(0.0d)));
    }

    public final zzaq zza(zzh zzhVar, zzgr.zzd... zzdVarArr) {
        zzaq zzaqVar = zzaq.zzc;
        for (zzgr.zzd zzdVar : zzdVarArr) {
            zzaqVar = zzj.zza(zzdVar);
            zzg.zza(this.zzb);
            if ((zzaqVar instanceof zzat) || (zzaqVar instanceof zzar)) {
                zzaqVar = this.zzc.zza(zzhVar, zzaqVar);
            }
        }
        return zzaqVar;
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zzd.zza(str, callable);
    }
}
