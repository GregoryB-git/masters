package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzu extends zzal {
    private boolean zzk;
    private boolean zzl;
    private final /* synthetic */ zzr zzm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzr zzrVar, boolean z10, boolean z11) {
        super("log");
        this.zzm = zzrVar;
        this.zzk = z10;
        this.zzl = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzv zzvVar;
        ArrayList arrayList;
        zzv zzvVar2;
        zzv zzvVar3;
        zzv zzvVar4;
        zzg.zzb("log", 1, list);
        if (list.size() == 1) {
            zzvVar4 = this.zzm.zzk;
            zzvVar4.zza(zzs.INFO, zzhVar.zza(list.get(0)).zzf(), Collections.emptyList(), this.zzk, this.zzl);
        } else {
            zzs zza = zzs.zza(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()));
            String zzf = zzhVar.zza(list.get(1)).zzf();
            if (list.size() == 2) {
                zzvVar3 = this.zzm.zzk;
                zzvVar2 = zzvVar3;
                arrayList = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
                    arrayList2.add(zzhVar.zza(list.get(i10)).zzf());
                }
                zzvVar = this.zzm.zzk;
                zzvVar2 = zzvVar;
                arrayList = arrayList2;
            }
            zzvVar2.zza(zza, zzf, arrayList, this.zzk, this.zzl);
        }
        return zzaq.zzc;
    }
}
